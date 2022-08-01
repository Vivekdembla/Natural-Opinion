package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick
import com.example.naturalopinion.databinding.ActivityClinicalListBinding

class ClinicalListActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var binding : ActivityClinicalListBinding
    lateinit var clinical_adapter : MedicalAdapter
    var list = ArrayList<String>()
    var prime = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClinicalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.white)

        val pref = getSharedPreferences("Paid", MODE_PRIVATE)
        prime = pref.getBoolean("Premium",false)

        list = intent.getStringArrayListExtra("heading")!!
        clinical_adapter = MedicalAdapter(this,prime,this,list,0)
        binding.clinicalListRv.adapter = clinical_adapter
        binding.clinicalListRv.layoutManager = LinearLayoutManager(this)

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

        binding.backButton8.setOnClickListener { finish() }

    }

    override fun onItemCLick(position: Int) {
        if(prime||list[position] == "Allium sativum (Garlic)"){
            val intent = Intent(this,BotanicalDetailActivity::class.java)
            intent.putExtra("heading",list[position])
            startActivity(intent)
        }
    }
    fun filter(text: String?) {
        val temp: MutableList<String> = ArrayList()
        for (d in list) {
            //or use .equal(text) with you want equal match
            //use .toLowerCase() for better matches
            if (d.lowercase().contains("$text".lowercase())) {
                temp.add(d)
            }
        }
        //update recyclerview
        clinical_adapter.updateList(temp)
    }
}