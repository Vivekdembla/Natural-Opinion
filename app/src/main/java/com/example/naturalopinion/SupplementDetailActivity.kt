package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
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
    var ss = SpannableString("")
    var s = SpannableString("")

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

        setDescription(heading)

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
        var text = ""

        when(heading){
            "Acidophilus/Bifidus" ->{
                text = "• None"
                ss = SpannableString(text)
            }
            "Amino Acids" -> {
                text = "• See individual amino acid\n" +
                        "• Contraindicated in:\n" +
                        "• Kidney disease\n" +
                        "• Liver disease"
                ss = SpannableString(text)
            }
            "Bromelain" -> {
                text = "• None known\n" +
                        "• Allergic reactions may occur in sensitive patients"
                ss = SpannableString(text)
            }
            "Coenzyme Q10" -> {
                text = "• Generally well tolerated\n" +
                        "• Restrict during pregnancy and lactation because no studies have been done"
                ss = SpannableString(text)
            }
            "Dehydroepiandrosterone (DHEA)" -> {
                text = "• Avoid if patient has hormonally sensitive cancer, including prostate and breast cancers\n" +
                        "• Relatively safe\n" +
                        "• Rarely in extremely large doses:\n" +
                        "• Mild hirsutism\n" +
                        "• Moderate acne"
                ss = SpannableString(text)
            }
            "Dimethyl Glycine (DMG)" -> {
                text = "• No known toxic effects\n" +
                        "• Initial nausea that can be avoided by taking with largest meal of the day"
                ss = SpannableString(text)
            }
            "Ethylenediaminetetraacetic acid (EDTA)" -> {
                text = "• Unpleasant skin odors\n" +
                        "• Fatigue\n" +
                        "• Nausea\n" +
                        "• Occasional kidney damage (rare)"
                ss = SpannableString(text)
            }
            "Fructooligosaccharides (FOS)" -> {
                text = "• None known"
                ss = SpannableString(text)
            }
            "Fumaric Acid" -> {
                text = "• Usually well tolerated\n" +
                        "• Rare:\n" +
                        "Too much fumaric acid can result in heat wave and a drop in blood sugar"
                ss = SpannableString(text)
            }
            "Hydrochloric Acid" -> {
                text = "• If taken unnecessarily may cause stomach irritation"
                ss = SpannableString(text)
            }
            "Lipoic Acid" -> {
                text = "• If using an extremely high dose, vitamin B1 should also be given\n" +
                        "• No known toxicities"
                ss = SpannableString(text)
            }
            "Melatonin" -> {
                text = "• Causes fatigue, confusion and sleepiness when given during the day"
                ss = SpannableString(text)
            }
            "NADH" -> {
                text = "• No adverse reactions or toxicity with usage of 1 year or more"
                ss = SpannableString(text)
            }
            "Phosphatidylserine" -> {
                text = "• No known toxicity\n" +
                        "• No side effects have been reported"
                ss = SpannableString(text)
            }
            "Pycnogenol" -> {
                text = "• No known toxicity or adverse reactions"
                ss = SpannableString(text)
            }
            "Quercetin" -> {
                text = "• Well tolerated"
                ss = SpannableString(text)
            }
            "S-Adenosyl-L-Methionine (SAM)" -> {
                text = "• Antidepressant activity may lead to the manic phase in bipolar individuals"
                ss = SpannableString(text)
            }
            "Taurine" -> {
                text = "• Kidney disease\n" +
                        "• Liver disease\n" +
                        "• Peptic ulcer disease (PUD)"
                ss = SpannableString(text)
            }
        }
        binding.contentData.text = ss
        binding.subHeading.text = "Contraindications:"
    }//

    private fun setDrugNutritionData(heading: String) {
        var text = ""

        when(heading){
            "Acidophilus/Bifidus" ->{
                text = "• Alcohol negatively affects L. acidophilus and L. bifidus\n" +
                        "• Antibiotics negatively affects L. acidophilus and L. bifidus"
                ss = SpannableString(text)
            }
            "Amino Acids" -> {
                text = "• See individual amino acid"
                ss = SpannableString(text)
            }
            "Bioflavonoids" -> {
                text = "• Naringin containing citrus bioflavonoids, like grapefruit, may increase the bioavailability of nifedipine, verapramil, felodipine, and terfenadine and inhibit the breakdown of caffeine, estrogens, and coumarin"
                ss = SpannableString(text)
            }
            "Bromelain" -> {
                text = "• Increases serum levels of antibiotics i.e. amoxycillin, penicillin, tetracycline"
                ss = SpannableString(text)
            }
            "Coenzyme Q10" -> {
                text = "• Adriamycin, lovastatin, and other HMG CoA-reductase inhibitors may produce a deficiency of Co Q10\n" +
                        "• Coenzyme Q10 can be antagonized by tricyclic antidepressants and beta blockers\n" +
                        "• Coenzyme Q10, used with doxorubicin, lessens the cardiotoxicity and can double the anti-tumor effects of doxorubicin\n" +
                        "• Dymelor can cause a deficiency of Co Q10 which may lead to cardiac symptoms\n" +
                        "• Glyburide can cause a deficiency of Co Q10 and inhibits NADH oxidase, a coenzyme Q10 enzyme\n" +
                        "• Phenoformin can cause a deficiency of Co Q10\n" +
                        "• Tolazamide can cause a deficiency of Co Q10 with prolonged use"
                ss = SpannableString(text)
            }
            "Dehydroepiandrosterone (DHEA)" -> {
                text = "• DHEA may antagonize the effects of cortisol"
                ss = SpannableString(text)
            }
            "Dimethyl Glycine (DMG)" -> {
                text = "• Works synergistically with vitamins A and E"
                ss = SpannableString(text)
            }
            "Ethylenediaminetetraacetic acid (EDTA)" -> {
                text = "• EDTA may remove beneficial +2 ions such as magnesium, calcium and zinc which should be replaced via supplementation"
                ss = SpannableString(text)
            }
            "Fructooligosaccharides (FOS)" -> {
                text = "• Limited data"
                ss = SpannableString(text)
            }
            "Fumaric Acid" -> {
                text = "• Do NOT take these medications while taking fumaric acid:\n" +
                        "ACE inhibitors\n" +
                        "Beta blockers, i.e. propranolol\n" +
                        "Calcium antagonists\n" +
                        "Penicillin VK"
                ss = SpannableString(text)
            }
            "Hydrochloric Acid" -> {
                text = "• No drug interactions have been reported"
                ss = SpannableString(text)
            }
            "Lipoic Acid" -> {
                text = "• Since lipoic acid is an antioxidant, it spares other antioxidants like vitamins E and C"
                ss = SpannableString(text)
            }
            "Melatonin" -> {
                text = "• Vitamin B 12 is needed to enhance melatonin secretion"
                ss = SpannableString(text)
            }
            "NADH" -> {
                text = "• Alcoholism may cause a vitamin B3 deficiency and therefore a deficiency in NADH"
                ss = SpannableString(text)
            }
            "Phosphatidylserine" -> {
                text = "• Limited data"
                ss = SpannableString(text)
            }
            "Pycnogenol" -> {
                text = "• Limited data"
                ss = SpannableString(text)
            }
            "Red Yeast Rice" -> {
                text = "• No known drug or nutrient interactions associated with red yeast rice"
                ss = SpannableString(text)
            }
            "Quercetin" -> {
                text = "• Bromelain may enhance quercetin absorption"
                ss = SpannableString(text)
            }"S-Adenosyl-L-Methionine (SAM)" -> {
                text = "• May enhance elimination of various drugs due to the effects on the liver"
                ss = SpannableString(text)
            }
        }
        binding.contentData.text = ss
        binding.subHeading.text = "Drug/Nutrient Interaction:"
    }//

    private fun setContraIndicationData(heading: String) {
        var text = ""

        when(heading){
            "Alanine" -> {
                text = "• None"
                ss = SpannableString(text)
            }
            "Arginine" -> {
                text = "• Herpes simplex virus infection\n" +
                        "• High insulin\n" +
                        "• Kidney disease\n" +
                        "• Liver failure"
                ss = SpannableString(text)
            }
            "Bioflavonoids" -> {
                text = "• See \"Interactions\" below"
                ss = SpannableString(text)
            }
            "Carnitine" -> {
                text = "• Kidney damage"
                ss = SpannableString(text)
            }
            "Carnosine" -> {
                text="• None discovered to date"
                ss = SpannableString(text)
            }
            "Cystine" -> {
                text = "• Cystinosis\n" +
                        "• Fanconi's syndrome\n" +
                        "• Renal lithiasis due to increased cystine in the body"
                ss = SpannableString(text)
            }
            "Ethylenediaminetetraacetic acid (EDTA)" -> {
                text = "• Pregnancy\n" +
                        "• Kidney failure\n" +
                        "• Hypothyroidism"
                ss = SpannableString(text)
            }
            "Glucosamine Sulfate" -> {
                text = "• None"
                ss = SpannableString(text)

            }
            "Glutamic Acid" -> {
                text ="• MSG allergy"
                ss = SpannableString(text)
            }
            "Glutamine" -> {
                text = "• Lymphocytic cancers"
                ss = SpannableString(text)
            }
            "Glutathione" -> {
            text = "• Patients with cystinuria"
                ss = SpannableString(text)
            }
            "Glycine" -> {
                text = "• Limited data"
                ss = SpannableString(text)
            }
            "Lysine" -> {
                text = "• Kidney disease\n" +
                        "• Liver disease"
                ss = SpannableString(text)
            }
            "Methionine" -> {
                text = "• Kidney disease\n" +
                        "• Liver disease"
                ss = SpannableString(text)
            }
            "Methylsufonylmethane (MSM)" -> {
                text = "• None known"
                ss = SpannableString(text)
            }
            "N-Acetyl Cysteine" -> {
                text = "• Genetic disorder cystinosis, or Fanconi's"
                ss = SpannableString(text)
            }
            "Phenylalanine" -> {
                text = "• Do not supplement if taking MAO's (monoamine oxidase drugs)\n" +
                        "• Hypertension\n" +
                        "• Phenylketonurics\n" +
                        "• Pregnant or lactating women"
                ss = SpannableString(text)
            }
            "Proline" -> {
                text = "• Individuals with inborn errors of metabolism causing elevated levels of proline"
                ss = SpannableString(text)
            }
            "S-Adenosyl-L-Methionine (SAM)" -> {
                text = "• Antidepressant activity may lead to the manic phase in bipolar individuals"
                ss = SpannableString(text)
            }
            "Taurine" -> {
                text = "• Kidney disease\n" +
                        "• Liver disease\n" +
                        "• Peptic ulcer disease (PUD)"
                ss = SpannableString(text)
            }
            "Tryptophan" -> {
                text = "• Bronchial asthma\n" +
                        "• Cataracts\n" +
                        "• Pregnancy\n" +
                        "• Psoriasis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• SLE (systemic lupus erythematosus)"
                ss = SpannableString(text)
            }
            "Tyrosine" -> {
                text = "• Schizophrenia"
                ss = SpannableString(text)
            }
        }
        binding.contentData.text = ss
        binding.subHeading.text = "Contraindications:"
    }//

    private fun setToxicityData(heading: String) {
        var text = ""

        when(heading){
            "Acidophilus/Bifidus" ->{
                text = "• None"
                ss = SpannableString(text)
            }
            "Alanine" -> {
                text = "• None"
                ss = SpannableString(text)
            }
            "Arginine" -> {
                text = "• Hyperkalemia\n" +
                        "• Hyperphosphatemia\n" +
                        "• Watery diarrhea"
                ss = SpannableString(text)
            }
            "Bioflavonoids" -> {
                text = "• Citrus bioflavonoids: very well tolerated\n" +
                        "• Green tea polyphenols: rarely produces stimulant side effects\n" +
                        "• Proanthocyanidins: very well tolerated\n" +
                        "• Quercetin: very well tolerated but slight allergic reactions have rarely been reported"
                ss = SpannableString(text)
            }
            "Carnitine" -> {
                text = "• Large doses may produce body odor\n" +
                        "• Large doses may produce gastrointestinal discomfort\n" +
                        "• Only L-carnitine form should be taken, not D-carnitine or the D-L-carnitine form"
                ss = SpannableString(text)
            }
            "Carnosine" -> {
                text="• Large doses may produce gastrointestinal discomfort"
                ss = SpannableString(text)
            }
            "Cystine" -> {
                text = "• A build-up of cystine can occur-see contraindications"
                ss = SpannableString(text)
            }
            "Glucosamine Sulfate" -> {
                text = "• None"
                ss = SpannableString(text)

            }
            "Glutamic Acid" -> {
                text ="• Neurotoxicity could occur in extremely large doses\n" +
                        "• 140 gm. for the average male adult could product symptoms of toxicity:\n" +
                        "Nausea\n" +
                        "Vomiting"
                ss = SpannableString(text)
            }
            "Glutamine" -> {
                text = "• Greater than 2 gms. daily may lead to manic behavior"
                ss = SpannableString(text)
            }
            "Glutathione" -> {
                text = "• Do not take in extremely high doses (7 gm./day)"
                ss = SpannableString(text)
            }
            "Glycine" -> {
                text = "• Very low toxicity"
                ss = SpannableString(text)
            }
            "Lysine" -> {
                text = "• Large doses increase kidney toxicity of aminoglycoside antibiotics\n" +
                        "• Large doses of lysine may cause arginine deficiency"
                ss = SpannableString(text)
            }
            "Methionine" -> {
                text = "• May be the most toxic amino acid\n" +
                        "• Symptoms include:\n" +
                        "Gas\n" +
                        "Hypercalciuria\n" +
                        "Uneasy feelings"
                ss = SpannableString(text)
            }
            "Methylsufonylmethane (MSM)" -> {
                text = "• May cause nausea, diarrhea and headache"
                ss = SpannableString(text)
            }
            "N-Acetyl Cysteine" -> {
                text = "• Genetic disorder cystinosis, or Fanconi's, causes the body to build up harmful levels of L-cystine (not cysteine)"
                ss = SpannableString(text)
            }
            "Phenylalanine" -> {
                text = "• May cause headaches"
                ss = SpannableString(text)
            }
            "Proline" -> {
                text = "• Extremely high doses of D-proline injected into the brain of chickens caused death"
                ss = SpannableString(text)
            }
            "S-Adenosyl-L-Methionine (SAM)" -> {
                text = "• May cause nausea and gastrointestinal disturbances"
                ss = SpannableString(text)
            }
            "Taurine" -> {
                text = "• Generally well tolerated"
                ss = SpannableString(text)
            }
            "Tryptophan" -> {
                text = "• Dosage equivalent to 8 grams a day for humans was teratogenic in animals\n" +
                        "• Dosage larger than 100 mg/kg of 5-hydroxytryptophan may cause gastric irritation, vomiting and head twitching (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• Monoamine oxidase inhibitors (MAO inhibitors) increase the effects of tryptophan"
                ss = SpannableString(text)
            }"Tyrosine" -> {
                text = "• Do not take in conjunction with MAO inhibitors\n" +
                        "• Toxicity is almost nonexistent with tyrosine alone"
                ss = SpannableString(text)
            }
        }
        binding.contentData.text = ss
        binding.subHeading.text = "Toxicity and Side Effects:"
    }//

    private fun setDeficiencyCauseData(heading: String) {
        var text = ""

        when(heading){

            "Alanine" -> {
                text = "• Vitamin B6 deficiency will cause an alanine deficiency"
                ss = SpannableString(text)
            }

            "Arginine" -> {
                text = "• Excessive ammonia\n" +
                        "• Excessive lysine\n" +
                        "• Malnutrition\n" +
                        "• Pregnancy\n" +
                        "• Protein deficiency\n" +
                        "• Rapid growth\n" +
                        "• Trauma"
                ss = SpannableString(text)
            }
            "Bioflavonoids" -> {
                text = "• None known"
                ss = SpannableString(text)
            }
            "Bromelain" -> {
                text = "• Cirrhosis\n" +
                        "• Genetic abnormalities\n" +
                        "• Infants on carnitine-deficient formula\n" +
                        "• Kidney patients undergoing dialysis\n" +
                        "• Patients on liquid or TPN diets\n" +
                        "• Pregnant women\n" +
                        "• Premature infants on total parenteral nutrition\n" +
                        "• Several neuromuscular disorders, including Duchenne-type muscular dystrophy\n" +
                        "• Starvation, especially kwashiorkor"
                ss = SpannableString(text)
            }
            "Carnitine" -> {
                text = "• Cirrhosis\n" +
                        "• Genetic abnormalities\n" +
                        "• Infants on carnitine-deficient formula\n" +
                        "• Kidney patients undergoing dialysis\n" +
                        "• Patients on liquid or TPN diets\n" +
                        "• Pregnant women\n" +
                        "• Premature infants on total parenteral nutrition\n" +
                        "• Several neuromuscular disorders, including Duchenne-type muscular dystrophy\n" +
                        "• Starvation, especially kwashiorkor"
                ss = SpannableString(text)
            }
            "Carnosine" -> {
                text= "• Severe protein deficiency\n" +
                        "• Genetic abnormalities\n" +
                        "• Infants on carnosine-deficient formula\n" +
                        "• Kidney patients undergoing dialysis\n" +
                        "• Patients on liquid or TPN diets\n" +
                        "• Pregnant women\n" +
                        "• Premature infants on total parenteral nutrition\n" +
                        "• Several neuromuscular disorders, including Duchenne-type muscular dystrophy\n" +
                        "• Starvation, especially kwashiorkor"
                ss = SpannableString(text)
            }

            "Cystine" -> {
                text = "• Limited data"
                ss = SpannableString(text)
            }
            "Glutamic Acid" -> {
                text ="• None have been found because it can be synthesized many different ways"
                ss = SpannableString(text)
            }
            "Glutamine" -> {
                text = "• Inhibitors of glutamine metabolism"
                ss = SpannableString(text)
            }
            "Glutathione" -> {
            text = "• Any pathological condition that depletes glutathione\n" +
                    "• Cysteine deficiency causes a glutathione deficiency"
            ss = SpannableString(text)
        }
            "Glycine" -> {
                text = "• Inborn errors of glycine metabolism"
                ss = SpannableString(text)
            }
            "Lysine" -> {
                text = "• High stress\n" +
                        "• Inborn errors of lysine metabolism\n" +
                        "• Low dietary intake, i.e. vegan\n" +
                        "• Malnutrition"
                ss = SpannableString(text)
            }
            "Methionine" -> {
                text = "• Protein malnutrition"
                ss = SpannableString(text)
            }
            "N-Acetyl Cysteine" -> {
                text = "• Chronic degenerative diseases"
                ss = SpannableString(text)
            }
            "NADH" -> {
                text = "• Inborn errors of metabolism"
                ss = SpannableString(text)
            }
            "Phenylalanine" -> {
                text = "• Inborn errors of metabolism"
                ss = SpannableString(text)
            }
            "Phosphatidylserine" -> {
                text = "• Bovine\n" +
                        "• Soy"
                ss = SpannableString(text)
            }
            "Proline" -> {
                text = "• Deficiencies found almost exclusively in women and poorly nourished individuals"
                ss = SpannableString(text)
            }
            "Taurine" -> {
                text = "• Estradiol\n" +
                        "• High stress\n" +
                        "• Homocystinuria\n" +
                        "• Hypertension and seizure disorders increase the need for taurine\n" +
                        "• Vitamin B6 deficiency"
                ss = SpannableString(text)
            }
            "Tryptophan" -> {
                text = "• Alcoholism\n" +
                        "• Diets high in corn\n" +
                        "• Drug addiction\n" +
                        "• HIV"
                ss = SpannableString(text)
            }
            "Tyrosine" -> {
                text = "• Inborn errors of tyrosine metabolism"
                ss = SpannableString(text)
            }
        }
        binding.contentData.text = ss
        binding.subHeading.text = "Causes of Deficiencies:"
    }//

    private fun setSignSymptomData(heading: String) {
        var text = ""

        when(heading){
            "Alanine" -> {
                text = "• Limited data"
                ss = SpannableString(text)
            }
            "Arginine" -> {
                text = "• Depression\n" +
                        "• Growth delay\n" +
                        "• Orotic aciduria"
                ss = SpannableString(text)
            }
            "Bioflavonoids" -> {
                text = "• None known"
                ss = SpannableString(text)
            }
            "Carnitine" -> {
                text = "• Acidic blood\n" +
                        "• Brain degeneration, similar to Reye's syndrome\n" +
                        "• High triglycerides\n" +
                        "• Muscle weakness\n" +
                        "• Progressive muscle weakness"
                ss = SpannableString(text)
            }
            "Carnosine" -> {
                text="• Severe protein deficiency\n" +
                        "• Genetic abnormalities\n" +
                        "• Infants on carnosine-deficient formula\n" +
                        "• Kidney patients undergoing dialysis\n" +
                        "• Patients on liquid or TPN diets\n" +
                        "• Pregnant women\n" +
                        "• Premature infants on total parenteral nutrition\n" +
                        "• Several neuromuscular disorders, including Duchenne-type muscular dystrophy\n" +
                        "• Starvation, especially kwashiorkor"
                ss = SpannableString(text)
            }
            "Cystine" -> {
                text = "• Limited data"
                ss = SpannableString(text)
            }
            "Glutamic Acid" -> {
                text ="• None"
                ss = SpannableString(text)
            }
            "Glutamine" -> {
                text = "• Cantankerous behavior\n" +
                        "• Convulsions"
                ss = SpannableString(text)
            }
            "Glycine" -> {
                text = "• Abnormal EEG\n" +
                        "• Hiccups\n" +
                        "• Mental retardation\n" +
                        "• Myoclonus\n" +
                        "• Seizures"
                ss = SpannableString(text)
            }
            "Lysine" -> {
                text = "• Anemia\n" +
                        "• Enzyme disorders\n" +
                        "• Kidney stones\n" +
                        "• Reduced ability to think"
                ss = SpannableString(text)
            }
            "Methionine" -> {
                text = "• Catabolism\n" +
                        "• Nitrogen retention"
                ss = SpannableString(text)
            }
            "N-Acetyl Cysteine" -> {
                text = "• Limited data"
                ss = SpannableString(text)
            }
            "Phenylalanine" -> {
                text = "• Behavioral changes\n" +
                        "• Cataracts\n" +
                        "• Circulatory problems\n" +
                        "• Emotional disorders\n" +
                        "• Injected eyes\n" +
                        "• Lack of melanin\n" +
                        "• Weight gain"
                ss = SpannableString(text)
            }
            "Proline" -> {
                text = "• Limited data"
                ss = SpannableString(text)
            }
            "Taurine" -> {
                text = "• Failure to thrive in infants"
                ss = SpannableString(text)
            }"Tryptophan" -> {
                text = "• Alcoholism\n" +
                        "• Diets high in corn\n" +
                        "• Drug addiction\n" +
                        "• HIV"
                ss = SpannableString(text)
            }"Tyrosine" -> {
                text = "• Increased appetite\n" +
                        "• Pigment abnormalities"
                ss = SpannableString(text)
            }
        }
        binding.contentData.text = ss
        binding.subHeading.text = "Signs and Symptoms of Deficiency:"
    }//

    private fun setDosageData(heading: String){
        var text = ""

        when(heading){
            "Acidophilus/Bifidus" ->{
                text = "• Based on the number of live bacteria\n" +
                        "• Daily: 1 - 10 billion viable L. acidophilus or L. bifidus"
                ss = SpannableString(text)
            }
            "Amino Acids" -> {
                text = "• Dependent on individual amino acid"
                ss = SpannableString(text)
            }

            "Bromelain" -> {
                text = "• As a digestive aid only, take with meals\n" +
                        "• For all other conditions, take on an empty stomach\n" +
                        "• Potency: 1,800 - 2,000 m.c.u. (milk clotting units)\n" +
                        "• 125 - 145 mg. three times per day"
                ss = SpannableString(text)
            }
            "Coenzyme Q10" -> {
                text = "• 20 - 150 mg. per day in divided doses\n" +
                        "• Adriamycin therapy: 100 mg. per day in divided doses beginning 3 - 5 days prior to treatment may help prevent cardiotoxicity"
                ss = SpannableString(text)
            }
            "Dehydroepiandrosterone (DHEA)" -> {
                text = "• Dosage: 5-25 mg. until DHEA-D levels reach 250 for women and 300 for men"
                ss = SpannableString(text)
            }
            "Dimethyl Glycine (DMG)" -> {
                text = "• 50 - 150 mg. in divided doses"
                ss = SpannableString(text)
            }
            "Ethylenediaminetetraacetic acid (EDTA)" -> {
                text = "• Dosage:\n" +
                        "• Orally: 2 - 3 grams taken at bedtime\n" +
                        "• By suppository: 750 mg. at bedtime\n" +
                        "• IV: 40 - 70 mg. per kg."
                ss = SpannableString(text)
            }
            "Fructooligosaccharides (FOS)" -> {
                text = "• 2,000 - 3,000 mgs."
                ss = SpannableString(text)
            }
            "Fumaric Acid" -> {
                text = "• Take 1 capsule daily at the end of each meal on a full stomach for 2 weeks\n" +
                        "• Then, 2 capsules daily at the end of each meal on a full stomach for 2 weeks\n" +
                        "• Finally, 3 capsules daily at the end of each meal on a full stomach for 3 weeks\n" +
                        "• 15 - 30 minutes after dosage, the skin, shoulders, neck regions up to the ear lobes should grow warm and tingle for approximately 30 minutes, which indicates the fumaric acid metabolic process has started. If this does not occur, the dosage should be increased."
                ss = SpannableString(text)
            }
            "Hydrochloric Acid" -> {
                text = "• Adults: 10 - 70 grains per meal"
                ss = SpannableString(text)
            }
            "Lipoic Acid" -> {
                text = "• 20 - 50 mg. per day\n" +
                        "• AIDS: 150 mg. TID\n" +
                        "• Diabetes mellitus: 300-600 mg."
                ss = SpannableString(text)
            }
            "Melatonin" -> {
                text = "• 0.03 - 200 mg."
                ss = SpannableString(text)
            }
            "Methylsufonylmethane (MSM)" -> {
            text = "• 1 - 3 gms daily in divided doses"
            ss = SpannableString(text)
        }
            "NADH" -> {
                text = "• 5 - 20 mg. with water only on an empty stomach"
                ss = SpannableString(text)
            }
            "Phosphatidylserine" -> {
                text = "• 100 mg. TID with food"
                ss = SpannableString(text)
            }
            "Pycnogenol" -> {
                text = "• 20-400 mg."
                ss = SpannableString(text)
            }
            "Red Yeast Rice" -> {
                text = "• 1200 mg. with 50 mg. Coenzyme Q10 2 times a day"
                ss = SpannableString(text)
            }
            "Quercetin" -> {
                text = "• 400 mg. 20 minutes before meals, TID"
                ss = SpannableString(text)
            }
            "S-Adenosyl-L-Methionine (SAM)" -> {
                text = "• Depression:\n" +
                        "200 mg. BID for 1 day; then increase to 400 mg. BID by day 3; then 400 mg. TID by day 10; then 400 mg. QID after day 20\n" +
                        "• Fibromyalgia:\n" +
                        "200-400 mg. BID\n" +
                        "• Osteoarthritis:\n" +
                        "Begin dosage like depression; 1200 mg daily after day 21, then reduce to maintenance of 200 mg. BID\n" +
                        "• Migraine:\n" +
                        "200-400 mg. BID for long-term treatment\n" +
                        "• Liver disorders:\n" +
                        "200-400 mg. BID-TID"
                ss = SpannableString(text)
            }
        }
        binding.contentData.text = ss
        binding.subHeading.text = "Dosage"
    }//

    private fun setIndicationData(heading: String) {
        var text = ""

        when(heading){
            "Acidophilus/Bifidus" ->{
                text = "• AIDS\n" +
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
                ss = SpannableString(text)
                createLink(ss,"AIDS",text,"Condition","AIDS")
                createLink(ss,"Allergies",text,"Condition","Allergies")
                createLink(ss,"Candidiasis",text,"Condition","Candidiasis")
                createLink(ss,"Chronic fatigue syndrome",text,"Condition","Chronic Fatigue Syndrome")
                createLink(ss,"Constipation",text,"Condition","Constipation")
                createLink(ss,"Crohn's disease",text,"Condition","Crohn's Disease")
                createLink(ss,"Eczema",text,"Condition","Eczema")
                createLink(ss,"Fibrocystic breast disease",text,"Condition","Fibrocystic Breast Disease")
                createLink(ss,"Irritable bowel syndrome",text,"Condition","Irritable Bowel Syndrome")
                createLink(ss,"PMS",text,"Condition","PMS")
                createLink(ss,"Rosacea",text,"Condition","Rosacea")
                createLink(ss,"Ulcerative colitis",text,"Condition","Ulcerative Colitis")
            }
            "Alanine" -> {
                text = "• AIDS\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Diabetes mellitus\n" +
                        "• Alcoholic hepatitis\n" +
                        "• Hypoglycemia\n" +
                        "• Kidney stone prevention"
                createLink(ss,"AIDS",text,"Condition","AIDS")
                createLink(ss,"Benign prostatic hypertrophy (BPH)",text,"Condition","Benign Prostatic Hypertrophy (BPH)")
                createLink(ss,"Diabetes mellitus",text,"Condition","Diabetes Mellitus")
                ss = SpannableString(text)
            }
            "Amino Acids" -> {
                text = "• Depression"
                ss = SpannableString(text)
            }
            "Arginine" -> {
                text = "• Atherosclerosis\n" +
                        "• Congestive heart failure\n" +
                        "• Cystitis\n" +
                        "• Depression\n" +
                        "• Diabetes mellitus\n" +
                        "• Fertility/Infertility\n" +
                        "• Hypertension\n" +
                        "• Impotence\n" +
                        "• Ulcerative colitis\n" +
                        "• Coma caused by liver failure\n" +
                        "• Inborn errors of metabolism\n" +
                        "• Low sperm count\n" +
                        "• Post trauma and surgery - promotes wound healing\n" +
                        "• Pseudomonas infection"
                ss = SpannableString(text)
                createLink(ss,"Atherosclerosis",text,"Condition","Atherosclerosis")
                createLink(ss,"Congestive heart failure",text,"Condition","Congestive Heart Failure")
                createLink(ss,"Cystitis",text,"Condition","Cystitis")
                createLink(ss,"Depression",text,"Condition","Depression")
                createLink(ss,"Diabetes mellitus",text,"Condition","Diabetes Mellitus")
                createLink(ss,"Fertility/Infertility",text,"Condition","Fertility")
                createLink(ss,"Hypertension",text,"Condition","Hypertension")
                createLink(ss,"Impotence",text,"Condition","Impotence")
                createLink(ss,"Ulcerative colitis",text,"Condition","Ulcerative Colitis")
            }
            "Bioflavonoids" -> {
                text = "• Allergies\n" +
                        "• Asthma\n" +
                        "• Diabetic retinopathy\n" +
                        "• Hemorrhoids\n" +
                        "• Herpes simplex\n" +
                        "• Macular degeneration\n" +
                        "• Menopause\n" +
                        "• Aging\n" +
                        "• Cancer prevention\n" +
                        "• Capillary fragility\n" +
                        "• Cardiovascular disease\n" +
                        "• Chronic degenerative diseases\n" +
                        "• Metorrhagias\n" +
                        "• Sports injuries and trauma\n" +
                        "• Varicose vein"
                ss = SpannableString(text)

                createLink(ss,"Allergies",text,"Condition","Allergies")
                createLink(ss,"Asthma",text,"Condition","Asthma")
                createLink(ss,"Diabetic",text,"Condition","Diabetes Mellitus")
                createLink(ss,"Hemorrhoids",text,"Condition","Hemorrhoids")
                createLink(ss,"Herpes simplex",text,"Condition","Herpes Simplex")
                createLink(ss,"Menopause",text,"Condition","Menopause")
            }
            "Bromelain" -> {
                text = "• Atherogenesis\n" +
                        "• Bronchitis\n" +
                        "• Dysmenorrhea\n" +
                        "• Fibromyalgia\n" +
                        "• Gout\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Angina\n" +
                        "• Athletic injury\n" +
                        "• Burn debridement\n" +
                        "• Cellulitis\n" +
                        "• Cutaneous staphylococcus infection\n" +
                        "• Ecchymosis\n" +
                        "• Edema\n" +
                        "• Maldigestion\n" +
                        "• Pancreatic insufficiency\n" +
                        "• Perirectal abscess\n" +
                        "• Phytobezoar\n" +
                        "• Pneumonia\n" +
                        "• Pyelonephritis\n" +
                        "• Scleroderma\n" +
                        "• Sinusitis\n" +
                        "• Surgical procedures\n" +
                        "• Thrombophlebitis"
                ss = SpannableString(text)
                createLink(ss,"Atherogenesis",text,"Condition","Atherogenesis")
                createLink(ss,"Bronchitis",text,"Condition","Bronchitis")
                createLink(ss,"Fibromyalgia",text,"Condition","Fibromyalgia")
                createLink(ss,"Gout",text,"Condition","Gout")
                createLink(ss,"Psoriatic arthritis",text,"Condition","Psoriatic Arthritis")
                createLink(ss,"Rheumatoid arthritis",text,"Condition","Rheumatoid Arthritis")
            }
            "Carnitine" -> {
                text = "• AIDS\n" +
                        "• Alzheimer's disease\n" +
                        "• Atherosclerosis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Congestive heart failure\n" +
                        "• Depression\n" +
                        "• Diabetis mellitus\n" +
                        "• Fertility/Infertility\n" +
                        "• Hypertension (some forms)\n" +
                        "• Hypothyroidism\n" +
                        "• Impotence\n" +
                        "• Obesity\n" +
                        "• Short term memory loss\n" +
                        "• Angina\n" +
                        "• Dialyzed kidney patient\n" +
                        "• Down's syndrome\n" +
                        "• Fatigue\n" +
                        "• Fatty degeneration caused by alcoholism\n" +
                        "• Hyperlipoproteinemia - type 4\n" +
                        "• Intermittent claudication\n" +
                        "• Ischemic heart disease\n" +
                        "• Limb-girdle muscular dystrophy\n" +
                        "• Male infertility due to low motility of sper\n" +
                        "• MI prevention\n" +
                        "• Muscular dystrophy\n" +
                        "• Myocardial insufficiencies\n" +
                        "• Myotonic dystrophy\n" +
                        "• Poor hand and foot circulationm\n" +
                        "• Poor immune function\n" +
                        "• Renal Fanconi's syndrome\n" +
                        "Sciatic nerve regeneration (in rats)"
                ss = SpannableString(text)

                createLink(ss,"AIDS",text,"Condition","AIDS")
                createLink(ss,"Alzheimer's disease",text,"Condition","Alzheimer's Disease")
                createLink(ss,"Atherosclerosis",text,"Condition","Atherosclerosis")
                createLink(ss,"Chronic fatigue syndrome",text,"Condition","Chronic Fatigue Syndrome")
                createLink(ss,"Congestive heart failure",text,"Condition","Congestive Heart Failure")
                createLink(ss,"Depression",text,"Condition","Depression")
                createLink(ss,"Diabetis mellitus",text,"Condition","Diabetis Mellitus")
                createLink(ss,"Fertility/Infertility",text,"Condition","Fertility")
                createLink(ss,"Hypertension",text,"Condition","Hypertension")
                createLink(ss,"Impotence",text,"Condition","Impotence")
                createLink(ss,"Obesity",text,"Condition","Obesity")
                createLink(ss,"Short term memory loss",text,"Condition","Memory Loss")
            }
            "Carnosine" -> {
                text="• AIDS\n" +//
                        "• Alzheimer's disease\n" +//
                        "• Atherosclerosis\n" +//
                        "• Autism\n" +
                        "• Cancer prevention\n" +
                        "• Cataract prevention\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Congestive heart failure\n" +
                        "• Diabetes\n" +
                        "• Fibromyalgia\n" +
                        "• Hepatitis C\n" +
                        "• Hypertension\n" +
                        "• Impotence\n" +
                        "• Short term memory loss\n" +
                        "• Obesity\n" +
                        "• Peptic ulcers\n" +
                        "• Parkinson's disease\n" +
                        "• ALS (Amyotrophic Lateral Sclerosis)\n" +
                        "• Duchenne´s muscle dystrophy\n" +
                        "• Fatigue\n" +
                        "• MI prevention\n" +
                        "• Muscular dystrophy\n" +
                        "• Myasthenia gravis\n" +
                        "• Myocardial insufficiencies\n" +
                        "• Myotonic dystrophy"
                ss = SpannableString(text)

            }
            "Coenzyme Q10" -> {
                text = "• Aging prevention\n" +
                        "• AIDS\n" +
                        "• Allergies\n" +
                        "• Alzheimer's disease\n" +
                        "• Asthma\n" +
                        "• Atherosclerosis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Congestive heart failure\n" +
                        "• Diabetes mellitus\n" +
                        "• Fertility/Infertility\n" +
                        "• Hypertension\n" +
                        "vObesity\n" +
                        "• Parkinson's Disease\n" +
                        "vPeptic ulcer\n" +
                        "• Adriamycin cardiotoxicity\n" +
                        "• Angina pectoris\n" +
                        "• Beta-blocker toxicity\n" +
                        "• Cancer\n" +
                        "• Cardiomyopathy\n" +
                        "vCardiotoxicity of psychotropic drugs - including phenothiazines, tricyclic antidepressants\n" +
                        "• Enhance aerobic capacity and muscle performance\n" +
                        "vHyperthyroid heart failure\n" +
                        "• Immune system - tissues and cells involved with immune function are highly energy-dependent\n" +
                        "• Mitral valve prolapse\n" +
                        "• Muscular dystrophy\n" +
                        "• Periodontal disease"
                ss = SpannableString(text)
            }
            "Dehydroepiandrosterone (DHEA)" -> {
                text = "• Bronchitis\n" +
                        "• Burns\n" +
                        "• Cystic fibrosis\n" +
                        "• Kidney stone prevention\n" +
                        "• Protection against alcohol intake by preventing liver damage\n" +
                        "• Protection against cigarette smoke\n" +
                        "• Protection against radiation effects"
                ss = SpannableString(text)
            }
            "Dimethyl Glycine (DMG)" -> {
                text = "• Autism\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Enhance athletic performance"
                ss = SpannableString(text)
            }
            "Ethylenediaminetetraacetic acid (EDTA)" -> {
                text = "• Attention decficit disorder (ADD)\n" +
                        "• Atherosclerosis\n" +
                        "• Autism\n" +
                        "• Bipolar disorder\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Depression\n" +
                        "• Eczema\n" +
                        "• Headache\n" +
                        "• Fibromyalgia\n" +
                        "• Fertility\n" +
                        "• Hypercholesterolemia\n" +
                        "• Hypertension\n" +
                        "• Insomnia\n" +
                        "• Memory Loss\n" +
                        "• Migraine Headaches\n" +
                        "• Parkinsons Disease\n" +
                        "• Psoriasis\n" +
                        "• Schizophrenia\n" +
                        "• Uterine Fibroids\n" +
                        "• Hypercalcemia\n" +
                        "• Lead Poisoning"
                ss = SpannableString(text)
            }
            "Fructooligosaccharides (FOS)" -> {
                text = "• Chronic fatigue syndrome\n" +
                        "• Crohn's disease\n" +
                        "• Hypertension\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Ulcerative colitis\n" +
                        "• Hypercholesterolemia"
                ss = SpannableString(text)
            }
            "Fumaric Acid" -> {
                text = "• Psoriasis\n" +
                        "• Psoriatic arthritis"
                ss = SpannableString(text)
            }
            "Glucosamine Sulfate" -> {
                text = "• Atherosclerosis\n" +
                        "• Osteoarthritis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Renal Lithiasis"
                ss = SpannableString(text)

            }
            "Glutamic Acid" -> {
                text ="• Benign prostatic hypertrophy (BPH)"
                ss = SpannableString(text)
            }
            "Glutamine" -> {
                text = "• Depression\n" +
                        "• Memory loss\n" +
                        "• Obesity\n" +
                        "• Peptic ulcer\n" +
                        "• Ulcerative colitis\n" +
                        "• Aging\n" +
                        "• Alcoholism\n" +
                        "• Schizophrenia, some cases\n" +
                        "• Senility"
                ss = SpannableString(text)
            }
            "Glutathione" -> {
            text = "• Aging prevention\n" +
                    "• AIDS\n" +
                    "• Cancer prevention\n" +
                    "• Bipolar disease\n" +
                    "• Cataract prevention\n" +
                    "• Chronic fatigue syndrome\n" +
                    "• Fertility/Infertility\n" +
                    "• Hepatitis\n" +
                    "• Macular degeneration\n" +
                    "• Parkinson's disease\n" +
                    "• Rheumatoid arthritis patients who take 8-10 aspirin/day\n" +
                    "• Schizophrenia\n" +
                    "• Arsenic poisoning\n" +
                    "• Fatty liver from thionamide, cleaning compound carbon tetrachloride, alcoholism, hepatitis, liver tumors\n" +
                    "• Lead toxicity\n" +
                    "• Mercury toxicity\n" +
                    "• Minamata disease (caused by mercury intoxication)\n" +
                    "• PCP/angel dust (phencyclidine) overdose in conjunction with lavage, charcoal and magnesium citrate\n" +
                    "• Phenacetin and aspirin overdoses Protects cells from lethal effects of ionizing radiation\n" +
                    "• Prevents ulcers caused by medications such as aspirin, phenylbutazone, and other NSAIDS (nonsteroidal anti-inflammatory drugs)\n" +
                    "• Protects against automobile exhaust\n" +
                    "• Protects lungs from cigarette smoke\n" +
                    "• Used in adjunct to hyperbaric oxygen treatment"
            ss = SpannableString(text)
        }
            "Glycine" -> {
            text = "• Benign prostatic hypertrophy\n" +
                    "• Gout\n" +
                    "• Insomnia\n" +
                    "• Schizophrenia\n" +
                    "• Detoxification (alleviates toxic effects of phenols, benzoic acid and methionine)\n" +
                    "• Epilepsy\n" +
                    "• Hypercholesterolemia\n" +
                    "• Isovaleric acidemia\n" +
                    "• Myasthenia (with manganese and vitamin E)\n" +
                    "• Muscular dystrophy\n" +
                    "• Reduces aggression when combined with inositol\n" +
                    "• Spasticity\n" +
                    "• Wound healing"
            ss = SpannableString(text)
        }
            "Hydrochloric Acid" -> {
                text = "• Hypo- or achlorhydria"
                ss = SpannableString(text)
                createLink(ss,"vitamin B12",text,"Vitamin","Vitamin B12 (Cobalamin)")
            }
            "Lipoic Acid" -> {
                text = "• AIDS\n" +
                        "• Alzheimer's disease\n" +
                        "• Diabetes mellitus\n" +
                        "• Hepatitis\n" +
                        "• Amanita mushroom poisoning"
                ss = SpannableString(text)
            }
            "Lysine" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Herpes simplex\n" +
                        "• Osteoporosis\n" +
                        "• May be helpful with Bell's palsy"
                ss = SpannableString(text)
            }
            "Melatonin" -> {
                text = "• Aging prevention\n" +
                        "• Alzheimer's disease\n" +
                        "• Anorexia nervosa\n" +
                        "• Bipolar disorder\n" +
                        "• Depression (especially seasonal affective disorder (SAD)\n" +
                        "• Cataract\n" +
                        "• Congestive heart failure\n" +
                        "• Chronic Fatigue Syndrome\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibromyalgia\n" +
                        "• Headaches, cluster and migraine\n" +
                        "• Insomnia\n" +
                        "• Menopause\n" +
                        "• Parkinson's disease\n" +
                        "• PMS\n" +
                        "• Aging\n" +
                        "• Bipolar disorders\n" +
                        "• Breast cancer\n" +
                        "• Bulimia\n" +
                        "• Dysthemia\n" +
                        "• Infertility\n" +
                        "• Insomnia\n" +
                        "• Jet lag\n" +
                        "• Prostate cancer"
                ss = SpannableString(text)
            }"Methionine" -> {
            text = "• Allergies\n" +
                    "• Attention deficit disorder\n" +
                    "• Bipolar disorder\n" +
                    "• Cholecystitis\n" +
                    "• Cholelithiasis\n" +
                    "• Depression\n" +
                    "• Endometriosis\n" +
                    "• Fibrocystic breast disease\n" +
                    "• Hemorrhoids\n" +
                    "• Hepatitis\n" +
                    "• Obesity\n" +
                    "• Oteoarthritis\n" +
                    "• PMS\n" +
                    "• Uterine fibroid\n" +
                    "• Congested liver detoxification\n" +
                    "• Heavy metal poisoning\n" +
                    "• High-histamine schizophrenia - used in combination with folic acid and calcium"
            ss = SpannableString(text)
        }
            "Methylsufonylmethane (MSM)" -> {
            text = "• Allergies\n" +
                    "• Fibromyalgia\n" +
                    "• Osteoarthritis\n" +
                    "• Rheumatoid Arthritis\n" +
                    "• Interstitial systitis\n" +
                    "• Snoring"
            ss = SpannableString(text)
        }
            "N-Acetyl Cysteine" -> {
            text = "• AIDS\n" +
                    "• Allergies\n" +
                    "• Asthma\n" +
                    "• Attention deficit disorder\n" +
                    "• Bronchitis\n" +
                    "• Cholelithiasis\n" +
                    "• Chronic fatigue syndrome\n" +
                    "• Otitis media, serous\n" +
                    "• PMS\n" +
                    "• Uterine fibroid\n" +
                    "• Acetaminophen (Tylenol) overdose\n" +
                    "• Acute respiratory syndrome\n" +
                    "• Alcohol induced gastric ulcers (animal studies)\n" +
                    "• Alleviates cobalt and molybdenum toxicity\n" +
                    "• Baldness and hair loss\n" +
                    "• Calcium oxalate urolithiasis\n" +
                    "• Cancer\n" +
                    "• Cancer related viral diseases\n" +
                    "• Cardiovascular disorders\n" +
                    "• Cystic fibrosis\n" +
                    "• Helicobacter pylori - helpful with other therapies\n" +
                    "• Photosensitivity\n" +
                    "• Protective against toxic effects of doxarubicin, adapsone, cisplatin\n" +
                    "• Upper respiratory diseases"
            ss = SpannableString(text)
        }
            "NADH" -> {
            text = "• Alzheimer's disease\n" +
                    "• Chronic fatigue syndrome\n" +
                    "• Depression\n" +
                    "• Parkinson's disease"
            ss = SpannableString(text)
        }
            "Phenylalanine" -> {
            text = "Bipolar disorder\n" +
                    "Depression\n" +
                    "Hypothyroidism\n" +
                    "Multiple sclerosis\n" +
                    "Memory loss\n" +
                    "Obesity\n" +
                    "Pain, associated with: dysmenorrhea, joint pains, low back pain, migraine, osteoarthritis, PMS, rheumatoid arthritis, psoriatic arthritis and whiplash\n" +
                    "Parkinson's disease\n" +
                    "Vitiligo (used in connection with ultra violet light)"
            ss = SpannableString(text)
        }
            "Phosphatidylserine" -> {
            text = "• Alzheimer's disease\n" +
                    "• Bipolar disorder\n" +
                    "• Depression\n" +
                    "• Memory loss"
            ss = SpannableString(text)
        }
            "Proline" -> {
            text = "• Ageing\n" +
                    "• Soft tissue injury, strains, lax tone, etc"
            ss = SpannableString(text)
        }
            "Pycnogenol" -> {
            text = "• Allergies\n" +
                    "• Atherosclerosis\n" +
                    "• Attention deficit disorder\n" +
                    "• Diabetes mellitus\n" +
                    "• Hypertension\n" +
                    "• PMS\n" +
                    "• Varicose veins"
            ss = SpannableString(text)
        }
            "Red Yeast Rice" -> {
            text = "• Atherosclerosis"
            ss = SpannableString(text)
        }
            "Quercetin" -> {
            text = "• Allergies\n" +
                    "• Antiviral - herpes virus I, para-influenzae 3, polio virus I, respiratory syncytial virus\n" +
                    "• Aphthous stomatitis\n" +
                    "• Asthma\n" +
                    "• Benign prostatic hypertrophy (BPH)\n" +
                    "• Bronchitis\n" +
                    "• Candidiasis\n" +
                    "• Cataract prevention\n" +
                    "- if diabetic\n" +
                    "• Crohn's disease\n" +
                    "• Diabetes mellitus\n" +
                    "• Eczema\n" +
                    "• Fibrocystic breast disease\n" +
                    "• Fibromyalgia\n" +
                    "• Gout\n" +
                    "• Headaches\n" +
                    "• Hemorrhoids\n" +
                    "• Irritable bowel syndrome\n" +
                    "• Otitis media\n" +
                    "• Ovarian cancer - inhibition of tumor promotion (squamous cell carcinoma, ovarian carcinoma and estrogen receptor negative breast cancer)\n" +
                    "• Psoriasis\n" +
                    "• Psoriatic arthritis\n" +
                    "• Rheumatoid arthritis\n" +
                    "• Ulcerative colitis\n" +
                    "• Atopic dermatitis\n" +
                    "• Diabetic cataracts, neuropathy, retinopathy\n" +
                    "• Inflammatory conditions"
            ss = SpannableString(text)
        }
            "S-Adenosyl-L-Methionine (SAM)" -> {
            text = "• Bipolar disorder\n" +
                    "• Depression\n" +
                    "• Fertility/Infertility\n" +
                    "• Fibromyalgia\n" +
                    "• • Osteoarthritis\n" +
                    "• Parkinson's disease\n" +
                    "• Cirrhosis\n" +
                    "• Drug rehabilitation\n" +
                    "• Gilbert's syndrome\n" +
                    "• Migraine\n" +
                    "• Oral contraceptive-induced liver damage\n" +
                    "• Postpartum depression"
            ss = SpannableString(text)
        }
            "Taurine" -> {
            text = "• Congestive heart failure\n" +
                    "• Cholecystitis\n" +
                    "• Cholelithiasis\n" +
                    "• Diabetes mellitus\n" +
                    "• Endometriosis\n" +
                    "• Hepatitis\n" +
                    "• Hypertension\n" +
                    "• Macular degeneration\n" +
                    "• Acute hepatitis\n" +
                    "• Cardiovascular disease\n" +
                    "• Cystic fibrosis\n" +
                    "• Down's syndrome\n" +
                    "• Hypercholesterolemia\n" +
                    "• Seizures"
            ss = SpannableString(text)
        }
            "Tryptophan" -> {
            text = "• Anorexia nervosa\n" +
                    "• Attention deficit disorder\n" +
                    "• Bipolar disorder\n" +
                    "• Cataract prevention\n" +
                    "• Depression\n" +
                    "• Fibromyalgia\n" +
                    "• Insomnia\n" +
                    "• Multiple sclerosis\n" +
                    "• Obesity\n" +
                    "• Parkinson's disease\n" +
                    "• PMS\n" +
                    "• Affective disorder\n" +
                    "• Alcoholism\n" +
                    "• Alleviation of pain\n" +
                    "• Alzheimer's disease\n" +
                    "• Bulimia\n" +
                    "• Down's syndrome\n" +
                    "• Eating disorder\n" +
                    "• Hypokinetic and psychotic syndromes\n" +
                    "• Insomnia\n" +
                    "• Migraines\n" +
                    "• Obsessive compulsive disorder\n" +
                    "• Panic disorder\n" +
                    "• Phenylketonuria\n" +
                    "• Reduced immune function as seen in AIDS\n" +
                    "• Seasonal affective disorder (SAD)\n" +
                    "• Sexual function\n" +
                    "• Suicidal behavior"
            ss = SpannableString(text)
        }
            "Tyrosine" -> {
            text = "• Depression\n" +
                    "• Hypothyroidism\n" +
                    "• Obesity\n" +
                    "• Parkinson's disease\n" +
                    "• PMS\n" +
                    "• Fatigue due to stress\n" +
                    "• Restless leg syndrome\n" +
                    "• Substance addiction"
            ss = SpannableString(text)
        }
        }

        createLink(ss,"Aging prevention",text,"Condition","Aging Prevention")
        createLink(ss,"AIDS",text,"Condition","AIDS")
        createLink(ss,"Anorexia nervosa",text,"Condition","Anorexia Nervosa")
        createLink(ss,"Autism",text,"Condition","Autism")
        createLink(ss,"Attention decficit disorder (ADD)",text,"Condition","Attention Deficit Disorder")
        createLink(ss,"Allergies",text,"Condition","Allergies")
        createLink(ss,"Alzheimer's disease",text,"Condition","Alzheimer's Disease")
        createLink(ss,"Aphthous stomatitis",text,"Condition","Aphthous Stomatitis")
        createLink(ss,"Asthma",text,"Condition","Asthma")
        createLink(ss,"Atherosclerosis",text,"Condition","Atherosclerosis")
        createLink(ss,"Autism",text,"Condition","Autism")
        createLink(ss,"Bipolar disorder",text,"Condition","Bipolar Disorder")
        createLink(ss,"Bipolar disease",text,"Condition","Bipolar Disorder")
        createLink(ss,"Benign prostatic hypertrophy (BPH)",text,"Condition","Benign Prostatic Hypertrophy")
        createLink(ss,"Benign prostatic hypertrophy",text,"Condition","Benign Prostatic Hypertrophy")
        createLink(ss,"Cancer prevention",text,"Condition","Cancer Prevention")
        createLink(ss,"Cataract",text,"Condition","Cataract")
        createLink(ss,"Cataract prevention",text,"Condition","Cataract prevention")
        createLink(ss,"Chronic fatigue syndrome",text,"Condition","Chronic Fatigue Syndrome")
        createLink(ss,"Congestive heart failure",text,"Condition","Congestive Heart Failure")
        createLink(ss,"Cholecystitis",text,"Condition","Cholecystitis")
        createLink(ss,"Cholelithiasis",text,"Condition","Cholelithiasis")
        createLink(ss,"Crohn's disease",text,"Condition","Crohn's Disease")
        createLink(ss,"Diabetes",text,"Condition","Diabetes Mellitus")
        createLink(ss,"Depression",text,"Condition","Depression")
        createLink(ss,"Dysmenorrhea",text,"Condition","Dysmenorrhea")
        createLink(ss,"dysmenorrhea",text,"Condition","Dysmenorrhea")
        createLink(ss,"Eczema",text,"Condition","Eczema")
        createLink(ss,"Endometriosis",text,"Condition","Endometriosis")
        createLink(ss,"Fertility/Infertility",text,"Condition","Fertility")
        createLink(ss,"Fertility",text,"Condition","Fertility")
        createLink(ss,"Fibrocystic breast disease",text,"Condition","Fibrocystic Breast Disease")
        createLink(ss,"Fibromyalgia",text,"Condition","Fibromyalgia")
        createLink(ss,"Gout",text,"Condition","Gout")
        createLink(ss,"Headache",text,"Condition","Headache")
        createLink(ss,"Hepatitis C",text,"Condition","Hepatitis")
        createLink(ss,"Hepatitis",text,"Condition","Hepatitis")
        createLink(ss,"Herpes simplex",text,"Condition","Herpes Simplex")
        createLink(ss,"Hemorrhoids",text,"Condition","Hemorrhoids")
        createLink(ss,"Hypertension",text,"Condition","Hypertension")
        createLink(ss,"Hypercholesterolemia",text,"Condition","Hypercholesterolemia")
        createLink(ss,"Hypothyroidism",text,"Condition","Hypothyroidism")
        createLink(ss,"Impotence",text,"Condition","Impotence")
        createLink(ss,"Insomnia",text,"Condition","Insomnia")
        createLink(ss,"Irritable bowel syndrome",text,"Condition","Irritable Bowel Syndrome")
        createLink(ss,"Macular degeneration",text,"Condition","Macular Degeneration")
        createLink(ss,"Macular degeneration",text,"Condition","Macular Degeneration")
        createLink(ss,"Menopause",text,"Condition","Menopause")
        createLink(ss,"Multiple sclerosis",text,"Condition","Multiple Sclerosis")
        createLink(ss,"Memory Loss",text,"Condition","Memory Loss")
        createLink(ss,"Obesity",text,"Condition","Obesity")
        createLink(ss,"Osteoarthritis",text,"Condition","Osteoarthritis")
        createLink(ss,"osteoarthritis",text,"Condition","Osteoarthritis")
        createLink(ss,"Short term memory loss",text,"Condition","Memory Loss")
        createLink(ss,"Peptic ulcers",text,"Condition","Peptic Ulcers")
        createLink(ss,"Psoriasis",text,"Condition","Psoriasis")
        createLink(ss,"PMS",text,"Condition","PMS")
        createLink(ss,"Psoriatic arthritis",text,"Condition","Psoriatic Arthritis")
        createLink(ss,"psoriatic arthritis",text,"Condition","Psoriatic Arthritis")
        createLink(ss,"Parkinson's disease",text,"Condition","Parkinson's Disease")
        createLink(ss,"Rheumatoid arthritis",text,"Condition","Rheumatoid Arthritis")
        createLink(ss,"rheumatoid arthritis",text,"Condition","Rheumatoid Arthritis")
        createLink(ss,"Schizophrenia",text,"Condition","Schizophrenia")
        createLink(ss,"Uterine Fibroids",text,"Condition","Uterine Fibroids")
        createLink(ss,"Ulcerative colitis",text,"Condition","Ulcerative Colitis")

        binding.contentData.text = ss
        binding.subHeading.text = "Description"
    }//

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
            "Alanine" -> {
                function_text = "• Antiketogenic\n" +
                "• Cholesterol reducing effect when used with arginine and glycine\n" +
                        "• Contributes to thymus growth, indirectly increases lymphocytes\n" +
                        "• Essential in the metabolism of tryptophan and pyridoxine\n" +
                        "• Inhibitory neurotransmitter, paralleling the anti-epileptic effect of GABA and taurine\n" +
                        "• Inhibits post exercise ketosis\n" +
                        "• May be used as a source for glucose\n" +
                        "• Promotes phosphate and oxalate stone breakdown in animals\n" +
                        "• Released by muscle, it is a major energy source\n" +
                        "• Reduces triglycerides\n" +
                        "• Triggers the release of glucagon"
                function_ss = SpannableString(function_text)
            }
            "Amino Acids" -> {
                function_text = "• See individual amino acid"
                function_ss = SpannableString(function_text)
            }
            "Arginine" -> {
                function_text = "• Activates acetyl glutamate synthetase\n" +
                        "• Essential for the transport, storage, and excretion of nitrogen\n" +
                        "• High energy compound in muscle\n" +
                        "• Inhibits cellular replication of Ehrlich ascites tumor cells\n" +
                        "• Necessary for mitosis\n" +
                        "• Precursor to the neurotransmitter nitric oxide\n" +
                        "• Regulates protein metabolism throughout the body\n" +
                        "• Stimulates the activity of carbamyl phosphate synthetase, which starts the urea cycle\n" +
                        "• Stimulates T lymphocytes\n" +
                        "• Used in the synthesis of creatine\n" +
                        "• Used in the synthesis of guanidinoacetic acid\n" +
                        "• Used in the synthesis of polyamines"
                function_ss = SpannableString(function_text)
            }
            "Bioflavonoids" -> {
                function_text = "• Adjuvant to vitamin C\n" +
                        "• Antiallergic\n" +
                        "• Anti-inflammatory\n" +
                        "• Antiviral\n" +
                        "• Collagen crosslinking\n" +
                        "• Modifies the body's response to foreign compounds, allergens, carcinogens, viruses\n" +
                        "• Prevents free radical and oxidative damage\n" +
                        "• Protects and preserves the structure of capillary blood vessel integrity\n" +
                        "• Stimulates bile production"
                function_ss = SpannableString(function_text)
                createLink(function_ss,"vitamin C",function_text,"Vitamin","Vitamin C (Ascorbic Acid)")
            }
            "Bromelain" -> {
                function_text = "• Anti-inflammatory:\n" +
                        "• Antimicrobial\n" +
                        "• Causes fibrinolysis activity via the plasminogen-plasmin system\n" +
                        "• Depletes kininogen\n" +
                        "• Inhibits biosynthesis of proinflammatory prostaglandins and induction of prostaglandin E1 accumulation\n" +
                        "• Mucolytic\n" +
                        "• Permeability-modifying activity\n" +
                        "• Platelet aggregation inhibitor\n" +
                        "• Substitute for trypsin or pepsin in pancreatic insufficiency and post pancreaectomy"
                function_ss = SpannableString(function_text)
            }
            "Carnitine" -> {
                function_text = "• 1-3 gm. daily oxidizes triglycerides\n" +
                        "• Appears to build up acetylcholine and dopamine\n" +
                        "• Helps remove ketones from the blood\n" +
                        "• Hepatoprotective against depakote (a drug used for seizures, anger, impulse and manic depressive disorders)\n" +
                        "• Impacts circadian rhythm of cortisol\n" +
                        "• Involved in prostaglandin metabolism in smooth muscles\n" +
                        "• Provides energy for sperm motility\n" +
                        "• Provides energy to muscles, including the heart\n" +
                        "• Regulates fat metabolism\n" +
                        "• Transfers fatty acids across the mitochondrial membranes, oxidizing fat for energy\n" +
                        "• Vasodilator (in animal studies)"
                function_ss = SpannableString(function_text)
            }
            "Carnosine" -> {
                function_text="• Antioxidant\n" +
                        "• Glycosylator - prevents protein glycosylation\n" +
                        "• Chelates heavy metals\n" +
                        "• Stabilizes cell membranes\n" +
                        "• Immune system stimulator\n" +
                        "• Increases wound healing"
                function_ss = SpannableString(function_text)
            }
            "Cystine" -> {
                function_text = "• Breaks down mucus deposits\n" +
                        "• Contributes to the structure of proteins by holding them in shape\n" +
                        "• Contributes to the form and mechanical properties of proteins\n" +
                        "• Found in hair keratin, insulin, and certain digestive enzymes, chromotrypsinogen A, papain and trypsinogen\n" +
                        "• Needed by the body for proper utilization of vitamin B6\n" +
                        "• Stabilizes tertiary structure of certain macromolecules"
                function_ss = SpannableString(function_text)
            }
            "Dehydroepiandrosterone (DHEA)" -> {
                function_text = "• Blocks the action of cells to divide uncontrollably\n" +
                        "• Converts to estrogen and testosterone\n" +
                        "• DHEA-S (DHEA's ester) has digitalis-like activity in rabbits\n" +
                        "• Enhances immune response to viral infections\n" +
                        "• Enhances immune system function\n" +
                        "• Enhances libido for both men and women\n" +
                        "• Fights stress due to an increase in cortisol\n" +
                        "• Improves insulin sensitivity and glucose tolerance\n" +
                        "• Improves memory\n" +
                        "• Increases lean body mass\n" +
                        "• May exert an inhibitory effect on bone resorption\n" +
                        "• Prevents chemically-induced colon and liver cancers and skin papillomas in mice studies\n" +
                        "• Reduces depression caused by cortisol\n" +
                        "• Stimulates bone formation and calcium absorption"
                function_ss = SpannableString(function_text)
            }
            "Digestive Enzymes" -> {
                function_text = "• Pancreatic proteases:\n" +
                        "Trypsin\n" +
                        "Splits whole and partially digested protein into peptides of various sizes but does not cause release of individual amino acids\n" +
                        "Chymotrypsin\n" +
                        "Splits whole and partially digested protein into peptides of various sizes but does not cause release of individual amino acids\n" +
                        "Carboxypolypeptidase\n" +
                        "Splits individual amino acids from the carboxyl ends of peptides\n" +
                        "Ribonuclease\n" +
                        "Splits ribonucleic acid\n" +
                        "Deoxyribonuclease\n" +
                        "Splits deoxyribonucleic acid\n" +
                        "• Pancreatic amylase:\n" +
                        "Hydrolyzes starches, glycogen and most other carbohydrates except cellulose to form disaccharides and a few trisaccharides\n" +
                        "• Pancreatic lipase:\n" +
                        "Hydrolyzes neutral fat into fatty acids and monoglycerides\n" +
                        "• Pancreatic cholesterol esterase:\n" +
                        "Hydrolyzes cholesterol esters\n" +
                        "• Pancreatic phospholipase:\n" +
                        "Splits fatty acids from phospholipids"
                function_ss = SpannableString(function_text)
            }
            "Dimethyl Glycine (DMG)" -> {
                function_text = "• Increases blood and oxygen supplies to tissues\n" +
                        "• Involved with protein synthesis\n" +
                        "• Involved with regulation of steroid hormones\n" +
                        "• Involved with respiratory cycle of cells\n" +
                        "• Reduces hyper-proliferation of certain kinds of cells"
                function_ss = SpannableString(function_text)
            }
            "Ethylenediaminetetraacetic acid (EDTA)" -> {
                function_text = "• Pulls heavy metals from the body\n" +
                        "• Dissolves LDL cholesterol plaques"
                function_ss = SpannableString(function_text)
            }
            "Fructooligosaccharides (FOS)" -> {
                function_text = "• Enhances elimination of toxic substances\n" +
                        "• Feeds the friendly gut bacteria\n" +
                        "• Improves liver function\n" +
                        "• Increases production of butyrate, a beneficial short-chain fatty acid\n" +
                        "• Increases Lactobacilli and Bifidobacteria\n" +
                        "• Reduces cholesterol\n" +
                        "• Reduces detrimental bacteria\n" +
                        "• Reduces hypertension"
                function_ss = SpannableString(function_text)
            }
            "Fumaric Acid" -> {
                function_text = "• Intermediate in the Krebs cycle\n" +
                        "• Prevents accumulation of half-products in the skin"
                function_ss = SpannableString(function_text)
            }
            "Glandulars"->{
                function_text = "• Aorta\n" +
                        "• Brain\n" +
                        "• Heart\n" +
                        "• Intestines - Large and Small\n" +
                        "• Kidney\n" +
                        "• Liver\n" +
                        "• Nerve\n" +
                        "• Prostate\n" +
                        "• Spleen\n" +
                        "• Uterus\n" +
                        "• Bone\n" +
                        "• Bone Marrow\n" +
                        "• Spinal Cord"
                function_ss = SpannableString(function_text)
            }
            "Glucosamine Sulfate" -> {
                function_text = "• Inhibits cartilage lesions from developing in animal models of arthrosis\n" +
                        "• Integrates with metabolic pool of endogenous glycosaminoglycans\n" +
                        "• Provides sulfate ions for synthesis of chondroitin sulfate and keratan sulfate\n" +
                        "• Stimulates the synthesis of proteoglycans and glycosaminoglycans"
                function_ss = SpannableString(function_text)

            }
            "Glutamic Acid" -> {
                function_text ="• Can be utilized to make glutathione, ketoglutamate, pyrroles, histidine, glutamine and gamma-aminobutyric acid\n" +
                        "• Involved in the photoreceptor transmission in the retina\n" +
                        "• Mega doses raise IQ\n" +
                        "• Required for the synthesis of folic acid\n" +
                        "• Stimulant/excitatory neurotransmitter"
                function_ss = SpannableString(function_text)
            }
            "Glutamine" -> {
                function_text = "• Can provide adequate energy for the brain in the absence of glucose\n" +
                        "• Cofactor in the metabolism of benzoates\n" +
                        "• Decreases voluntary consumption of alcohol in rats\n" +
                        "• Detoxifier of ammonia from the brain\n" +
                        "• Essential for the synthesis of niacin\n" +
                        "• Essential in maintaining the body's nitrogen balance\n" +
                        "• Essential in the metabolism of arginine\n" +
                        "• Essential in the metabolism of uric acid\n" +
                        "• Increases growth of mucosal epithelial cells\n" +
                        "• Primary mediator and energy source for GABA and glutamic acid activity"
                function_ss = SpannableString(function_text)
            }"Glutathione" -> {
            function_text = "• Forms GSH peroxidase which reduces peroxides\n" +
                    "• Forms GSH S-transferases in the liver reducing toxic and carcinogenic substances into less harmful products\n" +
                    "• Found in lymphocytes, phagocytes, macrophages of prostaglandin leukotriene C\n" +
                    "• GSH is a reducing agent\n" +
                    "• Helps detox the liver of poisonous chemicals, especially alcohol\n" +
                    "• Helps protect integrity of red blood cells\n" +
                    "• Indirectly helps transport amino acids across membranes\n" +
                    "• Involved in red blood cell membranes\n" +
                    "• Neurotransmitter\n" +
                    "• Powerful antioxidant\n" +
                    "• Protects stomach lining against stomach acid"
            function_ss = SpannableString(function_text)
        }"Glycine" -> {
            function_text = "• Builds glycogen levels\n" +
                    "• Binds to the locus ceruleus in the midbrain and decreases the output of norepinephrine leading to calmness\n" +
                    "• Enters the Krebs cycle through pyruvate\n" +
                    "• Glycine, taurine and GABA are the major inhibitory neurotransmitters of the brain\n" +
                    "• Helps in the manufacture of DNA, glycerol and phospholipids, cholesterol conjugates, skin proteins, collagen and glutathione\n" +
                    "• Important in the photochemical action of the retina\n" +
                    "• Increases renal clearance of uric acid\n" +
                    "• Releases growth hormone in high doses"
            function_ss = SpannableString(function_text)
        }
            "Hydrochloric Acid" -> {
                function_text = "• Involved in the conversion of pepsinogen to the active enzyme pepsin\n" +
                        "• Involved with intrinsic factor which is involved in absorption of vitamin B12\n" +
                        "• Needed for absorption of folic acid\n" +
                        "• Needed for absorption of vitamin B1\n" +
                        "• Needed for absorption of vitamin B6\n" +
                        "• Needed for most mineral absorption\n" +
                        "• Needed for releasing vitamin B2 in foods so that it may be absorbed\n" +
                        "• Needed for releasing vitamin B12 from protein complex in food"
                function_ss = SpannableString(function_text)
                createLink(function_ss,"vitamin B12",function_text,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(function_ss,"folic acid",function_text,"Vitamin","Folate (Folic Acid)")
                createLink(function_ss,"vitamin B1",function_text,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(function_ss,"vitamin B6",function_text,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(function_ss,"vitamin B2",function_text,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(function_ss," vitamin B12 ",function_text,"Vitamin","Vitamin B12 (Cobalamin)")
            }
            "Lipoic Acid" -> {
                function_text = "• Antioxidant\n" +
                        "• Helps reduce elevated liver enzymes\n" +
                        "• Improves blood flow to peripheral nerves\n" +
                        "• Improves blood sugar metabolism\n" +
                        "• Inhibits glycosylation of tissue proteins\n" +
                        "• Inhibits HIV replication by reducing the activity of reverse transcriptase\n" +
                        "• Stimulates regeneration of nerve fibers\n" +
                        "• Works synergistically with vitamins B1 and B3 to produce ATP"
                function_ss = SpannableString(function_text)
            }
            "Lysine" -> {
                function_text = "• Aids in formation of antibodies\n" +
                        "• Improves calcium assimilation\n" +
                        "• Stops growth of herpes simplex"
                function_ss = SpannableString(function_text)
            }
            "Melatonin" -> {
                function_text = "• Enhances interferon and interleukin 2 treatments for cancers\n" +
                        "• Enhances interferon, tumor necrosis factor and tamoxifen treatments for cancer\n" +
                        "• Enhances serotonin antidepressants, i.e. Prozac, Zoloft and Paxil\n" +
                        "• Helps protect the brain and body from free-radical damage\n" +
                        "• Induces sleep in individuals with low melatonin levels\n" +
                        "• Influences the thymus gland\n" +
                        "• Inhibits initiation and promotion of cancers, especially hormonally related cancers\n" +
                        "• Mildly stimulates growth hormone secretion from the pancreas\n" +
                        "• Suppresses sympathetic activity"
                function_ss = SpannableString(function_text)
            }"Methionine" -> {
            function_text = "• Breaks down estrogens\n" +
                    "• Increases iron absorption\n" +
                    "• Maintains cartilage\n" +
                    "• Methionine activating enzyme makes S-adenosyl L-methionine (SAM)\n" +
                    "• Required for carnitine synthesis\n" +
                    "• Required for choline synthesis\n" +
                    "• Required for creatine synthesis\n" +
                    "• Required for epinephrine synthesis\n" +
                    "• Required for histamine breakdown\n" +
                    "• Required for melatonin synthesis\n" +
                    "• Required for nucleic acid synthesis\n" +
                    "• Required for the production of glutathione\n" +
                    "• Vast majority of proteins in the body begin with methionine"
            function_ss = SpannableString(function_text)
        }"Methylsufonylmethane (MSM)" -> {
            function_text = "• Relieves inflammation and pain of osteoarthritis and rheumatoid arthritis\n" +
                    "• Prevents allergic response to seasonal allergens\n" +
                    "• Stimulates the production of healthy keratin and collagen, thus beneficial for skin, hair, nails and arteries\n" +
                    "• Makes skin cells and tissue soft and permeable, allowing the skin to sweat out unwanted toxins more easily"
            function_ss = SpannableString(function_text)
        }"N-Acetyl Cysteine" -> {
            function_text = "• Antidotes toxic overdoses and Tylenol overdoses\n" +
                    "• Antioxidant properties include:\n" +
                    "Primary defense against intracellular oxidative damage\n" +
                    "Enzyme-catalyzed antioxidant\n" +
                    "Mediator of neutrophilic scavenging activity\n" +
                    "• Binds to intracellular eletrophiles, forming inactive thioethers\n" +
                    "• Essential precursor for glutathione biosynthesis\n" +
                    "• Free radical scavenger\n" +
                    "• Glutathione detoxes halogen substituted aliphatic and aromatic hydrocarbons\n" +
                    "• Improves phagocytic capacity of alveolar macrophages\n" +
                    "• Prohibits both spontaneous and induced mutations in bacteria\n" +
                    "• Mucolytic agent\n" +
                    "• Regulatory mediator between macrophages and lymphocytes"
            function_ss = SpannableString(function_text)
            createLink(function_ss,"glutathione,",function_text,"Supplement","Glutathione")
            createLink(function_ss,"l-methionine ",function_text,"Supplement","Methionine")
            createLink(function_ss,"glutathione ",function_text,"Supplement","Glutathione")
        }"NADH" -> {
            function_text = "• Energy production"
            function_ss = SpannableString(function_text)
        }"Phenylalanine" -> {
            function_text = "• Blocks enkephalinase in the CNS\n" +
                    "• Precursor to tyrosine, tyramine, dopamine, epinephrine, norepinephrine\n" +
                    "• Required for normal thyroid function\n" +
                    "• Triggers the release of cholycystokinin, including satiety"
            function_ss = SpannableString(function_text)
        }"Phosphatidylserine" -> {
            function_text = "• Improves behavioral performance by restoring cell membrane composition\n" +
                    "• Improves cognitive function by restoring cell membrane composition\n" +
                    "• Improves emotional well-being by restoring cell membrane composition"
            function_ss = SpannableString(function_text)
        }"Proline" -> {
            function_text = "• Essential element in some neuropeptides\n" +
                    "• One form of substance P is a tetrapeptide containing arginine-proline, lysine-proline\n" +
                    "• One of the main component of collagen\n" +
                    "• Stimulates wound healing"
            function_ss = SpannableString(function_text)
        }"Pycnogenol" -> {
            function_text = "• Counteracts spontaneous mutation in Saccharomyces cerevisiae both at nuclear and mitochondrial levels\n" +
                    "• Decreases the postoperative edema associated with certain surgeries\n" +
                    "• Free radical scavenging action\n" +
                    "• Histidine decarboxylase inhibitors, lowering histamine levels in the aortic endothelium\n" +
                    "• Increases capillary resistance\n" +
                    "• Inhibits activities of proteolytic electase and collagenase\n" +
                    "• Inhibits the activities of the glycosides hyaluronidase and beta-glucuronidase\n" +
                    "• Inhibits xanthine oxidase activity\n" +
                    "• Prevents vascular permeability in animal studies"
            function_ss = SpannableString(function_text)
        }"Red Yeast Rice" -> {
            function_text = "• Lowers blood levels of both cholesterol and triglycerides\n" +
                    "• Direct inhibitory effect on HMG-CoA-reductase and reduced cellular cholesterol levels"
            function_ss = SpannableString(function_text)
        }"Quercetin" -> {
            function_text = "• Affects a variety of enzyme systems:\n" +
                    "Aldose reductase (an enzyme which promotes the synthesis and intracellular accumulation of sorbitol)\n" +
                    "Catechol-O-methyltransferase\n" +
                    "Cyclic nucleotide phosphodiesterases\n" +
                    "Cyclo-oxygenase\n" +
                    "Estrogen synthetase\n" +
                    "Histidine decarboxylase\n" +
                    "Hyaluronidase\n" +
                    "Phospholipase A2\n" +
                    "Protein kinases\n" +
                    "Transport ATPases\n" +
                    "Xanthine oxidase\n" +
                    "• Anti-inflammatory - prevents mast cell and basophil degranulation\n" +
                    "• Anti-oxidant\n" +
                    "• Helps reduce the formation of leukotrienes\n" +
                    "• Increases cyclic AMP\n" +
                    "• Inhibits phospholipase A 2\n" +
                    "• Inhibits platelet aggregation\n" +
                    "• Prevents breakdown of collagen matrix of connective tissue and ground substance\n" +
                    "• Protects pancreatic beta cells from damaging effects of free radicals\n" +
                    "• Sparing effect on epinephrine\n" +
                    "• Stabilizes membranes"
            function_ss = SpannableString(function_text)
        }"S-Adenosyl-L-Methionine (SAM)" -> {
            function_text = "• Decreases serum bilirubin with Gilbert's syndrome\n" +
                    "• Essential for all sulfur-containing compounds synthesis, including glutathione and other cartilage components that contain sulfur\n" +
                    "• Functions closely with folic acid and vitamin B12 in methylation reactions\n" +
                    "• Improves binding of neurotransmitters to receptor sites\n" +
                    "• Improves fluidity of brain cell membrane\n" +
                    "• Improves membrane function of the liver\n" +
                    "• Improves the structure and function of cartilage in osteoarthritic joints\n" +
                    "• Inactivates estrogens\n" +
                    "• Increases levels of glutathionine\n" +
                    "• Increases levels of serotonin, dopamine and phosphatidylserine\n" +
                    "• May reduce the risk of liver cancer in individuals with chronic liver diseases like chronic hepatitis\n" +
                    "• Necessary for manufacture of neurotransmitters and phospholipids like phosphatidylcholine and phosphatidylserine\n" +
                    "• Promotes bile flow\n" +
                    "• Relieves inflammation and pain of osteoarthritis"
            function_ss = SpannableString(function_text)
        }"Taurine" -> {
            function_text = "• Facilitates the cellular flux of sodium, potassium and possibly calcium and magnesium ions\n" +
                    "• Increases the hormone prolactin for lactating women\n" +
                    "• May be an inhibitory neurotransmitter\n" +
                    "• Modulates calcium flux and neuron excitability\n" +
                    "• Modulates the activity of cAMP\n" +
                    "• Part of white blood cell defense mechanism\n" +
                    "• Required for conjugation of bile acids\n" +
                    "• Required for nervous system development\n" +
                    "• Required for the normal functioning of the heart, brain, eyes, gallbladder, and vascular system"
            function_ss = SpannableString(function_text)
        }"Tryptophan" -> {
            function_text = "• Essential in the synthesis of nicotinic acid\n" +
                    "• Large doses increases prolactin and growth hormone\n" +
                    "• Precursor to serotonin"
            function_ss = SpannableString(function_text)
        }"Tyrosine" -> {
            function_text = "• Increases appetite in small doses\n" +
                    "• Increases libido, due to increased catecholamine levels\n" +
                    "• Precursor to hormones such as thyroid and catecholestrogens\n" +
                    "• Precursor for melanin\n" +
                    "• Precursor to neurotransmitters norepinephrine, epinephrine and dopamine\n" +
                    "• Reduces appetite in large doses"
            function_ss = SpannableString(function_text)
        }
        }
        binding.contentData.text = function_ss
        binding.subHeading.text = "Physiologic Functions"


    }//

    private fun setPlantFoodData(heading: String) {
        var text = ""

        when(heading){
            "Alanine" -> {
                text = "• Avocado\n" +
                        "• Cheese\n" +
                        "• Chicken\n" +
                        "• Chocolate\n" +
                        "• Cottage cheese\n" +
                        "• Duck\n" +
                        "• Egg\n" +
                        "• Granola\n" +
                        "• Oat flakes\n" +
                        "• Pork\n" +
                        "• Ricotta\n" +
                        "• Turkey\n" +
                        "• Wheat germ\n" +
                        "• Whole milk\n" +
                        "• Wild game\n" +
                        "• Yogurt"
                ss = SpannableString(text)
            }
            "Arginine" -> {
                text = "Cheese\n" +
                        "Chocolate\n" +
                        "Eggs\n" +
                        "Meat\n" +
                        "Nuts"
                ss = SpannableString(text)
            }
            "Bioflavonoids" -> {
                text = "• Berries\n" +
                        "• Cherries\n" +
                        "• Citrus fruits\n" +
                        "• Grapes\n" +
                        "• Green tea\n" +
                        "• Onions\n" +
                        "• Parsley\n" +
                        "• Red wine\n" +
                        "• Rose hips\n" +
                        "• Sage\n" +
                        "• Yellow, red and green vegetables"
                ss = SpannableString(text)
            }
            "Bromelain" -> {
                text = "• Pineapple"
                ss = SpannableString(text)
            }
            "Carnitine" -> {
                text = "• Dairy products\n" +
                        "• Meat, especially red meat\n" +
                        "• Poultry"
                ss = SpannableString(text)
            }
            "Carnosine" -> {
                text="• Fish\n" +
                        "• Meat, especially red meat\n" +
                        "• Poultry"
                ss = SpannableString(text)
            }
            "Cystine" -> {
                text = "• Avocado\n" +
                        "• Cheese\n" +
                        "• Chicken\n" +
                        "• Chocolate\n" +
                        "• Cottage cheese\n" +
                        "• Duck\n" +
                        "• Egg\n" +
                        "• Granola\n" +
                        "• Oat flakes\n" +
                        "• Pork\n" +
                        "• Ricotta\n" +
                        "• Turkey\n" +
                        "• Wheat germ\n" +
                        "• Whole milk\n" +
                        "• Wild game\n" +
                        "• Yogurt"
                ss = SpannableString(text)
            }
            "Digestive Enzymes" -> {
                text = "• Gastric lipase\n" +
                        "Small quantity\n" +
                        "Digests butter fat\n" +
                        "No lypolytic activity on other fats\n" +
                        "• Gastric amylase\n" +
                        "Small role in digestion of starches\n" +
                        "• Gelatinase\n" +
                        "Helps liquify some proteoglycans in meat"
                ss = SpannableString(text)
            }
            "Dimethyl Glycine (DMG)" -> {
                text = "• Brewer's yeast\n" +
                        "• Liver/organ meats\n" +
                        "• Pumpkin seeds\n" +
                        "• Sesame seeds\n" +
                        "• Whole brown rice"
                ss = SpannableString(text)
            }
            "Fructooligosaccharides (FOS)" -> {
                text = "• Asparagus\n" +
                        "• Garlic\n" +
                        "• Jerusalem artichokes\n" +
                        "• Onions"
                ss = SpannableString(text)
            }
            "Glandulars"->{
                text = "• Adrenal\n" +
                        "• Hypothalamus\n" +
                        "• Lung\n" +
                        "• Lymph\n" +
                        "• Ovary\n" +
                        "• Pancreas\n" +
                        "• Parathyroid\n" +
                        "• Pineal\n" +
                        "• Pituitary\n" +
                        "• Testes\n" +
                        "• Thymus\n" +
                        "• Thyroid"
                ss = SpannableString(text)
            }
            "Glutamic Acid" -> {
                text ="• Avocado\n" +
                        "• Cheese\n" +
                        "• Chicken\n" +
                        "• Chocolate\n" +
                        "• Cottage cheese\n" +
                        "• Duck\n" +
                        "• Egg\n" +
                        "• Granola\n" +
                        "• Oat flakes\n" +
                        "• Pork\n" +
                        "• Ricotta\n" +
                        "• Turkey\n" +
                        "• Wheat germ\n" +
                        "• Whole milk\n" +
                        "• Wild game\n" +
                        "• Yogurt"
                ss = SpannableString(text)
            }
            "Glutamine" -> {
                text = "• Avocado\n" +
                        "• Cheese\n" +
                        "• Chicken\n" +
                        "• Chocolate\n" +
                        "• Cottage cheese\n" +
                        "• Duck\n" +
                        "• Egg\n" +
                        "• Granola\n" +
                        "• Oat flakes\n" +
                        "• Pork\n" +
                        "• Ricotta\n" +
                        "• Turkey\n" +
                        "• Wheat germ\n" +
                        "• Whole milk\n" +
                        "• Wild game\n" +
                        "• Yogurt"
                ss = SpannableString(text)
            }
            "Glutathione" -> {
            text = "• Fresh fruits\n" +
                    "• Fresh meats\n" +
                    "• Fresh vegetables, especially asparagus and avocados"
            ss = SpannableString(text)
        }
            "Glycine" -> {
            text = "• Avocado\n" +
                    "• Cheese\n" +
                    "• Chicken\n" +
                    "• Chocolate\n" +
                    "• Cottage cheese\n" +
                    "• Duck\n" +
                    "• Egg\n" +
                    "• Granola\n" +
                    "• Oat flakes\n" +
                    "• Pork\n" +
                    "• Ricotta\n" +
                    "• Turkey\n" +
                    "• Wheat germ\n" +
                    "• Whole milk\n" +
                    "• Wild game\n" +
                    "• Yogurt"
            ss = SpannableString(text)
        }
            "Lysine" -> {
                text = "• Beef\n" +
                        "• Brewer's yeast\n" +
                        "• Cheese\n" +
                        "• Chicken\n" +
                        "• Fish\n" +
                        "• Lamb\n" +
                        "• Meats\n" +
                        "• Pork\n" +
                        "• Wheat germ\n" +
                        "• Yogurt"
                ss = SpannableString(text)
            }
            "Methionine" -> {
            text = "• Avocado\n" +
                    "• Dairy\n" +
                    "• Eggs\n" +
                    "• Granola\n" +
                    "• Meats\n" +
                    "• Seeds\n" +
                    "• Wheat germ"
            ss = SpannableString(text)
        }
            "N-Acetyl Cysteine" -> {
            text = "• Avocado\n" +
                    "• Cheese\n" +
                    "• Chicken\n" +
                    "• Chocolate\n" +
                    "• Cottage cheese\n" +
                    "• Duck\n" +
                    "• Egg\n" +
                    "• Granola\n" +
                    "• Oat flakes\n" +
                    "• Pork\n" +
                    "• Ricotta\n" +
                    "• Turkey\n" +
                    "• Wheat germ\n" +
                    "• Whole milk\n" +
                    "• Wild game\n" +
                    "• Yogurt"
            ss = SpannableString(text)
        }
            "Phenylalanine" -> {
            text = "• Aspartame\n" +
                    "• Cheese\n" +
                    "• Chicken\n" +
                    "• Duck\n" +
                    "• Egg\n" +
                    "• Granola\n" +
                    "• Oat flakes\n" +
                    "• Pork\n" +
                    "• Turkey\n" +
                    "• Wheat germ\n" +
                    "• Wild game"
            ss = SpannableString(text)
        }"Phosphatidylserine" -> {
            text = "• Bovine\n" +
                    "• Soy"
            ss = SpannableString(text)
        }"Proline" -> {
            text = "• Avocado\n" +
                    "• Cheese\n" +
                    "• Chicken\n" +
                    "• Chocolate\n" +
                    "• Cottage cheese\n" +
                    "• Duck\n" +
                    "• Egg\n" +
                    "• Granola\n" +
                    "• Oat flakes\n" +
                    "• Pork\n" +
                    "• Ricotta\n" +
                    "• Turkey\n" +
                    "• Wheat germ\n" +
                    "• Whole milk\n" +
                    "• Wild game"
            ss = SpannableString(text)
        }"Pycnogenol" -> {
            text = "• Pinus maritima (pine bark)\n" +
                    "• Vitis vinifera (grape seed)-contains gallic esters of proanthocyanidins, especially B2-3'-O-gallate, the most active sustance"
            ss = SpannableString(text)
        }
            "Quercetin" -> {
            text = "• Apple\n" +
                    "• Asparagus\n" +
                    "• Bearberry (Arctostaphylos uva-ursi)\n" +
                    "• Bell Peppers\n" +
                    "• Black Catechu (Acacia catechu)\n" +
                    "• Boneset (Eupatorium perfoliatum)\n" +
                    "• Brussel Sprouts\n" +
                    "• Dill\n" +
                    "• Elder flowers (Sambucus canadensis)\n" +
                    "• Eucalyptus (Eucalyptus globullus)\n" +
                    "• Euphorbia (Euphorbis piluifera)\n" +
                    "• Fenugreek (Trigonella foenum-graecum)\n" +
                    "• Hydrangea (Hydrangea arborescens)\n" +
                    "• Kale\n" +
                    "• Pale catechu (Uncaria gambir)\n" +
                    "• Passionflower (Passiflora incarnata)\n" +
                    "• Pear\n" +
                    "• Podophyllum (Podophyllum peltatum)\n" +
                    "• Onion\n" +
                    "• Squill (Urginea maritima)\n" +
                    "• Tarragon\n" +
                    "• Tea\n" +
                    "• Witch hazel (Hamamelis virginica)"
            ss = SpannableString(text)
        }
            "Taurine" -> {
            text = "• Animal sources except cow's milk\n" +
                    "• Organ meat, especially brain"
            ss = SpannableString(text)
        }"Tryptophan" -> {
            text = "• Cheese\n" +
                    "• Dairy\n" +
                    "• Eggs\n" +
                    "• Fish\n" +
                    "• Nuts\n" +
                    "• Turkey\n" +
                    "• Griffonia simplicifolia - source for 5-hydroxytryptophan"
            ss = SpannableString(text)
        }"Tyrosine" -> {
            text = "• Avocado\n" +
                    "• Cheese\n" +
                    "• Chicken\n" +
                    "• Chocolate\n" +
                    "• Cottage cheese\n" +
                    "• Duck\n" +
                    "• Egg\n" +
                    "• Granola\n" +
                    "• Oat flakes\n" +
                    "• Pork\n" +
                    "• Ricotta\n" +
                    "• Turkey\n" +
                    "• Wheat germ\n" +
                    "• Whole milk\n" +
                    "• Wild game\n" +
                    "• Yogurt"
            ss = SpannableString(text)
        }
        }
        binding.contentData.text = ss
        binding.subHeading.text = "Plants/Foods"
    }//

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
                "Alanine" -> {
                    description_text = "The nonessential amino acid, alanine comes from the breakdown of DNA or the dipeptides, anserine and carnosine, and the conversion of pyruvate, a compound in carbohydrate metabolism."
                    description_ss = SpannableString(description_text)
                }
                "Amino Acids" -> {
                    description_text = "All organisms from the largest to the smallest are composed of proteins. Amino acids are molecules that are the 'building blocks' of protein. In the human body, muscles, tendons, ligaments, glands, organs, nails, hair, body fluids, hormones, enzymes, neurotransmitters and genes all require protein. Amino acids link together in the human body to form over 50,000 different proteins and 20,000 known enzymes. Amino acid molecules contain a combination of carbon, hydrogen, oxygen, nitrogen and in some cases sulfur. Approximately 28 known amino acids comprise the proteins in all living things. Nine amino acids are considered 'essential,' meaning the body cannot produce them so they must be taken in by diet or supplement. The breakdown of amino acids results in an increased nitrogen load in the body. The kidneys and to some extent the liver must eliminate this nitrogen. For this reason, persons with liver or kidney diseases should avoid supplementing any amino acids without their doctors' approval. Amino acid supplements should not be used long term by anyone.\n" +
                            "\n" +
                            "The 9 essential amino acids are:\n" +
                            "\n" +
                            "Lysine\n" +
                            "Methionine\n" +
                            "Tryptophan\n" +
                            "Phenylalanine\n" +
                            "Histidine\n" +
                            "Isoleucine\n" +
                            "Valine\n" +
                            "Threonine\n" +
                            "Leucine\n" +
                            "Amino acids synthesized by the body are:\n" +
                            "\n" +
                            "Alanine\n" +
                            "Arginine\n" +
                            "Carnitine\n" +
                            "Cysteine\n" +
                            "Glutamic acid\n" +
                            "Glutamine\n" +
                            "Glutathione\n" +
                            "Glycine\n" +
                            "Taurine\n" +
                            "Tyrosine\n" +
                            "Asparginine\n" +
                            "Aspartic acid\n" +
                            "Citrulline\n" +
                            "Cystine\n" +
                            "Gamma-aminobutyric acid (GABA)\n" +
                            "Hydroxyproline\n" +
                            "Ornithine\n" +
                            "Proline\n" +
                            "Serine"
                    description_ss = SpannableString(description_text)
                    createLink(description_ss,"Lysine",description_text,"Supplement","Lysine")
                    createLink(description_ss,"Methionine",description_text,"Supplement","Methionine")
                    createLink(description_ss,"Tryptophan",description_text,"Supplement","Tryptophan")
                    createLink(description_ss,"Phenylalanine",description_text,"Supplement","Phenylalanine")

                    createLink(description_ss,"Alanine",description_text,"Supplement","Alanine")
                    createLink(description_ss,"Arginine",description_text,"Supplement","Arginine")
                    createLink(description_ss,"Carnitine",description_text,"Supplement","Carnitine")
                    createLink(description_ss,"Cysteine",description_text,"Supplement","Cysteine")
                    createLink(description_ss,"Glutamic acid",description_text,"Supplement","Glutamic acid")
                    createLink(description_ss,"Glutamine",description_text,"Supplement","Glutamine")
                    createLink(description_ss,"Glutathione",description_text,"Supplement","Glutathione")
                    createLink(description_ss,"Glycine",description_text,"Supplement","Glycine")
                    createLink(description_ss,"Taurine",description_text,"Supplement","Taurine")
                    createLink(description_ss,"Tyrosine",description_text,"Supplement","Tyrosine")
                }
                "Arginine" -> {
                    description_text = "The nonessential amino acid, arginine, is a urea cycle amino acid and a precursor for the neurotransmitter, nitric oxide, which plays a role in the regulation of the brain's system of dilation and constriction of small blood vessels."
                    description_ss = SpannableString(description_text)
                }
                "Bioflavonoids" -> {
                    description_text = "The deep red, yellow, blue, and green colors of many flowers and plants are due to their bioflavonoid content. Bioflavonoids include proanthocyanidins, anthocyanidins, pycnogenol, quercetin, rutin, hesperidin, citrus bioflavonoids and green tea polyphenols and are sometimes referred to as vitamin P."
                    description_ss = SpannableString(description_text)
                }
                "Bromelain" -> {
                    description_text = "Bromelains are sulfhydryl proteolytic enzymes of the Ananas comosus, the pineapple plant. Commercial bromelain, usually from the stem of the fruit, contains a basic glycoprotein with one oligosaccharride moiety and one reactive sulfhydryl group per molecule. Its isoelectric point is pH 9.55, exhibiting activity between 3 - 10, with optimal activity between 5 - 8."
                    description_ss = SpannableString(description_text)
                }
                "Carnitine" -> {
                    description_text = "Carnitine, a nonessential amino acid made by the body from lysine, is an amine and also an alcohol, trimethylated carboxy-alcohol. It is more concentrated in the heart than any other organ"
                    description_ss = SpannableString(description_text)
                }
                "Carnosine" -> {
                    description_text="Carnosine is a combination of the two amino acids, alanine and histidine. It is naturally present in tissues, primarily muscle and brain, but its concentration falls with advancing age."
                    description_ss = SpannableString(description_text)
                }
                "Coenzyme Q10" -> {
                    description_text = "Coenzyme Q10 is a cofactor for cellular respiration (electron transport chain) and is essential for the health of all organs and tissues. All energy-dependent processes of the body require Co Q10."
                    description_ss = SpannableString(description_text)
                }
                "Cystine" -> {
                    description_text = "Cystine is formed by 2 cysteine molecules that have lost their hydrogens. The molecules are connected by a disulfide bond. Some authorities do not consider cystine an amino acid because it is a product of an oxidation between the thiol side chains of two cysteine amino acids."
                    description_ss = SpannableString(description_text)
                }
                "Dehydroepiandrosterone (DHEA)" -> {
                    description_text = "Dehydroepiandrosterone (DHEA) is a steroid hormone secreted mainly by the adrenal glands and to a lesser extent by the testes and ovaries."
                    description_ss = SpannableString(description_text)
                }
                "Digestive Enzymes" -> {
                    description_text = "• Salivary amylase (also known as ptyalin)\n" +
                            "Digests starches"
                    description_ss = SpannableString(description_text)
                }
                "Dimethyl Glycine (DMG)" -> {
                    description_text = "Dimethyl Glycine, formerly called vitamin B15 or pangamic acid, is a derivative of the amino acid glycine. It is produced in the mitochondria of cells from choline and betaine and is constantly being broken down as it is used. It is also found in low levels in many foods."
                    description_ss = SpannableString(description_text)
                }
                "Ethylenediaminetetraacetic acid (EDTA)" -> {
                    description_text = "Ethylenediaminetetraacetic acid (EDTA) is a compund used primarily as chelating agent. It has a particular affinity to attach ions that have a +2 charge, such as Lead (Pb++), Zinc (Zn++), Copper (Cu++), etc. It is used therapeutically to bind with heavy metals and other substances to allow such to be subsequently excreted by the body.\n" +
                            "\n" +
                            "It can be used, in order of decreasing effectiveness, intravenously, via suppository and orally."
                    description_ss = SpannableString(description_text)
                }
                "Fructooligosaccharides (FOS)" -> {
                    description_text = "Fructooliogosaccharides (FOS), short-chain polysaccharides, are soluble fiber from edible plants. Certain lactic acid producing probiotic microflora, Lactobacilli and Bifidobacteria, utilize FOS as food."
                    description_ss = SpannableString(description_text)
                }
                "Fumaric Acid" -> {
                    description_text = "Fumaric acid, also known as trans-butanedioic acid, is an unsaturated dicarbonic acid, the trans iosmer of malic acid and is an intermediate in the citric acid cycle (Krebs cycle), the center for energy production in each cell. It is the by-product of the cycle and therefore present in every cell. When sun is exposed to healthy individuals' skin, the ultra violet rays form fumaric acid. In individuals with psoriasis, fumaric acid is not formed as quickly as in healthy individuals and must require longer exposure to sunlight. A lack of fumaric acid leads to the accumulation of half-products, thought to be the cause of psoriatic lesions. Psoriasis is possibly a fumaric acid metabolism defect."
                    description_ss = SpannableString(description_text)
                }
                "Glandulars"->{
                    description_text = "A glandular is a piece of gland tissue or organ taken from beef (bovine glandular) or pork (porcine glandular) that supplies biologically active hormones, hormone precursors, enzymes, vitamins, minerals, soluble proteins, and natural lipid factors. Scientific research has demonstrated that glandulars have tissue specific activity and exert significant biological effects in humans; thus bovine liver tissue has a biological effect on human liver, porcine pancreas tissue has a biological effect on human pancreas, and so forth. Glandulars offer a diversity of hormones and hormone related substances in a natural, non-toxic quantity for therapeutic, rejuvenative and preventive health care."
                    description_ss = SpannableString(description_text)
                }
                "Glucosamine Sulfate" -> {
                    description_text = "Biochemically, D-glucosamine leads to N-acetyl-D-glucosamine (NAG) which leads to Glycosaminoglycans (GAG) which leads to Proteoglycans (PG) of articular surfaces, synovial fluid, cartilage, ligaments, bones, tendons, sclera, nails, skin, blood vessels and heart valves and mucous secretions of the digestive, urinary and respiratory tracts. Glucosamine is an aminomonosaccharide produced by combination of glucose with glutamine by the enzyme, glucosamine synthetase. It is also the primary substrate for the biosynthesis of hyaluronic acid and chondroitin sulfate. Glucosamine's action is enhanced by the presence of sulfate, an essential component of proteoglycans. Glucosamine sulfate (GS) is thus a component of glycopoteins and glycosaminoglycans."
                    description_ss = SpannableString(description_text)

                }
                "Glutamic Acid" -> {
                    description_text ="Glutamic acid is a nonessential amino acid that is converted into glutamine or gamma-aminobutyric acid (GABA). Glutamic acid, the 2nd most abundant amino acid in the brain, is found in the hippocampus, the cranial nerves and other areas. It can be formed from aspartic acid, arginine, ornithine, proline or alpha-ketoglutarate."
                    description_ss = SpannableString(description_text)
                }
                "Glutamine" -> {
                    description_text = "Glutamine is a nonessential amino acid that is formed from glutamic acid and ammonia. Glutamine easily passes through the blood brain barrier and readily converts to glutamic acid. It is the most abundant amino acid found in blood."
                    description_ss = SpannableString(description_text)
                }"Glutathione" -> {
                    description_text = "The tripeptide glutathione (GSH) is a nonessential amino acid made up of glycine, glutamic acid and cysteine molecules. The 'G' in GSH is glutathione and the 'SH' refers to the thiol (sulfur) grouping."
                    description_ss = SpannableString(description_text)
                }"Glycine" -> {
                    description_text = "Glycine is a nonessential amino acid which is extremely abundant in the body. It is the simplest amino acid and called glycine because its sweet taste resembles that of glucose and glycogen."
                    description_ss = SpannableString(description_text)
                }
                "Hydrochloric Acid" -> {
                    description_text = "Hydrochloric acid is secreted from parietal cells located in the lining of the stomach. By creating an acidic environment in the stomach (pH - 1.8 - 3.5), pepsinogen is converted into the enzyme pepsin. Pepsin is an active proteolytic enzyme, breaking down proteins. The parietal cells also secrete intrinsic factor, which is essential for the absorption of vitamin B12."
                    description_ss = SpannableString(description_text)
                    createLink(description_ss,"vitamin B12",description_text,"Vitamin","Vitamin B12 (Cobalamin)")
                }
                "Lipoic Acid" -> {
                    description_text = "Lipoic acid, a vitamin-like substance that contains sulfur, is important to the body in the production of energy (ATP). It also effective against water- and fat-soluble free radical damage."
                    description_ss = SpannableString(description_text)
                }
                "Lysine" -> {
                    description_text = "Lysine is an essential amino acid, highly concentrated in muscles and is degraded to acetyl CoA, citrulline and homoarginine. Lysine is also a precursor of carnitine and citrulline."
                    description_ss = SpannableString(description_text)
                }
                "Melatonin" -> {
                    description_text = "Melatonin, N-acetyl-5 methoxytryptamine, is a principal neurotransmitter and neurohormone, acting both as an amino acid and a hormone. The essential amino acid, tryptophan, is converted to serotonin in the brain. Serotonin, through the actions of enzymes, N-acetyl-transferase and hydroxy-indol-o-methyl transferase, is converted to melatonin in the pineal gland. Melatonin secretion is regulated by darkness and suppressed by light."
                    description_ss = SpannableString(description_text)
                }"Methionine" -> {
                    description_text = "Methionine is an essential amino acid that contains sulfur. If an adequate amount of vitamin B6 is not present, methionine converts into homocysteine, the toxic molecule linked to several diseases including cardiovascular diseases."
                    description_ss = SpannableString(description_text)
                }"Methylsufonylmethane (MSM)" -> {
                    description_text = "MSM is a sulfur compound found in many fresh fruits and vegetables, grains, milk and some kinds of fish. It is also a metabolite of DMSO (Dimethylsulfoxide)."
                    description_ss = SpannableString(description_text)
                }"N-Acetyl Cysteine" -> {
                    description_text = "N-acetyl cysteine (NAC) is a low molecular weight nucleophilic thiol which forms glutathione, cystine, l-methionine and mixed disulfides. Oral administration of NAC elevates levels of reduced glutathione in the liver, in the bronchial and alveolar fluid and in plasma. Cystine is the stable form of cysteine and the body uses them interchangeably and is therefore thought of as the same molecule."
                    description_ss = SpannableString(description_text)
                    createLink(description_ss,"glutathione,",description_text,"Supplement","Glutathione")
                    createLink(description_ss,"l-methionine ",description_text,"Supplement","Methionine")
                    createLink(description_ss,"glutathione ",description_text,"Supplement","Glutathione")
                }"NADH" -> {
                    description_text = "Nicotinamide adenine dinucleotide (NADH) is the biochemical active form of vitamin B3. It is found in every human cell and is essential in energy production. NADH is found exogenously in muscle tissue of fish, cattle, poultry and products containing yeast."
                    description_ss = SpannableString(description_text)
                }"Phenylalanine" -> {
                    description_text = "Phenylalanine is an essential amino acid and is a precursor for another amino acid, tyrosine, making it therefore a precursor for the catecholamines, tyramine, dopamine, epinephrine and norepinephrine. Phenylalanine is also a constituent of mescaline, codeine, morphine and papaverine, all psychotropic drugs. Biopterin, niacin, copper, vitamin C, vitamin B6 and iron are required for normal metabolism of phenylalanine."
                    description_ss = SpannableString(description_text)
                }"Phosphatidylserine" -> {
                    description_text = "• Phosphatidylserine belongs to the fat soluble substances called phospholipids, where a serine molecule is attached to the phosphate group by an ester linkage to phosphatidic acid. It is found in all cells but is most concentrated in brain cells."
                    description_ss = SpannableString(description_text)
                }"Proline" -> {
                    description_text = "The nonessential amino acid, proline, is synthesized from L-ornithine or L-glutamate. The proline from L-ornithine is linked to protein metabolism in the urea cycle and the proline from L-glutamate is linked to carbohydrate metabolism. Collagen is the major reservoir for proline in the body. Vitamin C should be used with proline for collagen problems."
                    description_ss = SpannableString(description_text)
                }"Pycnogenol" -> {
                    description_text = "Pycnogenols are flavan-3-ol derivatives, which distinguishes them from flavonoid compounds."
                    description_ss = SpannableString(description_text)
                }"Red Yeast Rice" -> {
                    description_text = "Red yeast rice is an Asian dietary staple made by fermenting red yeast (Monascus purpureus) on rice. It has been used in China for about 1200 years as a food preservative, natural colorant in the production of red rice wine and red bean curd and for medicinal purposes.\n" +
                            "\n" +
                            "Red yeast rice products vary greatly in their content of the presumed primary active agents, the monacolins, a group of fungal metabolites. Monacolin K, one of the ten different monacolins identified, is chemically identical to the drug lovastatin, the first of a class called “statins.”"
                    description_ss = SpannableString(description_text)
                }"Quercetin" -> {
                    description_text = "Glycosides are compounds that yield one or more sugars among the products of hydrolysis. Glycosides may be considered sugar ethers. The non sugar component is known as the aglycone, and the sugar component is called glycone. The flavonoid glycosides and their aglycones are generally termed flavonoids. Rutin, quercitrin, and the citrus bioflavonoids, including hesperidin, hesperetin, diosmin, and naringen, are among the best known flavonoid constituents. Quercetin is the aglycone of quercitrin, rutin and other flavonoids."
                    description_ss = SpannableString(description_text)
                }"S-Adenosyl-L-Methionine (SAM)" -> {
                    description_text = "SAM is formed in the body by combining the amino acid methionine with adenosyl-triphosphate (ATP)."
                    description_ss = SpannableString(description_text)
                }"Taurine" -> {
                    description_text = "Taurine is a thiol (containing sulfur) nonessential amino acid and synthesized primarily in the liver from methionine and cysteine with the assistance of vitamin B6."
                    description_ss = SpannableString(description_text)
                }"Tryptophan" -> {
                    description_text = "Tryptophan is an essential aromatic amino acid that is metabolized into niacin, serotonin and melatonin. It is converted to 5-hydroxytryptophan (5-HTP) in these metabolic processes. 5-Hydroxytryptophan can also be manufactured from the seed of Griffonia simplicifolia, an African plant. Most research concludes that approximately 1-3% of oral tryptophan is converted to serotonin compared to 70% of 5-HTP and it is generally accepted that about 1% or less of dietary/supplementary tryptophan ever enters the brain. As an antidepressant, some studies have shown better results using 200 - 300 mg 5-HTP per day as opposed to using 2000 - 3000 mg or more of tryptophan during the same period.\n" +
                            "\n" +
                            "The information on this page is for the amino acid, tryptophan. In the treatment of diseases/health conditions, 5-hydroxytryptophan is used instead of tryptophan."
                    description_ss = SpannableString(description_text)
                }"Tyrosine" -> {
                    description_text = "Tyrosine is a nonessential amino acid derived from phenylalanine."
                    description_ss = SpannableString(description_text)
                }
        }
        binding.contentData.text = description_ss
        binding.subHeading.text = "Description"
    }//

    private fun showNecessarySections(heading: String) {
        if(heading == "Coenzyme Q10" || heading == "Acidophilus/Bifidus"){
            binding.description.visibility = View.VISIBLE//
            if(heading!="Coenzyme Q10")
                binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE//
            binding.dosage.visibility = View.VISIBLE//
            binding.drugNutrition.visibility = View.VISIBLE//
            binding.adverseReaction.visibility = View.VISIBLE//
        }else if(heading=="Alanine"||heading == "Glutamic Acid"||heading == "Glutamine"||
            heading =="Glutathione"||heading == "Glycine"||heading == "Lysine"||
            heading=="Methionine"||heading=="N-Acetyl Cysteine"){
            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            if(heading!="Glutathione")
            binding.signSymptom.visibility = View.VISIBLE
            binding.deficiencyCause.visibility = View.VISIBLE
            binding.contraindiction.visibility = View.VISIBLE
            binding.toxicity.visibility = View.VISIBLE
        }else if(heading=="Amino Acids"||heading=="Dehydroepiandrosterone (DHEA)"||
            heading == "Dimethyl Glycine (DMG)" || heading=="Ethylenediaminetetraacetic acid (EDTA)"
            || heading == "Fructooliogosaccharides (FOS)" || heading=="Fumaric Acid"
            || heading == "Hydrochloric Acid"||heading == "Lipoic Acid"||heading == "Melatonin"
            ||heading=="NADH"||heading=="Red Yeast Rice"||heading=="Quercetin"){
            binding.description.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE//physiologic therapeutic
            binding.functionText.text = "Physiologic Therapeutics"
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
            if(heading=="Pycnogenol"||heading=="Quercetin"){
                binding.plantFood.visibility = View.VISIBLE
            }
        }
        else if(heading=="Arginine"||heading == "Carnitine"||heading=="Carnosine"||
            heading =="Cystine"||heading=="Phenylalanine"||heading=="Proline"
            ||heading=="Taurine"||heading=="Tryptophan"||heading=="Tyrosine"){
            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            binding.signSymptom.visibility = View.VISIBLE
            binding.deficiencyCause.visibility = View.VISIBLE
            binding.contraindiction.visibility = View.VISIBLE
            binding.toxicity.visibility = View.VISIBLE
            if(heading=="Bioflavonoids")
                binding.drugNutrition.visibility = View.VISIBLE

        }else if(heading=="Bromelain"||heading=="Phosphatidylserine"){

            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            binding.drugNutrition.visibility = View.VISIBLE
            binding.dosage.visibility = View.VISIBLE
            binding.adverseReaction.visibility = View.VISIBLE
            if(heading=="Phosphatidylserine"){
                binding.plantFoodText.text = "Sources:"
                binding.functionText.text = "Physiologic Therapeutics:"
            }
        }else if(heading=="Digestive Enzymes"){

            binding.description.visibility = View.VISIBLE
            binding.descriptionText.text = "Mouth"
            binding.plantFood.visibility = View.VISIBLE
            binding.plantFoodText.text = "Stomach"
            binding.function.visibility = View.VISIBLE
            binding.functionText.text = "Pancreas"
        }else if(heading=="Glandulars"){

            binding.description.visibility = View.VISIBLE
            binding.plantFood.visibility = View.VISIBLE
            binding.plantFoodText.text = "Types of Glandulars:"
            binding.function.visibility = View.VISIBLE
            binding.functionText.text = "Types of Tissue Extracts:"
        }else if(heading=="Glucosamine Sulfate"||heading=="Methylsufonylmethane (MSM)"){
            binding.description.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            binding.contraindiction.visibility = View.VISIBLE
            binding.toxicity.visibility = View.VISIBLE
        }else if(heading=="S-Adenosyl-L-Methionine (SAM)"){

            binding.description.visibility = View.VISIBLE
            binding.function.visibility = View.VISIBLE
            binding.indication.visibility = View.VISIBLE
            binding.contraindiction.visibility = View.VISIBLE
            binding.toxicity.visibility = View.VISIBLE
            binding.drugNutrition.visibility = View.VISIBLE

            binding.dosage.visibility = View.VISIBLE
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
    }//

    private fun createLink(ss: SpannableString, sub_str: String, string: String, activity: String, heading: String) {
        val clickableSpan = object : ClickableSpan(){
            override fun onClick(widget: View) {
                val intent : Intent
                if(activity=="Condition"){
                    intent = Intent(this@SupplementDetailActivity,ConditionDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }else if(activity=="Supplement"){
                    intent = Intent(this@SupplementDetailActivity,SupplementDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }else if(activity=="Fiber"){
                    intent = Intent(this@SupplementDetailActivity,FiberDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }else if(activity=="Vitamin"){
                    intent = Intent(this@SupplementDetailActivity,VitaminMineralDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }else if(activity=="Botanical"){
                    intent = Intent(this@SupplementDetailActivity,BotanicalDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }
            }
        }
        if(string.indexOf(sub_str)!=-1)
            ss.setSpan(clickableSpan,string.indexOf(sub_str),string.indexOf(sub_str)+sub_str.length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    }

}