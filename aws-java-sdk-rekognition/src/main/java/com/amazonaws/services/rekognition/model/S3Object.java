/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the S3 bucket name and object name.
 * </p>
 * <p>
 * The region for the S3 bucket containing the S3 object must match the region you use for Amazon Rekognition
 * operations.
 * </p>
 * <p>
 * For Amazon Rekognition to process an S3 object, the user must have permission to access the S3 object. For more
 * information, see <a>manage-access-resource-policies</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Object implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * S3 object key name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If the bucket is versioning enabled, you can specify the object version.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucket
     *        Name of the S3 bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @return Name of the S3 bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucket
     *        Name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * S3 object key name.
     * </p>
     * 
     * @param name
     *        S3 object key name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * S3 object key name.
     * </p>
     * 
     * @return S3 object key name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * S3 object key name.
     * </p>
     * 
     * @param name
     *        S3 object key name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If the bucket is versioning enabled, you can specify the object version.
     * </p>
     * 
     * @param version
     *        If the bucket is versioning enabled, you can specify the object version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * If the bucket is versioning enabled, you can specify the object version.
     * </p>
     * 
     * @return If the bucket is versioning enabled, you can specify the object version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * If the bucket is versioning enabled, you can specify the object version.
     * </p>
     * 
     * @param version
     *        If the bucket is versioning enabled, you can specify the object version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withVersion(String version) {
        setVersion(version);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Object == false)
            return false;
        S3Object other = (S3Object) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public S3Object clone() {
        try {
            return (S3Object) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.S3ObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
