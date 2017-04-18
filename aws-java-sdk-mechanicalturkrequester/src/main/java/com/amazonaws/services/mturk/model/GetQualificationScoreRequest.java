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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetQualificationScore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQualificationScoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the QualificationType.
     * </p>
     */
    private String qualificationTypeId;
    /**
     * <p>
     * The ID of the Worker whose Qualification is being updated.
     * </p>
     */
    private String workerId;

    /**
     * <p>
     * The ID of the QualificationType.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the QualificationType.
     */

    public void setQualificationTypeId(String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the QualificationType.
     * </p>
     * 
     * @return The ID of the QualificationType.
     */

    public String getQualificationTypeId() {
        return this.qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the QualificationType.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the QualificationType.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQualificationScoreRequest withQualificationTypeId(String qualificationTypeId) {
        setQualificationTypeId(qualificationTypeId);
        return this;
    }

    /**
     * <p>
     * The ID of the Worker whose Qualification is being updated.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker whose Qualification is being updated.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker whose Qualification is being updated.
     * </p>
     * 
     * @return The ID of the Worker whose Qualification is being updated.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker whose Qualification is being updated.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker whose Qualification is being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQualificationScoreRequest withWorkerId(String workerId) {
        setWorkerId(workerId);
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
        if (getQualificationTypeId() != null)
            sb.append("QualificationTypeId: ").append(getQualificationTypeId()).append(",");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQualificationScoreRequest == false)
            return false;
        GetQualificationScoreRequest other = (GetQualificationScoreRequest) obj;
        if (other.getQualificationTypeId() == null ^ this.getQualificationTypeId() == null)
            return false;
        if (other.getQualificationTypeId() != null && other.getQualificationTypeId().equals(this.getQualificationTypeId()) == false)
            return false;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualificationTypeId() == null) ? 0 : getQualificationTypeId().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        return hashCode;
    }

    @Override
    public GetQualificationScoreRequest clone() {
        return (GetQualificationScoreRequest) super.clone();
    }

}
