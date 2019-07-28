package com.example.elecrickrider.Remote;

import com.example.elecrickrider.Model.FCMResponse;
import com.example.elecrickrider.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAACEgL6_M:APA91bFv7ITLOvOwnl3YFW3ST3wkS3TVJHbeUopR3o-dqU1IePxWZ4FgOwESE9fIsWTIxQCezfWR0cnzF2wr6FyW33RRADqcibwyY4Afcj0hVvo_cajJKdKdC_QhMWX8CCvlAvDuvKln"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
