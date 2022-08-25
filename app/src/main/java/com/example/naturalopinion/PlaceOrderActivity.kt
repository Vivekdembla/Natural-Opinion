package com.example.naturalopinion

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class PlaceOrderActivity : AppCompatActivity() {
    lateinit var back_button : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }
        setContentView(R.layout.activity_place_order)
        findViewById<CardView>(R.id.open_form).setOnClickListener {
//            val uri: Uri =
//                Uri.parse("http://www.naturalopinion.com/nmp/OrderNMP.html") // missing 'http://' will cause crashed
//
//            val intent = Intent(Intent.ACTION_VIEW, uri)
            val intent = Intent(this,OrderFormActivity::class.java)
            startActivity(intent)
        }



        back_button = findViewById(R.id.back_button3)

        //close activity
        back_button.setOnClickListener { finish() }
    }
}