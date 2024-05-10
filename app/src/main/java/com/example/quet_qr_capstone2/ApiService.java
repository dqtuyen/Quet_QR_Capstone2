package com.example.quet_qr_capstone2;

import android.view.SurfaceControl;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("api/emaillocation")
    Call<List<EmailLocation>> getEmailLocations();
    @GET("api/users/email/{email}")
    Call<User> getUserByEmail(@Path("email") String email);

    @GET("api/users/token/{user_id}")
    Call<TokenResponse> getUserToken(@Path("user_id") String userId);
}

