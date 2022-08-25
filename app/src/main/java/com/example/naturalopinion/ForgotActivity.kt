package com.example.naturalopinion

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.example.naturalopinion.databinding.ActivityForgotBinding
import java.util.regex.Pattern

class ForgotActivity : AppCompatActivity() {
    lateinit var binding : ActivityForgotBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }
        binding.backButton.setOnClickListener { finish() }
        binding.cross1.setOnClickListener {
            binding.email.setText("")
        }
        val apiService = RestApiService()
        binding.sendRequest.setOnClickListener {
            val email : String = binding.email.text.toString()
            if(EMAIL_ADDRESS_PATTERN.matcher(email).matches()){
                apiService.forgotPassword(email){
                    if(it?.responseCode==200){
                        Toast.makeText(this,it.success,Toast.LENGTH_LONG).show()
                        finish()
                    }else{
                        Toast.makeText(this,"Payment not done",Toast.LENGTH_LONG).show()
                    }
                }
            }else{
                Toast.makeText(this,"Email id is incorrect",Toast.LENGTH_LONG).show()
            }
        }
    }
    val EMAIL_ADDRESS_PATTERN: Pattern = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )
}