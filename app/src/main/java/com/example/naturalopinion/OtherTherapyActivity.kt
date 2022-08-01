package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.WindowManager
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick
import com.example.naturalopinion.databinding.ActivityCommonBinding
import com.example.naturalopinion.databinding.ActivityOtherTherapyBinding

class OtherTherapyActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var hydro_therapy_adapter : MedicalAdapter
    lateinit var four_therapy_adapter : MedicalAdapter
    lateinit var overView : MedicalAdapter
    lateinit var binding: ActivityOtherTherapyBinding
    var status = 2
    val hydro_items = ArrayList<String>()
    val four_therapy_items = ArrayList<String>()
    val homeopathy_item = ArrayList<String>()
    var premium = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherTherapyBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.deep_green)
        }

        val pref = getSharedPreferences("Paid", MODE_PRIVATE)
        premium = pref.getBoolean("Premium",false)

        four_therapy_items.add("Abnormal Sulfur Metabolism")
        four_therapy_items.add("Acne")
        four_therapy_items.add("Alcoholism")
        four_therapy_items.add("Anti-Infection")
        four_therapy_items.add("Antiviral")
        four_therapy_items.add("Arrhythmia")
        four_therapy_items.add("Asthma")
        four_therapy_items.add("Celiac Disease")
        four_therapy_items.add("Congestive Heart Failure")
        four_therapy_items.add("Crohn's Disease")
        four_therapy_items.add("Diabetes")
        four_therapy_items.add("Glaucoma")
        four_therapy_items.add("Hepatitis")
        four_therapy_items.add("Hypertension")
        four_therapy_items.add("Macular Degeneration")
        four_therapy_items.add("Migraine Headaches")
        four_therapy_items.add("IV Migraine Push")
        four_therapy_items.add("Multiple Sclerosis")
        four_therapy_items.add("Nausea/Vomiting of Pregnancy")
        four_therapy_items.add("Stroke")
        four_therapy_items.add("Tonic Therapy")
        four_therapy_items.add("Trace Minerals")
        four_therapy_items.add("Vitamins/Minerals/Amino Acids")
        four_therapy_items.add("WBC Stimulation")

        homeopathy_item.add("Overview")

        hydro_items.add("Continuous Bath")
        hydro_items.add("Constitutional Hydrotherapy")
        hydro_items.add("Enemas")
        hydro_items.add("Heating Compress")
        hydro_items.add("Poultices")
        hydro_items.add("Sitz Bath")

        hydro_therapy_adapter = MedicalAdapter(this,premium,this,hydro_items,1)
        four_therapy_adapter = MedicalAdapter(this,premium,this,four_therapy_items,17)
        overView = MedicalAdapter(this,premium,this,homeopathy_item,0)

        binding.therapyRv.adapter = hydro_therapy_adapter
        binding.therapyRv.layoutManager = LinearLayoutManager(this)

        binding.first.setOnClickListener {
            status = 1
            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.second.strokeWidth = 5
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.third.strokeWidth = 5
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 0
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))


            binding.therapyRv.adapter = four_therapy_adapter
            binding.heading.text = "IV Therapies"
        }
        binding.second.setOnClickListener {
            status = 2
            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.first.strokeWidth = 5
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.third.strokeWidth = 5
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 0
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))

            binding.therapyRv.adapter = hydro_therapy_adapter
            binding.heading.text = "Hydo Therapy"
        }
        binding.third.setOnClickListener {
            status = 3
            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.second.strokeWidth = 5
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.first.strokeWidth = 5
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 0
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))

            binding.therapyRv.adapter = overView
            binding.heading.text = "Homeopathy"
        }

        binding.backButton11.setOnClickListener { finish() }

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
    }

    override fun onItemCLick(position: Int) {
        if(status == 1){
            if(position==17||premium){
                val intent = Intent(this,FourTherapyActivity::class.java)
                intent.putExtra("heading",four_therapy_items[position])
                startActivity(intent)
            }
        }else if(status==2){
            if(position==1||premium){
                val intent = Intent(this,HydroTherapyActivity::class.java)
                intent.putExtra("heading",hydro_items[position])
                startActivity(intent)
            }
        }else{
            val intent = Intent(this,HydroTherapyActivity::class.java)
            intent.putExtra("heading","Homeopathy")
            startActivity(intent)
        }


    }
    fun filter(text: String?) {
        val temp: MutableList<String> = ArrayList()
        if(status==1){
            for (d in four_therapy_items) {
                //or use .equal(text) with you want equal match
                //use .toLowerCase() for better matches
                if (d.lowercase().contains("$text".lowercase())) {
                    temp.add(d)
                }
            }
            //update recyclerview
            four_therapy_adapter.updateList(temp)
        }else if(status==2){
            for (d in hydro_items) {
                //or use .equal(text) with you want equal match
                //use .toLowerCase() for better matches
                if (d.lowercase().contains("$text".lowercase())) {
                    temp.add(d)
                }
            }
            //update recyclerview
            hydro_therapy_adapter.updateList(temp)
        }else{
            for (d in homeopathy_item) {
                //or use .equal(text) with you want equal match
                //use .toLowerCase() for better matches
                if (d.lowercase().contains("$text".lowercase())) {
                    temp.add(d)
                }
            }
            //update recyclerview
            overView.updateList(temp)
        }

    }
}