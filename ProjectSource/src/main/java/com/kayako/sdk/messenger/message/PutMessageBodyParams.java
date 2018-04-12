package com.kayako.sdk.messenger.message;

import java.util.HashMap;
import java.util.Map;

public class PutMessageBodyParams {

  private MessageStatus messageStatus;

  public PutMessageBodyParams(MessageStatus messageStatus) {
    if (messageStatus == null) {
      throw new IllegalArgumentException("MessageStatus can not be null");
    }
    this.messageStatus = messageStatus;
  }

  public MessageStatus getMessageStatus() {
    return messageStatus;
  }

  public enum MessageStatus {
    SEEN, DELIVERED
  }

  public Map<String, String> getBodyParameters() {
    Map<String, String> bodyParameters = new HashMap<>();
    bodyParameters.put("message_status", messageStatus.name());
    return bodyParameters;
  }

}
