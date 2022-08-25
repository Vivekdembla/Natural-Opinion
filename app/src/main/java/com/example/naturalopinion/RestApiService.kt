package com.example.naturalopinion

import android.util.Log
import com.example.naturalopinion.Data.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiService {
    fun addUser(userData : UserDetailSent,onResult: (UserDataResponse?)->Unit) {
        val retrofit = ServiceBuilder.buildService(ApiInterface::class.java)
        retrofit.addUser(userData).enqueue(
            object : Callback<UserDataResponse> {
                override fun onResponse(
                    call: Call<UserDataResponse>,
                    response: Response<UserDataResponse>
                ) {
                    val userDataResponse = response.body()
                    onResult(userDataResponse)
                }

                override fun onFailure(call: Call<UserDataResponse>, t: Throwable) {
                    onResult(null)
                    Log.e("Checking",t.toString())
                }
            }
        )
    }
    fun authenticateUser(authenticationData: AuthenticationData,onResult: (UserDataResponse?) -> Unit){
        val retrofit = ServiceBuilder.buildService(ApiInterface::class.java)
        retrofit.authenticate(authenticationData).enqueue(
            object : Callback<UserDataResponse> {
                override fun onResponse(
                    call: Call<UserDataResponse>,
                    response: Response<UserDataResponse>
                ) {
                    val userDataResponse = response.body()
                    onResult(userDataResponse)
                }

                override fun onFailure(call: Call<UserDataResponse>, t: Throwable) {
                    onResult(null)
                    Log.e("Checking",t.toString())
                }
            }
        )
    }
    fun forgotPassword(str: String,onResult: (ForgotOtpResponse?) -> Unit){
        val retrofit = ServiceBuilder.buildService(ApiInterface::class.java)
        retrofit.forgotPassword(str).enqueue(
            object : Callback<ForgotOtpResponse> {
                override fun onResponse(
                    call: Call<ForgotOtpResponse>,
                    response: Response<ForgotOtpResponse>
                ) {
                    val forgotOtpResponse = response.body()
                    onResult(forgotOtpResponse)
                }

                override fun onFailure(call: Call<ForgotOtpResponse>, t: Throwable) {
                    onResult(null)
                    Log.e("Checking",t.toString())
                }
            }
        )
    }
    fun login(loginData: LoginData,onResult: (UserDataResponse?) -> Unit){
        val retrofit = ServiceBuilder.buildService(ApiInterface::class.java)
        retrofit.login(loginData).enqueue(
            object : Callback<UserDataResponse> {
                override fun onResponse(
                    call: Call<UserDataResponse>,
                    response: Response<UserDataResponse>
                ) {
                    val userDataResponse = response.body()
                    onResult(userDataResponse)
                }

                override fun onFailure(call: Call<UserDataResponse>, t: Throwable) {
                    onResult(null)
                    Log.e("Checking",t.toString())
                }
            }
        )
    }
}