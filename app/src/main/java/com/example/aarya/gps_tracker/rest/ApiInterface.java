package com.example.aarya.gps_tracker.rest;

import com.example.aarya.gps_tracker.model.GpsDataStore;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class ApiInterface {

    @GET("/sgm_android/WebService.asmx/insertfolochist")
    Call<List<GpsDataStore>> sendGpsData(@Query("lat") String latitude,
                                         @Query("lon") String longitude,
                                         @Query("imei") String imei,
                                         @Query("battery") String battery,
                                         @Query("date_time") boolean dateTime,
                                         @Query("location") String location,
                                         @Query("Panic") String panic,
                                         @Query("Accurate") String accurate,
                                         @Query("Speed") String speed,
                                         @Query("Direction") String direction) {
        return null;
    }
}
// http://111.118.178.163/sgm_android/WebService.asmx/insertfolochist?
// lat=23.1212&&
// lon=76.3434&&
// imei=13231313&&
// battery=23&&
// date_time=2016-11-28%2012:46&&
// location=noida%20sector%2062&&
// Panic=false&&
// Accurate=23.32&&
// Speed=24&&
// Direction=1