package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick

class SupplimentActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var back_button : ImageView
    lateinit var supplement_adapter : MedicalAdapter
    lateinit var supplement_rv : RecyclerView
    var items = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suppliment)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }
        back_button = findViewById(R.id.back_button_10)

        val items = ArrayList<String>()


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

        supplement_adapter = MedicalAdapter(this,false,this,items,8)
        supplement_rv = findViewById(R.id.supplement_rv)
        supplement_rv.adapter = supplement_adapter
        supplement_rv.layoutManager = LinearLayoutManager(this)

        back_button.setOnClickListener { finish() }
    }

    override fun onItemCLick(position: Int) {
        if(position==4){
            val intent = Intent(this,SupplementDetailActivity::class.java)
            intent.putExtra("heading","Supplement")
            startActivity(intent)
        }
    }
}