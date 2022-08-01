package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.WindowManager
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick
import com.example.naturalopinion.databinding.ActivityFoodAndNutritionBinding
import com.example.naturalopinion.databinding.ActivityMedicalConditionBinding

class FoodAndNutritionActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var food_recycler : RecyclerView
    lateinit var food_adapter : MedicalAdapter
    lateinit var back_button : ImageView
    val items = ArrayList<String>()
    val details = ArrayList<String>()
    var premium = false
    lateinit var binding: ActivityFoodAndNutritionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodAndNutritionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }

        val pref = getSharedPreferences("Paid", MODE_PRIVATE)
        premium = pref.getBoolean("Premium",false)

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

        binding.searchEdittext.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Do Nothing
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                filter(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {
                // Do Nothing
            }

        })

        food_adapter = MedicalAdapter(this,premium,this,items,2,details)
        food_recycler.adapter = food_adapter
        food_recycler.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemCLick(position: Int) {
        if(position==0&&premium){
            val intent = Intent(this,CleanisingDietActivity::class.java)
            startActivity(intent)
        } else if(position==1&&premium){
            val intent = Intent(this,FattyAcidActivity::class.java)
            startActivity(intent)
        }
        else if(position==2){
            val intent = Intent(this,FiberDetailActivity::class.java)
            startActivity(intent)
        }else if(position==3&&premium){
            val intent = Intent(this,PhysicalExamActivity::class.java)
            startActivity(intent)
        }else if(position==4&&premium){
            val intent = Intent(this,NutritionalTipsActivity::class.java)
            startActivity(intent)
        }else if(position==5&&premium){
            val intent = Intent(this,ProImmuneFood::class.java)
            startActivity(intent)
        }else if(position==6&&premium){
            val intent = Intent(this,HydroTherapyActivity::class.java)
            intent.putExtra("heading","Sulfite Sources")
            startActivity(intent)
        }
    }
    fun filter(text: String?) {
        val temp: MutableList<String> = ArrayList()
        val temp2 = ArrayList<String>()
        var index = 0
        for (d in items) {
            //or use .equal(text) with you want equal match
            //use .toLowerCase() for better matches
            if (d.lowercase().contains("$text".lowercase())) {
                temp.add(d)
                temp2.add(details[index])
            }
            index++
        }
        //update recyclerview
        food_adapter.updateList(temp,temp2)
    }
}