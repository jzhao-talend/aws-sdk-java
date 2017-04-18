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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies the <code>runId</code> of a workflow execution.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Run extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>runId</code> of a workflow execution. This ID is generated by the service and can be used to uniquely
     * identify the workflow execution within a domain.
     * </p>
     */
    private String runId;

    /**
     * <p>
     * The <code>runId</code> of a workflow execution. This ID is generated by the service and can be used to uniquely
     * identify the workflow execution within a domain.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of a workflow execution. This ID is generated by the service and can be used to
     *        uniquely identify the workflow execution within a domain.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The <code>runId</code> of a workflow execution. This ID is generated by the service and can be used to uniquely
     * identify the workflow execution within a domain.
     * </p>
     * 
     * @return The <code>runId</code> of a workflow execution. This ID is generated by the service and can be used to
     *         uniquely identify the workflow execution within a domain.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The <code>runId</code> of a workflow execution. This ID is generated by the service and can be used to uniquely
     * identify the workflow execution within a domain.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of a workflow execution. This ID is generated by the service and can be used to
     *        uniquely identify the workflow execution within a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Run == false)
            return false;
        Run other = (Run) obj;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        return hashCode;
    }

    @Override
    public Run clone() {
        try {
            return (Run) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
