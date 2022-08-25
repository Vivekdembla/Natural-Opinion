package com.example.naturalopinion.Data

import com.google.gson.annotations.SerializedName


data class UserDetailSent(@SerializedName("name") var name:String,
                          @SerializedName("email") var email:String,
                          @SerializedName("mobile") var mobile:String,
                          @SerializedName("address") var address : String)
