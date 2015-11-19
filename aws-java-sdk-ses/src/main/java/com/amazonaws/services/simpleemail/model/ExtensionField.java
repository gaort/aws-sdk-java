/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Additional X-headers to include in the Delivery Status Notification
 * (DSN) when an email that Amazon SES receives on your behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 */
public class ExtensionField implements Serializable, Cloneable {

    /**
     * The name of the header to add. Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     * dashes only.
     */
    private String name;

    /**
     * The value of the header to add. Must be less than 2048 characters, and
     * must not contain newline characters ("\r" or "\n").
     */
    private String value;

    /**
     * The name of the header to add. Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     * dashes only.
     *
     * @return The name of the header to add. Must be between 1 and 50 characters,
     *         inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     *         dashes only.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the header to add. Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     * dashes only.
     *
     * @param name The name of the header to add. Must be between 1 and 50 characters,
     *         inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     *         dashes only.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the header to add. Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     * dashes only.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the header to add. Must be between 1 and 50 characters,
     *         inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     *         dashes only.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExtensionField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The value of the header to add. Must be less than 2048 characters, and
     * must not contain newline characters ("\r" or "\n").
     *
     * @return The value of the header to add. Must be less than 2048 characters, and
     *         must not contain newline characters ("\r" or "\n").
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value of the header to add. Must be less than 2048 characters, and
     * must not contain newline characters ("\r" or "\n").
     *
     * @param value The value of the header to add. Must be less than 2048 characters, and
     *         must not contain newline characters ("\r" or "\n").
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value of the header to add. Must be less than 2048 characters, and
     * must not contain newline characters ("\r" or "\n").
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value of the header to add. Must be less than 2048 characters, and
     *         must not contain newline characters ("\r" or "\n").
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExtensionField withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExtensionField == false) return false;
        ExtensionField other = (ExtensionField)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
    @Override
    public ExtensionField clone() {
        try {
            return (ExtensionField) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    