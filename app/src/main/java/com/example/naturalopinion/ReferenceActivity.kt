package com.example.naturalopinion

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.naturalopinion.Adapter.ReferenceAdapter
import com.example.naturalopinion.databinding.ActivityReferenceBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import referenceData1

class ReferenceActivity : AppCompatActivity() {
    lateinit var binding : ActivityReferenceBinding
    var heading = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReferenceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.deep_green)
        }

        binding.backButton.setOnClickListener { finish() }

        heading = intent.getStringExtra("heading").toString()

        setData(heading)

    }

    private fun setData(heading: String?) {
        binding.referenceRv.layoutManager = LinearLayoutManager(this)
        GlobalScope.launch(Dispatchers.IO) {
            var list = referenceData1(heading!!)
            if(list.isEmpty()){
                list = referenceData2(heading)
            }
            if(list.isEmpty()){
                list = referenceData3(heading)
            }
            withContext(Dispatchers.Main){
                binding.referenceRv.adapter = ReferenceAdapter(list)
            }
        }
    }
}