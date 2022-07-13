package com.example.naturalopinion

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import androidx.core.view.ContentInfoCompat
import com.example.naturalopinion.databinding.ActivityConditionDetailBinding
import org.w3c.dom.Text

class ConditionDetailActivity : AppCompatActivity() {
    lateinit var back_button : ImageView
    lateinit var condition_name : TextView
    lateinit var binding : ActivityConditionDetailBinding
    var heading : String = ""
    var diet_detail : String = ""
    var vitamin_detail : String = ""
    var supplements_detail : String = ""
    var botanical_detail : String = ""
    var homeopathic_detail : String = ""
    var other_therapy : String = ""
    var recommended_labs : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConditionDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contentData.movementMethod = LinkMovementMethod.getInstance()


        heading = intent.getStringExtra("condition_name").toString()

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)


        back_button = findViewById(R.id.back_button_6)
        condition_name = findViewById(R.id.condition_name)

        condition_name.text = heading

        back_button.setOnClickListener { finish() }


        binding.first.setOnClickListener {
            setDietData(heading)

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
        }
        binding.second.setOnClickListener {
            setVitaminData(heading)
            binding.contentData.text = setTextHTML(vitamin_detail)

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
        }
        binding.third.setOnClickListener {
            setSupplementData(heading)
            binding.contentData.text = setTextHTML(supplements_detail)

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
        }
        binding.forth.setOnClickListener {
            setBotanicalData(heading)
            binding.contentData.text = setTextHTML(botanical_detail)

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
        }
        binding.fifth.setOnClickListener {
            setHomepathicData(heading)
            binding.contentData.text = setTextHTML(homeopathic_detail)

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
        }
        binding.sixth.setOnClickListener {
            setTherapyData(heading)
            binding.contentData.text = setTextHTML(other_therapy)

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

        }
        binding.seventh.setOnClickListener {
            setRecommendedLabData(heading)
            binding.contentData.text = setTextHTML(recommended_labs)

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

        }

        binding.reference.setOnClickListener { startActivity(Intent(this,ReferenceActivity::class.java)) }

    }

    private fun setDietData(conditionName: String?) {
        binding.diet.text = "Diet and Nutrition"
        if(conditionName == "Atherosclerosis"){
            diet_detail = "• Eat foods high in fiber  (significantly lowers cholesterol)<br/>" +
                    "• Reduce fat consumption, especially saturated fats (animal products) and oxidized fats like those found in fast food places (french fries and other fried foods)<br/>" +
                    "• Eat lots of garlic and onions<br/>" +
                    "Eat complex carbohydrates, e.g., vegetables, beans, and brown rice and avoid sucrose and all simple sugars (more important than fat reduction)<br/>" +
                    "• Consume more soy protein and less meat<br/>" +
                    "• Eat a diet high in cold water fish<br/>" +
                    "• Avoid hydrogenated oils and trans-fatty acids<br/>" +
                    "• Reduce, but don\'t eliminate alcohol from the diet, e.g., 1 glass of wine per evening<br/>" +
                    "• Drink more tea and cocoa<br/>" +
                    "• Avoid milk and other dairy products"
            val ss : SpannableString = SpannableString(diet_detail)
            val clickableSpan = object : ClickableSpan(){
                override fun onClick(widget: View) {
                    Toast.makeText(this@ConditionDetailActivity,"Fiber",Toast.LENGTH_LONG).show()
                }

            }
            ss.setSpan(clickableSpan,20,24,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

            binding.contentData.text = ss
        }
    }
    private fun setVitaminData(conditionName: String?) {
        binding.diet.text = "Vitamins and Minerals"
        if(conditionName == "Atherosclerosis"){
            vitamin_detail = "• Beta-Carotene: 100,000 I.U.<br/>" +
                    "• Vitamin B3 (Niacin): 30 - 1500 mg. TID in divided doses (increase slowly from 200 mg.) Do not use the time released form of niacin for atherosclerosis<br/>" +
                    "• Vitamin B5: 600 - 1200 mg.<br/>" +
                    "• Vitamin B6: 50 mg.<br/>" +
                    "• Folate: 5 - 10 mg.<br/>" +
                    "• Vitamin C: 500 mg. TID<br/>" +
                    "• Vitamin E: 800 - 1600 I.U.<br/>" +
                    "• Lecithin: 2 Tbl. or 12 - 20 capsules<br/>" +
                    "• Selenium: 200 - 300 mcg.<br/>" +
                    "• Manganese: 5 - 20 mg.<br/>" +
                    "• Zinc: 30 mg. TID<br/>" +
                    "• Copper: 2 - 4 mg.<br/>" +
                    "• Magnesium (Aspartate form): 500 - 800 mg.<br/>" +
                    "• Molybdenum, Vanadium, Silicon, and other trace minerals<br/>" +
                    "• Chromium Aspartate: 200 - 500 mcg. (can use brewers yeast)"
        }
    }
    private fun setSupplementData(conditionName: String) {
        binding.diet.text = "Supplements"
        if(conditionName == "Atherosclerosis"){
            supplements_detail = "• Coenzyme Q10: 40 - 120 mg. in divided doses<br/>" +
                    "• Bromelain: 500 mg. BID (on an empty stomach)<br/>" +
                    "• L-Carnitine: 3 gm.<br/>" +
                    "• L-Arginine: 2 - 4 gm. BID<br/>" +
                    "• Omega-3 Fatty Acids: 2 - 5 gm. TID<br/>" +
                    "• Omega-6 Fatty Acids: 1 gm. TID<br/>" +
                    "• Glucosamine Sulfate: 100 mg.<br/>" +
                    "• Fiber: 20 - 45 gm. in divided doses accompanied with 12 ounces of water per dose<br/>" +
                    "• Garlic: 400 mg.<br/>" +
                    "• Red Yeast Rice (Monascus purpureus): 1200 mg. with 50 mg. Coenzyme Q10 2 times a day"
        }
    }
    private fun setBotanicalData(conditionName: String){
        binding.diet.text = "Botanicals"
        if(conditionName == "Atherosclerosis"){
            botanical_detail = "• Formula - Medicago (1), Salvia miltiorrhiza (1), Zingiber (1), Crataegus (2), Allium sativum (1), Curcuma (1), Ginkgo (1): take 1/4 tsp. TID<br/>" +
                    "• Individual botanicals to be considered for this condtion:<br/>" +
                    "  Allium sativum (Garlic)<br/>" +
                    "  Camellia sinensis (Green tea)<br/>" +
                    "  Capsicum frutescens (Cayenne, Red pepper)<br/>" +
                    "  Commiphora mukul (Guggulu)<br/>" +
                    "  Crataegus oxycantha (Hawthorne)<br/>" +
                    "  Curcuma longa (Tumeric)<br/>" +
                    "  Ginkgo biloba (Ginkgo)<br/>" +
                    "  Medicago sativa (Alfalfa)<br/>" +
                    "  Polygonum multiflorum (Fo-ti, He-shou-wu)<br/>" +
                    "  Pausinystalia yohimbe (Yohimbe)<br/>" +
                    "  Zingiber officinale (Ginger)"
        }
    }
    private fun setHomepathicData(conditionName: String){
        binding.diet.text = "Homeopathic Remedies"
        if(conditionName == "Atherosclerosis"){
            homeopathic_detail = "• General arteriosclerosis:<br/>" +
                    "  Arn., Ars-I., Aur., Aur-I., Bar-C., Calc., Cupr., Glon., Kali-I., Plb., Plb-I., Polyg-A., Sec., Stront-C., Stront-I., Tab., Vanad., Vise.<br/>" +
                    "• Atheroma:<br/>" +
                    "  Calc., Calc-F., Graph., Lach., Lac-Ac., Plb., Sil.<br/>" +
                    "• Atheroma in elderly people:<br/>" +
                    "  Lach.<br/>" +
                    "• Atheroma in pulmonary arteries, dilation of right heart:<br/>" +
                    "  Phos."
        }
    }
    private fun setTherapyData(conditionName: String){
        binding.diet.text = "Other Therapies"
        if(conditionName=="Atherosclerosis"){
            other_therapy = "• Some form of daily exercise (walking, cycling, yoga, etc.) increases HDL and lowers cholesterol and LDL<br/>" +
                    "• Reduce stress<br/>" +
                    "• Remove chlorine from drinking water with a reverse-osmosis water filter<br/>" +
                    "• Stop smoking<br/>" +
                    "• Supplement with thyroid hormone if suffering from hypothyroidism<br/>" +
                    "• Rinse dishes very well - detergent dissolves fatty acids in cell membranes"
        }
    }
    private fun setRecommendedLabData(conditionName: String){
        binding.diet.text = "Recommended Labs"
        if(conditionName=="Atherosclerosis"){
            recommended_labs = "• Check for atherosclerosis: Lipid Panel, Apolipoprotein A1, Apolipoprotein B, Cardio CRP, Homocysteine<br/>" +
                    "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c"
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