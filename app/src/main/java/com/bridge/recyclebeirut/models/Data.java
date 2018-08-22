
package com.bridge.recyclebeirut.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;


public class Data {

    @SerializedName("user")
    @Expose
    private User user;


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("user", user).toString();
    }

}
