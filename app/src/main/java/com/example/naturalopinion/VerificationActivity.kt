package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Toast
import com.example.naturalopinion.Data.AuthenticationData
import com.example.naturalopinion.databinding.ActivityVerificationBinding

class VerificationActivity : AppCompatActivity() {
    lateinit var binding : ActivityVerificationBinding
    var id = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerificationBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }
        val pref = getSharedPreferences("Paid", MODE_PRIVATE)
        id = pref.getInt("id",-1)

        val apiService = RestApiService()

        binding.cross1.setOnClickListener {
            binding.otp.setText("")
        }
        binding.submitButton.setOnClickListener {
            try {
                val authenticationData = AuthenticationData(id,binding.otp.text.toString().toInt())
                apiService.authenticateUser(authenticationData){
                    if(it?.responseCode==200){
                        val editor = getSharedPreferences("Paid", MODE_PRIVATE).edit()
                        editor.putString("name",it.success?.name)
                        editor.putString("email",it.success?.email)
                        editor.putString("mobile",it.success?.mobile)
                        editor.putString("address",it.success?.address)
                        editor.putString("address",it.success?.address)
                        editor.apply()
                        val intent = Intent(this,PaymentActivity::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this,"Otp is incorrect",Toast.LENGTH_LONG).show()
                    }
                }

            }catch (e : java.lang.NumberFormatException){
                Toast.makeText(this,"Enter a valid otp",Toast.LENGTH_LONG).show()
            }

//            if(authenticationData.otp){
//
//            }
        }

        binding.backButton.setOnClickListener { finish() }

    }
}