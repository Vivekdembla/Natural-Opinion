package com.example.naturalopinion

import com.example.naturalopinion.Data.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {

    @Headers("Content-Type: application/json")
    @POST("adduserinfo")
    fun addUser(@Body userDetail: UserDetailSent) : Call<UserDataResponse>

    @Headers("Content-Type: application/json")
    @POST("otp_verification")
    fun authenticate(@Body authenticationData: AuthenticationData) : Call<UserDataResponse>

    @Headers("Content-Type: application/json")
    @POST("forgotpassword")
    fun forgotPassword(@Body str: String) : Call<ForgotOtpResponse>

    @Headers("Content-Type: application/json")
    @POST("login")
    fun login(@Body loginData: LoginData) : Call<UserDataResponse>

}