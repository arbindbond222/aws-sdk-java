/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateClassificationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClassificationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the classification job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The status to change the job's status to. The only supported value is CANCELLED, which cancels the job
     * completely.
     * </p>
     */
    private String jobStatus;

    /**
     * <p>
     * The unique identifier for the classification job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier for the classification job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier for the classification job.
     * </p>
     * 
     * @return The unique identifier for the classification job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier for the classification job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier for the classification job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClassificationJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status to change the job's status to. The only supported value is CANCELLED, which cancels the job
     * completely.
     * </p>
     * 
     * @param jobStatus
     *        The status to change the job's status to. The only supported value is CANCELLED, which cancels the job
     *        completely.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status to change the job's status to. The only supported value is CANCELLED, which cancels the job
     * completely.
     * </p>
     * 
     * @return The status to change the job's status to. The only supported value is CANCELLED, which cancels the job
     *         completely.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status to change the job's status to. The only supported value is CANCELLED, which cancels the job
     * completely.
     * </p>
     * 
     * @param jobStatus
     *        The status to change the job's status to. The only supported value is CANCELLED, which cancels the job
     *        completely.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public UpdateClassificationJobRequest withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status to change the job's status to. The only supported value is CANCELLED, which cancels the job
     * completely.
     * </p>
     * 
     * @param jobStatus
     *        The status to change the job's status to. The only supported value is CANCELLED, which cancels the job
     *        completely.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public UpdateClassificationJobRequest withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClassificationJobRequest == false)
            return false;
        UpdateClassificationJobRequest other = (UpdateClassificationJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClassificationJobRequest clone() {
        return (UpdateClassificationJobRequest) super.clone();
    }

}
