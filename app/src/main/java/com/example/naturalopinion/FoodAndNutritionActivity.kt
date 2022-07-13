package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.DatabaseAdapter
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick

class FoodAndNutritionActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var food_recycler : RecyclerView
    lateinit var food_adapter : MedicalAdapter
    lateinit var back_button : ImageView
    val items = ArrayList<String>()
    val details = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_and_nutrition)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }

        food_recycler = findViewById<RecyclerView>(R.id.food_rv)
        back_button = findViewById(R.id.back_button_8)
        back_button.setOnClickListener { finish() }
            items.add("Cleansing Diet")
            items.add("Essential Fatty Acids")
            items.add("Fiber")
            items.add("Nutritional Physical Exam")
            items.add("Nutritional Tips")
            items.add("Pro-immunity Foods")
            items.add("Sulfite Sources")

            details.add("What to eat and when, how much and in what form; what foods to avoid.")
            details.add("Supplementary Form, Labs, Indications, Physiological Therapeutics, Adverse Reactions and Toxicity, and Drug/Nutrient Interactions.")
            details.add("Supplementary Form, Labs, Indications, Physiological Therapeutics, Adverse Reactions and Toxicity, and Drug/Nutrient Interactions.")
            details.add("Observable characteristics that may be seen on a physical examination of the body that indicate or suggest potential nutritional deficiencies.")
            details.add("Simple, understandable explanation for bringing about an attitude shift toward food and eating habits. Excellent primer to print out for your patients.")
            details.add("Pro-immunity and anti-immunity foods, for patients who need to strengthen their natural immunity systems.")
            details.add("Sources of sulfites in foods and beverages for those especially sensitive to this kind of toxicity.")

        food_adapter = MedicalAdapter(this,false,this,items,2,details)
        food_recycler.adapter = food_adapter
        food_recycler.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemCLick(position: Int) {
        if(position==2){
            val intent = Intent(this,FiberDetailActivity::class.java)
            startActivity(intent)
        }
    }
}