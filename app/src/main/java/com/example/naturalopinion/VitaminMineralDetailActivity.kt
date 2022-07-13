package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Spanned
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityVitaminMineralDetailBinding

class VitaminMineralDetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityVitaminMineralDetailBinding
    var heading : String = ""
    var requirement_data : String = ""
    var supplement_data : String = ""
    var food_source_data : String = ""
    var deficiency_data : String = ""
    var cause_deficency_data : String = ""
    var adverse_effect_data : String = ""
    var drug_nutrient_data : String = ""
    var bio_chemical_data : String = ""
    var clinical_indication_data : String = ""
    var lab_data : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVitaminMineralDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        heading = intent.getStringExtra("heading").toString()

        setRequirement(heading)
        binding.contentData.text = setTextHTML(requirement_data)



        binding.vitaminMineralName.text = heading

        binding.backButton6.setOnClickListener { finish() }
        binding.first.setOnClickListener {
            setRequirement(heading)
            binding.contentData.text = setTextHTML(requirement_data)

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
            binding.contentData.text = setTextHTML(supplement_data)

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
            binding.contentData.text = setTextHTML(lab_data)

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
            binding.contentData.text = setTextHTML(food_source_data)

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
            binding.contentData.text = setTextHTML(deficiency_data)

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
            binding.contentData.text = setTextHTML(cause_deficency_data)

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
            binding.contentData.text = setTextHTML(adverse_effect_data)

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
            binding.contentData.text = setTextHTML(drug_nutrient_data)

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

        }
        binding.nine.setOnClickListener {
            setBioChemical(heading)
            binding.contentData.text = setTextHTML(bio_chemical_data)

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

        }
        binding.ten.setOnClickListener {
            setClinicalIndication(heading)
            binding.contentData.text = setTextHTML(clinical_indication_data)

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

        }

        binding.reference.setOnClickListener { startActivity(
            Intent(this,
                ReferenceActivity::class.java)
        ) }

    }

    private fun setClinicalIndication(heading: String) {
        binding.subHeading.text = "Clinical Indications"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            clinical_indication_data = "• Asthma<br/>" +
                    "• Atherosclerosis prevention<br/>" +
                    "• Attention deficit disorder<br/>" +
                    "• BPH<br/>" +
                    "• Bronchitis<br/>" +
                    "• Chronic fatigue syndrome<br/>" +
                    "• Depression<br/>" +
                    "• Diabetes<br/>" +
                    "• Dysmenorrhea<br/>" +
                    "• Endometriosis<br/>" +
                    "• Fibrocystic breast disease<br/>" +
                    "• Fibromyalgia<br/>" +
                    "• Hypothyroidism<br/>" +
                    "• Memory loss<br/>" +
                    "• Menopause<br/>" +
                    "• Multiple sclerosis<br/>" +
                    "• Osteoarthritis<br/>" +
                    "• Osteoporosis prevention<br/>" +
                    "• PMS<br/>" +
                    "• Psoriasis<br/>" +
                    "• Rosacea<br/>" +
                    "• Acne<br/>" +
                    "• Anemia (inherited sideroblastic anemia)<br/>" +
                    "• Autism<br/>" +
                    "• Nausea of pregnancy<br/>" +
                    "• Prevention of intrauterine growth retardation<br/>" +
                    "• Prevention of cleft palate or other birth defects<br/>" +
                    "• Calcium oxalate kidney stones<br/>" +
                    "• Carpal tunnel syndrome<br/>" +
                    "• Dementia<br/>" +
                    "• Depression associated with oral contraceptives<br/>" +
                    "• Diabetic neuropathy<br/>" +
                    "• Hyperkinetic behavior<br/>" +
                    "• Infant seizures<br/>" +
                    "• MSG sensitivity<br/>" +
                    "• Prevention of polymorphous light eruptions<br/>" +
                    "• Rheumatism<br/>" +
                    "• Schizophrenia<br/>" +
                    "• Seborrheic dermatitis<br/>" +
                    "• Sickle cell anemia<br/>" +
                    "• Tardive dyskinesia<br/>" +
                    "• Toxemia of pregnancy"
        }

    }

    private fun setBioChemical(heading: String) {
        binding.subHeading.text = "Biochemical Functions"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            bio_chemical_data = "• Deamination - removal of amino groups from certain amino acids for energy<br/>" +
                    "• Decarboxylation - removal of COOH groups from certain amino acids to form another compound<br/>" +
                    "• Desulfuration - transfer sulfhydryl group (HS) from one amino acid methionine to another, serine, to form cysteine<br/>" +
                    "• Promotes release of glycogen from liver and muscle as glucose-1-phosphate<br/>" +
                    "• Required for formation of alpha aminolevulinic acid (precursor of heme in hemoglobin)<br/>" +
                    "• Required for formation of sphygolipids involved in development of myelin sheath<br/>" +
                    "• Required for series 1 prostaglandins (PGE 1) formation from linoleic acid<br/>" +
                    "• Required for synthesis of intrinsic factor<br/>" +
                    "• Required for synthesis of neurotransmitters serotonin, norepinephrine, histamine<br/>" +
                    "• Transamination - transfer of NH2 to other amino acids"

        }

    }

    private fun setDrug(heading: String) {
        binding.subHeading.text = "Drug/Nutrient Interaction"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            drug_nutrient_data = "• L-Dopa - B6 converts L-Dopa into dopamine outside the blood brain barrier<br/>" +
                    "• Large doses may increase the need for magnesium, zinc, essential fatty acids, and other B vitamins<br/>" +
                    "• May prevent depression secondary to exogenous estrogens<br/>" +
                    "• Sinemet (L-Dopa and Carbidopa) - synergistic effect"

        }
    }

    private fun setAdverseEffect(heading: String) {
        binding.subHeading.text = "Adverse Effects and Toxicity"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            adverse_effect_data = "• 2 - 5 gm. over a few months may result in numbness and tingling in the extremities - symptoms usually disappear after B6 is discontinued<br/>" +
                    "• Doses larger than 50 mg. per day may suppress lactation<br/>" +
                    "• Doses of 500 mg. per day or more for extended periods of time have been reported to cause sensory neuropathy in a stocking-glove distribution<br/>" +
                    "• Lower doses may cause insomnia or anxiety which may be prevented by co-administration of magnesium"

        }
    }

    private fun setCauseDeficency(heading: String) {
        binding.subHeading.text = "Causes of Deficiency"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            cause_deficency_data = "• Aging<br/>" +
                    "• Alcohol<br/>" +
                    "• Antioxidants in the petroleum industry<br/>" +
                    "• Birth control pills<br/>" +
                    "• Celiac disease<br/>" +
                    "• Crohn's disease<br/>" +
                    "• Hydrazine compounds<br/>" +
                    "• Hypoacidity (acid is necessary for vitamin B6 absorption)<br/>" +
                    "• L-canavanine compound - found in alfalfa<br/>" +
                    "• Maleica hydrazide - a plant growth regulator and herbicide<br/>" +
                    "• Monoamine oxidase inhibitors, isoniazid, theophyline and other anti asthma medications<br/>" +
                    "• PCB's (polychlorinated biphenols) - have been found in 99% of all Americans tested<br/>" +
                    "• Penicillamine<br/>" +
                    "• Peroxides and free radicals<br/>" +
                    "• Plating materials and antitarnish agents used in metal manufacturing<br/>" +
                    "• Pregnancy<br/>" +
                    "• Tartrazine (yellow dye #5)<br/>" +
                    "• Tobacco smoke"

        }
    }

    private fun setDeficiency(heading: String) {
        binding.subHeading.text = "Signs and Symptoms of Deficiency"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            deficiency_data = "• Abnormal head movements<br/>" +
                    "• Ataxia<br/>" +
                    "• Convulsions<br/>" +
                    "• Depression<br/>" +
                    "• Hyperacusis<br/>" +
                    "• Hyperirritability<br/>" +
                    "• Mucous membrane lesions<br/>" +
                    "• Nausea<br/>" +
                    "• Peripheral neuritis<br/>" +
                    "• Seborrheic dermatitis<br/>" +
                    "• Vomiting"

        }
    }

    private fun setFoodSource(heading: String) {
        binding.subHeading.text = "Food Sources"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            food_source_data = "• 100% bran cereal 1 cup (2.1 mg.)<br/>" +
                    "• 40% bran flakes cereal 1 cup (0.80 mg.)<br/>" +
                    "• Avocado 1 med. (0.56 mg.)<br/>" +
                    "• Banana 1 med. (0.66 mg.)<br/>" +
                    "• Beef liver 3 oz. (0.47 mg.)<br/>" +
                    "• Chicken, light meat without skin 3 oz. (0.51 mg.)<br/>" +
                    "• Pork loin chop broiled 3 oz. (0.78 mg.)<br/>" +
                    "• Salmon, raw 3 oz. (0.63 mg.)<br/>" +
                    "• Sunflower seeds 1/4 cup (0.45 mg.)<br/>" +
                    "• Tomato juice 1 cup (0.47 mg.)<br/>" +
                    "• Trout - rainbow or steelhead, raw 3 oz. (0.45 mg.)<br/>" +
                    "• Turkey, light meat without skin 3 oz. (0.48 mg.)<br/>" +
                    "• Watermelon 1 slice (0.69 mg.)"

        }
    }

    private fun setLabs(heading: String) {
        binding.subHeading.text = "Labs"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            lab_data = "• Erythrocyte Glutamate Oxaloacetic Transaminase Test (EGOT Test)<br/>" +
                    "• Tryptophan Load Test"

        }
    }

    private fun setSuppliment(heading: String) {
        binding.subHeading.text = "Supplement Forms"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            supplement_data = "• Pyridoxine 5 phosphate (the active form of vitamin B6) - better absorbed<br/>" +
                    "• Pyridoxine hydrochloride - most commonly available"

        }
    }

    private fun setRequirement(heading: String) {
        binding.subHeading.text = "Requirements"
        if(heading == "Vitamin B6 (Pyridoxine)"){
            requirement_data = "• RDA:<br/>" +
                    "• 2 mg. - 2.2 mg.<br/>" +
                    "• Pregnancy/Lactation: 2.6 mg. / 2.7 mg.<br/>" +
                    "• Daily Optimal Intake:<br/>" +
                    "• 50 mg. for females<br/>" +
                    "• 35 mg. for males"

        }
    }
    private fun setTextHTML(html: String): Spanned
    {
        val result: Spanned = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(html)
        }
        return result
    }
}