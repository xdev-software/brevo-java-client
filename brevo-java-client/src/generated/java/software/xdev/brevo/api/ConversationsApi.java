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

import software.xdev.brevo.model.ConversationsAgentOnlinePingPostRequest;
import software.xdev.brevo.model.ConversationsMessage;
import software.xdev.brevo.model.ConversationsMessagesIdPutRequest;
import software.xdev.brevo.model.ConversationsMessagesPostRequest;
import software.xdev.brevo.model.ConversationsPushedMessagesPostRequest;
import software.xdev.brevo.model.ErrorModel;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ConversationsApi extends BaseApi {

  public ConversationsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ConversationsApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Sets agent’s status to online for 2-3 minutes
   * We recommend pinging this endpoint every minute for as long as the agent has to be considered online.
   * @param conversationsAgentOnlinePingPostRequest  (required)
   * @throws ApiException if fails to make API call
   */
  public void conversationsAgentOnlinePingPost(@jakarta.annotation.Nonnull ConversationsAgentOnlinePingPostRequest conversationsAgentOnlinePingPostRequest) throws ApiException {
    this.conversationsAgentOnlinePingPost(conversationsAgentOnlinePingPostRequest, Collections.emptyMap());
  }


  /**
   * Sets agent’s status to online for 2-3 minutes
   * We recommend pinging this endpoint every minute for as long as the agent has to be considered online.
   * @param conversationsAgentOnlinePingPostRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void conversationsAgentOnlinePingPost(@jakarta.annotation.Nonnull ConversationsAgentOnlinePingPostRequest conversationsAgentOnlinePingPostRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = conversationsAgentOnlinePingPostRequest;
    
    // verify the required parameter 'conversationsAgentOnlinePingPostRequest' is set
    if (conversationsAgentOnlinePingPostRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationsAgentOnlinePingPostRequest' when calling conversationsAgentOnlinePingPost");
    }
    
    // create path and map variables
    String localVarPath = "/conversations/agentOnlinePing";

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
        null
    );
  }

  /**
   * Delete a message sent by an agent
   * Only agents’ messages can be deleted.
   * @param id ID of the message (required)
   * @throws ApiException if fails to make API call
   */
  public void conversationsMessagesIdDelete(@jakarta.annotation.Nonnull String id) throws ApiException {
    this.conversationsMessagesIdDelete(id, Collections.emptyMap());
  }


  /**
   * Delete a message sent by an agent
   * Only agents’ messages can be deleted.
   * @param id ID of the message (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void conversationsMessagesIdDelete(@jakarta.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conversationsMessagesIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/conversations/messages/{id}"
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
   * Get a message
   * 
   * @param id ID of the message (required)
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsMessagesIdGet(@jakarta.annotation.Nonnull String id) throws ApiException {
    return this.conversationsMessagesIdGet(id, Collections.emptyMap());
  }


  /**
   * Get a message
   * 
   * @param id ID of the message (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsMessagesIdGet(@jakarta.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conversationsMessagesIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/conversations/messages/{id}"
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

    TypeReference<ConversationsMessage> localVarReturnType = new TypeReference<ConversationsMessage>() {};
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
   * Update a message sent by an agent
   * Only agents’ messages can be edited.
   * @param id ID of the message (required)
   * @param conversationsMessagesIdPutRequest  (required)
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsMessagesIdPut(@jakarta.annotation.Nonnull String id, @jakarta.annotation.Nonnull ConversationsMessagesIdPutRequest conversationsMessagesIdPutRequest) throws ApiException {
    return this.conversationsMessagesIdPut(id, conversationsMessagesIdPutRequest, Collections.emptyMap());
  }


  /**
   * Update a message sent by an agent
   * Only agents’ messages can be edited.
   * @param id ID of the message (required)
   * @param conversationsMessagesIdPutRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsMessagesIdPut(@jakarta.annotation.Nonnull String id, @jakarta.annotation.Nonnull ConversationsMessagesIdPutRequest conversationsMessagesIdPutRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = conversationsMessagesIdPutRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conversationsMessagesIdPut");
    }
    
    // verify the required parameter 'conversationsMessagesIdPutRequest' is set
    if (conversationsMessagesIdPutRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationsMessagesIdPutRequest' when calling conversationsMessagesIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/conversations/messages/{id}"
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

    TypeReference<ConversationsMessage> localVarReturnType = new TypeReference<ConversationsMessage>() {};
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
   * Send a message as an agent
   * 
   * @param conversationsMessagesPostRequest  (required)
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsMessagesPost(@jakarta.annotation.Nonnull ConversationsMessagesPostRequest conversationsMessagesPostRequest) throws ApiException {
    return this.conversationsMessagesPost(conversationsMessagesPostRequest, Collections.emptyMap());
  }


  /**
   * Send a message as an agent
   * 
   * @param conversationsMessagesPostRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsMessagesPost(@jakarta.annotation.Nonnull ConversationsMessagesPostRequest conversationsMessagesPostRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = conversationsMessagesPostRequest;
    
    // verify the required parameter 'conversationsMessagesPostRequest' is set
    if (conversationsMessagesPostRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationsMessagesPostRequest' when calling conversationsMessagesPost");
    }
    
    // create path and map variables
    String localVarPath = "/conversations/messages";

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

    TypeReference<ConversationsMessage> localVarReturnType = new TypeReference<ConversationsMessage>() {};
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
   * Delete an automated message
   * 
   * @param id ID of the message (required)
   * @throws ApiException if fails to make API call
   */
  public void conversationsPushedMessagesIdDelete(@jakarta.annotation.Nonnull String id) throws ApiException {
    this.conversationsPushedMessagesIdDelete(id, Collections.emptyMap());
  }


  /**
   * Delete an automated message
   * 
   * @param id ID of the message (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void conversationsPushedMessagesIdDelete(@jakarta.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conversationsPushedMessagesIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/conversations/pushedMessages/{id}"
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
   * Get an automated message
   * 
   * @param id ID of the message sent previously (required)
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsPushedMessagesIdGet(@jakarta.annotation.Nonnull String id) throws ApiException {
    return this.conversationsPushedMessagesIdGet(id, Collections.emptyMap());
  }


  /**
   * Get an automated message
   * 
   * @param id ID of the message sent previously (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsPushedMessagesIdGet(@jakarta.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conversationsPushedMessagesIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/conversations/pushedMessages/{id}"
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

    TypeReference<ConversationsMessage> localVarReturnType = new TypeReference<ConversationsMessage>() {};
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
   * Update an automated message
   * 
   * @param id ID of the message (required)
   * @param conversationsMessagesIdPutRequest  (required)
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsPushedMessagesIdPut(@jakarta.annotation.Nonnull String id, @jakarta.annotation.Nonnull ConversationsMessagesIdPutRequest conversationsMessagesIdPutRequest) throws ApiException {
    return this.conversationsPushedMessagesIdPut(id, conversationsMessagesIdPutRequest, Collections.emptyMap());
  }


  /**
   * Update an automated message
   * 
   * @param id ID of the message (required)
   * @param conversationsMessagesIdPutRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsPushedMessagesIdPut(@jakarta.annotation.Nonnull String id, @jakarta.annotation.Nonnull ConversationsMessagesIdPutRequest conversationsMessagesIdPutRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = conversationsMessagesIdPutRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conversationsPushedMessagesIdPut");
    }
    
    // verify the required parameter 'conversationsMessagesIdPutRequest' is set
    if (conversationsMessagesIdPutRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationsMessagesIdPutRequest' when calling conversationsPushedMessagesIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/conversations/pushedMessages/{id}"
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

    TypeReference<ConversationsMessage> localVarReturnType = new TypeReference<ConversationsMessage>() {};
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
   * Send an automated message to a visitor
   * Example of automated messages: order status, announce new features in your web app, etc.
   * @param conversationsPushedMessagesPostRequest  (required)
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsPushedMessagesPost(@jakarta.annotation.Nonnull ConversationsPushedMessagesPostRequest conversationsPushedMessagesPostRequest) throws ApiException {
    return this.conversationsPushedMessagesPost(conversationsPushedMessagesPostRequest, Collections.emptyMap());
  }


  /**
   * Send an automated message to a visitor
   * Example of automated messages: order status, announce new features in your web app, etc.
   * @param conversationsPushedMessagesPostRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationsMessage
   * @throws ApiException if fails to make API call
   */
  public ConversationsMessage conversationsPushedMessagesPost(@jakarta.annotation.Nonnull ConversationsPushedMessagesPostRequest conversationsPushedMessagesPostRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = conversationsPushedMessagesPostRequest;
    
    // verify the required parameter 'conversationsPushedMessagesPostRequest' is set
    if (conversationsPushedMessagesPostRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationsPushedMessagesPostRequest' when calling conversationsPushedMessagesPost");
    }
    
    // create path and map variables
    String localVarPath = "/conversations/pushedMessages";

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

    TypeReference<ConversationsMessage> localVarReturnType = new TypeReference<ConversationsMessage>() {};
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
