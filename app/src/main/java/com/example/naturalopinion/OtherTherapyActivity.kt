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
import com.example.naturalopinion.databinding.ActivityCommonBinding
import com.example.naturalopinion.databinding.ActivityOtherTherapyBinding

class OtherTherapyActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var therapy_adapter : MedicalAdapter
    lateinit var binding: ActivityOtherTherapyBinding
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

        val hydro_items = ArrayList<String>()
        for(i in 1..16)
            hydro_items.add("Therapy")

        therapy_adapter = MedicalAdapter(this,false,this,hydro_items)
        binding.therapyRv.adapter = therapy_adapter
        binding.therapyRv.layoutManager = LinearLayoutManager(this)

        binding.first.setOnClickListener {
            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.second.strokeWidth = 5
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.third.strokeWidth = 5
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 0
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))


            binding.therapyRv.adapter = therapy_adapter
            binding.heading.text = "IV Therapies"
        }
        binding.second.setOnClickListener {
            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.first.strokeWidth = 5
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.third.strokeWidth = 5
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 0
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))

            binding.therapyRv.adapter = therapy_adapter
            binding.heading.text = "Hydo Therapy"
        }
        binding.third.setOnClickListener {
            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.second.strokeWidth = 5
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.first.strokeWidth = 5
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 0
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))

            binding.therapyRv.adapter = therapy_adapter
            binding.heading.text = "Homeopathy"
        }

        binding.backButton11.setOnClickListener { finish() }
    }

    override fun onItemCLick(position: Int) {
        if(position==4){
            val intent = Intent(this,Common_Activity::class.java)
            intent.putExtra("heading","Therapy")
            startActivity(intent)
        }

    }
}