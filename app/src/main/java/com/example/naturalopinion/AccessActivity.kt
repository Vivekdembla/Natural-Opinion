package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView

class AccessActivity : AppCompatActivity() {
    lateinit var back_button : ImageView
    lateinit var forgot : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_access)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }

        back_button = findViewById(R.id.back_button_2)
        forgot = findViewById(R.id.forgot)

        //finish activity
        back_button.setOnClickListener { finish() }

        forgot.setOnClickListener { startActivity(Intent(this,ForgotActivity::class.java)) }

    }
}