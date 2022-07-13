package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick
import com.example.naturalopinion.databinding.ActivityClinicalListBinding

class ClinicalListActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var binding : ActivityClinicalListBinding
    lateinit var clinical_adapter : MedicalAdapter
    var list = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClinicalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = intent.getStringArrayListExtra("list")!!
        clinical_adapter = MedicalAdapter(this,false,this,list,0)
        binding.clinicalListRv.adapter = clinical_adapter
        binding.clinicalListRv.layoutManager = LinearLayoutManager(this)



    }

    override fun onItemCLick(position: Int) {
        if(list[position] == "Allium sativum (Garlic)"){
            val intent = Intent(this,BotanicalDetailActivity::class.java)
            intent.putExtra("heading",list[position])
            startActivity(intent)
        }
    }
}