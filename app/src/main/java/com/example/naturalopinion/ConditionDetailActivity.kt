package com.example.naturalopinion

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
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
    var ss = SpannableString("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConditionDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contentData.movementMethod = LinkMovementMethod.getInstance()


        heading = intent.getStringExtra("heading").toString()

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)


        back_button = findViewById(R.id.back_button_6)
        condition_name = findViewById(R.id.condition_name)

        condition_name.text = heading

        back_button.setOnClickListener { finish() }

        setDietData(heading)

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
        when(conditionName){
            "ADD/ADHD" -> {
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods) - especially food additives and preservatives. When there is hyperactivity along with the ADD it is inevitably due to an allergic reaction to some food or chemical. Most common causes, in order of likelihood, are:\n" +
                        "Coloring and preservatives\n" +
                        "Cow's milk\n" +
                        "Soy products\n" +
                        "Chocolate\n" +
                        "Grapes\n" +
                        "Oranges\n" +
                        "Peanuts\n" +
                        "Wheat\n" +
                        "Corn\n" +
                        "Tomatoes\n" +
                        "Eggs\n" +
                        "Cane sugar\n" +
                        "Apples\n" +
                        "Fish\n" +
                        "Oats\n" +
                        "• Avoid simple sugars - allergies to other chemicals are exacerbated when sugar is ingested\n" +
                        "• For chelating heavy metals: apples, seaweed, foods high in methionine and cysteine, garlic, and beans"
                ss = SpannableString(diet_detail)
                createLink(ss,"methionine",diet_detail,"Supplement","Methionine")
                createLink(ss,"cysteine",diet_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"garlic",diet_detail,"Supplement","Allium sativum (Garlic)")

            }
            "Atherosclerosis" ->{
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
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Fiber","")
            }

        }
        binding.contentData.text = ss
    }
    private fun setVitaminData(conditionName: String?) {
        binding.diet.text = "Vitamins and Minerals"
        when(conditionName){
            "ADD/ADHD" -> {
                vitamin_detail = "• Niacinamide: 1 - 3 gm.\n" +
                        "• Vitamin B6: 20 - 30 mg./kg.\n" +
                        "• Vitamin C: 3 gm. (for chelating heavy metals)\n" +
                        "• Zinc: 30 mg.\n" +
                        "• *Calcium: 1 gm.\n" +
                        "• Magnesium: 500 mg."
                ss = SpannableString(vitamin_detail)
//                val clickableSpan1 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,VitaminMineralDetailActivity::class.java)
//                        intent.putExtra("heading","Vitamin B3 (Niacin)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan2 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,VitaminMineralDetailActivity::class.java)
//                        intent.putExtra("heading","Vitamin B6 (Pyridoxine)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan3 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,VitaminMineralDetailActivity::class.java)
//                        intent.putExtra("heading","Vitamin C (Ascorbic Acid)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan4 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,VitaminMineralDetailActivity::class.java)
//                        intent.putExtra("heading","Zinc")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan5 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,VitaminMineralDetailActivity::class.java)
//                        intent.putExtra("heading","Calcium")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan6 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,VitaminMineralDetailActivity::class.java)
//                        intent.putExtra("heading","Magnesium")
//                        startActivity(intent)
//                    }
//
//                }
//                ss.setSpan(clickableSpan1,2,13,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan2,vitamin_detail.indexOf("Vitamin B6"),vitamin_detail.indexOf("Vitamin B6")+10,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan3,vitamin_detail.indexOf("Vitamin C"),vitamin_detail.indexOf("Vitamin C")+9,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan4,vitamin_detail.indexOf("Zinc"),vitamin_detail.indexOf("Zinc")+4,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan5,vitamin_detail.indexOf("Calcium"),vitamin_detail.indexOf("Calcium")+7,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan6,vitamin_detail.indexOf("Magnesium"),vitamin_detail.indexOf("Magnesium")+9,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
            }

            "Atherosclerosis" -> {
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
                ss = SpannableString(recommended_labs)

            }
        }

        binding.contentData.text = ss
    }
    private fun setSupplementData(conditionName: String) {
        binding.diet.text = "Supplements"
        when(conditionName){
            "Atherosclerosis" -> {
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
                ss = SpannableString(supplements_detail)
            }
            "ADD/ADHD" -> {
                supplements_detail = "• Omega-3 Fatty Acids: 500-1000 mg. TID\n" +
                        "• Pycnogenol: 20-100 mg. TID"
                ss = SpannableString(supplements_detail)
//                val clickableSpan2 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,SupplementDetailActivity::class.java)
//                        intent.putExtra("heading","Pycnogenol")
//                        startActivity(intent)
//                    }
//                }
//                ss.setSpan(clickableSpan2,supplements_detail.indexOf("Pycnogenol"),supplements_detail.indexOf("Pycnogenol")+10,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
            }
        }

        binding.contentData.text = ss
    }
    private fun setBotanicalData(conditionName: String){
        binding.diet.text = "Botanicals"
        when(conditionName){
            "Atherosclerosis" -> {
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
                ss = SpannableString(botanical_detail)

            }
            "ADD/ADHD" -> {
                botanical_detail = "• Compound Glycerite - *Passiflora incarnata, *Melissa officinalis, *Nepeta cataria, *Eschscholzia californica, *Lavendula angustifolia: for the acute child, 10 drops up to 5 times a day\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Eschscholzia californica (California poppy)\n" +
                        "Lavendula angustifolia (Lavender)\n" +
                        "Melissa officinalis (Lemon balm)\n" +
                        "Nepeta cataria (Catnip)\n" +
                        "Passiflora incarnata (Passionflower)\n" +
                        "Piper methysticum (Kava kava)"
                ss = SpannableString(botanical_detail)
//                val clickableSpan1 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
//                        intent.putExtra("heading","Passiflora incarnata (Passionflower)")
//                        startActivity(intent)
//                    }
//                }
//                val clickableSpan2 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
//                        intent.putExtra("heading","Melissa officinalis (Lemon balm)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan3 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
//                        intent.putExtra("heading","Nepeta cataria (Catnip)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan4 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
//                        intent.putExtra("heading","Eschscholzia californica (California poppy)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan5 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,SupplementDetailActivity::class.java)
//                        intent.putExtra("heading","Lavendula angustifolia (Lavender)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan6 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
//                        intent.putExtra("heading","Allium sativum (Garlic)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan7 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
//                        intent.putExtra("heading","Eschscholzia californica (California poppy)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan8 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
//                        intent.putExtra("heading","Lavendula angustifolia (Lavender)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan9 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
//                        intent.putExtra("heading","Melissa officinalis (Lemon balm)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan10 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,SupplementDetailActivity::class.java)
//                        intent.putExtra("heading","Nepeta cataria (Catnip)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan11 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
//                        intent.putExtra("heading","Passiflora incarnata (Passionflower)")
//                        startActivity(intent)
//                    }
//
//                }
//                val clickableSpan12 = object : ClickableSpan(){
//                    override fun onClick(widget: View) {
//                        val intent = Intent(this@ConditionDetailActivity,SupplementDetailActivity::class.java)
//                        intent.putExtra("heading","Piper methysticum (Kava kava)")
//                        startActivity(intent)
//                    }
//
//                }
//                ss.setSpan(clickableSpan1,botanical_detail.indexOf("Passiflora incarnata"),botanical_detail.indexOf("Passiflora incarnata")+20,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan2,botanical_detail.indexOf("Melissa officinalis"),botanical_detail.indexOf("Melissa officinalis")+19,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan3,botanical_detail.indexOf("Nepeta cataria"),botanical_detail.indexOf("Nepeta cataria")+14,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan4,botanical_detail.indexOf("Eschscholzia californica"),botanical_detail.indexOf("Eschscholzia californica")+24,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan5,botanical_detail.indexOf("Lavendula angustifolia"),botanical_detail.indexOf("Lavendula angustifolia")+22,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan6,botanical_detail.indexOf("Allium sativum"),botanical_detail.indexOf("Allium sativum")+14,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan7,botanical_detail.indexOf("Garlic")+8,botanical_detail.indexOf("Garlic")+32,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan8,botanical_detail.indexOf("Lavendula angustifolia (Lavender)"),botanical_detail.indexOf("Lavendula angustifolia (Lavender)")+22,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan9,botanical_detail.indexOf("Melissa officinalis (Lemon balm)"),botanical_detail.indexOf("Melissa officinalis (Lemon balm)")+19,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan10,botanical_detail.indexOf("Nepeta cataria (Catnip)"),botanical_detail.indexOf("Nepeta cataria (Catnip)")+14,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan11,botanical_detail.indexOf("Passiflora incarnata (Passionflower)"),botanical_detail.indexOf("Passiflora incarnata (Passionflower)")+20,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//                ss.setSpan(clickableSpan12,botanical_detail.indexOf("Piper methysticum (Kava kava)"),botanical_detail.indexOf("Piper methysticum (Kava kava)")+17,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

                createLink(ss,"Passiflora incarnata",botanical_detail,"Botanical","Passiflora incarnata (Passionflower)")
                createLink(ss,"Melissa officinalis",botanical_detail,"Botanical","Melissa officinalis (Lemon balm)")
                createLink(ss,"Nepeta cataria",botanical_detail,"Botanical","Nepeta cataria (Catnip)")
                createLink(ss,"Eschscholzia californica",botanical_detail,"Botanical","Eschscholzia californica (California poppy)")
                createLink(ss,"Lavendula angustifolia",botanical_detail,"Supplement","Lavendula angustifolia (Lavender)")
                createLink(ss,"Allium sativum",botanical_detail,"Botanical","Allium sativum (Garlic)")
                createLink(ss,"Eschscholzia californica ",botanical_detail,"Botanical","Eschscholzia californica (California poppy)")
                createLink(ss,"Lavendula angustifolia (Lavender)",botanical_detail,"Botanical","Lavendula angustifolia (Lavender)")
                createLink(ss,"Melissa officinalis (Lemon balm)",botanical_detail,"Botanical","Melissa officinalis (Lemon balm)")
                createLink(ss,"Nepeta cataria (Catnip)",botanical_detail,"Supplement","Nepeta cataria (Catnip)")
                createLink(ss,"Passiflora incarnata (Passionflower)",botanical_detail,"Botanical","Passiflora incarnata (Passionflower)")
                createLink(ss,"Piper methysticum (Kava kava)",botanical_detail,"Supplement","Piper methysticum (Kava kava)")
            }
        }

        binding.contentData.text = ss
    }
    private fun setHomepathicData(conditionName: String){
        binding.diet.text = "Homeopathic Remedies"
        when(conditionName){
            "Atherosclerosis" -> {
                homeopathic_detail = "• General arteriosclerosis:<br/>" +
                        "  Arn., Ars-I., Aur., Aur-I., Bar-C., Calc., Cupr., Glon., Kali-I., Plb., Plb-I., Polyg-A., Sec., Stront-C., Stront-I., Tab., Vanad., Vise.<br/>" +
                        "• Atheroma:<br/>" +
                        "  Calc., Calc-F., Graph., Lach., Lac-Ac., Plb., Sil.<br/>" +
                        "• Atheroma in elderly people:<br/>" +
                        "  Lach.<br/>" +
                        "• Atheroma in pulmonary arteries, dilation of right heart:<br/>" +
                        "  Phos."
                ss = SpannableString(homeopathic_detail)
            }
            "ADD/ADHD" -> {
                homeopathic_detail = "Aversion to concentration:\n" +
                        "calc, gels, lyc, med, nux-v, phos, ph-ac, plb, sil, staph\n" +
                        "Difficult to concentrate in children:\n" +
                        "aeth, am-c, BAR-C, carc, lach, med, ph-ac, phos , sil, zinc\n" +
                        "Difficult to concentrate in the afternoon:\n" +
                        "ang, cham, ery-a, myris, sang\n" +
                        "Difficult to concentrate while studying and reading:\n" +
                        "acon, AETH, agn, alum, ambr, ang, asar, bar-c, bar-m, bell, calc-f, calc-sil, carb-ac, carb-s, caust, cham, coff, corn, dros, fago, ferr-i, HELL, iod, kali-p, kali-sil, lach, lyc, merc, mur-ac, nat-a, nat-c, nat-p, NUX-V, ox-ac, phos, pic-ac, scut, SIL, spig, staph, sulph, syph, tab, zinc-p\n" +
                        "Hyperactivity in children:\n" +
                        "anac, ars, ars-i, calc-p, CARC, cina, coff, HYOS, iod, MED, nux-v, STRAM, tarent, thuj, TUB, verat\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
                val clickableSpan1 = object : ClickableSpan(){
                    override fun onClick(widget: View) {
                        val intent = Intent(this@ConditionDetailActivity,HydroTherapyActivity::class.java)
                        intent.putExtra("heading","Homeopathy")
                        startActivity(intent)
                    }

                }
                ss.setSpan(clickableSpan1,homeopathic_detail.indexOf("here"),homeopathic_detail.indexOf("here")+4,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                makeBold(ss,homeopathic_detail,"gels")
                makeBold(ss,homeopathic_detail,"ph-ac")
                makeBold(ss,homeopathic_detail,"sil")
                makeBold(ss,homeopathic_detail,"aeth")
                makeBold(ss,homeopathic_detail,"BAR-C, carc")
                makeBold(ss,homeopathic_detail,"phos")
                makeBold(ss,homeopathic_detail,"AETH, agn")
                makeBold(ss,homeopathic_detail,"HELL")
                makeBold(ss,homeopathic_detail,"kali-p")
                makeBold(ss,homeopathic_detail,"NUX-V")
                makeBold(ss,homeopathic_detail,"phos ")
                makeBold(ss,homeopathic_detail,"SIL")
                makeBold(ss,homeopathic_detail,"staph")
                makeBold(ss,homeopathic_detail,"syph")
                makeBold(ss,homeopathic_detail,"ars")
                makeBold(ss,homeopathic_detail,"CARC, cina")
                makeBold(ss,homeopathic_detail,"HYOS")
                makeBold(ss,homeopathic_detail,"MED")
                makeBold(ss,homeopathic_detail,"STRAM, tarent")
                makeBold(ss,homeopathic_detail,"TUB, verat")
            }
        }

        binding.contentData.text = ss
    }
    private fun setTherapyData(conditionName: String){
        binding.diet.text = "Other Therapies"
        when(conditionName){
            "Atherosclerosis" -> {
                other_therapy = "• Some form of daily exercise (walking, cycling, yoga, etc.) increases HDL and lowers cholesterol and LDL<br/>" +
                        "• Reduce stress<br/>" +
                        "• Remove chlorine from drinking water with a reverse-osmosis water filter<br/>" +
                        "• Stop smoking<br/>" +
                        "• Supplement with thyroid hormone if suffering from hypothyroidism<br/>" +
                        "• Rinse dishes very well - detergent dissolves fatty acids in cell membranes"
                ss = SpannableString(other_therapy)
            }
            "ADD/ADHD" -> {
                other_therapy = "• Chelate lead or other heavy metals if hair analysis or other lab work indicates\n" +
                        "• Avoid television and fluorescent lights"
                ss = SpannableString(other_therapy)
            }
        }

        binding.contentData.text = ss
    }
    private fun setRecommendedLabData(conditionName: String){
        binding.diet.text = "Recommended Labs"
        when(conditionName){
            "Atherosclerosis" -> {
                recommended_labs = "• Check for atherosclerosis: Lipid Panel, Apolipoprotein A1, Apolipoprotein B, Cardio CRP, Homocysteine<br/>" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c"
                ss = SpannableString(recommended_labs)
            }
            "ADD/ADHD" -> {
                recommended_labs = "• Rule out food allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out thyroid problems: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
                val clickableSpan1 = object : ClickableSpan(){
                    override fun onClick(widget: View) {
                        val intent = Intent(this@ConditionDetailActivity,ConditionDetailActivity::class.java)
                        intent.putExtra("heading","Allergies")
                        startActivity(intent)
                    }
                }
                ss.setSpan(clickableSpan1,recommended_labs.indexOf("food allergies"),recommended_labs.indexOf("food allergies")+14,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

            }
        }


        binding.contentData.text = ss
    }

    private fun createLink(ss: SpannableString, sub_str: String, string: String, activity: String, heading: String) {
        val clickableSpan = object : ClickableSpan(){
            override fun onClick(widget: View) {
                val intent : Intent
                if(activity=="Condition"){
                    intent = Intent(this@ConditionDetailActivity,ConditionDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }else if(activity=="Supplement"){
                    intent = Intent(this@ConditionDetailActivity,SupplementDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }else if(activity=="Fiber"){
                    intent = Intent(this@ConditionDetailActivity,FiberDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }else if(activity=="Vitamin"){
                    intent = Intent(this@ConditionDetailActivity,VitaminMineralDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }else if(activity=="Botanical"){
                    intent = Intent(this@ConditionDetailActivity,BotanicalDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }
            }
        }
        if(string.indexOf(sub_str)!=-1)
        ss.setSpan(clickableSpan,string.indexOf(sub_str),string.indexOf(sub_str)+sub_str.length,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
    fun makeBold(ss : SpannableString,string:String,substr:String){
        if(string.indexOf(substr)!=-1 )
            ss.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD),string.indexOf(substr),string.indexOf(substr)+substr.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }

}