/*
 * Brevo API
 * Brevo API documentation by XDEV Software based on https://api.brevo.com/v3/swagger_definition_v3.yml
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package software.xdev.brevo.api;

import com.fasterxml.jackson.core.type.TypeReference;

import software.xdev.brevo.client.ApiException;
import software.xdev.brevo.client.ApiClient;
import software.xdev.brevo.client.BaseApi;
import software.xdev.brevo.client.Configuration;
import software.xdev.brevo.client.Pair;

import software.xdev.brevo.model.ErrorModel;
import software.xdev.brevo.model.GetInvitedUsersList;
import software.xdev.brevo.model.GetUserPermission;
import software.xdev.brevo.model.Inviteuser;
import software.xdev.brevo.model.InviteuserResponse;
import software.xdev.brevo.model.PutRevokeUserPermissionResponse;
import software.xdev.brevo.model.PutresendcancelinvitationResponse;
import software.xdev.brevo.model.UpdateUserResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class UserApi extends BaseApi {

  public UserApi() {
    super(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Update permission for a user
   * &#x60;Feature&#x60; - A Feature represents a specific functionality like Email campaign, Deals, Calls, Automations, etc. on Brevo. While inviting a user, determine which feature you want to manage access to. You must specify the feature accurately to avoid errors.  &#x60;Permission&#x60; - A Permission defines the level of access or control a user has over a specific feature. While inviting user, decide on the permission level required for the selected feature. Make sure the chosen permission is related to the selected feature.  Features and their respective permissions are as below:  - &#x60;email_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;sms_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;contacts&#x60;:   - \&quot;view\&quot;   - \&quot;send_schedule_suspend\&quot;   - \&quot;import\&quot;   - \&quot;export\&quot;   - \&quot;list_and_attributes\&quot;   - \&quot;forms\&quot; - &#x60;templates&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate\&quot; - &#x60;workflows&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate_pause\&quot;   - \&quot;settings\&quot; - &#x60;facebook_ads&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;schedule_pause\&quot; - &#x60;landing_pages&#x60;:   - \&quot;all\&quot; - &#x60;transactional_emails&#x60;:   - \&quot;settings\&quot;   - \&quot;logs\&quot; - &#x60;smtp_api&#x60;:   - \&quot;smtp\&quot;   - \&quot;api_keys\&quot;   - \&quot;authorized_ips\&quot; - &#x60;user_management&#x60;:   - \&quot;all\&quot; - &#x60;sales_platform&#x60;:   - \&quot;manage_owned_deals_tasks_companies\&quot;   - \&quot;manage_others_deals_tasks_companies\&quot;   - \&quot;reports\&quot;   - \&quot;settings\&quot; - &#x60;phone&#x60;:   - \&quot;all\&quot; - &#x60;conversations&#x60;:   - \&quot;access\&quot;   - \&quot;assign\&quot;   - \&quot;configure\&quot; - &#x60;senders_domains_dedicated_ips&#x60;:   - \&quot;senders_management\&quot;   - \&quot;domains_management\&quot;   - \&quot;dedicated_ips_management\&quot; - &#x60;push_notifications&#x60;:   - \&quot;view\&quot;   - \&quot;create_edit_delete\&quot;   - \&quot;send\&quot;   - \&quot;settings\&quot;  **Note**: - The privileges array remains the same as in the send invitation; the user simply needs to provide the permissions that need to be updated. - The availability of feature and its permission depends on your current plan. Please select the features and permissions accordingly. 
   * @param inviteuser Values to create an invitation (required)
   * @return UpdateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateUserResponse editUserPermission(Inviteuser inviteuser) throws ApiException {
    return this.editUserPermission(inviteuser, Collections.emptyMap());
  }


  /**
   * Update permission for a user
   * &#x60;Feature&#x60; - A Feature represents a specific functionality like Email campaign, Deals, Calls, Automations, etc. on Brevo. While inviting a user, determine which feature you want to manage access to. You must specify the feature accurately to avoid errors.  &#x60;Permission&#x60; - A Permission defines the level of access or control a user has over a specific feature. While inviting user, decide on the permission level required for the selected feature. Make sure the chosen permission is related to the selected feature.  Features and their respective permissions are as below:  - &#x60;email_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;sms_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;contacts&#x60;:   - \&quot;view\&quot;   - \&quot;send_schedule_suspend\&quot;   - \&quot;import\&quot;   - \&quot;export\&quot;   - \&quot;list_and_attributes\&quot;   - \&quot;forms\&quot; - &#x60;templates&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate\&quot; - &#x60;workflows&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate_pause\&quot;   - \&quot;settings\&quot; - &#x60;facebook_ads&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;schedule_pause\&quot; - &#x60;landing_pages&#x60;:   - \&quot;all\&quot; - &#x60;transactional_emails&#x60;:   - \&quot;settings\&quot;   - \&quot;logs\&quot; - &#x60;smtp_api&#x60;:   - \&quot;smtp\&quot;   - \&quot;api_keys\&quot;   - \&quot;authorized_ips\&quot; - &#x60;user_management&#x60;:   - \&quot;all\&quot; - &#x60;sales_platform&#x60;:   - \&quot;manage_owned_deals_tasks_companies\&quot;   - \&quot;manage_others_deals_tasks_companies\&quot;   - \&quot;reports\&quot;   - \&quot;settings\&quot; - &#x60;phone&#x60;:   - \&quot;all\&quot; - &#x60;conversations&#x60;:   - \&quot;access\&quot;   - \&quot;assign\&quot;   - \&quot;configure\&quot; - &#x60;senders_domains_dedicated_ips&#x60;:   - \&quot;senders_management\&quot;   - \&quot;domains_management\&quot;   - \&quot;dedicated_ips_management\&quot; - &#x60;push_notifications&#x60;:   - \&quot;view\&quot;   - \&quot;create_edit_delete\&quot;   - \&quot;send\&quot;   - \&quot;settings\&quot;  **Note**: - The privileges array remains the same as in the send invitation; the user simply needs to provide the permissions that need to be updated. - The availability of feature and its permission depends on your current plan. Please select the features and permissions accordingly. 
   * @param inviteuser Values to create an invitation (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UpdateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateUserResponse editUserPermission(Inviteuser inviteuser, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = inviteuser;
    
    // verify the required parameter 'inviteuser' is set
    if (inviteuser == null) {
      throw new ApiException(400, "Missing the required parameter 'inviteuser' when calling editUserPermission");
    }
    
    // create path and map variables
    String localVarPath = "/organization/user/update/permissions";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    TypeReference<UpdateUserResponse> localVarReturnType = new TypeReference<UpdateUserResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Get the list of all your users
   * 
   * @return GetInvitedUsersList
   * @throws ApiException if fails to make API call
   */
  public GetInvitedUsersList getInvitedUsersList() throws ApiException {
    return this.getInvitedUsersList(Collections.emptyMap());
  }


  /**
   * Get the list of all your users
   * 
   * @param additionalHeaders additionalHeaders for this call
   * @return GetInvitedUsersList
   * @throws ApiException if fails to make API call
   */
  public GetInvitedUsersList getInvitedUsersList(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/organization/invited/users";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    TypeReference<GetInvitedUsersList> localVarReturnType = new TypeReference<GetInvitedUsersList>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Check user permission
   * 
   * @param email Email of the invited user. (required)
   * @return GetUserPermission
   * @throws ApiException if fails to make API call
   */
  public GetUserPermission getUserPermission(String email) throws ApiException {
    return this.getUserPermission(email, Collections.emptyMap());
  }


  /**
   * Check user permission
   * 
   * @param email Email of the invited user. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GetUserPermission
   * @throws ApiException if fails to make API call
   */
  public GetUserPermission getUserPermission(String email, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling getUserPermission");
    }
    
    // create path and map variables
    String localVarPath = "/organization/user/{email}/permissions"
      .replaceAll("\\{" + "email" + "\\}", apiClient.escapeString(email.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    TypeReference<GetUserPermission> localVarReturnType = new TypeReference<GetUserPermission>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Send invitation to user
   * &#x60;Feature&#x60; - A Feature represents a specific functionality like Email campaign, Deals, Calls, Automations, etc. on Brevo. While inviting a user, determine which feature you want to manage access to. You must specify the feature accurately to avoid errors.  &#x60;Permission&#x60; - A Permission defines the level of access or control a user has over a specific feature. While inviting user, decide on the permission level required for the selected feature. Make sure the chosen permission is related to the selected feature.  Features and their respective permissions are as below:  - &#x60;email_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;sms_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;contacts&#x60;:   - \&quot;view\&quot;   - \&quot;send_schedule_suspend\&quot;   - \&quot;import\&quot;   - \&quot;export\&quot;   - \&quot;list_and_attributes\&quot;   - \&quot;forms\&quot; - &#x60;templates&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate\&quot; - &#x60;workflows&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate_pause\&quot;   - \&quot;settings\&quot; - &#x60;facebook_ads&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;schedule_pause\&quot; - &#x60;landing_pages&#x60;:   - \&quot;all\&quot; - &#x60;transactional_emails&#x60;:   - \&quot;settings\&quot;   - \&quot;logs\&quot; - &#x60;smtp_api&#x60;:   - \&quot;smtp\&quot;   - \&quot;api_keys\&quot;   - \&quot;authorized_ips\&quot; - &#x60;user_management&#x60;:   - \&quot;all\&quot; - &#x60;sales_platform&#x60;:   - \&quot;manage_owned_deals_tasks_companies\&quot;   - \&quot;manage_others_deals_tasks_companies\&quot;   - \&quot;reports\&quot;   - \&quot;settings\&quot; - &#x60;phone&#x60;:   - \&quot;all\&quot; - &#x60;conversations&#x60;:   - \&quot;access\&quot;   - \&quot;assign\&quot;   - \&quot;configure\&quot; - &#x60;senders_domains_dedicated_ips&#x60;:   - \&quot;senders_management\&quot;   - \&quot;domains_management\&quot;   - \&quot;dedicated_ips_management\&quot; - &#x60;push_notifications&#x60;:   - \&quot;view\&quot;   - \&quot;create_edit_delete\&quot;   - \&quot;send\&quot;   - \&quot;settings\&quot;  **Note**: - If &#x60;all_features_access: false&#x60; then only privileges are required otherwise if &#x60;true&#x60; then it&#39;s assumed that all permissions will be there for the invited user. - The availability of feature and its permission depends on your current plan. Please select the features and permissions accordingly. 
   * @param inviteuser Values to create an invitation (required)
   * @return InviteuserResponse
   * @throws ApiException if fails to make API call
   */
  public InviteuserResponse inviteuser(Inviteuser inviteuser) throws ApiException {
    return this.inviteuser(inviteuser, Collections.emptyMap());
  }


  /**
   * Send invitation to user
   * &#x60;Feature&#x60; - A Feature represents a specific functionality like Email campaign, Deals, Calls, Automations, etc. on Brevo. While inviting a user, determine which feature you want to manage access to. You must specify the feature accurately to avoid errors.  &#x60;Permission&#x60; - A Permission defines the level of access or control a user has over a specific feature. While inviting user, decide on the permission level required for the selected feature. Make sure the chosen permission is related to the selected feature.  Features and their respective permissions are as below:  - &#x60;email_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;sms_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;contacts&#x60;:   - \&quot;view\&quot;   - \&quot;send_schedule_suspend\&quot;   - \&quot;import\&quot;   - \&quot;export\&quot;   - \&quot;list_and_attributes\&quot;   - \&quot;forms\&quot; - &#x60;templates&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate\&quot; - &#x60;workflows&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate_pause\&quot;   - \&quot;settings\&quot; - &#x60;facebook_ads&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;schedule_pause\&quot; - &#x60;landing_pages&#x60;:   - \&quot;all\&quot; - &#x60;transactional_emails&#x60;:   - \&quot;settings\&quot;   - \&quot;logs\&quot; - &#x60;smtp_api&#x60;:   - \&quot;smtp\&quot;   - \&quot;api_keys\&quot;   - \&quot;authorized_ips\&quot; - &#x60;user_management&#x60;:   - \&quot;all\&quot; - &#x60;sales_platform&#x60;:   - \&quot;manage_owned_deals_tasks_companies\&quot;   - \&quot;manage_others_deals_tasks_companies\&quot;   - \&quot;reports\&quot;   - \&quot;settings\&quot; - &#x60;phone&#x60;:   - \&quot;all\&quot; - &#x60;conversations&#x60;:   - \&quot;access\&quot;   - \&quot;assign\&quot;   - \&quot;configure\&quot; - &#x60;senders_domains_dedicated_ips&#x60;:   - \&quot;senders_management\&quot;   - \&quot;domains_management\&quot;   - \&quot;dedicated_ips_management\&quot; - &#x60;push_notifications&#x60;:   - \&quot;view\&quot;   - \&quot;create_edit_delete\&quot;   - \&quot;send\&quot;   - \&quot;settings\&quot;  **Note**: - If &#x60;all_features_access: false&#x60; then only privileges are required otherwise if &#x60;true&#x60; then it&#39;s assumed that all permissions will be there for the invited user. - The availability of feature and its permission depends on your current plan. Please select the features and permissions accordingly. 
   * @param inviteuser Values to create an invitation (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InviteuserResponse
   * @throws ApiException if fails to make API call
   */
  public InviteuserResponse inviteuser(Inviteuser inviteuser, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = inviteuser;
    
    // verify the required parameter 'inviteuser' is set
    if (inviteuser == null) {
      throw new ApiException(400, "Missing the required parameter 'inviteuser' when calling inviteuser");
    }
    
    // create path and map variables
    String localVarPath = "/organization/user/invitation/send";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    TypeReference<InviteuserResponse> localVarReturnType = new TypeReference<InviteuserResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Revoke user permission
   * 
   * @param email Email of the invited user. (required)
   * @return PutRevokeUserPermissionResponse
   * @throws ApiException if fails to make API call
   */
  public PutRevokeUserPermissionResponse putRevokeUserPermission(String email) throws ApiException {
    return this.putRevokeUserPermission(email, Collections.emptyMap());
  }


  /**
   * Revoke user permission
   * 
   * @param email Email of the invited user. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return PutRevokeUserPermissionResponse
   * @throws ApiException if fails to make API call
   */
  public PutRevokeUserPermissionResponse putRevokeUserPermission(String email, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling putRevokeUserPermission");
    }
    
    // create path and map variables
    String localVarPath = "/organization/user/invitation/revoke/{email}"
      .replaceAll("\\{" + "email" + "\\}", apiClient.escapeString(email.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    TypeReference<PutRevokeUserPermissionResponse> localVarReturnType = new TypeReference<PutRevokeUserPermissionResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Resend / Cancel invitation
   * 
   * @param action action (required)
   * @param email Email of the invited user. (required)
   * @return PutresendcancelinvitationResponse
   * @throws ApiException if fails to make API call
   */
  public PutresendcancelinvitationResponse putresendcancelinvitation(String action, String email) throws ApiException {
    return this.putresendcancelinvitation(action, email, Collections.emptyMap());
  }


  /**
   * Resend / Cancel invitation
   * 
   * @param action action (required)
   * @param email Email of the invited user. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return PutresendcancelinvitationResponse
   * @throws ApiException if fails to make API call
   */
  public PutresendcancelinvitationResponse putresendcancelinvitation(String action, String email, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling putresendcancelinvitation");
    }
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling putresendcancelinvitation");
    }
    
    // create path and map variables
    String localVarPath = "/organization/user/invitation/{action}/{email}"
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()))
      .replaceAll("\\{" + "email" + "\\}", apiClient.escapeString(email.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    TypeReference<PutresendcancelinvitationResponse> localVarReturnType = new TypeReference<PutresendcancelinvitationResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
