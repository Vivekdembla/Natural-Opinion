package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivitySupplementDetailBinding

class SupplementDetailActivity : AppCompatActivity() {
    lateinit var binding : ActivitySupplementDetailBinding
    var heading = ""
    lateinit var description_ss : SpannableString
    lateinit var plantFood_ss : SpannableString
    lateinit var function_ss : SpannableString
    lateinit var indication_ss : SpannableString
    lateinit var dosage_ss : SpannableString
    lateinit var sign_symptom_ss : SpannableString
    lateinit var deficiency_ss : SpannableString
    lateinit var toxic_ss : SpannableString
    lateinit var contra_indication_ss : SpannableString
    lateinit var drug_nutrition_ss : SpannableString
    lateinit var adverse_reaction_ss : SpannableString
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySupplementDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contentData.movementMethod = LinkMovementMethod.getInstance()


        heading = intent.getStringExtra("heading").toString()

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        binding.supplement.text = heading

        showNecessarySections(heading)

        binding.backButton6.setOnClickListener { finish() }


        binding.description.setOnClickListener {
            setDescription(heading)

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

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5
        }
        binding.plantFood.setOnClickListener {
            setPlantFoodData(heading)

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

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5
        }
        binding.function.setOnClickListener {
            setFunctionData(heading)

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

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5
        }
        binding.indication.setOnClickListener {
            setIndicationData(heading)

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

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5
        }
        binding.dosage.setOnClickListener {
            setDosageData(heading)

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

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5
        }
        binding.signSymptom.setOnClickListener {
            setSignSymptomData(heading)


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

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5
        }
        binding.deficiencyCause.setOnClickListener {
            setDeficiencyCauseData(heading)

            binding.deficiencyCause.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.deficiencyCauseText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.deficiencyCause.strokeWidth = 0

            binding.indication.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.indicationText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.indication.strokeWidth = 5

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5

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
            setToxicityData(heading)

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

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5
        }
        binding.contraindiction.setOnClickListener {
            setContraIndicationData(heading)

            binding.contraindiction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.contrainditionText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.contraindiction.strokeWidth = 0

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


            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5

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

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5
        }
        binding.drugNutrition.setOnClickListener {
            setDrugNutritionData(heading)

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.drugNutrition.strokeWidth = 0

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

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5
        }
        binding.adverseReaction.setOnClickListener {
            setAdverseReactionData(heading)

            binding.adverseReaction.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.adverseReactionText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.adverseReaction.strokeWidth = 0

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

            binding.dosage.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.dosageText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.dosage.strokeWidth = 5

            binding.signSymptom.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.signSymptomText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.signSymptom.strokeWidth = 5

            binding.drugNutrition.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.drugNutritionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.drugNutrition.strokeWidth = 5

            binding.description.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descriptionText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.description.strokeWidth = 5
        }

        binding.reference.setOnClickListener { startActivity(Intent(this,ReferenceActivity::class.java)) }

    }

    private fun setAdverseReactionData(heading: String) {
        var adverse_text = ""
        when(heading){
            "Acidophilus/Bifidus" ->{
                adverse_text = "• None"
                adverse_reaction_ss = SpannableString(adverse_text)
            }
            "Coenzyme Q10" -> {
                adverse_text = "• Generally well tolerated\n" +
                        "• Restrict during pregnancy and lactation because no studies have been done"
                adverse_reaction_ss = SpannableString(adverse_text)
            }
        }
        binding.subHeading.text = "Adverse Reactions and Toxicity"
        binding.contentData.text = adverse_reaction_ss
    }

    private fun setDrugNutritionData(heading: String) {
        var drug_text = ""
        when(heading){
            "Acidophilus/Bifidus" ->{
                drug_text = "• Alcohol negatively affects L. acidophilus and L. bifidus\n" +
                        "• Antibiotics negatively affects L. acidophilus and L. bifidus"
                drug_nutrition_ss = SpannableString(drug_text)
            }
            "Coenzyme Q10" -> {
                drug_text = "• Adriamycin, lovastatin, and other HMG CoA-reductase inhibitors may produce a deficiency of Co Q10\n" +
                        "• Coenzyme Q10 can be antagonized by tricyclic antidepressants and beta blockers\n" +
                        "• Coenzyme Q10, used with doxorubicin, lessens the cardiotoxicity and can double the anti-tumor effects of doxorubicin\n" +
                        "• Dymelor can cause a deficiency of Co Q10 which may lead to cardiac symptoms\n" +
                        "• Glyburide can cause a deficiency of Co Q10 and inhibits NADH oxidase, a coenzyme Q10 enzyme\n" +
                        "• Phenoformin can cause a deficiency of Co Q10\n" +
                        "• Tolazamide can cause a deficiency of Co Q10 with prolonged use"
                drug_nutrition_ss = SpannableString(drug_text)
            }
        }
        binding.subHeading.text = "Drug/Nutrient Interactions"
        binding.contentData.text = drug_nutrition_ss
    }

    private fun setContraIndicationData(heading: String) {
        when(heading){
            "Acidophilus/Bifidus" ->{

            }
        }
        binding.subHeading.text = "Contraindications"
    }

    private fun setToxicityData(heading: String) {
        when(heading){
            "Acidophilus/Bifidus" ->{

            }
        }
        binding.subHeading.text = "Toxicity and Side Effects"
    }

    private fun setDeficiencyCauseData(heading: String) {
        when(heading){
            "Acidophilus/Bifidus" ->{

            }
        }
    }

    private fun setSignSymptomData(heading: String) {
        when(heading){
            "Acidophilus/Bifidus" ->{

            }
        }
        binding.subHeading.text = "Dosage"
    }

    private fun setDosageData(heading: String) {
        var dosage_text = ""
        when(heading){
            "Acidophilus/Bifidus" ->{
                dosage_text = "• Based on the number of live bacteria\n" +
                        "• Daily: 1 - 10 billion viable L. acidophilus or L. bifidus"
                dosage_ss = SpannableString(dosage_text)
            }
            "Coenzyme Q10" -> {
                dosage_text = "• 20 - 150 mg. per day in divided doses\n" +
                        "• Adriamycin therapy: 100 mg. per day in divided doses beginning 3 - 5 days prior to treatment may help prevent cardiotoxicity"
                dosage_ss = SpannableString(dosage_text)
            }
        }
        binding.subHeading.text = "Dosage"
        binding.contentData.text = dosage_ss
    }

    private fun setIndicationData(heading: String) {
        var indication_text  = ""
        when(heading){
            "Acidophilus/Bifidus" ->{
                indication_text = "• AIDS\n" +
                        "• Allergies\n" +
                        "• Candidiasis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Constipation\n" +
                        "• Crohn's disease\n" +
                        "• Eczema\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Irritable bowel syndrome\n" +
                        "• PMS\n" +
                        "• Rosacea\n" +
                        "• Ulcerative colitis\n" +
                        "• Post antibiotic therapy\n" +
                        "• UTI"
                indication_ss = SpannableString(indication_text)
            }
            "Coenzyme Q10" -> {
                indication_text = "• Aging Prevention\n" +
                        "• AIDS\n" +
                        "• Allergies\n" +
                        "• Atherosclerosis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Congestive heart failure\n" +
                        "• Diabetes mellitus\n" +
                        "• Hypertension\n" +
                        "• Obesity\n" +
                        "• Peptic ulcers\n" +
                        "• Adriamycin cardiotoxicity\n" +
                        "• Angina pectoris\n" +
                        "• Beta-blocker toxicity\n" +
                        "• Cancer\n" +
                        "• Cardiomyopathy\n" +
                        "• Cardiotoxicity of psychotropic drugs - including phenothiazines, tricyclic antidepressants\n" +
                        "• Enhance aerobic capacity and muscle performance\n" +
                        "• Hyperthyroid heart failure\n" +
                        "• Immune system - tissues and cells involved with immune function are highly energy-dependent\n" +
                        "• Mitral valve prolapse\n" +
                        "• Muscular dystrophy\n" +
                        "• Periodontal disease"
                    indication_ss = SpannableString(indication_text)
            }
        }
        binding.subHeading.text = "Clinical Indications"
        binding.contentData.text = indication_ss
    }

    private fun setFunctionData(heading: String) {
        var function_text = ""
        when(heading){
            "Acidophilus/Bifidus" ->{
                function_text = "• Reduces production of procarcinogens\n" +
                        "• Inhibits the growth of :\n" +
                        "Clostridium perfringens\n" +
                        "Bacillus subtilis\n" +
                        "Candida ablicans\n" +
                        "Escherichia coli\n" +
                        "Bacillus cereus\n" +
                        "Klebsiella pneumoniae\n" +
                        "Proteus vulgaris\n" +
                        "L. bulgaricus\n" +
                        "L. fermenti\n" +
                        "L. lactis\n" +
                        "L. plantarum\n" +
                        "L. helveticus\n" +
                        "L. leichmannii\n" +
                        "• Helps maintain optimum pH\n" +
                        "• Reduces putrefaction\n" +
                        "• Reduces endotoxemia"
                function_ss = SpannableString(function_text)

            }
        }
        binding.subHeading.text = "Physiologic Functions"
        binding.contentData.text = function_ss
    }

    private fun setPlantFoodData(heading: String) {
        when(heading){
            "Acidophilus/Bifidus" ->{

            }
        }
        binding.subHeading.text = "Plants/Foods"
    }

    private fun setDescription(heading: String) {
        var description_text = ""
            when(heading){
                "Acidophilus/Bifidus" ->{
                    description_text = "Acidophilus and bifidus are two of the most important strains of the Lactobacilli family of microflora which inhibit the gastrointestinal tract. These \"good\" bacteria are involved with immune system function, carcinogenesis, metabolism of cholesterol, aging, and nutritional status. The term probiotics is used to describe the health-promoting effects of friendly bacteria in the gut."
                    description_ss = SpannableString(description_text)
                }
                "Coenzyme Q10" -> {
                    description_text = "Coenzyme Q10 is a cofactor for cellular respiration (electron transport chain) and is essential for the health of all organs and tissues. All energy-dependent processes of the body require Co Q10."
                    description_ss = SpannableString(description_text)
                }
        }
        binding.contentData.text = description_ss
        binding.subHeading.text = "Description"
    }

    private fun showNecessarySections(heading: String) {
        if(heading == "Coenzyme Q10" || heading == "Acidophilus/Bifidus"){
            binding.description.visibility = View.VISIBLE//
            setDescription(heading)
            if(heading!="Coenzyme Q10")
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE//
            binding.dosage.visibility = View.VISIBLE//
            binding.drugNutrition.visibility = View.VISIBLE//
            binding.adverseReaction.visibility = View.VISIBLE//
        }else if(heading=="Alanine"){
            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            binding.signSymptom.visibility = View.VISIBLE
            binding.deficiencyCause.visibility = View.VISIBLE
            binding.contraindiction.visibility = View.VISIBLE
            binding.toxicity.visibility = View.VISIBLE
        }else if(heading=="Amino Acids"||heading=="Dehydroepiandrosterone (DHEA)"||heading == "Dimethyl Glycine (DMG)" || heading=="Ethylenediaminetetraacetic acid (EDTA)"){
            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE//physiologic therapeutic
            binding.plantFoodText.text = "Physiologic Therapeutics"
            binding.indication.visibility = View.VISIBLE
            binding.dosage.visibility = View.VISIBLE
            if(heading=="Dehydroepiandrosterone (DHEA)") {
                binding.deficiencyCause.visibility == View.VISIBLE
                binding.deficiencyCauseText.text = "Labs"
            }
            binding.drugNutrition.visibility = View.VISIBLE
            if(heading =="Ethylenediaminetetraacetic acid (EDTA)")
                binding.contraindiction.visibility = View.VISIBLE
            binding.adverseReaction.visibility = View.VISIBLE
        }else if(heading=="Arginine"||heading == "Carnitine"||heading=="Carnosine"||heading =="Cystine"){
            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            binding.signSymptom.visibility = View.VISIBLE
            binding.deficiencyCause.visibility = View.VISIBLE
            binding.contraindiction.visibility = View.VISIBLE
            binding.toxicity.visibility = View.VISIBLE
        }else if(heading=="Bioflavonoids"){
            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            binding.signSymptom.visibility = View.VISIBLE
            binding.deficiencyCause.visibility = View.VISIBLE
            binding.contraindiction.visibility = View.VISIBLE
            binding.toxicity.visibility = View.VISIBLE
            binding.drugNutrition.visibility = View.VISIBLE
        }else if(heading=="Bromelain"){

            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE

            binding.drugNutrition.visibility = View.VISIBLE
            binding.dosage.visibility = View.VISIBLE
            binding.adverseReaction.visibility = View.VISIBLE
        }else if(heading=="Digestive Enzymes"){

            binding.description.visibility = View.VISIBLE
            binding.descriptionText.text = "Mouth"
            binding.plantFood.visibility = View.VISIBLE
            binding.plantFoodText.text = "Stomach"
            binding.function.visibility = View.VISIBLE
            binding.functionText.text = "Pancreas"
        }else if(heading==""){

            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            binding.signSymptom.visibility = View.VISIBLE
            binding.deficiencyCause.visibility = View.VISIBLE
            binding.contraindiction.visibility = View.VISIBLE
            binding.toxicity.visibility = View.VISIBLE
            binding.drugNutrition.visibility = View.VISIBLE

            binding.dosage.visibility = View.VISIBLE
            binding.adverseReaction.visibility = View.VISIBLE
        }else if(heading==""){

            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            binding.signSymptom.visibility = View.VISIBLE
            binding.deficiencyCause.visibility = View.VISIBLE
            binding.contraindiction.visibility = View.VISIBLE
            binding.toxicity.visibility = View.VISIBLE
            binding.drugNutrition.visibility = View.VISIBLE

            binding.dosage.visibility = View.VISIBLE
            binding.adverseReaction.visibility = View.VISIBLE
        }

    }

}