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
import software.xdev.brevo.client.Configuration;
import software.xdev.brevo.client.Pair;

import software.xdev.brevo.model.ErrorModel;
import java.io.File;
import software.xdev.brevo.model.GetInboundEmailEvents;
import software.xdev.brevo.model.GetInboundEmailEventsByUuid;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InboundParsingApi {


  private ApiClient apiClient;

  public InboundParsingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InboundParsingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve inbound attachment with download token.
   * This endpoint will retrieve inbound attachment with download token.
   * @param downloadToken Token to fetch a particular attachment (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getInboundEmailAttachment(String downloadToken) throws ApiException {
    return this.getInboundEmailAttachment(downloadToken, Collections.emptyMap());
  }


  /**
   * Retrieve inbound attachment with download token.
   * This endpoint will retrieve inbound attachment with download token.
   * @param downloadToken Token to fetch a particular attachment (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getInboundEmailAttachment(String downloadToken, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'downloadToken' is set
    if (downloadToken == null) {
      throw new ApiException(400, "Missing the required parameter 'downloadToken' when calling getInboundEmailAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/inbound/attachments/{downloadToken}"
      .replaceAll("\\{" + "downloadToken" + "\\}", apiClient.escapeString(downloadToken.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/octet-stream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    TypeReference<File> localVarReturnType = new TypeReference<File>() {};
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
   * Get the list of all the events for the received emails.
   * This endpoint will show the list of all the events for the received emails.
   * @param sender Email address of the sender. (optional)
   * @param startDate Mandatory if endDate is used. Starting date (YYYY-MM-DD or YYYY-MM-DDTHH:mm:ss.SSSZ) from which you want to fetch the list. Maximum time period that can be selected is one month. (optional)
   * @param endDate Mandatory if startDate is used. Ending date (YYYY-MM-DD or YYYY-MM-DDTHH:mm:ss.SSSZ) till which you want to fetch the list. Maximum time period that can be selected is one month. (optional)
   * @param limit Number of documents returned per page (optional, default to 100)
   * @param offset Index of the first document on the page (optional, default to 0)
   * @param sort Sort the results in the ascending/descending order of record creation (optional, default to desc)
   * @return GetInboundEmailEvents
   * @throws ApiException if fails to make API call
   */
  public GetInboundEmailEvents getInboundEmailEvents(String sender, String startDate, String endDate, Long limit, Long offset, String sort) throws ApiException {
    return this.getInboundEmailEvents(sender, startDate, endDate, limit, offset, sort, Collections.emptyMap());
  }


  /**
   * Get the list of all the events for the received emails.
   * This endpoint will show the list of all the events for the received emails.
   * @param sender Email address of the sender. (optional)
   * @param startDate Mandatory if endDate is used. Starting date (YYYY-MM-DD or YYYY-MM-DDTHH:mm:ss.SSSZ) from which you want to fetch the list. Maximum time period that can be selected is one month. (optional)
   * @param endDate Mandatory if startDate is used. Ending date (YYYY-MM-DD or YYYY-MM-DDTHH:mm:ss.SSSZ) till which you want to fetch the list. Maximum time period that can be selected is one month. (optional)
   * @param limit Number of documents returned per page (optional, default to 100)
   * @param offset Index of the first document on the page (optional, default to 0)
   * @param sort Sort the results in the ascending/descending order of record creation (optional, default to desc)
   * @param additionalHeaders additionalHeaders for this call
   * @return GetInboundEmailEvents
   * @throws ApiException if fails to make API call
   */
  public GetInboundEmailEvents getInboundEmailEvents(String sender, String startDate, String endDate, Long limit, Long offset, String sort, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/inbound/events";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("sender", sender));
    localVarQueryParams.addAll(apiClient.parameterToPair("startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api-key" };

    TypeReference<GetInboundEmailEvents> localVarReturnType = new TypeReference<GetInboundEmailEvents>() {};
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
   * Fetch all events history for one particular received email.
   * This endpoint will show the list of all events history for one particular received email.
   * @param uuid UUID to fetch events specific to recieved email (required)
   * @return GetInboundEmailEventsByUuid
   * @throws ApiException if fails to make API call
   */
  public GetInboundEmailEventsByUuid getInboundEmailEventsByUuid(String uuid) throws ApiException {
    return this.getInboundEmailEventsByUuid(uuid, Collections.emptyMap());
  }


  /**
   * Fetch all events history for one particular received email.
   * This endpoint will show the list of all events history for one particular received email.
   * @param uuid UUID to fetch events specific to recieved email (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GetInboundEmailEventsByUuid
   * @throws ApiException if fails to make API call
   */
  public GetInboundEmailEventsByUuid getInboundEmailEventsByUuid(String uuid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling getInboundEmailEventsByUuid");
    }
    
    // create path and map variables
    String localVarPath = "/inbound/events/{uuid}"
      .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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

    TypeReference<GetInboundEmailEventsByUuid> localVarReturnType = new TypeReference<GetInboundEmailEventsByUuid>() {};
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

}