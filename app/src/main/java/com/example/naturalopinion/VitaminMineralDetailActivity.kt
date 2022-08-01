package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityVitaminMineralDetailBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class VitaminMineralDetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityVitaminMineralDetailBinding
    var heading : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVitaminMineralDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contentData.movementMethod = LinkMovementMethod.getInstance()

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        heading = intent.getStringExtra("heading").toString()
        setRequiredButton(heading)
        setRequirement(heading)



        binding.vitaminMineralName.text = heading

        binding.backButton6.setOnClickListener { finish() }
        binding.first.setOnClickListener {
            setRequirement(heading)

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.first.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5

            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

        }
        binding.second.setOnClickListener {
            setSuppliment(heading)

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.second.strokeWidth = 0

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5

            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

        }
        binding.third.setOnClickListener {
            setLabs(heading)

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.third.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5


            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

        }
        binding.forth.setOnClickListener {
            setFoodSource(heading)

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.forth.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5


            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

        }
        binding.fifth.setOnClickListener {
            setDeficiency(heading)

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.fifth.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5


            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

        }
        binding.sixth.setOnClickListener {
            setCauseDeficency(heading)

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.sixth.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5

            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5


        }
        binding.seventh.setOnClickListener {
            setAdverseEffect(heading)

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.seventh.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

        }
        binding.eight.setOnClickListener {
            setDrug(heading)

            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.eight.strokeWidth = 0

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

        }
        binding.nine.setOnClickListener {
            setBioChemical(heading)

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.nine.strokeWidth = 0

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5

            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

        }
        binding.ten.setOnClickListener {
            setBioChemical(heading)

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.ten.strokeWidth = 0

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5

            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

        }
        binding.eleven.setOnClickListener {
            setClinicalIndication(heading)

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.eleven.strokeWidth = 0

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.third.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.sixth.strokeWidth = 5

            binding.seventh.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.seventhText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.seventh.strokeWidth = 5

            binding.eight.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.eightText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eight.strokeWidth = 5

            binding.nine.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.nineText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.nine.strokeWidth = 5

        }

        binding.reference.setOnClickListener {
            val intent = Intent(this,HydroTherapyActivity::class.java)
            intent.putExtra("heading","Reference")
            startActivity(intent)
        }

    }

    private fun setRequiredButton(heading: String) {
        when(heading){
            "PABA (Para-aminobenzoic Acid)" -> {
                binding.third.visibility = View.GONE
                binding.sixth.visibility = View.GONE
            }
            "Boron"->{
                binding.third.visibility = View.GONE
            }
            "Chromium" -> {
                binding.third.visibility  = View.GONE
            }
            "Cobalt" -> {
                binding.third.visibility  = View.GONE
            }
            "Copper" -> {
                binding.eight.visibility = View.VISIBLE
            }
            "Germanium" -> {
                binding.third.visibility = View.GONE
            }
            "Iodine" -> {
                binding.third.visibility = View.GONE
            }
            "Iron" ->{
                binding.third.visibility = View.GONE
            }
            "Lithium" -> {
                binding.third.visibility = View.GONE
            }
            "Nickel" -> {
                binding.thirdText.text = "Deficiency"
            }
            "Phosphorus" -> {
                binding.thirdText.text = "Deficiency"
            }
            "Sodium" -> {
                binding.third.visibility = View.GONE
            }
            "Tin" -> {
                binding.third.visibility = View.GONE
            }
            "Vanadium" -> {
                binding.third.visibility = View.GONE
            }
            "Beta Carotene (Carotenoids)" -> {
                binding.firstText.text = "Description"
                binding.forthText.text = "Provitamin A Carotenoid Food Sources"
                binding.fifthText.text = "Nonprovitamin A Carotenoid Food Sources"
            }
            "Vitamin B3 (Niacin)" -> {
                binding.third.visibility = View.GONE
                binding.eight.visibility = View.VISIBLE
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                binding.fifthText.text = "Deficiency"
            }
            "Choline (Lecithin)" -> {
                binding.sixth.visibility = View.GONE
            }
            "Inositol" -> {
                binding.third.visibility = View.GONE
                binding.forth.visibility = View.GONE
                binding.sixth.visibility = View.GONE
            }
            "Vitamin E (Tocopherol)" -> {
                binding.second.visibility = View.GONE
            }
            "Vitamin K (Quinones)" -> {
                val text = "K1-Phytonadione - from plants\n" +
                        "K2-Menaquinone - from bacteria in intestines\n" +
                        "K3-Menadione - synthetic"
                val ss = SpannableString(text)
                makeBold(ss,text,"K1-Phytonadione - from plants\n" +
                        "K2-Menaquinone - from bacteria in intestines\n" +
                        "K3-Menadione - synthetic")
                binding.conditionDetail.text = ss
            }
        }
    }

    private fun setClinicalIndication(heading: String) {
        binding.subHeading.text = "Clinical Indications"
        var text = ""
        when(heading){
            "Manganese" -> {
                text = "• Atherosclerosis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Diabetes mellitus\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoporosis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Epilepsy\n" +
                        "• Maintenance of cartilage integrity\n" +
                        "• Myasthenia gravis\n" +
                        "• Seizure prevention"
            }
            "Boron"->{
                text = "• Osteoarthritis\n" +
                        "• Osteoporosis"
            }
            "Calcium" -> {
                text = "• Anorexia nervosa\n" +
                        "• Atherosclerosis\n" +
                        "• Attention deficit disorder\n" +
                        "• Autism\n" +
                        "• Cancer prevention\n" +
                        "• Cholecystitis\n" +
                        "• Congestive heart failure\n" +
                        "• Depression\n" +
                        "• Diabetes mellitus\n" +
                        "• Dysmenorrhea\n" +
                        "• Endometriosis\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Fibromyalgia\n" +
                        "• Gout\n" +
                        "• Headaches\n" +
                        "• Hypertension (except when patient is asthmatic)\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Memory loss\n" +
                        "• Menopause\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoarthritis\n" +
                        "• Osteoporosis\n" +
                        "• Parkinson's disease\n" +
                        "• PMS\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Anxiety\n" +
                        "• Colon cancer\n" +
                        "• Delusions\n" +
                        "• Hypercholesterolemia\n" +
                        "• Hypertriglyceridemia\n" +
                        "• Leg cramps - pregnancy, restless leg syndrome\n" +
                        "• Periodontal disease\n" +
                        "• Prevention of calcium oxalate kidney stones (calcium reduces absorption of oxalate)\n" +
                        "• Psychosis"
            }
            "Chromium" -> {
                text = "• Atherosclerosis\n" +
                        "• Diabetes mellitus\n" +
                        "• Obesity\n" +
                        "• Hypercholesterolemia\n" +
                        "• Hyperglycemia\n" +
                        "• Hypoglycemia"
            }
            "Cobalt" -> {
                text = "• Hypertension"
            }
            "Copper" -> {
                text = "• Aging prevention - to be used with zinc\n" +
                        "• AIDS\n" +
                        "• Allergies - to be used with zinc\n" +
                        "• Amenorrhea\n" +
                        "• Anorexia nervosa\n" +
                        "• Aphthous stomatitis - to be used with zinc\n" +
                        "• Atherosclerosis - to be used with zinc\n" +
                        "• Benign prostatic hypertrophy (BPH) - to be used with zinc\n" +
                        "• Bronchitis - to be used with zinc\n" +
                        "• Cancer prevention - to be used with zinc\n" +
                        "• Candidiasis - to be used with zinc\n" +
                        "• Cataract prevention - to be used with zinc\n" +
                        "• Chronic fatigue syndrome - to be used with zinc\n" +
                        "• Crohn's disease - to be used with zinc\n" +
                        "• Diabetes mellitus - to be used with zinc\n" +
                        "• Eczema - to be used with zinc\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibrocystic breast disease - to be used with zinc\n" +
                        "• Fibromyalgia - to be used with zinc\n" +
                        "• Hemorrhoids - to be used with zinc\n" +
                        "• Hepatitis - to be used with zinc\n" +
                        "• Herpes simplex - to be used with zinc\n" +
                        "• Hypothyroidism - to be used with zinc\n" +
                        "• Impotence - to be used with zinc\n" +
                        "• Irritable bowel syndrome - to be used with zinc\n" +
                        "• Macular degeneration - to be used with zinc\n" +
                        "• Mastitis - to be used with zinc\n" +
                        "• Multiple sclerosis - to be used with zinc\n" +
                        "• Osteoarthritis - to be used with zinc\n" +
                        "• Osteoporosis - to be used with zinc\n" +
                        "• Otitis media - to be used with zinc\n" +
                        "• Peptic ulcer - to be used with zinc\n" +
                        "• PMS - to be used with zinc\n" +
                        "• Psoriasis - to be used with zinc\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Rosacea - to be used with zinc\n" +
                        "• Schizophrenia\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Ulcerative colitis - to be used with zinc\n" +
                        "• Uterine fibroid - to be used with zinc\n" +
                        "• Aortic aneurysm\n" +
                        "• Bone healing\n" +
                        "• Cardiovascular diseases\n" +
                        "• Neutropenia\n" +
                        "• Vitiligo"
            }
            "Germanium" -> {
                text = "• Immunity\n" +
                        "• Some organic germanium compounds may possess antitumor properties"
            }
            "Iodine" -> {
                text = "• Asthma: use as a mucolytic agent and expectorant\n" +
                        "• Atherosclerosis\n" +
                        "• Bronchitis: use as a mucolytic agent and expectorant\n" +
                        "• Fibrocystic breast disease: paint the cervix with iodine\n" +
                        "• Multiple sclerosis\n" +
                        "• PMS\n" +
                        "• Antiviral, antibacterial, antifungal: use with immune suppressed patients\n" +
                        "• Consider with: breast, ovarian, and endometrial cancers\n" +
                        "• Dupuytren's contracture: topically with arnica oil and DMSO\n" +
                        "• Estrogen metabolism\n" +
                        "• Goiter: large chronic goiter may require thyroid hormones; less chronic: 300 - 600 mcg./day\n" +
                        "• Hyperthyroidism: 300 - 900 mcg./day\n" +
                        "• Keloid: topically with arnica oil and DMSO\n" +
                        "• Lymphatic stasis: use both orally and topically to soften tissue\n" +
                        "• Peyronie's disease: topically with arnica oil and DMSO\n" +
                        "• Salivary duct stone dissolution: SSKI 7 - 10 drops TID for 1 - 2 weeks\n" +
                        "• Sarcoidosis\n" +
                        "• Sebaceous cysts: use both orally and topically to soften tissue"
            }
            "Iron" ->{
                text = "• Candidiasis\n" +
                        "• Fertility/Infertility\n" +
                        "• Anemia\n" +
                        "• Decreased immune function\n" +
                        "• Menorrhagia\n" +
                        "• Restless leg syndrome"
            }
            "Lithium" -> {
                text =  "• Herpes simplex\n" +
                        "• Nutritional therapy (5 - 10 mg./day of elemental lithium):\n" +
                        "• Depression\n" +
                        "• PMS\n" +
                        "• Idiopathic neutropenia\n" +
                        "• Pharmacological therapy (300 - 900 mg./day of lithium carbonate):\n" +
                        "• Asthma\n" +
                        "• Bipolar disorder\n" +
                        "• Cluster headaches\n" +
                        "• Gout\n" +
                        "• Alcohol recidivism\n" +
                        "• Hyperthyroidism (use with iodine)\n" +
                        "• Uric acid kidney stones"
            }
            "Magnesium" -> {
                text =  "• Alzheimer's disease\n" +
                        "• Asthma\n" +
                        "• Atherosclerosis\n" +
                        "• Attention deficit disorder\n" +
                        "• Autism\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Cholecystitis\n" +
                        "• Chronic fatigue syndrome - IM or IV\n" +
                        "• Congestive heart failure\n" +
                        "• Constipation\n" +
                        "• Crohn's disease\n" +
                        "• Depression\n" +
                        "• Diabetes mellitus\n" +
                        "• Dysmenorrhea\n" +
                        "• Endometriosis\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Fibromyalgia\n" +
                        "• Headaches\n" +
                        "• Hypertension\n" +
                        "• Insomnia\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Menopause\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoarthritis\n" +
                        "• Osteoporosis\n" +
                        "• Parkinson's disease\n" +
                        "• PMS\n" +
                        "• Psoriasis\n" +
                        "• Schizophrenia\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Ulcerative colitis\n" +
                        "• Anxiety\n" +
                        "• Chronic lung disease\n" +
                        "• Kidney stones - calcium oxalate\n" +
                        "• Migraine\n" +
                        "• Mitral valve prolapse\n" +
                        "• Reactive hypoglycemia\n" +
                        "• Stops false labor\n" +
                        "• Toxemia of pregnancy"
            }
            "Molybdenum" -> {
                text =  "• Asthma\n" +
                        "• Atherosclerosis\n" +
                        "• Cancer prevention, esp. esophageal cancer\n" +
                        "• Dental carries prevention\n" +
                        "• Hypouricemia\n" +
                        "• Rheumatism\n" +
                        "• Wilson's syndrome"
            }
            "Nickel" -> {
                text =  "• No therapeutic indications known"
            }
            "Phosphorus" -> {
                text =  "• Rarely indicated for any pathological condition except hypophosphatemia"
            }
            "Potassium" -> {
                text =  "• Bipolar disorder\n" +
                        "• Congestive heart failure\n" +
                        "• Depression\n" +
                        "• Diabetes mellitus\n" +
                        "• Hypertension\n" +
                        "• Arrhythmias"
            }
            "Selenium" -> {
                text =  "• Aging prevention\n" +
                        "• AIDS\n" +
                        "• Allergies\n" +
                        "• Asthma\n" +
                        "• Atherosclerosis\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Bronchitis\n" +
                        "• Cancer prevention\n" +
                        "• Candidiasis\n" +
                        "• Cataract prevention\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Crohn's disease\n" +
                        "• Eczema\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Fibromyalgia\n" +
                        "• Gout\n" +
                        "• Hemorrhoids\n" +
                        "• Hepatitis\n" +
                        "• Macular degeneration\n" +
                        "• Mastitis\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoarthritis\n" +
                        "• Otitis media\n" +
                        "• Parkinson's disease\n" +
                        "• Peptic ulcer\n" +
                        "• PMS\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Schizophrenia\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Uterine fibroid\n" +
                        "• Acne\n" +
                        "• Atopic dermatitis\n" +
                        "• Cancer\n" +
                        "• Cervical dysplasia\n" +
                        "• Impaired cellular and humoral immunity\n" +
                        "• Muscular dystrophy\n" +
                        "• Osgood-Schlatter's disease (chondromalacia) used in combination with vitamin E as an anti-inflammatory"
            }
            "Silicon" -> {
                text =  "• Atherosclerosis\n" +
                        "• Osteoporosis\n" +
                        "• Strengthen hair\n" +
                        "• Strengthen nails"
            }
            "Sodium" -> {
                text =  "• May be useful in some cases of hypotension"
            }
            "Strontium" -> {
                text =  "• Osteoporosis\n" +
                        "• Dental caries"
            }
            "Tin" -> {
                text =  "• None known"
            }
            "Vanadium" -> {
                text =  "• Atherosclerosis\n" +
                        "• Diabetes mellitus"
            }
            "Zinc" -> {
                text =  "• Aging prevention\n" +
                        "• AIDS\n" +
                        "• Allergies\n" +
                        "• Alzheimer's disease\n" +
                        "• Amenorrhea\n" +
                        "• Anorexia nervosa\n" +
                        "• Aphthous stomatitis\n" +
                        "• Atherosclerosis\n" +
                        "• Attention deficit disorder\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Bronchitis\n" +
                        "• Cancer prevention\n" +
                        "• Candidiasis\n" +
                        "• Cataract prevention\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Crohn's disease\n" +
                        "• Diabetes mellitus\n" +
                        "• Eczema\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Fibromyalgia\n" +
                        "• Hemorrhoids\n" +
                        "• Hepatitis\n" +
                        "• Herpes simplex\n" +
                        "• Hypothyroidism\n" +
                        "• Impotence\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Macular degeneration\n" +
                        "• Mastitis\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoarthritis\n" +
                        "• Osteoporosis\n" +
                        "• Otitis media\n" +
                        "• Parkinson's disease\n" +
                        "• Peptic ulcer\n" +
                        "• PMS\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Rosacea\n" +
                        "• Schizophrenia\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Ulcerative colitis\n" +
                        "• Uterine Fibroid\n" +
                        "• Acne\n" +
                        "• Alcoholism\n" +
                        "• Atopic dermatitis\n" +
                        "• Cancer\n" +
                        "• Colds\n" +
                        "• Furuncles\n" +
                        "• Growth retardation\n" +
                        "• Heavy metal toxicity\n" +
                        "• Male infertility\n" +
                        "• Pica\n" +
                        "• Post surgery/post-injury wound healing\n" +
                        "• Psoriatic arthritis\n" +
                        "• Prostate problems\n" +
                        "• Resistance to thyroid hormone\n" +
                        "• Tinnitis"
            }
            "Vitamin A (Retinol)" -> {
                text =  "• Aging prevention\n" +
                        "• Amenorrhea\n" +
                        "• Bronchitis\n" +
                        "• Candidiasis\n" +
                        "• Cholecystitis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Crohn's disease\n" +
                        "• Cystitis\n" +
                        "• Eczema\n" +
                        "• Hemorrhoids\n" +
                        "• Hypothyroidism\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Mastitis\n" +
                        "• Osteoarthritis\n" +
                        "• Osteoporosis\n" +
                        "• Otitis media\n" +
                        "• Peptic ulcer\n" +
                        "• PMS\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rosacea\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Ulcerative colitis\n" +
                        "• Acne\n" +
                        "• Cancers which involve epithelial tissues - skin, lung, bladder, cervical, breast\n" +
                        "• Cervical dysplasia\n" +
                        "• Enhance immunity\n" +
                        "• Gastrointestinal - peptic ulcer, inflammatory bowel disease\n" +
                        "• Infections\n" +
                        "• Menorrhagia\n" +
                        "• Sicca\n" +
                        "• Systemic lupus erythematosus"
            }
            "Beta Carotene (Carotenoids)" -> {
                text =  "• Aging prevention\n" +
                        "• AIDS\n" +
                        "• Alzheimer's disease\n" +
                        "• Asthma\n" +
                        "• Atherosclerosis\n" +
                        "• Bronchitis\n" +
                        "• Cancer prevention\n" +
                        "• Candidiasis\n" +
                        "• Cataract prevention\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Eczema\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Macular degeneration\n" +
                        "• Otitis media\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Uterine fibroid\n" +
                        "• Cancers - uterine,vaginal, cervical, lung, skin, and cancers of the gastrointestinal tract\n" +
                        "• Cardiovascular disease\n" +
                        "• Discoid lupus erythematosis\n" +
                        "• Erythropoietic protoporphyria\n" +
                        "• Polymorphous light\n" +
                        "• Solar urticaria"
            }
            "Vitamin B1 (Thiamine)" -> {
                text =  "• Alzheimer's disease\n" +
                        "• Cataract prevention\n" +
                        "• Depression\n" +
                        "• Diabetes mellitus\n" +
                        "• Insomnia\n" +
                        "• Memory loss\n" +
                        "• Multiple sclerosis\n" +
                        "• Schizophrenia\n" +
                        "• Alcoholism\n" +
                        "• Anemia\n" +
                        "• Anxiety\n" +
                        "• Bell's palsy - IM thiamine and vitamin B12\n" +
                        "• Diabetic sensory neuropathy\n" +
                        "• Glaucoma\n" +
                        "• Neurosis\n" +
                        "• Sciatic neuritis - IM thiamine and vitamin B12\n" +
                        "• Trigeminal neuralgia - IM thiamine and vitamin B12\n" +
                        "• Varicella zoster - IM thiamine and vitamin B12"
            }
            "Vitamin B2 (Riboflavin)" -> {
                text =  "• Cataract prevention\n" +
                        "• Depression\n" +
                        "• Headaches\n" +
                        "• Hypothyroidism\n" +
                        "• Macular degeneration prevention\n" +
                        "• Rosacea\n" +
                        "• Schizophrenia\n" +
                        "• Anemia"
            }
            "Vitamin B3 (Niacin)" -> {
                text =  "• Atherosclerosis\n" +
                        "• Attention deficit disorder - niacinamide\n" +
                        "• Depression - niacinamide\n" +
                        "• Diabetes mellitus\n" +
                        "• Dysmenorrhea\n" +
                        "• Headaches\n" +
                        "• Hypothyroidism\n" +
                        "• Impotence\n" +
                        "• Memory loss\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoarthritis - niacinamide\n" +
                        "• PMS\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Alcoholism - niacinamide\n" +
                        "• Anxiety\n" +
                        "• Bell's palsy\n" +
                        "• Hypercholesterolemia - niacin\n" +
                        "• Hyperglycemia - niacin and chromium together\n" +
                        "• Hyperlipidemia - niacin\n" +
                        "• Hypoglycemia - niacinamide\n" +
                        "• Insomnia\n" +
                        "• May prevent loss of pancreatic beta cells in early stages of type I diabetes - niacinamide\n" +
                        "• Migraine - must use at the beginning of the headache\n" +
                        "• Raynaud's syndrome\n" +
                        "• Schizophrenia\n" +
                        "• Smoking cessation\n" +
                        "• Trigeminal neuralgia"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text =  "• Allergies\n" +
                        "• Atherosclerosis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Constipation\n" +
                        "• Depression\n" +
                        "• Eczema\n" +
                        "• Osteoarthritis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Anemia\n" +
                        "• Anxiety\n" +
                        "• Contact dermatitis\n" +
                        "• Hypoadrenalism\n" +
                        "• Stress\n" +
                        "• Surgery - promotes wound healing and prevents ileus\n" +
                        "• Systemic lupus erythematosus"
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text =  "• Anorexia nervosa\n" +
                        "• Asthma\n" +
                        "• Atherosclerosis prevention\n" +
                        "• Attention deficit disorder\n" +
                        "• Autism\n" +
                        "• Bipolar disorder\n" +
                        "• BPH\n" +
                        "• Bronchitis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Depression\n" +
                        "• Diabetes mellitus\n" +
                        "• Dysmenorrhea\n" +
                        "• Endometriosis\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Fibromyalgia\n" +
                        "• Hypertension\n" +
                        "• Hypothyroidism\n" +
                        "• Memory loss\n" +
                        "• Menopause\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoarthritis\n" +
                        "• Osteoporosis prevention\n" +
                        "• Parkinson's disease\n" +
                        "• PMS\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rosacea\n" +
                        "• Schizophrenia\n" +
                        "• Acne\n" +
                        "• Anemia (inherited sideroblastic anemia)\n" +
                        "• Nausea of pregnancy\n" +
                        "• Prevention of intrauterine growth retardation\n" +
                        "• Prevention of cleft palate or other birth defects\n" +
                        "• Calcium oxalate kidney stones\n" +
                        "• Carpal tunnel syndrome\n" +
                        "• Dementia\n" +
                        "• Depression associated with oral contraceptives\n" +
                        "• Diabetic neuropathy\n" +
                        "• Hyperkinetic behavior\n" +
                        "• Infant seizures\n" +
                        "• MSG sensitivity\n" +
                        "• Prevention of polymorphous light eruptions\n" +
                        "• Rheumatism\n" +
                        "• Seborrheic dermatitis\n" +
                        "• Sickle cell anemia\n" +
                        "• Tardive dyskinesia\n" +
                        "• Toxemia of pregnancy"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text =  "• Aging prevention\n" +
                        "• AIDS\n" +
                        "• Allergies\n" +
                        "• Alzheimer's disease\n" +
                        "• Aphthous stomatitis\n" +
                        "• Asthma\n" +
                        "• Bipolar disorder\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Crohn's disease\n" +
                        "• Depression\n" +
                        "• Endometriosis\n" +
                        "• Fertility/Infertility\n" +
                        "• Hepatitis\n" +
                        "• Incontinence\n" +
                        "• Insomnia\n" +
                        "• Memory loss\n" +
                        "• Migraine headaches\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoarthritis\n" +
                        "• Osteoporosis\n" +
                        "• Parkinson's disease\n" +
                        "• Peptic ulcer\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Ulcerative colitis\n" +
                        "• Acne\n" +
                        "• Acute viral hepatitis\n" +
                        "• Anemia\n" +
                        "• Anemia of pregnancy\n" +
                        "• Anxiety\n" +
                        "• Atopic dermatitis\n" +
                        "• Contact dermatitis\n" +
                        "• Fatigue\n" +
                        "• Herpes zoster (use with thiamine)\n" +
                        "• Insomnia\n" +
                        "• Pernicious anemia\n" +
                        "• Sciatic neuritis (use B12 with thiamine, 50 mg. per injection)\n" +
                        "• Seborrheic dermatitis\n" +
                        "• Subdeltoid bursitis\n" +
                        "• Trigeminal neuralgia (use B12 with thiamine, 50 mg. per injection)\n" +
                        "• Xanthelasma"
            }
            "Biotin" -> {
                text =  "• Candidiasis\n" +
                        "• Diabetes mellitus\n" +
                        "• Multiple sclerosis\n" +
                        "• Cardiovascular disease\n" +
                        "• Diabetic neuropathy\n" +
                        "• Seborrheic dermatitis in infants\n" +
                        "• SIDS\n" +
                        "• Strengthens nails\n" +
                        "• Uremic neuropathy"
            }
            "Folate" -> {
                text =  "• Aging prevention\n" +
                        "• AIDS\n" +
                        "• Alzheimer's disease\n" +
                        "• Aphthous stomatitis - use with vitamin B12\n" +
                        "• Atherosclerosis\n" +
                        "• Bipolar disorder\n" +
                        "• Cancer prevention\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Crohn's disease\n" +
                        "• Cystitis\n" +
                        "• Constipation\n" +
                        "• Depression\n" +
                        "• Endometriosis\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibromyalgia\n" +
                        "• Gout\n" +
                        "• Hepatitis\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Osteoporosis\n" +
                        "• Parkinson's Disease\n" +
                        "• Psoriasis\n" +
                        "• Rosacea\n" +
                        "• Schizophrenia\n" +
                        "• Ulcerative colitis\n" +
                        "• Angular cheilitis\n" +
                        "• Cardiovascular diseases\n" +
                        "• Cervical dysplasia\n" +
                        "• Cleft palate prevention\n" +
                        "• GI inflammation\n" +
                        "• Gingivitis\n" +
                        "• Increased fracture of chromosomes\n" +
                        "• Malabsorption\n" +
                        "• Megaloblastic anemia\n" +
                        "• Neural tube defect prevention\n" +
                        "• Restless leg syndrome"
            }
            "Choline (Lecithin)" -> {
                text =  "• Alzheimer's disease\n" +
                        "• Atherosclerosis\n" +
                        "• Bipolar disorder\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Endometriosis\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Hemorrhoids\n" +
                        "• Memory loss\n" +
                        "• Multiple sclerosis\n" +
                        "• Obesity\n" +
                        "• PMS\n" +
                        "• Psoriasis\n" +
                        "• Uterine fibroid\n" +
                        "• Fatty liver\n" +
                        "• Herpes zoster (mild cases)\n" +
                        "• Lower esophageal sphincter dysfunction\n" +
                        "• Myasthenia gravis\n" +
                        "• Nerve dysfunctions i.e. Huntington's chorea, Parkinson's disease, Alzheimer's disease\n" +
                        "• Tardive dyskinesia (choline in the natural source of lecithin)"
            }
            "Inositol" -> {
                text =  "• Depression\n" +
                        "• Endometriosis\n" +
                        "• PMS\n" +
                        "• Uterine fibroid"
            }
            "PABA (Para-aminobenzoic Acid)" -> {
                text =  "• Ulcerative colitis\n" +
                        "• Dermatomyositis\n" +
                        "• Pemphigus vulgaris\n" +
                        "• Peyronie's disease\n" +
                        "• Protect against sunburn\n" +
                        "• Scleroderma\n" +
                        "• Thyroiditis (clinical observation)\n" +
                        "• Vitiligo"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text =  "• Aging prevention\n" +
                        "• AIDS\n" +
                        "• Allergies\n" +
                        "• Alzheimer's disease\n" +
                        "• Aphthous stomatitis\n" +
                        "• Asthma\n" +
                        "• Atherosclerosis\n" +
                        "• Attention deficit disorder\n" +
                        "• Autism\n" +
                        "• Bipolar disorder\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Bronchitis\n" +
                        "• Cancer prevention\n" +
                        "• Candidiasis\n" +
                        "• Cataract prevention\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Crohn's disease\n" +
                        "• Cystitis\n" +
                        "• Depression\n" +
                        "• Diabetes mellitus (Note: contraindicated in diabetes with advanced renal failure)\n" +
                        "• Eczema\n" +
                        "• Endometriosis\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Fibromyalgia\n" +
                        "• Gout\n" +
                        "• Headaches\n" +
                        "• Hemorrhoids\n" +
                        "• Hepatitis\n" +
                        "• Herpes simplex\n" +
                        "• Hypertension\n" +
                        "• Hypothyroidism\n" +
                        "• Impotence\n" +
                        "• Incontinence\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Macular degeneration\n" +
                        "• Mastitis\n" +
                        "• Menopause\n" +
                        "• Multiple sclerosis\n" +
                        "• Obesity\n" +
                        "• Osteoarthritis\n" +
                        "• Osteoporosis\n" +
                        "• Otitis media\n" +
                        "• Parkinson's disease\n" +
                        "• Peptic ulcer\n" +
                        "• PMS\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Schizophrenia\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Ulcerative colitis\n" +
                        "• Uterine fibroid\n" +
                        "• Bacterial infections\n" +
                        "• Decreases triglycerides and platelet adhesiveness\n" +
                        "• Glaucoma\n" +
                        "• Lead elimination and other heavy metals\n" +
                        "• Male infertility due to sperm agglutination\n" +
                        "• Spinal disc degeneration\n" +
                        "• Viral infections"
            }
            "Vitamin D (Cholecalciferol)" -> {
                text =  "• Aging prevention\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Cancer prevention\n" +
                        "• Congestive heart failure\n" +
                        "• Crohn's disease\n" +
                        "• Diabetes mellitus\n" +
                        "• Menopause\n" +
                        "• Osteoporosis\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Cancer prevention, especially colon and breast\n" +
                        "• Fractures\n" +
                        "• Rickets"
            }
            "Vitamin E (Tocopherol)" -> {
                text =  "• Aging prevention\n" +
                        "• AIDS\n" +
                        "• Allergies\n" +
                        "• Alzheimer's disease\n" +
                        "• Aphthous stomatitis\n" +
                        "• Atherosclerosis\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Bronchitis\n" +
                        "• Cancer prevention\n" +
                        "• Candidiasis\n" +
                        "• Cataract prevention\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Congestive heart failure\n" +
                        "• Crohn's disease\n" +
                        "• Cystitis\n" +
                        "• Diabetes mellitus\n" +
                        "• Dysmenorrhea\n" +
                        "• Eczema\n" +
                        "• Endometriosis\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Fibromyalgia\n" +
                        "• Gout\n" +
                        "• Headaches\n" +
                        "• Hemorrhoids\n" +
                        "• Hepatitis\n" +
                        "• Herpes simplex\n" +
                        "• Hypertension\n" +
                        "• Hypothyroidism\n" +
                        "• Impotence\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Macular degeneration\n" +
                        "• Mastitis\n" +
                        "• Memory loss\n" +
                        "• Menopause\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoarthritis\n" +
                        "• Otitis media\n" +
                        "• Parkinson's disease\n" +
                        "• Peptic ulcer\n" +
                        "• PMS\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Ulcerative colitis\n" +
                        "• Uterine fibroids\n" +
                        "• Acne\n" +
                        "• Cancer prevention\n" +
                        "• Cystic fibrosis\n" +
                        "• Dupuytren's contracture\n" +
                        "• Herpetic lesions and post herpetic neuralgia\n" +
                        "• Inflammatory thrombophlebitis\n" +
                        "• Intermittent claudication\n" +
                        "• Nocturnal cramping\n" +
                        "• Prevention and treatment of cardiovascular disease\n" +
                        "• Raynaud's phenomenon\n" +
                        "• Restless legs syndrome\n" +
                        "• Retrolental fibroplasia\n" +
                        "• Scleroderma - cutaneous manifestations only\n" +
                        "• Seborrheic dermatitis\n" +
                        "• Sickle cell anemia\n" +
                        "• Spontaneous abortion"
            }
            "Vitamin K (Quinones)" -> {
                text =  "• Chronic fatigue syndrome\n" +
                        "• Congestive heart failure\n" +
                        "• Endometriosis\n" +
                        "• Osteoporosis - prevention and treatment\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis and other inflammatory disorders\n" +
                        "• Systemic Lupus Erythematosus (SLE)\n" +
                        "• Chronic pain - large doses\n" +
                        "• Floaters in the eye\n" +
                        "• Nausea and vomiting of pregnancy (use with vitamin C for effective treatment)\n" +
                        "• Prevention of calcium oxalate kidney stones\n" +
                        "• Pruritis\n" +
                        "• Treatment of blood clotting disorders due to vitamin K"
            }
        }
        val ss = SpannableString(text)
        Log.e("Checking",text.lowercase())
        GlobalScope.launch(Dispatchers.IO) {
            createLink(ss,"alzheimer's disease",text.lowercase(),"Condition","Alzheimer's Disease")
            createLink(ss,"aging prevention",text.lowercase(),"Condition","Aging Prevention")
            createLink(ss,"anorexia nervosa",text.lowercase(),"Condition","Anorexia Nervosa")
            createLink(ss,"atherosclerosis",text.lowercase(),"Condition","Atherosclerosis")
            createLink(ss,"attention deficit disorder",text.lowercase(),"Condition","Attention Deficit Disorder")
            createLink(ss,"autism",text.lowercase(),"Condition","Autism")
            createLink(ss,"aids",text.lowercase(),"Condition","AIDS")
            createLink(ss,"allergies",text.lowercase(),"Condition","Allergies")
            createLink(ss,"asthma",text.lowercase(),"Condition","Asthma")
            createLink(ss,"amenorrhea",text.lowercase(),"Condition","Amenorrhea")
            createLink(ss,"aphthous stomatitis",text.lowercase(),"Condition","Aphthous Stomatitis")
            createLink(ss,"benign prostatic hypertrophy (bph)",text.lowercase(),"Condition","Benign Prostatic Hypertrophy")
            createLink(ss,"bipolar disorder",text.lowercase(),"Condition","Bipolar Disorder")
            createLink(ss,"bronchitis",text.lowercase(),"Condition","Bronchitis")
            createLink(ss,"cancer prevention",text.lowercase(),"Condition","Cancer Prevention")
            createLink(ss,"candidiasis",text.lowercase(),"Condition","Candidiasis")
            createLink(ss,"cataract prevention",text.lowercase(),"Condition","Cataract Prevention")
            createLink(ss,"chronic fatigue syndrome",text.lowercase(),"Condition","Chronic Fatigue Syndrome")
            createLink(ss,"cluster headaches",text.lowercase(),"Condition","Headache, General")
            createLink(ss,"crohn's disease",text.lowercase(),"Condition","Crohn's Disease")
            createLink(ss,"cholecystitis",text.lowercase(),"Condition","Cholecystitis")
            createLink(ss,"congestive heart failure",text.lowercase(),"Condition","Congestive Heart Failure")
            createLink(ss,"depression",text.lowercase(),"Condition","Depression")
            createLink(ss,"diabetes mellitus",text.lowercase(),"Condition","diabetes mellitus")
            createLink(ss,"dysmenorrhea",text.lowercase(),"Condition","Dysmenorrhea")
            createLink(ss,"eczema",text.lowercase(),"Condition","Eczema")
            createLink(ss,"endometriosis",text.lowercase(),"Condition","Endometriosis")
            createLink(ss,"fibrocystic breast disease",text.lowercase(),"Condition","Fibrocystic Breast Disease")
            createLink(ss,"fibromyalgia",text.lowercase(),"Condition","Fibromyalgia")
            createLink(ss,"fertility/infertility",text.lowercase(),"Condition","Fertility")
            createLink(ss,"gout",text.lowercase(),"Condition","Gout")
            createLink(ss,"headaches",text.lowercase(),"Condition","Headaches")
            createLink(ss,"hypertension",text.lowercase(),"Condition","Hypertension")
            createLink(ss,"hemorrhoids",text.lowercase(),"Condition","Hemorrhoids")
            createLink(ss,"hepatitis",text.lowercase(),"Condition","Hepatitis")
            createLink(ss,"herpes simplex",text.lowercase(),"Condition","Herpes Simplex")
            createLink(ss,"hypothyroidism",text.lowercase(),"Condition","Hypothyroidism")
            createLink(ss,"insomnia",text.lowercase(),"Condition","Insomnia")
            createLink(ss,"impotence",text.lowercase(),"Condition","Impotence")
            createLink(ss,"irritable bowel syndrome",text.lowercase(),"Condition","Irritable Bowel Syndrome")
            createLink(ss,"memory loss",text.lowercase(),"Condition","Memory Loss")
            createLink(ss,"menopause",text.lowercase(),"Condition","Menopause")
            createLink(ss,"macular degeneration",text.lowercase(),"Condition","Macular Degeneration")
            createLink(ss,"multiple sclerosis",text.lowercase(),"Condition","Multiple Sclerosis")
            createLink(ss,"osteoarthritis",text.lowercase(),"Condition","Osteoarthritis")
            createLink(ss,"osteoporosis",text.lowercase(),"Condition","Osteoporosis")
            createLink(ss,"obesity",text.lowercase(),"Condition","Obesity")
            createLink(ss,"otitis media",text.lowercase(),"Condition","Otitis Media")
            createLink(ss,"parkinson's disease",text.lowercase(),"Condition","Parkinson's Disease")
            createLink(ss,"peptic ulcer",text.lowercase(),"Condition","Peptic Ulcer")
            createLink(ss,"psoriasis",text.lowercase(),"Condition","Psoriasis")
            createLink(ss,"pms",text.lowercase(),"Condition","PMS")
            createLink(ss,"psoriatic arthritis",text.lowercase(),"Condition","Psoriatic Arthritis")
            createLink(ss,"rosacea",text.lowercase(),"Condition","Rosacea")
            createLink(ss,"rheumatoid arthritis",text.lowercase(),"Condition","Rheumatoid Arthritis")
            createLink(ss,"schizophrenia",text.lowercase(),"Condition","Schizophrenia")
            createLink(ss,"systemic lupus erythematosus (sle)",text.lowercase(),"Condition","Systemic Lupus Erythematosus")
            createLink(ss,"ulcerative colitis",text.lowercase(),"Condition","Ulcerative Colitis")
            createLink(ss,"uterine fibroid",text.lowercase(),"Condition","Uterine Fibroid")
            createLink(ss,"zinc",text.lowercase(),"Vitamin","Zinc")
            createLink(ss,"vitamin e",text.lowercase(),"Vitamin","Vitamin E (Tocopherol)")
            withContext(Dispatchers.Main){
                binding.contentData.text = ss
            }
        }
    }//

    private fun setBioChemical(heading: String) {
        binding.subHeading.text = "Biochemical Functions"
        var text = ""
        when(heading){
            "Manganese" -> {
                text = "• Synthesis of glycosaminoglycans\n" +
                        "• Part of SOD\n" +
                        "• Needed for function of dopamine\n" +
                        "• Lowered blood glucose in patients unresponsive to insulin\n" +
                        "• SOD prevents free radical damage"
            }
            "Boron"->{
                text =  "• May be required for hydroxylation reactions in production of some steroid hormones\n" +
                        "• Prevention of bone loss and demineralization"
            }
            "Calcium" -> {
                text =  "• Adds hardness to bone formation\n" +
                        "• Aids transport across cell membranes\n" +
                        "• Decreases cholesterol and triglycerides\n" +
                        "• Decreases plaques (in animal studies)\n" +
                        "• Helps regulate membrane stability\n" +
                        "• Influences excitability of smooth muscle\n" +
                        "• Involved in teeth structure\n" +
                        "• Regulates neurotransmitters at synaptic junctions\n" +
                        "• Stimulates the release of thromboplastin from platelets"
            }
            "Chromium" -> {
                text =  "• Increases the number of insulin receptors\n" +
                        "• May help regulate lipoprotein metabolism\n" +
                        "• Required for normal insulin sensitivity"
            }
            "Cobalt" -> {
                text =  "• Essential for normal cell function when combined with cyanocobalamin\n" +
                        "• May cause lowering of blood pressure by vasodilation"
            }
            "Copper" -> {
                text =  "• Cofactor for dopamine\n" +
                        "• Cofactor for enzyme lysyl oxidase, which is needed for normal collagen and elastin formation\n" +
                        "• Cofactor for estrogen breakdown\n" +
                        "• Cofactor for norepinephrine and epinephrine production\n" +
                        "• Cofactor for tyrosinase\n" +
                        "• Cofactor for super oxide desmutase\n" +
                        "• Required for cytochrome C oxidase\n" +
                        "• Required for fat metabolism\n" +
                        "• Required for myelin formation\n" +
                        "• Required in iron mobilization from the liver"
            }
            "Germanium" -> {
                text =  "• Excellent semiconductor\n" +
                        "• Involved with thyroid hormone functioning\n" +
                        "• Thought to facilitate electron flow to oxygen\n" +
                        "• Thought to be a good antioxidant"
            }
            "Iodine" -> {
                text =  "• Decreased iodine levels are associated with risk of breast, ovarian, and endometrial cancers\n" +
                        "• Essential for thyroid hormone synthesis"
            }
            "Iron" ->{
                text =  "• Cellular respiration (cytochrome proteins contain iron)\n" +
                        "• Cofactor for catalases, p450 enzymes (detoxification), and peroxidases (involved in free radical destruction)\n" +
                        "• Hb and myoglobin-for oxygen transport"
            }
            "Lithium" -> {
                text =  "• Animal studies show infertility, lower growth and survival rates with low lithium diets\n" +
                        "• May activate glucocorticosteroid receptors\n" +
                        "• May affect production of cAMP"
            }
            "Magnesium" -> {
                text =  "• 55 % in bone. 27% in muscle - mainly an intracellular ion\n" +
                        "• Antispasmodic effects on smooth muscle\n" +
                        "• ATPase - for normal excitability and muscle contraction\n" +
                        "• ATP - phosphokinases, cAMP formation, phosphatase\n" +
                        "• Can act as a calcium channel blocker\n" +
                        "• Decreases death rate following myocardial infarction\n" +
                        "• Decreases risk of arrhythmia, angina in cardiac patients\n" +
                        "• Dilates blood vessels\n" +
                        "• Enhances immune function\n" +
                        "• Increases HDL cholesterol levels\n" +
                        "• Inhibits platelet aggregation\n" +
                        "• Magnesium helps balance sodium, potassium, and calcium levels\n" +
                        "• Needed for calcium mobilization from bone\n" +
                        "• Protein synthesis\n" +
                        "• Required to activate B vitamins"
            }
            "Molybdenum" -> {
                text =  "• Co-factor for oxidation-reduction reaction\n" +
                        "• Co-factor for sulfite oxidase (oxidizes sulfite to sulfate and degradation of amino acids cysteine and methionine)\n" +
                        "• Co-factor for xanthine oxidase dehydrogenase (enzyme used to metabolize xenobiotics and catabolism of purines)\n" +
                        "• Co-factor for sulfotransferases (enzymes involved in detoxification pathways which conjugate compounds with sulfates to be excreted)\n" +
                        "• Co-factor for aldehyde oxidase (involved in xenobiotic metabolism)"
            }
            "Nickel" -> {
                text =  "• May help stabilize tertiary structure of nucleic acids and proteins\n" +
                        "• May be involved with iron or vitamin metabolism"
            }
            "Phosphorus" -> {
                text =  "• Essential component of nucleic acids and phospholipids\n" +
                        "• Essential structural role in teeth and bony skeleton\n" +
                        "• Utilized during glycolysis and oxidative phosphorylation to synthesize ATP\n" +
                        "• Part of some conjugated proteins like casein in human milk\n" +
                        "• Part of the phosphate buffering system inside cells"
            }
            "Potassium" -> {
                text =  "• Important in acid-base balance\n" +
                        "• Involved in water balance and distribution\n" +
                        "• Involved in muscle and nerve function\n" +
                        "• Important in cardiac function\n" +
                        "• Important in kidney and adrenal function"
            }
            "Selenium" -> {
                text =  "• Cofactor for glutathione peroxidase\n" +
                        "• Converts thyroxine to triiodothyronine\n" +
                        "• Involved in arachidonic acid metabolism\n" +
                        "• Involved in inflammatory response\n" +
                        "• Binds heavy metals such as cadmium and mercury"
            }
            "Silicon" -> {
                text =  "• Necessary for proper bone formation\n" +
                        "• Necessary for connective tissue formation"
            }
            "Sodium" -> {
                text =  "• Regulates fluid osmolality\n" +
                        "• Required for acid-base balance\n" +
                        "• Required for maintenance of electrical activity\n" +
                        "• Regulates fluid movement into cells"
            }
            "Strontium" -> {
                text =  "• Beneficial effect on calcified tissues\n" +
                        "• Reduced bone resorbing activity in mice studies"
            }
            "Tin" -> {
                text =  "• Due to limited data, biochemical functions of tin are unknown\n" +
                        "• May be involved in the electron transport systems and protein binding"
            }
            "Vanadium" -> {
                text =  "• Peroxide of vanadate activated insulin receptors in animal studies\n" +
                        "• May be required for glucose, cholesterol and bone metabolism\n" +
                        "• May effect the thyroid\n" +
                        "• May effect the dentin of teeth, since it is concentrated there\n" +
                        "• Suppresses cholesterol synthesis in young humans' livers"
            }
            "Zinc" -> {
                text =  "• Accelerated insulin degradation with zinc deficiency\n" +
                        "• Cofactor for alcohol dehydrogenase enzyme which can convert retinol to retinal\n" +
                        "• Cofactor for alkaline phosphatase\n" +
                        "• Cofactor for DNA and RNA polymerase, protein synthesis so needed for growth and repair\n" +
                        "• Cofactor for over 70 separate enzymes\n" +
                        "• Cofactor for super oxide desmutase\n" +
                        "• Decreases histamine release\n" +
                        "• Enhances immune function in cancer patients\n" +
                        "• Modulates inflammatory response\n" +
                        "• Part of metallothionein which scavenges hydroxyl free radicals\n" +
                        "• Promotes conversion of thyroxine to triiodothyronine\n" +
                        "• Required for NK cell activity\n" +
                        "• Required for normal lymphocyte function\n" +
                        "• Required for progesterone and endorphin secretion\n" +
                        "• Required for prolactin\n" +
                        "• Required for prostaglandin-mediated processes\n" +
                        "• Required for sense of taste, smell, appetite\n" +
                        "• Required for testosterone\n" +
                        "• Required for thymus hormones\n" +
                        "• Stabilizes membranes\n" +
                        "• Works with vitamin A"
            }
            "Vitamin A (Retinol)" -> {
                text =  "• Immunity (vitamin A is necessary for maintaining the integrity of the mucus membranes)\n" +
                        "• Necessary for differentiation of basal cells into mucus epithelial cells\n" +
                        "• Necessary for growth and development of enamel forming epithelial cells\n" +
                        "• Necessary for growth and development of skeletal tissues\n" +
                        "• Necessary for growth and development of soft tissues\n" +
                        "• Necessary for humoral and cell-mediated immunity\n" +
                        "• Necessary for normal reproduction and lactation\n" +
                        "• Retinyl esters from the diet are converted to retinal (11 cis isomer) in the eye. Retinal is then combined with the protein opsin to form rhodopsin in the rods of the retina and iodopsin in the cones.\n" +
                        "• Steroid hormone synthesis and cell differentiation"
            }
            "Beta Carotene (Carotenoids)" -> {
                text =  "• Antioxidant\n" +
                        "• Cellular screen against sunlight induced free radical damage\n" +
                        "• Due to antioxidant effect, protects arteries and inhibits damage to cholesterol\n" +
                        "• Increases all T cells\n" +
                        "• Increases helper/inducer T cells\n" +
                        "• Increases white blood cell function and number\n" +
                        "• May be helpful in cancers involving epithelial tissues - i.e. uterus, vagina, cervix, lung, skin, gastrointestinal tract"
            }
            "Vitamin B1 (Thiamine)" -> {
                text =  "• Allows displacement at nerve cell membrane so that sodium ions can freely cross\n" +
                        "• Required for the oxidative decarboxylation of pyruvate to form active acetate then acetyl coenzyme A\n" +
                        "• Serves as cofactor in reactions which transfer aldehyde groups - in glucose, fatty acids, amino acid metabolism"
            }
            "Vitamin B2 (Riboflavin)" -> {
                text =  "• Cofactor for enzymes related to ocular tissues\n" +
                        "• Needed for glucose, fatty acid, and amino acid metabolism\n" +
                        "• Needed for the Krebs cycle and electron transport chain\n" +
                        "• Needed for the production of corticosteroids, erythropoiesis, gluconeogenesis, and thyroid enzyme regulation\n" +
                        "• Needed to activate vitamin K, vitamin B6, folic acid, and niacin\n" +
                        "• May help maintain tissue levels of reduced glutathione"
            }
            "Vitamin B3 (Niacin)" -> {
                text =  "• Coenzyme for dehydrogenases which are responsible for many biochemical reactions in the body, i.e., alcohol dehydrogenase, utilizing carbohydrates, proteins, and fats\n" +
                        "• Involved in tryptophan and serotonin metabolism\n" +
                        "• Niacin lowers cholesterol and triglyceride levels\n" +
                        "• Required for pentose phosphate shunt pathway, a method of synthesizing ribose\n" +
                        "• Required for NAD which is needed for redox reactions in glycolysis and Kreb's cycle during oxidative phosphorylation\n" +
                        "• Required for the production of NADPH which is needed for synthesis of steroids and fatty acids"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text =  "• Used as an activator molecule\n" +
                        "• Required for adrenal gland functioning\n" +
                        "• Provides acetyl groups for the formation of acetylcholine in transmission of nerve impulses and detoxification of certain drugs\n" +
                        "• Required for formation of porphyrin\n" +
                        "• Required in energy metabolism and fatty acid synthesis - active form of B5, coenzyme A, is involved in acetyl CoA, acyl CoA, HMG CoA reactions\n" +
                        "• Required for synthesis of certain steroids produced in the adrenal glands"
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text =  "• Deamination - removal of amino groups from certain amino acids for energy\n" +
                        "• Decarboxylation - removal of COOH groups from certain amino acids to form another compound\n" +
                        "• Desulfuration - transfer sulfhydryl group (HS) from one amino acid methionine to another, serine, to form cysteine\n" +
                        "• Promotes release of glycogen from liver and muscle as glucose-1-phosphate\n" +
                        "• Required for formation of alpha aminolevulinic acid (precursor of heme in hemoglobin)\n" +
                        "• Required for formation of sphygolipids involved in development of myelin sheath\n" +
                        "• Required for series 1 prostaglandins (PGE 1) formation from linoleic acid\n" +
                        "• Required for synthesis of intrinsic factor\n" +
                        "• Required for synthesis of neurotransmitters serotonin, norepinephrine, histamine\n" +
                        "• Transamination - transfer of NH2 to other amino acids"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text =  "• B12 assists in transferring the methyl group onto homocysteine to form methionine, which is necessary for the synthesis of myelin sheaths\n" +
                        "• Cofactor in the transfer of methyl groups - takes the methyl group from methyl tetrahydrofolate so that THF, the active form of folate, can be used for synthesis of DNA\n" +
                        "• Involved in carbohydrate metabolism"
            }
            "Biotin" -> {
                text =  "• Coenzyme in oxidation and chain elongation of fatty acids\n" +
                        "• Coenzyme in oxidation of carbohydrates\n" +
                        "• Essential for carboxylation\n" +
                        "• Involved in deamination of amino acids such as aspartic acid, threonine, and serine\n" +
                        "• May be involved in the synthesis and release of insulin\n" +
                        "• Required for synthesis of pancreatic amylase and niacin"
            }
            "Folate" -> {
                text =  "• Inhibitor of vascular damage caused by bovine xanthine oxidase (from homogenized milk)\n" +
                        "• Involved in central nervous system function\n" +
                        "• Involved in homocysteine metabolism\n" +
                        "• Involved in immune function\n" +
                        "• Red and white blood cells formation and maturation\n" +
                        "• Single carbon moiety in formation of heme\n" +
                        "• Synthesis of purines, guanine, adenine, pyrimadine, and thymine therefore needed for normal synthesis of DNA and RNA\n" +
                        "• Vasodilator"
            }
            "Choline (Lecithin)" -> {
                text =  "• Prevent the accumulation of large quantities of fat in the liver\n" +
                        "• Required for transport and metabolism of fats\n" +
                        "• Synthesize acetylcholine"
            }
            "Inositol" -> {
                text =  "• Involved in facilitating the uptake of fatty acids by the cells\n" +
                        "• Involved in synthesis of phospholipids\n" +
                        "• Prevents the accumulation of large quantities of fat in the liver\n" +
                        "• Required for the regulation of transporting material in and out of cells"
            }
            "PABA (Para-aminobenzoic Acid)" -> {
                text =  "• Required for the formation of folic acid\n" +
                        "• Required for the metabolism of protein"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text =  "• Active role in converting folacin to tetrahydrofolic acid\n" +
                        "• Active role in converting tryptophan to 5-hydroxytryptophan to serotonin\n" +
                        "• Antibacterial\n" +
                        "• Antihistamine\n" +
                        "• Antiviral\n" +
                        "• Carnitine synthesis\n" +
                        "• Collagen synthesis\n" +
                        "• Decreases sorbitol levels in RBCs\n" +
                        "• Degradation of cholesterol\n" +
                        "• Drug metabolism\n" +
                        "• Norepinephrine synthesis\n" +
                        "• Promotes urinary excretion of uric acid\n" +
                        "• Reduces ferric iron to ferrous iron\n" +
                        "• Regulation of cellular humoral immune function\n" +
                        "• Steroid hormone synthesis"
            }
            "Vitamin D (Cholecalciferol)" -> {
                text =  "• Increases absorption of calcium from the intestines by stimulating the synthesis of calcium binding protein\n" +
                        "• Increases renal reabsorption of calcium\n" +
                        "• Increases resorption of calcium from the bone to increase serum calcium"
            }
            "Vitamin E (Tocopherol)" -> {
                text =  "• Aids in prevention of lipofuscin\n" +
                        "• Antioxidant\n" +
                        "• Enhances immune function at moderate dose, but may inhibit at large dose\n" +
                        "• Increases HDL\n" +
                        "• Inhibits platelet aggregration\n" +
                        "• Stabilizes cell membranes"
            }
            "Vitamin K (Quinones)" -> {
                text =  "• Needed for modification of glutamic acid residues to carboxyglutamic acid\n" +
                        "• Needed for synthesis of a glycoprotein made in the kidney which helps to decrease formation of kidney stones\n" +
                        "• Needed for synthesis of clotting factors II, VII, XI, X\n" +
                        "• Needed for synthesis of osteocalcin, a protein in bone needed for normal bone formation"
            }
        }

        val ss = SpannableString(text)
        createLink(ss,"tryptophan",text,"Supplement","Tryptophan")
        binding.contentData.text = ss

    }//

    private fun setDrug(heading: String) {
        binding.subHeading.text = "Drug/Nutrient Interaction"
        var text = ""
        when(heading){
            "Manganese" -> {
                text = "• Iron supplementation can lead to increased manganese excretion"
            }
            "Boron"->{
                text =  "• Due to limited data, boron drug/nutrient interaction is unknown"
            }
            "Calcium" -> {
                text =  "• Calcium and magnesium compete for GI absorption\n" +
                        "• Excessive thyroid hormone may cause excessive excretion of calcium from bone loss\n" +
                        "• High calcium (2,000 mg. per day) can decrease iron absorption\n" +
                        "• High calcium (2,000 mg. per day) can decrease manganese absorption\n" +
                        "• High zinc (150 mg. per day) leads to decrease in calcium absorption\n" +
                        "• If no magnesium is used, calcium may exacerbate digoxin toxicity\n" +
                        "• Increase in sodium intake can lead to an increase in calcium in the urine\n" +
                        "• Increased phosphorus leads to a decrease in active vitamin D and therefore decrease in calcium\n" +
                        "• Supraphysiologic doses of corticosteroids cause calcium depletion\n" +
                        "• Tetracyclines inhibit calcium absorption and vice versa"
            }
            "Chromium" -> {
                text =  "• 200 mcg. of chromium is synergistic with niacin (less than 750 mg.) to lower blood cholesterol"
            }
            "Cobalt" -> {
                text =  "• Interacts with iodine to promote normal thyroid function"
            }
            "Copper" -> {
                text =  "• Copper and zinc compete for absorption\n" +
                        "• Large doses of vitamin C may lower serum copper\n" +
                        "• NSAIDS and penicillamine may promote copper deficiency"
            }
            "Germanium" -> {
                text =  "• Due to limited data, germanium drug/nutrient interaction is unknown"
            }
            "Iodine" -> {
                text =  "• Reduces the estrogen quotient converting estrone and estradiol to estriol in the liver"
            }
            "Iron" ->{
                text =  "• Aspirin and fish oil decrease serum iron\n" +
                        "• Birth control pills increase serum iron\n" +
                        "• Causes for decreased iron absorption:\n" +
                        "• Bran\n" +
                        "• Carbonate\n" +
                        "• Coffee\n" +
                        "• Excess metal ions: cobalt, copper, zinc, cadmium, manganese\n" +
                        "• Fiber (but not cellulose)\n" +
                        "• High iron stores\n" +
                        "• Hypo- or achlorhydria\n" +
                        "• Infection or inflammation\n" +
                        "• Oxalates\n" +
                        "• Phosphates (eggs, cheese, milk)\n" +
                        "• Phytates\n" +
                        "• Protein deficiency\n" +
                        "• Tannins (black teas)\n" +
                        "• Causes for increased iron absorption:\n" +
                        "• Amino acids: lysine, histadine, cysteine and/or methionine\n" +
                        "• Citric acid and fumarate\n" +
                        "• EDTA and NTA\n" +
                        "• Fructose\n" +
                        "• HCL\n" +
                        "• Lead\n" +
                        "• Vitamin C\n" +
                        "• High zinc can decrease iron absorption\n" +
                        "• Iron deficiency can alter folate metabolism\n" +
                        "• Thyroxine can deplete iron\n" +
                        "• Tricyclic antidepressants induce iron deficiency leading to jitteriness\n" +
                        "• Vitamin E binds to iron in the gut so decreased absorption"
            }
            "Lithium" -> {
                text =  "• Increases renal excretion of sodium, low sodium diets are contraindicated when taking lithium\n" +
                        "• Interacts with nonsteroidal anti-inflammatory drugs (NSAIDS), angiotensin-converting enzyme inhibitors, calcium channel blockers, and diuretics\n" +
                        "• Lithium effectiveness in treating bipolar disorder may be reduced by magnesium supplementation"
            }
            "Magnesium" -> {
                text =  "• Caffeine, phosphorous, sugar, high sodium increase urinary excretion of magnesium\n" +
                        "• Drugs which may cause magnesium deficiency:\n" +
                        "Alcohol\n" +
                        "Amphotericin B\n" +
                        "Bleomycin\n" +
                        "Bumetanide\n" +
                        "Cargenicillin\n" +
                        "Chlorthalidone\n" +
                        "Chronic laxative abuse\n" +
                        "Cis-platimun\n" +
                        "Cortisone and related drugs\n" +
                        "Cyclosporine\n" +
                        "Digoxin\n" +
                        "Furosemide\n" +
                        "Gentamicin\n" +
                        "Hydrochlorothiazide\n" +
                        "Some antiasthmatic drugs\n" +
                        "Thiazide diuretics\n" +
                        "Vinblastine\n" +
                        "Increases of calcium or vitamin B6 may increase requirement of magnesium\n" +
                        "\n" +
                        "Supplementation of magnesium may reduce the effectiveness of lithium in treating patients with bipolar disorder"
            }
            "Molybdenum" -> {
                text =  "• >500 mcg./day may increase copper excretion\n" +
                        "• Competes with tungsten absorption"
            }
            "Nickel" -> {
                text =  "• Limited data"
            }
            "Phosphorus" -> {
                text =  "• Increased phosphorus can inhibit calcium absorption"
            }
            "Potassium" -> {
                text =  "• Magnesium helps maintain potassium intracellular\n" +
                        "• Caffeine increases urinary excretion of potassium\n" +
                        "• Phenolphthalein depletes potassium\n" +
                        "• Triamterene causes hyperkalemia\n" +
                        "• Timolol increases serum potassium levels\n" +
                        "• Thiazides depletes muscle tissue of potassium although serum levels remain normal\n" +
                        "• Ethacrynic acid used long term can deplete potassium\n" +
                        "• ACE inhibitors can lead to hyperkalemia\n" +
                        "• Alprenolol can lead to hyperkalemia, dose-dependent\n" +
                        "• Aminoglycosides can lead to hyperkalemia due to aminoglycoside-renal injury\n" +
                        "• Amphotericin B can lead to hyperkalemia due to nephrotoxicity\n" +
                        "• Aspirin, large doses, can lead to hypokalemia\n" +
                        "• Tetracycline causes hypokalemia due to nephrotoxic effects of tetracycline\n" +
                        "• Carbenoxolone may cause hypokalemia\n" +
                        "• Digitalis toxicity may be exacerbated by simultaneous potassium deficiency\n" +
                        "• Potassium may be contraindicated when taking potassium-sparing diuretics\n" +
                        "• Potassium may be contraindicated when taking angiotensin-converting enzyme inhibitor"
            }
            "Selenium" -> {
                text =  "• Enhances some effects of vitamin E\n" +
                        "• Concomitant administration of ascorbic acid may inactivate sodium selenite when administered on an empty stomach\n" +
                        "• Chronic alcohol use depletes selenium\n" +
                        "• Gold therapy decreases bioavailability of selenium\n" +
                        "• Glucocorticoids decrease plasma levels of selenium"
            }
            "Silicon" -> {
                text =  "• High intake of molybdenum, magnesium and flouride reduce silicon in the body"
            }
            "Sodium" -> {
                text =  "• High sodium increases calcium loss through urine\n" +
                        "• Chlorpropamide may lead to hyponatremia\n" +
                        "• Amitriptylene may lead to a relative hyponatremia\n" +
                        "• Captopril may lead to hyponatremia\n" +
                        "• Carbamazepine may lead to dilutional relative hyponatremia\n" +
                        "• Cyclophosphamide may lead to hyponatremia\n" +
                        "• Diazoxide, causing an increase in proximal tubular resorption, may cause hypernatremia\n" +
                        "• Neomycin decreases sodium absorption\n" +
                        "• Spirononlactone may lead to hyponatremia\n" +
                        "• Thiazides may lead to hyponatremia\n" +
                        "• Tolbutamide may lead to hyponatremia\n" +
                        "• Vincristine may lead to hyponatremia\n" +
                        "• Colchicine may lead to hyponatremia\n" +
                        "• Mannitol, causing blood volume expansion, may lead to a relative hyponatremia\n" +
                        "• Carbenicillin may lead to hypernatremia"
            }
            "Tin" -> {
                text =  "• >50 mg./day can have negative effect on zinc"
            }
            "Vanadium" -> {
                text =  "• High doses of vanadium may deplete vitamin C"
            }
            "Zinc" -> {
                text =  "• Cadmium displaces zinc\n" +
                        "• Zinc and iron taken together decreases each others absorption\n" +
                        "• Zinc and copper compete for absorption\n" +
                        "• IV EDTA may lead to significant urinary loss of zinc\n" +
                        "• Estrogen drugs (BCP, ERT, etc.) require more zinc\n" +
                        "• Corticosteroids require more zinc\n" +
                        "• Chemotherapy agents require more zinc\n" +
                        "• Diuretics require more zinc due to loss in urine\n" +
                        "• Penicillamine can cause zinc deficiency\n" +
                        "• Ethambutol chelates zinc\n" +
                        "• Ciprofloxacin taken with zinc decreases drug therapeutic action\n" +
                        "• Rantidine decreases zinc absorption"
            }
            "Vitamin A (Retinol)" -> {
                text =  "• Promotes healing suppressed by supraphysiologic doses of corticosteroids\n" +
                        "• Isotreninoin and vitamin A together can have a toxic accumulate effect\n" +
                        "• Mineral oil long term can cause fat soluble vitamin deficiency, including vitamon A\n" +
                        "• Cholestyramine causes malabsorption of vitamin A\n" +
                        "• Oral contraceptives increase plasma vitamin A levels\n" +
                        "• Neomycin decreases vitamin A absorption\n" +
                        "• Colestipol decreases vitamin A absorption"
            }
            "Beta Carotene (Carotenoids)" -> {
                text =  "• Protein deficiency may impair the conversion of provitamin A carotenes to vitamin A\n" +
                        "• Thyroid hormone deficiency may impair the conversion of provitamin A carotenes to vitamin A\n" +
                        "• Vitamin C deficiency may impair the conversion of provitamin A carotenes to vitamin A\n" +
                        "• Zinc deficiency may impair the conversion of provitamin A carotenes to vitamin A"
            }
            "Vitamin B1 (Thiamine)" -> {
                text =  "• High doses of thiamine may cause relative vitamin B6 or magnesium deficiency\n" +
                        "• Furosemide causes loss of thiamine through the urine\n" +
                        "• 5-Fluorouracid prevents conversion of thiamine to thiamine pyrophosphate (TTP)"
            }
            "Vitamin B2 (Riboflavin)" -> {
                text =  "• Ascorbic acid may decrease bioavailability of riboflavin\n" +
                        "• Tryptophanmay decrease bioavailability of riboflavin\n" +
                        "• Copper may decrease bioavailability of riboflavin\n" +
                        "• Zinc may decrease bioavailability of riboflavin\n" +
                        "• Iron may decrease bioavailability of riboflavin\n" +
                        "• Probenecid increases urinary excretion and decreases absorption\n" +
                        "• Tetracycline increases urinary excretion of riboflavin\n" +
                        "• Thiazide diuretics increase urinary excretion of riboflavin\n" +
                        "• Thyroid medication decreases absorption\n" +
                        "• Tricyclic antidepressants decrease absorption\n" +
                        "• Riboflavin may prevent methotrexate from being taken into cancer cells"
            }
            "Vitamin B3 (Niacin)" -> {
                text =  "• Postural hypotension may result from concomitant use of vitamin B3 and vasoactive drugs, including some medications for hypertension\n" +
                        "• Rhabdomyolysis may result from concomitant use of vitamin B3 and HMG-CoA reductase inhibitors"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text =  "• Limited data"
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text =  "• Vitamin B6 converts L-Dopa into dopamine outside the blood brain barrier, decreasing the therapeutic of leva-dopa\n" +
                        "• Large doses may increase the need for magnesium, zinc, essential fatty acids and other B vitamins\n" +
                        "• May prevent depression secondary to exogenous estrogens\n" +
                        "• Sinemet (L-Dopa and Carbidopa) - synergistic effect\n" +
                        "• Oral contraceptives deplete vitamin B6\n" +
                        "• Cycloserine limits vitamin B6 availability\n" +
                        "• Vitamin B6 (500 mg) protects against elevation of cholesterol by disulfiram\n" +
                        "• Oral estrogens decrease optimal absorption of vitamin B6\n" +
                        "• Ethionamide causes vitamin B6 deficiency\n" +
                        "• Hydralazine antagonizes vitamin B6 and causes deficiency\n" +
                        "• Hydrazine decreases vitamin B6 absorption\n" +
                        "• Thiosemicarbizide causes vitamin B6 deficiency\n" +
                        "• Vitamin B6 decreases neurological symptoms caused from prolonged theophylline usage\n" +
                        "• Leva-dopa decreases bioavailability of vitamin B6\n" +
                        "• Penicillamine compromises the biological activity of vitamin B6\n" +
                        "• Progesterone lowers biological levels of vitamin B6\n" +
                        "• Tetracycline decreases absorption of vitamin B6\n" +
                        "• Theophylline causes a pyridoxal 5-phosphate deficiency but does not alter serum levels of vitamin B6\n" +
                        "• Vitamin B6 decreases neurological symptoms from prolonged theophylline usage\n" +
                        "• Pyrazinamide causes pyridoxine deficiency\n" +
                        "• Isoniazid causes pyridoxine deficiency"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text =  "• Excessive anticonvulsants may cause deficiency of B12\n" +
                        "• Excessive antibiotics may cause deficiency of B12\n" +
                        "• Large doses of vitamin B12 may increase the requirement for folate\n" +
                        "• Megadoses of vitamin C and/or copper may cause deficiency of B12\n" +
                        "• Nitrous oxide treatment interferes with vitamin B12 metabolism which may lead to megaloblastic anemia\n" +
                        "• Cholestyramine decreases vitamin B12 absorption\n" +
                        "• Due to ingibition of gastric acid and pepsin secretion by cimetidine, vitamin B12 is not absorbed\n" +
                        "• Clofibrate decreases vitamin B12 absorption\n" +
                        "• Colchicine decreases vitamin B12 absorption\n" +
                        "• Neomycin decreases vitamin B12 absorption\n" +
                        "• Aminopterin decreases vitamin B12 absorption\n" +
                        "• Omeprazole causes significant short term vitamn B12 malabsorption\n" +
                        "• Para-aminosalicylic acid decreases vitamin B12 absorption\n" +
                        "• Phenformin decreases vitamin B12 absorption\n" +
                        "• Phenytoin decreases vitamin B12 absorption\n" +
                        "• H-2 blockers decreases vitamin B12 absorption\n" +
                        "• Potassium chloride decreases vitamin B12 absorption\n" +
                        "• Potassium citrate decreases vitamin B12 absorption\n" +
                        "• Some oral hypoglycemic agents decrease vitamin B12 absorption\n" +
                        "• Rantidine decreases vitamin B12 absorption\n" +
                        "• Tetracycline decreases vitamin B12 absorption\n" +
                        "• Oral contraceptives decrease vitamin B12 absorption"
            }
            "Biotin" -> {
                text =  "• None known"
            }
            "Folate" -> {
                text =  "• Anticonvulsant drugs can cause deficiency of folate\n" +
                        "• Aspirin (acetylsalicylic acid, ASA) may cause deficiency of folate\n" +
                        "• BCP (birth control pill) interferes with folate\n" +
                        "• Folate therapy may interfere with anticonvulsant drugs, i.e. dilantin\n" +
                        "• Folate therapy may interfere with aminopterin or methotrexate\n" +
                        "• Litium carbonate may cause folate deficiency"
            }
            "Choline (Lecithin)" -> {
                text =  "• None known"
            }
            "Inositol" -> {
                text =  "• None known"
            }
            "PABA (Para-aminobenzoic Acid)" -> {
                text =  "• Interferes with sulfonamides\n" +
                        "• Potentiates the effect of corticosteroids"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text =  "• Aspirin and tobacco smoke deplete vitamin C\n" +
                        "• Adriamycin cardiotoxicity is lessened with vitamin C\n" +
                        "• Indomethacin decreases absorption of vitamin C\n" +
                        "• Phenothiazines and vitamin C may work synergistically for neuroleptic associated with amenorrhea\n" +
                        "• Decreases therapeutic effect of warfarin\n" +
                        "• Oral contraceptives decreases plasma levels of vitamin C"
            }
            "Vitamin D (Cholecalciferol)" -> {
                text =  "• Anticonvulsants interfere with vitamin D and vitamin K\n" +
                        "• Prednisone or other cortisone-like drugs interfere with the renal conversion of vitamin D to its biologically active form (1, 25 dihydroxycholecalciferol)\n" +
                        "• Phenobarbital prevents biological availability of vitamin D\n" +
                        "• Primidone, long term, leads to vitamin D deficiency\n" +
                        "• Phenytoin decreases absorption of vitamin D\n" +
                        "• Mineral oil, long term, can cause fat soluble vitamin deficiency, including vitamon D\n" +
                        "• Isoniazid decreases synthesis of active form of vitamin D\n" +
                        "• Glutethimide increases metabolism of vitamin D resulting in a decrease in vitamin D stores\n" +
                        "• Glucocorticoids diminishes vitamin D bioavailability\n" +
                        "• Furosemide (and other thiazides) used with vitamin D leads to hypercalcemia\n" +
                        "• Colestipol reduces vitamin D absorption\n" +
                        "• Cimetidine decreases 25 hydroxylase vitamin D activity in the liver\n" +
                        "• Cholestyramine causes vitamin D malabsorption\n" +
                        "• Anticonvulsants decreases the effectiveness of vitamin D on bone mineralization and overall metabolism\n" +
                        "• Phenolphthalein decreases vitamin D absorption"
            }
            "Vitamin E (Tocopherol)" -> {
                text =  "• Iron binds vitamin E and inactivates it\n" +
                        "• May enhance the effect of griseofluvin\n" +
                        "• Anticonvulsants used long term causes a deficiency of vitamin E\n" +
                        "• May enhance the effectiveness of AZT and reduce its toxicity\n" +
                        "• May reduce the severity of tardive dyskinesia caused by phenothiazines\n" +
                        "• Omega 3 and Omega 6 fatty acids increase the requirement for vitamin E\n" +
                        "• Lessens lung fibrosis of bleomycin\n" +
                        "• Synergistic with selenium\n" +
                        "• Vitamin A prevents oxidation of vitamin E\n" +
                        "• Vitamin B6 may enhance the effect of vitamin E\n" +
                        "• Clofibrate may lead to a relative deficiency in vitamin E due to a decrease in lipoprotein carriers caused by the drug\n" +
                        "• Prevents cardiotoxicity of adriamycin\n" +
                        "• Lessens pulmonary toxicity of amiodarone\n" +
                        "• Anticoagulants are enhanced and potentiated by large doses of vitamin E\n" +
                        "• Cholestyramine causes malabsorption of vitamin E\n" +
                        "• Colestipol decreases absorption of vitamin E\n" +
                        "• Isoniazid decreases absorption of vitamin E\n" +
                        "• Mineral oil long term causes fat soluble vitamin deficiency, including vitamin E\n" +
                        "• Probucol, by decreasing levels of triglycerides and cholesterol, indirectly decreases vitamin E\n" +
                        "• Improves Zidovudine (AZT) therapeutic effectiveness\n" +
                        "• Potentiates warfarin and may increase risk of hemorrhage"
            }
            "Vitamin K (Quinones)" -> {
                text =  "• Dilantin interferes with vitamin K functions\n" +
                        "• Lactobacillus acidophilus may inhibit the growth of E. coli, which synthesizes vitamin K in the large intestines\n" +
                        "• Vitamin E may interfere with absorption and utilization of vitamin K\n" +
                        "• Neomycin decreases vitamin K absorption\n" +
                        "• Vitamin K helps prevent newborn hemorrhage of mothers on anticonvulsants\n" +
                        "• Phenytoin decreases absortpion of vitamin K\n" +
                        "• Oral contraceptives increases absorption or bioavaliability of vitamin K\n" +
                        "• Vitamin K interferes with the therapeutic effect of coumadin\n" +
                        "• Mineral oil long term can cause fat soluble vitamin deficiency, including vitamon K\n" +
                        "• Corticosteroids require more zinc\n" +
                        "• Colestipol decreases vitamin K absorption\n" +
                        "• Anticoagulants and vitamin K taken together can cause increased urinary calcium loss\n" +
                        "• Cholestyramine decreases absorption of vitamin K\n" +
                        "• Vitamin K interfers with warfarin therapeutic effect\n" +
                        "• Cephalosporins antagonizes vitamin K, leading to coagulation disturbances"
            }

        }
        val ss = SpannableString(text)
        createLink(ss,"bipolar disorder",text.lowercase(),"Condition","Bipolar Disorder")
        createLink(ss,"magnesium",text.lowercase(),"Vitamin","Magnesium")
        createLink(ss,"vitamin e",text.lowercase(),"Vitamin","Vitamin E (Tocopherol)")
        createLink(ss,"molybdenum",text.lowercase(),"Vitamin","Molybdenum")
        createLink(ss,"vitamin c",text.lowercase(),"Vitamin","Vitamin C (Ascorbic Acid)")
        createLink(ss,"vitamin b6",text.lowercase(),"Vitamin","Vitamin B6 (Pyridoxine)")
        createLink(ss,"omega 3 and omega 6 fatty acids",text.lowercase(),"Fat","")
        createLink(ss,"selenium",text.lowercase(),"Vitamin","Selenium")
        if(heading!="Vitamin A (Retinol)")
        createLink(ss,"vitamin a",text.lowercase(),"Vitamin","Vitamin A (Retinol)")

        binding.contentData.text = ss
    }//

    private fun setAdverseEffect(heading: String) {
        binding.subHeading.text = "Adverse Effects and Toxicity"
        var text = ""
        when(heading){
            "Manganese" -> {
                text = "• Usually well tolerated when taken in the form of food or supplements\n" +
                        "• Toxicity when manganese is inhaled - produces Parkinson's-like symptoms"
            }
            "Boron"->{
                text = "• No reported toxicity"
            }
            "Calcium" -> {
                text =  "• Constipation\n" +
                        "• Contraindicated in:\n" +
                        "• Asthma\n" +
                        "• Dialysis patients\n" +
                        "• Idiopathic stone formers with hypercalciuria\n" +
                        "• Sarcoidosis\n" +
                        "• Usually well tolerated"
            }
            "Chromium" -> {
                text =  "• High doses may cause decreased sleep time and increased dream activity\n" +
                        "• Little known toxicity"
            }
            "Cobalt" -> {
                text =  "• In animals: polycythemia, hyperplasia of bone marrow, reticulocytosis, increased blood volume\n" +
                        "• May cause heart problems, goiters or proliferation of bone marrow erythropoietic cells"
            }
            "Copper" -> {
                text =  "• Chronic large doses of copper may cause cirrhosis of the liver\n" +
                        "• Depression\n" +
                        "• In children - diarrhea\n" +
                        "• Insomnia\n" +
                        "• Joint pain\n" +
                        "• Muscle pain\n" +
                        "• Nausea or vomiting\n" +
                        "• Poor memory\n" +
                        "• Toxicity rarely seen except with Wilson's disease or from contaminated water"
            }
            "Germanium" -> {
                text =  "• Inorganic form may cause kidney failure\n" +
                        "• Loose stools\n" +
                        "• Skin irritations"
            }
            "Iodine" -> {
                text =  "• Reports of 20 - 30 mg./day can inhibit thyroid function, other reports say >300 mg./day\n" +
                        "• Signs of toxicity: dermatitis, depression, aggravation of acne, nausea, headaches, excessive secretions"
            }
            "Iron" ->{
                text =  "• Amenorrhea\n" +
                        "• Arthralgia\n" +
                        "• CNS effects\n" +
                        "• Cancer\n" +
                        "• Cardiac failure\n" +
                        "• Decreased immunity\n" +
                        "• Don't supplement with iron unless indicated by chem. screen showing low ferritin level\n" +
                        "• Impotence\n" +
                        "• Lethargy\n" +
                        "• Liver cancer, cirrhosis\n" +
                        "• Pancreas damage\n" +
                        "• Parkinson's disease\n" +
                        "• Rheumatoid arthritis/inflammation\n" +
                        "• Risk of coronary artery disease\n" +
                        "• Sterility"
            }
            "Lithium" -> {
                text =  "• Adverse reactions can be prevented by supplementing EFAs with lithium\n" +
                        "• Do not take lithium if there is a significant cardiovascular or renal disease, pregnant or lactating, or dehydration\n" +
                        "• May cause:\n" +
                        "• Nephrotoxicity\n" +
                        "• Tremors\n" +
                        "• Visual loss\n" +
                        "• May induce hypothyroidism\n" +
                        "• Serum lithium levels must be monitored"
            }
            "Magnesium" -> {
                text =  "• Contraindicated in kidney problems\n" +
                        "• Generally large doses of one mineral may cause deficiencies in other minerals. A single mineral supplement should be backed up by a multiple mineral supplement.\n" +
                        "• Large doses may cause diarrhea\n" +
                        "• May cause a persistent lump at the injection site when given IM\n" +
                        "• May cause hypotension when used IV"
            }
            "Molybdenum" -> {
                text = "• 10 - 15 mg./day may precipitate gout by raising uric acid levels"
            }
            "Nickel" -> {
                text =  "• Very low toxicity\n" +
                        "• Usually toxicity associated with inhalation of nickel carbonyl"
            }
            "Phosphorus" -> {
                text = "• Diarrhea"
            }
            "Potassium" -> {
                text =  "• Large doses may cause diarrhea\n" +
                        "• Contraindicated in people with renal failure\n" +
                        "• Contraindicated in people with diabetes that have an abnormality of potassium metabolism"
            }
            "Selenium" -> {
                text =  "• Large doses: hair loss, nail loss, nausea, vomiting, fatigue, diarrhea, irritability, paresthesias, garlic odor\n" +
                        "• Studies in high selenium areas suggest that chronic use of 1,000 mcg./day is safe\n" +
                        "• Do not take on empty stomach"
            }
            "Silicon" -> {
                text = "• None known"
            }
            "Sodium" -> {
                text =  "• Infants: formula with high salt also may have excessive sodium bicarbonate for salicylate poisoning\n" +
                        "• Symptoms:\n" +
                        "• Subarachnoid hemorrhage\n" +
                        "• Vomiting\n" +
                        "• Diarrhea\n" +
                        "• Hypertension\n" +
                        "• Kidney tubule shrinkage"
            }
            "Tin" -> {
                text =  "• Oral tin has very low toxicity\n" +
                        "• Organo - tin compounds are more toxic due to more efficient absorption\n" +
                        "• Tin accumulates progressively throughout life"
            }
            "Vanadium" -> {
                text =  "• Very little is known\n" +
                        "• Extremely high doses (>25 mg./day):\n" +
                        "• Cramps\n" +
                        "• Diarrhea\n" +
                        "• Mania patients have extremely high levels in hair samples"
            }
            "Zinc" -> {
                text =  "• Some symptoms have been noted with dosages of > 150 mg. per day but other studies show dosages > 660 mg. per day for weeks have had no adverse effects\n" +
                        "• Cardiac arrhythmias (if zinc is taken without copper supplementation)\n" +
                        "• Impaired immunity (if zinc is taken without copper supplementation)\n" +
                        "• Anemia (if zinc is taken without copper supplementation)\n" +
                        "• Low HDL (if zinc is taken without copper supplementation)\n" +
                        "• Nausea\n" +
                        "• Skin rashes\n" +
                        "• Increased depression\n" +
                        "• Alcohol intolerance"
            }
            "Vitamin A (Retinol)" -> {
                text =  "• 100,000 - 200,000 I.U. for 6-8 months may show signs of toxicity:\n" +
                        "All these signs and symptoms are reversible when vitamin A is stopped\n" +
                        "• Alopecia\n" +
                        "• Bone pain\n" +
                        "• Brittle nails\n" +
                        "• Cheilosis\n" +
                        "• Drowsiness\n" +
                        "• Dry scaly skin\n" +
                        "• Fatigue\n" +
                        "• Headaches\n" +
                        "• Hepatosplenomegaly\n" +
                        "• Irritability\n" +
                        "• Muscle incoordination\n" +
                        "• Vertigo\n" +
                        "• Visual disturbances\n" +
                        "• Vomiting\n" +
                        "• Early pregnancy - >50,000 I.U. may increase risk of birth defects\n" +
                        "• Palmitate, the synthetic form, is most toxic\n" +
                        "• Patients with liver dysfunctions, i.e. from alcohol, drugs, hepatic diseases, elderly, protein calorie malnutrition, have increased susceptibility to vitamin A toxicity"
            }
            "Beta Carotene (Carotenoids)" -> {
                text =  "• Elevated carotenoid levels in the blood do not lead to vitamin A toxicity\n" +
                        "• High amounts of carotenoids may produce hypercarotenemia and reversible yellow discoloration of the skin"
            }
            "Vitamin B1 (Thiamine)" -> {
                text = "• No known toxicity"
            }
            "Vitamin B2 (Riboflavin)" -> {
                text = "• No known toxicity"
            }
            "Vitamin B3 (Niacin)" -> {
                text =  "• Caution when taking > 1 gm. per day:\n" +
                        "• Liver enzymes should be monitored during niacin therapy - if elevated, cut back on dosage\n" +
                        "• Nausea is first sign of toxicity with both niacin and niacinamide\n" +
                        "• Flushing with niacin, so best taken with food\n" +
                        "• Gastritis\n" +
                        "• Increases uric acid levels\n" +
                        "• Reactivates peptic ulcers"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text = "• Diarrhea in very large doses"
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text =  "• 2 - 5 gm. over a few months may result in numbness and tingling in the extremities - symptoms usually disappear after B6 is discontinued\n" +
                        "• Doses larger than 50 mg. per day may suppress lactation\n" +
                        "• Doses of 500 mg. per day or more for extended periods of time have been reported to cause sensory neuropathy in a stocking-glove distribution\n" +
                        "• Lower doses may cause insomnia or anxiety which may be prevented by co-administration of magnesium"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text = "• None known"
            }
            "Biotin" -> {
                text = "• None known"
            }
            "Folate" -> {
                text =  "• Folate therapy may interfere with the laboratory diagnosis of pernicious anemia\n" +
                        "• Large doses may promote seizures in preexisting epilepsy"
            }
            "Choline (Lecithin)" -> {
                text =  "• Depression\n" +
                        "• Diarrhea\n" +
                        "• Dizziness\n" +
                        "• Fishy odor\n" +
                        "• Nausea"
            }
            "Inositol" -> {
                text = "• None known"
            }
            "PABA (Para-aminobenzoic Acid)" -> {
                text =  "• > 12 gm. per day:\n" +
                        "• Leukopenia\n" +
                        "• Fever\n" +
                        "• Liver disease\n" +
                        "• Malaise\n" +
                        "• Rare cases of fatal idiosyncratic reactions have been reported\n" +
                        "• Rash"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text =  "• Affects testing for serum cholesterol\n" +
                        "• False negative test for glucose in urine\n" +
                        "• False negative test for occult blood in urine\n" +
                        "• Glucose-6-phosphate dehydrogenase deficiency patients may suffer hemolysis with intravenous vitamin C (although other factors may also be involved)\n" +
                        "• Increased absorption of iron\n" +
                        "• Intestinal gas and diarrhea in large doses (>3 grams)\n" +
                        "• Some stool tests for occult blood may be affected by large doses of vitamin C"
            }
            "Vitamin D (Cholecalciferol)" -> {
                text =  "• Reports that 1,000 - 3,000 I.U. per day in children may produce symptoms of toxicity:\n" +
                        "• Calcification of soft tissues - kidneys, lungs, tympanic membrane of ears\n" +
                        "• Constipation\n" +
                        "• Diarrhea\n" +
                        "• Headaches\n" +
                        "• Nausea and vomiting\n" +
                        "• Polydipsia\n" +
                        "• Polyuria\n" +
                        "• Weakness"
            }
            "Vitamin E (Tocopherol)" -> {
                text =  "• In diabetes and rheumatic heart disease, start with low doses (100 I.U./day) and build slowly\n" +
                        "• Prolonged blood clotting time at 1800 I.U. per day (may interfere with vitamin K)\n" +
                        "• The following may appear in doses >1,200 I.U. per day but are completely reversible with decreased dosage:\n" +
                        "• Diarrhea\n" +
                        "• Fainting\n" +
                        "• Flatulence\n" +
                        "• Headache\n" +
                        "• Heart palpitations\n" +
                        "• Hypertension\n" +
                        "• Increased triglycerides\n" +
                        "• Nausea\n" +
                        "• There is no well-documented toxicity of vitamin E in doses 1,200 I.U. per day."
            }
            "Vitamin K (Quinones)" -> {
                text =  "• Generally well tolerated at usual doses\n" +
                        "• Menadione (K3) may produce hemolytic anemia and jaundice in infant at large doses"
            }
        }
        val ss = SpannableString(text)
        binding.contentData.text = ss
    }//

    private fun setCauseDeficency(heading: String) {
        binding.subHeading.text = "Causes of Deficiency"
        var text = ""
        when(heading){
            "Manganese" -> {
                text = "• Consuming refined foods"
            }
            "Boron"->{
                text = "• Due to limited data, causes of boron deficiency are unknown"
            }
            "Calcium" -> {
                text =  "• Arthritis\n" +
                        "• Blood loss\n" +
                        "• Decreased absorption\n" +
                        "• Decreased intake especially if eating SAD (Standard American Diet)\n" +
                        "• High intake of sodium\n" +
                        "• High intake of sugar\n" +
                        "• High phosphorus\n" +
                        "• Hypercalcuria\n" +
                        "• Inflammatory bowel disease\n" +
                        "• Lead toxicity\n" +
                        "• Multiple sclerosis\n" +
                        "• Senility\n"
            }
            "Chromium" -> {
                text =  "• Demineralization of farming soil\n" +
                        "• Elderly\n" +
                        "• High intakes of refined carbohydrates\n" +
                        "• People who exercise regularly\n" +
                        "• Pregnant women\n" +
                        "• Processed foods"
            }
            "Cobalt" -> {
                text = "• No evidence of cobalt deficiency in humans"
            }
            "Copper" -> {
                text =  "• Consumption of processed foods\n" +
                        "• Decreased intake\n" +
                        "• High dietary fructose\n" +
                        "• High zinc intake\n" +
                        "• Infant formulas using cow's milk\n" +
                        "• Menke's kinky hair"
            }
            "Germanium" -> {
                text = "• Due to limited data, causes of germanium deficiency are unknown"
            }
            "Iodine" -> {
                text =  "• Decreased intake\n" +
                        "• High intake of brassica family: cabbage, peanuts, kale, soybeans, mustard seed, turnips, rapeseeds, cassava"
            }
            "Iron" ->{
                text =  "• Blood loss\n" +
                        "• Decreased absorption\n" +
                        "• Decreased intake"
            }
            "Lithium" -> {
                text = "• May be due to genetic defect"
            }
            "Magnesium" -> {
                text =  "• Chronic laxative abuse\n" +
                        "• Decreased intake\n" +
                        "• Diabetes\n" +
                        "• Diuretics, thiazide (including digitalis toxicity)\n" +
                        "• Excess purified fiber intake\n" +
                        "• High calcium may increase the requirement for magnesium\n" +
                        "• High fat\n" +
                        "• High phosphate\n" +
                        "• High salt\n" +
                        "• Poor absorption\n" +
                        "• Severe respiratory problems"
            }
            "Molybdenum" -> {
                text =  "• Rare genetic defect - sulfite oxidase deficiency\n" +
                        "• Total parenteral nutrition"
            }
            "Nickel" -> {
                text =  "• Decreased levels of glucose 6 - phosphate\n" +
                        "• Problems associated with decreases in pancreatic amylase production"
            }
            "Phosphorus" -> {
                text =  "• Total parenteral nutrition\n" +
                        "• Hyperparathyroidism\n" +
                        "• Alcoholism\n" +
                        "• Excessive use of antacids\n" +
                        "• Treatment of diabetic acidosis"
            }
            "Potassium" -> {
                text =  "• Low intake - SAD (Standard American Diet) or high sodium intake\n" +
                        "• Diarrhea in infants\n" +
                        "• Vomiting\n" +
                        "• Glucocorticoid excess\n" +
                        "• Diuretics, especially thiazide diuretics"
            }
            "Selenium" -> {
                text =  "• Eating SAD (Standard American Diet)\n" +
                        "• Areas with decreased soil selenium:\n" +
                        "• Industrial New England: New York, Connecticut\n" +
                        "• South East: Florida\n" +
                        "• North West: Oregon, Washington\n" +
                        "• Acid rain decreases selenium\n" +
                        "• Sulfate competes with selenium for uptake by plants\n" +
                        "• Fertilizers decrease selenium\n" +
                        "• Cooking often depletes selenium, especially if cooking water is discarded"
            }
            "Silicon" -> {
                text = "• Possibly high intake of processed foods"
            }
            "Sodium" -> {
                text = "• Being a vegan who exercises and is exposed to extreme heat"
            }
            "Tin" -> {
                text = "• Due to limited data, causes of tin deficiency are unknown"
            }
            "Vanadium" -> {
                text = "• Very little is known about vanadium deficiency"
            }
            "Zinc" -> {
                text =  "• Decreased intake\n" +
                        "• Pica in young children\n" +
                        "• Diabetes\n" +
                        "• Sickle cell anemia\n" +
                        "• Elderly due to poor diet or medications or poor absorption\n" +
                        "• Chronic liver disease\n" +
                        "• Chronic kidney disease\n" +
                        "• Crohn's disease\n" +
                        "• Celiac disease\n" +
                        "• Cystic fibrosis\n" +
                        "• Alcoholism\n" +
                        "• Acrodermatitis enteropathica (especially in infants of Italian, Iranian or Armenian decent)\n" +
                        "• Post traumatic patients - surgery, major fractures, or burns\n" +
                        "• Atopic dermatitis children\n" +
                        "• Pregnancy or lactation may require more zinc\n" +
                        "• B6 deficiency (B6 is needed for zinc absorption)"
            }
            "Vitamin A (Retinol)" -> {
                text =  "• Absorption problems\n" +
                        "• Deficiency of protein or zinc can reduce the amount of vitamin A released from the liver\n" +
                        "• Interference with conversion of beta carotene to retinol\n" +
                        "• Low intake\n" +
                        "• Vitamin A storage problems"
            }
            "Beta Carotene (Carotenoids)" -> {
                text =  "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Dietary insufficiency\n" +
                        "• Liver diseases\n" +
                        "• Pancreatic diseases"
            }
            "Vitamin B1 (Thiamine)" -> {
                text =  "• Decreased consumption, i.e. a diet exclusive of milled non-enriched rice or wheat or raw fish\n" +
                        "• Large amounts of alcohol\n" +
                        "• Large amounts of tea"
            }
            "Vitamin B2 (Riboflavin)" -> {
                text =  "• Birth control pills\n" +
                        "• Decrease of gastric acid\n" +
                        "• Large amounts of caffeine\n" +
                        "• Large amounts of theophylline (e.g., black tea)\n" +
                        "• Saccharin\n" +
                        "• Usually occurs with other B vitamin deficiencies"
            }
            "Vitamin B3 (Niacin)" -> {
                text =  "• Alcoholism\n" +
                        "• Corn not processed with lime\n" +
                        "• High leucine"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text =  "• Aging\n" +
                        "• Alcohol\n" +
                        "• Antioxidants in the petroleum industry\n" +
                        "• Birth control pills\n" +
                        "• Celiac disease\n" +
                        "• Crohn's disease\n" +
                        "• Hydrazine compounds\n" +
                        "• Hypoacidity (acid is necessary for vitamin B6 absorption)\n" +
                        "• L-canavanine compound - found in alfalfa\n" +
                        "• Maleica hydrazide - a plant growth regulator and herbicide\n" +
                        "• Monoamine oxidase inhibitors, isoniazid, theophyline and other anti asthma medications\n" +
                        "• PCB's (polychlorinated biphenols) - have been found in 99% of all Americans tested\n" +
                        "• Penicillamine\n" +
                        "• Peroxides and free radicals\n" +
                        "• Plating materials and antitarnish agents used in metal manufacturing\n" +
                        "• Pregnancy\n" +
                        "• Tartrazine (yellow dye #5)\n" +
                        "• Tobacco smoke"
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text =  "• Aging\n" +
                        "• Alcohol\n" +
                        "• Antioxidants in the petroleum industry\n" +
                        "• Birth control pills\n" +
                        "• Celiac disease\n" +
                        "• Crohn's disease\n" +
                        "• Hydrazine compounds\n" +
                        "• Hypoacidity (acid is necessary for vitamin B6 absorption)\n" +
                        "• L-canavanine compound - found in alfalfa\n" +
                        "• Maleica hydrazide - a plant growth regulator and herbicide\n" +
                        "• Monoamine oxidase inhibitors, isoniazid, theophyline and other anti asthma medications\n" +
                        "• PCB's (polychlorinated biphenols) - have been found in 99% of all Americans tested\n" +
                        "• Penicillamine\n" +
                        "• Peroxides and free radicals\n" +
                        "• Plating materials and antitarnish agents used in metal manufacturing\n" +
                        "• Pregnancy\n" +
                        "• Tartrazine (yellow dye #5)\n" +
                        "• Tobacco smoke"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text =  "• Achlorhydria\n" +
                        "• Deficiency of intrinsic factor\n" +
                        "• Gastrectomy\n" +
                        "• Liver disease or cancer\n" +
                        "• Malabsorption, i.e., celiac disease, colitis, etc.\n" +
                        "• Megadoses of vitamin C and/or copper\n" +
                        "• Pregnancy\n" +
                        "• Tapeworms\n" +
                        "• Vegans"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text =  "• Excessive stress\n" +
                        "• Smoking"
            }
            "Vitamin D (Cholecalciferol)" -> {
                text =  "• Anticonvulsive drug therapy\n" +
                        "• Celiac disease\n" +
                        "• Crohn's disease\n" +
                        "• Cushing's disease\n" +
                        "• Dark skin\n" +
                        "• Decreased intake of vitamin D\n" +
                        "• Hypothyroidism\n" +
                        "• Intestinal surgery\n" +
                        "• Kidney or liver disease\n" +
                        "• Malabsorption\n" +
                        "• Poor exposure to sun\n" +
                        "• Ulcerative colitis\n" +
                        "• Vitamin D-resistant rickets"
            }
            "Vitamin E (Tocopherol)" -> {
                text = "• Excessive iron intake"
            }
            "Vitamin K (Quinones)" -> {
                text =  "• Hemorrhagic disease of the newborn\n" +
                        "• Osteoporosis\n" +
                        "• Sterilization of intestines"
            }
        }
        val ss = SpannableString(text)
        if(heading=="Vitamin A (Retinol)")
        createLink(ss,"zinc",text,"Vitamin","Zinc")
        binding.contentData.text = ss
    }//

    private fun setDeficiency(heading: String) {
        binding.subHeading.text = "Signs and Symptoms of Deficiency"
        var text = ""
        when(heading){
            "Manganese" -> {
                text = "• Cartilage defects (in animal studies)\n" +
                        "• Bone defects (in animal studies)\n" +
                        "• Weight loss\n" +
                        "• Altered hair color\n" +
                        "• Dementia\n" +
                        "• Nausea\n" +
                        "• Vomiting\n" +
                        "• Poor growth\n" +
                        "• Hypocholesterolemia"
            }
            "Boron"->{
                text = "• Due to limited data, boron deficiency is unknown"
            }
            "Calcium" -> {
                text = "• Muscle cramps\n" +
                        "• Osteomalacia\n" +
                        "• Osteoporosis\n" +
                        "• Rickets\n" +
                        "• Tetany"
            }
            "Chromium" -> {
                text =  "• Approximately 90% of US population may be chromium deficient from low intake\n" +
                        "• Hypercholesterolemia\n" +
                        "• Impaired glucose tolerance\n" +
                        "• Peripheral neuropathy\n" +
                        "• Weight loss"
            }
            "Cobalt" -> {
                text =  "• No evidence of cobalt deficiency in humans"
            }
            "Copper" -> {
                text =  "• Abnormal connective tissue\n" +
                        "• Anemia (microcytic, hypochromic)\n" +
                        "• CNS disturbances\n" +
                        "• Decreased HDL\n" +
                        "• Depigmentation and defective keratinization of hair\n" +
                        "• Hypothermia\n" +
                        "• Increased blood cholesterol\n" +
                        "• Increased LDL\n" +
                        "• Leukopenia\n" +
                        "• Neutropenia\n" +
                        "• Osteoporosis"
            }
            "Germanium" -> {
                text =  "• Animal studies: altered bone and liver mineral composition and decreased tibial DNS\n" +
                        "• Very limited data"
            }
            "Iodine" -> {
                text =  "• Cretinism\n" +
                        "• Goiter\n" +
                        "• Hypothyroidism"
            }
            "Iron" ->{
                text =  "• Canker sores\n" +
                        "• Decreased endurance\n" +
                        "• Decreased growth\n" +
                        "• Fatigue, anemia\n" +
                        "• Hair loss\n" +
                        "• Impaired mental ability\n" +
                        "• Increased susceptibility to infection\n" +
                        "• Skin problems including pruritus, photodermatitis, brittle nails\n" +
                        "• Sore tongue"
            }
            "Lithium" -> {
                text = "• Very rare"
            }
            "Magnesium" -> {
                text =  "• Apathy, fatigue\n" +
                        "• Arrhythmias\n" +
                        "• Cerebrovascular attack\n" +
                        "• Hypertension\n" +
                        "• Hypocalcemia - soft tissue calcification\n" +
                        "• Hypokalemia\n" +
                        "• Infants - convulsions\n" +
                        "• Ischemic heart disease\n" +
                        "• Muscle cramping\n" +
                        "• Muscle weakness\n" +
                        "• Nausea\n" +
                        "• Tetany and heart failure\n" +
                        "• Tremor"
            }
            "Molybdenum" -> {
                text =  "• Rare genetic defect - sulfite oxidase deficiency\n" +
                        "• Total parenteral nutrition"
            }
            "Nickel" -> {
                text =  "• Decreased levels of glucose 6 - phosphate\n" +
                        "• Problems associated with decreases in pancreatic amylase production"
            }
            "Phosphorus" -> {
                text = "• Very little possibility of a deficiency since most people consume too much phosphorus"
            }
            "Potassium" -> {
                text =  "• Arrhythmias\n" +
                        "• Chronic depletion can lead to glucose intolerance, constipation, ileus, metabolic alkalosis\n" +
                        "• Fatigue\n" +
                        "• Irritability\n" +
                        "• Mental confusion\n" +
                        "• Orthostatic hypotension\n" +
                        "• Paresthesia\n" +
                        "• Weakness"
            }
            "Selenium" -> {
                text = "• Early signs: brittle nails and hair"
            }
            "Silicon" -> {
                text =  "• Brittle nails and hair\n" +
                        "• Poor skin quality"
            }
            "Sodium" -> {
                text = "• Very rare"
            }
            "Tin" -> {
                text = "• Stunted growth and anemia in animal studies"
            }
            "Vanadium" -> {
                text = "• Very little is known about vanadium deficiency"
            }
            "Zinc" -> {
                text =  "• Poor smell and taste\n" +
                        "• Growth retardation in children\n" +
                        "• Hypogonadism in males - testicular atrophy, decreased sperm count\n" +
                        "• Dermatitis\n" +
                        "• Diarrhea\n" +
                        "• CNS problems:\n" +
                        "• Depression and weight loss\n" +
                        "• Lethargy\n" +
                        "• Irritability\n" +
                        "• Apathy\n" +
                        "• Increased risk of infection:\n" +
                        "• Lymphopenia\n" +
                        "• Thymic atrophy\n" +
                        "• Lymphoid tissue atrophy\n" +
                        "• Poor wound healing"
            }
            "Vitamin A (Retinol)" -> {
                text =  "• Bitot's spots--->xerosis conjunctiva--->xeropthalmia\n" +
                        "• Diarrhea\n" +
                        "• Dry eyes\n" +
                        "• Follicular hyperkeratosis - common areas: anterior thighs and posterior arms\n" +
                        "• Keratinization\n" +
                        "• Loss of bone\n" +
                        "• Loss of both taste and smell\n" +
                        "• Loss of tooth enamel\n" +
                        "• Night blindness\n" +
                        "• Opacity\n" +
                        "• Reduced immunity\n" +
                        "• Respiratory infections\n" +
                        "• Sloughing of epithelial cells of cornea"
            }
            "Beta Carotene (Carotenoids)" -> {
                text =  "• Crustaceans\n" +
                        "• Fruits\n" +
                        "• Trout\n" +
                        "• Vegetables - spinach, green and red peppers, green plants, carrots, corn, potatoes, mushrooms"
            }
            "Vitamin B1 (Thiamine)" -> {
                text =  "• Adults:\n" +
                        "• Anorexia\n" +
                        "• Ataxia\n" +
                        "• Calf muscle tenderness\n" +
                        "• Dry beriberi - worsening of polyneuritis in early stages - difficulty walking, muscle wasting\n" +
                        "• Constipation\n" +
                        "• Indigestion\n" +
                        "• Mental confusion\n" +
                        "• Palpitations\n" +
                        "• Tachycardia\n" +
                        "• Weakness of muscles\n" +
                        "• Wernicke Korsakoff syndrome - nystagmus caused by weakness of 6th cranial nerve, irritability, disordered thinking\n" +
                        "• Wet beriberi - edema starting in the feet progressing upward into legs, trunk, face, and eventually heart which leads to death by heart failure\n" +
                        "• Infants:\n" +
                        "• Cardiac failure\n" +
                        "• Cyanosis"
            }
            "Vitamin B2 (Riboflavin)" -> {
                text =  "• Cheilosis\n" +
                        "• Dry and scaly skin with itchy eyes that are sensitive to light\n" +
                        "• Glossitis"
            }
            "Vitamin B3 (Niacin)" -> {
                text =  "• Dementia including irritability, headaches, and insomnia mental confusion, hallucinations, amnesia, and severe depression\n" +
                        "• Dermatitis including inflamed tongue and mouth\n" +
                        "• Diarrhea"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text =  "• Rare due to wide distribution in foods\n" +
                        "• Insomnia\n" +
                        "• Leg cramps\n" +
                        "• Paresthesias of hands and feet\n" +
                        "• Easily fatigued\n" +
                        "• GI disturbances\n" +
                        "• Mental depression\n" +
                        "• Upper respiratory infections\n" +
                        "• Decreased antibody formation"
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text =  "• Abnormal head movements\n" +
                        "• Ataxia\n" +
                        "• Convulsions\n" +
                        "• Depression\n" +
                        "• Hyperacusis\n" +
                        "• Hyperirritability\n" +
                        "• Mucous membrane lesions\n" +
                        "• Nausea\n" +
                        "• Peripheral neuritis\n" +
                        "• Seborrheic dermatitis\n" +
                        "• Vomiting"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text =  "• Achlorhydria\n" +
                        "• Classic pernicious anemia due to a lack of IF (intrinsic factor)\n" +
                        "• Confusion\n" +
                        "• Decreased phagocyte and PMN response\n" +
                        "• Depression\n" +
                        "• Fatigue\n" +
                        "• Glossitis\n" +
                        "• Impaired lymphocyte response\n" +
                        "• Memory loss\n" +
                        "• Progressive peripheral neuropathy with pronounced anemia\n" +
                        "• Psychosis\n" +
                        "• Spinal degeneration and macrocytic cells"
            }
            "Biotin" -> {
                text =  "• Alopecia\n" +
                        "• Anorexia\n" +
                        "• Dermatitis with scaliness which sometimes begins in the eye region\n" +
                        "• Lassitude\n" +
                        "• Muscular atrophy\n" +
                        "• Nausea\n" +
                        "• Skin changes\n" +
                        "• Usually occurs with other nutrient deficiencies"
            }
            "Folate" -> {
                text =  "• Cellular nuclear morphology changes affecting epithelial cells of:\n" +
                        "• Cervix\n" +
                        "• Intestines Stomach\n" +
                        "• Vagina\n" +
                        "• GI-tract disorders\n" +
                        "• Glossitis\n" +
                        "• Megaloblastic anemia\n" +
                        "• Poor growth"
            }
            "Choline (Lecithin)" -> {
                text = "• No known cases have been reported"
            }
            "Inositol" -> {
                text = "• No known cases have been reported"
            }
            "PABA (Para-aminobenzoic Acid)" -> {
                text = "• No known cases have been reported"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text =  "• Aching bones, joints, and muscles\n" +
                        "• Anorexia\n" +
                        "• Dry skin\n" +
                        "• Fatigue\n" +
                        "• Gums deep blue-red color\n" +
                        "• Hemorrhage\n" +
                        "• Follicular hyperkeratosis\n" +
                        "• Listlessness\n" +
                        "• Loose teeth\n" +
                        "• Muscle cramps\n" +
                        "• Secondary infections\n" +
                        "• Shortness of breath\n" +
                        "• Sore and bleeding gums\n" +
                        "• Weakness"
            }
            "Vitamin D (Cholecalciferol)" -> {
                text =  "• Rickets - in children:\n" +
                        "• Bossing of the skull\n" +
                        "• Costochondral beading (rachitic rosary)\n" +
                        "• Delayed sitting and crawling\n" +
                        "• Enlargement of epiphyseal growth plates, especially in radius and ulna\n" +
                        "• Failure of fontanelles to close with delayed teeth eruption, stunted growth, bow legs or knock knees\n" +
                        "• Reduced mineralization of skull away from sutures\n" +
                        "• Restless\n" +
                        "• Sleep poorly\n" +
                        "• Osteomalacia - in adults:\n" +
                        "• Burning mouth and throat\n" +
                        "• Demineralization of bone especially in the spine, pelvis, and lower extremities\n" +
                        "• Diarrhea\n" +
                        "• Nervousness"
            }
            "Vitamin E (Tocopherol)" -> {
                text =  "• Beta thalassemia\n" +
                        "• BPH (Benign prostatic hypertrophy)\n" +
                        "• Cataracts\n" +
                        "• Cystic fibrosis\n" +
                        "• Decreased clotting time\n" +
                        "• Dry skin\n" +
                        "• Easy bruising\n" +
                        "• Eczema\n" +
                        "• Elevated heavy metals\n" +
                        "• Elevated indirect bilirubin\n" +
                        "• Fibrocystic breasts disease\n" +
                        "• Growing pains\n" +
                        "• Hot flashes\n" +
                        "• Osgood-Schlatter disease\n" +
                        "• PMS (Premenstrual Syndrome)\n" +
                        "• Poor wound healing\n" +
                        "• Psoriasis\n" +
                        "• Sickle cell anemia"
            }
            "Vitamin K (Quinones)" -> {
                text =  "• Easy bleeding\n" +
                        "• In children, spontaneous nose bleeds\n" +
                        "• Osteoporosis symptoms"
            }
        }
        val ss = SpannableString(text)
        binding.contentData.text = ss
    }//

    private fun setFoodSource(heading: String) {
        binding.subHeading.text = "Food Sources"
        var text = ""
        when(heading){
            "Manganese" -> {
                text = "• Avocado\n" +
                        "• Blackberries\n" +
                        "• Blueberries\n" +
                        "• Fruits - moderate amounts\n" +
                        "• Nuts - especially hazelnuts and pecans\n" +
                        "• Tea\n" +
                        "• Seaweed\n" +
                        "• Seeds\n" +
                        "• Vegetables - moderate amounts\n" +
                        "• Whole grains - especially oatmeal, buckwheat, and whole wheat"
            }
            "Boron"->{
                text = "• Green leafy vegetables, e.g., cabbage, beet green, broccoli\n" +
                        "• Legumes\n" +
                        "• Non-citrus fruits, e.g., apples, peaches, cherries, grapes, pears\n" +
                        "• Nuts"
            }
            "Calcium" -> {
                text = "• Almonds: 1/2 cup (186 mg.)\n" +
                        "• Blackstrap molasses 1 Tbl. (171 mg.)\n" +
                        "• Buttermilk 8 oz. (290 mg.)\n" +
                        "• Cheddar cheese 3.5 oz. (721 mg.)\n" +
                        "• Clove of garlic large (167 mg.)\n" +
                        "• Cow's milk 8 oz. (517 mg.)\n" +
                        "• Filberts 1/2 cup (132 mg.)\n" +
                        "• Goat's milk 8 oz. (335 mg.)\n" +
                        "• Sardines, salmon 1/2 pound (1050 mg.)\n" +
                        "• Sesame seeds 1/2 cup (683 mg.)\n" +
                        "• Shrimp 1/2 pound (290 mg.)\n" +
                        "• Tofu 3.5 oz. (128 mg.)\n" +
                        "• Trout 1/2 pound (545 mg.)\n" +
                        "• Yogurt 8 oz. (302 mg.)"
            }
            "Chromium" -> {
                text = "• Apples\n" +
                        "• Bananas\n" +
                        "• Brewer's yeast\n" +
                        "• Calf liver\n" +
                        "• Carrots\n" +
                        "• Chicken\n" +
                        "• Cheeses\n" +
                        "• Cornmeal\n" +
                        "• Oysters\n" +
                        "• Peppers, green\n" +
                        "• Potato with skin\n" +
                        "• Seafood\n" +
                        "• Whole grain bread\n" +
                        "• Whole grain rye bread"
            }
            "Cobalt" -> {
                text = "• Beer\n" +
                        "• Organ meats\n" +
                        "• Peanuts\n" +
                        "• Peas\n" +
                        "• Salmon\n" +
                        "• Sardines"
            }
            "Copper" -> {
                text = "• Brazils\n" +
                        "• Cashews\n" +
                        "• Dried fruits\n" +
                        "• Mushrooms\n" +
                        "• Organ meats\n" +
                        "• Sesame seeds\n" +
                        "• Shellfish\n" +
                        "• Walnuts\n" +
                        "• Yeast"
            }
            "Germanium" -> {
                text = "• Beans\n" +
                        "• Chlorella\n" +
                        "• Garlic\n" +
                        "• Ginseng\n" +
                        "• Shiitake mushrooms\n" +
                        "• Tuna\n" +
                        "• Vegetables\n" +
                        "• Water chestnut\n" +
                        "• Wheat bran"
            }
            "Iodine" -> {
                text = "• Seafoods:\n" +
                        "• Dulse\n" +
                        "• Freshwater fish\n" +
                        "• Kelp\n" +
                        "• Saltwater fish"
            }
            "Iron" ->{
                text = "• Amaranth, cooked\n" +
                        "• Beef liver\n" +
                        "• Black strap molasses\n" +
                        "• Ground beef\n" +
                        "• Lentils, cooked\n" +
                        "• Oysters\n" +
                        "• Prune juice\n" +
                        "• Pumpkin seeds\n" +
                        "• Rice bran\n" +
                        "• Rice polishings\n" +
                        "• Roast beef\n" +
                        "• Sesame meal\n" +
                        "• Spinach\n" +
                        "• Sunflower seeds\n" +
                        "• Swiss chard\n" +
                        "• Tofu"
            }
            "Lithium" -> {
                text = "• Beef liver\n" +
                        "• Eggplant\n" +
                        "• Grains\n" +
                        "• Leafy vegetables\n" +
                        "• Legumes\n" +
                        "• Potatoes\n" +
                        "• Seafood\n" +
                        "• Tomatoes\n" +
                        "• Yeast"
            }
            "Magnesium" -> {
                text = "• 200 - 400 mg./100 gm.:\n" +
                        "• Buckwheat\n" +
                        "• Nuts - almonds, cashews, brazil\n" +
                        "• Seeds - sunflower, sesame, pumpkin\n" +
                        "• Wheat bran\n" +
                        "• Wheat germ\n" +
                        "• 100 - 200 mg./100 gm.:\n" +
                        "• Barley\n" +
                        "• Brown rice\n" +
                        "• Carrots\n" +
                        "• Corn\n" +
                        "• Nuts - walnuts, pecans, filberts\n" +
                        "• Oats\n" +
                        "• Peas\n" +
                        "• Rye\n" +
                        "• Wheat"
            }
            "Molybdenum" -> {
                text = "• Barley\n" +
                        "• Brown rice\n" +
                        "• Cantaloupe\n" +
                        "• Green beans\n" +
                        "• Green pea\n" +
                        "• Lamb\n" +
                        "• Lentils\n" +
                        "• Split pea\n" +
                        "• Squash"
            }
            "Nickel" -> {
                text = "• Banana\n" +
                        "• Beet greens\n" +
                        "• Cider\n" +
                        "• Clams\n" +
                        "• Kale\n" +
                        "• Kidney beans\n" +
                        "• Lentils\n" +
                        "• Navy bean\n" +
                        "• Pea\n" +
                        "• Peanuts\n" +
                        "• Raisins\n" +
                        "• Rhubarb\n" +
                        "• Spinach\n" +
                        "• Swiss chard"
            }
            "Phosphorus" -> {
                text = "• Carbonated soft drinks\n" +
                        "• Fish\n" +
                        "• Food additives\n" +
                        "• Milk and dairy products\n" +
                        "• Meat"
            }
            "Potassium" -> {
                text = "• Fish: cod, flounder, salmon, tuna, haddock\n" +
                        "• Fruits: banana, apple, orange, cantaloupe, apricot, peach, plum, strawberry\n" +
                        "• Unprocessed meats: chicken (white meat), lamb, beef, pork\n" +
                        "• Vegetables: carrot, potato, asparagus, avocado, lima bean, spinach, tomato"
            }
            "Selenium" -> {
                text = "• Animal sources found often as selenomethionine\n" +
                        "• Found in protein fraction of foods: organ meats, fish, whole grains, brewers yeast"
            }
            "Silicon" -> {
                text = "• High fiber foods\n" +
                        "• Rice\n" +
                        "• Oats\n" +
                        "• Whole wheat\n" +
                        "• Barley\n" +
                        "• Raisins\n" +
                        "• Turnips\n" +
                        "• Beets\n" +
                        "• Soybeans\n" +
                        "• Beans"
            }
            "Sodium" -> {
                text = "• Bacon\n" +
                        "• Smoked fish\n" +
                        "• Cheeses\n" +
                        "• Processed foods\n" +
                        "• Anchovy paste\n" +
                        "• Soy sauce"
            }
            "Tin" -> {
                text = "• Canned foods, especially:\n" +
                        "• Tomato juice in unlacquered can\n" +
                        "• Orange juice in unlacquered can\n" +
                        "• Pineapple juice in unlacquered can"
            }
            "Vanadium" -> {
                text = "• Buckwheat groats\n" +
                        "• Oats\n" +
                        "• Corn\n" +
                        "• Safflower oil\n" +
                        "• Shellfish\n" +
                        "• Mushrooms\n" +
                        "• Tomato\n" +
                        "• Carrot\n" +
                        "• Spices: dill seeds, parsley, black pepper\n" +
                        "• Olive oil"
            }
            "Zinc" -> {
                text = "• Oysters\n" +
                        "• Meats\n" +
                        "• Eggs (mostly in the yolk)\n" +
                        "• Seafood\n" +
                        "• Grains: soy meal, wheat bran, buckwheat groats, millet rice bran, whole wheat flour, oatmeal, brown rice, corn meal\n" +
                        "• Legumes: black-eyed peas, green peas, garbonzos, lentils, limas\n" +
                        "• Seeds: pumpkin and peanuts\n" +
                        "• Spinach\n" +
                        "• Sweet corn\n" +
                        "• Onions"
            }
            "Vitamin A (Retinol)" -> {
                text = "• Apricots 10 med. halves (6,000 I.U.)\n" +
                        "• Beef liver 3 oz. (45,000 I.U.)\n" +
                        "• Broccoli 1 med. stalk (4,500 I.U.)\n" +
                        "• Cantaloupe 1/2 med. (9,000 I.U.)\n" +
                        "• Carrot raw 1 med. (11,000 I.U.)\n" +
                        "• Chicken liver 3 oz. (27,000 I.U.)\n" +
                        "• Mango 1 med. (8,000 I.U.)\n" +
                        "• Papaya 1 med. (6,100 I.U.)\n" +
                        "• Pumpkin cooked 1/2 cup (8,000 I.U.)\n" +
                        "• Pork liver 3 oz. (12,000 I.U.)\n" +
                        "• Spinach 1/2 cup (7,3000 I.U.)\n" +
                        "• Sweet potato 1 med. (12,000 I.U.)\n" +
                        "• Winter squash 1/2 cup (4,300 I.U.)"
            }
            "Beta Carotene (Carotenoids)" -> {
                text = "• Dark green leafy vegetables - spinach, green peppers, collards, etc.\n" +
                        "• Fruits - apricots, papayas, lemons, oranges, watermelons, apples, peaches\n" +
                        "• Red vegetables - red peppers, tomatoes\n" +
                        "• Yellow vegetables - corn, squash, sweet potatoes, carrots"
            }
            "Vitamin B1 (Thiamine)" -> {
                text = "• Beef kidney 3 oz. (0.43 mg.)\n" +
                        "• Beef liver 3 oz. (0.22 mg.)\n" +
                        "• Brewer's yeast 1 Tbl. (1.25 mg.)\n" +
                        "• Brown rice, raw 1/4 cup (0.17 mg.)\n" +
                        "• Chick peas, dried 1/4 cup (0.16 mg.)\n" +
                        "• Kidney beans 1/4 cup (0.24 mg.)\n" +
                        "• Navy beans, dried 1/4 cup (0.33 mg.)\n" +
                        "• Rolled oats, cooked 1 cup (0.19 mg.)\n" +
                        "• Rye flour, dark 1/4 cup (0.20 mg.)\n" +
                        "• Soy flour 1/4 cup (0.27 mg.)\n" +
                        "• Soybeans, dried 1/4 cup (0.58 mg.)\n" +
                        "• Sunflower seeds 1/4 cup (0.72 mg.)\n" +
                        "• Wheat germ, toasted 1/4 cup (0.44 mg.)\n" +
                        "• Whole wheat flour 1/4 cup (0.17 mg.)"
            }
            "Vitamin B2 (Riboflavin)" -> {
                text = "• Almonds 1/4 cup (0.3 mg.)\n" +
                        "• Beef heart 3 oz. (1.1 mg.)\n" +
                        "• Beef kidney 3 oz. (4.1 mg.)\n" +
                        "• Beef liver 3 oz. (3.6 mg.)\n" +
                        "• Brewer's yeast 1 Tbl. (0.3 mg.)\n" +
                        "• Brie cheese 2 oz. (0.3 mg.)\n" +
                        "• Broccoli, cooked 1 medium stalk (0.4 mg.)\n" +
                        "• Calf heart 3 oz. (1.2 mg.)\n" +
                        "• Camembert cheese 2 oz. (0.3 mg.)\n" +
                        "• Chicken liver 3 oz. (1.5 mg.)\n" +
                        "• Milk, whole 1 cup (0.4 mg.)\n" +
                        "• Rice, wild raw 1/4 cup (0.2 mg.)\n" +
                        "• Roquefort cheese 2 oz. (0.3 mg.)\n" +
                        "• Yogurt 1 cup (0.5 mg.)"
            }
            "Vitamin B3 (Niacin)" -> {
                text = "• Beef 3 oz. (3.9 mg.)\n" +
                        "• Beef kidney 3 oz. (9 mg.)\n" +
                        "• Beef liver 3 oz. (14 mg.)\n" +
                        "• Brewer's yeast 1 Tbl. (3 mg.)\n" +
                        "• Brown rice 1/4 cup (2.5 mg.)\n" +
                        "• Chicken, light 3 oz. (10 mg.)\n" +
                        "• Chicken liver 3 oz. (3.8 mg.)\n" +
                        "• Cod 3 oz. (2.5 mg.)\n" +
                        "• Halibut 3 oz. (7 mg.)\n" +
                        "• Peanuts 1/4 cup (6 mg.)\n" +
                        "• Salmon steak 3 oz. (8 mg.)\n" +
                        "• Sunflower seeds 1/4 cup (2.4 mg.)\n" +
                        "• Swordfish 3 oz. (8.5 mg.)\n" +
                        "• Tuna, canned 3 oz. (11 mg.)"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text = "• Beef liver 3 oz. (4.8 mg.)\n" +
                        "• Chicken liver 3 oz. (4.6 mg.)\n" +
                        "• Beef kidney 3 oz. (2.6 mg.)\n" +
                        "• Turkey, dark 3 oz. (1.1 mg.)\n" +
                        "• Brewer's yeast 1 T. (1.0 mg.)\n" +
                        "• Peas 1/4 cup (1.0 mg.)\n" +
                        "• Peanuts 1/4 cup (1.0 mg.)\n" +
                        "• Chicken, dark 3 oz. (0.9 mg.)\n" +
                        "• Egg, hard cooked 1 large (0.9 mg.)\n" +
                        "• Rice brown. cooked 1 cup (0.9 mg.)\n" +
                        "• Sweet corn 1 med. ear (0.8 mg.)\n" +
                        "• Beef, lean 3 oz. (0.7 mg.)\n" +
                        "• Potato, sweet 1 med. (0.7 mg.)\n" +
                        "• Cashews 1/4 cup (0.6 mg.)"
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text = "• 100% bran cereal 1 cup (2.1 mg.)\n" +
                        "• 40% bran flakes cereal 1 cup (0.80 mg.)\n" +
                        "• Avocado 1 med. (0.56 mg.)\n" +
                        "• Banana 1 med. (0.66 mg.)\n" +
                        "• Beef liver 3 oz. (0.47 mg.)\n" +
                        "• Chicken, light meat without skin 3 oz. (0.51 mg.)\n" +
                        "• Pork loin chop broiled 3 oz. (0.78 mg.)\n" +
                        "• Salmon, raw 3 oz. (0.63 mg.)\n" +
                        "• Sunflower seeds 1/4 cup (0.45 mg.)\n" +
                        "• Tomato juice 1 cup (0.47 mg.)\n" +
                        "• Trout - rainbow or steelhead, raw 3 oz. (0.45 mg.)\n" +
                        "• Turkey, light meat without skin 3 oz. (0.48 mg.)\n" +
                        "• Watermelon 1 slice (0.69 mg.)"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text = "• Beef 3 oz. (2.1 mcg.)\n" +
                        "• Beef liver 3 oz. (94 mcg.)\n" +
                        "• Brewer's yeast 2 Tbl. (2.0 mcg.)\n" +
                        "• Cheese 3 oz. (0.9 mcg.)\n" +
                        "• Chicken 3 oz. (0.3 mcg.)\n" +
                        "• Clams 3 oz. (59 mcg.)\n" +
                        "• Egg 1 large (0.6 mcg.)\n" +
                        "• Halibut 3 oz. (0.8 mcg.)\n" +
                        "• Lamb 3 oz. (2.6 mcg.)\n" +
                        "• Lobster 3 oz. (2.5 mcg.)\n" +
                        "• Milk 8 oz. (0.9 mcg.)\n" +
                        "• Salmon steak 3 oz. (3.0 mcg.)\n" +
                        "• Tuna, canned 3 oz. (1.3 mcg.)"
            }
            "Biotin" -> {
                text = "• Calf liver 3 oz. (45 mcg.)\n" +
                        "• Camembert cheese 2 oz. (3 mcg.)\n" +
                        "• Chicken, dark 3 oz. (3 mcg.)\n" +
                        "• Chicken liver 3 oz. (146 mcg.)\n" +
                        "• Cod 3 oz. (3 mcg.)\n" +
                        "• Egg, hard cooked 1 large (12 mcg.)\n" +
                        "• Haddock 3 oz. (5 mcg.)\n" +
                        "• Halibut 3 oz. (5 mcg.)\n" +
                        "• Milk 1 cup (5 mcg.)\n" +
                        "• Lamb kidney 3 oz. (33 mcg.)\n" +
                        "• Rolled oats, uncooked 1/2 cup (15 mcg.)\n" +
                        "• Salmon 3 oz. (3 mcg.)\n" +
                        "• Tuna, canned 3 oz. (3 mcg.)"
            }
            "Folate" -> {
                text = "• Beef liver 3 oz. (123 mcg.)\n" +
                        "• Beets 1/2 cup (67 mcg.)\n" +
                        "• Black-eyed peas 1/2 cup (100 mcg.)\n" +
                        "• Brewer's yeast 1 Tbl. (313 mcg.)\n" +
                        "• Broccoli 1/2 cup (36 mcg.)\n" +
                        "• Brussels sprouts 4 (39 mcg.)\n" +
                        "• Cantaloupe 1/2 med. (80 mcg.)\n" +
                        "• Chicken liver 3 oz. (645 mcg.)\n" +
                        "• Egg yolk 1 med. (75 mcg.)\n" +
                        "• Orange juice 1 cup (135 mcg.)\n" +
                        "• Romaine lettuce 1 cup (100 mcg.)\n" +
                        "• Wheat bran 1 oz. (61 mcg.)"
            }
            "Choline (Lecithin)" -> {
                text = "• Egg yolk\n" +
                        "• Legumes\n" +
                        "• Milk\n" +
                        "• Muscle meats\n" +
                        "• Organ meats\n" +
                        "• Whole grain cereals"
            }
            "PABA (Para-aminobenzoic Acid)" -> {
                text = "• Bran\n" +
                        "• Brewer's yeast\n" +
                        "• Eggs\n" +
                        "• Liver\n" +
                        "• Milk\n" +
                        "• Molasses\n" +
                        "• Organ and muscle meats\n" +
                        "• Rice\n" +
                        "• Yeast\n" +
                        "• Wheat germ"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text = "• Broccoli, raw, chopped 1/2 cup (41 mg.)\n" +
                        "• Brussels sprouts, raw 4 (65 mg.)\n" +
                        "• Cantaloupe 1/4 (56 mg.)\n" +
                        "• Green peppers, raw, chopped 1/2 cup (64 mg.)\n" +
                        "• Grapefruit 1/2 (39 mg.)\n" +
                        "• Grapefruit juice, fresh 1 cup (94 mg.)\n" +
                        "• Guava 1/2 (83 mg.)\n" +
                        "• Kiwi fruit 1 med .(75 mg.)\n" +
                        "• Orange 1 (70 mg.)\n" +
                        "• Orange juice, freshly squeezed 1 cup (124 mg.)\n" +
                        "• Papaya 1/4 med. (94 mg.)\n" +
                        "• Strawberries 1/2 cup (42 mg.)\n" +
                        "• Tomato juice 1 cup (45 mg.)\n" +
                        "• Watermelon 1/16 (47 mg.)"
            }
            "Vitamin D (Cholecalciferol)" -> {
                text = "• Beef 100 gm. (9-25 I.U.)\n" +
                        "• Butter 100 gm. (35 I.U.)\n" +
                        "• Chicken 100 gm. (60 I.U.)\n" +
                        "• Cream 100 gm. (50 I.U.)\n" +
                        "• Egg yolk 100 gm. (25 I.U.)\n" +
                        "• Halibut 100 gm. (44 I.U.)\n" +
                        "• Herring 100 gm. (320 I.U.)\n" +
                        "• Lamb 100 gm. (20 I.U.)\n" +
                        "• Mackerel 100 gm. (1100 I.U.)\n" +
                        "• Pork 100 gm. (45 I.U.)\n" +
                        "• Sunshine - 20 minutes per day on bare skin\n" +
                        "• Salmon 100 gm. (150 - 550 I.U.)\n" +
                        "• Shrimp 100 gm. (150 I.U.)\n" +
                        "• Sardines 100 gm. (1150-1570 I. U.)"
            }
            "Vitamin E (Tocopherol)" -> {
                text = "• Almonds 1/4 cup (12.7 I.U.)\n" +
                        "• Cod liver oil 1 Tbl. (3.9 I.U.)\n" +
                        "• Corn oil 1 Tbl. (4.8 I.U.)\n" +
                        "• Flax oil 1 Tbl. (7.5 I.U.)\n" +
                        "• Hazelnuts 1/4 cup (12.0 I.U.)\n" +
                        "• Peanuts 1/4 cup (4.9 I.U.)\n" +
                        "• Peanut butter 2 Tbl. (3.8 I.U.)\n" +
                        "• Pecans 1/4 cup (12.5 I.U.)\n" +
                        "• Safflower oil 1 Tbl. (7.9 I.U.)\n" +
                        "• Sunflower oil 1 Tbl. (12.7 I.U.)\n" +
                        "• Sunflower seeds 1/4 cup (26.8 I.U.)\n" +
                        "• Wheat germ 1/4 cup (6.4 I.U.)\n" +
                        "• Wheat germ oil 1 Tbl. (37.2 I.U.)\n" +
                        "• Wild purslane (leafy veg) 1 cup (9.9 I.U.)"
            }
            "Vitamin K (Quinones)" -> {
                text = "• Asparagus 4 med. spears (34 mcg.)\n" +
                        "• Beef liver 3 oz. (78 mcg.)\n" +
                        "• Broccoli, cooked 1 med. stalk (360 mcg.)\n" +
                        "• Cabbage, cooked 1/2 cup (91 mcg.)\n" +
                        "• Cheese 2 oz. (20 mcg.)\n" +
                        "• Green beans 1/2 cup (9 mcg.)\n" +
                        "• Green tea 4 tsp. (72 mcg.)\n" +
                        "• Lettuce, chopped 1 cup (71 mcg.)\n" +
                        "• Peach 1 med. (15 mcg.)\n" +
                        "• Peas 1/2 cup (15 mcg.)\n" +
                        "• Oats, cooked 1 large bowl (30 mcg.)\n" +
                        "• Spinach, chopped raw 1 cup (49 mcg.)\n" +
                        "• Turnip greens, cooked 1/2 cup (471 mcg.)\n" +
                        "• Watercress, chopped 1/4 cup (18 mcg.)"
            }
        }
        val ss = SpannableString(text)
        binding.contentData.text = ss
    }//

    private fun setLabs(heading: String) {
        binding.subHeading.text = "Labs:"
        var text = ""
        when(heading){
            "Manganese" -> {
                text = "• Whole blood manganese - preferred\n" +
                        "• Hair analysis varies with graying"
            }
            "Boron"->{
                text = "• Hair analysis inaccurate\n" +
                        "• Total blood levels are very inaccurate for assessing calcium"
            }
            "Copper" -> {
                text = "• RBC SOD activity - best test for copper\n" +
                        "• Urine, hair, serum ceruloplasmin too variable or still experimental"
            }
            "Magnesium" -> {
                text = "• Hair magnesium - too variable\n" +
                        "• Magnesium challenge - intravenous magnesium (.2 mEq./kg. over 4 hours)\n" +
                        "• Serum and RBC levels inaccurate unless severe depletion and can alter depending on age of RBCs\n" +
                        "• WBC magnesium - better indicator of tissue magnesium"
            }
            "Potassium" -> {
                text = "• RBC potassium - for correlating EKG changes\n" +
                        "• Serum potassium - 3.5 - 5.0 mEq./L. - reasonable with long term body stores\n" +
                        "• Hair potassium - poor correlation"
            }
            "Selenium" -> {
                text = "• Hair analysis: acceptable level 1.0 - 5.0 ppm.\n" +
                        "• Plasma: varies with intake but does not reflect body stores\n" +
                        "• RBC selenium and glutathione peroxidase activity: these have also been used, but more variable than hair analysis"
            }
            "Silicon" -> {
                text = "• Due to limited data, this information is unavailable"
            }
            "Sodium" -> {
                text = "• Limited data"
            }
            "Zinc" -> {
                text = "• WBC - best indicator of tissue stores but requires lots of blood to run the test\n" +
                        "• Sweat zinc - good indicator of tissue stores\n" +
                        "• Zinc taste test - moderate test"
            }
            "Vitamin A (Retinol)" -> {
                text = "• Plasma retinol - 15 - 60 mcg. / dl."
            }
            "Beta Carotene (Carotenoids)" -> {
                text = "• Plasma Beta Carotene - 50 - 250 mcg. / dl."
            }
            "Vitamin B1 (Thiamine)" -> {
                text = "• RBC transketolase"
            }
            "Vitamin B2 (Riboflavin)" -> {
                text = "• RBC glutathione reductase-FAD-effect"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text = "• Unknown"
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text = "• Erythrocyte Glutamate Oxaloacetic Transaminase Test (EGOT Test)\n" +
                        "• Tryptophan Load Test"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text = "• 24 hour urine MMA - very sensitive and very expensive\n" +
                        "• Schilling test - used to assess deficiency cause\n" +
                        "• Serum B12 (microbial assay)"
            }
            "Folate" -> {
                text = "• FIGLU (Formimino Glutamic Acid Test)\n" +
                        "• Hypersegmented neutrophils\n" +
                        "• Macrocytic red blood cells\n" +
                        "• Serum folate (RIA)"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text = "Test:\n" +
                        "• Leukocyte: 30 ug./108 WBCs\n" +
                        "• Load Test: 0.3 - 2.0 mg./hr. in control; 24 - 49 mg./hr. after 500 mg.\n" +
                        "• Serum: >0.3 mg./dl."
            }
            "Vitamin D (Cholecalciferol)" -> {
                text = "• 1, 25 dihydroxycholecalciferol\n" +
                        "• Cholecalciferol (D3)"
            }
            "Vitamin E (Tocopherol)" -> {
                text = "• RBC hemolysis in H2O2: acceptable level < 10%\n" +
                        "• Serum tocopherol: acceptable level > 0.7 mg./100 dl."
            }
            "Vitamin K (Quinones)" -> {
                text = "• Abnormal prothrombin antigen assay"
            }
        }
        val ss = SpannableString(text)
        binding.contentData.text = ss
    }//

    private fun setSuppliment(heading: String) {
        binding.subHeading.text = "Supplement Forms:"
        var text = ""
        when(heading){
            "Manganese" -> {
                text = "• Manganese carbonate\n" +
                        "• Manganese chloride\n" +
                        "• Manganese gluconate\n" +
                        "• Manganese oxide"
            }
            "Boron"->{
                text = "• May be in combination with calcium and magnesium\n" +
                        "• Sodium tetraborate decahydrate"
            }
            "Calcium" -> {
                text = "• Bone meal - highly absorbable but also contains phosphorus\n" +
                        "• Calcium carbonate - contains greatest amount of elemental calcium (40%)\n" +
                        "• Calcium citrate - most absorbable especially in elderly, but most expensive\n" +
                        "• Calcium chelates - calcium bound to amino acid, good absorption\n" +
                        "• Calcium chloride - good absorption\n" +
                        "• Calcium gluconate - good absorption but low in amount of elemental calcium\n" +
                        "• Calcium lactate - good absorption but low in amount of elemental calcium\n" +
                        "• Dolomite - contains both calcium and magnesium but is the least absorbable"
            }
            "Chromium" -> {
                text = "• Brewer's yeast: 1 Tbl./day\n" +
                        "• Chromium picolinate\n" +
                        "• Chromium polynicotinate"
            }
            "Cobalt" -> {
                text = "• Should be used incorporated with vitamin B12"
            }
            "Copper" -> {
                text = "• Copper aspartate - good absorption\n" +
                        "• Copper citrate - good absorption\n" +
                        "• Copper gluconate\n" +
                        "• Copper sulfate - irritating to the digestive tract\n" +
                        "• Individual or included in multi vitamin or mineral"
            }
            "Germanium" -> {
                text = "• Inorganic (toxic):\n" +
                        "• GeO2\n" +
                        "• Ge lactate-citrate\n" +
                        "• Organic (although synthesized):\n" +
                        "• Ge-132 (sesquioxide)\n" +
                        "• Spirogermanium"
            }
            "Iodine" -> {
                text = "• Aqueous iodine\n" +
                        "• Caseinated iodine (iodaminol)\n" +
                        "• Elemental diatomic or molecular iodine\n" +
                        "• Iodinated salt\n" +
                        "• Lugol's Solution (sodium iodide)\n" +
                        "• SSKI (saturated solution of potassium iodine)"
            }
            "Iron" ->{
                text = "• Iron fumarate\n" +
                        "• Iron gluconate or iron lactate (low amount of iron, very expensive)\n" +
                        "• Iron sulfate (can cause constipation)"
            }
            "Lithium" -> {
                text = "• Elemental lithium\n" +
                        "• Lithium carbonate"
            }
            "Magnesium" -> {
                text = "• Chelated magnesium: magnesium bound to an amino acid\n" +
                        "• Magnesium acetate\n" +
                        "• Magnesium carbonate: 40% magnesium\n" +
                        "• Magnesium gluconate\n" +
                        "• Magnesium oxide: 60% magnesium, purest form\n" +
                        "• Magnesium sulfate"
            }
            "Molybdenum" -> {
                text = "• Found in some vitamin/mineral supplements"
            }
            "Nickel" -> {
                text = "• Usually not found in supplement form"
            }
            "Phosphorus" -> {
                text = "• May be found in vitamin/mineral supplements\n" +
                        "• Most people need to reduce phosphorus rather than supplement it"
            }
            "Potassium" -> {
                text = "• Absorption not a problem - found in many supplement forms"
            }
            "Selenium" -> {
                text = "• Selenomethionine - extracted from ocean plants or selenium-rich yeast; least toxic and most absorbable\n" +
                        "• Sodium selenite\n" +
                        "• Sodium selenate"
            }
            "Silicon" -> {
                text = "• Usually found in specific 'bone-health' formulas"
            }
            "Sodium" -> {
                text = "• Table salt"
            }
            "Tin" -> {
                text = "• Never found in supplement form"
            }
            "Vanadium" -> {
                text = "• Found in vitamin/mineral supplements"
            }
            "Zinc" -> {
                text = "• Individual or multivitamin or mineral\n" +
                        "• Zinc picolinate - very absorbable but very expensive\n" +
                        "• Zinc mono - methionine\n" +
                        "• Zinc aspartate\n" +
                        "• Zinc citrate - better than gluconate, sulfate, oratate\n" +
                        "• Zinc sulfate - least expensive but very irritating to the stomach\n" +
                        "• Zinc oratate - absorbable but very expensive"
            }
            "Vitamin A (Retinol)" -> {
                text = "• Palmitate is the synthetic form and water soluble. This may be best for patients with fat absorption problems.\n" +
                        "• Usually contains beta carotene also"
            }
            "Beta Carotene (Carotenoids)" -> {
                text = "• Alpha and beta carotene from the algae Dunaliella\n" +
                        "• Palm oil - best form\n" +
                        "• Synthetic - all are trans beta carotene"
            }
            "Vitamin B1 (Thiamine)" -> {
                text = "• B-complex\n" +
                        "• Thiamine hydrochloride\n" +
                        "• Thiamine mononitrate"
            }
            "Vitamin B2 (Riboflavin)" -> {
                text = "• Available individually and in B-complex"
            }
            "Vitamin B3 (Niacin)" -> {
                text = "• Do not use time released niacin - some cases of fulminant hepatitis have been reported with this form\n" +
                        "• Inositol hexa-nicotinate (contains 6 molecules of niacin and 1 molecule of inositol) - it does not cause flushing and does not appear hepatotoxic\n" +
                        "• Niacin and niacinamide forms are available either separately or together\n" +
                        "• Niacin is recommended for circulatory problems and lowering triglycerides and cholesterol"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text = "• Individual capsule or in a multivitamin capsule\n" +
                        "• Calcium pantothenate - 92% pantothenic acid and 8% calcium"
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text = "• Pyridoxine 5 phosphate (the active form of vitamin B6) - better absorbed\n" +
                        "• Pyridoxine hydrochloride - most commonly available"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text = "• Cyanocobalamin - orally, but oral, sublingual, or intranasal administration of B12 is only rarely effective\n" +
                        "• Hydroxycobalamin - injectable - is longer acting and achieves higher B12 levels than cyanocobalamin"
            }
            "Biotin" -> {
                text = "• Included in most B-complex formulas"
            }
            "Folate" -> {
                text = "• Individual or part of a multivitamin formula"
            }
            "Choline (Lecithin)" -> {
                text = "• Usually included in B-complex vitamin formulas\n" +
                        "Individual:\n" +
                        "• Choline bitartrate\n" +
                        "• Choline dihydrogen citrate\n" +
                        "• Phosphatidyl choline (also known as lecithin)"
            }
            "Inositol" -> {
                text = "Individual:\n" +
                        "• Powdered - very expensive (Reports indicate inositol is used to cut cocaine so the price is extremely high)\n" +
                        "• Tablet - inexpensive\n" +
                        "• Usually included in B-complex vitamin formulas"
            }
            "PABA (Para-aminobenzoic Acid)" -> {
                text = "• Usually included in B-complex vitamin formulas"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text = "• Calcium ascorbate - buffered form of vitamin C\n" +
                        "• Chewable vitamin C - not recommended since it usually contains sugar and may cause the pH of saliva to be so low to cause leaching of calcium from tooth enamel\n" +
                        "• Ester C - very expensive but can be tolerated better by those who experience gastrointestinal side effects from other forms of vitamin C\n" +
                        "• Natural, inexpensive vitamin C is usually synthesized from starch, molasses or sago palm\n" +
                        "• \"Rose hips\" - the plant contains only 1% vitamin C, so most of the vitamin C in rose hips products is synthetic in origin (other constituents in rose hips may prove valuable)"
            }
            "Vitamin D (Cholecalciferol)" -> {
                text = "• 1, 25 dihydroxycholecalciferol - biologically active form of vitamin D for patients who cannot convert vitamin D\n" +
                        "• Vitamin D 2 - synthetic form\n" +
                        "• Vitamin D 3 - naturally occurring form"
            }
            "Vitamin K (Quinones)" -> {
                text = "• Widely available in foods and made by the intestines - no supplement is usually necessary unless a malabsorption or medical problem"
            }
        }
        val ss = SpannableString(text)
        binding.contentData.text = ss
    }//

    private fun setRequirement(heading: String) {
        binding.subHeading.text = "Requirements"
        var text = ""
        when(heading){
            "Manganese" -> {
                text =  "• RDA:\n" +
                        "None\n" +
                        "• Daily Optimal Intake:\n" +
                        "5 - 30 mg. for women and men\n" +
                        "3 mg. for children\n" +
                        "1.5 mg. for infants"
            }
            "Boron"->{
                text = "• RDA:\n" +
                        "Not yet considered essential\n" +
                        "• Daily Optimal Intake:\n" +
                        "2 - 6 mg."
            }
            "Calcium" -> {
                text = "• RDA:\n" +
                        "1,200 mg. for young adults\n" +
                        "• Daily Optimal Intake:\n" +
                        "1,200 mg. for young adult"
            }
            "Chromium" -> {
                text = "• RDA:\n" +
                        "50 - 200 mcg. for males and females over 11 years\n" +
                        "• Daily Optimal Intake:\n" +
                        "200 mcg. for males and females 11 - 18 years\n" +
                        "300 mcg. for males and females over 19 years"
            }
            "Cobalt" -> {
                text = "• RDA:\n" +
                        "1 mcg. incorporated with vitamin B12 for adults\n" +
                        "• Daily Optimal Intake:\n" +
                        "Not established"
            }
            "Copper" -> {
                text = "• FDA:\n" +
                        "2 - 3 mg. for adults\n" +
                        "1 - 1.5 mg. for children\n" +
                        "• Daily Optimal Intake:\n" +
                        "2 - 3 mg. for adults"
            }
            "Germanium" -> {
                text = "• RDA:\n" +
                        "None"
            }
            "Iodine" -> {
                text = "• RDA:\n" +
                        "150 mcg./day for adults\n" +
                        "175 mcg./day for pregnant women\n" +
                        "200 mcg./day for lactating women\n" +
                        "• Daily Optimal Intake:\n" +
                        "RDA values"
            }
            "Iron" ->{
                text = "• RDA:\n" +
                        "18 mg./day for females\n" +
                        "10 mg./day for males\n" +
                        "1 mg./kg. body weight for infants\n" +
                        "10 mg./day for 6 months to 3 years\n" +
                        "• Daily Optimal Intake:\n" +
                        "Variable"
            }
            "Lithium" -> {
                text = "• RDA:\n" +
                        "None\n" +
                        "• Average Intake (in US):\n" +
                        "100 mcg./day"
            }
            "Magnesium" -> {
                text = "• RDA:\n" +
                        "350 mg. for males\n" +
                        "300 mg. for females\n" +
                        "250 mg. for children\n" +
                        "• Daily Optimal Intake:\n" +
                        "500 - 750 mg. for both males and females"
            }
            "Molybdenum" -> {
                text = "• RDA:\n" +
                        "None\n" +
                        "• Average Intake (in U.S.):\n" +
                        "75 - 110 mcg./day"
            }
            "Nickel" -> {
                text = "• RDA:\n" +
                        "None\n" +
                        "• Average Intake (in U.S.):\n" +
                        "300 - 600 mcg./day"
            }
            "Phosphorus" -> {
                text = "• RDA:\n" +
                        "1,200 mg./day for 11 - 24 years\n" +
                        "800 mg./day for 25 and over\n" +
                        "1,200 mg./day for pregnant or lactating women\n" +
                        "• Daily Optimal Intake:\n" +
                        "Same as RDA"
            }
            "Potassium" -> {
                text = "• RDA:\n" +
                        "None\n" +
                        "• Daily Optimal Intake:\n" +
                        "1.9 - 5.6 gm."
            }
            "Selenium" -> {
                text = "• RDA:\n" +
                        "70 mcg. per day\n" +
                        "• Daily Optimal Intake:\n" +
                        "100 - 250 mcg./day\n" +
                        "• Therapeutic Dosage:\n" +
                        "400 mcg./day"
            }
            "Silicon" -> {
                text = "• RDA: none\n" +
                        "• Daily Optimal Intake: 20 - 50 mg."
            }
            "Sodium" -> {
                text = "• RDA: not established\n" +
                        "• Daily Optimal Intake: 1.1 - 3.3 gm./day for adults - this may still be too high"
            }
            "Tin" -> {
                text = "• RDA: None\n" +
                        "• Average Intake (in US): 3 - 4 mg./day"
            }
            "Vanadium" -> {
                text = "• RDA: none\n" +
                        "• Average Intake (in U.S.): 10 - 60 mcg./day"
            }
            "Zinc" -> {
                text = "• RDA:\n" +
                        "15 mg. adults\n" +
                        "5 mg. infants\n" +
                        "10 mg. up to 10 years\n" +
                        "20 mg. pregnant and lactation\n" +
                        "• Daily Optimal Intake:\n" +
                        "20 - 50 mg. for adults"
            }
            "Vitamin A (Retinol)" -> {
                text = "• RDA:\n" +
                        "5,000 I.U. for males\n" +
                        "4,000 I.U. for females\n" +
                        "5,000 I.U. for pregnancy\n" +
                        "• Daily Optimal Intake:\n" +
                        "10,000 - 50,000 I.U. for males and females"
            }
            "Beta Carotene (Carotenoids)" -> {
                text = "Carotenoids are a group of pigments that are foundnaturally in dark green, red and yellow fat-soluble compounds. Over 600 different carotenoids have been identified, with 30-50 having provitamin A activity. Alpha, gamma, and beta carotenes are converted primarily in the intestinal mucosa to vitamin A (retinol). Approximately 33% of beta carotene from food gets absorbed and only 33% of the absorbed beta carotene is converted to retinol."
            }
            "Vitamin B1 (Thiamine)" -> {
                text = "• RDA:\n" +
                        "1.0 - 1.4 mg.\n" +
                        "• Daily Optimal Intake:\n" +
                        "15 - 30 mg."
            }
            "Vitamin B2 (Riboflavin)" -> {
                text = "• RDA:\n" +
                        "1.2 - 1.6 mg.\n" +
                        "1.5 - 1.7 mg. for pregnancy and lactation\n" +
                        "• Daily Optimal Intake\n" +
                        "5 - 15 mg."
            }
            "Vitamin B3 (Niacin)" -> {
                text = "• RDA:\n" +
                        "13 - 18 mg.\n" +
                        "15 mg. pregnancy\n" +
                        "18 mg. lactation\n" +
                        "• Daily Optimal Intake:\n" +
                        "100 mg. (niacin and amide forms mixed)"
            }
            "Vitamin B5 (Pantothenic Acid)" -> {
                text = "• RDA:\n" +
                        "4 - 7 mg. per day is the estimated requirement\n" +
                        "• Daily Optimal Intake:\n" +
                        "100 - 1,000 mg."
            }
            "Vitamin B6 (Pyridoxine)" -> {
                text = "• RDA:\n" +
                        "2 mg. - 2.2 mg.\n" +
                        "Pregnancy/Lactation: 2.6 mg. - 2.7 mg.\n" +
                        "• Daily Optimal Intake:\n" +
                        "50 mg. for females\n" +
                        "35 mg. for males"
            }
            "Vitamin B12 (Cobalamin)" -> {
                text = "• RDA:\n" +
                        "3 mcg.\n" +
                        "• Daily Optimal Intake:\n" +
                        "100 - 300 mcg."
            }
            "Biotin" -> {
                text = "• RDA:\n" +
                        "100 - 200 mcg.\n" +
                        "• Daily Optimal Intake:\n" +
                        "300 mcg."
            }
            "Folate" -> {
                text = "• RDA:\n" +
                        "400 mcg. for adults\n" +
                        "800 mcg. for pregnancy\n" +
                        "500 mcg. for lactation\n" +
                        "• Daily Optimal Intake:\n" +
                        "400-2,000 mcg."
            }
            "Choline (Lecithin)" -> {
                text = "Have not been established - choline is not considered an essential vitamin since the body can synthesize it.\n" +
                        "• Daily Optimal Intake:\n" +
                        "25 - 300 mg. for adults"
            }
            "Inositol" -> {
                text = "• Have not been established - inositol is not considered an essential vitamin since the body can synthesize it.\n" +
                        "• Daily Optimal Intake:\n" +
                        "25 - 300 mg. for adults"
            }
            "PABA (Para-aminobenzoic Acid)" -> {
                text = "• Have not been established\n" +
                        "PABA is not considered an essential vitamin since the body can synthesize it\n" +
                        "• Daily Optimal Intake:\n" +
                        "25 - 300 mg. for adults"
            }
            "Vitamin C (Ascorbic Acid)" -> {
                text = "• RDA:\n" +
                        "60 mg./day saturates RBCs but not the serum\n" +
                        "400 mg./day-serum level is >1.4 mg./dl. - note: vitamin C in adrenals is 50x that of serum\n" +
                        ">400 mg./day- increased tissue levels of vitamin C\n" +
                        "• Daily Optimal Intake:\n" +
                        "1 - 5 gm."
            }
            "Vitamin D (Cholecalciferol)" -> {
                text = "• RDA:\n" +
                        "200 I.U. for adults\n" +
                        "400 I.U. for infants, children, adolescents, pregnant and lactating women\n" +
                        "• Daily Optimal Intake:\n" +
                        "200 - 400 I.U."
            }
            "Vitamin E (Tocopherol)" -> {
                text = "• RDA:\n" +
                        "15 I.U./day\n" +
                        "• Daily optimal intake:\n" +
                        "600 I.U."
            }
            "Vitamin K (Quinones)" -> {
                text = "• RDA:\n" +
                        "None established\n" +
                        "• Daily Optimal Intake:\n" +
                        "750 mcg."
            }
        }
        val ss = SpannableString(text)
        binding.contentData.text = ss
    }//

    fun makeBold(ss : SpannableString,string:String,substr:String){
        if(string.indexOf(substr)!=-1 )
            ss.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD),string.indexOf(substr),string.indexOf(substr)+substr.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
    private fun createLink(ss: SpannableString, sub_str: String, string: String, activity: String, heading: String) {

        var index = string.indexOf(sub_str)
        while (index != -1) {
            val clickableSpan = object : ClickableSpan(){
                override fun onClick(widget: View) {
                    val intent : Intent
                    if(activity=="Condition"){
                        intent = Intent(this@VitaminMineralDetailActivity,ConditionDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Supplement"){
                        intent = Intent(this@VitaminMineralDetailActivity,SupplementDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Fiber"){
                        intent = Intent(this@VitaminMineralDetailActivity,FiberDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Vitamin"){
                        intent = Intent(this@VitaminMineralDetailActivity,VitaminMineralDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Botanical"){
                        intent = Intent(this@VitaminMineralDetailActivity,BotanicalDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(heading == "Fat"){
                        val intent = Intent(this@VitaminMineralDetailActivity,FattyAcidActivity::class.java)
                        startActivity(intent)
                    }
                }
            }

            ss.setSpan(clickableSpan,index,index+sub_str.length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            index = string.indexOf(sub_str, index + 1)
        }
    }
}