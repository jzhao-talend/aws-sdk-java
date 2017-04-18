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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetFacet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFacetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * <a>Facet</a> structure associated with the facet.
     * </p>
     */
    private Facet facet;

    /**
     * <p>
     * <a>Facet</a> structure associated with the facet.
     * </p>
     * 
     * @param facet
     *        <a>Facet</a> structure associated with the facet.
     */

    public void setFacet(Facet facet) {
        this.facet = facet;
    }

    /**
     * <p>
     * <a>Facet</a> structure associated with the facet.
     * </p>
     * 
     * @return <a>Facet</a> structure associated with the facet.
     */

    public Facet getFacet() {
        return this.facet;
    }

    /**
     * <p>
     * <a>Facet</a> structure associated with the facet.
     * </p>
     * 
     * @param facet
     *        <a>Facet</a> structure associated with the facet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFacetResult withFacet(Facet facet) {
        setFacet(facet);
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
        if (getFacet() != null)
            sb.append("Facet: ").append(getFacet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFacetResult == false)
            return false;
        GetFacetResult other = (GetFacetResult) obj;
        if (other.getFacet() == null ^ this.getFacet() == null)
            return false;
        if (other.getFacet() != null && other.getFacet().equals(this.getFacet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFacet() == null) ? 0 : getFacet().hashCode());
        return hashCode;
    }

    @Override
    public GetFacetResult clone() {
        try {
            return (GetFacetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
