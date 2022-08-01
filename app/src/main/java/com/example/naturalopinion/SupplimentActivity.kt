package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.WindowManager
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick
import com.example.naturalopinion.databinding.ActivitySupplimentBinding

class SupplimentActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var back_button : ImageView
    lateinit var supplement_adapter : MedicalAdapter
    lateinit var supplement_rv : RecyclerView
    var items = ArrayList<String>()
    var premium = false
    lateinit var binding : ActivitySupplimentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySupplimentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }
        back_button = findViewById(R.id.back_button_10)

        val pref = getSharedPreferences("Paid", MODE_PRIVATE)
        premium = pref.getBoolean("Premium",false)


        items.add("Acidophilus/Bifidus")
        items.add("Alanine")
        items.add("Amino Acids")
        items.add("Arginine")
        items.add("Bioflavonoids")
        items.add("Bromelain")
        items.add("Carnitine")
        items.add("Carnosine")
        items.add("Coenzyme Q10")
        items.add("Cystine")
        items.add("Dehydroepiandrosterone (DHEA)")
        items.add("Digestive Enzymes")
        items.add("Dimethyl Glycine (DMG)")
        items.add("Ethylenediaminetetraacetic acid (EDTA)")
        items.add("Fructooligosaccharides (FOS)")
        items.add("Fumaric Acid")
        items.add("Glandulars")
        items.add("Glucosamine Sulfate")
        items.add("Glutamic Acid")
        items.add("Glutamine")
        items.add("Glutathione")
        items.add("Glycine")
        items.add("Hydrochloric Acid")
        items.add("Lipoic Acid")
        items.add("Lysine")
        items.add("Melatonin")
        items.add("Methionine")
        items.add("Methylsufonylmethane (MSM)")
        items.add("N-Acetyl Cysteine")
        items.add("NADH")
        items.add("Phenylalanine")
        items.add("Phosphatidylserine")
        items.add("Proline")
        items.add("Pycnogenol")
        items.add("Red Yeast Rice")
        items.add("Quercetin")
        items.add("S-Adenosyl-L-Methionine (SAM)")
        items.add("Taurine")
        items.add("Tryptophan")
        items.add("Tyrosine")

        supplement_adapter = MedicalAdapter(this,premium,this,items,8)
        supplement_rv = findViewById(R.id.supplement_rv)
        supplement_rv.adapter = supplement_adapter
        supplement_rv.layoutManager = LinearLayoutManager(this)

        back_button.setOnClickListener { finish() }

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
        if(position==8||premium){
            val intent = Intent(this,SupplementDetailActivity::class.java)
            intent.putExtra("heading",items[position])
            startActivity(intent)
        }
    }
    fun filter(text: String?) {
        val temp: MutableList<String> = ArrayList()
        for (d in items) {
            //or use .equal(text) with you want equal match
            //use .toLowerCase() for better matches
            if (d.lowercase().contains("$text".lowercase())) {
                temp.add(d)
            }
        }
        //update recyclerview
        supplement_adapter!!.updateList(temp)
    }
}