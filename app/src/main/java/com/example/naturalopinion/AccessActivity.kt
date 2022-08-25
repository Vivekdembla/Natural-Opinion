package com.example.naturalopinion

import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.naturalopinion.Data.LoginData
import com.example.naturalopinion.databinding.ActivityAccessBinding
import java.lang.Error
import java.util.regex.Pattern


class AccessActivity : AppCompatActivity() {
    lateinit var back_button : ImageView
    lateinit var forgot : TextView
    lateinit var binding : ActivityAccessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }
        binding.cross1.setOnClickListener {
            binding.email.setText("")
        }
        binding.cross2.setOnClickListener {
            binding.accessCode.setText("")
        }
        binding.submitButton.setOnClickListener {
            if(!isValidEmail(binding.email.text.toString())){
                binding.emailCardview.strokeWidth = 3
                binding.cross1.visibility = View.GONE
                binding.cross1Error.visibility = View.VISIBLE
                return@setOnClickListener
            }
            if(binding.accessCode.text.isEmpty()){
                binding.accessCard.strokeWidth = 3
                binding.cross2.visibility = View.GONE
                binding.cross2Error.visibility = View.VISIBLE
                return@setOnClickListener
            }
            val password = binding.accessCode.text.toString()
            var restApiService = RestApiService()
            val email = binding.email.text.toString()

            if(EMAIL_ADDRESS_PATTERN.matcher(email).matches()&& password.isNotEmpty())
            try {
                restApiService.login(LoginData(email,password)){
                    if(it?.responseCode==200){
                        Toast.makeText(this,"Valid Request",Toast.LENGTH_SHORT).show()
                        val editor = getSharedPreferences("Paid", MODE_PRIVATE).edit()
                        editor.putBoolean("Premium",true)
                        editor.apply()
                        finish()
                    }else{
                        Toast.makeText(this,it?.response_message,Toast.LENGTH_LONG).show()
                    }
                }
            }catch (e:Error){
                Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show()
                binding.accessCard.strokeWidth = 3
                binding.cross2.visibility = View.GONE
                binding.cross2Error.visibility = View.VISIBLE
                return@setOnClickListener
            }
        }

        back_button = findViewById(R.id.back_button_2)
        forgot = findViewById(R.id.forgot)

        //finish activity
        back_button.setOnClickListener { finish() }

        forgot.setOnClickListener { startActivity(Intent(this,ForgotActivity::class.java)) }


    }
    fun isValidEmail(target: CharSequence?): Boolean {
        return if (TextUtils.isEmpty(target)) {
            false
        } else {
            Patterns.EMAIL_ADDRESS.matcher(target!!).matches()
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