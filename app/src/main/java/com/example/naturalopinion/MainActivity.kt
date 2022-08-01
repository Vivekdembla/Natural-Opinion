package com.example.naturalopinion

import android.app.Dialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.AutoScrollAdapter
import com.example.naturalopinion.databinding.ActivityAboutBinding
import com.example.naturalopinion.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var rv : RecyclerView
    lateinit var autoScrollAdapter : AutoScrollAdapter
    lateinit var about_card : CardView
    lateinit var access_card : CardView
    lateinit var order_card : CardView
    lateinit var data_card : CardView
    lateinit var sample_card : CardView
    lateinit var binding: ActivityMainBinding
    var premium = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)



        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.deep_green)
        }

        rv = findViewById(R.id.rv)
        autoScrollAdapter = AutoScrollAdapter(this)
        about_card = findViewById(R.id.about_card)
        access_card = findViewById(R.id.access_card)
        order_card = findViewById(R.id.order_card)
        data_card = findViewById(R.id.data_card)
        sample_card = findViewById(R.id.sample_card)



        binding.logout.setOnClickListener {
            showDialog("Logout","Do you want to logout?")
        }

        about_card.setOnClickListener {
            startActivity(Intent(this,AboutActivity::class.java))
        }

        access_card.setOnClickListener {
            startActivityForResult(Intent(this,AccessActivity::class.java),1)
        }

        order_card.setOnClickListener {
            startActivity(Intent(this,PlaceOrderActivity::class.java))
        }

        sample_card.setOnClickListener {
            startActivity(Intent(this, DatabaseActivity::class.java))
        }

        setRecyclerView()
    }

    private fun showDialog(title : String, sub_title : String) {
        val dialog : Dialog = Dialog(this)

        //Title added in custom already
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)

        dialog.setContentView(R.layout.dialog_layout)


        val heading = dialog.findViewById<TextView>(R.id.heading)
        val sub_heading = dialog.findViewById<TextView>(R.id.sub_heading)
        val negative = dialog.findViewById<TextView>(R.id.negative)
        val positive = dialog.findViewById<TextView>(R.id.positive)

        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialog.window!!.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT
        lp.gravity = Gravity.CENTER

        heading.text = title
        sub_heading.text = sub_title

        if(title=="Exit"){
            positive.setOnClickListener {
                finish()
            }
        }else{
            positive.setOnClickListener {
                val editor = getSharedPreferences("Paid", MODE_PRIVATE).edit()
                editor.putBoolean("Premium",false)
                editor.apply()
                onResume()
                dialog.dismiss()
            }
        }


        negative.setOnClickListener {
            dialog.dismiss()
        }


        dialog.show()
        dialog.window!!.attributes = lp
        dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)

    }

    private fun setRecyclerView() {
        rv.adapter = autoScrollAdapter
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv)
        val timer = Timer()
        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv.layoutManager = linearLayoutManager
        timer.schedule(object : TimerTask() {
            override fun run() {
                if (linearLayoutManager.findLastVisibleItemPosition() < (autoScrollAdapter.itemCount-1)){
                    linearLayoutManager.smoothScrollToPosition(rv,RecyclerView.State(),linearLayoutManager.findLastVisibleItemPosition()+1)

                }else if(linearLayoutManager.findLastVisibleItemPosition() == (autoScrollAdapter.itemCount-1)){
                    linearLayoutManager.smoothScrollToPosition(rv,RecyclerView.State(),0)
                }
            }

        },0,3000)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey()

            //moveTaskToBack(false);

            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    private fun exitByBackKey() {
        showDialog("Exit","Do you want to exit from app?")
    }

    override fun onResume() {
        super.onResume()
        val pref = getSharedPreferences("Paid", MODE_PRIVATE)
        premium = pref.getBoolean("Premium",false)
        if(premium){
            binding.logout.visibility = View.VISIBLE
            binding.accessCard.visibility = View.GONE
            binding.sampleText.text = "Database"
            binding.sampleImage.setImageResource(R.drawable.ic_database)
        }else{
            binding.logout.visibility = View.GONE
            binding.accessCard.visibility = View.VISIBLE
            binding.sampleText.text = "Try a sample"
            binding.sampleImage.setImageResource(R.drawable.ic_sample)
        }
    }

}