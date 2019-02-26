/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String resourceArn;

    private TagsModel tagsModel;

    /**
     * @param resourceArn
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * @return
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @param resourceArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * @param tagsModel
     */

    public void setTagsModel(TagsModel tagsModel) {
        this.tagsModel = tagsModel;
    }

    /**
     * @return
     */

    public TagsModel getTagsModel() {
        return this.tagsModel;
    }

    /**
     * @param tagsModel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTagsModel(TagsModel tagsModel) {
        setTagsModel(tagsModel);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getTagsModel() != null)
            sb.append("TagsModel: ").append(getTagsModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagsModel() == null ^ this.getTagsModel() == null)
            return false;
        if (other.getTagsModel() != null && other.getTagsModel().equals(this.getTagsModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTagsModel() == null) ? 0 : getTagsModel().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
