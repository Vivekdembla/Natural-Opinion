package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.naturalopinion.Data.UserDetailSent
import com.example.naturalopinion.databinding.ActivityOrderFormBinding
import java.util.regex.Pattern


class OrderFormActivity : AppCompatActivity() {
    lateinit var binding : ActivityOrderFormBinding
    var id = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderFormBinding.inflate(layoutInflater)
        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }
        setContentView(binding.root)

        val apiService = RestApiService()



        binding.backButton.setOnClickListener { finish() }

        binding.submitButton.setOnClickListener {
            val userInfo = UserDetailSent(binding.firstName.text.toString()+" "+binding.lastName.text.toString()
                ,binding.email.text.toString(),binding.contact.text.toString(),binding.address.text.toString())
            val email : Boolean = EMAIL_ADDRESS_PATTERN.matcher(userInfo.email).matches()
            if(email){
                apiService.addUser(userInfo){
                    Log.e("Checking", it?.success?.id.toString())
                    if(it?.responseCode==200){
                        id = it.success?.id.toString().toInt()
                        val editor = getSharedPreferences("Paid", MODE_PRIVATE).edit()
                        editor.putInt("id",id)
                        editor.apply()
                        Toast.makeText(this,it.success?.otp,Toast.LENGTH_LONG).show()
                    }else{
                        Toast.makeText(this,"This email has already been taken!",Toast.LENGTH_SHORT).show()
                    }
                    val intent = Intent(this,VerificationActivity::class.java)
                    startActivity(intent)
                }
            }else{
                Toast.makeText(this,"Enter a valid email!!",Toast.LENGTH_SHORT).show()
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