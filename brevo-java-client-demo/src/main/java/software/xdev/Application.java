package software.xdev;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;

import org.apache.hc.core5.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.brevo.api.ContactsApi;
import software.xdev.brevo.client.ApiClient;
import software.xdev.brevo.client.ApiException;
import software.xdev.brevo.model.CreateContact;
import software.xdev.brevo.model.CreateUpdateContactModel;
import software.xdev.brevo.model.GetContactInfoIdentifierParameter;
import software.xdev.brevo.model.GetExtendedContactDetails;
import software.xdev.brevo.model.UpdateContact;


public final class Application
{
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	// Tries to add an email/contact to a list
	public static void main(final String[] args)
	{
		final ApiClient apiClient = new ApiClient();
		apiClient.setApiKey(getProperty("API-KEY", Function.identity()));
		apiClient.setUserAgent("Brevo Java Client");
		
		final long listId = getProperty("LIST-ID", Long::parseLong);
		final String email = getProperty("EMAIL-FOR-LIST", Function.identity());
		
		final ContactsApi contactsApi = new ContactsApi(apiClient);
		try
		{
			final GetContactInfoIdentifierParameter identifier =
				new GetContactInfoIdentifierStringParameter(email);
			final GetExtendedContactDetails contactInfo = contactsApi.getContactInfo(
				identifier,
				null,
				null);
			LOG.info("Got contact[email={},listIds={}]", contactInfo.getEmail(), contactInfo.getListIds());
			if(!contactInfo.getListIds().contains(listId))
			{
				contactsApi.updateContact(identifier, new UpdateContact().listIds(List.of(listId)));
				LOG.info("Updated contact to include listId={}", listId);
			}
		}
		catch(final ApiException ex)
		{
			if(ex.getCode() == HttpStatus.SC_NOT_FOUND)
			{
				final CreateUpdateContactModel createdContact = contactsApi.createContact(new CreateContact()
					.email(email)
					.listIds(List.of(listId)));
				LOG.info("Created contact[id={}, email={},listIds={}]", createdContact.getId(), email, listId);
			}
		}
	}
	
	private static <T> T getProperty(final String identifier, final Function<String, T> caster)
	{
		String value = Optional.ofNullable(System.getenv(identifier))
			.orElseGet(() -> System.getProperty(identifier));
		if(value == null)
		{
			LOG.error("Required {} not set in environment variables or system properties", identifier);
			
			LOG.info("Please provide {} over console:", identifier);
			try(final Scanner scanner = new Scanner(System.in))
			{
				value = scanner.nextLine();
			}
			
			if(value == null || value.isBlank())
			{
				LOG.error("Invalid input; Aborting");
				System.exit(1);
			}
		}
		return caster.apply(value);
	}
	
	private Application()
	{
	}
	
	@SuppressWarnings("java:S2160")
	public static class GetContactInfoIdentifierStringParameter extends GetContactInfoIdentifierParameter
	{
		private final String value;
		
		public GetContactInfoIdentifierStringParameter(final String value)
		{
			this.value = value;
		}
		
		@Override
		public String toString()
		{
			return this.value;
		}
	}
}
