/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.organizations.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.organizations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HandshakeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HandshakeMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<List> PARTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parties").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<java.util.Date> REQUESTEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationTimestamp").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<List> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Resources").build();

    private static final HandshakeMarshaller instance = new HandshakeMarshaller();

    public static HandshakeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Handshake handshake, ProtocolMarshaller protocolMarshaller) {

        if (handshake == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(handshake.getId(), ID_BINDING);
            protocolMarshaller.marshall(handshake.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(handshake.getParties(), PARTIES_BINDING);
            protocolMarshaller.marshall(handshake.getState(), STATE_BINDING);
            protocolMarshaller.marshall(handshake.getRequestedTimestamp(), REQUESTEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(handshake.getExpirationTimestamp(), EXPIRATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(handshake.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(handshake.getResources(), RESOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
