package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick
import com.example.naturalopinion.databinding.ActivityVitamBinding

class VitamActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var vitamin_recycler : RecyclerView
    lateinit var vitamin_adapter : MedicalAdapter
    lateinit var mineral_adapter : MedicalAdapter
    lateinit var back_button : ImageView
    lateinit var binding : ActivityVitamBinding
    var vitamin_status = true
    val vitamin_item : ArrayList<String> = ArrayList()
    val mineral_item : ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVitamBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.deep_green)
        }




        vitamin_item.add("Vitamin A (Retinol)")
        vitamin_item.add("Beta Carotene (Carotenoids)")
        vitamin_item.add("Vitamin B1 (Thiamine)")
        vitamin_item.add("Vitamin B2 (Riboflavin)")
        vitamin_item.add("Vitamin B3 (Niacin)")
        vitamin_item.add("Vitamin B5 (Pantothenic Acid)")
        vitamin_item.add("Vitamin B6 (Pyridoxine)")
        vitamin_item.add("Vitamin B12 (Cobalamin)")
        vitamin_item.add("Biotin")
        vitamin_item.add("Folate")
        vitamin_item.add("Choline (Lecithin)")
        vitamin_item.add("Inositol")
        vitamin_item.add("PABA (Para-aminobenzoic Acid)")
        vitamin_item.add("Vitamin C (Ascorbic Acid)")
        vitamin_item.add("Vitamin D (Cholecalciferol)")
        vitamin_item.add("Vitamin E (Tocopherol)")
        vitamin_item.add("Vitamin K (Quinones)")

        mineral_item.add("Boron")
        mineral_item.add("Calcium")
        mineral_item.add("Chromium")
        mineral_item.add("Cobalt")
        mineral_item.add("Copper")
        mineral_item.add("Germanium")
        mineral_item.add("Iodine")
        mineral_item.add("Iron")
        mineral_item.add("Lithium")
        mineral_item.add("Magnesium")
        mineral_item.add("Manganese")
        mineral_item.add("Molybdenum")
        mineral_item.add("Nickel")
        mineral_item.add("Phosphorus")
        mineral_item.add("Potassium")
        mineral_item.add("Selenium")
        mineral_item.add("Silicon")
        mineral_item.add("Sodium")
        mineral_item.add("Strontium")
        mineral_item.add("Tin")
        mineral_item.add("Vanadium")
        mineral_item.add("Zinc")

        back_button = findViewById(R.id.back_button_7)
        vitamin_recycler = findViewById(R.id.vitamin_recycler)
        vitamin_adapter = MedicalAdapter(this,false,this,vitamin_item,6)
        mineral_adapter = MedicalAdapter(this,false,this,mineral_item,9)
        vitamin_recycler.adapter = vitamin_adapter
        vitamin_recycler.layoutManager = LinearLayoutManager(this)


        binding.first.setOnClickListener { showVitamins() }
        binding.second.setOnClickListener { showMinerals() }




        //Finish Activity
        back_button.setOnClickListener { finish() }

    }

    private fun showVitamins() {
        vitamin_recycler.adapter = vitamin_adapter
        binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
        binding.first.strokeWidth = 0
        binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.deep_green)
        )
        binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
        binding.second.strokeWidth = 5
        binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))

        binding.headLine.text = "Vitamins"
        vitamin_status = true
    }

    private fun showMinerals() {
        vitamin_recycler.adapter = mineral_adapter

        binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
        binding.second.strokeWidth = 0
        binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.deep_green)
        )
        binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
        binding.first.strokeWidth = 5
        binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))

        binding.headLine.text = "Minerals"
        vitamin_status = false
    }


    override fun onItemCLick(position: Int) {
        if((position==6 && vitamin_status) || (!vitamin_status && position==9)){

            val intent = Intent(this, VitaminMineralDetailActivity::class.java)
            if(vitamin_status)
                intent.putExtra("heading",vitamin_item[position])
            else
                intent.putExtra("heading",mineral_item[position])

            startActivity(intent)
        }
    }
}