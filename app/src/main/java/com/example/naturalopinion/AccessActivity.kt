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
import com.example.naturalopinion.databinding.ActivityAccessBinding


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
            if(binding.accessCode.text.toString() == "121212"){
                binding.accessCard.strokeWidth = 0
                binding.emailCardview.strokeWidth = 0
                binding.cross1Error.visibility = View.GONE
                binding.cross2Error.visibility = View.GONE
                binding.cross1.visibility = View.VISIBLE
                binding.cross2.visibility = View.VISIBLE
                Toast.makeText(this,"Valid Request",Toast.LENGTH_SHORT).show()
                val editor = getSharedPreferences("Paid", MODE_PRIVATE).edit()
                editor.putBoolean("Premium",true)
                editor.apply()
            }else{
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
}