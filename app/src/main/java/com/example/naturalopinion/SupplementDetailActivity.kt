package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivitySupplementDetailBinding

class SupplementDetailActivity : AppCompatActivity() {
    lateinit var binding : ActivitySupplementDetailBinding
    var heading = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySupplementDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contentData.movementMethod = LinkMovementMethod.getInstance()


        heading = intent.getStringExtra("condition_name").toString()

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)



        binding.supplement.text = heading

        binding.backButton6.setOnClickListener { finish() }


        binding.description.setOnClickListener {
//            setDietData(heading)

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.description.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicity.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5


            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.function.strokeWidth = 5

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5
        }
        binding.plantFood.setOnClickListener {
//            setVitaminData(heading)
//            binding.contentData.text = setTextHTML(vitamin_detail)

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.plantFood.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicity.strokeWidth = 5

            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.function.strokeWidth = 5

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5
        }
        binding.function.setOnClickListener {
//            setSupplementData(heading)
//            binding.contentData.text = setTextHTML(supplements_detail)

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.function.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicity.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5


            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5
        }
        binding.indication.setOnClickListener {
//            setBotanicalData(heading)
//            binding.contentData.text = setTextHTML(botanical_detail)

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.indication.strokeWidth = 0

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicity.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5


            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.function.strokeWidth = 5

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5
        }
        binding.dosage.setOnClickListener {
//            setHomepathicData(heading)
//            binding.contentData.text = setTextHTML(homeopathic_detail)

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.dosage.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicity.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5


            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.function.strokeWidth = 5

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5
        }
        binding.signSymptom.setOnClickListener {
//            setTherapyData(heading)
//            binding.contentData.text = setTextHTML(other_therapy)


            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.signSymptom.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicity.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5


            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.function.strokeWidth = 5

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5
        }
        binding.deficiencyCause.setOnClickListener {
//            setRecommendedLabData(heading)
//            binding.contentData.text = setTextHTML(recommended_labs)

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.deficiencyCause.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicity.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5


            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.function.strokeWidth = 5

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5
        }

        binding.toxicity.setOnClickListener {
//            setDietData(heading)

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.toxicity.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5


            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.function.strokeWidth = 5

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5
        }
        binding.description.setOnClickListener {
//            setDietData(heading)

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.description.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicity.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5


            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.function.strokeWidth = 5

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5
        }
        binding.description.setOnClickListener {
//            setDietData(heading)

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.description.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5

            binding.toxicity.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.toxicityText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.toxicity.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5


            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.contraindiction.strokeWidth = 5

            binding.plantFood.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.plantFoodText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.plantFood.strokeWidth = 5

            binding.function.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.functionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.function.strokeWidth = 5

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCause.strokeWidth = 5
        }

        binding.reference.setOnClickListener { startActivity(Intent(this,ReferenceActivity::class.java)) }

    }

}