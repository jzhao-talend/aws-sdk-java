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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListSAMLProvidersResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSAMLProvidersResultStaxUnmarshaller implements Unmarshaller<ListSAMLProvidersResult, StaxUnmarshallerContext> {

    public ListSAMLProvidersResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListSAMLProvidersResult listSAMLProvidersResult = new ListSAMLProvidersResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listSAMLProvidersResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SAMLProviderList", targetDepth)) {
                    listSAMLProvidersResult.withSAMLProviderList(new ArrayList<SAMLProviderListEntry>());
                    continue;
                }

                if (context.testExpression("SAMLProviderList/member", targetDepth)) {
                    listSAMLProvidersResult.withSAMLProviderList(SAMLProviderListEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listSAMLProvidersResult;
                }
            }
        }
    }

    private static ListSAMLProvidersResultStaxUnmarshaller instance;

    public static ListSAMLProvidersResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSAMLProvidersResultStaxUnmarshaller();
        return instance;
    }
}
