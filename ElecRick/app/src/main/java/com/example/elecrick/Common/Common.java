package com.example.elecrick.Common;

import android.location.Location;

import com.example.elecrick.Model.User;
import com.example.elecrick.Remote.FCMClient;
import com.example.elecrick.Remote.IFCMService;
import com.example.elecrick.Remote.IGoogleAPI;
import com.example.elecrick.Remote.RetrofitClient;

public class Common {

    public static String currentToken="";

    public static final String driver_tbl = "drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";


    public static User currentUser;

    public static Location mLastLocation=null;


    public static final String fcmURL = "https://fcm.googleapis.com";

    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFCMService(){
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }

}
