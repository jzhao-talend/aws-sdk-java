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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ExportToS3TaskSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportToS3TaskSpecificationStaxUnmarshaller implements Unmarshaller<ExportToS3TaskSpecification, StaxUnmarshallerContext> {

    public ExportToS3TaskSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        ExportToS3TaskSpecification exportToS3TaskSpecification = new ExportToS3TaskSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return exportToS3TaskSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("diskImageFormat", targetDepth)) {
                    exportToS3TaskSpecification.setDiskImageFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("containerFormat", targetDepth)) {
                    exportToS3TaskSpecification.setContainerFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("s3Bucket", targetDepth)) {
                    exportToS3TaskSpecification.setS3Bucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("s3Prefix", targetDepth)) {
                    exportToS3TaskSpecification.setS3Prefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return exportToS3TaskSpecification;
                }
            }
        }
    }

    private static ExportToS3TaskSpecificationStaxUnmarshaller instance;

    public static ExportToS3TaskSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportToS3TaskSpecificationStaxUnmarshaller();
        return instance;
    }
}
