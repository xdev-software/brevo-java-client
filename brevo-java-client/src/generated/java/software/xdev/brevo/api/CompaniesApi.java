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

import software.xdev.brevo.model.CompaniesIdPatchRequest;
import software.xdev.brevo.model.CompaniesLinkUnlinkIdPatchRequest;
import software.xdev.brevo.model.CompaniesList;
import software.xdev.brevo.model.CompaniesPost200Response;
import software.xdev.brevo.model.CompaniesPostRequest;
import software.xdev.brevo.model.Company;
import software.xdev.brevo.model.CompanyAttributesInner;
import software.xdev.brevo.model.ErrorModel;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class CompaniesApi extends BaseApi {

  public CompaniesApi() {
    super(Configuration.getDefaultApiClient());
  }

  public CompaniesApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Get company attributes
   * 
   * @return List&lt;CompanyAttributesInner&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CompanyAttributesInner> companiesAttributesGet() throws ApiException {
    return this.companiesAttributesGet(Collections.emptyMap());
  }


  /**
   * Get company attributes
   * 
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;CompanyAttributesInner&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CompanyAttributesInner> companiesAttributesGet(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/companies/attributes";

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

    TypeReference<List<CompanyAttributesInner>> localVarReturnType = new TypeReference<List<CompanyAttributesInner>>() {};
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
   * Get all Companies
   * 
   * @param filters Filter by attrbutes. If you have filter for owner on your side please send it as {\&quot;attributes.owner\&quot;:\&quot;6299dcf3874a14eacbc65c46\&quot;} (optional)
   * @param linkedContactsIds Filter by linked contacts ids (optional)
   * @param linkedDealsIds Filter by linked Deals ids (optional)
   * @param page Index of the first document of the page (optional)
   * @param limit Number of documents per page (optional)
   * @param sort Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed (optional)
   * @param sortBy The field used to sort field names. (optional)
   * @return CompaniesList
   * @throws ApiException if fails to make API call
   */
  public CompaniesList companiesGet(String filters, Long linkedContactsIds, String linkedDealsIds, Long page, Long limit, String sort, String sortBy) throws ApiException {
    return this.companiesGet(filters, linkedContactsIds, linkedDealsIds, page, limit, sort, sortBy, Collections.emptyMap());
  }


  /**
   * Get all Companies
   * 
   * @param filters Filter by attrbutes. If you have filter for owner on your side please send it as {\&quot;attributes.owner\&quot;:\&quot;6299dcf3874a14eacbc65c46\&quot;} (optional)
   * @param linkedContactsIds Filter by linked contacts ids (optional)
   * @param linkedDealsIds Filter by linked Deals ids (optional)
   * @param page Index of the first document of the page (optional)
   * @param limit Number of documents per page (optional)
   * @param sort Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed (optional)
   * @param sortBy The field used to sort field names. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return CompaniesList
   * @throws ApiException if fails to make API call
   */
  public CompaniesList companiesGet(String filters, Long linkedContactsIds, String linkedDealsIds, Long page, Long limit, String sort, String sortBy, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/companies";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("filters", filters));
    localVarQueryParams.addAll(apiClient.parameterToPair("linkedContactsIds", linkedContactsIds));
    localVarQueryParams.addAll(apiClient.parameterToPair("linkedDealsIds", linkedDealsIds));
    localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    TypeReference<CompaniesList> localVarReturnType = new TypeReference<CompaniesList>() {};
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
   * Delete a company
   * 
   * @param id Company ID to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void companiesIdDelete(String id) throws ApiException {
    this.companiesIdDelete(id, Collections.emptyMap());
  }


  /**
   * Delete a company
   * 
   * @param id Company ID to delete (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void companiesIdDelete(String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling companiesIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/companies/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
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
        null
    );
  }

  /**
   * Get a company
   * 
   * @param id Get Company Details (required)
   * @return Company
   * @throws ApiException if fails to make API call
   */
  public Company companiesIdGet(String id) throws ApiException {
    return this.companiesIdGet(id, Collections.emptyMap());
  }


  /**
   * Get a company
   * 
   * @param id Get Company Details (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Company
   * @throws ApiException if fails to make API call
   */
  public Company companiesIdGet(String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling companiesIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/companies/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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

    TypeReference<Company> localVarReturnType = new TypeReference<Company>() {};
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
   * Update a company
   * 
   * @param id  (required)
   * @param companiesIdPatchRequest Updated company details. (required)
   * @return Company
   * @throws ApiException if fails to make API call
   */
  public Company companiesIdPatch(String id, CompaniesIdPatchRequest companiesIdPatchRequest) throws ApiException {
    return this.companiesIdPatch(id, companiesIdPatchRequest, Collections.emptyMap());
  }


  /**
   * Update a company
   * 
   * @param id  (required)
   * @param companiesIdPatchRequest Updated company details. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Company
   * @throws ApiException if fails to make API call
   */
  public Company companiesIdPatch(String id, CompaniesIdPatchRequest companiesIdPatchRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = companiesIdPatchRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling companiesIdPatch");
    }
    
    // verify the required parameter 'companiesIdPatchRequest' is set
    if (companiesIdPatchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companiesIdPatchRequest' when calling companiesIdPatch");
    }
    
    // create path and map variables
    String localVarPath = "/companies/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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

    TypeReference<Company> localVarReturnType = new TypeReference<Company>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
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
   * Link and Unlink company with contact and deal
   * 
   * @param id  (required)
   * @param companiesLinkUnlinkIdPatchRequest Linked / Unlinked contacts and deals ids. (required)
   * @throws ApiException if fails to make API call
   */
  public void companiesLinkUnlinkIdPatch(String id, CompaniesLinkUnlinkIdPatchRequest companiesLinkUnlinkIdPatchRequest) throws ApiException {
    this.companiesLinkUnlinkIdPatch(id, companiesLinkUnlinkIdPatchRequest, Collections.emptyMap());
  }


  /**
   * Link and Unlink company with contact and deal
   * 
   * @param id  (required)
   * @param companiesLinkUnlinkIdPatchRequest Linked / Unlinked contacts and deals ids. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void companiesLinkUnlinkIdPatch(String id, CompaniesLinkUnlinkIdPatchRequest companiesLinkUnlinkIdPatchRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = companiesLinkUnlinkIdPatchRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling companiesLinkUnlinkIdPatch");
    }
    
    // verify the required parameter 'companiesLinkUnlinkIdPatchRequest' is set
    if (companiesLinkUnlinkIdPatchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companiesLinkUnlinkIdPatchRequest' when calling companiesLinkUnlinkIdPatch");
    }
    
    // create path and map variables
    String localVarPath = "/companies/link-unlink/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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

    apiClient.invokeAPI(
        localVarPath,
        "PATCH",
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
        null
    );
  }

  /**
   * Create a company
   * 
   * @param companiesPostRequest Company create data. (required)
   * @return CompaniesPost200Response
   * @throws ApiException if fails to make API call
   */
  public CompaniesPost200Response companiesPost(CompaniesPostRequest companiesPostRequest) throws ApiException {
    return this.companiesPost(companiesPostRequest, Collections.emptyMap());
  }


  /**
   * Create a company
   * 
   * @param companiesPostRequest Company create data. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return CompaniesPost200Response
   * @throws ApiException if fails to make API call
   */
  public CompaniesPost200Response companiesPost(CompaniesPostRequest companiesPostRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = companiesPostRequest;
    
    // verify the required parameter 'companiesPostRequest' is set
    if (companiesPostRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companiesPostRequest' when calling companiesPost");
    }
    
    // create path and map variables
    String localVarPath = "/companies";

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

    TypeReference<CompaniesPost200Response> localVarReturnType = new TypeReference<CompaniesPost200Response>() {};
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
      "application/json"
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
