package com.example.aarya.gps_tracker.model;

import com.google.gson.annotations.SerializedName;

public class GpsParameterResponce {
    @SerializedName("response")
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
