package com.example.naturalopinion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.naturalopinion.databinding.ActivitySulphiteSourceBinding

class SulphiteSourceActivity : AppCompatActivity() {
    lateinit var binding : ActivitySulphiteSourceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySulphiteSourceBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}