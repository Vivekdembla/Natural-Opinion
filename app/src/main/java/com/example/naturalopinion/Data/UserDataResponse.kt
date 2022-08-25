package com.example.naturalopinion.Data

import com.google.gson.annotations.SerializedName

data class UserDataResponse(
    @SerializedName("response_message") var response_message : String = "",
    @SerializedName("success"       ) var success      : Success? = Success(),
    @SerializedName("response_code" ) var responseCode : Int?     = null
)
data class Success (

    @SerializedName("id"                  ) var id                 : String? = null,
    @SerializedName("name"                ) var name               : String? = null,
    @SerializedName("email"               ) var email              : String? = null,
    @SerializedName("mobile"              ) var mobile             : String? = null,
    @SerializedName("address"             ) var address            : String? = null,
    @SerializedName("otp"                 ) var otp                : String? = null,
    @SerializedName("verification_status" ) var verificationStatus : String? = null

)