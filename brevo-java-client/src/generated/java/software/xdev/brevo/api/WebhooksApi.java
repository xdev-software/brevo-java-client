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

import software.xdev.brevo.model.CreateModel;
import software.xdev.brevo.model.CreateWebhook;
import software.xdev.brevo.model.CreatedProcessId;
import software.xdev.brevo.model.ErrorModel;
import software.xdev.brevo.model.ExportWebhooksHistory;
import software.xdev.brevo.model.GetWebhook;
import software.xdev.brevo.model.GetWebhooks;
import software.xdev.brevo.model.UpdateWebhook;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class WebhooksApi extends BaseApi {

  public WebhooksApi() {
    super(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Create a webhook
   * 
   * @param createWebhook Values to create a webhook (required)
   * @return CreateModel
   * @throws ApiException if fails to make API call
   */
  public CreateModel createWebhook(@jakarta.annotation.Nonnull CreateWebhook createWebhook) throws ApiException {
    return this.createWebhook(createWebhook, Collections.emptyMap());
  }


  /**
   * Create a webhook
   * 
   * @param createWebhook Values to create a webhook (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return CreateModel
   * @throws ApiException if fails to make API call
   */
  public CreateModel createWebhook(@jakarta.annotation.Nonnull CreateWebhook createWebhook, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createWebhook;
    
    // verify the required parameter 'createWebhook' is set
    if (createWebhook == null) {
      throw new ApiException(400, "Missing the required parameter 'createWebhook' when calling createWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks";

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

    TypeReference<CreateModel> localVarReturnType = new TypeReference<CreateModel>() {};
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
   * Delete a webhook
   * 
   * @param webhookId Id of the webhook (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWebhook(@jakarta.annotation.Nonnull Long webhookId) throws ApiException {
    this.deleteWebhook(webhookId, Collections.emptyMap());
  }


  /**
   * Delete a webhook
   * 
   * @param webhookId Id of the webhook (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteWebhook(@jakarta.annotation.Nonnull Long webhookId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling deleteWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/{webhookId}"
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(apiClient.parameterToString(webhookId)));

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
   * Export all webhook events
   * This endpoint will submit a request to get the history of webhooks in the CSV file. The link to download the CSV file will be sent to the webhook that was provided in the notifyURL.
   * @param exportWebhooksHistory Values to submit for webhooks history (required)
   * @return CreatedProcessId
   * @throws ApiException if fails to make API call
   */
  public CreatedProcessId exportWebhooksHistory(@jakarta.annotation.Nonnull ExportWebhooksHistory exportWebhooksHistory) throws ApiException {
    return this.exportWebhooksHistory(exportWebhooksHistory, Collections.emptyMap());
  }


  /**
   * Export all webhook events
   * This endpoint will submit a request to get the history of webhooks in the CSV file. The link to download the CSV file will be sent to the webhook that was provided in the notifyURL.
   * @param exportWebhooksHistory Values to submit for webhooks history (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return CreatedProcessId
   * @throws ApiException if fails to make API call
   */
  public CreatedProcessId exportWebhooksHistory(@jakarta.annotation.Nonnull ExportWebhooksHistory exportWebhooksHistory, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = exportWebhooksHistory;
    
    // verify the required parameter 'exportWebhooksHistory' is set
    if (exportWebhooksHistory == null) {
      throw new ApiException(400, "Missing the required parameter 'exportWebhooksHistory' when calling exportWebhooksHistory");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/export";

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

    TypeReference<CreatedProcessId> localVarReturnType = new TypeReference<CreatedProcessId>() {};
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
   * Get a webhook details
   * 
   * @param webhookId Id of the webhook (required)
   * @return GetWebhook
   * @throws ApiException if fails to make API call
   */
  public GetWebhook getWebhook(@jakarta.annotation.Nonnull Long webhookId) throws ApiException {
    return this.getWebhook(webhookId, Collections.emptyMap());
  }


  /**
   * Get a webhook details
   * 
   * @param webhookId Id of the webhook (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GetWebhook
   * @throws ApiException if fails to make API call
   */
  public GetWebhook getWebhook(@jakarta.annotation.Nonnull Long webhookId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling getWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/{webhookId}"
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(apiClient.parameterToString(webhookId)));

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

    TypeReference<GetWebhook> localVarReturnType = new TypeReference<GetWebhook>() {};
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
   * Get all webhooks
   * 
   * @param type Filter on webhook type (optional, default to transactional)
   * @param sort Sort the results in the ascending/descending order of webhook creation (optional, default to desc)
   * @return GetWebhooks
   * @throws ApiException if fails to make API call
   */
  public GetWebhooks getWebhooks(@jakarta.annotation.Nullable String type, @jakarta.annotation.Nullable String sort) throws ApiException {
    return this.getWebhooks(type, sort, Collections.emptyMap());
  }


  /**
   * Get all webhooks
   * 
   * @param type Filter on webhook type (optional, default to transactional)
   * @param sort Sort the results in the ascending/descending order of webhook creation (optional, default to desc)
   * @param additionalHeaders additionalHeaders for this call
   * @return GetWebhooks
   * @throws ApiException if fails to make API call
   */
  public GetWebhooks getWebhooks(@jakarta.annotation.Nullable String type, @jakarta.annotation.Nullable String sort, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/webhooks";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
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

    TypeReference<GetWebhooks> localVarReturnType = new TypeReference<GetWebhooks>() {};
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
   * Update a webhook
   * 
   * @param webhookId Id of the webhook (required)
   * @param updateWebhook Values to update a webhook (required)
   * @throws ApiException if fails to make API call
   */
  public void updateWebhook(@jakarta.annotation.Nonnull Long webhookId, @jakarta.annotation.Nonnull UpdateWebhook updateWebhook) throws ApiException {
    this.updateWebhook(webhookId, updateWebhook, Collections.emptyMap());
  }


  /**
   * Update a webhook
   * 
   * @param webhookId Id of the webhook (required)
   * @param updateWebhook Values to update a webhook (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void updateWebhook(@jakarta.annotation.Nonnull Long webhookId, @jakarta.annotation.Nonnull UpdateWebhook updateWebhook, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateWebhook;
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling updateWebhook");
    }
    
    // verify the required parameter 'updateWebhook' is set
    if (updateWebhook == null) {
      throw new ApiException(400, "Missing the required parameter 'updateWebhook' when calling updateWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/{webhookId}"
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(apiClient.parameterToString(webhookId)));

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
        null
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
