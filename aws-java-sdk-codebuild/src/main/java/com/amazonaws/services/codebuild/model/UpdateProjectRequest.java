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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <note>
     * <p>
     * You cannot change a build project's name.
     * </p>
     * </note>
     */
    private String name;
    /**
     * <p>
     * A new or replacement description of the build project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information to be changed about the build input source code for the build project.
     * </p>
     */
    private ProjectSource source;
    /**
     * <p>
     * Information to be changed about the build output artifacts for the build project.
     * </p>
     */
    private ProjectArtifacts artifacts;
    /**
     * <p>
     * Information to be changed about the build environment for the build project.
     * </p>
     */
    private ProjectEnvironment environment;
    /**
     * <p>
     * The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact
     * with dependent AWS services on behalf of the AWS account.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any
     * related build that did not get marked as completed.
     * </p>
     */
    private Integer timeoutInMinutes;
    /**
     * <p>
     * The replacement AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the
     * build output artifacts.
     * </p>
     * <p>
     * You can specify either the CMK's Amazon Resource Name (ARN) or, if available, the CMK's alias (using the format
     * <code>alias/<i>alias-name</i> </code>).
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * The replacement set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <note>
     * <p>
     * You cannot change a build project's name.
     * </p>
     * </note>
     * 
     * @param name
     *        The name of the build project.</p> <note>
     *        <p>
     *        You cannot change a build project's name.
     *        </p>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <note>
     * <p>
     * You cannot change a build project's name.
     * </p>
     * </note>
     * 
     * @return The name of the build project.</p> <note>
     *         <p>
     *         You cannot change a build project's name.
     *         </p>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <note>
     * <p>
     * You cannot change a build project's name.
     * </p>
     * </note>
     * 
     * @param name
     *        The name of the build project.</p> <note>
     *        <p>
     *        You cannot change a build project's name.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A new or replacement description of the build project.
     * </p>
     * 
     * @param description
     *        A new or replacement description of the build project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new or replacement description of the build project.
     * </p>
     * 
     * @return A new or replacement description of the build project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new or replacement description of the build project.
     * </p>
     * 
     * @param description
     *        A new or replacement description of the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information to be changed about the build input source code for the build project.
     * </p>
     * 
     * @param source
     *        Information to be changed about the build input source code for the build project.
     */

    public void setSource(ProjectSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Information to be changed about the build input source code for the build project.
     * </p>
     * 
     * @return Information to be changed about the build input source code for the build project.
     */

    public ProjectSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * Information to be changed about the build input source code for the build project.
     * </p>
     * 
     * @param source
     *        Information to be changed about the build input source code for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withSource(ProjectSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * Information to be changed about the build output artifacts for the build project.
     * </p>
     * 
     * @param artifacts
     *        Information to be changed about the build output artifacts for the build project.
     */

    public void setArtifacts(ProjectArtifacts artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * <p>
     * Information to be changed about the build output artifacts for the build project.
     * </p>
     * 
     * @return Information to be changed about the build output artifacts for the build project.
     */

    public ProjectArtifacts getArtifacts() {
        return this.artifacts;
    }

    /**
     * <p>
     * Information to be changed about the build output artifacts for the build project.
     * </p>
     * 
     * @param artifacts
     *        Information to be changed about the build output artifacts for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withArtifacts(ProjectArtifacts artifacts) {
        setArtifacts(artifacts);
        return this;
    }

    /**
     * <p>
     * Information to be changed about the build environment for the build project.
     * </p>
     * 
     * @param environment
     *        Information to be changed about the build environment for the build project.
     */

    public void setEnvironment(ProjectEnvironment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Information to be changed about the build environment for the build project.
     * </p>
     * 
     * @return Information to be changed about the build environment for the build project.
     */

    public ProjectEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * Information to be changed about the build environment for the build project.
     * </p>
     * 
     * @param environment
     *        Information to be changed about the build environment for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withEnvironment(ProjectEnvironment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact
     * with dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @param serviceRole
     *        The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     *        interact with dependent AWS services on behalf of the AWS account.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact
     * with dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @return The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     *         interact with dependent AWS services on behalf of the AWS account.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact
     * with dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @param serviceRole
     *        The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     *        interact with dependent AWS services on behalf of the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any
     * related build that did not get marked as completed.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any
     *        related build that did not get marked as completed.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any
     * related build that did not get marked as completed.
     * </p>
     * 
     * @return The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out
     *         any related build that did not get marked as completed.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any
     * related build that did not get marked as completed.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any
     *        related build that did not get marked as completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * The replacement AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the
     * build output artifacts.
     * </p>
     * <p>
     * You can specify either the CMK's Amazon Resource Name (ARN) or, if available, the CMK's alias (using the format
     * <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @param encryptionKey
     *        The replacement AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting
     *        the build output artifacts.</p>
     *        <p>
     *        You can specify either the CMK's Amazon Resource Name (ARN) or, if available, the CMK's alias (using the
     *        format <code>alias/<i>alias-name</i> </code>).
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The replacement AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the
     * build output artifacts.
     * </p>
     * <p>
     * You can specify either the CMK's Amazon Resource Name (ARN) or, if available, the CMK's alias (using the format
     * <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @return The replacement AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting
     *         the build output artifacts.</p>
     *         <p>
     *         You can specify either the CMK's Amazon Resource Name (ARN) or, if available, the CMK's alias (using the
     *         format <code>alias/<i>alias-name</i> </code>).
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The replacement AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the
     * build output artifacts.
     * </p>
     * <p>
     * You can specify either the CMK's Amazon Resource Name (ARN) or, if available, the CMK's alias (using the format
     * <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @param encryptionKey
     *        The replacement AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting
     *        the build output artifacts.</p>
     *        <p>
     *        You can specify either the CMK's Amazon Resource Name (ARN) or, if available, the CMK's alias (using the
     *        format <code>alias/<i>alias-name</i> </code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * The replacement set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * 
     * @return The replacement set of tags for this build project.</p>
     *         <p>
     *         These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The replacement set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * 
     * @param tags
     *        The replacement set of tags for this build project.</p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The replacement set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The replacement set of tags for this build project.</p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The replacement set of tags for this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * </p>
     * 
     * @param tags
     *        The replacement set of tags for this build project.</p>
     *        <p>
     *        These tags are available for use by AWS services that support AWS CodeBuild build project tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getArtifacts() != null)
            sb.append("Artifacts: ").append(getArtifacts()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: ").append(getTimeoutInMinutes()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProjectRequest == false)
            return false;
        UpdateProjectRequest other = (UpdateProjectRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getArtifacts() == null ^ this.getArtifacts() == null)
            return false;
        if (other.getArtifacts() != null && other.getArtifacts().equals(this.getArtifacts()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getArtifacts() == null) ? 0 : getArtifacts().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectRequest clone() {
        return (UpdateProjectRequest) super.clone();
    }

}
