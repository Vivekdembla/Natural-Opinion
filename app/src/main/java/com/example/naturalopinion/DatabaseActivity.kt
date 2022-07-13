package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.DatabaseAdapter

class DatabaseActivity : AppCompatActivity(), DatabaseAdapter.onDatabaseClick {
    lateinit var database_recycler_view : RecyclerView
    lateinit var database_adapter : DatabaseAdapter
    lateinit var back_button : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }


        database_recycler_view = findViewById(R.id.database_recycler)
        back_button = findViewById(R.id.back_button_4)
        database_adapter = DatabaseAdapter(this)

        //Finish Activity
        back_button.setOnClickListener { finish() }

        setRecyclerView()
    }

    private fun setRecyclerView() {
        database_recycler_view.adapter = database_adapter
        database_recycler_view.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemClick(position : Int) {
        when(position){
            0 -> {
                startActivity(Intent(this,MedicalConditionActivity::class.java))
            }
            1 -> {
                startActivity(Intent(this,VitamActivity::class.java))
            }
            2 -> {
                startActivity(Intent(this,FoodAndNutritionActivity::class.java))
            }
            3 -> {
                startActivity(Intent(this,BotanicalsActivity::class.java))
            }
            4 -> {
                startActivity(Intent(this,SupplimentActivity::class.java))
            }
            5 -> {
                startActivity(Intent(this,OtherTherapyActivity::class.java))
            }
        }
    }
}