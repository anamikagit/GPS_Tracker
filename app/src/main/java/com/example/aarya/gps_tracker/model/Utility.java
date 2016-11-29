package com.example.aarya.gps_tracker.model;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Utility {
    public static String imei;

    public static String  getDateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(new Date());
    }
    public static String getCurrentDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String currentDateTime = sdf.format(new Date());
        return currentDateTime;
    }
}
