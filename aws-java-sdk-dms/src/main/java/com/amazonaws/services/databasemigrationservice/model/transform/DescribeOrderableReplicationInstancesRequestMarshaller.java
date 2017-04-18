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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeOrderableReplicationInstancesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeOrderableReplicationInstancesRequestMarshaller {

    private static final MarshallingInfo<Integer> MAXRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRecords").build();
    private static final MarshallingInfo<String> MARKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Marker").build();

    private static final DescribeOrderableReplicationInstancesRequestMarshaller instance = new DescribeOrderableReplicationInstancesRequestMarshaller();

    public static DescribeOrderableReplicationInstancesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeOrderableReplicationInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeOrderableReplicationInstancesRequest.getMaxRecords(), MAXRECORDS_BINDING);
            protocolMarshaller.marshall(describeOrderableReplicationInstancesRequest.getMarker(), MARKER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
