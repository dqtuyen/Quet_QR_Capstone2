package com.example.quet_qr_capstone2;

import android.view.SurfaceControl;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("api/users/email")
    Call<List<String>> getEmails();

    //@GET("api/users/email/{email}")
    //Call<User> getUserByEmail(@Path("email") String email);
    @GET("api/transaction-history/{userId}")
    Call<List<SurfaceControl.Transaction>> getTransactionHistory(@Path("userId") int userId);

}

