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
import software.xdev.brevo.model.GetWhatsappEventReport;
import software.xdev.brevo.model.SendWhatsappMessage201Response;
import software.xdev.brevo.model.SendWhatsappMessageRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class TransactionalWhatsAppApi {


  private ApiClient apiClient;

  public TransactionalWhatsAppApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransactionalWhatsAppApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get all your WhatsApp activity (unaggregated events)
   * This endpoint will show the unaggregated statistics for WhatsApp activity (30 days by default if &#x60;startDate&#x60; and &#x60;endDate&#x60; or &#x60;days&#x60; is not passed. The date range can not exceed 90 days)
   * @param limit Number limitation for the result returned (optional, default to 2500)
   * @param offset Beginning point in the list to retrieve from (optional, default to 0)
   * @param startDate **Mandatory if endDate is used.** Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate  (optional)
   * @param endDate **Mandatory if startDate is used.** Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate  (optional)
   * @param days Number of days in the past including today (positive integer). _Not compatible with &#39;startDate&#39; and &#39;endDate&#39;_  (optional)
   * @param contactNumber Filter results for specific contact (WhatsApp Number with country code. Example, 85264318721) (optional)
   * @param event Filter the report for a specific event type (optional)
   * @param sort Sort the results in the ascending/descending order of record creation. Default order is **descending** if &#x60;sort&#x60; is not passed (optional, default to desc)
   * @return GetWhatsappEventReport
   * @throws ApiException if fails to make API call
   */
  public GetWhatsappEventReport getWhatsappEventReport(Long limit, Long offset, String startDate, String endDate, Long days, String contactNumber, String event, String sort) throws ApiException {
    return this.getWhatsappEventReport(limit, offset, startDate, endDate, days, contactNumber, event, sort, Collections.emptyMap());
  }


  /**
   * Get all your WhatsApp activity (unaggregated events)
   * This endpoint will show the unaggregated statistics for WhatsApp activity (30 days by default if &#x60;startDate&#x60; and &#x60;endDate&#x60; or &#x60;days&#x60; is not passed. The date range can not exceed 90 days)
   * @param limit Number limitation for the result returned (optional, default to 2500)
   * @param offset Beginning point in the list to retrieve from (optional, default to 0)
   * @param startDate **Mandatory if endDate is used.** Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate  (optional)
   * @param endDate **Mandatory if startDate is used.** Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate  (optional)
   * @param days Number of days in the past including today (positive integer). _Not compatible with &#39;startDate&#39; and &#39;endDate&#39;_  (optional)
   * @param contactNumber Filter results for specific contact (WhatsApp Number with country code. Example, 85264318721) (optional)
   * @param event Filter the report for a specific event type (optional)
   * @param sort Sort the results in the ascending/descending order of record creation. Default order is **descending** if &#x60;sort&#x60; is not passed (optional, default to desc)
   * @param additionalHeaders additionalHeaders for this call
   * @return GetWhatsappEventReport
   * @throws ApiException if fails to make API call
   */
  public GetWhatsappEventReport getWhatsappEventReport(Long limit, Long offset, String startDate, String endDate, Long days, String contactNumber, String event, String sort, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/whatsapp/statistics/events";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("days", days));
    localVarQueryParams.addAll(apiClient.parameterToPair("contactNumber", contactNumber));
    localVarQueryParams.addAll(apiClient.parameterToPair("event", event));
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

    TypeReference<GetWhatsappEventReport> localVarReturnType = new TypeReference<GetWhatsappEventReport>() {};
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
   * Send a WhatsApp message
   * This endpoint is used to send a WhatsApp message. &lt;br/&gt;(**The first message you send using the API must contain a Template ID. You must create a template on WhatsApp on the Brevo platform to fetch the Template ID.**)
   * @param sendWhatsappMessageRequest Values to send WhatsApp message (required)
   * @return SendWhatsappMessage201Response
   * @throws ApiException if fails to make API call
   */
  public SendWhatsappMessage201Response sendWhatsappMessage(SendWhatsappMessageRequest sendWhatsappMessageRequest) throws ApiException {
    return this.sendWhatsappMessage(sendWhatsappMessageRequest, Collections.emptyMap());
  }


  /**
   * Send a WhatsApp message
   * This endpoint is used to send a WhatsApp message. &lt;br/&gt;(**The first message you send using the API must contain a Template ID. You must create a template on WhatsApp on the Brevo platform to fetch the Template ID.**)
   * @param sendWhatsappMessageRequest Values to send WhatsApp message (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SendWhatsappMessage201Response
   * @throws ApiException if fails to make API call
   */
  public SendWhatsappMessage201Response sendWhatsappMessage(SendWhatsappMessageRequest sendWhatsappMessageRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sendWhatsappMessageRequest;
    
    // verify the required parameter 'sendWhatsappMessageRequest' is set
    if (sendWhatsappMessageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sendWhatsappMessageRequest' when calling sendWhatsappMessage");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp/sendMessage";

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

    TypeReference<SendWhatsappMessage201Response> localVarReturnType = new TypeReference<SendWhatsappMessage201Response>() {};
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

}
