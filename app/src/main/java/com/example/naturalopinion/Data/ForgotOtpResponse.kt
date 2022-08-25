package com.example.naturalopinion.Data

import com.google.gson.annotations.SerializedName

data class ForgotOtpResponse(
    @SerializedName("success"       ) var success      : String? = null,
    @SerializedName("response_code" ) var responseCode : Int?    = null
)
