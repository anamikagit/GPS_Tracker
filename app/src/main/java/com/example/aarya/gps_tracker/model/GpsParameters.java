package com.example.aarya.gps_tracker.model;

public class GpsParameters {

    private String lat;
    private String lon;
    private String imei;
    private String date_time;
    private String Accurate;
    private String battery;
    private String location;
    private String Panic;
    private String Speed;
    private String Direction;

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getAccurate() {
        return Accurate;
    }

    public void setAccurate(String accurate) {
        Accurate = accurate;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPanic() {
        return Panic;
    }

    public void setPanic(String panic) {
        Panic = panic;
    }

    public String getSpeed() {
        return Speed;
    }

    public void setSpeed(String speed) {
        Speed = speed;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }
}
//lat=23.1212&&
// lon=76.3434&&
// imei=13231313&&
// battery=23&&
// date_time=2016-11-28%2012:46&&
// location=noida%20sector%2062&&
// Panic=false&&
// Accurate=23.32&&
// Speed=24&&
// Direction=1