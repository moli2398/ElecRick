package com.example.elecrickrider.Common;

import com.example.elecrickrider.Remote.FCMClient;
import com.example.elecrickrider.Remote.IFCMService;

public class Common {


    public static final String driver_tbl = "drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";



    public static final String fcmURL = "https://fcm.googleapis.com";

    public static IFCMService getFCMService(){
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }

}
