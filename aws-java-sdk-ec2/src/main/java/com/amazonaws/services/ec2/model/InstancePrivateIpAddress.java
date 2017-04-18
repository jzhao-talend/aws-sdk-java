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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a private IPv4 address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstancePrivateIpAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancePrivateIpAddress implements Serializable, Cloneable {

    /**
     * <p>
     * The private IPv4 address of the network interface.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * The private IPv4 DNS name.
     * </p>
     */
    private String privateDnsName;
    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of the network interface.
     * </p>
     */
    private Boolean primary;
    /**
     * <p>
     * The association information for an Elastic IP address for the network interface.
     * </p>
     */
    private InstanceNetworkInterfaceAssociation association;

    /**
     * <p>
     * The private IPv4 address of the network interface.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IPv4 address of the network interface.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address of the network interface.
     * </p>
     * 
     * @return The private IPv4 address of the network interface.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address of the network interface.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IPv4 address of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePrivateIpAddress withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * The private IPv4 DNS name.
     * </p>
     * 
     * @param privateDnsName
     *        The private IPv4 DNS name.
     */

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private IPv4 DNS name.
     * </p>
     * 
     * @return The private IPv4 DNS name.
     */

    public String getPrivateDnsName() {
        return this.privateDnsName;
    }

    /**
     * <p>
     * The private IPv4 DNS name.
     * </p>
     * 
     * @param privateDnsName
     *        The private IPv4 DNS name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePrivateIpAddress withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
        return this;
    }

    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of the network interface.
     * </p>
     * 
     * @param primary
     *        Indicates whether this IPv4 address is the primary private IP address of the network interface.
     */

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of the network interface.
     * </p>
     * 
     * @return Indicates whether this IPv4 address is the primary private IP address of the network interface.
     */

    public Boolean getPrimary() {
        return this.primary;
    }

    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of the network interface.
     * </p>
     * 
     * @param primary
     *        Indicates whether this IPv4 address is the primary private IP address of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePrivateIpAddress withPrimary(Boolean primary) {
        setPrimary(primary);
        return this;
    }

    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of the network interface.
     * </p>
     * 
     * @return Indicates whether this IPv4 address is the primary private IP address of the network interface.
     */

    public Boolean isPrimary() {
        return this.primary;
    }

    /**
     * <p>
     * The association information for an Elastic IP address for the network interface.
     * </p>
     * 
     * @param association
     *        The association information for an Elastic IP address for the network interface.
     */

    public void setAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
    }

    /**
     * <p>
     * The association information for an Elastic IP address for the network interface.
     * </p>
     * 
     * @return The association information for an Elastic IP address for the network interface.
     */

    public InstanceNetworkInterfaceAssociation getAssociation() {
        return this.association;
    }

    /**
     * <p>
     * The association information for an Elastic IP address for the network interface.
     * </p>
     * 
     * @param association
     *        The association information for an Elastic IP address for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePrivateIpAddress withAssociation(InstanceNetworkInterfaceAssociation association) {
        setAssociation(association);
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
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: ").append(getPrivateDnsName()).append(",");
        if (getPrimary() != null)
            sb.append("Primary: ").append(getPrimary()).append(",");
        if (getAssociation() != null)
            sb.append("Association: ").append(getAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstancePrivateIpAddress == false)
            return false;
        InstancePrivateIpAddress other = (InstancePrivateIpAddress) obj;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrimary() == null ^ this.getPrimary() == null)
            return false;
        if (other.getPrimary() != null && other.getPrimary().equals(this.getPrimary()) == false)
            return false;
        if (other.getAssociation() == null ^ this.getAssociation() == null)
            return false;
        if (other.getAssociation() != null && other.getAssociation().equals(this.getAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode + ((getPrimary() == null) ? 0 : getPrimary().hashCode());
        hashCode = prime * hashCode + ((getAssociation() == null) ? 0 : getAssociation().hashCode());
        return hashCode;
    }

    @Override
    public InstancePrivateIpAddress clone() {
        try {
            return (InstancePrivateIpAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
