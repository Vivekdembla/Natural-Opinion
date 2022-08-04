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


        binding.reference.setOnClickListener {
            val intent = Intent(this,ReferenceActivity::class.java)
            intent.putExtra("heading",heading)
            startActivity(intent)
        }

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
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")

            }
            "Adult Acne" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid foods that cause vasodilation, including sugar, refined foods, coffee, alcohol, fats, spicy foods, etc."
                ss = SpannableString(diet_detail)
            }

            "Age-Related Macular Degeneration" ->{
                diet_detail = "• Avoid rancid foods and all other sources of free radicals\n" +
                        "• Eat lots of blueberries, blackberries, and cherries for their anthocyanidin content\n" +
                        "• Eat lots of legumes (beans) and yellow vegetables for their carotenoid content\n" +
                        "• Drink a modest amount of red wine or red grape juice regularly (for their anthocyanadins)\n" +
                        "• Eat more fish and less saturated fat (e.g., red meat)"
                ss = SpannableString(diet_detail)
            }
            "Aging Prevention" ->{
                diet_detail = "• Avoid meats\n" +
                        "• Eliminate sugar, especially fructose\n" +
                        "• Increase vegetable, fruit and grain intake\n" +
                        "• Reduce caloric intake, eating small meals throughout the day\n" +
                        "• Consume a small amount of red wine every day"
                ss = SpannableString(diet_detail)
            }
            "AIDS" ->{
                diet_detail = "• Avoid sucrose and all simple sugars\n" +
                        "• Eat foods high in fiber\n" +
                        "• Reduce fat consumption, especially saturated fats (animal products)\n" +
                        "• Eat more complex carbohydrates, e.g., vegetables, beans, and brown rice\n" +
                        "• Eat lots of garlic, onions, tumeric and shiitake and/or reishi mushrooms\n" +
                        "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"tumeric",diet_detail,"Botanicals","Curcuma longa (Tumeric)")
            }
            "Allergies" ->{
                diet_detail = "• Isolate and eliminate foods that cause an allergic response or to which there is a sensitivity and do not introduce foods that have a high potential for allergy too early in an infant's diet\n" +
                        "• Eat more garlic"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "Alzheimer's Disease" ->{
                diet_detail = "• Drink 2 litres of filtered water a day\n" +
                        "• Avoid cooking in aluminium pots\n" +
                        "• Avoid drinking juice, tea or soft drinks from aluminium containers\n" +
                        "• Avoid citrate containing fluids in aluminium containers - this increases the availability of aluminium\n" +
                        "• Avoid all products containing aluminium, including antiperspirants, baking powder, antacids, vaginal douches, etc.\n" +
                        "• Small to moderate amounts of red wine every day have been found to be protective\n" +
                        "• Eat more fish (non-farmed, cold water)\n" +
                        "• Eat lots of garlic"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "Amenorrhea" ->{
                diet_detail = "• For female atheletes with amenorrhea, there is evidence to suspect that a completely vegetarian diet may exacerbate the problem"
                ss = SpannableString(diet_detail)
            }
            "Anorexia Nervosa" ->{
                diet_detail = "• Avoid sugar, alcohol, caffeine and tobacco"
                ss = SpannableString(diet_detail)
            }
            "Aphthous Stomatitis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity, especially wheat (fast, use an elimination diet, or allergy test to isolate such foods)"
                ss = SpannableString(diet_detail)
            }
            "Arthritis, Gout" ->{
                diet_detail = "• Absolutely no alcohol\n" +
                        "• Consume a low protein diet: avoid meats, yeast (baker's and brewer's), shellfish, sardines, herring, mackerel, and anchovies; and decrease intake of spinach, fish, mushrooms, dried legumes, and asparagus.\n" +
                        "• Decrease saturated fat intake\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Increase water intake to 48 ounces/day\n" +
                        "• Increase consumption of anthocyanosides: blueberries, cherries, hawthorn berries, etc - during an acute attack drink bing cherry juice (8 oz/day)"
                ss = SpannableString(diet_detail)
            }

            "Arthritis, Osteo" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Reduce all fats to less than 20% of the diet, especially saturated fats (animal products)\n" +
                        "• Eat more vegetables, brown rice, and fish\n" +
                        "• Avoid sugar, refined foods, and all food additives\n" +
                        "• Avoid alcohol, coffee, and black tea\n" +
                        "• Avoid tomatoes, potatoes, eggplant, peppers, and tobacco (Solanacea family)\n" +
                        "• Avoid carbonated drinks and citrus"
                ss = SpannableString(diet_detail)
            }
            "Arthritis, Psoriatic" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid foods that contain purine, i.e., meat and other high protein foods and reduce all fats to less than 25% of the diet especially saturated fats (animal products)\n" +
                        "• Avoid tomatoes, potatoes, eggplant, peppers, and tobacco (all in the Solanacea family of plants)\n" +
                        "• Eat more vegetables, brown rice, and fish and increase fiber in the diet, either by diet (whole grains, bran, fruit, etc.) or supplements\n" +
                        "• Avoid cAMP stimulators such as biotin, ginseng, and Vitamin C\n" +
                        "• Avoid cyclo-oxygenase inhibitors such as aspirin and NSAIDs\n" +
                        "• Eat lots of garlic (inhibits lipoxygenase)\n" +
                        "• Avoid alcohol (wine only if you must), coffee, and black tea\n" +
                        "• Eat lots of fresh ginger (proven anti-inflammatory effect in arthritis)\n" +
                        "• Avoid refined foods and all food additives"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"ginger",diet_detail,"Botanicals","Zingiber officinale (Ginger)")
            }
            "Arthritis, Rheumatoid" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Reduce all fats to less than 25% of the diet especially saturated fats (animal products)\n" +
                        "• Eat more vegetables, brown rice, and fish\n" +
                        "• Eat lots of fresh ginger (proven anti-inflammatory effect in RA)\n" +
                        "• Avoid refined foods and all food additives\n" +
                        "• Avoid alcohol, coffee, and black tea\n" +
                        "• Avoid tomatoes, potatoes, eggplant, peppers, and tobacco (all in the Solanacea family of plants)"
                ss = SpannableString(diet_detail)
                createLink(ss,"ginger",diet_detail,"Botanicals","Zingiber officinale (Ginger)")
            }
            "Asthma" ->{
                diet_detail = "• Eliminate foods and preservatives (especially sulfites) that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods). Generally, the younger an asthma patient, the more the allergen will be food. The older a patient, the more the allergen will be to inhalants.\n" +
                        "• Consider a cleansing diet to lower body toxicity levels since accumulated toxins are often a precursor to asthma attacks\n" +
                        "• Many people, especially children, should avoid sulfites and aspirin due to a common defect in sulfur metabolism\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Decrease consumption of foods with arachidonic acid (red meat and dairy products)\n" +
                        "• Consume more: EPA and linolenic acid sources (flax oil, canola oil, walnuts, cold water fish, herring, sardines, salmon)\n" +
                        "• Eat lots of onions\n" +
                        "• Caffeine, tea and other substances containing methyl-xanthines can increase bronchodilation during asthmatic episodes"
                ss = SpannableString(diet_detail)
                createLink(ss,"sulfites",diet_detail,"Food","Food Sources of Sulfites")
                createLink(ss,"cleansing diet",diet_detail,"Food","Cleansing Diet")
                createLink(ss,"EPA",diet_detail,"Food","Essential Fatty Acids (EFAs)")
            }
            "Atherosclerosis" ->{
                diet_detail = "• Eat foods high in fiber (significantly lowers cholesterol)\n" +
                        "• Reduce fat consumption, especially saturated fats (animal products) and oxidized fats like those found in fast food places (french fries and other fried foods)\n" +
                        "• Eat lots of garlic and onions\n" +
                        "• Eat complex carbohydrates, e.g., vegetables, beans, and brown rice and avoid sucrose and all simple sugars (more important than fat reduction)\n" +
                        "• Consume more soy protein and less meat\n" +
                        "• Eat a diet high in cold water fish\n" +
                        "• Avoid hydrogenated oils and trans-fatty acids\n" +
                        "• Reduce, but don't eliminate alcohol from the diet, e.g., 1 glass of wine per evening\n" +
                        "• Drink more tea and cocoa\n" +
                        "• Avoid milk and other dairy products"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "Atopic Dermatitis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid animal fats, i.e., dairy products and meat. Fish is an exception - eat lots of it, preferably cold-water fish\n" +
                        "• Avoid intake of trans-fatty acids (from margarines and various kinds of oils)\n" +
                        "• *Drink 3 to 4 quarts of good (reverse-osmosis) water every day"
                ss = SpannableString(diet_detail)
            }
            "Attention Deficit Disorder" ->{
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
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "Autism" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity, especially wheat and dairy (fast, use an elimination diet, or allergy test to isolate such foods)"
                ss = SpannableString(diet_detail)
            }
            "Benign Prostatic Hypertrophy" ->{
                diet_detail = "• Reduce fat and cholesterol intake especially saturated fats (animal products) and eat more fruits and vegetables\n" +
                        "• Eat foods containing more zinc (nuts - especially walnuts, pumpkin seeds, safflower seeds, and oysters)\n" +
                        "• Avoid drinking beer\n" +
                        "• Eat more soy products\n" +
                        "• *Remove all chemicals and pesticides from diet (eat organic food)"
                ss = SpannableString(diet_detail)
                createLink(ss,"zinc",diet_detail,"Vitamin","Zinc")
            }
            "Bipolar Disorder" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid coffee and other caffeinated beverages\n" +
                        "• Avoid alkalizing agents like bicarbonates (decreases effectiveness of lithium treatment)"
                ss = SpannableString(diet_detail)
            }
            "Bladder Infection" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Eat more cranberries and blueberries and/or drink unsweetened cranberry and blueberry juice\n" +
                        "• Increase fluids-filtered water, 1 cup per hour"
                ss = SpannableString(diet_detail)
            }
            "Blood Pressure, High" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar, salt, fat, caffeine, and alcohol\n" +
                        "• Increase fruits and vegetables, especially bananas and oranges\n" +
                        "• Decrease or eliminate animal products\n" +
                        "• Eat 1 clove of fresh garlic TID\n" +
                        "• Eat onions daily\n" +
                        "• Eat lots of celery"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "BPH" ->{
                diet_detail = "• Reduce fat and cholesterol intake especially saturated fats (animal products) and eat more fruits and vegetables\n" +
                        "• Eat foods containing more zinc (nuts - especially walnuts, pumpkin seeds, safflower seeds, and oysters)\n" +
                        "• Avoid drinking beer\n" +
                        "• Eat more soy products\n" +
                        "• *Remove all chemicals and pesticides from diet (eat organic food)"
                ss = SpannableString(diet_detail)
                createLink(ss,"zinc",diet_detail,"Vitamin","Zinc")
            }
            "Bronchitis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods - especially investigate dairy products, corn, and wheat)\n" +
                        "• Drink warming fluids\n" +
                        "• *Eat lots of garlic and onions and, if, on the cool side, ginger and cayenne\n" +
                        "• *Decrease sugar intake as well as starches and carbohydrates"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"ginger",diet_detail,"Botanicals","Zingiber officinale (Ginger)")
                createLink(ss,"cayenne",diet_detail,"Botanicals","Capsicum frutescens (Cayenne, Red pepper)")
            }
            "Cancer Prevention" ->{
                diet_detail = "Most Cancers:\n" +
                        "• Reduce intake of animal fats\n" +
                        "• Reduce consumption of dairy products\n" +
                        "• Eat lots of garlic\n" +
                        "• Reduce intake of simple sugars - high levels of insulin increase risk for most cancers\n" +
                        "• Increase foods that are high in fiber\n" +
                        "• Eat more fruits and vegetables and foods high in sulfur-containing amino acids (grains and legumes)\n" +
                        "• Reduce intake of alcoholic beverages\n" +
                        "• Eat more brassicas (broccoli, cabbage, cauliflower, etc.)\n" +
                        "Breast and Prostate Cancer:\n" +
                        "• Eat more cold-water fish\n" +
                        "• Eat lots of soybean products like tofu or miso\n" +
                        "• Eat lots of tomatoes\n" +
                        "• Drink green tea\n" +
                        "Lung Cancer:\n" +
                        "• Reduce cholesterol in the diet\n" +
                        "• Esophageal, Stomach, Colon and Rectal Cancers:\n" +
                        "• Reduce consumption of salted, pickled and smoked foods\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Candida Infection" ->{
                diet_detail = "• Avoid simple carbohydrates, e.g., sugar, alcohol and fruit juice\n" +
                        "• *Cleansing diet for 14 - 21 days\n" +
                        "• Increase fiber in diet if bowel sluggishness/toxemia appears to be a problem\n" +
                        "• Eat lots of garlic (several cloves per day)\n" +
                        "• Avoid milk products and all refined foods (white flour, etc.)\n" +
                        "• Avoid all yeast products (fermented beverages, cakes, breads, many fruits, peanuts)\n" +
                        "• Avoid leftovers unless frozen (these contain a high level of fungus)"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"cleansing diet",diet_detail,"Food","Cleansing Diet")
            }
            "Candidiasis" ->{
                diet_detail = "• Avoid simple carbohydrates, e.g., sugar, alcohol and fruit juice\n" +
                        "• *Cleansing diet for 14 - 21 days\n" +
                        "• Increase fiber in diet if bowel sluggishness/toxemia appears to be a problem\n" +
                        "• Eat lots of garlic (several cloves per day)\n" +
                        "• Avoid milk products and all refined foods (white flour, etc.)\n" +
                        "• Avoid all yeast products (fermented beverages, cakes, breads, many fruits, peanuts)\n" +
                        "• Avoid leftovers unless frozen (these contain a high level of fungus)"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"cleansing diet",diet_detail,"Food","Cleansing Diet")
            }
            "Canker Sores" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity, especially wheat (fast, use an elimination diet, or allergy test to isolate such foods)\n"
                ss = SpannableString(diet_detail)
            }
            "Cataract Prevention" ->{
                diet_detail = "• Avoid rancid foods and all other sources of free radicals\n" +
                        "• Eat more foods high in sulfur-containing amino acids (more grains and legumes)\n" +
                        "• Reduce intake of animal fats\n" +
                        "• Avoid all dairy products\n" +
                        "• Use lots of the spice, tumeric (curcumin)\n" +
                        "• Reduce but do not eliminate alcohol consumption\n"
                ss = SpannableString(diet_detail)
            }
            "CFS/CFIDS" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• *Avoid sugar, refined foods, nuts, peanuts, caffeine, and all food additives and preservatives\n" +
                        "• Eat lots of garlic and onions"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "CHF" ->{
                diet_detail = "• Avoid excessive dietary salt, sodium and chloride\n" +
                        "• No caffeine, refined carbohydrates and saturated fats\n" +
                        "• Eat high fiber diet\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Cholecystitis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Eat high fiber and high complex carbohydrate diet (promotes decrease in bowel transit time)\n" +
                        "• Reduce fats in general and especially animal fats\n" +
                        "• Drink lots of vegetable juices\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Cholelithiasis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Vegan diet\n" +
                        "• Eat high fiber and high complex carbohydrate diet (promotes decrease in bowel transit time)\n" +
                        "• Reduce fats in general and especially animal fats\n" +
                        "• Drink lots of vegetable juices\n" +
                        "• Eliminate fried foods, and especially trans-fatty acids"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Chronic Fatigue Syndrome" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• *Avoid sugar, refined foods, nuts, peanuts, caffeine, and all food additives and preservatives\n" +
                        "• Eat lots of garlic and onions"
                ss = SpannableString(diet_detail)
            }
            "Colitis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods) - there is likely to be an allergy/sensitivity to dairy products\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Eat high fiber (after healing has occurred - use soluble fibers while healing) and high complex carbohydrate diet\n" +
                        "• Drink liquid/elemental diet in active phase, e.g., juices from cabbage and green leafy vegetables\n" +
                        "• *Avoid caffeine and alcohol"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "Congestive Heart Failure" ->{
                diet_detail = "• Avoid excessive dietary salt, sodium and chloride\n" +
                        "• No caffeine, refined carbohydrates and saturated fats\n" +
                        "• Eat high fiber diet"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Constipation" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity - especially dairy products (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Eat a high fiber diet - more fruits (especially kiwi) and vegetables and less animal products\n" +
                        "• Drink lots of filtered water\n" +
                        "• Use honey instead of sugar as a sweetener"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Crohn's Disease" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Avoid fast food restaurants\n" +
                        "• Reduce fat intake\n" +
                        "• Eat high fiber (after healing has occurred-use soluble fibers while healing) and high complex carbohydrate diet\n" +
                        "• Drink liquid diet in active phase, consisting of juices from cabbage and green leafy vegetables\n" +
                        "• Drink vegetable broths\n" +
                        "• Avoid caffeine and alcohol"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Cystitis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Eat more cranberries and blueberries and/or drink unsweetened cranberry and blueberry juice\n" +
                        "• Increase fluids-filtered water, 1 cup per hour"
                ss = SpannableString(diet_detail)
            }
            "Depression" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid caffeine, aspartame and monosodium glutamate (MSG)\n" +
                        "• Avoid sugar and alcohol"
                ss = SpannableString(diet_detail)
            }
            "Diabetes Mellitus" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Totally eliminate sucrose (glucose and fructose together) and refined, simple carbohydrates\n" +
                        "• Increase consumption of foods with low glycemic indices\n" +
                        "• Legumes in the morning have shown an extremely beneficial effect on blood glucose\n" +
                        "• Avoid coffee, alcohol, and tobacco\n" +
                        "• Avoid junk foods\n" +
                        "• Eat snacks of protein or almonds between meals\n" +
                        "• Eat 6 cloves of garlic a day\n" +
                        "• Use extra virgin olive oil rather than other types of cooking oils.\n" +
                        "• Drink more green tea\n" +
                        "• Use more cinnamon to spice up your food"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"cinnamon",diet_detail,"Botanicals","Zingiber officinale (Ginger)")
            }
            "Dysmenorrhea" ->{
                diet_detail = "• Increase complex carbohydrates to 60-70 % of total calories, including whole grains, legumes, fruits, vegetables and seeds and nuts such as ground raw flaxseed and pumpkin seed\n" +
                        "• Decrease fat, especially from arachidonic acid sources (animal products)\n" +
                        "• *Increase fiber\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }

            "Ear Infection" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods) (especially dairy products) - the most common allergens are: dairy products, eggs, wheat, potatoes, peanut butter, corn, and oranges\n" +
                        "• Avoid sugars, including sweetened juices (or at least dilute the juices several times the normal)\n" +
                        "• Eat very little food, mostly vegetable broth"
                ss = SpannableString(diet_detail)
            }
            "Eczema, Chronic" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid animal fats, i.e., dairy products and meat. Fish is an exception - eat lots of it, preferably cold-water fish\n" +
                        "• Avoid intake of trans-fatty acids (from margarines and various kinds of oils)\n" +
                        "• *Drink 3 to 4 quarts of good (reverse-osmosis) water every day\n"
                ss = SpannableString(diet_detail)
            }

            "Endometriosis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Decrease fat intake, including meat and dairy products\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• *Increase fiber"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }

            "Erectile Dysfunction" ->{
                diet_detail = "• Consume a diet which focuses on whole, unprocessed foods\n" +
                        "• Eliminate alcohol, caffeine, and sugar\n" +
                        "• Decrease total cholesterol and increase HDL cholesterol"
                ss = SpannableString(diet_detail)
            }

            "Fertility" ->{
                diet_detail = "  Female:\n" +
                        "• Reduce alcohol consumption\n" +
                        "   Male:\n" +
                        "• Avoid beverages containing tannic acid, including coffee (regular of decaf), tea, red wine\n" +
                        "• Reduce alcohol consumption\n" +
                        "• Avoid consuming products containing estrogens (non-organic dairy products, meats, etc.) or phytoestrogens (soy products)"
                ss = SpannableString(diet_detail)
            }
            "Fibrocystic Breast Disease" ->{
                diet_detail = "• Reduce all fats to less than 20% of the diet, especially saturated fats (animal products)\n" +
                        "• Eat more high fiber foods (reduces estrogen level by decreasing bowel transit time)\n" +
                        "• Vegan diet is recommended\n" +
                        "• Eat more soy protein products, such as tofu and tempeh\n" +
                        "• Avoid dairy products\n" +
                        "• Avoid chocolate, coffee, colas, and black tea (all forms of caffeine/methyl xanthine)"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }

            "Fibromyalgia" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar, refined foods, nuts, peanuts, caffeine, and all food additives and preservatives\n" +
                        "• Eat lots of blueberries, blackberries, and cherries for their anthocyanidin content"
                ss = SpannableString(diet_detail)
            }
            "Gallbladder Disease" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Eat high fiber and high complex carbohydrate diet (promotes decrease in bowel transit time)\n" +
                        "• Reduce fats in general and especially animal fats\n" +
                        "• Drink lots of vegetable juices"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Gallstones" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Vegan diet\n" +
                        "• Eat high fiber and high complex carbohydrate diet (promotes decrease in bowel transit time)\n" +
                        "• Reduce fats in general and especially animal fats\n" +
                        "• Drink lots of vegetable juices\n" +
                        "• Eliminate fried foods, and especially trans-fatty acids"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Gout" ->{
                diet_detail = "• Absolutely no alcohol\n" +
                        "• Consume a low protein diet: avoid meats, yeast (baker's and brewer's), shellfish, sardines, herring, mackerel, and anchovies; and decrease intake of spinach, fish, mushrooms, dried legumes, and asparagus.\n" +
                        "• Decrease saturated fat intake\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Increase water intake to 48 ounces/day\n" +
                        "• Increase consumption of anthocyanosides: blueberries, cherries, hawthorn berries, etc - during an acute attack drink bing cherry juice (8 oz/day)"
                ss = SpannableString(diet_detail)
            }
            "Headache, General" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid dietary amines: chocolate, cheese, citrus and alcohol\n" +
                        "• Avoid food additives and colorings\n" +
                        "• Avoid red meats and saturated animal fats\n" +
                        "• Eliminate foods and drinks containing aspartame (NutraSweet) - source of many chronic headaches\n" +
                        "• Increase fiber and complex carbohydrates"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Headache, Migraine" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods). Most common allergens, in order of likelihood, are:\n" +
                        "Wheat\n" +
                        "Orange\n" +
                        "Egg\n" +
                        "Tea\n" +
                        "Coffee\n" +
                        "Chocolate\n" +
                        "Dairy Products\n" +
                        "Beef\n" +
                        "Corn\n" +
                        "Cane sugar\n" +
                        "Yeast\n" +
                        "Mushroom\n" +
                        "Peas\n" +
                        "• Avoid dietary amines - chocolate, citrus, red wines, aged cheeses, fermented sausages, beer, pickled products, bananas, figs, prunes, pineapples, raisins and sour cream\n" +
                        "• Avoid arachidonic acid-containing foods - meats and meat products\n" +
                        "• Avoid nitrate and nitrite foods - hot dogs, cured meats\n" +
                        "• Avoid copper foods - chocolate, nuts, wheat germ, shellfish, citrus (citrus increases the intestinal absorption of copper) and monosodium glutamate (MSG binds and transport copper between blood and tissues\n" +
                        "• Eliminate sugar, refined carbohydrates, caffeine and aspartame"
                ss = SpannableString(diet_detail)
            }
            "Hemorrhoids" ->{
                diet_detail = "• Reduce all fats, especially saturated fats (animal products)\n" +
                        "• Eat more high-fiber foods\n" +
                        "• Avoid chocolate, coffee, colas, spicy foods, fried foods and salty foods\n" +
                        "• Eliminate sugar, white flour, and all refined foods\n" +
                        "• Drink large amounts of filtered water every day (6-8 glasses)\n" +
                        "• Eat lots of blueberries, cherries, and blackberries\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Hepatitis" ->{
                diet_detail = "• Increase vegetable intake\n" +
                        "• Avoid sucrose and all simple sugars\n" +
                        "• Use lots of tumeric\n" +
                        "• Eliminate alcohol\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"tumeric",diet_detail,"Botanicals","Curcuma longa (Tumeric)")
            }
            "Herpes Simplex" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Eat a diet which avoids arginine - rich foods while promoting lysine- rich foods\n" +
                        "• Avoid during active outbreak: whole wheat, soy, lentils, oats, corn, barley, carob, eggplant, tomato, squash, fruits and berries with seeds.\n" +
                        "• Include: fish, brewers yeast, potatoes, yogurt, kefir, cottage cheese\n" +
                        "• Avoid: chocolate, peanuts, almonds, cashews, walnuts, filberts, pecans, brazil nuts, sesame seeds, sunflower seeds, coconut, gelatin\n" +
                        "• Avoid immunosuppressants: alcohol, drugs, caffeine, tobacco\n" +
                        "• Eat lots of garlic"
                ss = SpannableString(diet_detail)
            }
            "High Blood Pressure" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar, salt, fat, caffeine, and alcohol\n" +
                        "• Increase fruits and vegetables, especially bananas and oranges\n" +
                        "• Decrease or eliminate animal products\n" +
                        "• Eat 1 clove of fresh garlic TID\n" +
                        "• Eat onions daily\n" +
                        "• Eat lots of celery"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "High Cholesterol" ->{
                diet_detail = "• Eat foods high in fiber (significantly lowers cholesterol)\n" +
                        "• Reduce fat consumption, especially saturated fats (animal products) and oxidized fats like those found in fast food places (french fries and other fried foods)\n" +
                        "• Eat lots of garlic and onions\n" +
                        "• Eat complex carbohydrates, e.g., vegetables, beans and brown rice and avoid sucrose and all simple sugars (more important than fat reduction)\n" +
                        "• Consume more soy protein and less meat\n" +
                        "• Eat a diet high in cold water fish\n" +
                        "• Avoid hydrogenated oils and trans-fatty acids - use extra-virgin olive oil instead\n" +
                        "• Reduce, but don't eliminate alcohol from the diet, e.g., 1 glass of wine per evening\n" +
                        "• Drink more tea\n" +
                        "• Avoid milk and other dairy products\n" +
                        "• Eat more almonds and walnuts\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "HIV" ->{
                diet_detail = "• Avoid sucrose and all simple sugars\n" +
                        "• Eat foods high in fiber\n" +
                        "• Reduce fat consumption, especially saturated fats (animal products)\n" +
                        "• Eat more complex carbohydrates, e.g., vegetables, beans, and brown rice\n" +
                        "• Eat lots of garlic, onions, tumeric and shiitake and/or reishi mushrooms\n" +
                        "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"tumeric",diet_detail,"Botanicals","Curcuma longa (Tumeric)")
            }
            "Hyperactivity" ->{
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
                        "• For chelating heavy metals: apples, seaweed, foods high in methionine and cysteine, garlic, and beans\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"methionine",diet_detail,"Supplement","Methionine")
                createLink(ss,"cysteine",diet_detail,"Supplement","N-Acetyl Cysteine")
            }
            "Hypercholesterolemia" ->{
                diet_detail = "• Eat foods high in fiber (significantly lowers cholesterol)\n" +
                        "• Reduce fat consumption, especially saturated fats (animal products) and oxidized fats like those found in fast food places (french fries and other fried foods)\n" +
                        "• Eat lots of garlic and onions\n" +
                        "• Eat complex carbohydrates, e.g., vegetables, beans and brown rice and avoid sucrose and all simple sugars (more important than fat reduction)\n" +
                        "• Consume more soy protein and less meat\n" +
                        "• Eat a diet high in cold water fish\n" +
                        "• Avoid hydrogenated oils and trans-fatty acids - use extra-virgin olive oil instead\n" +
                        "• Reduce, but don't eliminate alcohol from the diet, e.g., 1 glass of wine per evening\n" +
                        "• Drink more tea\n" +
                        "• Avoid milk and other dairy products\n" +
                        "• Eat more almonds and walnuts"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "Hypertension" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar, salt, fat, caffeine, and alcohol\n" +
                        "• Increase fruits and vegetables, especially bananas and oranges\n" +
                        "• Decrease or eliminate animal products\n" +
                        "• Eat 1 clove of fresh garlic TID\n" +
                        "• Eat onions daily\n" +
                        "• Eat lots of celery"
                ss = SpannableString(diet_detail)
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "Hypothyroid" ->{
                diet_detail = "• Avoid foods high in cysteine - red meat and eggs\n" +
                        "• Add kelp and dulse to the diet\n" +
                        "• Avoid/minimize free fats (cooking oils, nut butters, margarine, and butter), sugar, and salt\n" +
                        "• Avoid all foods high in thiourea (these reduce thyroid function): brussel sprouts, cabbage, kale, mustard greens, peaches, peanuts, pears, rutabaga, spinach, strawberries, and turnips\n"
                ss = SpannableString(diet_detail)
            }
            "IBS" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods) - there is likely to be an allergy/sensitivity to dairy products\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Eat high fiber (after healing has occurred - use soluble fibers while healing) and high complex carbohydrate diet\n" +
                        "• Drink liquid/elemental diet in active phase, e.g., juices from cabbage and green leafy vegetables\n" +
                        "• *Avoid caffeine and alcohol\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Impotence" ->{
                diet_detail = "• Consume a diet which focuses on whole, unprocessed foods\n" +
                        "• Eliminate alcohol, caffeine, and sugar\n" +
                        "• Decrease total cholesterol and increase HDL cholesterol"
                ss = SpannableString(diet_detail)
            }
            "Incontinence, Stress" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid coffee and tea, even decaffeinated and carbonated beverages\n" +
                        "• Avoid eating citrus fruits and tomatoes\n" +
                        "• Eat dark green leafy vegetables"
                ss = SpannableString(diet_detail)
            }
            "Infertility" ->{
                diet_detail = "   Female:\n" +
                        "• Reduce alcohol consumption\n" +
                        "   Male:\n" +
                        "• Avoid beverages containing tannic acid, including coffee (regular of decaf), tea, red wine\n" +
                        "• Reduce alcohol consumption\n" +
                        "• Avoid consuming products containing estrogens (non-organic dairy products, meats, etc.) or phytoestrogens (soy products)"
                ss = SpannableString(diet_detail)
            }
            "Insomnia" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity, especially food additives (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid coffee and other caffeinated beverages"
                ss = SpannableString(diet_detail)
            }
            "Irritable Bowel Syndrome" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods) - there is likely to be an allergy/sensitivity to dairy products\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Eat high fiber (after healing has occurred - use soluble fibers while healing) and high complex carbohydrate diet\n" +
                        "• Drink liquid/elemental diet in active phase, e.g., juices from cabbage and green leafy vegetables\n" +
                        "• *Avoid caffeine and alcohol"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Longevity" ->{
                diet_detail = "• Avoid meats\n" +
                        "• Eliminate sugar, especially fructose\n" +
                        "• Increase vegetable, fruit and grain intake\n" +
                        "• Reduce caloric intake, eating small meals throughout the day\n" +
                        "• Consume a small amount of red wine every day"
                ss = SpannableString(diet_detail)
            }
            "Lupus" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Reduce animal fats\n" +
                        "• Avoid all dairy products\n" +
                        "• Avoid tomatoes, potatoes, eggplant, peppers, and tobacco (all in the Solanacea family of plants)\n" +
                        "• Avoid alfalfa in any form (herbal tea, sprouts, etc.)\n"
                ss = SpannableString(diet_detail)
            }
            "Macular Degeneration" ->{
                diet_detail = "• Avoid rancid foods and all other sources of free radicals\n" +
                        "• Eat lots of blueberries, blackberries, and cherries for their anthocyanidin content\n" +
                        "• Eat lots of legumes (beans) and yellow vegetables for their carotenoid content\n" +
                        "• Drink a modest amount of red wine or red grape juice regularly (for their anthocyanadins)\n" +
                        "• Eat more fish and less saturated fat (e.g., red meat)"
                ss = SpannableString(diet_detail)
            }
            "Manic Depressive Disorder" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid coffee and other caffeinated beverages\n" +
                        "• Avoid alkalizing agents like bicarbonates (decreases effectiveness of lithium treatment)"
                ss = SpannableString(diet_detail)
            }
            "Mastitis" ->{
                diet_detail = "• Avoid sugars, including sweetened juices (or at least dilute the juices several times normal)\n" +
                        "• Eat very little food, mostly vegetable broth\n" +
                        "• If food must be taken, eat only steamed vegetables\n" +
                        "• Drink lots of water - 6 to 8 glasses"
                ss = SpannableString(diet_detail)
            }
            "Memory Loss" ->{
                diet_detail = "• Avoid foods with preservatives or sulfites\n" +
                        "• Avoid foods with added dyes\n" +
                        "• Avoid foods that are not organically grown\n" +
                        "• Absolutely no NutraSweet ® (Aspartame)\n" +
                        "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and alcohol"
                ss = SpannableString(diet_detail)
                createLink(ss,"sulfites",diet_detail,"Food","Food Sources of Sulfites")
            }
            "Menopause" ->{
                diet_detail = "• Eat low fat, high fiber, vegetarian based diet with whole grains, legumes, raw seeds and nuts, fruits, and vegetables making up the core of the diet\n" +
                        "• Avoid sugar, refined carbohydrates, salt, dairy products, alcohol, and caffeine in coffee, teas, colas, and chocolate\n" +
                        "• Eat foods containing phytoestrogens: soybeans, apples, carrots, yams, green beans, peas, pomegranates, potatoes, red beans, brown rice, whole wheat, rye, sesame seeds, legumes, flaxseed and pumpkin seeds\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Migraine Headache" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods). Most common allergens, in order of likelihood, are:\n" +
                        "Wheat\n" +
                        "Orange\n" +
                        "Egg\n" +
                        "Tea\n" +
                        "Coffee\n" +
                        "Chocolate\n" +
                        "Dairy Products\n" +
                        "Beef\n" +
                        "Corn\n" +
                        "Cane sugar\n" +
                        "Yeast\n" +
                        "Mushroom\n" +
                        "Peas\n" +
                        "• Avoid dietary amines - chocolate, citrus, red wines, aged cheeses, fermented sausages, beer, pickled products, bananas, figs, prunes, pineapples, raisins and sour cream\n" +
                        "• Avoid arachidonic acid-containing foods - meats and meat products\n" +
                        "• Avoid nitrate and nitrite foods - hot dogs, cured meats\n" +
                        "• Avoid copper foods - chocolate, nuts, wheat germ, shellfish, citrus (citrus increases the intestinal absorption of copper) and monosodium glutamate (MSG binds and transport copper between blood and tissues\n" +
                        "• Eliminate sugar, refined carbohydrates, caffeine and aspartame"
                ss = SpannableString(diet_detail)
            }
            "Mouth Ulcers" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity, especially wheat (fast, use an elimination diet, or allergy test to isolate such foods)"
                ss = SpannableString(diet_detail)
            }
            "Multiple Sclerosis" ->{
                diet_detail = "• Eat very low fat diet - 12% of total calories\n" +
                        "• Eat very low saturated fats\n" +
                        "• Decrease gluten (wheat) and milk products\n" +
                        "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Increase omega-3 and omega-6 fatty acids:\n" +
                        "• vegetables, nuts, seed oils, salmon, herring, mackerel, sardines, walnuts, flaxseed oil, evening primrose oil, black currant oil.\n" +
                        "• No sugar or refined carbohydrates\n" +
                        "• Eliminate foods containing trans-fatty acids, hydrogenated oils (margarine, vegetable shortenings, imitation butter spreads, most commercial peanut butters), oxidized fats (deep fried foods, fast food, ghee, barbecued meats)\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"omega-3 and omega-6 fatty acids",diet_detail,"Food","Essential Fatty Acids (EFAs)")
            }
            "Obesity" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar, refined carbohydrates, caffeine and alcohol\n" +
                        "• Avoid aspartame (NutraSweet) - people who consume this eat more food\n" +
                        "• Eat high fiber diet"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Osteoarthritis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Reduce all fats to less than 20% of the diet, especially saturated fats (animal products)\n" +
                        "• Eat more vegetables, brown rice, and fish\n" +
                        "• Avoid sugar, refined foods, and all food additives\n" +
                        "• Avoid alcohol, coffee, and black tea\n" +
                        "• Avoid tomatoes, potatoes, eggplant, peppers, and tobacco (Solanacea family)\n" +
                        "• Avoid carbonated drinks and citrus\n"
                ss = SpannableString(diet_detail)
            }
            "Osteoporosis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Increase vegetables, especially the green leafy ones\n" +
                        "• Increase fruit, especially the blue-black berries\n" +
                        "• Decrease fat and animal products (decrease protein consumption to 1 gm. per 3.8 lbs.)\n" +
                        "• Decrease refined carbohydrate intake\n" +
                        "• Absolutely no carbonated beverages\n" +
                        "• Increase pH of blood by eating alkaline foods\n" +
                        "• Reduce intake of salt\n" +
                        "• Increase consumption of soy products"
                ss = SpannableString(diet_detail)
            }
            "Otitis Media" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods) (especially dairy products) - the most common allergens are: dairy products, eggs, wheat, potatoes, peanut butter, corn, and oranges\n" +
                        "• Avoid sugars, including sweetened juices (or at least dilute the juices several times the normal)\n" +
                        "• Eat very little food, mostly vegetable broth"
                ss = SpannableString(diet_detail)
            }
            "Ovarian Cancer" ->{
                diet_detail = "• Eat fresh, organic vegetables\n" +
                        "• Eat legumes\n" +
                        "• Avoid all dairy products\n" +
                        "• Avoid animal fats\n" +
                        "• Avoid tobacco, alcohol, coffee and sugar\n"
                ss = SpannableString(diet_detail)
            }
            "Painful Menses" ->{
                diet_detail = "• Increase complex carbohydrates to 60-70 % of total calories, including whole grains, legumes, fruits, vegetables and seeds and nuts such as ground raw flaxseed and pumpkin seed\n" +
                        "• Decrease fat, especially from arachidonic acid sources (animal products)\n" +
                        "• *Increase fiber\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Paralysis Agitans" ->{
                diet_detail = "• Decrease consumption of meats and fatty foods\n" +
                        "• Increase carbohydrate intake relative to proteins - eat more vegetables, fruits and grains\n" +
                        "• Increase caffeine (coffee, tea, etc.) - lowers incidence of Parkinson's Disease"
                ss = SpannableString(diet_detail)
            }
            "Parkinson's Disease" ->{
                diet_detail = "• Decrease consumption of meats and fatty foods\n" +
                        "• Increase carbohydrate intake relative to proteins - eat more vegetables, fruits and grains\n" +
                        "• Increase caffeine (coffee, tea, etc.) - lowers incidence of Parkinson's Disease\n"
                ss = SpannableString(diet_detail)
            }
            "Peptic Ulcers" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Drink only good (reverse-osmosis) water every day - this removes, among other things, chlorine which increases stomach acid\n" +
                        "• Increase dietary fiber to 30 - 45 grams per day if ulcer is duodenal\n" +
                        "• Avoid dairy products\n" +
                        "• Drink one quart of cabbage juice daily\n" +
                        "• Eat less protein\n" +
                        "• Eat smaller meals\n" +
                        "• Avoid spicy foods, sugar, alcohol, and caffeine"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "PMS" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined foods\n" +
                        "• Increase fiber in the diet to approx. 35 - 45 grams per day\n" +
                        "• Decrease salt intake to 3 grams (especially for PMS - H)\n" +
                        "• Decrease consumption of saturated fats, e.g., red meats and dairy products\n" +
                        "• Avoid/decrease caffeine consumption\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Premenstrual Syndrome" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined foods\n" +
                        "• Increase fiber in the diet to approx. 35 - 45 grams per day\n" +
                        "• Decrease salt intake to 3 grams (especially for PMS - H)\n" +
                        "• Decrease consumption of saturated fats, e.g., red meats and dairy products\n" +
                        "• Avoid/decrease caffeine consumption\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Psoriasis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and salt\n" +
                        "• Avoid foods that contain purine, i.e., meat and other high protein foods\n" +
                        "• Increase fiber in the diet, either by diet (whole grains, bran, fruit, etc.) or supplements\n" +
                        "• Avoid cAMP stimulators such as biotin, ginseng, and Vitamin C\n" +
                        "• Avoid cyclo-oxygenase inhibitors such as aspirin and NSAIDs\n" +
                        "• Eat lots of garlic (inhibits lipoxygenase)\n" +
                        "• Don't drink any alcohol (wine only if you must)\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
            }
            "Psoriatic Arthritis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid foods that contain purine, i.e., meat and other high protein foods and reduce all fats to less than 25% of the diet especially saturated fats (animal products)\n" +
                        "• Avoid tomatoes, potatoes, eggplant, peppers, and tobacco (all in the Solanacea family of plants)\n" +
                        "• Eat more vegetables, brown rice, and fish and increase fiber in the diet, either by diet (whole grains, bran, fruit, etc.) or supplements\n" +
                        "• Avoid cAMP stimulators such as biotin, ginseng, and Vitamin C\n" +
                        "• Avoid cyclo-oxygenase inhibitors such as aspirin and NSAIDs\n" +
                        "• Eat lots of garlic (inhibits lipoxygenase)\n" +
                        "• Avoid alcohol (wine only if you must), coffee, and black tea\n" +
                        "• Eat lots of fresh ginger (proven anti-inflammatory effect in arthritis)\n" +
                        "• Avoid refined foods and all food additives\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"ginger",diet_detail,"Botanicals","Zingiber officinale (Ginger)")
            }
            "Regional Enteritis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Avoid fast food restaurants\n" +
                        "• Reduce fat intake\n" +
                        "• Eat high fiber (after healing has occurred-use soluble fibers while healing) and high complex carbohydrate diet\n" +
                        "• Drink liquid diet in active phase, consisting of juices from cabbage and green leafy vegetables\n" +
                        "• Drink vegetable broths\n" +
                        "• Avoid caffeine and alcohol"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Rheumatoid Arthritis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Reduce all fats to less than 25% of the diet especially saturated fats (animal products)\n" +
                        "• Eat more vegetables, brown rice, and fish\n" +
                        "• Eat lots of fresh ginger (proven anti-inflammatory effect in RA)\n" +
                        "• Avoid refined foods and all food additives\n" +
                        "• Avoid alcohol, coffee, and black tea\n" +
                        "• Avoid tomatoes, potatoes, eggplant, peppers, and tobacco (all in the Solanacea family of plants)"
                ss = SpannableString(diet_detail)
                createLink(ss,"ginger",diet_detail,"Botanicals","Zingiber officinale (Ginger)")
            }
            "Rosacea" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid foods that cause vasodilation, including sugar, refined foods, coffee, alcohol, fats, spicy foods, etc."
                ss = SpannableString(diet_detail)
            }
            "Schizophrenia" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods) - the most common allergens associated with schizophrenia are: dairy products and wheat\n" +
                        "• Eliminate caffeine\n"
                ss = SpannableString(diet_detail)
            }
            "SLE" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Reduce animal fats\n" +
                        "• Avoid all dairy products\n" +
                        "• Avoid tomatoes, potatoes, eggplant, peppers, and tobacco (all in the Solanacea family of plants)\n" +
                        "• Avoid alfalfa in any form (herbal tea, sprouts, etc.)"
                ss = SpannableString(diet_detail)
            }
            "Sleep Disorder" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity, especially food additives (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid coffee and other caffeinated beverages"
                ss = SpannableString(diet_detail)
            }
            "Stress Incontinence" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid coffee and tea, even decaffeinated and carbonated beverages\n" +
                        "• Avoid eating citrus fruits and tomatoes\n" +
                        "• Eat dark green leafy vegetables\n"
                ss = SpannableString(diet_detail)
            }
            "Systemic Lupus Erythematosus" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Reduce animal fats\n" +
                        "• Avoid all dairy products\n" +
                        "• Avoid tomatoes, potatoes, eggplant, peppers, and tobacco (all in the Solanacea family of plants)\n" +
                        "• Avoid alfalfa in any form (herbal tea, sprouts, etc.)"
                ss = SpannableString(diet_detail)
            }
            "Ulcerative Colitis" ->{
                diet_detail = "• Avoid sugar and refined carbohydrates\n" +
                        "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Eat high fiber (after healing has occurred - use soluble fibers while healing) and high complex carbohydrate diet\n" +
                        "• Drink liquid diet in active phase, consisting of juices from cabbage and green leafy vegetables\n" +
                        "• Drink vegetable broths\n" +
                        "• Avoid dairy products\n" +
                        "• Avoid caffeine and alcohol"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Uterine Fibroids" ->{
                diet_detail = "• Avoid dairy products, animal fats, sugar, alcohol, salt, caffeine, refined foods, and wheat\n" +
                        "• Increase fiber\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
            }
            "Vaginal Yeast Infection" ->{
                diet_detail = "• Avoid simple carbohydrates, e.g., sugar, alcohol and fruit juice\n" +
                        "• *Cleansing diet for 14 - 21 days\n" +
                        "• Increase fiber in diet if bowel sluggishness/toxemia appears to be a problem\n" +
                        "• Eat lots of garlic (several cloves per day)\n" +
                        "• Avoid milk products and all refined foods (white flour, etc.)\n" +
                        "• Avoid all yeast products (fermented beverages, cakes, breads, many fruits, peanuts)\n" +
                        "• Avoid leftovers unless frozen (these contain a high level of fungus)\n"
                ss = SpannableString(diet_detail)
                createLink(ss,"fiber",diet_detail,"Food","Fiber")
                createLink(ss,"garlic",diet_detail,"Botanicals","Allium sativum (Garlic)")
                createLink(ss,"cleansing diet",diet_detail,"Food","Cleansing Diet")
            }
        }
        checkAllLinks(ss,diet_detail)
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

                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
            }

            "Adult Acne" -> {
                vitamin_detail = "• Vitamin A: 100,000-300,000 I.U. for 3 months\n" +
                        "• Vitamin B-Complex : take as directed on the bottle\n" +
                        "• Vitamin C : cream - take as directed on the bottle\n" +
                        "• Zinc: 30 - 60 mg.\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")

            }

            "Age-Related Macular Degeneration" -> {
                vitamin_detail = "• Vitamin C: 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Beta-Carotene: 200,000 I.U.\n" +
                        "• Zinc: 30 - 45 mg.\n" +
                        "• Selenium: 400 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoid)")

            }
            "Aging Prevention" -> {
                vitamin_detail = "• Beta Carotene: 150,000 I.U.\n" +
                        "• Vitamin A: 4,000-5,000 I.U.\n" +
                        "• Vitamin B12: 1,000 mcg. IM weekly\n" +
                        "• Vitamin C: 300-1,500 mg.\n" +
                        "• Vitamin D: 200-400 I.U.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin K: 750 mcg.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Calcium: 1200 mg.\n" +
                        "• Selenium: 200 - 300 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoid)")
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")

            }
            "AIDS" -> {
                vitamin_detail = "• Beta carotene: 150,000 I.U. TID\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly\n" +
                        "• Vitamin B-complex: take twice the recommended dosage\n" +
                        "• Vitamin C: 1 - 3 gm. TID (to bowel tolerance)\n" +
                        "• Vitamin E: 800 - 1600 I.U.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Selenium: 200 - 300 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Beta carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoid)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")

            }
            "Allergies" -> {
                vitamin_detail = "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly\n" +
                        "• Vitamin B-Complex: take as directed\n" +
                        "• Vitamin C: 6 - 10 gm.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Selenium: 250 - 400 mcg..\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Copper : 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")

            }
            "Alzheimer's Disease" -> {
                vitamin_detail = "• High-Potency Multiple Vitamin/Mineral Supplement\n" +
                        "• Vitamin B1: 1 - 3 gms.\n" +
                        "• Vitamin B12: 1,000 mcg. BID\n" +
                        "• Vitamin C: 50-1,000 mg. TID\n" +
                        "• Vitamin E: 40-800 I.U.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Choline: 250 mg.\n" +
                        "• Magnesium (Aspartate form): 400 - 800 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")

            }
            "Amenorrhea" -> {
                vitamin_detail = "• Vitamin A: 15,000 - 25,000 I.U.\n" +
                        "• Zinc: 50 mg.\n" +
                        "• *Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")

            }
            "Anorexia Nervosa" -> {
                vitamin_detail = "• Multivitamin/Mineral Supplement\n" +
                        "• Vitamin B6: 50 mg.\n" +
                        "• Vitamin B Complex: 1 ml. IM\n" +
                        "• *Vitamin B12: 1,000 mcg. IM\n" +
                        "• *Folate: 5 mg. IM\n" +
                        "• Calcium: 1200 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• *Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"*Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"*Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"*Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")

            }
            "Aphthous Stomatitis" -> {
                vitamin_detail = "• Vitamin C: 1 - 3 gm.\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly (if deficient)\n" +
                        "• Folate: 2 mg. if deficient\n" +
                        "• Zinc: 30 mg.\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Iron: if deficient"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")

            }
            "Arthritis, Gout" -> {
                vitamin_detail = "• Vitamin C: 1 gm. 3 times a day - start with 500 mg. 3 times a day for 1 week, then increase until 1 gm. 3 times a day is reached\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folic Acid: 25-50 mg. 3 times a day with vitamin C"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Folic Acid",vitamin_detail,"Vitamin","Folate (Folic Acid)")


            }
            "Arthritis, Osteo" -> {
                vitamin_detail = "• Vitamin A: 10,000 I.U.\n" +
                        "• Niacinamide: 500 mg. QID (check liver enzymes regularly)\n" +
                        "• Vitamin B5: 500 mg. BID - QID\n" +
                        "• Vitamin B6: 100 mg. TID (for menopausal arthritis)\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly, with folic acid\n" +
                        "• Vitamin C (buffered - reduce if joint pain increases): 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Boron: 3 mg.\n" +
                        "• Zinc: 45 mg.\n" +
                        "• Copper (Salicylate form): 64 mg. BID\n" +
                        "• Magnesium: 300 mg.\n" +
                        "• Calcium: 300 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")


            }
            "Arthritis, Psoriatic" -> {
                vitamin_detail = "• Vitamin A: 50,000 I.U.\n" +
                        "• Niacinamide: 500 mg. QID (check liver enzymes regularly)\n" +
                        "• Vitamin B5: 500 mg. QID\n" +
                        "• Vitamin B12: 1,000 cc weekly\n" +
                        "• Vitamin D: 200 - 400 I.U.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin K: 50 - 100 mg. TID\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Zinc: 30 mg. BID - TID\n" +
                        "• Copper: 64 mg. BID\n" +
                        "• Manganese: 15 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")


            }
            "Arthritis, Rheumatoid" -> {
                vitamin_detail = "• Niacinamide: 500 mg. QID (check liver enzymes regularly)\n" +
                        "• Vitamin B5: 500 mg. QID\n" +
                        "• Vitamin C (buffered - reduce if joint pain increases): 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin K: 50 - 100 mg. TID\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Zinc: 30 mg. BID - TID\n" +
                        "• Copper (salicylate form): 64 mg. BID\n" +
                        "• Manganese: 15 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")


            }
            "Asthma" -> {
                vitamin_detail = "• Beta-Carotene: 100,000 I.U.\n" +
                        "• Vitamin B6: 50 - 200 mg.\n" +
                        "• Vitamin B12: 1,000 mcg. daily IM\n" +
                        "• Vitamin C: to bowel tolerance (usually 5 - 15 gm.)\n" +
                        "• Magnesium: 125 - 500 mg.\n" +
                        "• Molybdenum: 1 - 3 mg.\n" +
                        "• Selenium: 250 - 400 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")

            }
            "Atherosclerosis" -> {
                vitamin_detail = "• Beta-Carotene: 100,000 I.U.\n" +
                        "• Vitamin B3 (Niacin): 30 - 1500 mg. TID in divided doses (increase slowly from 200 mg.) Do not use the time released form of niacin for atherosclerosis\n" +
                        "• Vitamin B5: 600 - 1200 mg.\n" +
                        "• Vitamin B6: 50 mg.\n" +
                        "• Folate: 5 - 10 mg.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 800 - 1600 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Manganese: 5 - 20 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Magnesium (Aspartate form): 500 - 800 mg.\n" +
                        "• Silicon, and other trace minerals\n" +
                        "• Chromium Aspartate: 200 - 500 mcg. (can use brewers yeast)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")


            }
            "Atopic Dermatitis" -> {
                vitamin_detail = "• Vitamin A: 50,000 I.U.\n" +
                        "• Vitamin C: 3 - 6 gm.\n" +
                        "• Vitamin E: 400 I.U.\n" +
                        "• Selenium: 250 - 400 mcg.\n" +
                        "• Zinc: 30 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")



            }
            "Attention Deficit Disorder" -> {
                vitamin_detail = "• Niacinamide: 1 - 3 gm.\n" +
                        "• Vitamin B6: 20 - 30 mg./kg.\n" +
                        "• Vitamin C: 3 gm. (for chelating heavy metals)\n" +
                        "• Zinc: 30 mg.\n" +
                        "• *Calcium: 1 gm.\n" +
                        "• Magnesium: 500 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")



            }
            "Autism" -> {
                vitamin_detail = "• Vitamin B6: 100-200 mg.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Vitamin C: 1 - 3 gm. in divided doses\n" +
                        "• Magnesium (Aspartate form): 500-2000 mg.\n" +
                        "• Calcium: 500-2000 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
            }

            "Benign Prostatic Hypertrophy" ->{
                vitamin_detail = "• Vitamin D3: 200-400 I.U.\n" +
                        "• *Vitamin E: 800 - 1200 I.U.\n" +
                        "• Zinc: 45 - 90 mg.\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Magnesium: 400 mg.\n" +
                        "• Selenium: 200 - 300 mcg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")


            }
            "Bipolar Disorder" ->{
                vitamin_detail = "• Vitamin B6: 100-200 mg. (necessary to convert phenylalanine to phenylethylamine)\n" +
                        "• Vitamin B12: 300-600 mcg.\n" +
                        "• Vitamin C: 1 - 3 gm. in divided doses\n" +
                        "• Folate: 200 mcg.\n" +
                        "• Choline (phosphatidyl form): 10-30 gm. in divided doses\n" +
                        "• Lithium carbonate: start with 300 mg. QID for 7 days, then draw serum levels, increase until reaching therapeutic range: 1200 -1800 mg/d with serum level of 0.6-1.5 meq.\n" +
                        "• Potassium chloride: 1.9 - 5.6 gm. (may eliminate adverse side effects of lithium)\n"
                ss = SpannableString(vitamin_detail)

                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")


            }
            "Bladder Infection" ->{
                vitamin_detail = "• Vitamin A: 25,000 - 50,000 I.U.\n" +
                        "• Vitamin C: 5 - 10 gm. (to bowel tolerance)\n" +
                        "• Vitamin E: 600 I.U.\n" +
                        "• Folate: 1.8 mg. (for patients with uric acid stones)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")


            }
            "Blood Pressure, High" ->{
                vitamin_detail = "• Vitamin B6: 20 - 60 mg.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 200 - 400 I.U.\n" +
                        "• Magnesium: 400 - 800 mg.\n" +
                        "• Calcium: 800 - 1000 mg.\n" +
                        "• Potassium: 4 gm. (this amount may cause stomach upset; eat potassium-containing foods instead, e.g. bananas and oranges)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")


            }
            "BPH" ->{
                vitamin_detail = "• Vitamin D3: 200-400 I.U.\n" +
                        "• *Vitamin E: 800 - 1200 I.U.\n" +
                        "• Zinc: 45 - 90 mg.\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Magnesium: 400 mg.\n" +
                        "• Selenium: 200 - 300 mcg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")


            }
            "Bronchitis" ->{
                vitamin_detail = "• Vitamin A: 25,000 I.U. BID\n" +
                        "• Beta-Carotene: 200,000 I.U.\n" +
                        "• Vitamin C: 2 gm. QID\n" +
                        "• Vitamin E: 400 I.U. BID\n" +
                        "• Zinc: 30 mg. BID\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Selenium: 200 - 300 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")


            }
            "Cancer Prevention" ->{
                vitamin_detail = "• Most Cancers:\n" +
                        "• Beta-Carotene: 200,000 I.U.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin D: 400 - 800 I.U.\n" +
                        "• Folic Acid: 1 - 2 mg.\n" +
                        "• Zinc: 30 - 45 mg.\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Selenium: 400 mcg.\n" +
                        "• Calcium: 1000 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")


            }
            "Candida Infection" ->{
                vitamin_detail = "• Vitamin A: 25,000 - 50,000 I.U.\n" +
                        "• Vitamin C: to bowel tolerance (usually 5 - 15 gm.)\n" +
                        "• Biotin: 500 mcg. BID\n" +
                        "• Zinc: 45 mg.\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Iron: 45 mg.\n" +
                        "• Selenium: 200 - 300 mcg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")


            }
            "Candidiasis" ->{
                vitamin_detail = "• Vitamin A: 25,000 - 50,000 I.U.\n" +
                        "• Vitamin C: to bowel tolerance (usually 5 - 15 gm.)\n" +
                        "Biotin: 500 mcg. BID\n" +
                        "Zinc: 45 mg.\n" +
                        "Copper: 2 - 4 mg.\n" +
                        "Iron: 45 mg.\n" +
                        "Selenium: 200 - 300 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "Canker Sores" ->{
                vitamin_detail = "• Vitamin C: 1 - 3 gm.\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly (if deficient)\n" +
                        "• Folate: 2 mg. if deficient\n" +
                        "• Zinc: 30 mg.\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Iron: if deficient"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "Cataract Prevention" ->{
                vitamin_detail = "• Vitamin B1: 100 mg.\n" +
                        "• Vitamin C: 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Beta-Carotene: 200,000 I.U.\n" +
                        "• Zinc: 30 - 45 mg.\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Selenium: 400 mcg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "CFS/CFIDS" ->{
                vitamin_detail = "• Beta-Carotene: 15,000 I.U.\n" +
                        "• Vitamin B5: 1 - 2 gm.\n" +
                        "• Folate: 2 - 5 mg.\n" +
                        "• Vitamin B12: IM 1,000 - 3,000 mcg. weekly (mix with injectable B-complex vitamins)\n" +
                        "• Vitamin C: 3 - 6 gm.\n" +
                        "• Vitamin E: 2,000 - 2,400 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Magnesium: IM 1 gm. weekly for 6 weeks"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "CHF" ->{
                diet_detail = "• Vitamin B-Complex: (with at least 200 mg. Vitamin B1)\n" +
                        "Vitamin D: 400 I.U.\n" +
                        "Vitamin C: 100-1,000 mg. in divided doses\n" +
                        "Vitamin E: 400 - 1200 I.U.\n" +
                        "Magnesium: 500 mg.\n" +
                        "Calcium (Citrate form): 1 gm.\n" +
                        "Potassium: 100 - 500 mg."
                ss = SpannableString(diet_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "Cholecystitis" ->{
                vitamin_detail = "• Vitamin A: 10,000 I.U.\n" +
                        "Vitamin C: 1 - 2 gm.\n" +
                        "Vitamin E: 400 - 800 I.U.\n" +
                        "Choline: 1 gm."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "Cholelithiasis" ->{
                vitamin_detail = "• Vitamin C: 1 - 2 gm.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Choline: 100 mg. TID\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")


            }
            "Chronic Fatigue Syndrome" ->{
                vitamin_detail = "• Beta-Carotene: 15,000 I.U.\n" +
                        "• Vitamin B5: 1 - 2 gm.\n" +
                        "• Folate: 2 - 5 mg.\n" +
                        "• Vitamin B12: IM 1,000 - 3,000 mcg. weekly (mix with injectable B-complex vitamins)\n" +
                        "• Vitamin C: 3 - 6 gm.\n" +
                        "• Vitamin E: 2,000 - 2,400 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Magnesium: IM 1 gm. weekly for 6 weeks"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "Colitis" ->{
                vitamin_detail = "• Vitamin A: 50,000 - 75,000 I.U. initially, then taper\n" +
                        "• Vitamin C (buffered): 1 - 2 gm.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folate: 20 - 50 mg.\n" +
                        "• Zinc: 30 mg. BID\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Calcium: 500 mg. BID\n" +
                        "• Magnesium: 500 mg. BID"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "Congestive Heart Failure" ->{
                vitamin_detail = "• Vitamin B-Complex: (with at least 200 mg. Vitamin B1)\n" +
                        "• Vitamin D: 400 I.U.\n" +
                        "• Vitamin C: 100-1,000 mg. in divided doses\n" +
                        "• Vitamin E: 400 - 1200 I.U.\n" +
                        "• Magnesium: 500 mg.\n" +
                        "• Calcium (Citrate form): 1 gm.\n" +
                        "• Potassium: 100 - 500 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "Constipation" ->{
                vitamin_detail = "• Vitamin B5: 250 mg.\n" +
                        "• Folic Acid: 20 - 60 mg. (if deficient)\n" +
                        "• Magnesium: 600 - 900 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folic Acid",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")


            }
            "Crohn's Disease" ->{
                vitamin_detail = "• Vitamin A: 50,000 - 75,000 I.U. initially, then taper\n" +
                        "• Hydroxycobalamin: IM 1,000 mcg. weekly\n" +
                        "• Vitamin C (buffered): 1 - 2 gm.\n" +
                        "• Vitamin D: 200 - 400 I.U.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folate: 20 - 50 mg.\n" +
                        "• Zinc: 30 mg. BID\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Selenium: 200 - 400 mcg.\n" +
                        "• Magnesium: 500 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")


            }
            "Cystitis" ->{
                vitamin_detail = "• Vitamin A: 25,000 - 50,000 I.U.\n" +
                        "• Vitamin C: 5 - 10 gm. (to bowel tolerance)\n" +
                        "• Vitamin E: 600 I.U.\n" +
                        "• Folate: 1.8 mg. (for patients with uric acid stones)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")


            }
            "Depression" ->{
                vitamin_detail = "• Vitamin B6: 100 mg. TID\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. IM daily to weekly, with folic acid\n" +
                        "• Vitamin B-Complex: 50 times the RDA\n" +
                        "• Folate: 400 mg.\n" +
                        "• Inositol: 500 mg.\n" +
                        "• Magnesium: 500 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")


            }
            "Diabetes Mellitus" ->{
                vitamin_detail = "• Vitamin B1: 100 mg.\n" +
                        "• Vitamin C: 2 - 4 gm.\n" +
                        "• Vitamin D: 400 - 800 I.U.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Vitamin B3: 30 - 100 mg.\n" +
                        "• Niacinamide: 50 - 300 mg.\n" +
                        "• Vitamin B6: 25 -150 mg.\n" +
                        "• Biotin: 3 - 20 mg.\n" +
                        "• Chromium (GTF): 200 - 3000 mcg.\n" +
                        "• Zinc: 20 - 60 mg.\n" +
                        "• Copper: 2 - 3 mg.\n" +
                        "• Magnesium: 500 mg.\n" +
                        "• Calcium: 500 mg.\n" +
                        "• Manganese: 10 - 50 mg.\n" +
                        "• Potassium: 3 gm.\n" +
                        "• Vanadium: 100 mcg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium (GTF)",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Vanadium",vitamin_detail,"Vitamin","Vanadium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")


            }
            "Dysmenorrhea" ->{
                vitamin_detail = "• Vitamin B-Complex: take as directed\n" +
                        "• Vitamin B3: 100 mg. every 2 hours during cramping\n" +
                        "• Vitamin B6: 50 - 200 mg., increasing dosage during premenstrual phase\n" +
                        "• Vitamin C: 100 mg. every 2 hours during cramping (enhances vitamin B3)\n" +
                        "• Vitamin E: 1200 I.U.\n" +
                        "• Magnesium: 500 - 800 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }

            "Ear Infection" ->{
                vitamin_detail = "• Vitamin A: 10,000 - 40,000 I.U.\n" +
                        "• Vitamin C: 1 - 2 gm. TID\n" +
                        "• Beta Carotene: 10,000-100,000 I.U.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Beta Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Eczema, Chronic" ->{
                vitamin_detail = "• Vitamin A: 50,000 I.U.\n" +
                        "• Vitamin C: 3 - 6 gm.\n" +
                        "• Vitamin E: 400 I.U.\n" +
                        "• Selenium: 250 - 400 mcg.\n" +
                        "• Zinc: 30 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }

            "Endometriosis" ->{
                vitamin_detail = "• Vitamin C: 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Magnesium: (citrate, aspartate) 100 mg. and Vitamin B6 100 mg. both taken together every 2 hours for acute treatment of pain\n" +
                        "• *Choline: (bitartrate) 300 mg. (as a lipotropic factor)\n" +
                        "• *Inositol: 150 mg. (as a lipotropic factor)\n" +
                        "• *Folic Acid: 100 mcg. (as a lipotropic factor)\n" +
                        "• *Vitamin B12: 10 mcg. (as a lipotropic factor)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folic Acid",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }

            "Erectile Dysfunction" ->{
                vitamin_detail = "• High-Potency Multivitamin/Mineral Supplement\n" +
                        "• Vitamin C: 500 - 1000 mg. TID\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Inositol Hexaniacinate: 1000 - 3000 mg.\n" +
                        "• Zinc: 30 - 45 mg. daily\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol Hexaniacinate",vitamin_detail,"Vitamin","Vitamin B3(Niacin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }

            "Fertility" ->{
                vitamin_detail = "   Female:\n" +
                        "• Vitamin B12: 1,000 mcg. daily\n" +
                        "• Folate: 5 mg. TID\n" +
                        "• Vitamin C: 200 - 1000 mg. in divided doses (this has been successful when used with with Clomiphene)\n" +
                        "• Iron: supplement according to deficiency as indicated by ferritin levels\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "   Male:\n" +
                        "• Vitamin B12: 1,000 mcg. daily\n" +
                        "• Vitamin C: 200 - 1000 mg. in divided doses\n" +
                        "• Vitamin E: 400 - 800 I.U. (best used in a full spectrum Antioxidant Formula)\n" +
                        "• Selenium: 100 - 250 mcg.\n" +
                        "• Zinc: 30 - 150 mg. in divided doses\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Fibrocystic Breast Disease" ->{
                vitamin_detail = "• Beta Carotene: 50 - 300,000 I.U.\n" +
                        "• Vitamin C: 2 - 5 gm.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin B-Complex: 5 - 10 times the normal daily dose\n" +
                        "• Vitamin B6: 200 mg.\n" +
                        "• Iodine (SSKI): 6 - 8 drops (cut back after 2 weeks to 2 - 4 drops)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Iodine (SSKI)",vitamin_detail,"Vitamin","Iodine")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }

            "Fibromyalgia" ->{
                vitamin_detail = "• Vitamin C: 3 - 6 gm.\n" +
                        "• Vitamin E: 2,000 - 24,000 I.U.\n" +
                        "• Vitamin B6: 50 mg.\n" +
                        "• Vitamin B-Complex: take as directed on bottle\n" +
                        "• Folate: 2 - 5 mg.\n" +
                        "• Vitamin D: 200 - 400 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Calcium: 1200 mg.\n" +
                        "• Magnesium: 600 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Gallbladder Disease" ->{
                vitamin_detail = "• Vitamin A: 10,000 I.U.\n" +
                        "• Vitamin C: 1 - 2 gm.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Choline: 1 gm."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")


            }
            "Gallstones" ->{
                vitamin_detail = "• Vitamin C: 1 - 2 gm.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Choline: 100 mg. TID"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
            }
            "Gout" ->{
                vitamin_detail = "• Vitamin C: 1 gm. 3 times a day - start with 500 mg. 3 times a day for 1 week, then increase until 1 gm. 3 times a day is reached\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folic Acid: 25-50 mg. 3 times a day with vitamin C"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Folic Acid",vitamin_detail,"Vitamin","Folic Acid")
            }
            "Headache, General" ->{
                vitamin_detail = "• Vitamin B2: 60 mg.\n" +
                        "• Vitamin B6: 25 mg. TID\n" +
                        "• Vitamin C: 2 - 8 gm. in divided doses\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Niacinamide: 500 mg.\n" +
                        "• Magnesium: 400 mg. TID\n" +
                        "• Calcium: 600 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Headache, Migraine" ->{
                vitamin_detail = "• Vitamin B2: 400 mg.\n" +
                        "• Vitamin B12: 1000 mcg. once a week IM\n" +
                        "• Magnesium: 300-600 mg. in divided dose"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Hemorrhoids" ->{
                vitamin_detail = "• Vitamin A: 25,000 I.U.\n" +
                        "• Vitamin C: 2 - 5 gm.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin B-Complex: take vitamin complex according to B6 dosage -100 mg.\n" +
                        "• Choline: 1 gm.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Zinc: 45 mg.\n" +
                        "• Copper: 2 - 4 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Hepatitis" ->{
                vitamin_detail = "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly, with folic acid for alcoholic hepatitis, chronic active hepatitis and viral hepatitis\n" +
                        "• Vitamin C: 1 - 3 gm. TID - hepatitis A and serum hepatitis\n" +
                        "• Vitamin E: 800 - 1600 I.U. for chronic hepatitis\n" +
                        "• Zinc: 30 - 45 mg.\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Selenium: 200 - 300 mcg. - for hepatitis B, viral hepatitis"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Herpes Simplex" ->{
                vitamin_detail = "• Vitamin B12: 2,000 mcg. every other day during outbreaks\n" +
                        "• Vitamin B-Complex with 100 mg. of Vitamin B6\n" +
                        "• Vitamin C: 1 - 3 gm. TID (to bowel tolerance)\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Zinc: 25 mg.\n" +
                        "• Copper: 2 mg.\n" +
                        "• Lithium Succinate: Topically\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Lithium Succinate",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "High Blood Pressure" ->{
                vitamin_detail = "• Vitamin B6: 20 - 60 mg.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 200 - 400 I.U.\n" +
                        "• Magnesium: 400 - 800 mg.\n" +
                        "• Calcium: 800 - 1000 mg.\n" +
                        "• Potassium: 4 gm. (this amount may cause stomach upset; eat potassium-containing foods instead, e.g. bananas and oranges)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "High Cholesterol" ->{
                vitamin_detail = "• Beta-Carotene: 100,000 I.U.\n" +
                        "• Vitamin B3 (Niacin): 30 - 400 mg. TID in divided doses (increase slowly from 200 mg.) Do not use the time released form of niacin for Hypercholesterolemia\n" +
                        "• Vitamin B5: 600 - 1200 mg.\n" +
                        "• Vitamin B6: 50 mg.\n" +
                        "• Folate: 5 - 10 mg.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 800 - 1600 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Manganese: 5 - 20 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Magnesium (Aspartate form): 500 - 800 mg.\n" +
                        "• Chromium Aspartate: 200 - 500 mcg. (can use brewers yeast)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3 (Niacin)",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "HIV" ->{
                vitamin_detail = "• Beta carotene: 150,000 I.U. TID\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly\n" +
                        "• Vitamin B-complex: take twice the recommended dosage\n" +
                        "• Vitamin C: 1 - 3 gm. TID (to bowel tolerance)\n" +
                        "• Vitamin E: 800 - 1600 I.U.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Selenium: 200 - 300 mcg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Hyperactivity" ->{
                vitamin_detail = "• Niacinamide: 1 - 3 gm.\n" +
                        "• Vitamin B6: 20 - 30 mg./kg.\n" +
                        "• Vitamin C: 3 gm. (for chelating heavy metals)\n" +
                        "• Zinc: 30 mg.\n" +
                        "• *Calcium: 1 gm.\n" +
                        "• Magnesium: 500 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3 (Niacin)",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Caroteniods)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Hypercholesterolemia" ->{
                vitamin_detail = "• Beta-Carotene: 100,000 I.U.\n" +
                        "• Vitamin B3 (Niacin): 30 - 400 mg. TID in divided doses (increase slowly from 200 mg.) Do not use the time released form of niacin for Hypercholesterolemia\n" +
                        "• Vitamin B5: 600 - 1200 mg.\n" +
                        "• Vitamin B6: 50 mg.\n" +
                        "• Folate: 5 - 10 mg.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 800 - 1600 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Manganese: 5 - 20 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Magnesium (Aspartate form): 500 - 800 mg.\n" +
                        "• Chromium Aspartate: 200 - 500 mcg. (can use brewers yeast)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Caroteniods)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Hypertension" ->{
                vitamin_detail = "• Vitamin B6: 20 - 60 mg.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 200 - 400 I.U.\n" +
                        "• Magnesium: 400 - 800 mg.\n" +
                        "• Calcium: 800 - 1000 mg.\n" +
                        "• Potassium: 4 gm. (this amount may cause stomach upset; eat potassium-containing foods instead, e.g. bananas and oranges)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Hypothyroid" ->{
                vitamin_detail = "• Vitamin A: 25,000 I.U.\n" +
                        "• Vitamin C: 1 - 4 gm.\n" +
                        "• Vitamin E: 400 I.U.\n" +
                        "• Vitamin B3: 25 - 50 mg.\n" +
                        "• Vitamin B6: 25 - 50 mg.\n" +
                        "• Vitamin B2: 15 mg.\n" +
                        "• Zinc: 30 - 40 mg.\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "IBS" ->{
                vitamin_detail = "• Vitamin A: 50,000 - 75,000 I.U. initially, then taper\n" +
                        "• Vitamin C (buffered): 1 - 2 gm.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folate: 20 - 50 mg.\n" +
                        "• Zinc: 30 mg. BID\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Calcium: 500 mg. BID\n" +
                        "• Magnesium: 500 mg. BID\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Impotence" ->{
                vitamin_detail = "• High-Potency Multivitamin/Mineral Supplement\n" +
                        "• Vitamin C: 500 - 1000 mg. TID\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Inositol Hexaniacinate: 1000 - 3000 mg.\n" +
                        "• Zinc: 30 - 45 mg. daily\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Inositol Hexaniacinate",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Incontinence, Stress" ->{
                vitamin_detail = "• Vitamin C: 1 gm TID\n" +
                        "• Vitamin B12: 1000 mcg. daily or 1 cc IM 3 times a week (especially for geriatric patients)\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
            }
            "Infertility" ->{
                vitamin_detail = "  Female:\n" +
                        "• Vitamin B12: 1,000 mcg. daily\n" +
                        "• Folate: 5 mg. TID\n" +
                        "• Vitamin C: 200 - 1000 mg. in divided doses (this has been successful when used with with Clomiphene)\n" +
                        "• Iron: supplement according to deficiency as indicated by ferritin levels\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "   Male:\n" +
                        "• Vitamin B12: 1,000 mcg. daily\n" +
                        "• Vitamin C: 200 - 1000 mg. in divided doses\n" +
                        "• Vitamin E: 400 - 800 I.U. (best used in a full spectrum Antioxidant Formula)\n" +
                        "• Selenium: 100 - 250 mcg.\n" +
                        "• Zinc: 30 - 150 mg. in divided doses\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Insomnia" ->{
                vitamin_detail = "• Vitamin B1: 20-40 mg.\n" +
                        "• Vitamin B12: 300-600 mcg.\n" +
                        "• Magnesium (Aspartate form): 1000 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Irritable Bowel Syndrome" ->{
                vitamin_detail = "• Vitamin A: 50,000 - 75,000 I.U. initially, then taper\n" +
                        "• Vitamin C (buffered): 1 - 2 gm.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folate: 20 - 50 mg.\n" +
                        "• Zinc: 30 mg. BID\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Calcium: 500 mg. BID\n" +
                        "• Magnesium: 500 mg. BID\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Longevity" ->{
                vitamin_detail = "• Beta Carotene: 150,000 I.U.\n" +
                        "• Vitamin A: 4,000-5,000 I.U.\n" +
                        "• Vitamin B12: 1,000 mcg. IM weekly\n" +
                        "• Vitamin C: 300-1,500 mg.\n" +
                        "• Vitamin D: 200-400 I.U.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin K: 750 mcg.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Calcium: 1200 mg.\n" +
                        "• Selenium: 200 - 300 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Beta Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")


            }
            "Lupus" ->{
                vitamin_detail = "• Beta-Carotene: 90,000 I.U.\n" +
                        "• Vitamin A: 10,000 I.U.\n" +
                        "• Vitamin B12: 1,000 mcg. IM twice weekly\n" +
                        "• Vitamin C: 1-3 gm.\n" +
                        "• Vitamin E: 1200-1600 I.U. daily - can also be applied directly to skin lesions\n" +
                        "• Vitamin K (Phytonadione): 1 mg.\n" +
                        "• Magnesium: 500-1000 mg.\n" +
                        "• Zinc: 30-50 mg.\n" +
                        "• Selenium: 200-300 mcg.\n" +
                        "• Copper: 2-4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K (Phytonadione)",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")




            }
            "Macular Degeneration" ->{
                vitamin_detail = "• Vitamin C: 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Beta-Carotene: 200,000 I.U.\n" +
                        "• Zinc: 30 - 45 mg.\n" +
                        "• Selenium: 400 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Manic Depressive Disorder" ->{
                vitamin_detail = "• Vitamin B6: 100-200 mg. (necessary to convert phenylalanine to phenylethylamine)\n" +
                        "• Vitamin B12: 300-600 mcg.\n" +
                        "• Vitamin C: 1 - 3 gm. in divided doses\n" +
                        "• Folate: 200 mcg.\n" +
                        "• Choline (phosphatidyl form): 10-30 gm. in divided doses\n" +
                        "• Lithium carbonate: start with 300 mg. QID for 7 days, then draw serum levels, increase until reaching therapeutic range: 1200 -1800 mg/d with serum level of 0.6-1.5 meq.\n" +
                        "• Potassium chloride: 1.9 - 5.6 gm. (may eliminate adverse side effects of lithium)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Mastitis" ->{
                vitamin_detail = "• Vitamin A: 100,000 I.U.\n" +
                        "• Vitamin C: 1-2 gm. 3 times per day\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Selenium: 200-300 mcg.\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Copper: 2-4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Memory Loss" ->{
                vitamin_detail = "• Vitamin B1 (Thiamine): 15-30 mg.\n" +
                        "• Vitamin B6: 20 - 50 mg.\n" +
                        "• Vitamin B12: 1000 mcg. once a week IM\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Choline: 250 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1 (Thiamine)",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Menopause" ->{
                vitamin_detail = "• Vitamin B-Complex: take as directed on the bottle\n" +
                        "• Vitamin B6: 150 mg.\n" +
                        "• Vitamin C: 1 - 5 gm.\n" +
                        "• Vitamin D: 200 - 400 I.U.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Calcium (Citrate form): 600 -1200 mg.\n" +
                        "• Magnesium: 400 - 800 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Migraine Headache" ->{
                vitamin_detail = "• Vitamin B2: 400 mg.\n" +
                        "• Vitamin B12: 1000 mcg. once a week IM\n" +
                        "• Magnesium: 300-600 mg. in divided dose"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Mouth Ulcers" ->{
                vitamin_detail = "• Vitamin C: 1 - 3 gm.\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly (if deficient)\n" +
                        "• Folate: 2 mg. if deficient\n" +
                        "• Zinc: 30 mg.\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Iron: if deficient"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Multiple Sclerosis" ->{
                vitamin_detail = "• Vitamin C: 6 - 10 gm. to bowel tolerance\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Vitamin B1: 100 mg. (optic neuritis)\n" +
                        "• Vitamin B6: 100 mg.\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly, with folic acid\n" +
                        "• Vitamin B-Complex: take as directed on bottle\n" +
                        "• Vitamin D: 800 - 1600 I.U.\n" +
                        "• Choline: 10 mg. BID\n" +
                        "• Biotin: 1 mg.\n" +
                        "• Calcium: 1000 mg.\n" +
                        "• Magnesium: 50 - 1000 mg.\n" +
                        "• Zinc: 20 - 100 mg.\n" +
                        "• Selenium: 200 mcg..\n" +
                        "• Copper: 1 - 2 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }

            "Obesity" ->{
                vitamin_detail = "• Vitamin C: 1 gm. TID\n" +
                        "• Calcium (Citrate form): 600 -1200 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Osteoarthritis" ->{
                vitamin_detail = "• Vitamin A: 10,000 I.U.\n" +
                        "• Niacinamide: 500 mg. QID (check liver enzymes regularly)\n" +
                        "• Vitamin B5: 500 mg. BID - QID\n" +
                        "• Vitamin B6: 100 mg. TID (for menopausal arthritis)\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly, with folic acid\n" +
                        "• Vitamin C (buffered - reduce if joint pain increases): 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Boron: 3 mg.\n" +
                        "• Zinc: 45 mg.\n" +
                        "• Copper (Salicylate form): 64 mg. BID\n" +
                        "• Magnesium: 300 mg.\n" +
                        "• Calcium: 300 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Osteoporosis" ->{
                vitamin_detail = "• Vitamin B6: 5 - 50 mg.\n" +
                        "• Vitamin B12: 1 cc IM 1/wk\n" +
                        "• Vitamin C: 3 - 6 gm.\n" +
                        "• Vitamin D: 200 - 400 I.U.\n" +
                        "• Vitamin K (Phytonadione): 1 mg.\n" +
                        "• Folate: 5 mg.\n" +
                        "• Calcium (Citrate form): 600 -1200 mg.\n" +
                        "• Magnesium: 400 - 800 mg.\n" +
                        "• Zinc: 10 - 30 mg.\n" +
                        "• Copper: 1 - 2 mg.\n" +
                        "• Manganese: 5 - 20 mg.\n" +
                        "• Boron: 0.5 - 3 mg.\n" +
                        "• Silicon: 1 - 2 mg.\n" +
                        "• Strontium: 0.5 - 6 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K (Phytonadione)",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Strontium",vitamin_detail,"Vitamin","Strontium")


            }
            "Otitis Media" ->{
                vitamin_detail = "• Vitamin A: 10,000 - 40,000 I.U.\n" +
                        "• Vitamin C: 1 - 2 gm. TID\n" +
                        "• Beta Carotene: 10,000-100,000 I.U.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Ovarian Cancer" ->{
                vitamin_detail = "• Beta Carotene: 25,000 I.U. TID\n" +
                        "• Vitamin A: 10,000 I.U. TID\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin D: 200 I.U. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Selenium: 300 mcg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Painful Menses" ->{
                vitamin_detail = "• Vitamin B-Complex: take as directed\n" +
                        "• Vitamin B3: 100 mg. every 2 hours during cramping\n" +
                        "• Vitamin B6: 50 - 200 mg., increasing dosage during premenstrual phase\n" +
                        "• Vitamin C: 100 mg. every 2 hours during cramping (enhances vitamin B3)\n" +
                        "• Vitamin E: 1200 I.U.\n" +
                        "• Magnesium: 500 - 800 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Paralysis Agitans" ->{
                vitamin_detail = "• Vitamin C: 1 - 2 gm. TID (to bowel tolerance)\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin B6: 50-100 mg. daily\n" +
                        "• Vitamin B12: 1,000 mcg. IM daily\n" +
                        "• Folate: 2 - 5 mg.\n" +
                        "• Choline: 1 gm.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Magnesium: 800 - 1200 mg.\n" +
                        "• Calcium: 800 - 1200 mg.\n" +
                        "• Selenium: 200 - 300 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Parkinson's Disease" ->{
                vitamin_detail = "• Vitamin C: 1 - 2 gm. TID (to bowel tolerance)\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin B6: 50-100 mg. daily\n" +
                        "• Vitamin B12: 1,000 mcg. IM daily\n" +
                        "• Folate: 2 - 5 mg.\n" +
                        "• Choline: 1 gm.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Magnesium: 800 - 1200 mg.\n" +
                        "• Calcium: 800 - 1200 mg.\n" +
                        "• Selenium: 200 - 300 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Peptic Ulcers" ->{
                vitamin_detail = "• Vitamin A: 20,000 I.U. TID\n" +
                        "• Vitamin B12 (especially if taking Cimetidine): 1,000 mcg. IM every week\n" +
                        "• Vitamin C (buffered): 2 - 4 gm.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Selenium: 200 mcg.\n" +
                        "• Copper: 2 - 4 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "PMS" ->{
                vitamin_detail = "• Vitamin A: 15,000 - 25,000 I.U.\n" +
                        "• Vitamin B6: 100 mg. TID (each day from 2 weeks before period)\n" +
                        "• Vitamin C: 3 - 6 gm.\n" +
                        "• Vitamin E: 400 - 600 I.U.\n" +
                        "• Magnesium (Aspartate form): 400 - 800 mg.\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Calcium: 1 gm.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Copper: 2 - 4 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Premenstrual Syndrome" ->{
                vitamin_detail = "• Vitamin A: 15,000 - 25,000 I.U.\n" +
                        "• Vitamin B6: 100 mg. TID (each day from 2 weeks before period)\n" +
                        "• Vitamin C: 3 - 6 gm.\n" +
                        "• Vitamin E: 400 - 600 I.U.\n" +
                        "• Magnesium (Aspartate form): 400 - 800 mg.\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Calcium: 1 gm.\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Copper: 2 - 4 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Psoriasis" ->{
                vitamin_detail = "• Vitamin A: 50,000 I.U.\n" +
                        "• Vitamin B12: 1,000 cc weekly\n" +
                        "• Vitamin D: 200 - 400 I.U.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Folic Acid: 1 - 2 mg.\n" +
                        "• Selenium: 200 mcg.\n" +
                        "• Zinc: 30 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folic Acid",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Psoriatic Arthritis" ->{
                vitamin_detail = "• Vitamin A: 50,000 I.U.\n" +
                        "• Niacinamide: 500 mg. QID (check liver enzymes regularly)\n" +
                        "• Vitamin B5: 500 mg. QID\n" +
                        "• Vitamin B12: 1,000 cc weekly\n" +
                        "• Vitamin D: 200 - 400 I.U.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin K: 50 - 100 mg. TID\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Zinc: 30 mg. BID - TID\n" +
                        "• Copper: 64 mg. BID\n" +
                        "• Manganese: 15 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Regional Enteritis" ->{
                vitamin_detail = "• Vitamin A: 50,000 - 75,000 I.U. initially, then taper\n" +
                        "• Hydroxycobalamin: IM 1,000 mcg. weekly\n" +
                        "• Vitamin C (buffered): 1 - 2 gm.\n" +
                        "• Vitamin D: 200 - 400 I.U.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folate: 20 - 50 mg.\n" +
                        "• Zinc: 30 mg. BID\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Selenium: 200 - 400 mcg.\n" +
                        "• Magnesium: 500 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Rheumatoid Arthritis" ->{
                vitamin_detail = "• Niacinamide: 500 mg. QID (check liver enzymes regularly)\n" +
                        "• Vitamin B5: 500 mg. QID\n" +
                        "• Vitamin C (buffered - reduce if joint pain increases): 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin K: 50 - 100 mg. TID\n" +
                        "• Selenium: 200 - 300 mcg.\n" +
                        "• Zinc: 30 mg. BID - TID\n" +
                        "• Copper (salicylate form): 64 mg. BID\n" +
                        "• Manganese: 15 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Rosacea" ->{
                vitamin_detail = "• Vitamin A: 100,000-300,000 I.U. for 3 months\n" +
                        "• Vitamin B-Complex : take as directed on the bottle\n" +
                        "• Vitamin C : cream - take as directed on the bottle\n" +
                        "• Zinc: 30 - 60 mg.\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Schizophrenia" ->{
                vitamin_detail = "• Vitamin B1: 3-8 gm.\n" +
                        "• Vitamin B2: 5 mg.\n" +
                        "• Vitamin B6: 50 - 100 mg.\n" +
                        "• Folate: 2 mg.\n" +
                        "• Vitamin C: 3 - 6 gm.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Magnesium: 125 - 500 mg.\n" +
                        "• Selenium: 200 - 300 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "SLE" ->{
                vitamin_detail = "• Beta-Carotene: 90,000 I.U.\n" +
                        "• Vitamin A: 10,000 I.U.\n" +
                        "• Vitamin B12: 1,000 mcg. IM twice weekly\n" +
                        "• Vitamin C: 1-3 gm.\n" +
                        "• Vitamin E: 1200-1600 I.U. daily - can also be applied directly to skin lesions\n" +
                        "• Vitamin K (Phytonadione): 1 mg.\n" +
                        "• Magnesium: 500-1000 mg.\n" +
                        "• Zinc: 30-50 mg.\n" +
                        "• Selenium: 200-300 mcg.\n" +
                        "• Copper: 2-4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K (Phytonadione)",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Sleep Disorder" ->{
                vitamin_detail = "• Vitamin B1: 20-40 mg.\n" +
                        "• Vitamin B12: 300-600 mcg.\n" +
                        "• Magnesium (Aspartate form): 1000 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")

            }
            "Stress Incontinence" ->{
                vitamin_detail = "• Vitamin C: 1 gm TID\n" +
                        "• Vitamin B12: 1000 mcg. daily or 1 cc IM 3 times a week (especially for geriatric patients)"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Systemic Lupus Erythematosus" ->{
                vitamin_detail = "• Beta-Carotene: 90,000 I.U.\n" +
                        "• Vitamin A: 10,000 I.U.\n" +
                        "• Vitamin B12: 1,000 mcg. IM twice weekly\n" +
                        "• Vitamin C: 1-3 gm.\n" +
                        "• Vitamin E: 1200-1600 I.U. daily - can also be applied directly to skin lesions\n" +
                        "• Vitamin K (Phytonadione): 1 mg.\n" +
                        "• Magnesium: 500-1000 mg.\n" +
                        "• Zinc: 30-50 mg.\n" +
                        "• Selenium: 200-300 mcg.\n" +
                        "• Copper: 2-4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K (Phytonadione)",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Ulcerative Colitis" ->{
                vitamin_detail = "• Vitamin A: 100,000 I.U. initially, then taper to 25,000 I.U.\n" +
                        "• Vitamin C: 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Magnesium (Aspartate form): 500 mg.\n"
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")


            }
            "Uterine Fibroids" ->{
                vitamin_detail = "• Vitamin C: 2 gm. TID\n" +
                        "• Beta-carotene: 150,000 I.U.\n" +
                        "• Selenium: 400 mcg.\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
            "Vaginal Yeast Infection" ->{
                vitamin_detail = "• Vitamin A: 25,000 - 50,000 I.U.\n" +
                        "• Vitamin C: to bowel tolerance (usually 5 - 15 gm.)\n" +
                        "• Biotin: 500 mcg. BID\n" +
                        "• Zinc: 45 mg.\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Iron: 45 mg.\n" +
                        "• Selenium: 200 - 300 mcg."
                ss = SpannableString(vitamin_detail)
                createLink(ss,"Vitamin A",vitamin_detail,"Vitamin","Vitamin A (Retinol)")
                createLink(ss,"Vitamin B-Complex",vitamin_detail,"Vitamin","Vitamin B-Complex")
                createLink(ss,"Vitamin B1",vitamin_detail,"Vitamin","Vitamin B1 (Thiamine)")
                createLink(ss,"Vitamin B6",vitamin_detail,"Vitamin","Vitamin B6 (Pyridoxine)")
                createLink(ss,"Vitamin B2",vitamin_detail,"Vitamin","Vitamin B2 (Riboflavin)")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B12",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Vitamin C",vitamin_detail,"Vitamin","Vitamin C (Ascorbic Acid)")
                createLink(ss,"Vitamin E",vitamin_detail,"Vitamin","Vitamin E (Tocopherol)")
                createLink(ss,"Vitamin D",vitamin_detail,"Vitamin","Vitamin D (Cholecalciferol)")
                createLink(ss,"Vitamin K",vitamin_detail,"Vitamin","Vitamin K (Quinones)")
                createLink(ss,"Calcium",vitamin_detail,"Vitamin","Calcium")
                createLink(ss,"Magnesium",vitamin_detail,"Vitamin","Magnesium")
                createLink(ss,"Folate",vitamin_detail,"Vitamin","Folic Acid")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Zinc",vitamin_detail,"Vitamin","Zinc")
                createLink(ss,"Copper",vitamin_detail,"Vitamin","Copper")
                createLink(ss,"Choline",vitamin_detail,"Vitamin","Choline (Lecithin)")
                createLink(ss,"Manganese",vitamin_detail,"Vitamin","Manganese")
                createLink(ss,"Iron",vitamin_detail,"Vitamin","Iron")
                createLink(ss,"Niacinamide",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Vitamin B5",vitamin_detail,"Vitamin","Vitamin B5 (Pantothenic Acid)")
                createLink(ss,"Selenium",vitamin_detail,"Vitamin","Selenium")
                createLink(ss,"Boron",vitamin_detail,"Vitamin","Boron")
                createLink(ss,"Molybdenum",vitamin_detail,"Vitamin","Molybdenum")
                createLink(ss,"Silicon",vitamin_detail,"Vitamin","Silicon")
                createLink(ss,"Chromium Aspartate",vitamin_detail,"Vitamin","Chromium")
                createLink(ss,"Lithium",vitamin_detail,"Vitamin","Lithium")
                createLink(ss,"Potassium",vitamin_detail,"Vitamin","Potassium")
                createLink(ss,"Biotin",vitamin_detail,"Vitamin","Biotin")
                createLink(ss,"Hydroxycobalamin",vitamin_detail,"Vitamin","Vitamin B12 (Cobalamin)")
                createLink(ss,"Inositol",vitamin_detail,"Vitamin","Inositol")
                createLink(ss,"Vitamin B3",vitamin_detail,"Vitamin","Vitamin B3 (Niacin)")
                createLink(ss,"Beta-Carotene",vitamin_detail,"Vitamin","Beta Carotene (and other Carotenoids)")


            }
        }

        checkAllLinks(ss,vitamin_detail)

        binding.contentData.text = ss
    }

    private fun setSupplementData(conditionName: String) {
        binding.diet.text = "Supplements"
        when(conditionName){

            "ADD/ADHD" -> {
                supplements_detail = "• Omega-3 Fatty Acids: 500-1000 mg. TID\n" +
                        "• Pycnogenol: 20-100 mg. TID"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
            }

            "Adult Acne" -> {
                supplements_detail = "• Hydrochloric Acid (HCl): 20 - 40 grains (likely, but only if lab work confirms)\n" +
                        "• Digestive Enzymes: 1 - 2 tablets per meal\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
            }

            "Age-Related Macular Degeneration" -> {
                supplements_detail = "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Taurine: 1.5 gm. BID\n" +
                        "• Anthocyanadin : 80 -160 mg. (standard extract from Bilberry)"
                ss = SpannableString(supplements_detail)
                createLink(ss,"L-Glutathione",supplements_detail,"Supplement","Glutathione")
                createLink(ss,"Taurine",supplements_detail,"Supplement","Taurine")
                createLink(ss,"Anthocyanadin",supplements_detail,"Supplement","Bioflavonoids")

            }
            "Aging Prevention" -> {
                supplements_detail = "• Glutathionine: 500-1,000 mg.\n" +
                        "• DHEA (Dehydroepiandrosterone): 20-50 mg.\n" +
                        "• Melatonin: 3 mg. at 9 PM\n" +
                        "• Thymus Glandular: 1 tablet TID\n" +
                        "• Coenzyme Q10: 30 mg. BID\n" +
                        "• Omega 6 Fatty Acids: 2 - 4 gm."
                ss = SpannableString(supplements_detail)
                createLink(ss,"Glutathione",supplements_detail,"Supplement","Glutathione")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"Supplement","Melatonin")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Omega 6 Fatty Acids",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")

            }
            "AIDS" -> {
                supplements_detail = "• N-Acetyl Cysteine: 1 gm. BID\n" +
                        "• Acetyl-L-Carnitine: 1 gm. TID\n" +
                        "• Omega-3 Fatty Acids : 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids : 1 gm. TID\n" +
                        "• Lipoic Acid: 150 mg. TID\n" +
                        "• Thymus Glandular: 1 tablet TID\n" +
                        "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Acidophilis and Bifidus: 1 capsule between meals\n" +
                        "• Coenzyme Q10: 60 - 150 mg. in small divided doses every 3 hours\n" +
                        "• Fiber: 20 - 45 gm. per day in divided doses with 12 oz. of water per dose\n" +
                        "• DHEA (Dehydroepiandrosterone): 20-100 mg."
                ss = SpannableString(supplements_detail)
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Omega 6 Fatty Acids",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"L-Glutathione",supplements_detail,"Supplement","Glutathione")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"N-acetyl Cysteine",supplements_detail,"supplement","N-Acetyl Cysteine")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")

            }
            "Allergies" -> {
                vitamin_detail = "• EFA: 3 gm.\n" +
                        "• Quercetin: 500 mg. 30 minutes before meals\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Thymus Glandular: 1 tablet BID\n" +
                        "• Adrenal Glandular: 1 tablet BID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(recommended_labs)
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Adrenal Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")

            }
            "Alzheimer's Disease" -> {
                supplements_detail = "• EFA: 1-5 gm. TID\n" +
                        "• Phosphatidylserine: 100 mg. TID\n" +
                        "• L-Acetyl-Carnitine: 500 mg. TID\n" +
                        "• DHEA (for women): 20-45 mg.\n" +
                        "• Lipoic Acid: 150 mg. TID\n" +
                        "• NADH: 5 mg. QID\n" +
                        "• Melatonin: 3-6 mg. at 9 PM\n" +
                        "• Coenzyme Q10: 60 - 150 mg. in small divided doses every 3 hours"
                ss = SpannableString(supplements_detail)
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"L-Acetyl-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"DHEA",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")

            }
            "Amenorrhea" -> {
                supplements_detail = "• Ovary Glandular: 1 tablet TID\n" +
                        "• Pituitary Glandular: 1 tablet TID\n" +
                        "• Adrenal Glandular: 1 tablet TID\n" +
                        "• Liver Glandular: 1 tablet TID\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Ovary Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Pituitary Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Adrenal Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Liver Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")

            }
            "Anorexia Nervosa" -> {
                supplements_detail = "• 5-Hydroxytryptophan: 50 mg. TID (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• Melatonin: 3-6 mg. at 9PM"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")

            }
            "Aphthous Stomatitis" -> {
                supplements_detail = "• *Hydrochloric Acid: 10 - 70 grains per meal (if hypochlorhydric)\n" +
                        "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Lysine: 500 - 2000 mg. (if viral/herpetic - reduce dosage after improvement)\n" +
                        "• Acidophilis and Bifidus: apply topically to ulcer during initial stage"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
            }
            "Arthritis, Gout" -> {
                supplements_detail = "• Bromelain: 250 mg. 3 times a day away from food\n" +
                        "• Omega 3: 1.5-2.0 gm. a day in divided doses\n" +
                        "• Quercetin: 400 mg. 3 times a day away from food\n" +
                        "• *Digestive Enzymes: 2 tablets with each meal"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Omega 3",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")

            }
            "Arthritis, Osteo" -> {
                supplements_detail = "• S-Adenosylmethionine (SAMe): 1200 mg. in divided doses\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab confirms)\n" +
                        "• Glucosamine Sulfate: 350 mg. TID\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm."
                ss = SpannableString(supplements_detail)
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")

            }
            "Arthritis, Psoriatic" -> {
                supplements_detail = "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Bromelain: 250 mg. TID (between meals)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Fumaric Acid: 250 - 500 mg. TID\n" +
                        "• Hydrochloric Acid: 40 - 70 grains per meal (if lab work confirms)\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Glucosamine Sulfate: 500 mg. TID"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"Fumaric Acid",supplements_detail,"Supplement","Fumaric Acid")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega-6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")

            }
            "Arthritis, Rheumatoid" -> {
                supplements_detail = "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Bromelain: 250 mg. TID (between meals)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Glucosamine Sulfate: 500 mg. TID"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"Fumaric Acid",supplements_detail,"Supplement","Fumaric Acid")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega-6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")

            }
            "Asthma" -> {
                supplements_detail = "• N-Acetyl Cysteine: 500 - 1000 mg.\n" +
                        "• Omega 3 Fatty Acids: 3 gm.\n" +
                        "• Quercetin: 500 mg. 30 minutes before meals\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Coenzyme Q10: 60 mg. in small divided doses every 3 - 4 hours"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")

            }
            "Atherosclerosis" -> {
                supplements_detail = "• Coenzyme Q10: 40 - 120 mg. in divided doses\n" +
                        "• Bromelain: 500 mg. BID (on an empty stomach)\n" +
                        "• L-Carnitine: 3 gm.\n" +
                        "• L-Arginine: 2 - 4 gm. BID\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Glucosamine Sulfate: 100 mg.\n" +
                        "• Fiber: 20 - 45 gm. in divided doses accompanied with 12 ounces of water per dose\n" +
                        "• Garlic: 400 mg.\n" +
                        "• Red Yeast Rice (Monascus purpureus): 1200 mg. with 50 mg. Coenzyme Q10 2 times a day\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega-6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Red Yeast Rice",supplements_detail,"Food","Red Yeast Rice (Monascus purpureus)")


            }
            "Atopic Dermatitis" -> {
                supplements_detail = "• Omega-3 Fatty Acids : 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Hydrochloric Acid (HCl): 10 - 40 grains with each meal if hypochlohydria\n" +
                        "• Quercetin: 500 mg. 30 minutes before meals\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega-6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")

            }
            "Attention Deficit Disorder" -> {
                supplements_detail = "• Omega-3 Fatty Acids: 500-1000 mg. TID\n" +
                        "• Pycnogenol: 20-100 mg. TID\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")

            }
            "Autism" -> {
                supplements_detail = "• Dimethyl Glycine (DMG): 100-200 mg. in divided doses\n" +
                        "• Hydrocholric Acid (HCl): 10 - 40 grains for adults and from 1 - 10 grains for children based on weight (this promotes secretin production)\n" +
                        "• Carnosine: 400 mg. BID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Omega 3 Fatty Acids: 3 gm."
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Benign Prostatic Hypertrophy" ->{
                supplements_detail = "• Dimethyl Glycine(DMG): 100-200 mg. in divided doses\n" +
                        "• Glutamic Acid: 2.3 gm. for 2 weeks, followed by 1.1 gm. for 3 months\n" +
                        "• Alanine: 2.3 gm. for 2 weeks, followed by 1.1 gm. for 3 months\n" +
                        "• Quercetin: 500 mg. TID (between meals)\n" +
                        "• Prostate Glandular: 1 tablet TID\n" +
                        "• Omega 3 Fatty Acids: 1-3 gm. TID"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Prostate Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
            }
            "Bipolar Disorder" ->{
                supplements_detail = "• Omega-3 Fatty Acids : 500-1000 mg. TID\n" +
                        "• Omega-6 Fatty Acids : 500-1000 mg. TID-QID (not to be taken without lithium during manic phase)\n" +
                        "• Phenylalanine: 500 mg. daily initially, increasing as needed to 3-4 gm. daily\n" +
                        "• 5-Hydroxytryptophan: 50-200 mg. in divided doses (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• S-Adenosyl-L-Methionine (SAM): 800 mg. for depressive state, provided hypomania/mania tendency can be controlled\n" +
                        "• Melatonin: 3-6 mg. at 9PM\n" +
                        "• Phosphatidylserine: 100 mg. TID with food\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega-6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"S-Adenosy-L-Methionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
            }
            "Bladder Infection" ->{
                supplements_detail = "• Arginine: 500 - 2,000 mg. in divided doses on an empty stomach\n" +
                        "• Mannose (powder): 1/4 tsp. 3 - 6 times a day"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Arginine",supplements_detail,"supplement","Arginine")
            }
            "Blood Pressure, High" ->{
                supplements_detail = "• Coenzyme Q10: 30 mg. QID (takes 4-12 weeks for this therapy to make a difference in blood pressure)\n" +
                        "• Fiber: 30 - 45 gm. in divided doses at mealtime with 12 ounces of water per dose\n" +
                        "• Omega-3 Fatty Acids: 1-5 gm. TID\n" +
                        "• Taurine: 500 mg.\n" +
                        "• Garlic: in supplement form equivalent to 10 cloves garlic a day\n" +
                        "• L-Arginine: 1,000 mg. TID on empty stomach\n" +
                        "• L-Carnitine: 500 mg. TID away from food"
                ss = SpannableString(supplements_detail)
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
            }
            "BPH" ->{
                supplements_detail = "• Dimethyl Glycine(DMG): 100-200 mg. in divided doses\n" +
                        "• Glutamic Acid: 2.3 gm. for 2 weeks, followed by 1.1 gm. for 3 months\n" +
                        "• Alanine: 2.3 gm. for 2 weeks, followed by 1.1 gm. for 3 months\n" +
                        "• Quercetin: 500 mg. TID (between meals)\n" +
                        "• Prostate Glandular: 1 tablet TID\n" +
                        "• Omega 3 Fatty Acids: 1-3 gm. TID"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Prostate Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
            }
            "Bronchitis" ->{
                supplements_detail = "• N-Acetyl Cysteine: 1 gm. BID\n" +
                        "• Quercetin: 500 mg. TID (between meals)\n" +
                        "• Lung Glandular: 1 tablet TID\n" +
                        "• Bromelain: 150-500 mg. TID (between meals)"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lung Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
            }
            "Cancer Prevention" ->{
                supplements_detail = "• Most Cancers:\n" +
                        "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Omega-3 Fatty Acids : 2 - 5 gm. TID"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"L-Glutathione",supplements_detail,"Supplement","Glutathione")
            }
            "Candida Infection" ->{
                supplements_detail = "• Fiber: 20 - 45 gm. in divided doses per meal with 12 ounces of water per dose\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• Hydrochloric Acid: 10 - 70 grains, before each meal (if lab confirms hypochlorhydria)\n" +
                        "• Omega 3 Fatty Acids: 1-5 gm. BID\n" +
                        "• Thymus Glandular: 2 tablets TID\n" +
                        "• Digestive Enzymes: 1 - 2 tablets per meal"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Candidiasis" ->{
                supplements_detail = "• Fiber: 20 - 45 gm. in divided doses per meal with 12 ounces of water per dose\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• Hydrochloric Acid: 10 - 70 grains, before each meal (if lab confirms hypochlorhydria)\n" +
                        "• Omega 3 Fatty Acids: 1-5 gm. BID\n" +
                        "• Thymus Glandular: 2 tablets TID\n" +
                        "• Digestive Enzymes: 1 - 2 tablets per meal\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Canker Sores" ->{
                supplements_detail = "• *Hydrochloric Acid: 10 - 70 grains per meal (if hypochlorhydric)\n" +
                        "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Lysine: 500 - 2000 mg. (if viral/herpetic - reduce dosage after improvement)\n" +
                        "• Acidophilis and Bifidus: apply topically to ulcer during initial stage"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Cataract Prevention" ->{
                supplements_detail = "• 5-Hydroxytryptophan : 50 - 200 mg. TID (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Quercetin (if diabetic): 500 mg. TID, 30 minutes before meals\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Melatonin: 3-6 mg. at 9PM"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Glutathione",supplements_detail,"supplement","Glutathione")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "CFS/CFIDS" ->{
                supplements_detail = "• Glutathione: 65 mg.\n" +
                        "• Coenzyme Q10: 100 - 150 mg.\n" +
                        "• DHEA: 5 - 15 mg.\n" +
                        "• Adrenal Glandular: 1 tablet BID\n" +
                        "• L-Carnitine: 1000 - 3000 mg. in divided doses\n" +
                        "• NADH: 5 mg. with water only on an empty stomach TID\n" +
                        "• Melatonin: 3-6 mg. at 9PM\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Glutathione",supplements_detail,"supplement","Glutathione")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Adrenal Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "CHF" ->{
                supplements_detail = "• Coenzyme Q10: 60 - 150 mg. in small divided doses every 2 hours\n" +
                        "• L-Carnitine: 1000 - 3000 mg. in divided doses\n" +
                        "• Taurine: 500 - 4,000 mg. in divided doses on an empty stomach\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Heart Glandular: 1 tablet BID\n" +
                        "• Kidney Glandular: 1 tablet BID\n" +
                        "• Arginine: 500 - 4,000 mg. in divided doses on an empty stomach"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Heart Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Kidney Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Cholecystitis" ->{
                supplements_detail = "• L-Methionine: 1 gm.\n" +
                        "• L-Taurine: 2 - 4 gm.\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Fiber: 5 - 45 gm. in divided doses with 12 oz. of water per dose\n" +
                        "• Lipase: 10,000 units with lunch and dinner"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega 6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"L-Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Lipase",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"L-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
            }
            "Cholelithiasis" ->{
                supplements_detail = "• L-Methionine: 1 gm.\n" +
                        "• L-Taurine: 2 - 4 gm.\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Fiber: 5 - 45 gm. in divided doses with 12 oz. of water per dose"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega-6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"L-Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Lipase",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"L-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
            }
            "Chronic Fatigue Syndrome" ->{
                supplements_detail = "• Glutathione: 65 mg.\n" +
                        "• Coenzyme Q10: 100 - 150 mg.\n" +
                        "• DHEA: 5 - 15 mg.\n" +
                        "• Adrenal Glandular: 1 tablet BID\n" +
                        "• L-Carnitine: 1000 - 3000 mg. in divided doses\n" +
                        "• NADH: 5 mg. with water only on an empty stomach TID\n" +
                        "• Melatonin: 3-6 mg. at 9PM\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Adrenal Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Glutathione",supplements_detail,"Supplement","Glutathione")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Colitis" ->{
                supplements_detail = "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• EFA: 1 - 2 gm. TID between meals\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Fructooligosaccarides: 800 mg TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Fiber : 5 - 45 gm. in divided doses taken with 12 ounces of water per dose"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"EFA",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Fructooligosaccarides",supplements_detail,"Supplement","Fructooligosaccarides (FOS)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
            }
            "Congestive Heart Failure" ->{
                supplements_detail = "• Coenzyme Q10: 60 - 150 mg. in small divided doses every 2 hours\n" +
                        "• L-Carnitine: 1000 - 3000 mg. in divided doses\n" +
                        "• Taurine: 500 - 4,000 mg. in divided doses on an empty stomach\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Heart Glandular: 1 tablet BID\n" +
                        "• Kidney Glandular: 1 tablet BID\n" +
                        "• Arginine: 500 - 4,000 mg. in divided doses on an empty stomach"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Heart Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Kidney Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Arginine",supplements_detail,"supplement","Arginine")
            }
            "Constipation" ->{
                supplements_detail = "• Fiber : 5 - 45 gm. in divided doses taken with 12 ounces of water per dose\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
            }
            "Crohn's Disease" ->{
                supplements_detail = "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Omega 3 Fatty Acids : 1-5 gm. TID between meals\n" +
                        "• Fiber: 5 - 45 gm. in divided doses at mealtime with 12 ounces of water per dose\n" +
                        "• Fructooligosaccarides: 800 mg. TID"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Fructooligosaccarides",supplements_detail,"Supplement","Fructooligosaccarides (FOS)")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
            }
            "Cystitis" ->{
                supplements_detail = "• Arginine: 500 - 2,000 mg. in divided doses on an empty stomach\n" +
                        "• Mannose (powder): 1/4 tsp. 3 - 6 times a day"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Arginine",supplements_detail,"supplement","Arginine")
            }
            "Depression" ->{
                supplements_detail = "• 5-Hydroxytryptophan : 100-300 mg TID (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• Omega 3 Fatty Acids: 1-5 gm. TID\n" +
                        "• Carnitine: 500 mg. BID away from food\n" +
                        "• NADH: 5 mg. with water only on an empty stomach BID\n" +
                        "• S-adenosyl-L-methionine (SAM): 800 mg.\n" +
                        "• DHEA: 5 - 15 mg.\n" +
                        "• Phenylalanine: 500 mg. daily initially, increasing as needed to 2-3 gm. daily\n" +
                        "• Phosphatidylserine: 100 mg. TID with food"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosy-L-Methionine (SAM)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")

            }
            "Diabetes Mellitus" ->{
                supplements_detail = "• Quercetin: 500 mg.\n" +
                        "• Coenzyme Q10: 30 mg. QID for 3 months\n" +
                        "• Taurine: 1.5 gm.\n" +
                        "• Arginine: 2 - 4 gm. BID\n" +
                        "• Lipoic Acid: 300-600 mg.\n" +
                        "• Omega 3 Fatty Acids: 1-5 gm. TID\n" +
                        "• Acetyl-L-Carnitine: 1 gm. TID\n" +
                        "• Fiber: up to 100 gm. in divided doses with 12 oz. of water per dose\n" +
                        "• Digestive Enzymes: 2 tablets before each meal"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Dysmenorrhea" ->{
                supplements_detail = "• Omega 3 and 6 Fatty Acids: 1-5 gm. TID\n" +
                        "• Ovary Glandular: 2 tablet TID\n" +
                        "• Bromelain: 250 - 500 mg. TID on an empty stomach\n" +
                        "• Quercetin: 250 - 500 mg. every 2 hours during cramping (enhances vitamin B3)"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega 3 and 6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Ovary Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
            }

            "Ear Infection" ->{
                supplements_detail = "• Omega 3 Fatty Acids: 250-1000 mg.\n" +
                        "• N-Acetyl Cysteine: 500-1000 mg. BID\n" +
                        "• Quercetin: 50 mg. QID between meals\n" +
                        "• Omega 6 Fatty Acids: 250-500 mg.\n" +
                        "• Thymus Glandular: 500 mg."
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega 6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Eczema, Chronic" ->{
                supplements_detail = "• Omega-3 Fatty Acids : 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Hydrochloric Acid (HCl): 10 - 40 grains with each meal if hypochlohydria\n" +
                        "• Quercetin: 500 mg. 30 minutes before meals\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega 6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }

            "Endometriosis" ->{
                supplements_detail = "• Omega 3 (EPA form): 1.5 - 2.0 gm. a day in divided doses\n" +
                        "• *Liver Concentrate: 25 mg. (as a lipotropic factor)\n" +
                        "• *Taurine: 100 mg. (as a lipotropic factor)\n" +
                        "• *DL-Methionine: 100 mg. (as a lipotropic factor)\n" +
                        "• *Trimethylglycine HCl: 100 mg. (as a lipotropic factor)"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega 3",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Liver Concentrate",supplements_detail,"supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
            }

            "Erectile Dysfunction" ->{
                supplements_detail = "• Omega-3 Fatty Acids: 1 - 2 gm. TID\n" +
                        "• L-Arginine: 3,000 mg. on empty stomach\n" +
                        "• Dehydroepeandrostrone (DHEA): 20-50 mg.\n" +
                        "• Hypothalamus Glandular: 30 mg. BID\n" +
                        "• Pituitary Glandular: 20 mg. BID\n" +
                        "• Orchic Glandular: 100 mg. BID\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pituitary Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Orchic Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Hypothalamus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Dehydroepiandrosterone (DHEA)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")

            }

            "Fertility" ->{
                supplements_detail = "   Female:\n" +
                        "• Melatonin: 0.5 - 20 mg. 30 minutes before bedtime\n" +
                        "   Male:\n" +
                        "• Melatonin: 0.5 - 20 mg. 30 minutes before bedtime\n" +
                        "• Acetyl-L-Carnitine: 1 -8 gm. TID\n" +
                        "• Arginine: 2 - 4 gm. TID\n" +
                        "• Glutathione: 100 mg. BID - TID between meals\n" +
                        "• Coenzyme Q10: 30 mg. BID\n" +
                        "• S-Adenosylmethionine (SAMe): 200 mg."
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Glutathione",supplements_detail,"Supplement","Glutathione")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Fibrocystic Breast Disease" ->{
                supplements_detail = "• Omega 3 Fatty Acids: 1 -5 gm. TID\n" +
                        "• Omega 6 Fatty Acids : 500 mg. TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Ovary, Pituitary, Adrenal and Liver Glandulars: 1 tablet TID\n" +
                        "• *Lipotropic factors"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Omega 3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega 6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Ovary, Pituitary, Adrenal and Liver Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
            }

            "Fibromyalgia" ->{
                supplements_detail = "• Bromelain: 2500 mg. TID between meals\n" +
                        "• Quercetin: 250 mg. TID between meals\n" +
                        "• Melatonin: 3 mg. at 9 PM\n" +
                        "• 5-Hydroxytryptophan: begin with 50 mg. TID, increase up to 200 mg. TID if necessary (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• L-Carnitine: 3 gm.\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid (HCL)",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"Carnosine",supplements_detail,"Supplement","Carnosine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"Alanine",supplements_detail,"Supplement","Alanine")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Gallbladder Disease" ->{
                supplements_detail = "• L-Methionine: 1 gm.\n" +
                        "• L-Taurine: 2 - 4 gm.\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Fiber: 5 - 45 gm. in divided doses with 12 oz. of water per dose\n" +
                        "• Lipase: 10,000 units with lunch and dinner"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Pycnogenol",supplements_detail,"Supplement","Pycnogenol")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega-6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Acidophilus and Bifidus",supplements_detail,"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
                createLink(ss,"EFA",supplements_detail,"Supplement","Essential Fatty Acids (EFAs)")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
                createLink(ss,"Lysine",supplements_detail,"Supplement","Lysine")
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"N-Acetyl Cysteine",supplements_detail,"Supplement","N-Acetyl Cysteine")
                createLink(ss,"Coenzyme Q10",supplements_detail,"Supplement","Coenzyme Q10 (Ubiquinone)")
                createLink(ss,"Acetyl-L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Arginine",supplements_detail,"supplement","Arginine")
                createLink(ss,"L-Carnitine",supplements_detail,"supplement","Carnitine")
                createLink(ss,"L-Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Lipoic Acid",supplements_detail,"supplement","Lipoic Acid")
                createLink(ss,"DHEA (Dehydroepiandrosterone)",supplements_detail,"Supplement","Dehydroepiandrosterone (DHEA)")
                createLink(ss,"Melatonin",supplements_detail,"supplement","Melatonin")
                createLink(ss,"5-Hydroxytryptophan",supplements_detail,"supplement","Tryptophan")
                createLink(ss,"Phenylalanine",supplements_detail,"Food","Phenylalanine")
                createLink(ss,"DL-Methionine",supplements_detail,"supplement","Methionine")
                createLink(ss,"Trimethylglycine HCL",supplements_detail,"supplement","Dimethyl Glycine (DMG)")
                createLink(ss,"Phosphatidylserine",supplements_detail,"supplement","Phosphatidylserine")
                createLink(ss,"NADH",supplements_detail,"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
                createLink(ss,"Thymus Glandular",supplements_detail,"Supplement","Glandulars (Protomorphogens)")
                createLink(ss,"S-Adenosylmethionine (SAMe)",supplements_detail,"Food","S-Adenosy-L-Methionine (SAM)")
                createLink(ss,"Glucosamine Sulfate",supplements_detail,"Food","Glucosamine Sulfate")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
                createLink(ss,"Garlic",supplements_detail,"Food","Allium sativum (Garlic)")
                createLink(ss,"L-Methionine",supplements_detail,"Supplement","Methionine")
                createLink(ss,"Glutamic Acid",supplements_detail,"Supplement","Glutamic Acid")
                createLink(ss,"lipase",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Dimethyl Glycine (DMG)",supplements_detail,"Supplement","Dimethyl Glycine (DMG)")
            }
            "Gallstones" ->{
                supplements_detail = "• L-Methionine: 1 gm.\n" +
                        "• L-Taurine: 2 - 4 gm.\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Fiber: 5 - 45 gm. in divided doses with 12 oz. of water per dose\n"
                ss = SpannableString(supplements_detail)
                createLink(ss,"L-Methionine",supplements_detail,"Supplement","Methionine")
                createLink(ss,"L-Taurine",supplements_detail,"supplement","Taurine")
                createLink(ss,"Omega-3 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Omega-6 Fatty Acid",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Hydrochloric Acid",supplements_detail,"Supplement","Hydrochloric Acid")
                createLink(ss,"Fiber",supplements_detail,"Food","Fiber")
            }
            "Gout" ->{
                supplements_detail = "• Bromelain: 250 mg. 3 times a day away from food\n" +
                        "• Omega 3: 1.5-2.0 gm. a day in divided doses\n" +
                        "• Quercetin: 400 mg. 3 times a day away from food\n" +
                        "• *Digestive Enzymes: 2 tablets with each meal"
                ss = SpannableString(supplements_detail)
                createLink(ss,"Bromelain",supplements_detail,"Supplement","Bromelain")
                createLink(ss,"Omega 3",supplements_detail,"Food","Essential Fatty Acids (EFAs)")
                createLink(ss,"Digestive Enzymes",supplements_detail,"Supplement","Digestive Enzymes")
                createLink(ss,"Quercetin",supplements_detail,"Supplement","Quercetin")
            }
            "Headache, General" ->{
                supplements_detail = "• Quercetin: 500 mg. 15 minutes prior to eating\n" +
                        "• EFA: 1-5 gm. taken at breakfast and at dinner\n" +
                        "• Melatonin: 3 mg. at 9:00 PM every night\n" +
                        "• 5-Hydroxytryptophan : 50-100 mg. TID (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)"
                ss = SpannableString(supplements_detail)
            }
            "Headache, Migraine" ->{
                supplements_detail = "• Omega 3 Fatty Acids: 2 - 4 gm. in divided doses with food\n" +
                        "• 5-Hydroxytryptophan: 100 - 300 mg. TID (Note: in rare circumstances, tryptophan has been found to be detrimental to headache sufferers)"
                ss = SpannableString(supplements_detail)
            }
            "Hemorrhoids" ->{
                supplements_detail = "• L-Methionine: 1 gm.\n" +
                        "• Quercetin: 500 - 1000 mg. TID between meals\n" +
                        "• Omega-3 Fatty Acids: 1 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 500 mg. TID\n" +
                        "• Fiber: 5 - 45 gm. taken in divided doses with 12 ounces of water at meal time"
                ss = SpannableString(supplements_detail)
            }
            "Hepatitis" ->{
                supplements_detail = "• Methionine: 250 mg. QID - for halothane hepatitis\n" +
                        "• Taurine: 4 gm. TID - for acute hepatitis but not chronic hepatitis\n" +
                        "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Thymus Glandular: 2 tablets TID - for viral hepatitis\n" +
                        "• EFA : 1-5 gm. TID between meals\n" +
                        "• Lipoic Acid: 300-600 mg. (especially for Hepatitis C)"
                ss = SpannableString(supplements_detail)
            }
            "Herpes Simplex" ->{
                supplements_detail = "• L-Lysine: 3 - 6 gm. for outbreak, 500 - 1000 mg. for prophylaxis\n" +
                        "• Thymus Glandular: 2 tablets TID\n" +
                        "• Citrus Bioflavonoids: 1 - 3 gm."
                ss = SpannableString(supplements_detail)
            }
            "High Blood Pressure" ->{
                supplements_detail = "• Coenzyme Q10: 30 mg. QID (takes 4-12 weeks for this therapy to make a difference in blood pressure)\n" +
                        "• Fiber: 30 - 45 gm. in divided doses at mealtime with 12 ounces of water per dose\n" +
                        "• Omega-3 Fatty Acids: 1-5 gm. TID\n" +
                        "• Taurine: 500 mg.\n" +
                        "• Garlic: in supplement form equivalent to 10 cloves garlic a day\n" +
                        "• L-Arginine: 1,000 mg. TID on empty stomach\n" +
                        "• L-Carnitine: 500 mg. TID away from food\n"
                ss = SpannableString(supplements_detail)
            }
            "High Cholesterol" ->{
                supplements_detail = "• Coenzyme Q10: 40 - 120 mg. in divided doses\n" +
                        "• Bromelain: 500 mg. BID (on an empty stomach)\n" +
                        "• L-Carnitine: 3 gm.\n" +
                        "• L-Arginine: 2 - 4 gm. BID\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Fiber: 20 - 45 gm. in divided doses accompanied with 12 ounces of water per dose\n" +
                        "• Garlic: 400 mg.\n" +
                        "• Red Yeast Rice (Monascus purpureus): 1200 mg. with 50 mg. Coenzyme Q10 2 times a day\n" +
                        "• EDTA: 2 - 3 gm. by mouth at bedtime"
                ss = SpannableString(supplements_detail)
            }
            "HIV" ->{
                supplements_detail = "• N-Acetyl Cysteine: 1 gm. BID\n" +
                        "• Acetyl-L-Carnitine: 1 gm. TID\n" +
                        "• Omega-3 Fatty Acids : 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids : 1 gm. TID\n" +
                        "• Lipoic Acid: 150 mg. TID\n" +
                        "• Thymus Glandular: 1 tablet TID\n" +
                        "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Acidophilis and Bifidus: 1 capsule between meals\n" +
                        "• Coenzyme Q10: 60 - 150 mg. in small divided doses every 3 hours\n" +
                        "• Fiber: 20 - 45 gm. per day in divided doses with 12 oz. of water per dose\n" +
                        "• DHEA (Dehydroepiandrosterone): 20-100 mg.\n"
                ss = SpannableString(supplements_detail)
            }
            "Hyperactivity" ->{
                supplements_detail = "• Omega-3 Fatty Acids: 500-1000 mg. TID\n" +
                        "• Pycnogenol: 20-100 mg. TID\n"
                ss = SpannableString(supplements_detail)
            }
            "Hypercholesterolemia" ->{
                supplements_detail = "• Coenzyme Q10: 40 - 120 mg. in divided doses\n" +
                        "• Bromelain: 500 mg. BID (on an empty stomach)\n" +
                        "• L-Carnitine: 3 gm.\n" +
                        "• L-Arginine: 2 - 4 gm. BID\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Fiber: 20 - 45 gm. in divided doses accompanied with 12 ounces of water per dose\n" +
                        "• Garlic: 400 mg.\n" +
                        "• Red Yeast Rice (Monascus purpureus): 1200 mg. with 50 mg. Coenzyme Q10 2 times a day\n" +
                        "• EDTA: 2 - 3 gm. by mouth at bedtime"
                ss = SpannableString(supplements_detail)
            }
            "Hypertension" ->{
                supplements_detail = "• Coenzyme Q10: 30 mg. QID (takes 4-12 weeks for this therapy to make a difference in blood pressure)\n" +
                        "• Fiber: 30 - 45 gm. in divided doses at mealtime with 12 ounces of water per dose\n" +
                        "• Omega-3 Fatty Acids: 1-5 gm. TID\n" +
                        "• Taurine: 500 mg.\n" +
                        "• Garlic: in supplement form equivalent to 10 cloves garlic a day\n" +
                        "• L-Arginine: 1,000 mg. TID on empty stomach\n" +
                        "• L-Carnitine: 500 mg. TID away from food"
                ss = SpannableString(supplements_detail)
            }
            "Hypothyroid" ->{
                supplements_detail = "• Tyrosine: 250 mg.\n" +
                        "• Thyroid Glandular"
                ss = SpannableString(supplements_detail)
            }
            "IBS" ->{
                supplements_detail = "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• EFA: 1 - 2 gm. TID between meals\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Fructooligosaccarides: 800 mg TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Fiber : 5 - 45 gm. in divided doses taken with 12 ounces of water per dose\n"
                ss = SpannableString(supplements_detail)
            }
            "Impotence" ->{
                supplements_detail = "• Omega-3 Fatty Acids: 1 - 2 gm. TID\n" +
                        "• L-Arginine: 3,000 mg. on empty stomach\n" +
                        "• Dehydroepeandrostrone (DHEA): 20-50 mg.\n" +
                        "• Hypothalamus Glandular: 30 mg. BID\n" +
                        "• Pituitary Glandular: 20 mg. BID\n" +
                        "• Orchic Glandular: 100 mg. BID"
                ss = SpannableString(supplements_detail)
            }
            "Incontinence, Stress" ->{
                supplements_detail = "• Collagen Injection: 4.7 cc (1.5-12.5) transurethrally and 10.1 cc (5-20) periurethrally\n"
                ss = SpannableString(supplements_detail)
            }
            "Infertility" ->{
                supplements_detail = "  Female:\n" +
                        "• Melatonin: 0.5 - 20 mg. 30 minutes before bedtime\n" +
                        "   Male:\n" +
                        "• Melatonin: 0.5 - 20 mg. 30 minutes before bedtime\n" +
                        "• Acetyl-L-Carnitine: 1 -8 gm. TID\n" +
                        "• Arginine: 2 - 4 gm. TID\n" +
                        "• Glutathione: 100 mg. BID - TID between meals\n" +
                        "• Coenzyme Q10: 30 mg. BID\n" +
                        "• S-Adenosylmethionine (SAMe): 200 mg.\n"
                ss = SpannableString(supplements_detail)
            }
            "Insomnia" ->{
                supplements_detail = "• Melatonin: 3-6 mg. at 9PM (to be used instead of tryptophan)\n" +
                        "• 5-Hydroxytryptophan: 100 - 300 mg. 30 minutes before bedtime (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• DHEA: 20-45 mg.\n" +
                        "• Omega-3 Fatty Acids : 500-1000 mg. TID\n" +
                        "• Omega-6 Fatty Acids : 500-1000 mg. TID"
                ss = SpannableString(supplements_detail)
            }
            "Irritable Bowel Syndrome" ->{
                supplements_detail = "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• EFA: 1 - 2 gm. TID between meals\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Fructooligosaccarides: 800 mg TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Fiber : 5 - 45 gm. in divided doses taken with 12 ounces of water per dose"
                ss = SpannableString(supplements_detail)
            }
            "Longevity" ->{
                supplements_detail = "• Glutathionine: 500-1,000 mg.\n" +
                        "• DHEA (Dehydroepiandrosterone): 20-50 mg.\n" +
                        "• Melatonin: 3 mg. at 9 PM\n" +
                        "• Thymus Glandular: 1 tablet TID\n" +
                        "• Coenzyme Q10: 30 mg. BID\n" +
                        "• Omega 6 Fatty Acids: 2 - 4 gm."
                ss = SpannableString(supplements_detail)
            }
            "Lupus" ->{
                supplements_detail = "• Dehydroepiandrosterone (DHEA): 10-25 mg. for women, 15-50 mg. for men - higher doses if necessary\n" +
                        "• Omega-3 Fatty Acids : 2 - 5 gm. TID\n" +
                        "• Hydrochloric Aicd (HCl): 20 - 40 grains (likely, but only if lab work confirms)\n"
                ss = SpannableString(supplements_detail)
            }
            "Macular Degeneration" ->{
                supplements_detail = "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Taurine: 1.5 gm. BID\n" +
                        "• Anthocyanadin : 80 -160 mg. (standard extract from Bilberry)"
                ss = SpannableString(supplements_detail)
            }
            "Manic Depressive Disorder" ->{
                supplements_detail = "• Omega-3 Fatty Acids : 500-1000 mg. TID\n" +
                        "• Omega-6 Fatty Acids : 500-1000 mg. TID-QID (not to be taken without lithium during manic phase)\n" +
                        "• Phenylalanine: 500 mg. daily initially, increasing as needed to 3-4 gm. daily\n" +
                        "• 5-Hydroxytryptophan: 50-200 mg. in divided doses (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• S-Adenosyl-L-Methionine (SAM): 800 mg. for depressive state, provided hypomania/mania tendency can be controlled\n" +
                        "• Melatonin: 3-6 mg. at 9PM\n" +
                        "• Phosphatidylserine: 100 mg. TID with food\n"
                ss = SpannableString(supplements_detail)
            }
            "Mastitis" ->{
                supplements_detail = "• Bioflavonoids: 400 mg. TID with meals"
                ss = SpannableString(supplements_detail)
            }
            "Memory Loss" ->{
                supplements_detail = "• Amino Acids: 1 tablet TID\n" +
                        "• Phosphatidylserine: 100 mg. TID\n" +
                        "• L-Acetyl-Carnitine: 500 mg. TID\n"
                ss = SpannableString(supplements_detail)
            }
            "Menopause" ->{
                supplements_detail = "• Bioflavonoids: 1 - 3 gm.\n" +
                        "• EFA: 2-4 gm.\n" +
                        "• Ovary Glandular: 2 - 4 tablets BID\n" +
                        "• Uterus Glandular: 1 tablet BID\n" +
                        "• Dehydroepeandrostrone (DHEA): 20-50 mg.\n" +
                        "• Melatonin: 3-6 mg. at 9PM\n"
                ss = SpannableString(supplements_detail)
            }
            "Migraine Headache" ->{
                supplements_detail = "• Omega 3 Fatty Acids: 2 - 4 gm. in divided doses with food\n" +
                        "5-Hydroxytryptophan: 100 - 300 mg. TID (Note: in rare circumstances, tryptophan has been found to be detrimental to headache sufferers)"
                ss = SpannableString(supplements_detail)
            }
            "Mouth Ulcers" ->{
                supplements_detail = "• *Hydrochloric Acid: 10 - 70 grains per meal (if hypochlorhydric)\n" +
                        "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Lysine: 500 - 2000 mg. (if viral/herpetic - reduce dosage after improvement)\n" +
                        "• Acidophilis and Bifidus: apply topically to ulcer during initial stage"
                ss = SpannableString(supplements_detail)
            }
            "Multiple Sclerosis" ->{
                supplements_detail = "• Hydrochloric Acid: 40 - 70 grains per meal (if lab work confirms)\n" +
                        "• EFA: 30 - 90 ml (a combination of omega 3 and omega 6 oils may work best)\n" +
                        "• Digestive Enzymes: 2 tablets before each meal\n" +
                        "• Adrenal Glandular: 1 tablet BID\n" +
                        "• Nerve Glandular : 1 tablet BID\n"
                ss = SpannableString(supplements_detail)
            }

            "Obesity" ->{
                supplements_detail = "• L-Methionine: 1 gm.\n" +
                        "• L-Carnitine: 500 mg. TID between meals\n" +
                        "• L-Tyrosine: 500 mcg. TID\n" +
                        "• L-Glutamine: 1.5 - 3 gm.\n" +
                        "• Coenzyme Q10: 100 mg. in divided doses\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Fiber: 10 gm. taken with 16 ounces of water before lunch and dinner\n" +
                        "• Omega 6 Fatty Acids: 2 - 4 gm.\n" +
                        "• 5-Hydroxytryptophan: begin with 50 mg. TID 20 minutes before each meal, increase to 200 mg. TID if necessary (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n"
                ss = SpannableString(supplements_detail)
            }
            "Osteoarthritis" ->{
                supplements_detail = "• S-Adenosylmethionine (SAMe): 1200 mg. in divided doses\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab confirms)\n" +
                        "• Glucosamine Sulfate: 350 mg. TID\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm."
                ss = SpannableString(supplements_detail)
            }
            "Osteoporosis" ->{
                supplements_detail = "• Hydrochloric Acid: 20-40 grains per meal if indicated by lab\n" +
                        "• Dehydroepeandrostrone (DHEA): 20-50 mg.\n" +
                        "• EFA: 1-2 gms.\n" +
                        "• Bone Glandular: 1 tablet BID"
                ss = SpannableString(supplements_detail)
            }
            "Otitis Media" ->{
                supplements_detail = "• Omega 3 Fatty Acids: 250-1000 mg.\n" +
                        "• N-Acetyl Cysteine: 500-1000 mg. BID\n" +
                        "• Quercetin: 50 mg. QID between meals\n" +
                        "• Omega 6 Fatty Acids: 250-500 mg.\n" +
                        "• Thymus Glandular: 500 mg."
                ss = SpannableString(supplements_detail)
            }
            "Ovarian Cancer" ->{
                supplements_detail = "• Melatonin: 5 mg. at 9:00 PM every night\n" +
                        "• Quercetin: 400 mg. 3 times a day\n" +
                        "• Acidophilus and Bifidus: 2 times daily between meals"
                ss = SpannableString(supplements_detail)
            }
            "Painful Menses" ->{
                supplements_detail = "• Omega 3 and 6 Fatty Acids: 1-5 gm. TID\n" +
                        "• Ovary Glandular: 2 tablet TID\n" +
                        "• Bromelain: 250 - 500 mg. TID on an empty stomach\n" +
                        "• Quercetin: 250 - 500 mg. every 2 hours during cramping (enhances vitamin B3)\n"
                ss = SpannableString(supplements_detail)
            }
            "Paralysis Agitans" ->{
                supplements_detail = "• Coenzyme Q10: 40 - 120 mg. in divided doses\n" +
                        "• Melatonin: 3 mg. at 9 PM\n" +
                        "• NADH: 5 mg. QID\n" +
                        "• S-adenosyl-L-methionine (SAM): 200 - 400 mg.\n" +
                        "• 5-Hydroxyptryptophan: 100 - 300 mg. in divided doses (if taking L-Dopa) (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• Tyrosine: 250 mg.\n" +
                        "• Glutathionine: 500-1,000 mg.\n" +
                        "• L-Arginine: 1 - 4 gm. BID"
                ss = SpannableString(supplements_detail)
            }
            "Parkinson's Disease" ->{
                supplements_detail = "• Coenzyme Q10: 40 - 120 mg. in divided doses\n" +
                        "• Melatonin: 3 mg. at 9 PM\n" +
                        "• NADH: 5 mg. QID\n" +
                        "• S-adenosyl-L-methionine (SAM): 200 - 400 mg.\n" +
                        "• 5-Hydroxyptryptophan: 100 - 300 mg. in divided doses (if taking L-Dopa) (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• Tyrosine: 250 mg.\n" +
                        "• Glutathionine: 500-1,000 mg.\n" +
                        "• L-Arginine: 1 - 4 gm. BID"
                ss = SpannableString(supplements_detail)
            }
            "Peptic Ulcers" ->{
                supplements_detail = "• Glutamine: 500 - 1000 mg. TID\n" +
                        "• Omega-3 Fatty Acids: 2 -5 gm. TID\n" +
                        "Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "Digestive Enzymes: 2 tablets with each meal\n" +
                        "Hydrochloric Acid: 10 - 70 grains per meal (if gastric ulcer and hypochlorhydric)"
                ss = SpannableString(supplements_detail)
            }
            "PMS" ->{
                supplements_detail = "• 5-Hydroxytryptophan: begin with 50 mg. TID, increase to 200 mg. TID if necessary (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• Lipotropic Factors (Cysteine, L-Methionine, Choline, Inositol): 500 mg. each\n" +
                        "• Essentail Fatty Acids: 500 - 1,000 mg. (PMS - C)\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Ovary Glandular: 1 tablet BID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(supplements_detail)
            }
            "Premenstrual Syndrome" ->{
                supplements_detail = "• 5-Hydroxytryptophan: begin with 50 mg. TID, increase to 200 mg. TID if necessary (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• Lipotropic Factors (Cysteine, L-Methionine, Choline, Inositol): 500 mg. each\n" +
                        "• Essentail Fatty Acids: 500 - 1,000 mg. (PMS - C)\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Ovary Glandular: 1 tablet BID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(supplements_detail)
            }
            "Psoriasis" ->{
                supplements_detail = "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Fumaric Acid: 250 - 500 mg. TID\n" +
                        "• Hydrochloric Acid: 40 - 70 grains per meal (if lab work confirms)\n" +
                        "• Digestive Enzymes: 2 tablets with each meal"
                ss = SpannableString(supplements_detail)
            }
            "Psoriatic Arthritis" ->{
                supplements_detail = "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Bromelain: 250 mg. TID (between meals)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Fumaric Acid: 250 - 500 mg. TID\n" +
                        "• Hydrochloric Acid: 40 - 70 grains per meal (if lab work confirms)\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Glucosamine Sulfate: 500 mg. TID\n"
                ss = SpannableString(supplements_detail)
            }
            "Regional Enteritis" ->{
                supplements_detail = "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Omega 3 Fatty Acids : 1-5 gm. TID between meals\n" +
                        "• Fiber: 5 - 45 gm. in divided doses at mealtime with 12 ounces of water per dose\n" +
                        "• Fructooligosaccarides: 800 mg. TID"
                ss = SpannableString(supplements_detail)
            }
            "Rheumatoid Arthritis" ->{
                supplements_detail = "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Bromelain: 250 mg. TID (between meals)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Glucosamine Sulfate: 500 mg. TID\n"
                ss = SpannableString(supplements_detail)
            }
            "Rosacea" ->{
                supplements_detail = "• Hydrochloric Acid (HCl): 20 - 40 grains (likely, but only if lab work confirms)\n" +
                        "• Digestive Enzymes: 1 - 2 tablets per meal\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n"
                ss = SpannableString(supplements_detail)
            }
            "Schizophrenia" ->{
                supplements_detail = "• Omega 3 Fatty Acids: 500-1000 mg. TID\n" +
                        "• Omega 6 Fatty Acids: 500-1000 mg. TID\n" +
                        "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• L-Glycine: 500 mg. BID"
                ss = SpannableString(supplements_detail)
            }
            "SLE" ->{
                supplements_detail = "• Dehydroepiandrosterone (DHEA): 10-25 mg. for women, 15-50 mg. for men - higher doses if necessary\n" +
                        "• Omega-3 Fatty Acids : 2 - 5 gm. TID\n" +
                        "• Hydrochloric Aicd (HCl): 20 - 40 grains (likely, but only if lab work confirms)\n"
                ss = SpannableString(supplements_detail)
            }
            "Sleep Disorder" ->{
                supplements_detail = "• Melatonin: 3-6 mg. at 9PM (to be used instead of tryptophan)\n" +
                        "• 5-Hydroxytryptophan: 100 - 300 mg. 30 minutes before bedtime (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• DHEA: 20-45 mg.\n" +
                        "• Omega-3 Fatty Acids : 500-1000 mg. TID\n" +
                        "• Omega-6 Fatty Acids : 500-1000 mg. TID\n"
                ss = SpannableString(supplements_detail)
            }
            "Stress Incontinence" ->{
                supplements_detail = "• Collagen Injection: 4.7 cc (1.5-12.5) transurethrally and 10.1 cc (5-20) periurethrally"
                ss = SpannableString(supplements_detail)
            }
            "Systemic Lupus Erythematosus" ->{
                supplements_detail = "• Dehydroepiandrosterone (DHEA): 10-25 mg. for women, 15-50 mg. for men - higher doses if necessary\n" +
                        "• Omega-3 Fatty Acids : 2 - 5 gm. TID\n" +
                        "• Hydrochloric Aicd (HCl): 20 - 40 grains (likely, but only if lab work confirms)\n"
                ss = SpannableString(supplements_detail)
            }
            "Ulcerative Colitis" ->{
                supplements_detail = "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• Omega 3 Fatty Acids: 1-5 gm. TID\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Fructooligosaccarides: 800 mg. TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Fiber: 25 gm. with 12 oz. of water with each meal\n"
                ss = SpannableString(supplements_detail)
            }
            "Uterine Fibroids" ->{
                supplements_detail = "• Uterus Glandular: 1 tablet BID\n" +
                        "• Ovary Glandular: 1 tablet BID\n" +
                        "• Lipotropic Factors (Cysteine, L-Methionine, Choline, Inositol): 500 mg. each"
                ss = SpannableString(supplements_detail)
            }
            "Vaginal Yeast Infection" ->{
                supplements_detail = "• Fiber: 20 - 45 gm. in divided doses per meal with 12 ounces of water per dose\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• Hydrochloric Acid: 10 - 70 grains, before each meal (if lab confirms hypochlorhydria)\n" +
                        "• Omega 3 Fatty Acids: 1-5 gm. BID\n" +
                        "• Thymus Glandular: 2 tablets TID\n" +
                        "• Digestive Enzymes: 1 - 2 tablets per meal"
                ss = SpannableString(supplements_detail)
            }
        }

        checkAllLinks(ss,supplements_detail)
        binding.contentData.text = ss
    }

    private fun setBotanicalData(conditionName: String){
        binding.diet.text = "Botanicals"
        when(conditionName){
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
            "Adult Acne" -> {
                botanical_detail = "• Dry herbs - Althea (220 mg.), Geranium (220 mg.), Echinacea (220 mg.), Ulmus (220 mg.), Curcuma (220 mg.), Hydrastis (84 mg.): 2 caps with each meal\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Althea officinalis (Marshmallow)\n" +
                        "       Curcuma longa (Tumeric)\n" +
                        "       Echinacea angustifolia (Purple cone flower)\n" +
                        "       Geranium maculatum (Wild geranium, Cranesbill)\n" +
                        "       Hydrastis canadensis (Goldenseal)\n" +
                        "       Ulmus fulva (Slippery Elm, American elm)"
                ss = SpannableString(botanical_detail)
            }

            "Age-Related Macular Degeneration" -> {
                botanical_detail = "• Ginkgo biloba: 40 mg. (24% ginkgo heterosides)\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Ginkgo biloba (Ginkgo)\n" +
                        "       Vaccinium myrtillus (Bilberry)"
                ss = SpannableString(botanical_detail)

            }
            "Aging Prevention" -> {
                botanical_detail = "• Tincture or standardized extract (24% ginkgo heterosides) - Ginkgo biloba: 40 mg. TID, starting with 20 mg. daily and gradually increasing to 40 mg. TID\n" +
                        "• Tincture - Panax ginseng, Salvia miltiorrhiza, Withania somnifera: 10 drops TID with warm water\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Ginkgo biloba (Ginkgo)\n" +
                        "       Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "       Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "       Salvia miltiorrhiza (Dan shen)\n" +
                        "       Withania somnifera (Ashwagandha)"
                ss = SpannableString(botanical_detail)

            }
            "AIDS" -> {
                botanical_detail = "• Tincture that reduces reverse transcriptase - Glycyrrhiza glabra: take 1/4 tsp. TID\n" +
                        "• Tincture that is antiviral and immune stimulating - *Echinacea angustifolia (2), *Ligusticum porteri (2), Allium sativum (1), Astragalus membranaceus (2), *Arctium lappa (1): take 1/4 tsp. TID\n" +
                        "• Tincture for nausea, digestive problems, and to gain weight - *Acorus calamus (4), *Hydrastis canadensis (4): take 1/4 tsp. TID\n" +
                        "• Tincture - Hypericum perforatum: take 1 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Acorus calamus (Sweetflag, Calamus)\n" +
                        "       Allium sativum (Garlic)\n" +
                        "       Arctium lappa (Burdock)\n" +
                        "       Astragalus membranaceus (Astragalus, Milk vetch)\n" +
                        "       Curcuma longa (Tumeric)\n" +
                        "       Echinacea angustifolia (Purple cone flower)\n" +
                        "       Glycyrrhiza glabra (Licorice)\n" +
                        "       Hydrastis canadensis (Goldenseal)\n" +
                        "       Hypericum perforatum (St. John's wort)\n" +
                        "       Ligusticum porteri (Osha)\n"
                ss = SpannableString(botanical_detail)

            }
            "Allergies" -> {
                botanical_detail = "• Tincture - *Berberis vulgaris (1), *Capsicum frutescens (2), *Hydrastis canadensis (2), *Urtica urens (2), *Linum usitatissimum (1): 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Achillea millefolium (Yarrow)\n" +
                        "       Allium sativum (Garlic)\n" +
                        "       Angelica sinensis (Dong quai)\n" +
                        "       Arctostaphylos uva ursi (Bearberry)\n" +
                        "       Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "       Capsicum frutescens (Cayenne, Red pepper)\n" +
                        "       Ephedra sinica (Ma huang)\n" +
                        "       Glycyrrhiza glabra (Licorice)\n" +
                        "       Hydrastis canadensis (Goldenseal)\n" +
                        "       Linum usitatissimum (Flax, Linseed)\n" +
                        "       Spilanthes acmella (Paracress)\n" +
                        "       Urtica urens (Nettles)"
                ss = SpannableString(botanical_detail)

            }
            "Alzheimer's Disease" -> {
                botanical_detail = "• Ginkgo biloba extract (24% ginkgo flavonglycosides): 80 mg. TID\n" +
                        "• Curcuma longa: 450 mg. (standardized to contain 95% curcuminoids) daily with food\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Astragalus membranaceus (Astragalus, Milk vetch)\n" +
                        "       Curcuma longa (Tumeric)\n" +
                        "       Ginkgo biloba (Ginkgo)\n" +
                        "       Withania somnifera (Ashwagandha)"
                ss = SpannableString(botanical_detail)
            }
            "Amenorrhea" -> {
                botanical_detail = "• Formula - Angelica sinensis (2), *Arctium lappa (2), *Taraxacum officinale (1), Glycyrrhiza glabra (2), *Leonurus cardiaca (1): take 1/4 tsp. TID between meals (use on days 1 - 15)\n" +
                        "• Formula - *Dioscorea villosa (3), *Smilax sarsaparilla (1): take 1/4 tsp. TID between meals (use on days 16 - 25)\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Aletris farinosa (True unicorn)\n" +
                        "       Angelica sinensis (Dong quai)\n" +
                        "       Arctium lappa (Burdock)\n" +
                        "       Caulophyllum thalictroides (Blue cohosh)\n" +
                        "       Chamaelirium luteum (False unicorn)\n" +
                        "       Cimicifuga racemosa (Black cohosh)\n" +
                        "       Dioscorea villosa (Wild yam)\n" +
                        "       Glycyrrhiza glabra (Licorice)\n" +
                        "       Juniperus communis (Juniper)\n" +
                        "       Leonurus cardiaca (Motherwort)\n" +
                        "       Melissa officinalis (Lemon balm)\n" +
                        "       Mitchella repens (Squawvine, Partridge berry)\n" +
                        "       Salvia officinalis (Sage)\n" +
                        "       Smilax sarsaparilla (Sarsaparilla)\n" +
                        "       Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "       Thuja plicata (Western cedar)\n" +
                        "       Verbena officinalis (Vervain)\n" +
                        "       Vitex agnus castus (Chaste tree, Monk's pepper)"
                ss = SpannableString(botanical_detail)

            }
            "Anorexia Nervosa" -> {
                botanical_detail = "• Tincture - *Acorus calamus (4), *Hydrastis canadensis (4): take 1/4 tsp. TID\n" +
                        "• Tincture - *Glycyrrhiza glabra (Licorice): take 1/4 tsp. at lunchtime (Licorice makes more adrenal cortical hormone available)\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Acorus calamus (Sweetflag, Calamus)\n" +
                        "       Glycyrrhiza glabra (Licorice)\n" +
                        "       Hydrastis canadensis (Goldenseal)\n" +
                        "       Hypericum perforatum (St. John's wort)\n" +
                        "       Taraxacum officinale (Dandelion, Lion's tooth)"
                ss = SpannableString(botanical_detail)

            }
            "Aphthous Stomatitis" -> {
                botanical_detail = "• Mouthwash - *Calendula officinalis, *Symphytum officinale, *Commiphora molmol, *Berberis vulgaris, *Hamamelis virginiana, *Baptisia tintoria, *Zanthoxylum clava-herculis, *Sanguinaria, *Thuja plicata, *Melaleuca alternifolia: rinse and expel\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Baptisia tintoria (Wild indigo)\n" +
                        "       Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "       Calendula officinalis (Marigold)\n" +
                        "       Commiphora molmol (Myrrh)\n" +
                        "       Hamamelis virginiana (Witch hazel)\n" +
                        "       Hydrastis canadensis (Goldenseal)\n" +
                        "       Melaleuca alternifolia (Tea tree)\n" +
                        "       Salvia officinalis (Sage)\n" +
                        "       Sanguinaria canadensia (Blood root)\n" +
                        "       Symphytum officinale (Comfrey)\n" +
                        "       Thuja plicata (Western cedar)\n" +
                        "       Zanthoxylum clava-herculis (Southern prickly ash)"
                ss = SpannableString(botanical_detail)
            }
            "Arthritis, Gout" -> {
                botanical_detail = "• Tincture - Vaccinium myrtillis: 1/4 tsp. 3 times a day\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Agrimonia eupatorium (Agrimony)\n" +
                        "       Arctium lappa (Burdock)\n" +
                        "       Armoracia rusticana (Horseradish)\n" +
                        "       Filipendula ulmaria (Meadowsweet)\n" +
                        "       Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "       Juniperus communis (Juniper)\n" +
                        "       Petroselinum crispum (Parsley)\n" +
                        "       Stellaria media (Chickweed)\n" +
                        "       Urtica urens (Nettles)\n" +
                        "       Vaccinium myrtillus (Bilberry)"
                ss = SpannableString(botanical_detail)

            }
            "Arthritis, Osteo" -> {
                botanical_detail = "• Dry Herbs - Harpagophytum (248 mg.), Yucca (248 mg.), Juniperus (124 mg.), Angelica s. (124 mg.), Arctium (124 mg.), Cimicifuga (124 mg.), Medicago seed and leaf (248 mg. total): take 2 capsules TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Angelica sinensis (Dong quai)\n" +
                        "       Arctium lappa (Burdock)\n" +
                        "       Cimicifuga racemosa (Black cohosh)\n" +
                        "       Filipendula ulmaria (Meadowsweet)\n" +
                        "       Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "       Juniperus communis (Juniper)\n" +
                        "       Medicago sativa (Alfalfa)\n" +
                        "       Urtica urens (Nettles)\n" +
                        "       Yucca spp. (Yucca)"
                ss = SpannableString(botanical_detail)

            }
            "Arthritis, Psoriatic" -> {
                botanical_detail = "• Dry Herbs (for arthritis) - Harpagophytum (248 mg.), Yucca (248 mg.), Juniperus (124 mg.), Angelica s. (124 mg.), Arctium (124 mg.), Cimicifuga (124 mg.), Medicago (248 mg.): take 2 capsules TID\n" +
                        "• Tincture (for psoriasis) - Hydrastis (1), Arctium (1), Allium sativum (1), Smilax (2), Glycyrrhiza (2), Galium (1): 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Agrimonia eupatorium (Agrimony)\n" +
                        "       Allium sativum (Garlic)\n" +
                        "       Ammi visnaga (Khella)\n" +
                        "       Angelica sinensis (Dong quai)\n" +
                        "       Arctium lappa (Burdock)\n" +
                        "       Camellia sinensis (Green tea)\n" +
                        "       Cimicifuga racemosa (Black cohosh)\n" +
                        "       Curcuma longa (Tumeric)\n" +
                        "       Dioscorea villosa (Wild yam)\n" +
                        "       Equisetum arvense (Shave grass, Horsetail)\n" +
                        "       Filipendula ulmaria (Meadowsweet)\n" +
                        "       Galium aparine (Cleavers, Bed straw)\n" +
                        "       Glycyrrhiza glabra (Licorice)\n" +
                        "       Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "       Hydrastis canadensis (Goldenseal)\n" +
                        "       Juniperus communis (Juniper)\n" +
                        "       Larrea tridentata (Chapparrel, Creosote bush, Cresotum)\n" +
                        "       Linum usitatissimum (Flax, Linseed)\n" +
                        "       Medicago sativa (Alfalfa)\n" +
                        "       Silybum marianum (Milk thistle)\n" +
                        "       Smilax sarsaparilla (Sarsaparilla)\n" +
                        "       Stellaria media (Chickweed)\n" +
                        "       Stillingia sylvatica (Queen's root, Queen's delight)\n" +
                        "       Symphytum officinale (Comfrey)\n" +
                        "       Yucca spp. (Yucca)\n" +
                        "       Zanthoxylum clava-herculis (Southern prickly ash)\n" +
                        "       Zingiber officinale (Ginger)\n"
                ss = SpannableString(botanical_detail)

            }
            "Arthritis, Rheumatoid" -> {
                botanical_detail = "• Curcuma longa: 450 mg. (standardized to contain 95% curcuminoids) daily with food\n" +
                        "• Dry Herbs - Harpagophytum (248 mg.), Yucca (248 mg.), Juniperus (124 mg.), Angelica s. (124 mg.), Arctium (124 mg.), Cimicifuga (124 mg.), Medicago (248 mg.): take 2 capsules TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Agrimonia eupatorium (Agrimony)\n" +
                        "       Angelica sinensis (Dong quai)\n" +
                        "       Arctium lappa (Burdock)\n" +
                        "       Capsicum frutescens (Cayenne, Red pepper)\n" +
                        "       Caulophyllum thalictroides (Blue cohosh)\n" +
                        "       Cimicifuga racemosa (Black cohosh)\n" +
                        "       Crataegus oxycantha (Hawthorne)\n" +
                        "       Curcuma longa (Tumeric)\n" +
                        "       Dioscorea villosa (Wild yam)\n" +
                        "       Equisetum arvense (Shave grass, Horsetail)\n" +
                        "       Filipendula ulmaria (Meadowsweet)\n" +
                        "       Fucus vesiculosus (Bladderwrack, Kelp)\n" +
                        "       Galium aparine (Cleavers, Bed straw)\n" +
                        "       Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "       Juniperus communis (Juniper)\n" +
                        "       Larrea tridentata (Chapparrel, Creosote bush, Cresotum)\n" +
                        "       Linum usitatissimum (Flax, Linseed)\n" +
                        "       Lobelia inflata (Indian tobacco, Puke weed)\n" +
                        "       Medicago sativa (Alfalfa)\n" +
                        "       Momordica charantia (Bitter melon)\n" +
                        "       Stellaria media (Chickweed)\n" +
                        "       Tanacetum parthenium (Feverfew)\n" +
                        "       Thuja plicata (Western cedar)\n" +
                        "       Yucca spp. (Yucca)\n" +
                        "       Zanthoxylum clava-herculis (Southern prickly ash)\n" +
                        "       Zingiber officinale (Ginger)\n"
                ss = SpannableString(botanical_detail)

            }
            "Asthma" -> {
                botanical_detail = "• Respiratory Support - *Urtica urens, *Euphrasia officinalis , *Eriodictyon californicum, *Astragalus membranaceus , *Bupleurum chinense , *Inula helenium, *Zea mays, *Verbascum thapsus, *Armoracia rusticana: 1/4 tsp every 3 hours during an attack\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Allium sativum (Garlic)\n" +
                        "       Ammi visnaga (Khella)\n" +
                        "       Angelica sinensis (Dong quai)\n" +
                        "       Armoracia rusticana (Horseradish)\n" +
                        "       Astragalus membranaceus (Astragalus, Milk vetch)\n" +
                        "       Bupleurum chinense (Thoroughwax)\n" +
                        "       Caulophyllum thalictroides (Blue cohosh)\n" +
                        "       Curcuma longa (Tumeric)\n" +
                        "       Datura stramonium (Jimson Weed, Thornapple)\n" +
                        "       Ephedra sinica (Ma huang)\n" +
                        "       Eriodictyon californicum (Yerba santa)\n" +
                        "       Euphrasia officinalis (Eyebright)\n" +
                        "       Glycyrrhiza glabra (Licorice)\n" +
                        "       Grindelia camporum (Gumweed)\n" +
                        "       Inula helenium (Elecampane)\n" +
                        "       Lobelia inflata (Indian tobacco, Puke weed)\n" +
                        "       Marrubium vulgare (Horehound)\n" +
                        "       Matricaria chamomilla (German chamomile)\n" +
                        "       Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)\n" +
                        "       Piper methysticum (Kava kava)\n" +
                        "       Piscidia piscipula (Jamaican dogwood)\n" +
                        "       Sanguinaria canadensia (Blood root)\n" +
                        "       Schisandra chinensis (Wu wei zi)\n" +
                        "       Symplocarpus foetida (Skunk cabbage)\n" +
                        "       Tanacetum parthenium (Feverfew)\n" +
                        "       Thymus vulgaris (Thyme)\n" +
                        "       Tussilago farfara (Colt's foot)\n" +
                        "       Urtica urens (Nettles)\n" +
                        "       Verbascum thapsus (Mullein)\n" +
                        "       Zea mays (Corn silk)\n"
                ss = SpannableString(botanical_detail)

            }
            "Atherosclerosis" -> {
                botanical_detail = "• Formula - Medicago sativa (1), Salvia miltiorrhiza (1), Zingiber officinale (1), Crataegus oxycantha (2), Allium sativum (1), *Curcuma longa (1), Ginkgo biloba (1): take 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Allium sativum (Garlic)\n" +
                        "       Camellia sinensis (Green tea)\n" +
                        "       Capsicum frutescens (Cayenne, Red pepper)\n" +
                        "       Commiphora mukul (Guggulu)\n" +
                        "       Crataegus oxycantha (Hawthorne)\n" +
                        "       Curcuma longa (Tumeric)\n" +
                        "       Ginkgo biloba (Ginkgo)\n" +
                        "       Medicago sativa (Alfalfa)\n" +
                        "       Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "       Salvia miltiorrhiza (Dan shen)\n" +
                        "       Pausinystalia yohimbe (Yohimbe)\n" +
                        "       Zingiber officinale (Ginger)\n"
                ss = SpannableString(botanical_detail)

            }
            "Atopic Dermatitis" -> {
                botanical_detail = "• Tincture - Glycyrrhiza glabra, Ginkgo biloba, Arctium lappa, *Trifollium pratense, *Taraxacum officinale, *Smilax sarsaparilla, *Urtica urens, Medicago sativa*: (equal parts) 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Arctium lappa (Burdock)\n" +
                        "       Arctostaphylos uva ursi (Bearberry)\n" +
                        "       Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "       Centella asiatica (Gota kola)\n" +
                        "       Curcuma longa (Tumeric)\n" +
                        "       Galium aparine (Cleavers, Bed straw)\n" +
                        "       Ginkgo biloba (Ginkgo)\n" +
                        "       Glycyrrhiza glabra (Licorice)\n" +
                        "       Grindelia camporum (Gumweed)\n" +
                        "       Hamamelis virginiana (Witch hazel)\n" +
                        "       Matricaria chamomilla (German chamomile)\n" +
                        "       Medicago sativa (Alfalfa)\n" +
                        "       Melissa officinalis (Lemon balm)\n" +
                        "       Smilax sarsaparilla (Sarsaparilla)\n" +
                        "       Stillingia sylvatica (Queen's root, Queen's delight)\n" +
                        "       Symphytum officinale (Comfrey)\n" +
                        "       Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "       Trifollium pratense (Red clover)\n" +
                        "       Urtica urens (Nettles)"
                ss = SpannableString(botanical_detail)

            }
            "Attention Deficit Disorder" -> {
                botanical_detail = "• Compound Glycerite - *Passiflora incarnata, *Melissa officinalis, *Nepeta cataria, *Eschscholzia californica, *Lavendula angustifolia: for the acute child, 10 drops up to 5 times a day\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "       Allium sativum (Garlic)\n" +
                        "       Eschscholzia californica (California poppy)\n" +
                        "       Lavendula angustifolia (Lavender)\n" +
                        "       Melissa officinalis (Lemon balm)\n" +
                        "       Nepeta cataria (Catnip)\n" +
                        "       Passiflora incarnata (Passionflower)\n" +
                        "       Piper methysticum (Kava kava)"
                ss = SpannableString(botanical_detail)

            }
            "Autism" -> {
                botanical_detail = "• No researched botanical data available for this condition to date"
                ss = SpannableString(botanical_detail)

            }
            "Benign Prostatic Hypertrophy" ->{
                botanical_detail = "• Tincture - Serenoa repens (2), *Chimaphilla umbellata (2), *Galium aparine (1), Urtica urens (1), Pygeum africanum (2): take 1/4 tsp. TID-to be taken only if the possibility of prostate cancer has been eliminated\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Aesculus hippocastanum (Horsechestnut)\n" +
                        "Chimaphilia umbellata (Pipsissewa)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Pygeum africanum (Pygeum)\n" +
                        "Serenoa repens (Saw palmetto)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Zea mays (Corn silk)\n"
                ss = SpannableString(botanical_detail)
            }
            "Bipolar Disorder" ->{
                botanical_detail = "• Tincture - *Hypericum perforatum, *Piper methysticum, *Eleutherococcus senticosus, *Avena sativa, *Scutellaria laterifolia, *Matricaria chamomilla, Schisandra chinensis, *Lavender angustifolia essential oil, Sweet orange essential oil: 10 drops BID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Avena sativa (Oats)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Lavendula angustifolia (Lavender)\n" +
                        "Matricaria chamomilla (German chamomile)\n" +
                        "Piper methysticum (Kava kava)\n" +
                        "Schisandra chinensis (Wu wei zi)\n" +
                        "Scutellaria laterifolia (Skullcap)"
                ss = SpannableString(botanical_detail)
            }
            "Bladder Infection" ->{
                botanical_detail = "• Tincture - Arctostaphylos uva ursi, Usnea spp, Barosma betulina, Echinacea angustifolia, Zea mays: 1/4 tsp. every 4 hours till improved\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Armoracia rusticana (Horseradish)\n" +
                        "Atropa belladonna (Belladonna)\n" +
                        "Barosma betulina (Buchu)\n" +
                        "Camellia sinensis (Green tea)\n" +
                        "Chimaphilia umbellata (Pipsissewa)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Equisetum arvense (Shave grass, Horsetail)\n" +
                        "Eriodictyon californicum (Yerba santa)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Juniperus communis (Juniper)\n" +
                        "Petroselinum crispum (Parsley)\n" +
                        "Thuja plicata (Western cedar)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Usnea spp. (Old man's beard)\n" +
                        "Verbascum thapsus (Mullein)\n" +
                        "Zea mays (Corn silk)\n"
                ss = SpannableString(botanical_detail)
            }
            "Blood Pressure, High" ->{
                botanical_detail = "• Liquid Extract - Crataegus, Tilia, Ginkgo, Salvia m., Zingiber: 1/2 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Ammi visnaga (Khella)\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Bryonia alba (Bryony)\n" +
                        "Camellia sinensis (Green tea)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Cinnamomum saigonicum (Saigon cinnamon, Ceylon cinnamon)\n" +
                        "Crataegus oxycantha (Hawthorne)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Marrubium vulgare (Horehound)\n" +
                        "Melissa officinalis (Lemon balm)\n" +
                        "Passiflora incarnata (Passionflower)\n" +
                        "Petroselinum crispum (Parsley)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Salvia miltiorrhiza (Dan shen)\n" +
                        "Scutellaria laterifolia (Skullcap)\n" +
                        "Stellaria media (Chickweed)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Tilia europaea (Linden flower, Lime blossom)\n" +
                        "Viscum alba (Mistletoe)\n" +
                        "Withania somnifera (Ashwagandha)\n" +
                        "Pausinystalia yohimbe (Yohimbe)\n" +
                        "Zea mays (Corn silk)\n" +
                        "Zingiber officinale (Ginger)\n"
                ss = SpannableString(botanical_detail)
            }
            "BPH" ->{
                botanical_detail = "• Tincture - Serenoa repens (2), *Chimaphilla umbellata (2), *Galium aparine (1), Urtica urens (1), Pygeum africanum (2): take 1/4 tsp. TID-to be taken only if the possibility of prostate cancer has been eliminated\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Aesculus hippocastanum (Horsechestnut)\n" +
                        "Chimaphilia umbellata (Pipsissewa)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Pygeum africanum (Pygeum)\n" +
                        "Serenoa repens (Saw palmetto)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Zea mays (Corn silk)"
                ss = SpannableString(botanical_detail)
            }
            "Bronchitis" ->{
                botanical_detail = "• Tincture - *Usnea spp., *Glycyrrhiza glabra, *Echinacea angustifolia, *Lomatium disectum, *Asclepias tuberosa, *Sanguinaria canadensia, *Capsicum frutescens: 1/4 tsp QID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Armoracia rusticana (Horseradish)\n" +
                        "Asclepias tuberosa (Pleurisy root)\n" +
                        "Bupleurum chinense (Thoroughwax)\n" +
                        "Capsicum frutescens (Cayenne, Red pepper)\n" +
                        "Chelidonium majus (Greater celandine)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Ephedra sinica (Ma huang)\n" +
                        "Eriodictyon californicum (Yerba santa)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Grindelia camporum (Gumweed)\n" +
                        "Hyssopus officinalis (Hyssop)\n" +
                        "Inula helenium (Elecampane)\n" +
                        "Lobelia inflata (Indian tobacco, Puke weed)\n" +
                        "Lomatium disectum (Desert parsley)\n" +
                        "Marrubium vulgare (Horehound)\n" +
                        "Nepeta cataria (Catnip)\n" +
                        "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)\n" +
                        "Pimpinella anisum (Anise)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Sanguinaria canadensia (Blood root)\n" +
                        "Sticta pulmonaria (Lungwort)\n" +
                        "Stillingia sylvatica (Queen's root, Queen's delight)\n" +
                        "Symphytum officinale (Comfrey)\n" +
                        "Thuja plicata (Western cedar)\n" +
                        "Thymus vulgaris (Thyme)\n" +
                        "Trifollium pratense (Red clover)\n" +
                        "Trigonella foenum-graecum (Fenugreek)\n" +
                        "Trillium erectum (Beth root)\n" +
                        "Tussilago farfara (Colt's foot)\n" +
                        "Usnea spp. (Old man's beard)\n" +
                        "Verbascum thapsus (Mullein)\n" +
                        "Verbena officinalis (Vervain)\n" +
                        "Zingiber officinale (Ginger)\n"
                ss = SpannableString(botanical_detail)
            }
            "Cancer Prevention" ->{
                botanical_detail = "• Tincture (Hoxsey Formula) - Trifollium pratense, Baptisia tinctoria, Arctium lappa, Berberis spp, Rhamnus purshiana, Rhamnus frangula, Phytolacca decandraa, Stillingia sylvatica, Zanthoxyllum clava-herculis, Glycyrrhiza glabra, 3% WV potassium iodide: 1/4 tsp. BID\n" +
                        "• Curcuma longa: 450 mg. (standardized to contain 95% curcuminoids) daily with food\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Baptisia tintoria (Wild indigo)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Camellia sinensis (Green tea)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Phytolacca decandra (Poke, Pokeweed)\n" +
                        "Rhamnus frangula (Buckthorn)\n" +
                        "Rhamnus purshiana (Cascara)\n" +
                        "Stillingia sylvatica (Queen's root, Queen's delight)\n" +
                        "Trifollium pratense (Red clover)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)\n"
                ss = SpannableString(botanical_detail)
            }
            "Candida Infection" ->{
                botanical_detail = "• Liquid Extract - Spilanthes acmella, Tabebuia impetiginosa, *Usnea spp, Berberis vulgaris, Thymus vulgaris: 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Melaleuca alternifolia (Tea tree)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Spilanthes acmella (Paracress)\n" +
                        "Tabebuia impetiginosa (Pau d' arco)\n" +
                        "Thymus vulgaris (Thyme)\n" +
                        "Usnea spp. (Old man's beard)"
                ss = SpannableString(botanical_detail)
            }
            "Candidiasis" ->{
                botanical_detail = "• Liquid Extract - Spilanthes acmella, Tabebuia impetiginosa, *Usnea spp, Berberis vulgaris, Thymus vulgaris: 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Melaleuca alternifolia (Tea tree)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Spilanthes acmella (Paracress)\n" +
                        "Tabebuia impetiginosa (Pau d' arco)\n" +
                        "Thymus vulgaris (Thyme)\n" +
                        "Usnea spp. (Old man's beard)"
                ss = SpannableString(botanical_detail)
            }
            "Canker Sores" ->{
                botanical_detail = "• Mouthwash - *Calendula officinalis, *Symphytum officinale, *Commiphora molmol, *Berberis vulgaris, *Hamamelis virginiana, *Baptisia tintoria, *Zanthoxylum clava-herculis, *Sanguinaria, *Thuja plicata, *Melaleuca alternifolia: rinse and expel\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Baptisia tintoria (Wild indigo)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Commiphora molmol (Myrrh)\n" +
                        "Hamamelis virginiana (Witch hazel)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Melaleuca alternifolia (Tea tree)\n" +
                        "Salvia officinalis (Sage)\n" +
                        "Sanguinaria canadensia (Blood root)\n" +
                        "Symphytum officinale (Comfrey)\n" +
                        "Thuja plicata (Western cedar)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)"
                ss = SpannableString(botanical_detail)
            }
            "Cataract Prevention" ->{
                botanical_detail = "• Tincture - Vaccinium myrtillus: take 1/4 tsp. TID\n" +
                        "• Curcuma longa: 450 mg. (standardized to contain 95% curcuminoids) daily with food\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Vaccinium myrtillus (Bilberry)"
                ss = SpannableString(botanical_detail)
            }
            "CFS/CFIDS" ->{
                botanical_detail = "• Rejuvenate - Centella asiatica, Ginkgo biloba, Eleutherococcus senticosus, *Urtica urens, *Rosmarius officinalis, Fucus vesiculosus, *Zanthoxyllum clava-herculus: 1/4 tsp. TID between meals\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Fucus vesiculosus (Bladderwrack, Kelp)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Medicago sativa (Alfalfa)\n" +
                        "Rosmarius officinalis (Rosemary)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Withania somnifera (Ashwagandha)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)"
                ss = SpannableString(botanical_detail)
            }
            "CHF" ->{
                botanical_detail = "• Tincture - Crataegus oxycantha (Hawthorne): 1/4 tsp TID\n" +
                        "• Circulatory Pizazz Tincture - Ginkgo biloba, Panax ginseng, Arctium lappa, Zingiber officinale, Zanthoxyllum clava-herculis officinalis, Rosmarius officinalis, Capsicum frutescens: 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Capsicum frutescens (Cayenne, Red pepper)\n" +
                        "Crataegus oxycantha (Hawthorne)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "Petroselinum crispum (Parsley)\n" +
                        "Rosmarius officinalis (Rosemary)\n" +
                        "Stellaria media (Chickweed)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)\n" +
                        "Zea mays (Corn silk)\n" +
                        "Zingiber officinale (Ginger)"
                ss = SpannableString(botanical_detail)
            }
            "Cholecystitis" ->{
                botanical_detail = "• Tincture - *Chelidonium majus (2), *Chionanthus virginicus (1), *Dioscorea villosa (1), *Lobelia disectum (.5), *Taraxacum officinale (1.5), *Piscidia piscipula (1), *Gentiana lutea (1): 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Chelidonium majus (Greater celandine)\n" +
                        "Chionanthus virginicus (Fringe tree)\n" +
                        "Cynara scolymus (Artichoke)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Eschscholzia californica (California poppy)\n" +
                        "Gentiana Lutea (Gentian)\n" +
                        "Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "Linum usitatissimum (Flax, Linseed)\n" +
                        "Lobelia inflata (Indian tobacco, Puke weed)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Piper methysticum (Kava kava)\n" +
                        "Piscidia piscipula (Jamaican dogwood)\n" +
                        "Rheum officinalis (Rhubarb)\n" +
                        "Silybum marianum (Milk thistle)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Verbena officinalis (Vervain)"
                ss = SpannableString(botanical_detail)
            }
            "Cholelithiasis" ->{
                botanical_detail = "• Tincture - *Chelidonium majus (2), *Chionanthus virginicus (1), *Dioscorea villosa (1), *Lobelia disectum (.5), *Taraxacum officinale (1.5), *Piscidia piscipula (1), *Gentiana lutea (1): 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Chelidonium majus (Greater celandine)\n" +
                        "Chionanthus virginicus (Fringe tree)\n" +
                        "Collinsonia canadensis (Stone root)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Cynara scolymus (Artichoke)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Eschscholzia californica (California poppy)\n" +
                        "Gentiana Lutea (Gentian)\n" +
                        "Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "Lobelia inflata (Indian tobacco, Puke weed)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Piscidia piscipula (Jamaican dogwood)\n" +
                        "Silybum marianum (Milk thistle)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Verbena officinalis (Vervain)\n"
                ss = SpannableString(botanical_detail)
            }
            "Chronic Fatigue Syndrome" ->{
                botanical_detail = "• Rejuvenate - Centella asiatica, Ginkgo biloba, Eleutherococcus senticosus, *Urtica urens, *Rosmarius officinalis, Fucus vesiculosus, *Zanthoxyllum clava-herculus: 1/4 tsp. TID between meals\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Fucus vesiculosus (Bladderwrack, Kelp)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Medicago sativa (Alfalfa)\n" +
                        "Rosmarius officinalis (Rosemary)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Withania somnifera (Ashwagandha)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)"
                ss = SpannableString(botanical_detail)
            }
            "Colitis" ->{
                botanical_detail = "• Dry herbs - Althea officinalis (110 mg.), Geranium maculatum (110 mg.), Echinacea spp. (110 mg.), Ulmus ruba (110 mg.), Curcuma longa (110 mg.), Hydrastis canadensis (42 mg.) : 1-2 caps before each meal\n" +
                        "• Peppermint Oil Capsules: 1/2 hr. before meals\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Geranium maculatum (Wild geranium, Cranesbill)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Ulmus fulva (Slippery Elm, American elm)"
                ss = SpannableString(botanical_detail)
            }
            "Congestive Heart Failure" ->{
                botanical_detail = "• Tincture - Crataegus oxycantha (Hawthorne): 1/4 tsp TID\n" +
                        "• Circulatory Pizazz Tincture - Ginkgo biloba, Panax ginseng, Arctium lappa, Zingiber officinale, Zanthoxyllum clava-herculis officinalis, Rosmarius officinalis, Capsicum frutescens: 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Capsicum frutescens (Cayenne, Red pepper)\n" +
                        "Crataegus oxycantha (Hawthorne)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "Petroselinum crispum (Parsley)\n" +
                        "Rosmarius officinalis (Rosemary)\n" +
                        "Stellaria media (Chickweed)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)\n" +
                        "Zea mays (Corn silk)\n" +
                        "Zingiber officinale (Ginger)"
                ss = SpannableString(botanical_detail)
            }
            "Constipation" ->{
                botanical_detail = "• Constipation Tea - *Cascara sagrada, *Berberis aquifolia, *Foeniculum vulgare seeds, *Symphytum officinalis, Eugenia caryophyllata (Cloves): 1 tsp. per 8 oz. hot water TID for 1 - 4 weeks, sweeten with Honey if needed (see reference to Honey in Diet and Nutrition section) Note: This is an irritant laxative formula and should be used only short term.\n" +
                        "• Follow-up Tea - *Taraxicum officinalis, *Arctilum lappa, *Berberis aquifolia, *Zingiber officinalis, *Astragalus membranaceus, *Glycyrrhiza glabra, *Cinnamomon saigonicum bark, Orange peel: 1 tsp. per 8 oz. hot water 3 - 6 times a day for several months\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Astragalus membranaceus (Astragalus, Milk vetch)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Cinnamomum saigonicum (Saigon cinnamon, Ceylon cinnamon)\n" +
                        "Foeniculum vulgare (Fennel)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Symphytum officinale (Comfrey)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Zingiber officinale (Ginger)"
                ss = SpannableString(botanical_detail)
            }
            "Crohn's Disease" ->{
                botanical_detail = "• Dry herbs - Althea officinalis (220 mg.), *Geranium maculatum (220 mg.), Echinacea angustifolia (220 mg.), *Ulmus fulva (220 mg.), Curcuma longa (220 mg.), *Hydrastis canadensis (84 mg.): 2 caps with each meal\n" +
                        "• Curcuma longa: 450 mg. (standardized to contain 95% curcuminoids) daily with food\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Geranium maculatum (Wild geranium, Cranesbill)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Ulmus fulva (Slippery Elm, American elm)"
                ss = SpannableString(botanical_detail)
            }
            "Cystitis" ->{
                botanical_detail = "• Tincture - Arctostaphylos uva ursi, Usnea spp, Barosma betulina, Echinacea angustifolia, Zea mays: 1/4 tsp. every 4 hours till improved\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Armoracia rusticana (Horseradish)\n" +
                        "Atropa belladonna (Belladonna)\n" +
                        "Barosma betulina (Buchu)\n" +
                        "Camellia sinensis (Green tea)\n" +
                        "Chimaphilia umbellata (Pipsissewa)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Equisetum arvense (Shave grass, Horsetail)\n" +
                        "Eriodictyon californicum (Yerba santa)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Juniperus communis (Juniper)\n" +
                        "Petroselinum crispum (Parsley)\n" +
                        "Thuja plicata (Western cedar)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Usnea spp. (Old man's beard)\n" +
                        "Verbascum thapsus (Mullein)\n" +
                        "Zea mays (Corn silk)\n"
                ss = SpannableString(botanical_detail)
            }
            "Depression" ->{
                botanical_detail = "• Hypericum perforatum Tincture -1/4 tsp. TID\n" +
                        "• Ginkgo biloba - 40 - 80 mg. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Avena sativa (Oats)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Lavendula angustifolia (Lavender)\n" +
                        "Melissa officinalis (Lemon balm)\n" +
                        "Piper methysticum (Kava kava)\n" +
                        "Rosmarius officinalis (Rosemary)\n" +
                        "Schisandra chinensis (Wu wei zi)\n" +
                        "Scutellaria laterifolia (Skullcap)\n" +
                        "Valeriana officinalis (Valerian)\n" +
                        "Verbena officinalis (Vervain)"
                ss = SpannableString(botanical_detail)
            }
            "Diabetes Mellitus" ->{
                botanical_detail = "• Liquid Extract - Gymnema sylvestre , Vaccinium myrtillus , Trigonella foenum graecum , *Taraxacum officinale , Oplopanax horridum : 1/4 tsp TID\n" +
                        "• Curcuma longa: 450 mg. (standardized to contain 95% curcuminoids) daily with food\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Gymnema sylvestre (Gymnema)\n" +
                        "Momordica charantia (Bitter melon)\n" +
                        "Oplopanax horridum (Devil's club)\n" +
                        "Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Trigonella foenum-graecum (Fenugreek)\n" +
                        "Vaccinium myrtillus (Bilberry)\n" +
                        "Zingiber officinale (Ginger)"
                ss = SpannableString(botanical_detail)
            }
            "Dysmenorrhea" ->{
                botanical_detail = "• Elixir - *Caulophylum thalictroides, Viburnum opulus, *Chamaelirium luteum, *Mitchella repens: Mother's cordial, take 1/4 tsp. every 4 hours for five days before menses is to begin\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Achillea millefolium (Yarrow)\n" +
                        "Aletris farinosa (True unicorn)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Caulophyllum thalictroides (Blue cohosh)\n" +
                        "Chamaelirium luteum (False unicorn)\n" +
                        "Cimicifuga racemosa (Black cohosh)\n" +
                        "Cinnamomum saigonicum (Saigon cinnamon, Ceylon cinnamon)\n" +
                        "Corydalis bulbosa (Corydalis)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Juniperus communis (Juniper)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Mitchella repens (Squawvine, Partridge berry)\n" +
                        "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)\n" +
                        "Piscidia piscipula (Jamaican dogwood)\n" +
                        "Salvia officinalis (Sage)\n" +
                        "Tanacetum parthenium (Feverfew)\n" +
                        "Vaccinium myrtillus (Bilberry)\n" +
                        "Valeriana officinalis (Valerian)\n" +
                        "Verbena officinalis (Vervain)\n" +
                        "Viburnum opulus (Cramp bark)"
                ss = SpannableString(botanical_detail)
            }

            "Ear Infection" ->{
                botanical_detail = "• Tincture - Echinacea (1), Allium sativum (1), Hydrastis (1), Matricaria (1), Galium (1), Glycyrrhiza (1), Euphrasia (1), Sambucus (1): take 1/4 tsp. TID to QID\n" +
                        "• Ear drops - Hypericum oil, Calendula oil, Verbascum oil, Allium s. oil, Larrea oil, Verbascum glycerite , Vitamin E oil: 1-2 warm drops\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Euphrasia officinalis (Eyebright)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Larrea tridentata (Chapparrel, Creosote bush, Cresotum)\n" +
                        "Matricaria chamomilla (German chamomile)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Sambucus canadensis, nigra (Elder)\n" +
                        "Verbascum thapsus (Mullein)\n"
                ss = SpannableString(botanical_detail)
            }
            "Eczema, Chronic" ->{
                botanical_detail = "• Tincture - Glycyrrhiza glabra, Ginkgo biloba, Arctium lappa, *Trifollium pratense, *Taraxacum officinale, *Smilax sarsaparilla, *Urtica urens, Medicago sativa*: (equal parts) 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Grindelia camporum (Gumweed)\n" +
                        "Hamamelis virginiana (Witch hazel)\n" +
                        "Matricaria chamomilla (German chamomile)\n" +
                        "Medicago sativa (Alfalfa)\n" +
                        "Melissa officinalis (Lemon balm)\n" +
                        "Smilax sarsaparilla (Sarsaparilla)\n" +
                        "Stillingia sylvatica (Queen's root, Queen's delight)\n" +
                        "Symphytum officinale (Comfrey)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Trifollium pratense (Red clover)\n" +
                        "Urtica urens (Nettles)\n"
                ss = SpannableString(botanical_detail)
            }

            "Endometriosis" ->{
                botanical_detail = "• Tincture - (for acute dysmenorrhea due to endometriosis) *Cimicifuga racemosa (3), *Dioscorea villosa (2), *Viburnum opulus (2), *Glycyrrhiza glabra (1), *Atropa belladonna (30 drops): 1 tsp. every 2 hours for pain\n" +
                        "• Tincture - (chronic endometriosis) *Aconitum napellus (1 1/2), *Gelsemium sempervirens (1 1/2), *Bryonia alba (1 1/2), *Phytolacca decandra (3), Water QSAD: 5 drops QID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Aconitum napellus (Aconite, Monkshood)\n" +
                        "Atropa belladonna (Belladonna)\n" +
                        "Bryonia alba (Bryony)\n" +
                        "Chelidonium majus (Greater celandine)\n" +
                        "Chionanthus virginicus (Fringe tree)\n" +
                        "Cimicifuga racemosa (Black cohosh)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Gelsemium sempervirens (Yellow jasmine, Gelsemium)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Phytolacca decandra (Poke, Pokeweed)\n" +
                        "Viburnum opulus (Cramp bark)"
                ss = SpannableString(botanical_detail)
            }

            "Erectile Dysfunction" ->{
                botanical_detail = "• Ginkgo biloba extract (24% ginkgo heterosides): 40mg. TID\n" +
                        "• Impotence Formula - (equal parts) Pausinystalia , Panax , Pygeum , Centella : 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Chamaelirium luteum (False unicorn)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "Pygeum africanum (Pygeum)\n" +
                        "Serenoa repens (Saw palmetto)\n" +
                        "Trigonella foenum-graecum (Fenugreek)\n" +
                        "Withania somnifera (Ashwagandha)\n" +
                        "Pausinystalia yohimbe (Yohimbe)"
                ss = SpannableString(botanical_detail)
            }

            "Fertility" ->{
                botanical_detail = "Female:\n" +
                        "• Vitex agnus castus: 1/2 tsp. BID - TID for several months - use for annovulation\n" +
                        "• Aletris farinosa: 1/2 tsp. BID - TID for several months - use for low E2\n" +
                        "• Formula 1 - Angelica sinensis (2), *Arctium lappa (2), *Taraxacum officinale (1), Glycyrrhiza glabra (2), *Leonurus cardiaca (1): take 1/4 tsp. TID between meals (use on days 1 - 15) - use for amenorrhea to start cycle\n" +
                        "• Formula 2 - *Dioscorea villosa (3), *Smilax sarsaparilla (1): take 1/4 tsp. TID between meals (use on days 16 - 25) - use for amenorrhea to start cycle\n" +
                        "   Male:\n" +
                        "• Astragalus membranaceus: 1/2 tsp. BID - TID for several months\n" +
                        "• Panax ginseng: 1/2 tsp. BID - TID for several months\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Aletris farinosa (True unicorn)\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Astragalus membranaceus (Astragalus, Milk vetch)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "Smilax sarsaparilla (Sarsaparilla)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Vitex agnus castus (Chaste tree, Monk's pepper)"
                ss = SpannableString(botanical_detail)
            }
            "Fibrocystic Breast Disease" ->{
                botanical_detail = "• Formula - *Phytolacca decandra (2), *Arctium lappa (1), *Berberis vulgaris (1), *Scutellaria laterifolia (1), *Vitex agnus castus (1), *Dioscorea villosa (1), *Medicago sativa leaf and seed (1): take 1 tsp. QID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Medicago sativa (Alfalfa)\n" +
                        "Phytolacca decandra (Poke, Pokeweed)\n" +
                        "Scutellaria laterifolia (Skullcap)\n" +
                        "Vitex agnus castus (Chaste tree, Monk's pepper)\n"
                ss = SpannableString(botanical_detail)
            }

            "Fibromyalgia" ->{
                botanical_detail = "• Liquid Extract - *Passiflora incarnata (1), *Corydalis bulbosa (2), *Valerian officinalis (2), *Filipendula ulmaria (1), *Piscidia piscipula (1): 1/4 tsp TID\n" +
                        "• Chlorella pyrenoidosa extract - tablets or liquid QID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Corydalis bulbosa (Corydalis)\n" +
                        "Filipendula ulmaria (Meadowsweet)\n" +
                        "Passiflora incarnata (Passionflower)\n" +
                        "Piper methysticum (Kava kava)\n" +
                        "Piscidia piscipula (Jamaican dogwood)\n" +
                        "Valeriana officinalis (Valerian)\n"
                ss = SpannableString(botanical_detail)
            }
            "Gallbladder Disease" ->{
                botanical_detail = "• Tincture - *Chelidonium majus (2), *Chionanthus virginicus (1), *Dioscorea villosa (1), *Lobelia disectum (.5), *Taraxacum officinale (1.5), *Piscidia piscipula (1), *Gentiana lutea (1): 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Chelidonium majus (Greater celandine)\n" +
                        "Chionanthus virginicus (Fringe tree)\n" +
                        "Cynara scolymus (Artichoke)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Eschscholzia californica (California poppy)\n" +
                        "Gentiana Lutea (Gentian)\n" +
                        "Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "Linum usitatissimum (Flax, Linseed)\n" +
                        "Lobelia inflata (Indian tobacco, Puke weed)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Piper methysticum (Kava kava)\n" +
                        "Piscidia piscipula (Jamaican dogwood)\n" +
                        "Rheum officinalis (Rhubarb)\n" +
                        "Silybum marianum (Milk thistle)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Verbena officinalis (Vervain)\n"
                ss = SpannableString(botanical_detail)
            }
            "Gallstones" ->{
                botanical_detail = "• Tincture - *Chelidonium majus (2), *Chionanthus virginicus (1), *Dioscorea villosa (1), *Lobelia disectum (.5), *Taraxacum officinale (1.5), *Piscidia piscipula (1), *Gentiana lutea (1): 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Chelidonium majus (Greater celandine)\n" +
                        "Chionanthus virginicus (Fringe tree)\n" +
                        "Collinsonia canadensis (Stone root)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Cynara scolymus (Artichoke)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Eschscholzia californica (California poppy)\n" +
                        "Gentiana Lutea (Gentian)\n" +
                        "Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "Lobelia inflata (Indian tobacco, Puke weed)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Piscidia piscipula (Jamaican dogwood)\n" +
                        "Silybum marianum (Milk thistle)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Verbena officinalis (Vervain)"
                ss = SpannableString(botanical_detail)
            }
            "Gout" ->{
                botanical_detail = "• Tincture - Vaccinium myrtillis: 1/4 tsp. 3 times a day\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Armoracia rusticana (Horseradish)\n" +
                        "Filipendula ulmaria (Meadowsweet)\n" +
                        "Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "Juniperus communis (Juniper)\n" +
                        "Petroselinum crispum (Parsley)\n" +
                        "Stellaria media (Chickweed)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Vaccinium myrtillus (Bilberry)"
                ss = SpannableString(botanical_detail)
            }
            "Headache, General" ->{
                botanical_detail = "• Liquid Extract - *Passiflora incarnata (1), *Corydalis bulbosa (2), *Valerian officinalis (2), *Filipendula ulmaria (1), *Piscidia piscipula (1): 1/4 tsp. every hour until headache eases\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Bryonia alba (Bryony)\n" +
                        "Chelidonium majus (Greater celandine)\n" +
                        "Corydalis bulbosa (Corydalis)\n" +
                        "Filipendula ulmaria (Meadowsweet)\n" +
                        "Lavendula angustifolia (Lavender)\n" +
                        "Melissa officinalis (Lemon balm)\n" +
                        "Passiflora incarnata (Passionflower)\n" +
                        "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)\n" +
                        "Piper methysticum (Kava kava)\n" +
                        "Piscidia piscipula (Jamaican dogwood)\n" +
                        "Rosmarius officinalis (Rosemary)\n" +
                        "Sticta pulmonaria (Lungwort)\n" +
                        "Valeriana officinalis (Valerian)\n"
                ss = SpannableString(botanical_detail)
            }
            "Headache, Migraine" ->{
                botanical_detail = "• Tincture - Tanacetum parthenium (Feverfew) : 1/4 tsp TID\n" +
                        "• Dry herb - Petasites hybridus (Butterbur) : as directed by the particular manufacture\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)\n" +
                        "Tanacetum parthenium (Feverfew)\n" +
                        "Zingiber officinale (Ginger)"
                ss = SpannableString(botanical_detail)
            }
            "Hemorrhoids" ->{
                botanical_detail = "• Dry Herbs - *Collinsonia canadensis (314 mg.), Ruscus aculeatus (236 mg.), *Hamamelis virginiana (156 mg.), *Achillea millefolium (156 mg.), *Cinnamomum spp. (156 mg.), *Aesculus hippocastanum (78 mg.), *Corydalis bulbosa (34 mg.): 1 capsule TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Achillea millefolium (Yarrow)\n" +
                        "Aesculus hippocastanum (Horsechestnut)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Cinnamomum saigonicum (Saigon cinnamon, Ceylon cinnamon)\n" +
                        "Collinsonia canadensis (Stone root)\n" +
                        "Corydalis bulbosa (Corydalis)\n" +
                        "Hamamelis virginiana (Witch hazel)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Linum usitatissimum (Flax, Linseed)\n" +
                        "Ruscus aculeatus (Butcher's broom)\n" +
                        "Stillingia sylvatica (Queen's root, Queen's delight)"
                ss = SpannableString(botanical_detail)
            }
            "Hepatitis" ->{
                botanical_detail = "• Dried herbs - Silybum, Taraxacum, Cynara, Bupleurum, Berberis, Curcuma, Foeniculum, Glycyrrhiza: 2 capsules TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Bupleurum chinense (Thoroughwax)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Cynara scolymus (Artichoke)\n" +
                        "Foeniculum vulgare (Fennel)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Schisandra chinensis (Wu wei zi)\n" +
                        "Silybum marianum (Milk thistle)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)"
                ss = SpannableString(botanical_detail)
            }
            "Herpes Simplex" ->{
                botanical_detail = "• Liquid Extract - Echinacea , Hypericum , Hyssopus , Lomatium , Spilanthes , Thuja : 1/4 tsp. every hour during outbreak\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Bupleurum chinense (Thoroughwax)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Hyssopus officinalis (Hyssop)\n" +
                        "Inula helenium (Elecampane)\n" +
                        "Ligusticum porteri (Osha)\n" +
                        "Lomatium disectum (Desert parsley)\n" +
                        "Melissa officinalis (Lemon balm)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Phytolacca decandra (Poke, Pokeweed)\n" +
                        "Spilanthes acmella (Paracress)\n" +
                        "Tabebuia impetiginosa (Pau d' arco)\n" +
                        "Thuja plicata (Western cedar)"
                ss = SpannableString(botanical_detail)
            }
            "High Blood Pressure" ->{
                botanical_detail = "• Liquid Extract - Crataegus, Tilia, Ginkgo, Salvia m., Zingiber: 1/2 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Ammi visnaga (Khella)\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Bryonia alba (Bryony)\n" +
                        "Camellia sinensis (Green tea)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Cinnamomum saigonicum (Saigon cinnamon, Ceylon cinnamon)\n" +
                        "Crataegus oxycantha (Hawthorne)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Marrubium vulgare (Horehound)\n" +
                        "Melissa officinalis (Lemon balm)\n" +
                        "Passiflora incarnata (Passionflower)\n" +
                        "Petroselinum crispum (Parsley)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Salvia miltiorrhiza (Dan shen)\n" +
                        "Scutellaria laterifolia (Skullcap)\n" +
                        "Stellaria media (Chickweed)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Tilia europaea (Linden flower, Lime blossom)\n" +
                        "Viscum alba (Mistletoe)\n" +
                        "Withania somnifera (Ashwagandha)\n" +
                        "Pausinystalia yohimbe (Yohimbe)\n" +
                        "Zea mays (Corn silk)\n" +
                        "Zingiber officinale (Ginger)"
                ss = SpannableString(botanical_detail)
            }
            "High Cholesterol" ->{
                botanical_detail = "• Formula - Medicago sativa (1), Salvia miltiorrhiza (1), Zingiber officinale (1), Crataegus oxycantha (2), Allium sativum (1), *Curcuma longa (1), Ginkgo biloba (1): take 1/4 tsp. TID"
                ss = SpannableString(botanical_detail)
            }
            "HIV" ->{
                botanical_detail = "• Tincture that reduces reverse transcriptase - Glycyrrhiza glabra: take 1/4 tsp. TID\n" +
                        "• Tincture that is antiviral and immune stimulating - *Echinacea angustifolia (2), *Ligusticum porteri (2), Allium sativum (1), Astragalus membranaceus (2), *Arctium lappa (1): take 1/4 tsp. TID\n" +
                        "• Tincture for nausea, digestive problems, and to gain weight - *Acorus calamus (4), *Hydrastis canadensis (4): take 1/4 tsp. TID\n" +
                        "• Tincture - Hypericum perforatum: take 1 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Acorus calamus (Sweetflag, Calamus)\n" +
                        "Allium sativum (Garlic)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Astragalus membranaceus (Astragalus, Milk vetch)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Ligusticum porteri (Osha)\n"
                ss = SpannableString(botanical_detail)
            }
            "Hyperactivity" ->{
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
            }
            "Hypercholesterolemia" ->{
                botanical_detail = "• Formula - Medicago sativa (1), Salvia miltiorrhiza (1), Zingiber officinale (1), Crataegus oxycantha (2), Allium sativum (1), *Curcuma longa (1), Ginkgo biloba (1): take 1/4 tsp. TID"
                ss = SpannableString(botanical_detail)
            }
            "Hypertension" ->{
                botanical_detail = "• Liquid Extract - Crataegus, Tilia, Ginkgo, Salvia m., Zingiber: 1/2 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Ammi visnaga (Khella)\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Bryonia alba (Bryony)\n" +
                        "Camellia sinensis (Green tea)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Cinnamomum saigonicum (Saigon cinnamon, Ceylon cinnamon)\n" +
                        "Crataegus oxycantha (Hawthorne)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Marrubium vulgare (Horehound)\n" +
                        "Melissa officinalis (Lemon balm)\n" +
                        "Passiflora incarnata (Passionflower)\n" +
                        "Petroselinum crispum (Parsley)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Salvia miltiorrhiza (Dan shen)\n" +
                        "Scutellaria laterifolia (Skullcap)\n" +
                        "Stellaria media (Chickweed)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Tilia europaea (Linden flower, Lime blossom)\n" +
                        "Viscum alba (Mistletoe)\n" +
                        "Withania somnifera (Ashwagandha)\n" +
                        "Pausinystalia yohimbe (Yohimbe)\n" +
                        "Zea mays (Corn silk)\n" +
                        "Zingiber officinale (Ginger)\n"
                ss = SpannableString(botanical_detail)
            }
            "Hypothyroid" ->{
                botanical_detail = "• Liquid Extract - Commiphora mukul: 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Capsicum frutescens (Cayenne, Red pepper)\n" +
                        "Commiphora mukul (Guggulu)\n" +
                        "Fucus vesiculosus (Bladderwrack, Kelp)\n" +
                        "Ginkgo biloba (Ginkgo)\n"
                ss = SpannableString(botanical_detail)
            }
            "IBS" ->{
                botanical_detail = "• Dry herbs - Althea officinalis (110 mg.), Geranium maculatum (110 mg.), Echinacea spp. (110 mg.), Ulmus ruba (110 mg.), Curcuma longa (110 mg.), Hydrastis canadensis (42 mg.) : 1-2 caps before each meal\n" +
                        "• Peppermint Oil Capsules: 1/2 hr. before meals\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Geranium maculatum (Wild geranium, Cranesbill)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Ulmus fulva (Slippery Elm, American elm)\n"
                ss = SpannableString(botanical_detail)
            }
            "Impotence" ->{
                botanical_detail = "• Ginkgo biloba extract (24% ginkgo heterosides): 40mg. TID\n" +
                        "• Impotence Formula - (equal parts) Pausinystalia , Panax , Pygeum , Centella : 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Chamaelirium luteum (False unicorn)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "Pygeum africanum (Pygeum)\n" +
                        "Serenoa repens (Saw palmetto)\n" +
                        "Trigonella foenum-graecum (Fenugreek)\n" +
                        "Withania somnifera (Ashwagandha)\n" +
                        "Pausinystalia yohimbe (Yohimbe)"
                ss = SpannableString(botanical_detail)
            }
            "Incontinence, Stress" ->{
                botanical_detail = "• Tincture- *Chamaelirium luteum(10-25%), *Mitchella repens(10-25%), *Centella asiatica (10-25%), *Hypericum perforatum (10-25%), *Hamamelis virginiana (10-25%), *Zea mays(10-25%): 30-60 drops TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Chamaelirium luteum (False unicorn)\n" +
                        "Equisetum arvense (Shave grass, Horsetail)\n" +
                        "Hamamelis virginiana (Witch hazel)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Mitchella repens (Squawvine, Partridge berry)\n" +
                        "Thuja plicata (Western cedar)\n" +
                        "Zea mays (Corn silk)"
                ss = SpannableString(botanical_detail)
            }
            "Infertility" ->{
                botanical_detail = "   Female:\n" +
                        "• Vitex agnus castus: 1/2 tsp. BID - TID for several months - use for annovulation\n" +
                        "• Aletris farinosa: 1/2 tsp. BID - TID for several months - use for low E2\n" +
                        "• Formula 1 - Angelica sinensis (2), *Arctium lappa (2), *Taraxacum officinale (1), Glycyrrhiza glabra (2), *Leonurus cardiaca (1): take 1/4 tsp. TID between meals (use on days 1 - 15) - use for amenorrhea to start cycle\n" +
                        "• Formula 2 - *Dioscorea villosa (3), *Smilax sarsaparilla (1): take 1/4 tsp. TID between meals (use on days 16 - 25) - use for amenorrhea to start cycle\n" +
                        "   Male:\n" +
                        "• Astragalus membranaceus: 1/2 tsp. BID - TID for several months\n" +
                        "• Panax ginseng: 1/2 tsp. BID - TID for several months\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Aletris farinosa (True unicorn)\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Astragalus membranaceus (Astragalus, Milk vetch)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "Smilax sarsaparilla (Sarsaparilla)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Vitex agnus castus (Chaste tree, Monk's pepper)\n"
                ss = SpannableString(botanical_detail)
            }
            "Insomnia" ->{
                botanical_detail = "• Tincture - Hypericum, Piper methysticum, Valerian, Avena, Scutellaria, Matricaria, Schisandra chinensis, Lavender essential oil, Sweet orange essential oil: 10 drops BID\n" +
                        "• Tincture - Humulus lupulus: mix 40 drops with 1/2 tsp. of glycine in 1/2 cup of water and drink at bedtime\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Avena sativa (Oats)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Lavendula angustifolia (Lavender)\n" +
                        "Matricaria chamomilla (German chamomile)\n" +
                        "Piper methysticum (Kava kava)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Schisandra chinensis (Wu wei zi)\n" +
                        "Scutellaria laterifolia (Skullcap)\n" +
                        "Tanacetum parthenium (Feverfew)\n" +
                        "Valeriana officinalis (Valerian)\n" +
                        "Withania somnifera (Ashwagandha)\n"
                ss = SpannableString(botanical_detail)
            }
            "Irritable Bowel Syndrome" ->{
                botanical_detail = "• Dry herbs - Althea officinalis (110 mg.), Geranium maculatum (110 mg.), Echinacea spp. (110 mg.), Ulmus ruba (110 mg.), Curcuma longa (110 mg.), Hydrastis canadensis (42 mg.) : 1-2 caps before each meal\n" +
                        "• Peppermint Oil Capsules: 1/2 hr. before meals\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Geranium maculatum (Wild geranium, Cranesbill)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Ulmus fulva (Slippery Elm, American elm)"
                ss = SpannableString(botanical_detail)
            }
            "Longevity" ->{
                botanical_detail = "• Tincture or standardized extract (24% ginkgo heterosides) - Ginkgo biloba: 40 mg. TID, starting with 20 mg. daily and gradually increasing to 40 mg. TID\n" +
                        "• Tincture - Panax ginseng, Salvia miltiorrhiza, Withania somnifera: 10 drops TID with warm water\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Salvia miltiorrhiza (Dan shen)\n" +
                        "Withania somnifera (Ashwagandha)"
                ss = SpannableString(botanical_detail)
            }
            "Lupus" ->{
                botanical_detail = "• Tincture - Momordica : take 1/4 tsp. TID\n" +
                        "• Tincture - Bupleurum, Dioscorea, Centella, Glycyrrhiza: take 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Bupleurum chinense (Thoroughwax)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Momordica charantia (Bitter melon)\n"
                ss = SpannableString(botanical_detail)
            }
            "Macular Degeneration" ->{
                botanical_detail = "• Ginkgo biloba: 40 mg. (24% ginkgo heterosides)\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Vaccinium myrtillus (Bilberry)\n"
                ss = SpannableString(botanical_detail)
            }
            "Manic Depressive Disorder" ->{
                botanical_detail = "• Tincture - *Hypericum perforatum, *Piper methysticum, *Eleutherococcus senticosus, *Avena sativa, *Scutellaria laterifolia, *Matricaria chamomilla, Schisandra chinensis, *Lavender angustifolia essential oil, Sweet orange essential oil: 10 drops BID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Avena sativa (Oats)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Lavendula angustifolia (Lavender)\n" +
                        "Matricaria chamomilla (German chamomile)\n" +
                        "Piper methysticum (Kava kava)\n" +
                        "Schisandra chinensis (Wu wei zi)\n" +
                        "Scutellaria laterifolia (Skullcap)"
                ss = SpannableString(botanical_detail)
            }
            "Mastitis" ->{
                botanical_detail = "• Tincture - Echinacea (4), Glycyrrhiza (1), Hydrastis (1), Phytolacca (2): take 1/2 tsp. every 2 hrs. for 24 hrs.; then every 4 hrs.\n" +
                        "• Topically - Phytolacca oil: rub into breast 2 times per day\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Phytolacca decandra (Poke, Pokeweed)\n"
                ss = SpannableString(botanical_detail)
            }
            "Memory Loss" ->{
                botanical_detail = "• Ginkgo: 1 capsule TID\n" +
                        "• Circulatory Pizazz Tincture - Ginkgo, Panax, Arctium, Zingiber, Zanthoxyllum, Rosmariunus, Capsicum: 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Oplopanax horridum (Devil's club)\n" +
                        "Panax ginseng (Chinese ginseng, Korean ginseng)\n" +
                        "Rosmarius officinalis (Rosemary)\n" +
                        "Withania somnifera (Ashwagandha)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)\n" +
                        "Zingiber officinale (Ginger)"
                ss = SpannableString(botanical_detail)
            }
            "Menopause" ->{
                botanical_detail = "• Dry Herbs - Glycyrrhiza glabra (120 mg.), Leonurus cardiaca (120 mg.), Angelica sinensis (240 mg.), Arctium lappa (240 mg.), *Vitex agnus castus (120 mg.), Cimicifuga racemosa (120 mg.): take 2 capsules TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Aletris farinosa (True unicorn)\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Cimicifuga racemosa (Black cohosh)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Medicago sativa (Alfalfa)\n" +
                        "Salvia officinalis (Sage)\n" +
                        "Trigonella foenum-graecum (Fenugreek)\n" +
                        "Vitex agnus castus (Chaste tree, Monk's pepper)"
                ss = SpannableString(botanical_detail)
            }
            "Migraine Headache" ->{
                botanical_detail = "• Tincture - Tanacetum parthenium (Feverfew) : 1/4 tsp TID\n" +
                        "• Dry herb - Petasites hybridus (Butterbur) : as directed by the particular manufacture\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)\n" +
                        "Tanacetum parthenium (Feverfew)\n" +
                        "Zingiber officinale (Ginger)"
                ss = SpannableString(botanical_detail)
            }
            "Mouth Ulcers" ->{
                botanical_detail = "• Mouthwash - *Calendula officinalis, *Symphytum officinale, *Commiphora molmol, *Berberis vulgaris, *Hamamelis virginiana, *Baptisia tintoria, *Zanthoxylum clava-herculis, *Sanguinaria, *Thuja plicata, *Melaleuca alternifolia: rinse and expel\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Baptisia tintoria (Wild indigo)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Commiphora molmol (Myrrh)\n" +
                        "Hamamelis virginiana (Witch hazel)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Melaleuca alternifolia (Tea tree)\n" +
                        "Salvia officinalis (Sage)\n" +
                        "Sanguinaria canadensia (Blood root)\n" +
                        "Symphytum officinale (Comfrey)\n" +
                        "Thuja plicata (Western cedar)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)"
                ss = SpannableString(botanical_detail)
            }
            "Multiple Sclerosis" ->{
                botanical_detail = "• Rejuvenate - Centella, Ginkgo, Eleutherococcus, Urtica, Rosmarinus, Fucus, Zanthoxyllum clava-herculis: 1/4 tsp. TID between meals\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Fucus vesiculosus (Bladderwrack, Kelp)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Rosmarius officinalis (Rosemary)\n" +
                        "Rosmarius officinalis (Rosemary)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Withania somnifera (Ashwagandha)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)\n"
                ss = SpannableString(botanical_detail)
            }
            "Obesity" ->{
                botanical_detail = "• Liquid Extract - Taraxacum, Zea, Petroselinum, Stellaria: take 1/2 tsp. at noon and at 6 PM\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Camellia sinensis (Green tea)\n" +
                        "Ephedra sinica (Ma huang)\n" +
                        "Fucus vesiculosus (Bladderwrack, Kelp)\n" +
                        "Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "Petroselinum crispum (Parsley)\n" +
                        "Stellaria media (Chickweed)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Zea mays (Corn silk)"
                ss = SpannableString(botanical_detail)
            }
            "Osteoarthritis" ->{
                botanical_detail = "• Dry Herbs - Harpagophytum (248 mg.), Yucca (248 mg.), Juniperus (124 mg.), Angelica s. (124 mg.), Arctium (124 mg.), Cimicifuga (124 mg.), Medicago seed and leaf (248 mg. total): take 2 capsules TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Cimicifuga racemosa (Black cohosh)\n" +
                        "Filipendula ulmaria (Meadowsweet)\n" +
                        "Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "Juniperus communis (Juniper)\n" +
                        "Medicago sativa (Alfalfa)\n" +
                        "Urtica urens (Nettles)\n" +
                        "Yucca spp. (Yucca)\n"
                ss = SpannableString(botanical_detail)
            }
            "Osteoporosis" ->{
                botanical_detail = "• Tincture - Glycyrrhiza glabra (5), *Viburnum opulus (1), *Taraxacum officinale (1 ), *Rumex crispis (1): take 1/2 tsp. QID between meals\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Equisetum arvense (Shave grass, Horsetail)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Rumex crispis (Yellow/Curly Dock)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Viburnum opulus (Cramp bark)\n"
                ss = SpannableString(botanical_detail)
            }
            "Otitis Media" ->{
                botanical_detail = "• Tincture - Echinacea (1), Allium sativum (1), Hydrastis (1), Matricaria (1), Galium (1), Glycyrrhiza (1), Euphrasia (1), Sambucus (1): take 1/4 tsp. TID to QID\n" +
                        "• Ear drops - Hypericum oil, Calendula oil, Verbascum oil, Allium s. oil, Larrea oil, Verbascum glycerite , Vitamin E oil: 1-2 warm drops\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Euphrasia officinalis (Eyebright)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Larrea tridentata (Chapparrel, Creosote bush, Cresotum)\n" +
                        "Matricaria chamomilla (German chamomile)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Sambucus canadensis, nigra (Elder)\n" +
                        "Verbascum thapsus (Mullein)"
                ss = SpannableString(botanical_detail)
            }
            "Ovarian Cancer" ->{
                botanical_detail = "• Tincture (Hoxsey Formula) - Trifollium pratense, Baptisia tinctoria, Arctium lappa, Berberis spp, Rhamnus purshiana, Rhamnus frangula, Phytolacca decandraa, Stillingia sylvatica, Zanthoxyllum clava-herculis, Glycyrrhiza glabra, 3% WV potassium iodide\n" +
                        "• Yew Tree Tea- 1 quart daily made according to specified directions\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Ginkgo biloba (Ginkgo)\n"
                ss = SpannableString(botanical_detail)
            }
            "Painful Menses" ->{
                botanical_detail = "• Elixir - *Caulophylum thalictroides, Viburnum opulus, *Chamaelirium luteum, *Mitchella repens: Mother's cordial, take 1/4 tsp. every 4 hours for five days before menses is to begin\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Achillea millefolium (Yarrow)\n" +
                        "Aletris farinosa (True unicorn)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Caulophyllum thalictroides (Blue cohosh)\n" +
                        "Chamaelirium luteum (False unicorn)\n" +
                        "Cimicifuga racemosa (Black cohosh)\n" +
                        "Cinnamomum saigonicum (Saigon cinnamon, Ceylon cinnamon)\n" +
                        "Corydalis bulbosa (Corydalis)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Juniperus communis (Juniper)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Mitchella repens (Squawvine, Partridge berry)\n" +
                        "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)\n" +
                        "Piscidia piscipula (Jamaican dogwood)\n" +
                        "Salvia officinalis (Sage)\n" +
                        "Tanacetum parthenium (Feverfew)\n" +
                        "Vaccinium myrtillus (Bilberry)\n" +
                        "Valeriana officinalis (Valerian)\n" +
                        "Verbena officinalis (Vervain)\n" +
                        "Viburnum opulus (Cramp bark)\n"
                ss = SpannableString(botanical_detail)
            }
            "Paralysis Agitans" ->{
                botanical_detail = "• Liquid Extract - Passiflora incarnata: 30 - 60 drops TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Passiflora incarnata (Passionflower)\n"
                ss = SpannableString(botanical_detail)
            }
            "Parkinson's Disease" ->{
                botanical_detail = "• Liquid Extract - Passiflora incarnata: 30 - 60 drops TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Passiflora incarnata (Passionflower)"
                ss = SpannableString(botanical_detail)
            }
            "Peptic Ulcers" ->{
                botanical_detail = "• Dry herbs - Althea (220 mg.), Geranium (220 mg.), Echinacea (220 mg.), Ulmus (220 mg.), Curcuma (220 mg.), Hydrastis (84 mg.): 2 caps with each meal\n" +
                        "• Deglycyrrhizinated Licorice (380 mg. tablets): chew 2 tablets TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Achillea millefolium (Yarrow)\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Astragalus membranaceus (Astragalus, Milk vetch)\n" +
                        "Calendula officinalis (Marigold)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Filipendula ulmaria (Meadowsweet)\n" +
                        "Geranium maculatum (Wild geranium, Cranesbill)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Inula helenium (Elecampane)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)\n" +
                        "Symphytum officinale (Comfrey)\n" +
                        "Ulmus fulva (Slippery Elm, American elm)\n" +
                        "Vaccinium myrtillus (Bilberry)\n"
                ss = SpannableString(botanical_detail)
            }
            "PMS" ->{
                botanical_detail = "• Dry herbs - Angelica s, Valeriana, Dioscorea, Vitex, Taraxacum: acute 2 capsules QID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Bupleurum chinense (Thoroughwax)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Scutellaria laterifolia (Skullcap)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Valeriana officinalis (Valerian)\n" +
                        "Vitex agnus castus (Chaste tree, Monk's pepper)\n" +
                        "Zea mays (Corn silk)\n"
                ss = SpannableString(botanical_detail)
            }
            "Premenstrual Syndrome" ->{
                botanical_detail = "• Dry herbs - Angelica s, Valeriana, Dioscorea, Vitex, Taraxacum: acute 2 capsules QID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Bupleurum chinense (Thoroughwax)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Leonurus cardiaca (Motherwort)\n" +
                        "Scutellaria laterifolia (Skullcap)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Valeriana officinalis (Valerian)\n" +
                        "Vitex agnus castus (Chaste tree, Monk's pepper)\n" +
                        "Zea mays (Corn silk)"
                ss = SpannableString(botanical_detail)
            }
            "Psoriasis" ->{
                botanical_detail = "• Tincture - Hydrastis (1), Arctium (1), Allium sativum (1), Smilax (2), Glycyrrhiza (2), Galium (1): 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Ammi visnaga (Khella)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Arctostaphylos uva ursi (Bearberry)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Camellia sinensis (Green tea)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Linum usitatissimum (Flax, Linseed)\n" +
                        "Silybum marianum (Milk thistle)\n" +
                        "Smilax sarsaparilla (Sarsaparilla)\n" +
                        "Stillingia sylvatica (Queen's root, Queen's delight)\n" +
                        "Symphytum officinale (Comfrey)\n" +
                        "Thuja plicata (Western cedar)"
                ss = SpannableString(botanical_detail)
            }
            "Psoriatic Arthritis" ->{
                botanical_detail = "• Dry Herbs (for arthritis) - Harpagophytum (248 mg.), Yucca (248 mg.), Juniperus (124 mg.), Angelica s. (124 mg.), Arctium (124 mg.), Cimicifuga (124 mg.), Medicago (248 mg.): take 2 capsules TID\n" +
                        "• Tincture (for psoriasis) - Hydrastis (1), Arctium (1), Allium sativum (1), Smilax (2), Glycyrrhiza (2), Galium (1): 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Allium sativum (Garlic)\n" +
                        "Ammi visnaga (Khella)\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Camellia sinensis (Green tea)\n" +
                        "Cimicifuga racemosa (Black cohosh)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Equisetum arvense (Shave grass, Horsetail)\n" +
                        "Filipendula ulmaria (Meadowsweet)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Juniperus communis (Juniper)\n" +
                        "Larrea tridentata (Chapparrel, Creosote bush, Cresotum)\n" +
                        "Linum usitatissimum (Flax, Linseed)\n" +
                        "Medicago sativa (Alfalfa)\n" +
                        "Silybum marianum (Milk thistle)\n" +
                        "Smilax sarsaparilla (Sarsaparilla)\n" +
                        "Stellaria media (Chickweed)\n" +
                        "Stillingia sylvatica (Queen's root, Queen's delight)\n" +
                        "Symphytum officinale (Comfrey)\n" +
                        "Yucca spp. (Yucca)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)\n" +
                        "Zingiber officinale (Ginger)"
                ss = SpannableString(botanical_detail)
            }
            "Regional Enteritis" ->{
                botanical_detail = "• Dry herbs - Althea officinalis (220 mg.), *Geranium maculatum (220 mg.), Echinacea angustifolia (220 mg.), *Ulmus fulva (220 mg.), Curcuma longa (220 mg.), *Hydrastis canadensis (84 mg.): 2 caps with each meal\n" +
                        "• Curcuma longa: 450 mg. (standardized to contain 95% curcuminoids) daily with food\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Geranium maculatum (Wild geranium, Cranesbill)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Ulmus fulva (Slippery Elm, American elm)"
                ss = SpannableString(botanical_detail)
            }
            "Rheumatoid Arthritis" ->{
                botanical_detail = "• Curcuma longa: 450 mg. (standardized to contain 95% curcuminoids) daily with food\n" +
                        "• Dry Herbs - Harpagophytum (248 mg.), Yucca (248 mg.), Juniperus (124 mg.), Angelica s. (124 mg.), Arctium (124 mg.), Cimicifuga (124 mg.), Medicago (248 mg.): take 2 capsules TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Angelica sinensis (Dong quai)\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Capsicum frutescens (Cayenne, Red pepper)\n" +
                        "Caulophyllum thalictroides (Blue cohosh)\n" +
                        "Cimicifuga racemosa (Black cohosh)\n" +
                        "Crataegus oxycantha (Hawthorne)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Equisetum arvense (Shave grass, Horsetail)\n" +
                        "Filipendula ulmaria (Meadowsweet)\n" +
                        "Fucus vesiculosus (Bladderwrack, Kelp)\n" +
                        "Galium aparine (Cleavers, Bed straw)\n" +
                        "Harpagophytum procumbens (Devil's claw, Grapple plant)\n" +
                        "Juniperus communis (Juniper)\n" +
                        "Larrea tridentata (Chapparrel, Creosote bush, Cresotum)\n" +
                        "Linum usitatissimum (Flax, Linseed)\n" +
                        "Lobelia inflata (Indian tobacco, Puke weed)\n" +
                        "Medicago sativa (Alfalfa)\n" +
                        "Momordica charantia (Bitter melon)\n" +
                        "Stellaria media (Chickweed)\n" +
                        "Tanacetum parthenium (Feverfew)\n" +
                        "Thuja plicata (Western cedar)\n" +
                        "Yucca spp. (Yucca)\n" +
                        "Zanthoxylum clava-herculis (Southern prickly ash)\n" +
                        "Zingiber officinale (Ginger)\n"
                ss = SpannableString(botanical_detail)
            }
            "Rosacea" ->{
                botanical_detail = "• Dry herbs - Althea (220 mg.), Geranium (220 mg.), Echinacea (220 mg.), Ulmus (220 mg.), Curcuma (220 mg.), Hydrastis (84 mg.): 2 caps with each meal\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Geranium maculatum (Wild geranium, Cranesbill)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Ulmus fulva (Slippery Elm, American elm)\n"
                ss = SpannableString(botanical_detail)
            }
            "Schizophrenia" ->{
                botanical_detail = "• Tincture - Eleutherococcus senticosus, Polygonum multiforum, Vaccinium myrtillus: 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Vaccinium myrtillus (Bilberry)"
                ss = SpannableString(botanical_detail)
            }
            "SLE" ->{
                botanical_detail = "• Tincture - Momordica : take 1/4 tsp. TID\n" +
                        "• Tincture - Bupleurum, Dioscorea, Centella, Glycyrrhiza: take 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Bupleurum chinense (Thoroughwax)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Momordica charantia (Bitter melon)\n"
                ss = SpannableString(botanical_detail)
            }
            "Sleep Disorder" ->{
                botanical_detail = "• Tincture - Hypericum, Piper methysticum, Valerian, Avena, Scutellaria, Matricaria, Schisandra chinensis, Lavender essential oil, Sweet orange essential oil: 10 drops BID\n" +
                        "• Tincture - Humulus lupulus: mix 40 drops with 1/2 tsp. of glycine in 1/2 cup of water and drink at bedtime\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Avena sativa (Oats)\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Humulus lupulus (Hops)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Lavendula angustifolia (Lavender)\n" +
                        "Matricaria chamomilla (German chamomile)\n" +
                        "Piper methysticum (Kava kava)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Schisandra chinensis (Wu wei zi)\n" +
                        "Scutellaria laterifolia (Skullcap)\n" +
                        "Tanacetum parthenium (Feverfew)\n" +
                        "Valeriana officinalis (Valerian)\n" +
                        "Withania somnifera (Ashwagandha)"
                ss = SpannableString(botanical_detail)
            }
            "Stress Incontinence" ->{
                botanical_detail = "• Tincture- *Chamaelirium luteum(10-25%), *Mitchella repens(10-25%), *Centella asiatica (10-25%), *Hypericum perforatum (10-25%), *Hamamelis virginiana (10-25%), *Zea mays(10-25%): 30-60 drops TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Chamaelirium luteum (False unicorn)\n" +
                        "Equisetum arvense (Shave grass, Horsetail)\n" +
                        "Hamamelis virginiana (Witch hazel)\n" +
                        "Hypericum perforatum (St. John's wort)\n" +
                        "Mitchella repens (Squawvine, Partridge berry)\n" +
                        "Thuja plicata (Western cedar)\n" +
                        "Zea mays (Corn silk)"
                ss = SpannableString(botanical_detail)
            }
            "Systemic Lupus Erythematosus" ->{
                botanical_detail = "• Tincture - Momordica : take 1/4 tsp. TID\n" +
                        "• Tincture - Bupleurum, Dioscorea, Centella, Glycyrrhiza: take 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Bupleurum chinense (Thoroughwax)\n" +
                        "Centella asiatica (Gota kola)\n" +
                        "Dioscorea villosa (Wild yam)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Momordica charantia (Bitter melon)"
                ss = SpannableString(botanical_detail)
            }
            "Ulcerative Colitis" ->{
                botanical_detail = "• Dry herbs - Althea (220 mg.), Geranium (220 mg.), Echinacea (220 mg.), Ulmus (220 mg.), Curcuma (220 mg.), Hydrastis (84 mg.): 2 caps with each meal\n" +
                        "• Glycyrrhiza tincture: 30 drops TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Agrimonia eupatorium (Agrimony)\n" +
                        "Althea officinalis (Marshmallow)\n" +
                        "Baptisia tintoria (Wild indigo)\n" +
                        "Curcuma longa (Tumeric)\n" +
                        "Echinacea angustifolia (Purple cone flower)\n" +
                        "Geranium maculatum (Wild geranium, Cranesbill)\n" +
                        "Glycyrrhiza glabra (Licorice)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Symphytum officinale (Comfrey)\n" +
                        "Ulmus fulva (Slippery Elm, American elm)\n"
                ss = SpannableString(botanical_detail)
            }
            "Uterine Fibroids" ->{
                botanical_detail = "• Tincture - Hydrastis (1), Phytolacca (2), Viburnum (2), Taraxacum (1), Trillium (1), Arctium (1): 1/2 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Arctium lappa (Burdock)\n" +
                        "Hydrastis canadensis (Goldenseal)\n" +
                        "Phytolacca decandra (Poke, Pokeweed)\n" +
                        "Taraxacum officinale (Dandelion, Lion's tooth)\n" +
                        "Trillium erectum (Beth root)\n" +
                        "Viburnum opulus (Cramp bark)\n" +
                        "Vitex agnus castus (Chaste tree, Monk's pepper)"
                ss = SpannableString(botanical_detail)
            }
            "Vaginal Yeast Infection" ->{
                botanical_detail = "• Liquid Extract - Spilanthes acmella, Tabebuia impetiginosa, *Usnea spp, Berberis vulgaris, Thymus vulgaris: 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Allium sativum (Garlic)\n" +
                        "Berberis vulgaris (Barberry, Oregon grape)\n" +
                        "Melaleuca alternifolia (Tea tree)\n" +
                        "Mentha piperita (Peppermint)\n" +
                        "Spilanthes acmella (Paracress)\n" +
                        "Tabebuia impetiginosa (Pau d' arco)\n" +
                        "Thymus vulgaris (Thyme)\n" +
                        "Usnea spp. (Old man's beard)\n"
                ss = SpannableString(botanical_detail)
            }
        }
        checkAllLinks(ss,botanical_detail)
        binding.contentData.text = ss
    }

    private fun setHomepathicData(conditionName: String){
        binding.diet.text = "Homeopathic Remedies"
        when(conditionName){
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
            "Adult Acne" -> {
                homeopathic_detail = "• Acne eruptions:\n" +
                        "Aur., Calc-S., Calc-Eil., Carb-An., Carb-S., Carb-V., Caust., Dulc., Fl-Ac., Hep., Kali-Ar., Kali-Br., Nux-V., Phos., Rhod., Sars., Sep., Sil., Syph., Teucr., Zinc.\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }

            "Age-Related Macular Degeneration" -> {
                homeopathic_detail = "• General blindness:\n" +
                        "Acon., Bell., Hyos., Merc., Nat-M., Puls., Stram., Sulph.\n" +
                        "• Amblyopia:\n" +
                        "Amme., Chin., Dros., Gels., Merc., Nat-M., Op.., Phos., Ph-Ac., Ruta., Stram.\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)

            }
            "Aging Prevention" -> {
                homeopathic_detail = "• Premature old age:\n" +
                        "agn, alco, alum, ambr, arg-m, arg-n, bar-c, berb, bufo, carb-v, chin-s, coca, con, cortico, cupr, fl-ac, kali-c, lyc, nux-v, op, psor, sars, SEL, sep, staph, stram, sulph, vip\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)

            }
            "AIDS" -> {
                homeopathic_detail = "• Fevers: AIDS: acquired immune deficiency syndrome:\n" +
                        "ARS, ars-i, bapt, carc, echi, ferr-p, gels, lyc, MED, MERC, ph-ac, phos, puls, pyrog, sil, sulph, syph, THUJ, tub, x-ray\n" +
                        "(For an overview of Homeopathy, click here)"
                ss = SpannableString(homeopathic_detail)

            }
            "Allergies" -> {
                homeopathic_detail = "• Anaphylaxis, allergic attack:\n" +
                        "acon, APIS, ars, ars-i, carb-ac, caust, hist, led, nat-m, psor, rhus-t, sulph, URT-U\n" +
                        "• Allergy shots, ailments from:\n" +
                        "carc, thuj\n" +
                        "• Hives and swelling, with:\n" +
                        "acon, agar, all-c, ant-c, APIS, arn, ARS, ASTAC, bell, bov, calad, CARB-AC, chlor, graph, HIST, LED, lyc, mez, NAT-M, nat-p, nit-ac, psor, puls, RHUS-T, sal-ac, SULPH, sul-ac, URT-U, vesp\n" +
                        "• Rhinitis:\n" +
                        "ALL-C, ARS, ars-i, carb-v, EUPHR, iod, kali-i, nat-m, NUX-V, puls, sabad, sang, sil, wye\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)

            }
            "Alzheimer's Disease" -> {
                homeopathic_detail = "• Alzheimer's general:\n" +
                        "alum, agn, anac, ant-c, arg-m, arg-n, ars., aur, aur-i, aza, bapt, bar-ac, bar-c, bar-m, bell, bry, calc-p, cann-i, con, crot-h, fl-ac, HYOS, ign, iod, lach, lil-t, lyc, kali-br, kali-p, nat-i, nat-m, nux-m, nux-v, ov, phos, pic-ac, sec, sep, staph, sulph, thiosin, zinc\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Amenorrhea" -> {
                homeopathic_detail = "• Amenorrhea, general:\n" +
                        "acon, aesc, agar, agn, alet, all-c, aln, am-c, am-m, ammc, anac, ant-c, apis, apoc, arg-n, arist-cl, ars, ars-i, asar, AUR, aur-i, aven, bar-c, bell, bell-p, benz-ac, berb, bor, brom, bry, calc, calc-i, calc-p, calc-s, calc-sil, cann-s, canth, CARB-S, carb-v, card-m, caul, caust, cham, chel, chin, chlorpr, cic, cimic, cina, coca, cocc, coch, colch, coll, coloc, CON, cortico, cortiso, croc, crot-t, cupr, cycl, cypr, dam, dig, dros, DULC, euph, eupi, FERR, ferr-ar, FERR-I, Ferr-m, ferr-p, gast, gels, glon, goss, GRAPH, guai, ham, hedio, hell, helon, hyper, hyos, ictod, IGN, indg, iod, kali-ar, KALI-C, kali-i, kali-n, kali-p, kali-per, kali-s, kreos, lac-d, lach, lil-t, linu-e, lob, LYC, mag-c, mag-m, mag-s, man, mang, merc, merl, mill, mit, nat-c, nat-m, nat-p, nat-s, nat-sil, nep, nux-m, nux-v, ol-an, ol-j, op, ovi-g-p, parth, ph-ac, phos, phyt, pin-l, pituin, plat, plb, podo, polyg, PULS, rhus-t, sabad, sabin, sang, sanic, sec, SENEC, SEP, sieg, SIL, sin-n, spong, staph, stram, SULPH, sul-i, symph, tanac, tep, thiop, thuj, thyr, TUB, urt-u, ust, valer, verat, verat-v, vib, wye, x-ray, xan, zinc, zinc-p\n" +
                        "• Amenorrhea in girls:\n" +
                        "ign, x-ray\n" +
                        "• Amenorrhea, sexual desire absent:\n" +
                        "helon, sep\n" +
                        "• Amenorrhea, strain, after psychical and physical:\n" +
                        "hypoth, ign\n" +
                        "• Amenorrhea, women, in, feeble:\n" +
                        "ars, SEP\n" +
                        "• Amenorrhea, women, in, hysterical:\n" +
                        "cypr, ign, sil\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)

            }
            "Anorexia Nervosa" -> {
                homeopathic_detail = "• General anorexia nervosa:\n" +
                        "ARS, calc, carc, caust, CHIN, hyos, ign, lach, levo, merc, nat-m, perh, puls, rhus-t, staph, SULPH, tarent, verat\n" +
                        "• Refuses to eat:\n" +
                        "ars, bell, caust, cocc, croc, grat, HYOS, ign, KALI-CHI, kali-p, op, PH-AC, phyt, plat, puls, sep, TARENT, VERAT, VIOL-O\n" +
                        "• Anorexia nervorsa in children:\n" +
                        "ARS, calc, carc, CHIN, ign, lach, levo, merc, nat-m, perh, puls, rhus-t, staph, SULPH, tarent, verat\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)

            }
            "Aphthous Stomatitis" -> {
                homeopathic_detail = "• General aphthous stomatitis (ulcer):\n" +
                        "acet-ac, aeth, agar, all-s, alum, anan, ant-c, apis, arg-m, ARS, ars-i, arum-t, asim, aur, aur-m, aur-s, BAPT, berb, BOR, brom, bry, calc, anth, caps, carb-ac, carb-an, carb-s, carb-v, caul, cean, cham, chin, chin-a, chlor, cic, clem, cocc, com, cub, dig, dulc, ferr, gamb, hell, hep, hippoz, hydr, ill, iod, ip, jug-c, kali-ar, kali-bi, kali-br, kali-c, KALI-CHI, kali-i, kali-m, kali-s, kreos, lac-c, lac-d, lach, lac-ac, lyc, mag-c, MERC, MERC-C, merc-d, MUR-AC, myric, nat-a, nat-c, nat-h, NAT-M, nat-p, nit-ac, nux-m, NUX-V, ox-ac, petr, phos, phyt, plan, plb, ran-s, rhus-t, sal-ac, sanic, sars, sec, semp, sil, staph, SUL-AC, SULPH, ter, thuj, tub, vine\n" +
                        "• Aphthous stomatitis, bleeds easily:\n" +
                        "BOR, lac-c, sul-ac\n" +
                        "• Aphthous stomatitis, bloody, offensive:\n" +
                        "sul-ac\n" +
                        "• Aphthous stomatitis, bluish:\n" +
                        "ARS\n" +
                        "• Aphthous stomatitis, burning:\n" +
                        "chin-a, nat-m, sulph\n" +
                        "• Aphthous stomatitis, in children:\n" +
                        "asim, bapt, BOR, bry, casc, kali-br, kali-chi, lac-ac, med, MERC, NAT-M, mur-ac, nux-m, nux-v, plan, sac-alb, SUL-AC, sulph, viol-t\n" +
                        "• Aphthous stomatitis, in babies:\n" +
                        "bor, bry, calc, merc\n" +
                        "• Aphthous stomatitis, after sour, salty foor:\n" +
                        "bor\n" +
                        "• Aphthous stomatitis, white:\n" +
                        "ars, bor, sul-ac\n" +
                        "• Aphthous stomatitis, yellowish base:\n" +
                        "staph\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Arthritis, Gout" -> {
                homeopathic_detail = "• Gout, general (the following remedies have not been rated):\n" +
                        "Abro, Arn, Ben-Ac, Berb, Bry, Calc, Caust, Colc, Kalmia, Led, Lyc, Nat-P, Rad-B, Rhus-T, Spon, Sulph, Urt-U\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)

            }
            "Arthritis, Osteo" -> {
                homeopathic_detail = "• Inflammation of arthritis:\n" +
                        "Acon., Apis, Bell., Bry., Led., Sil.\n" +
                        "• Joint aching and pain:\n" +
                        "Carl., Chin-S., Gels., Dalm., Ruta.\n" +
                        "• Rheumatic pain:\n" +
                        "Arn., Ars., Aur-M-N., Bad., Benz-Ac., Bry., Caust., Cham., Chel., Colch., Form., Kali-I., Dalm., Lyc., Med., Nat-A., Phyt., Puls., Rhod., Rhus-T., Sang., Sars., Sulph.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)

            }
            "Arthritis, Psoriatic" -> {
                homeopathic_detail = "• Inflammation of arthritis:\n" +
                        "Acon., Apis, Bell., Bry., Led., Sil.\n" +
                        "• Joint aching and pain:\n" +
                        "Carl., Chin-S., Gels., Dalm., Ruta.\n" +
                        "• Rheumatic pain:\n" +
                        "Arn., Ars., Aur-M-N., Bad., Benz-Ac., Bry., Caust., Cham., Chel., Colch., Form., Kali-I., Dalm., Lyc., Med., Nat-A., Phyt., Puls., Rhod., Rhus-T., Sang., Sars., Sulph.\n" +
                        "• General psoriasis:\n" +
                        "Ambr., Ars., Ars-I., Bor., Calc., Calc-S, Canth., Carb-Ac., Chin., Chrysar., Clem., Graph., Iris, Kali-Aar., Cali-C., Kali-S., Lob., Lyc., Mang., Merc., Mex., Morg-G., Nat-M., Nit-Ac., Petr., Phos., Phyt., Psor., Puls., Rhus-T., Sarr., Sras., Sep., Sil., Staph., Sulph.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)

            }
            "Arthritis, Rheumatoid" -> {
                homeopathic_detail = "• Inflammation of arthritis:\n" +
                        "Acon., Apis, Bell., Bry., Led., Sil.\n" +
                        "• Joint aching and pain:\n" +
                        "Carl., Chin-S., Gels., Dalm., Ruta.\n" +
                        "• Rheumatic pain:\n" +
                        "Arn., Ars., Aur-M-N., Bad., Benz-Ac., Bry., Caust., Cham., Chel., Colch., Form., Kali-I., Dalm., Lyc., Med., Nat-A., Phyt., Puls., Rhod., Rhus-T., Sang., Sars., Sulph.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)

            }
            "Asthma" -> {
                homeopathic_detail = "• Asthma, altitude, from:\n" +
                        "arn, carb-v, coca, sil\n" +
                        "• Asthma, anger, after:\n" +
                        "ars, carc, CHAM, ign, nux-v, staph\n" +
                        "• Asthma, anxiety, with:\n" +
                        "arg-n, ARS, dig, kali-ar\n" +
                        "• Asthma, bronchial catarrh, with:\n" +
                        "acon, ANT-T, ars, BLATTA, blatt-a, bry, calad, caps, cupr-ac, erio, eucal, grin, ip, kali-i, lob, nat-s, onis, sabal, sulph\n" +
                        "• Asthma, in children:\n" +
                        "acon, ambr, ANT-T, ARS, calc, CARC, CHAM, IP, kali-br, kali-i, KALI-N, KALI-S, lob, MED, mosch, NAT-S, nux-v, psor, PHOS, PULS, SAMB, sanic, sil, stram, sulph, thuj, TUB, vib\n" +
                        "• Asthma, cold air agg:\n" +
                        "acon. lob, nux-v, petr, rumx\n" +
                        "• Asthma, cold air amel:\n" +
                        "bry, carb-v, cham, merc\n" +
                        "• Asthma, after coughing:\n" +
                        "phos\n" +
                        "• Asthma, agg by dry weather:\n" +
                        "causti, cham\n" +
                        "• Asthma, after eating:\n" +
                        "kali-p, nux-v, puls\n" +
                        "• Asthma, from inhaling dust:\n" +
                        "blatta, brom, ictod, ip, kali-c, pot-a, sil\n" +
                        "• Asthma, after emotions:\n" +
                        "acon, ambr, ARS, carc, cham, coff, cupr, gels, IGN, nux-v, pall, verat\n" +
                        "• Asthma, after exertion:\n" +
                        "arn, calc, coca, sil\n" +
                        "• Asthma, after excitement:\n" +
                        "acon, ambr, aml-n, asaf, carc, cham, chin-s, coff, cupr, grin, hydrc, ip, kali-p, lob, mosch, nux-m, nux-v, phos, sumb, tela, thymu, valer, verat\n" +
                        "• Asthma, after fright:\n" +
                        "carc, op, samb\n" +
                        "• Asthma, heat, agg:\n" +
                        "lach, puls\n" +
                        "• Asthma, humid:\n" +
                        "acon, ars, bry, cann-i, coch, cupr, dulc, eucal, euph-pi, grin, hyper, iod, kali-bi, NAT-S, sabal, seneg, stann, sulph, thuj\n" +
                        "• Asthma, hysterical:\n" +
                        "ambr, cocc, ign, lob, MOSCH, NUX-M, nux-v, phos, PULS, stann, stram, sulph\n" +
                        "• Asthma, laughing, agg:\n" +
                        "ars\n" +
                        "• Asthma, from moldy environment:\n" +
                        "carc, med, NAT-S, thuj\n" +
                        "• Asthma, sleep, coming on during:\n" +
                        "acon, ars, carb-v, hep, kali-c, lach, meph, nat-s, op, sep, sulph\n" +
                        "• Asthma, vaccination, after:\n" +
                        "ANT-T, SIL, THUJ\n" +
                        "• Asthma, weather, change of, agg:\n" +
                        "carc, DULC, NAT-S, sil, thuj\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)

            }
            "Atherosclerosis" -> {
                homeopathic_detail = "• General arteriosclerosis:\n" +
                        "adren, am-i, arn, ars, aur, aur-br, aur-i, bar-c, bell-p, cact, calc, calc-ar, calc-f, chin-s, chlol, con, crat, cupr, ergot, form, fuc, glon, hed, hyper, iod, kres, lach, lith, man, naja, nat-i, plb, plb-i, polyg-a, sec, sil, solid, stront-c, stront-i, stroph, sumb, tab, thlaspi, thyr, vanad, visc, zinc-p\n" +
                        "• Atheroma:\n" +
                        "aur-m, bell, brom, calc, calc-f, caps, graph, kali-i, lach, lac-ac, lyc, phos, plb, sil, sulph\n" +
                        "• Atheroma in elderly people:\n" +
                        "lach\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)

            }
            "Atopic Dermatitis" -> {
                homeopathic_detail = "• Eczema, general:\n" +
                        "aethi-m, alum, am-c, am-n, ant-c, arb, ARS, ARS-I, aur, aur-m, BAR-M, bell, berb, bor, bov, brom, bry, calad, CALC, CALC-S, canth, caps, carb-ac, carb-s, carb-v, carc, caust, chrysar, CIC, CROTH-T, cycl, DULC, frag, fuli, GRAPH, HEP, hippoz, hydr, hydrc, iris, JUG-C, JUG-R, kali-ar, kali-bi, kali-c, kali-chl, kali-m, kali-s, kreos, lach, LAPPA-M, led, lith, lyc, mang, merc, merc-d, merc-p-r, merc-sul, MEZ, mur-ac, nat-m, nat-p, nat-s, nit-ac, nux-v, OLND, PETR, phos, phyt, piloc, plb, podo, PSOR, ran-b, RHUS-T, rhus-v, sars, sep, sil, skook, staph, SULPH, SUL-I, tarent-c, tell, thuj, thyr, tub, ust, vinc, viol-t, x-ray, xero\n" +
                        "• Eczema in children:\n" +
                        "carc, graph, nat-m, sulph\n" +
                        "• Eczema aggrevated by menses:\n" +
                        "mang\n" +
                        "• Eczema over the whole body:\n" +
                        "crot-t, rhut-t\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)

            }
            "Attention Deficit Disorder" -> {
                homeopathic_detail = "• Aversion to concentration:\n" +
                        "calc, gels, lyc, med, nux-v, phos, ph-ac, plb, sil, staph\n" +
                        "• Difficult to concentrate in children:\n" +
                        "aeth, am-c, BAR-C, carc, lach, med, ph-ac, phos, sil, zinc\n" +
                        "• Difficult to concentrate in the afternoon:\n" +
                        "ang, cham, ery-a, myris, sang\n" +
                        "• Difficult to concentrate while studying and reading:\n" +
                        "acon, AETH, agn, alum, ambr, ang, asar, bar-c, bar-m, bell, calc-f, calc-sil, carb-ac, carb-s, caust, cham, coff, corn, dros, fago, ferr-i, HELL, iod, kali-p, kali-sil, lach, lyc, merc, mur-ac, nat-a, nat-c, nat-p, NUX-V, ox-ac, phos, pic-ac, scut, SIL, spig, staph, sulph, syph, tab, zinc-p\n" +
                        "• Hyperactivity in children:\n" +
                        "anac, ars, ars-i, calc-p, CARC, cina, coff, HYOS, iod, MED, nux-v, STRAM, tarent, thuj, TUB, verat\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)

            }
            "Autism" -> {
                homeopathic_detail = "• Autistic children:\n" +
                        "cann-i, carc, nat-m, op, thuj, tub\n" +
                        "• Autism after vaccination:\n" +
                        "carc, thuj\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)

            }
            "Benign Prostatic Hypertrophy" ->{
                homeopathic_detail = "• Benign prostatic hypertrophy (the following remedies have not been rated):\n" +
                        "Bar-C, Bar-M, Calc, Chim, Conium, Dig, Flour-A, Kali-C, Med, Pareira, Paris-Q, Puls, Sel, Staph, Sulp, Thuj\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Bipolar Disorder" ->{
                homeopathic_detail = "• Manic depression:\n" +
                        "agar, arg-m, anac, aur, bell, cann-i, CARC, coff, con, cyt-l, hyos, kres, LACH, lil-t, MED, nat-s, phos, psor, STAPH, stram, sulfa, verat\n" +
                        "• Mania, abuses everyone:\n" +
                        "anac, camph, lach, tarent\n" +
                        "• Mania, rage, with:\n" +
                        "agar, ant-t, apis, ars, BELL, camph, cann-i, cann-s, croc, cupr, HYOS, lach, lol, LYC, merc, nux-v, op, ph-ac, phos, pib, sec, sol-n, staph, STRAM, verat, verat-v, zinc\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Bladder Infection" ->{
                homeopathic_detail = "• Cystitis, general:\n" +
                        "ACON, all-c, am-c, ant-t, APIS, arg-n, arn, ars, aspar, bar-m, BELL, benz-ac, berb, cact, calad, calen, calc, camph, cann-i, cann-s, CANTH, caps, carb-an, caust, chim, chin-s, colch, coloc, con, cip, cub, dig, dulc, elat, EQUIS, ery-a, eup-pur, ferr-ac, ferr-p, gels, hep, hydr, hyos, kali-ar, kali-bi, kali-c, kali-chl, LACH, lil-t, lith, LYC, MED, merc, merc-c, nit-ar, nux-v, petr, petros, ph-ac, polyg, pop, prun, PULS, rhus-t, sabal, SARS, sabin, senec, seneg, SEP, solid, squil, STAPH, stigm, stram, sulph, tarent, TER, THLASPI, thuj, tritic, tub, uva, verat-v\n" +
                        "• Cystitis, recurrent:\n" +
                        "canth, lyc, puls, sep, staph\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Blood Pressure, High" ->{
                homeopathic_detail = "• General hypertension:\n" +
                        "Adren., Aur., Car-C., Calc., Crat., Glon., Grat., Lach., Nat-M., Nux-V., Plb., Rauw., Stront-C., Suplh., Sumb., Verat.\n" +
                        "Sudden rise in blood pressure:\n" +
                        "Coff., Glon.\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "BPH" ->{
                homeopathic_detail = "• Benign prostatic hypertrophy (the following remedies have not been rated):\n" +
                        "Bar-C, Bar-M, Calc, Chim, Conium, Dig, Flour-A, Kali-C, Med, Pareira, Paris-Q, Puls, Sel, Staph, Sulp, Thuj\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Bronchitis" ->{
                homeopathic_detail = "• General bronchitis:\n" +
                        "acet-ac, acon, AESC, all-c, alum, alumn, am-c, am-i, am-m, am-p, ant-a, ant-c, ANT-T, apis, arn, ARS, ars-i, asc-t, aur-m, bar-c, BAR-M, bell, benz-ac, blatta, brom, BRY, cact, calc, calc-f, camph, cann-s, carb-s, carb-v, card-m, caust, cham, chel, chin, chlol, chlor, cina, DROS, dulc, euphr, ferr-i, FERR-P, gels, grin,k guai,k HEP, hippoz, hyos, iod, IP, kali-ar, kali-bi, kali-c, kali-chl, kali-p, kreos, lach, lob, LYC, mang, merc, merc-sul, nat-a, nat-m, NAT-S, nit-ac, nux-v, ph-ac, PHOS, piloc, plb, psor, PULS, rhus-t, rumx, SANG, sang-n, SENEC, seneg, sep, SIL, SPONG, squil, STANN, stict, sul-ac, sulph, ter, thuj, TUB, verat, verb, zinc\n" +
                        "• Bronchitis in children:\n" +
                        "am-c, ant-t, dulc, ferr-p, IP, KALI-C, nat-a, phos, sil\n" +
                        "• Bronchitis in the elderly:\n" +
                        "all-c, am-c, ammc, ant-c, ANT-T, ars, bac, camph, carb-v, dros, HIPPOZ, hydr, kali-c, kreos, lyc, PHOS, nux-v, seneg, sil\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Cancer Prevention" ->{
                homeopathic_detail = "• "
                ss = SpannableString(homeopathic_detail)
            }
            "Candida Infection" ->{
                homeopathic_detail = "• Candida albicans:\n" +
                        "calc, chin, helon, lyc, med, nat-p, nit-ac, puls, sep, thuj\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Candidiasis" ->{
                homeopathic_detail = "• Candida albicans:\n" +
                        "calc, chin, helon, lyc, med, nat-p, nit-ac, puls, sep, thuj\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Canker Sores" ->{
                homeopathic_detail = "• General aphthous stomatitis (ulcer):\n" +
                        "acet-ac, aeth, agar, all-s, alum, anan, ant-c, apis, arg-m, ARS, ars-i, arum-t, asim, aur, aur-m, aur-s, BAPT, berb, BOR, brom, bry, calc, anth, caps, carb-ac, carb-an, carb-s, carb-v, caul, cean, cham, chin, chin-a, chlor, cic, clem, cocc, com, cub, dig, dulc, ferr, gamb, hell, hep, hippoz, hydr, ill, iod, ip, jug-c, kali-ar, kali-bi, kali-br, kali-c, KALI-CHI, kali-i, kali-m, kali-s, kreos, lac-c, lac-d, lach, lac-ac, lyc, mag-c, MERC, MERC-C, merc-d, MUR-AC, myric, nat-a, nat-c, nat-h, NAT-M, nat-p, nit-ac, nux-m, NUX-V, ox-ac, petr, phos, phyt, plan, plb, ran-s, rhus-t, sal-ac, sanic, sars, sec, semp, sil, staph, SUL-AC, SULPH, ter, thuj, tub, vine\n" +
                        "• Aphthous stomatitis, bleeds easily:\n" +
                        "BOR, lac-c, sul-ac\n" +
                        "• Aphthous stomatitis, bloody, offensive:\n" +
                        "sul-ac\n" +
                        "• Aphthous stomatitis, bluish:\n" +
                        "ARS\n" +
                        "• Aphthous stomatitis, burning:\n" +
                        "chin-a, nat-m, sulph\n" +
                        "• Aphthous stomatitis, in children:\n" +
                        "asim, bapt, BOR, bry, casc, kali-br, kali-chi, lac-ac, med, MERC, NAT-M, mur-ac, nux-m, nux-v, plan, sac-alb, SUL-AC, sulph, viol-t\n" +
                        "• Aphthous stomatitis, in babies:\n" +
                        "bor, bry, calc, merc\n" +
                        "• Aphthous stomatitis, after sour, salty foor:\n" +
                        "bor\n" +
                        "• Aphthous stomatitis, white:\n" +
                        "ars, bor, sul-ac\n" +
                        "• Aphthous stomatitis, yellowish base:\n" +
                        "staph\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Cataract Prevention" ->{
                homeopathic_detail = "• General cataract:\n" +
                        "am-c, am-m, ant-t, apis, arn, bar-c, bell, CALC, CALC-F, calc-p, calc-s, cann-s, carb-an, CAUST, chel, chin, cine, coch, colch, con dig, euph, euphr, hep, hyos, iod, kali-c, kali-m, kali-sil, kreos, lac-c, led, lyc, MAG-C, merc, naph, nat-m, nit-ac, op, PHOS, plb, psor, puls, rhus-t, ruta, sant, sec, seneg, sep, SIL, spig, SULPH, tell, thiosin, zinc\n" +
                        "• Left eye cataract:\n" +
                        "phos, sulph\n" +
                        "• Right eye cataract:\n" +
                        "am-c, kali-c, nit-ac, sil\n" +
                        "• Senile cataract:\n" +
                        "carb-an, sec\n" +
                        "• Cataracts in women:\n" +
                        "sep\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "CFS/CFIDS" ->{
                homeopathic_detail = "• Chronic fatigue syndrome, general:\n" +
                        "ALUM, ambr, AM-C, apoc, ars, ars-i, aur, bar-c, bapt, CALAD, CALC, cann-s, carb-v, CARC, caust, chel, CHIN, chin-s, cocc, CON, dig, FERR, ferr-ar, ferr-p, GELS, GRAPH, helon, hyos, kali-c, kali-n, kali-p, LACH, laur, lyc, mag-m, mang, merc, mur-ac, nat-a, nat-c, nat-m, nit-ac, nux-m, NUX-V, op, PH-AC, phos, PIC-AC, psor, puls, sel, seneg, sep, SIL, stann, staph, stram, stront-c, sulph, SUL-AC, thuj, valer, verat\n" +
                        "• Chronic fatigue syndrome aggravated by exertion:\n" +
                        "arn, ars, calc, cann-s, chin, gel, helon, nux-v, ph-ac, SIL, thuj\n" +
                        "• Chronic fatigue from mononucleosis:\n" +
                        "bapt, calc, CARC, gels, merc, ph-ac, sil thuj\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "CHF" ->{
                homeopathic_detail = "• Congestive heart failure, general:\n" +
                        "ACON, apis, asaf, APOC, cham, CRAT, cycl, dig, GLON, hyper, lach, lil-t, nux-m, phos, puls, sulph\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Cholecystitis" ->{
                homeopathic_detail = "• General cholecystitis:\n" +
                        "Card-M., Chel., Chion., Chol., Lach., Lept., MargG., Myrc., Phos., Podo., Pyrog.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Cholelithiasis" ->{
                homeopathic_detail = "• Pain from cholelithiasis:\n" +
                        "Bell., Berb., Carc., Card-M., Chin., Chol., Coloc., Dios., Lyc., Morg., Nat-S., Verat.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Chronic Fatigue Syndrome" ->{
                homeopathic_detail = "• Chronic fatigue syndrome, general:\n" +
                        "ALUM, ambr, AM-C, apoc, ars, ars-i, aur, bar-c, bapt, CALAD, CALC, cann-s, carb-v, CARC, caust, chel, CHIN, chin-s, cocc, CON, dig, FERR, ferr-ar, ferr-p, GELS, GRAPH, helon, hyos, kali-c, kali-n, kali-p, LACH, laur, lyc, mag-m, mang, merc, mur-ac, nat-a, nat-c, nat-m, nit-ac, nux-m, NUX-V, op, PH-AC, phos, PIC-AC, psor, puls, sel, seneg, sep, SIL, stann, staph, stram, stront-c, sulph, SUL-AC, thuj, valer, verat\n" +
                        "• Chronic fatigue syndrome aggravated by exertion:\n" +
                        "arn, ars, calc, cann-s, chin, gel, helon, nux-v, ph-ac, SIL, thuj\n" +
                        "• Chronic fatigue from mononucleosis:\n" +
                        "bapt, calc, CARC, gels, merc, ph-ac, sil thuj\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Colitis" ->{
                homeopathic_detail = "• Chronic inflammation of the intestines:\n" +
                        "hydr, phyt, ox-ac, sulph\n" +
                        "• Inflammation of the intestines with mucus:\n" +
                        "asar, colch, cop, kali-p, rhus-t, zinc-valer\n" +
                        "(For an overview of Homeopathy, click here.)  "
                ss = SpannableString(homeopathic_detail)
            }
            "Congestive Heart Failure" ->{
                homeopathic_detail = "• Congestive heart failure, general:\n" +
                        "ACON, apis, asaf, APOC, cham, CRAT, cycl, dig, GLON, hyper, lach, lil-t, nux-m, phos, puls, sulph\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Constipation" ->{
                homeopathic_detail = "• Chronic constipation:\n" +
                        "ALUM, bry, calc, graph, lac-d, nat-m, nux-v, OP, plb, sep, sul-i, sulph, verat\n" +
                        "• Constipation in children:\n" +
                        "acon, aesc, ALUM, ant-c, apis, bell, BRY, CALC, caust, cham, coll, croc, graph, hep, hydr, hydr-ac, kreos, LYC, mag-m, meph, nat-m, nit-ac, NUX-V, OP, paraf, plat, plb, podo, psor, sep, sil, verat\n" +
                        "• Constipation due to drug abuse:\n" +
                        "agar, ant-c, bry, chin, COLOC, hydr, lach, NUX-V, op, ruta, sulph\n" +
                        "• Constipation in women:\n" +
                        "aesc, alet, alum, ambr, anac, arn, asaf, bry, calc, coll, con, graph, hydr, ign, lach, lyc, mez, nat-m, nux-v, op, plat, plb, podo, puls, SEP, sil, sulph\n" +
                        "• Constipation in men with enlarged prostates:\n" +
                        "arn, sil\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Crohn's Disease" ->{
                homeopathic_detail = "• Crohn's disease, general:\n" +
                        "aloe, ars, chin, merc-c\n" +
                        "• Inflammation of the intestines:\n" +
                        "ACET-AC, ACON, ANT-T, APIS, BELL, BRY, cact, cham, colch, cop, cupr-s, grat, jal, lach, lycps, merc, ox-ac, plb, rhus-t, sulph, TER, verat-v\n" +
                        "• Inflammation alternating with diarrhea and constipation:\n" +
                        "ign\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Cystitis" ->{
                homeopathic_detail = "• Cystitis, general:\n" +
                        "ACON, all-c, am-c, ant-t, APIS, arg-n, arn, ars, aspar, bar-m, BELL, benz-ac, berb, cact, calad, calen, calc, camph, cann-i, cann-s, CANTH, caps, carb-an, caust, chim, chin-s, colch, coloc, con, cip, cub, dig, dulc, elat, EQUIS, ery-a, eup-pur, ferr-ac, ferr-p, gels, hep, hydr, hyos, kali-ar, kali-bi, kali-c, kali-chl, LACH, lil-t, lith, LYC, MED, merc, merc-c, nit-ar, nux-v, petr, petros, ph-ac, polyg, pop, prun, PULS, rhus-t, sabal, SARS, sabin, senec, seneg, SEP, solid, squil, STAPH, stigm, stram, sulph, tarent, TER, THLASPI, thuj, tritic, tub, uva, verat-v\n" +
                        "• Cystitis, recurrent:\n" +
                        "canth, lyc, puls, sep, staph\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Depression" ->{
                homeopathic_detail = "• Depression after childbirth:\n" +
                        "agn, anac, arg-n, aur, aur-m, bell, cimic, con, ign, kali-br, lach, lil-t, manc, nat-m, plat, psor, puls, SEP, SULPH, thuj, tub, verat, verat-v\n" +
                        "• Depression when alone:\n" +
                        "all-s, ARS, aur, bov, calc, con, dros, ferr, ferr-ac, kali-ar, kali-c, kali-n, lyc, mag-aust, mag-m, mez, NAT-M, phos, PULS, sil, stram, valer, zinc\n" +
                        "• Depression after grief:\n" +
                        "am-m, AUR, carc, ign, NAT-M, ph-ac, staph\n" +
                        "• Depression in alcoholics:\n" +
                        "alco, aur, carc, cimic, lach, nat-m, nux-v, puls, staph\n" +
                        "• Depression during menopause:\n" +
                        "anac, arg-m, arg-n, aur, aur-m, buth-a, cimic, con, hydroph, ign, kali-br, lach, lil-t, magn-gr, manc, nat-m, penic, psor, puls, SEP, SULPH, tab, valer, verat, zinc\n" +
                        "• Depression about health:\n" +
                        "acon, ars, carc, sep, staph\n" +
                        "• Depression in children:\n" +
                        "abrot, ars, aur, calc, carc, caust, lach, lyc, NAT-M, rhus-t, sulph\n" +
                        "• Depression from disappointed love:\n" +
                        "aur, bell, carc, dig, hyos, IGN, nat-m\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Diabetes Mellitus" ->{
                homeopathic_detail = "• Diabetes mellitus, general:\n" +
                        "acet-ac, adren, alf, all-s, alumn, am-c, aml-n, ant-t, arg-m, arg-n, arn, ars, ars-br, ars-i, aur, aur-m, bar-c, bell, benz-ac, BOV, bry, calc, calc-p, CARC, cean, cham, chel, chim, chin, chion, coca, cod, coff, colch, con, crot-h, cupr, cupr-ar, cur, elaps, eup-pur, ferr-m, fl-ac, glon, glyc, hell, HELON, hep, iod, iris, kali-br, kali-chl, kali-p, kreos, lac-d, lach, lec, lith, LYC, lycps, lyss, mag-s, med, mosch, morph, mur-ac, murx, nat-m, nat-p, nat-s, nit-ac, nux-v, op, petr, PH-AC, phase, PHOS, pic-ac, PLB, podo, rat, rhus-a, sal-ac, sec, sep, sil, equil, sulph, sul-ac, tarax, TARENT, TER, thuj, thyr, tub, URAN-N, urea, vanad, zinc, ziz\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Dysmenorrhea" ->{
                homeopathic_detail = "• Dysmenorrhea on the first day of menses:\n" +
                        "gnaph, lach\n" +
                        "• Dysmenorrhea that is ameliorated by warmth:\n" +
                        "ars, cast, caust, MAG-P, nux-m, sabin, ven-m\n" +
                        "• Dysmenorrhea at the end of menses:\n" +
                        "buth-a\n" +
                        "• Dysmenorrhea ameliorated by the beginning of the flow:\n" +
                        "kali-fer, lach, mag-p, mosch, zinc, zinc-valer\n" +
                        "• Dysmenorrhea with crying and screaming from the pain:\n" +
                        "cact, CHAM, coff, COLOC, cupr, ign, mag-p, plat, sep\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }

            "Ear Infection" ->{
                homeopathic_detail = "• Otitis interna:\n" +
                        "Bell., Calc., Calc-S., Cham., Grapph., Hep., Merc., Sulph.\n" +
                        "• Otitis media:\n" +
                        "Bell., Calc., Calc-S., Cham., Hep., Kali-Bi., Lyc., Merc., Merc-D., Puls., Sil., Sulph.\n" +
                        "• Chronic otitis media:\n" +
                        "Carc., Merc., Merc-D., Psor., Puls., Sil.\n" +
                        "• Chronic otitis media with discharge:\n" +
                        "Caust., Sil., Tub.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Eczema, Chronic" ->{
                homeopathic_detail = "• Eczema, general:\n" +
                        "aethi-m, alum, am-c, am-n, ant-c, arb, ARS, ARS-I, aur, aur-m, BAR-M, bell, berb, bor, bov, brom, bry, calad, CALC, CALC-S, canth, caps, carb-ac, carb-s, carb-v, carc, caust, chrysar, CIC, CROTH-T, cycl, DULC, frag, fuli, GRAPH, HEP, hippoz, hydr, hydrc, iris, JUG-C, JUG-R, kali-ar, kali-bi, kali-c, kali-chl, kali-m, kali-s, kreos, lach, LAPPA-M, led, lith, lyc, mang, merc, merc-d, merc-p-r, merc-sul, MEZ, mur-ac, nat-m, nat-p, nat-s, nit-ac, nux-v, OLND, PETR, phos, phyt, piloc, plb, podo, PSOR, ran-b, RHUS-T, rhus-v, sars, sep, sil, skook, staph, SULPH, SUL-I, tarent-c, tell, thuj, thyr, tub, ust, vinc, viol-t, x-ray, xero\n" +
                        "• Eczema in children:\n" +
                        "carc, graph, nat-m, sulph\n" +
                        "• Eczema aggrevated by menses:\n" +
                        "mang\n" +
                        "• Eczema over the whole body:\n" +
                        "crot-t, rhut-t\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }

            "Endometriosis" ->{
                homeopathic_detail = "• Acute endometriosis:\n" +
                        "acon, ant-i, apis, arn, ars, bell, bry, canth, cham, cimic, chin, con, gels, hep, hyos, iod, kali-c, kali-i, lach, lil-t, med, mel-c-s, merc-c, nux-v, op, ph-ac, plat, puls, rhus-t, sabin, sec, sep, sil, sram, sulph, ter, til verat-v\n" +
                        "• Chronic endometriosis:\n" +
                        "alet, aloe, ars, aur-m, aur-m-n, bell, calc, carb-ac, caul, chin-a, cimic, con, graph, helon, hydr, iod, kali-a, kali-c, kali-s, kreos, lac-c, lach, lyc, mag-m, med, mel-c-s, merc, nat-m, nit-ac, nux-v, ph-ac, phos, plb, puls, rhus-t, sabin, sec, sep, sil, stram, sulph\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }

            "Erectile Dysfunction" ->{
                homeopathic_detail = "• General impotence:\n" +
                        "Arg., Bar-C., Calad., Calc., Calc-S., Chin., Con., Lyc., Med., Nux-V., Phos., Sel., Sep., Sulph.\n" +
                        "• Chronic impotence:\n" +
                        "Lyc.\n" +
                        "• Impotence with diabetes:\n" +
                        "Helon., Mosch.\n" +
                        "• Impotence in elderly men:\n" +
                        "Lyc., Impotence with an enlarges prostate:\n" +
                        "Dig., Lyc., Sel.\n" +
                        "• Impotence with sadness:\n" +
                        "Aur., Calad., Gels., Kali-Br., Spong.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }

            "Fertility" ->{
                homeopathic_detail = "   Infertility - female:\n" +
                        "agn, alet, alum, am-c, anag, anan, apis, AUR, aur-i, aur-m, bar-c, bar-m, BOR, brom, calc, calc-i, cann-i, cann-s, canth, caps, carb-s, caul, caust, cic, cocc, coff, con, croc, dam, dulc, eup-pur, ferr, ferr-p, fil, form, goss, graph, helon, hyos, iod, kali-br, kali-c, kreos, lach, lappa-a, lec, lil-t, man, med, merc, mill, NAT-C, NAT-M, nat-p, nux-m, nux-v, orig, ov, phos, phyt, pituin, plat, plb, puls, ruta, sabal, sabin, sec, senec, SEP, sil, sulph, sul-ac, syph, ther, vib, wies, x-ray, zinc\n" +
                        "   Infertility - due to low sperm count - male:\n" +
                        "sulfa, x-ray\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Fibrocystic Breast Disease" ->{
                homeopathic_detail = "• Nodules in the breasts:\n" +
                        "aster, bell-p, bry, bufo, calc-p, calen, CARB-AN, carb-v, cham, chim, chin, clem, coloc, CON, crot-t, cund, dulc, foll, graph, iod, kali-m, kreos, lac-c, lyc, mang, nit-ac, phos, PHYT, puls, ruta, SIL, sulph, thuj, tub\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }

            "Fibromyalgia" ->{
                homeopathic_detail = "• Aching pain in muscles:\n" +
                        "achy, acon, alet, am-caust, ant-t, ARN, ars, aster, bell, brach, bry, calc, calc-p, carb-s, caust, cimic, colch, dulc, eup-per, ferr-p, GELS, harp, hist, ign, lat-m, LAC-AC, led, lyc, mag-s, man, merc, merc-c, morph, nat-f, nat-m, op, phyt, plb, ptel, puls, pyrog, ran-b, rauw, rham-cath, rhus-t, ruta, sal-ac, sil, staph, stram, stry, sulfa, tab, tarax, thal, thuj, valer, verat, verat-v, zinc\n" +
                        "• Aching neck pain extending to the shoulders:\n" +
                        "verat-v\n" +
                        "• Myositis:\n" +
                        "arn, bell, bry, calc, ham, hep, kali-i, merc, mez, rhus-t, ruta\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Gallbladder Disease" ->{
                homeopathic_detail = "• General cholecystitis:\n" +
                        "Card-M., Chel., Chion., Chol., Lach., Lept., MargG., Myrc., Phos., Podo., Pyrog.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Gallstones" ->{
                homeopathic_detail = "• Pain from cholelithiasis:\n" +
                        "Bell., Berb., Carc., Card-M., Chin., Chol., Coloc., Dios., Lyc., Morg., Nat-S., Verat.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Gout" ->{
                homeopathic_detail = "• Gout, general (the following remedies have not been rated):\n" +
                        "Abro, Arn, Ben-Ac, Berb, Bry, Calc, Caust, Colc, Kalmia, Led, Lyc, Nat-P, Rad-B, Rhus-T, Spon, Sulph, Urt-U\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Headache, General" ->{
                homeopathic_detail = "• Headache from mental exertion:\n" +
                        "Aur., Cact., Calc., Calc-P., Glon., Lyc., Nat-C., Nat-M., Nat-P., Nux-V., Ph-Ac., Pic-Ac., Puls., Sil.\n" +
                        "• Hammering headache:\n" +
                        "Bell., Ferr., Ferr-Ar., Glon., Nat-M., Sil., Sulph., Nat-M.\n" +
                        "• Headache on the left side:\n" +
                        "Brom., Sep., Spig.\n" +
                        "• Headache on the right side:\n" +
                        "Bell., Calc., Carb-V., Ign., Iris, Sabad., Sep.\n" +
                        "• Headache in the forehead:\n" +
                        "Acon., Am-C., Am-M., Arn., Ars., Bell., Bery., Caps., Cocc., Dros., Hep., Hyos., Ign., Kali-S., Lac-C., Laur., Merc., Nat-A., Nat-C., Nat-M., Nux-V., Phos., Puls., Sil., Spig., Stann., Sulph.\n" +
                        "• Headache in the occiput:\n" +
                        "Apis, Arn., Bell., Bry., Carb-S., Carb-V., Caust., Chin., Cimic., Cocc., Fl-Ac., Gels., Glon., Jug-C., LacC., Nux-V., Onos., Petr., Ph-Ac., Pic-Ac., Sep., Sel.\n" +
                        "• Headache on the sides:\n" +
                        "Alum., Arg-N., Coff., Kali-C., Kali-I., Kali-P., Ph-Ac., Plat., Puls., Sars., Spig., Suf-Ac., Verat., Zinc.\n" +
                        "• Headache in the temples:\n" +
                        "Arg-N., Anac., Bell., Carb-Ac., Chin., Cycl., Kali-C., Kreos., Lac-C., Lyc., Nux-M., Par., Plat., Puls., Sabin., Tarax., Thuj., Verb.\n" +
                        "• Headache in the vertex:\n" +
                        "Apis., Brom., Cact., Carb-An., Cimic., Ran-S., Sulph., Verat.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Headache, Migraine" ->{
                homeopathic_detail = "• Migraine, general:\n" +
                        "acon, AGAR, anac, ANT-C, apis, arg-m, arn, ars, ASAF, asar, aur, bell, BRY, cact, calad, calc, calc-p, caust, cedr, cham, chel, CHIN, cic, cinic, cina, cocc, COFF, coloc, eurp-per, GELS, glon, graph, IGN, IP, IRIS, kali-bi, kalipp, lac-c, lach, lyc, NAT-M, nat-s, NUX-V, PHOS, PULS, SANG, sep, SIL, stram, sulph, tab, tarent, ther, THUJ, valer, ZINC\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Hemorrhoids" ->{
                homeopathic_detail = "• General hemorrhoids:\n" +
                        "Aesc., Agar., Aloe, Ars., Carb-An., Carb-V., Caust., Coll., Graph., Ham., Kali-Ar., Kali-C., Kali-S., Lach., Lyc., Merc-Ir., Mur-Ac., Nit-Ac., Nux-V., Paeon., Phos., Puls., Rat., Sep., Sulph.\n" +
                        "• Hemorrhoids in alcoholics:\n" +
                        "Ars., Carb-V., Lach., Nux-V., Sul-Ac., Sulph.\n" +
                        "• Hemorrhoids since childbirth:\n" +
                        "Aloe., Ign., Kali-C., Lil-T., Mur-Ac., Podo., Puls., Sep., Sulph.\n" +
                        "• Chronic hemorrhoids:\n" +
                        "Aesc., Coll., Ham., Merc-I-R., Nux-V., Sulph.\n" +
                        "• External hemorrhoids:\n" +
                        "Aesc., Aloe, Ham., Lach., Mur-Ac., Rat., Sulph.\n" +
                        "• Internal hemorrhoids:\n" +
                        "Aesc., Aloe, Ars., Brom., Cham., Coloc., Ham., Ign., Nux-V., Podo., Puls., Sulph.\n" +
                        "• Protruding like grapes:\n" +
                        "Aesc., Aloe., Carb-V., Caust., Coll., Dios., Mur-Ac., Nux-V.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Hepatitis" ->{
                homeopathic_detail = "• Acute Hepatitis:\n" +
                        "ACON, bell, kali-c, sulph\n" +
                        "• Chronic Hepatitis:\n" +
                        "arn, aur, bell, carc, CARD-M, corn, crot-h, lach, LYC, mag-m, nat-c, nat-m, NAT-S, nit-ac, nux-v, PHOS, psor, ran-s, sel, sil, sulph\n" +
                        "• Hepatitis from dirty needles:\n" +
                        "bapt, led, pyrog\n" +
                        "• Hepatitis with jaundice:\n" +
                        "astac, cham, hep\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Herpes Simplex" ->{
                homeopathic_detail = "• General herpes simplex:\n" +
                        "Ars., Bov., Calc., Calc-S., Carb-S., Clem., Con., Dulc., Graph., Lyc., Med., Merc., Nat-M., Rhus-T., Sep., Sil., Sulph., Tell., Thuj.\n" +
                        "• Herpes in clusters:\n" +
                        "Dulc.\n" +
                        "• Herpes during menses:\n" +
                        "Petr.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "High Blood Pressure" ->{
                homeopathic_detail = "• General hypertension:\n" +
                        "Adren., Aur., Car-C., Calc., Crat., Glon., Grat., Lach., Nat-M., Nux-V., Plb., Rauw., Stront-C., Suplh., Sumb., Verat.\n" +
                        "• Sudden rise in blood pressure:\n" +
                        "Coff., Glon.\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "High Cholesterol" ->{
                homeopathic_detail = "• Atheroma:\n" +
                        "aur-m, bell, brom, calc, calc-f, caps, graph, kali-i, lach, lac-ac, lyc, phos, plb, sil, sulph\n" +
                        "• Atheroma in elderly people:\n" +
                        "lach\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "HIV" ->{
                homeopathic_detail = "• Fevers: AIDS: acquired immune deficiency syndrome:\n" +
                        "ARS, ars-i, bapt, carc, echi, ferr-p, gels, lyc, MED, MERC, ph-ac, phos, puls, pyrog, sil, sulph, syph, THUJ, tub, x-ray\n" +
                        "(For an overview of Homeopathy, click here)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Hyperactivity" ->{
                homeopathic_detail = "• Aversion to concentration:\n" +
                        "calc, gels, lyc, med, nux-v, phos, ph-ac, plb, sil, staph\n" +
                        "• Difficult to concentrate in children:\n" +
                        "aeth, am-c, BAR-C, carc, lach, med, ph-ac, phos, sil, zinc\n" +
                        "• Difficult to concentrate in the afternoon:\n" +
                        "ang, cham, ery-a, myris, sang\n" +
                        "• Difficult to concentrate while studying and reading:\n" +
                        "acon, AETH, agn, alum, ambr, ang, asar, bar-c, bar-m, bell, calc-f, calc-sil, carb-ac, carb-s, caust, cham, coff, corn, dros, fago, ferr-i, HELL, iod, kali-p, kali-sil, lach, lyc, merc, mur-ac, nat-a, nat-c, nat-p, NUX-V, ox-ac, phos, pic-ac, scut, SIL, spig, staph, sulph, syph, tab, zinc-p\n" +
                        "• Hyperactivity in children:\n" +
                        "anac, ars, ars-i, calc-p, CARC, cina, coff, HYOS, iod, MED, nux-v, STRAM, tarent, thuj, TUB, verat\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Hypercholesterolemia" ->{
                homeopathic_detail = "• Atheroma:\n" +
                        "aur-m, bell, brom, calc, calc-f, caps, graph, kali-i, lach, lac-ac, lyc, phos, plb, sil, sulph\n" +
                        "• Atheroma in elderly people:\n" +
                        "lach\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Hypertension" ->{
                homeopathic_detail = "• General hypertension:\n" +
                        "Adren., Aur., Car-C., Calc., Crat., Glon., Grat., Lach., Nat-M., Nux-V., Plb., Rauw., Stront-C., Suplh., Sumb., Verat.\n" +
                        "• Sudden rise in blood pressure:\n" +
                        "Coff., Glon.\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Hypothyroid" ->{
                homeopathic_detail = "• General hypothyroidism:\n" +
                        "Calc., Kali-I.\n" +
                        "• Heart disease with thyroid problems:\n" +
                        "Lyc., Am-C.\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "IBS" ->{
                homeopathic_detail = "• Chronic inflammation of the intestines:\n" +
                        "hydr, phyt, ox-ac, sulph\n" +
                        "• Inflammation of the intestines with mucus:\n" +
                        "asar, colch, cop, kali-p, rhus-t, zinc-valer\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Impotence" ->{
                homeopathic_detail = "• General impotence:\n" +
                        "Arg., Bar-C., Calad., Calc., Calc-S., Chin., Con., Lyc., Med., Nux-V., Phos., Sel., Sep., Sulph.\n" +
                        "• Chronic impotence:\n" +
                        "Lyc.\n" +
                        "• Impotence with diabetes:\n" +
                        "Helon., Mosch.\n" +
                        "• Impotence in elderly men:\n" +
                        "Lyc., Impotence with an enlarges prostate:\n" +
                        "Dig., Lyc., Sel.\n" +
                        "• Impotence with sadness:\n" +
                        "Aur., Calad., Gels., Kali-Br., Spong.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Incontinence, Stress" ->{
                homeopathic_detail = "• Incontinence in general:\n" +
                        "(3) Bell, Caust, Ph-Ac (2) aloe, arn, gels. hyos, phos, podo, puls, sep, sulph (1) ars, chin, con, dios, mur-ac, nat-m, sol, staph\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Infertility" ->{
                homeopathic_detail = "Infertility - female:\n" +
                        "agn, alet, alum, am-c, anag, anan, apis, AUR, aur-i, aur-m, bar-c, bar-m, BOR, brom, calc, calc-i, cann-i, cann-s, canth, caps, carb-s, caul, caust, cic, cocc, coff, con, croc, dam, dulc, eup-pur, ferr, ferr-p, fil, form, goss, graph, helon, hyos, iod, kali-br, kali-c, kreos, lach, lappa-a, lec, lil-t, man, med, merc, mill, NAT-C, NAT-M, nat-p, nux-m, nux-v, orig, ov, phos, phyt, pituin, plat, plb, puls, ruta, sabal, sabin, sec, senec, SEP, sil, sulph, sul-ac, syph, ther, vib, wies, x-ray, zinc\n" +
                        "   Infertility - due to low sperm count - male:\n" +
                        "sulfa, x-ray\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Insomnia" ->{
                homeopathic_detail = "• Insomnia after an accident:\n" +
                        "stict\n" +
                        "• Insomnia in alcoholics:\n" +
                        "ars, aven, canni-i, cimic, gels, hyos, nux-v, op, stram, sumb\n" +
                        "• Insomnia from anxiety:\n" +
                        "acon, agar, alum, ARS, bell, bry, COCC, coff, crot-h, dig, graph, hyos, ign, kali-br, kali-c, kali-i, lach, mag-arct, mag-c, mag-m, merc-c, nat-c, nat-m, nux-v, puls, rhus-t, sabin, sep, sil, sulph, thuj, verat\n" +
                        "• Insomnia with difficult breathing:\n" +
                        "arg-n, ars, bor, carb-an, cham, chlol, grin, kali-br, kali-c, kali-i, lach, lact, morph, ran-b, stann, syph\n" +
                        "• Insomnia after domestic calamity:\n" +
                        "aur, calc, lach\n" +
                        "• Insomnia in children:\n" +
                        "absin, acon, ars, arund, bell, calc, CARC, CHAM, cina, COFF, cypr, hyos, kali-br, mag-m, passi, phos, puls, stict, sulph, tub\n" +
                        "• Chronic insomnia:\n" +
                        "apis, ars-h, crot-h, cupr-ar, hydr-ac, hyos, LACH, plat, verat\n" +
                        "• Insomnia from cramps:\n" +
                        "arg-m, CALC, coloc, cupr, mag-p\n" +
                        "• Insomnia with depression:\n" +
                        "AUR, lyss, nat-m, psor\n" +
                        "• Insomnia in diabetics:\n" +
                        "uran-n\n" +
                        "• Insomnia after drugs:\n" +
                        "ars, AVEN, cann-i, chlol, cimic, gels, hyos, mosch, NUX-V, op, sec, sumb\n" +
                        "• Insomnia in the elderly:\n" +
                        "acon, ars, aur, bar-c, CALC, op, passi, phos, sulph, SYPH\n" +
                        "• Insomnia from excitement:\n" +
                        "abrot, agar, ambr, anac, arg-n, aur-m, calc, camph, canth, caps, carb-an, CARC, chin, cimic, COFF, dys-co, ferr, gels, hep, HYOS, kali-p, lach, laur, lyc, lyss, mag-aust, mag-c, meph, merc, mez, mosch, nit-ac, NUX-V, op, phos, plat, puls, ran-b, sener, sep, spong, staph, sulph, sul-ac, teucr\n" +
                        "• Insomnia aggravated by exertion:\n" +
                        "calc, chin, cimic, nux-v, sil\n" +
                        "• Insomnia aggravated by mental exertion:\n" +
                        "agar, ambr, ARS, aur-m, aven, calc, cocc, coff, ferr, HYOS, ign, kali-br, kali-c, kali-p, lach, lyc, nux-v, ph-ac, pic-ac, sil\n" +
                        "• Insomnia aggravated by exhaustion:\n" +
                        "aven, chlol. coca, cocc, coff\n" +
                        "• Insomnia from excessive mental and physical fatigue:\n" +
                        "carc, chlol, chol, cocc, gels\n" +
                        "• Insomnia from fear:\n" +
                        "ACON, alum, am-c, arn, ars, bell, bry, calc, carb-v, caust, cham, cocc, coff, dig, graph, hyos, ign, kali-c, laur, lyc, mag-c, mag-m, merc, merc-c, nat-m, nit-ac, nux-v, PHOS, puls, ran-s, rhus-t, sep, sil, sulph\n" +
                        "• Insomnia in gout:\n" +
                        "mang\n" +
                        "• Insomnia from grief:\n" +
                        "aur, gels, graph, IGN, kali-br, lach, NAT-M, sulph\n" +
                        "• Insomnia during menopause:\n" +
                        "acon, arn, bell, cimic, cocc, coff, dig, gels, kali-br, senec, sulph, valer, zinc\n" +
                        "• Insomnia during menses:\n" +
                        "agar, am-c, cimic, eupi, gent-c, ign, mag-m, nat-m, senec, sep\n" +
                        "• Insomnia after mental exertion:\n" +
                        "agar, aur-m, ambr, ARS, coff, ferr, HYOS, ign, kali-br, kali-c, kali-p, lach, lyc, nux-v, passi, ph-ac, pic-ac\n" +
                        "• Insomnia at 1 am:\n" +
                        "spig\n" +
                        "• Insomnia 1-2 am:\n" +
                        "sulph\n" +
                        "• Insomnia 1-3 am:\n" +
                        "chlorpr\n" +
                        "• Insomnia 1-4 am:\n" +
                        "bor, phos\n" +
                        "• Insomnia 1:30-2:30 am:\n" +
                        "agar, perh\n" +
                        "• Insomnia at 2 am:\n" +
                        "cham, puls\n" +
                        "• Insomnia 2-3 am:\n" +
                        "arn, bapt, calc, calc-p, gink-b, kali-c, mag-m, merc\n" +
                        "• Insomnia 2-4 am:\n" +
                        "am-c, am-m, arist-cl, merc, ph-ac\n" +
                        "• Insomnia 2-5 am:\n" +
                        "arist-cl, bell, bor, chloram, sulph\n" +
                        "• Insomnia until 2:30 am:\n" +
                        "lyc, pip-m\n" +
                        "• Insomnia at 3 am:\n" +
                        "am-m, ars, aur, bry, chin, chin-a, com, euphr, eupi, mag-c, merc, mez, mill, nat-p, ran-s, rhus-t, sil\n" +
                        "• Insomnia 3-4 am:\n" +
                        "arist-cl, chel, nux-v, rib-ac\n" +
                        "• Insomnia 3-5 am:\n" +
                        "arist-cl, bell-p, calc-f, cob-n, man\n" +
                        "• Insomnia at 4 am:\n" +
                        "acon-c, aloe, am-c, bor, cocc, cupr-s, nit-ac, tarent\n" +
                        "• Insomnia 4-6:30 am:\n" +
                        "cycl\n" +
                        "• Insomnia after 4:30 am:\n" +
                        "sep\n" +
                        "• Insomnia after 5 am:\n" +
                        "carb-an, tarent\n" +
                        "• Insomnia from pains:\n" +
                        "acon, ars, arum-t, aur, bufo, cann-i, CHAM, cimic, coloc, dol, eup-per, eupi, ferr-p, iris, kreos, lach, mag-c, mag-m, merc, passi, phyt, plb, ptel, puls, rhus-t, sin-n, stram, sulph\n" +
                        "• Insomnia after retiring but sleepy before retiring:\n" +
                        "AMBR\n" +
                        "• Insomnia from sadness:\n" +
                        "AUR, ign, kali-br, kali-c, nat-m, thuj\n" +
                        "• Insomnia from twitching of the limbs:\n" +
                        "ambr, alum, arg-n, ARS, bell, calc, canth, carb-v, carc, cham, cypr, ign, kali-c, lyc, merc-c, nat-m, op, PULS, rhus-t, sel, sep, stront-c, sulph, tab, valer\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Irritable Bowel Syndrome" ->{
                homeopathic_detail = "• Chronic inflammation of the intestines:\n" +
                        "hydr, phyt, ox-ac, sulph\n" +
                        "• Inflammation of the intestines with mucus:\n" +
                        "asar, colch, cop, kali-p, rhus-t, zinc-valer\n" +
                        "(For an overview of Homeopathy, click here.)  "
                ss = SpannableString(homeopathic_detail)
            }
            "Longevity" ->{
                homeopathic_detail = "• Premature old age:\n" +
                        "agn, alco, alum, ambr, arg-m, arg-n, bar-c, berb, bufo, carb-v, chin-s, coca, con, cortico, cupr, fl-ac, kali-c, lyc, nux-v, op, psor, sars, SEL, sep, staph, stram, sulph, vip\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Lupus" ->{
                homeopathic_detail = "• General Lupus:\n" +
                        "agar, alum, alumn, ant-c, arg-n, ARS, ars-i, bar-c, bell, calc, carb-ac, carb-v, caust, cic, cist, graph, hep, hydrc, kali-ar, kali-bi, kali-c, kali-chl, kali-s, kreos, lach, LYC, nat-m, NIT-AC, phyt, psor, rhus-t, sabin, sep sil, staph, THUJ\n" +
                        "• Lupus, erythematosus:\n" +
                        "apis, cist, hydrc, kali-bi, phos, thyr\n" +
                        "• Lupus, face:\n" +
                        "alumn, arg-n, ARS, aur-i, aur-m, carb-ac, carb-v, caust, HYDR, kali-ar, kali-bi, kreos, lach, sep\n" +
                        "(For an overview of Homeopathy, click here"
                ss = SpannableString(homeopathic_detail)
            }
            "Macular Degeneration" ->{
                homeopathic_detail = "• General blindness:\n" +
                        "Acon., Bell., Hyos., Merc., Nat-M., Puls., Stram., Sulph.\n" +
                        "• Amblyopia:\n" +
                        "Amme., Chin., Dros., Gels., Merc., Nat-M., Op.., Phos., Ph-Ac., Ruta., Stram.\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Manic Depressive Disorder" ->{
                homeopathic_detail = "• Manic depression:\n" +
                        "agar, arg-m, anac, aur, bell, cann-i, CARC, coff, con, cyt-l, hyos, kres, LACH, lil-t, MED, nat-s, phos, psor, STAPH, stram, sulfa, verat\n" +
                        "• Mania, abuses everyone:\n" +
                        "anac, camph, lach, tarent\n" +
                        "• Mania, rage, with:\n" +
                        "agar, ant-t, apis, ars, BELL, camph, cann-i, cann-s, croc, cupr, HYOS, lach, lol, LYC, merc, nux-v, op, ph-ac, phos, pib, sec, sol-n, staph, STRAM, verat, verat-v, zinc\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Mastitis" ->{
                homeopathic_detail = "• Mastitis infection:\n" +
                        "Acon., Apis, Bell., Bry., Cact., Carb-An., Carb-S., Carb-V., Card-M., Cham., Cist., Con., Crot-T., Hep., Lac-C., Lach., lyc., Merc., Phel., Phos., Phyt., Puls., Sil., Sulph.\n" +
                        "• Chronic mastitis:\n" +
                        "Carc., Fl-Ac.\n" +
                        "• Heat, swelling and pain with mastitis:\n" +
                        "Bell., Plan.\n" +
                        "• Mastitis of the left breast:\n" +
                        "Cist.\n" +
                        "• Mastitis after childbirth with fever and prostration:\n" +
                        "Croth-H.\n" +
                        "• Mastitis during pregnancy, painful:\n" +
                        "Bell., Bry.\n" +
                        "• Mastitis that suppresses milk:\n" +
                        "Bry.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Memory Loss" ->{
                homeopathic_detail = "• General memory loss:\n" +
                        "Anac., Bell., Camph., Dig., Hyos., Verat.\n" +
                        "• Memory loss after a stroke:\n" +
                        "Anac., Op., Plb.\n" +
                        "• Forgetful:\n" +
                        "Amb., Bar-C., Carb-S., Cocc., Colch., Lyc., Petr., Ph-Ac., Phos., Plat., Zinc-P.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Menopause" ->{
                homeopathic_detail = "• General menopause:\n" +
                        "acon, agar, alet, aloe, aml-n, apis, arg-n, aur, bar-c, bell, bell-p, bor-ac, bov, bry, cact, calc, calc-ar, camph, caps, carb-v, carc, caul, chin, cimic, cocc, coff, con, croc, CROT-C, crot-h, cycl, ferr, ferr-p, gels, glon, GRAPH, helon, hydr, ign, jab, kali-bi, kali-br, kali-c, kali-s, kreos, LACH, laur, lyc, mag-c, mag-p-a, man, manc, MANG, meli, mosch, murx, nat-m, nit-ac, nux-m, nux-v, ol-an, orch, ov, ph-ac, phos, phys, piloc, plat, plb, PSOR, PULS, rhus-t, sabin, sal-ac, sang, sars, sec, sel, SEP, stront-c, SULPH, sul-ac, tab, ter, ther, tril, ust, valer, verat, visc, xan, zinc, zinc-valer\n" +
                        "• Hot flashes:\n" +
                        "acet-ac, am-m, ant-c, aur, bell, carb-v, fl-ac, hep, kali-bi, lach, op, phos, puls, SEP, sulph, sul-ac, TUB, xan\n" +
                        "• Obesity with menopause:\n" +
                        "calc, calc-ar\n" +
                        "• Premature menopause:\n" +
                        "absin\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Migraine Headache" ->{
                homeopathic_detail = "• Migraine, general:\n" +
                        "acon, AGAR, anac, ANT-C, apis, arg-m, arn, ars, ASAF, asar, aur, bell, BRY, cact, calad, calc, calc-p, caust, cedr, cham, chel, CHIN, cic, cinic, cina, cocc, COFF, coloc, eurp-per, GELS, glon, graph, IGN, IP, IRIS, kali-bi, kalipp, lac-c, lach, lyc, NAT-M, nat-s, NUX-V, PHOS, PULS, SANG, sep, SIL, stram, sulph, tab, tarent, ther, THUJ, valer, ZINC\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Mouth Ulcers" ->{
                homeopathic_detail = "• General aphthous stomatitis (ulcer):\n" +
                        "acet-ac, aeth, agar, all-s, alum, anan, ant-c, apis, arg-m, ARS, ars-i, arum-t, asim, aur, aur-m, aur-s, BAPT, berb, BOR, brom, bry, calc, anth, caps, carb-ac, carb-an, carb-s, carb-v, caul, cean, cham, chin, chin-a, chlor, cic, clem, cocc, com, cub, dig, dulc, ferr, gamb, hell, hep, hippoz, hydr, ill, iod, ip, jug-c, kali-ar, kali-bi, kali-br, kali-c, KALI-CHI, kali-i, kali-m, kali-s, kreos, lac-c, lac-d, lach, lac-ac, lyc, mag-c, MERC, MERC-C, merc-d, MUR-AC, myric, nat-a, nat-c, nat-h, NAT-M, nat-p, nit-ac, nux-m, NUX-V, ox-ac, petr, phos, phyt, plan, plb, ran-s, rhus-t, sal-ac, sanic, sars, sec, semp, sil, staph, SUL-AC, SULPH, ter, thuj, tub, vine\n" +
                        "• Aphthous stomatitis, bleeds easily:\n" +
                        "BOR, lac-c, sul-ac\n" +
                        "• Aphthous stomatitis, bloody, offensive:\n" +
                        "sul-ac\n" +
                        "• Aphthous stomatitis, bluish:\n" +
                        "ARS\n" +
                        "• Aphthous stomatitis, burning:\n" +
                        "chin-a, nat-m, sulph\n" +
                        "• Aphthous stomatitis, in children:\n" +
                        "asim, bapt, BOR, bry, casc, kali-br, kali-chi, lac-ac, med, MERC, NAT-M, mur-ac, nux-m, nux-v, plan, sac-alb, SUL-AC, sulph, viol-t\n" +
                        "• Aphthous stomatitis, in babies:\n" +
                        "bor, bry, calc, merc\n" +
                        "• Aphthous stomatitis, after sour, salty foor:\n" +
                        "bor\n" +
                        "• Aphthous stomatitis, white:\n" +
                        "ars, bor, sul-ac\n" +
                        "• Aphthous stomatitis, yellowish base:\n" +
                        "staph\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Multiple Sclerosis" ->{
                homeopathic_detail = "• General multiple sclerosis:\n" +
                        "Agar., Alumina, Arg-N., Asar., Calc., Caust., Cocc., Con., Cur., Gels., Kali-P., Lath., Nat-C., Nat-M., Nux-V., Phos., Plb., Sel., Sulph.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Obesity" ->{
                homeopathic_detail = "• General obesity:\n" +
                        "Calc., Caps., Ferr., Graph., Phyt.\n" +
                        "• Body fat, but thin legs:\n" +
                        "Am-M., Ant-C., Lyc.\n" +
                        "• Obesity in children:\n" +
                        "Ant-C., Bad., Bar-C., Bell., Calc., Caps., Ferr., Kali-Bi., Sac-L., Seneg.\n" +
                        "• Obesity in elderly people:\n" +
                        "Am-C., Sur., Bar-C., Calc., Fl-Ac., Kali-C., Op., sec.\n" +
                        "• Obesity after pregnancy:\n" +
                        "Kali-C., Sep.\n" +
                        "• Obesity in young people:\n" +
                        "Ant-C., Calc., Calc-Ac., Lach.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Osteoarthritis" ->{
                homeopathic_detail = "• Inflammation of arthritis:\n" +
                        "Acon., Apis, Bell., Bry., Led., Sil.\n" +
                        "• Joint aching and pain:\n" +
                        "Carl., Chin-S., Gels., Dalm., Ruta.\n" +
                        "• Rheumatic pain:\n" +
                        "Arn., Ars., Aur-M-N., Bad., Benz-Ac., Bry., Caust., Cham., Chel., Colch., Form., Kali-I., Dalm., Lyc., Med., Nat-A., Phyt., Puls., Rhod., Rhus-T., Sang., Sars., Sulph.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Osteoporosis" ->{
                homeopathic_detail = "• Osteoporus, brittle bones:\n" +
                        "Bufo., Calc., Calc-F., Calc-P., Carc., Sil., Symph.\n" +
                        "• Curving and bowing of bones:\n" +
                        "Calc., Calc-P., Lyn., Sil.\n" +
                        "• Weakness of the bones:\n" +
                        "Asaf., Calc., Calc-F., Calc-P., Merc., Phos., Sil., Symph.\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Otitis Media" ->{
                homeopathic_detail = "• Otitis interna:\n" +
                        "Bell., Calc., Calc-S., Cham., Grapph., Hep., Merc., Sulph.\n" +
                        "• Otitis media:\n" +
                        "Bell., Calc., Calc-S., Cham., Hep., Kali-Bi., Lyc., Merc., Merc-D., Puls., Sil., Sulph.\n" +
                        "• Chronic otitis media:\n" +
                        "Carc., Merc., Merc-D., Psor., Puls., Sil.\n" +
                        "• Chronic otitis media with discharge:\n" +
                        "Caust., Sil., Tub.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Ovarian Cancer" ->{
                homeopathic_detail = "• Ovarian cancer:\n" +
                        "Ars., Con., Graph., Kreos., Lach., Med., Psor., Thuj.\n" +
                        "• General cancer:\n" +
                        "Ars., Brom., Cadm-S., Carb-An., Carc., Con., Hydr., Lyc., Nit-Ac., Phos., Phyt., Sil.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Painful Menses" ->{
                homeopathic_detail = "• Dysmenorrhea on the first day of menses:\n" +
                        "gnaph, lach\n" +
                        "• Dysmenorrhea that is ameliorated by warmth:\n" +
                        "ars, cast, caust, MAG-P, nux-m, sabin, ven-m\n" +
                        "• Dysmenorrhea at the end of menses:\n" +
                        "buth-a\n" +
                        "• Dysmenorrhea ameliorated by the beginning of the flow:\n" +
                        "kali-fer, lach, mag-p, mosch, zinc, zinc-valer\n" +
                        "• Dysmenorrhea with crying and screaming from the pain:\n" +
                        "cact, CHAM, coff, COLOC, cupr, ign, mag-p, plat, sep\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Paralysis Agitans" ->{
                homeopathic_detail = "• Parkinson's disease:\n" +
                        "agar, al, ant-t, aran, arg-n, aven, bar-c, bufo, camph-br, cann-i, caust, chlorpr, cimic,cocaine, cocc, con, dub, dubo-m, gels, halo, helo, hyos, hyosin, kali-br, kres, lath, levo, lil-t, lyc, mag-p, mang, MERC, merc-sul, nicot, nux-v, perh, phos, phys, plb, prun, puls, RHUS-T scut, stram, syph, taab, tarent, thuj, ZINC, zinc-pic\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Parkinson's Disease" ->{
                homeopathic_detail = "• Parkinson's disease:\n" +
                        "agar, al, ant-t, aran, arg-n, aven, bar-c, bufo, camph-br, cann-i, caust, chlorpr, cimic,cocaine, cocc, con, dub, dubo-m, gels, halo, helo, hyos, hyosin, kali-br, kres, lath, levo, lil-t, lyc, mag-p, mang, MERC, merc-sul, nicot, nux-v, perh, phos, phys, plb, prun, puls, RHUS-T scut, stram, syph, taab, tarent, thuj, ZINC, zinc-pic\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Peptic Ulcers" ->{
                homeopathic_detail = "• General ulcer:\n" +
                        "Ars, Ars-I, Asaf, Carb-V, Kali-Br, Kali-Chl, Kali-S, Lach, Lyc, Merc, Nit-Ac, Phyt, Puls, Sil, Sulph \n" +
                        "• Burning ulcer:\n" +
                        "Anthr, Ars, Carb-S, Carb-V, Caust, Lyc, Puls, Rhus-T, Sulph\n" +
                        "• Gnawing ulcer with pain:\n" +
                        "Dros., Staph\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "PMS" ->{
                homeopathic_detail = "• General PMS:\n" +
                        "Bov., Calc., Calc-P., Cupr., Lach., Lyc., Nat-M., Puls., Sep., Suoph., Verat., Zinc\n" +
                        "• Aggravation before and after menses:\n" +
                        "Calc.\n" +
                        "• PMS with breasts aggrevation:\n" +
                        "Calc., Con., Kali-C., Kali-M., Lac-C., Phyt.\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Premenstrual Syndrome" ->{
                homeopathic_detail = "• General PMS:\n" +
                        "Bov., Calc., Calc-P., Cupr., Lach., Lyc., Nat-M., Puls., Sep., Suoph., Verat., Zinc\n" +
                        "• Aggravation before and after menses:\n" +
                        "Calc.\n" +
                        "• PMS with breasts aggrevation:\n" +
                        "Calc., Con., Kali-C., Kali-M., Lac-C., Phyt.\n" +
                        "(For an overview of Homeopathy, click here.)\n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Psoriasis" ->{
                homeopathic_detail = "• General psoriasis:\n" +
                        "Ambr., Ars., Ars-I., Bor., Calc., Calc-S, Canth., Carb-Ac., Chin., Chrysar., Clem., Graph., Iris, Kali-Aar., Cali-C., Kali-S., Lob., Lyc., Mang., Merc., Mex., Morg-G., Nat-M., Nit-Ac., Petr., Phos., Phyt., Psor., Puls., Rhus-T., Sarr., Sras., Sep., Sil., Staph., Sulph.\n" +
                        "(For an overview of Homeopathy, click here.)   \n" +
                        "\n"
                ss = SpannableString(homeopathic_detail)
            }
            "Psoriatic Arthritis" ->{
                homeopathic_detail = "• Inflammation of arthritis:\n" +
                        "Acon., Apis, Bell., Bry., Led., Sil.\n" +
                        "• Joint aching and pain:\n" +
                        "Carl., Chin-S., Gels., Dalm., Ruta.\n" +
                        "• Rheumatic pain:\n" +
                        "Arn., Ars., Aur-M-N., Bad., Benz-Ac., Bry., Caust., Cham., Chel., Colch., Form., Kali-I., Dalm., Lyc., Med., Nat-A., Phyt., Puls., Rhod., Rhus-T., Sang., Sars., Sulph.\n" +
                        "• General psoriasis:\n" +
                        "Ambr., Ars., Ars-I., Bor., Calc., Calc-S, Canth., Carb-Ac., Chin., Chrysar., Clem., Graph., Iris, Kali-Aar., Cali-C., Kali-S., Lob., Lyc., Mang., Merc., Mex., Morg-G., Nat-M., Nit-Ac., Petr., Phos., Phyt., Psor., Puls., Rhus-T., Sarr., Sras., Sep., Sil., Staph., Sulph.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Regional Enteritis" ->{
                homeopathic_detail = "• Crohn's disease, general:\n" +
                        "aloe, ars, chin, merc-c\n" +
                        "• Inflammation of the intestines:\n" +
                        "ACET-AC, ACON, ANT-T, APIS, BELL, BRY, cact, cham, colch, cop, cupr-s, grat, jal, lach, lycps, merc, ox-ac, plb, rhus-t, sulph, TER, verat-v\n" +
                        "• Inflammation alternating with diarrhea and constipation:\n" +
                        "ign\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Rheumatoid Arthritis" ->{
                homeopathic_detail = "• Inflammation of arthritis:\n" +
                        "Acon., Apis, Bell., Bry., Led., Sil.\n" +
                        "• Joint aching and pain:\n" +
                        "Carl., Chin-S., Gels., Dalm., Ruta.\n" +
                        "• Rheumatic pain:\n" +
                        "Arn., Ars., Aur-M-N., Bad., Benz-Ac., Bry., Caust., Cham., Chel., Colch., Form., Kali-I., Dalm., Lyc., Med., Nat-A., Phyt., Puls., Rhod., Rhus-T., Sang., Sars., Sulph.\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Rosacea" ->{
                homeopathic_detail = "•  Acne eruptions:\n" +
                        "Aur., Calc-S., Calc-Eil., Carb-An., Carb-S., Carb-V., Caust., Dulc., Fl-Ac., Hep., Kali-Ar., Kali-Br., Nux-V., Phos., Rhod., Sars., Sep., Sil., Syph., Teucr., Zinc.\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Schizophrenia" ->{
                homeopathic_detail = "• Tincture - Eleutherococcus senticosus, Polygonum multiforum, Vaccinium myrtillus: 1/4 tsp. TID\n" +
                        "• Individual botanicals to be considered for this condtion:\n" +
                        "Eleutherococcus senticosus (Siberian ginseng)\n" +
                        "Ginkgo biloba (Ginkgo)\n" +
                        "Polygonum multiflorum (Fo-ti, He-shou-wu)\n" +
                        "Vaccinium myrtillus (Bilberry)\n"
                ss = SpannableString(homeopathic_detail)
            }
            "SLE" ->{
                homeopathic_detail = "• General Lupus:\n" +
                        "agar, alum, alumn, ant-c, arg-n, ARS, ars-i, bar-c, bell, calc, carb-ac, carb-v, caust, cic, cist, graph, hep, hydrc, kali-ar, kali-bi, kali-c, kali-chl, kali-s, kreos, lach, LYC, nat-m, NIT-AC, phyt, psor, rhus-t, sabin, sep sil, staph, THUJ\n" +
                        "• Lupus, erythematosus:\n" +
                        "apis, cist, hydrc, kali-bi, phos, thyr\n" +
                        "• Lupus, face:\n" +
                        "alumn, arg-n, ARS, aur-i, aur-m, carb-ac, carb-v, caust, HYDR, kali-ar, kali-bi, kreos, lach, sep\n" +
                        "(For an overview of Homeopathy, click here"
                ss = SpannableString(homeopathic_detail)
            }
            "Sleep Disorder" ->{
                homeopathic_detail = "• Insomnia after an accident:\n" +
                        "stict\n" +
                        "• Insomnia in alcoholics:\n" +
                        "ars, aven, canni-i, cimic, gels, hyos, nux-v, op, stram, sumb\n" +
                        "• Insomnia from anxiety:\n" +
                        "acon, agar, alum, ARS, bell, bry, COCC, coff, crot-h, dig, graph, hyos, ign, kali-br, kali-c, kali-i, lach, mag-arct, mag-c, mag-m, merc-c, nat-c, nat-m, nux-v, puls, rhus-t, sabin, sep, sil, sulph, thuj, verat\n" +
                        "• Insomnia with difficult breathing:\n" +
                        "arg-n, ars, bor, carb-an, cham, chlol, grin, kali-br, kali-c, kali-i, lach, lact, morph, ran-b, stann, syph\n" +
                        "• Insomnia after domestic calamity:\n" +
                        "aur, calc, lach\n" +
                        "• Insomnia in children:\n" +
                        "absin, acon, ars, arund, bell, calc, CARC, CHAM, cina, COFF, cypr, hyos, kali-br, mag-m, passi, phos, puls, stict, sulph, tub\n" +
                        "• Chronic insomnia:\n" +
                        "apis, ars-h, crot-h, cupr-ar, hydr-ac, hyos, LACH, plat, verat\n" +
                        "• Insomnia from cramps:\n" +
                        "arg-m, CALC, coloc, cupr, mag-p\n" +
                        "• Insomnia with depression:\n" +
                        "AUR, lyss, nat-m, psor\n" +
                        "• Insomnia in diabetics:\n" +
                        "uran-n\n" +
                        "• Insomnia after drugs:\n" +
                        "ars, AVEN, cann-i, chlol, cimic, gels, hyos, mosch, NUX-V, op, sec, sumb\n" +
                        "• Insomnia in the elderly:\n" +
                        "acon, ars, aur, bar-c, CALC, op, passi, phos, sulph, SYPH\n" +
                        "• Insomnia from excitement:\n" +
                        "abrot, agar, ambr, anac, arg-n, aur-m, calc, camph, canth, caps, carb-an, CARC, chin, cimic, COFF, dys-co, ferr, gels, hep, HYOS, kali-p, lach, laur, lyc, lyss, mag-aust, mag-c, meph, merc, mez, mosch, nit-ac, NUX-V, op, phos, plat, puls, ran-b, sener, sep, spong, staph, sulph, sul-ac, teucr\n" +
                        "• Insomnia aggravated by exertion:\n" +
                        "calc, chin, cimic, nux-v, sil\n" +
                        "• Insomnia aggravated by mental exertion:\n" +
                        "agar, ambr, ARS, aur-m, aven, calc, cocc, coff, ferr, HYOS, ign, kali-br, kali-c, kali-p, lach, lyc, nux-v, ph-ac, pic-ac, sil\n" +
                        "• Insomnia aggravated by exhaustion:\n" +
                        "aven, chlol. coca, cocc, coff\n" +
                        "• Insomnia from excessive mental and physical fatigue:\n" +
                        "carc, chlol, chol, cocc, gels\n" +
                        "• Insomnia from fear:\n" +
                        "ACON, alum, am-c, arn, ars, bell, bry, calc, carb-v, caust, cham, cocc, coff, dig, graph, hyos, ign, kali-c, laur, lyc, mag-c, mag-m, merc, merc-c, nat-m, nit-ac, nux-v, PHOS, puls, ran-s, rhus-t, sep, sil, sulph\n" +
                        "• Insomnia in gout:\n" +
                        "mang\n" +
                        "• Insomnia from grief:\n" +
                        "aur, gels, graph, IGN, kali-br, lach, NAT-M, sulph\n" +
                        "• Insomnia during menopause:\n" +
                        "acon, arn, bell, cimic, cocc, coff, dig, gels, kali-br, senec, sulph, valer, zinc\n" +
                        "• Insomnia during menses:\n" +
                        "agar, am-c, cimic, eupi, gent-c, ign, mag-m, nat-m, senec, sep\n" +
                        "• Insomnia after mental exertion:\n" +
                        "agar, aur-m, ambr, ARS, coff, ferr, HYOS, ign, kali-br, kali-c, kali-p, lach, lyc, nux-v, passi, ph-ac, pic-ac\n" +
                        "• Insomnia at 1 am:\n" +
                        "spig\n" +
                        "• Insomnia 1-2 am:\n" +
                        "sulph\n" +
                        "• Insomnia 1-3 am:\n" +
                        "chlorpr\n" +
                        "• Insomnia 1-4 am:\n" +
                        "bor, phos\n" +
                        "• Insomnia 1:30-2:30 am:\n" +
                        "agar, perh\n" +
                        "• Insomnia at 2 am:\n" +
                        "cham, puls\n" +
                        "• Insomnia 2-3 am:\n" +
                        "arn, bapt, calc, calc-p, gink-b, kali-c, mag-m, merc\n" +
                        "• Insomnia 2-4 am:\n" +
                        "am-c, am-m, arist-cl, merc, ph-ac\n" +
                        "• Insomnia 2-5 am:\n" +
                        "arist-cl, bell, bor, chloram, sulph\n" +
                        "• Insomnia until 2:30 am:\n" +
                        "lyc, pip-m\n" +
                        "• Insomnia at 3 am:\n" +
                        "am-m, ars, aur, bry, chin, chin-a, com, euphr, eupi, mag-c, merc, mez, mill, nat-p, ran-s, rhus-t, sil\n" +
                        "• Insomnia 3-4 am:\n" +
                        "arist-cl, chel, nux-v, rib-ac\n" +
                        "• Insomnia 3-5 am:\n" +
                        "arist-cl, bell-p, calc-f, cob-n, man\n" +
                        "• Insomnia at 4 am:\n" +
                        "acon-c, aloe, am-c, bor, cocc, cupr-s, nit-ac, tarent\n" +
                        "• Insomnia 4-6:30 am:\n" +
                        "cycl\n" +
                        "• Insomnia after 4:30 am:\n" +
                        "sep\n" +
                        "• Insomnia after 5 am:\n" +
                        "carb-an, tarent\n" +
                        "• Insomnia from pains:\n" +
                        "acon, ars, arum-t, aur, bufo, cann-i, CHAM, cimic, coloc, dol, eup-per, eupi, ferr-p, iris, kreos, lach, mag-c, mag-m, merc, passi, phyt, plb, ptel, puls, rhus-t, sin-n, stram, sulph\n" +
                        "• Insomnia after retiring but sleepy before retiring:\n" +
                        "AMBR\n" +
                        "• Insomnia from sadness:\n" +
                        "AUR, ign, kali-br, kali-c, nat-m, thuj\n" +
                        "• Insomnia from twitching of the limbs:\n" +
                        "ambr, alum, arg-n, ARS, bell, calc, canth, carb-v, carc, cham, cypr, ign, kali-c, lyc, merc-c, nat-m, op, PULS, rhus-t, sel, sep, stront-c, sulph, tab, valer\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Stress Incontinence" ->{
                homeopathic_detail = "• Incontinence in general:\n" +
                        "(3) Bell, Caust, Ph-Ac (2) aloe, arn, gels. hyos, phos, podo, puls, sep, sulph (1) ars, chin, con, dios, mur-ac, nat-m, sol, staph\n" +
                        "(For an overview of Homeopathy, click here.)"
                ss = SpannableString(homeopathic_detail)
            }
            "Systemic Lupus Erythematosus" ->{
                homeopathic_detail = "• General Lupus:\n" +
                        "agar, alum, alumn, ant-c, arg-n, ARS, ars-i, bar-c, bell, calc, carb-ac, carb-v, caust, cic, cist, graph, hep, hydrc, kali-ar, kali-bi, kali-c, kali-chl, kali-s, kreos, lach, LYC, nat-m, NIT-AC, phyt, psor, rhus-t, sabin, sep sil, staph, THUJ\n" +
                        "• Lupus, erythematosus:\n" +
                        "apis, cist, hydrc, kali-bi, phos, thyr\n" +
                        "• Lupus, face:\n" +
                        "alumn, arg-n, ARS, aur-i, aur-m, carb-ac, carb-v, caust, HYDR, kali-ar, kali-bi, kreos, lach, sep\n" +
                        "(For an overview of Homeopathy, click here"
                ss = SpannableString(homeopathic_detail)
            }
            "Ulcerative Colitis" ->{
                homeopathic_detail = "• Ulcerative colitis:\n" +
                        "Aloe, Arg-N., Ars., Bis., Calc-A., Canth., Cap., Carc., Chin., Crot-T., Ferr-I., Gambogia, Hel., Kali-B., Kali-N., Lach., Lyc., Merc., Merc-C., Nat-M., Nat-S.,Nit-Ac., Nux-V., Ole., Petr., Phos-A., Phos., Pos., Sulph., Verat., Zinc\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Uterine Fibroids" ->{
                homeopathic_detail = "• Uterine fibroids:\n" +
                        "Apis, Aur-I., Aur-M., Aur-M-N., Calc., Calc-F., Calc-I., Calc-P., Calc-S., Calen., Frax., Hydr., Iod., Kali-C., Kali-I., Lach., Led., Lil-I., Lyc., Merc-C., Merc-I-R., Nat-M., Nit-Ac., Phos., Sep., Sil., Ter., Thlaspi, Thuj., Thyr., Ust.\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
            "Vaginal Yeast Infection" ->{
                homeopathic_detail = "• Candida albicans:\n" +
                        "calc, chin, helon, lyc, med, nat-p, nit-ac, puls, sep, thuj\n" +
                        "(For an overview of Homeopathy, click here.)   "
                ss = SpannableString(homeopathic_detail)
            }
        }
        checkAllLinks(ss,homeopathic_detail)

        binding.contentData.text = ss
    }

    private fun setTherapyData(conditionName: String){
        binding.diet.text = "Other Therapies"
        when(conditionName){
            "ADD/ADHD" -> {
                other_therapy = "• Chelate lead or other heavy metals if hair analysis or other lab work indicates\n" +
                        "• Avoid television and fluorescent lights"
                ss = SpannableString(other_therapy)
            }
            "Adult Acne" -> {
                other_therapy = "• Coffee enema: 3/week\n" +
                        "• Sulfur bath (bath tub about 1/2 full of water at 102° F with 1 oz. of potassium sulfate - dip affected area for 30-60 minutes)\n" +
                        "• Check for the presence of Helicobacter pylori\n" +
                        "• Azelaic acid cream used topically.\n"
                ss = SpannableString(other_therapy)
            }

            "Age-Related Macular Degeneration" -> {
                other_therapy = "• Macular degeneration IV therapy\n" +
                        "• Stop smoking\n" +
                        "• Avoid excessive ultraviolet radiation (strong sunlight)"
                ss = SpannableString(other_therapy)

            }
            "Aging Prevention" -> {
                other_therapy = "• Exercise is a must. Start with 15 minutes a day for 4 days a week and gradually increase until doing 30 minutes a day for 4 days a week\n" +
                        "• Avoid ultraviolet light\n" +
                        "• Meditate 20 minutes a day\n" +
                        "• Replace mercury amalgams\n" +
                        "• Lose weight if obese\n" +
                        "• Hormone therapy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(other_therapy)

            }
            "AIDS" -> {
                other_therapy = "• Lactobacillus acidophilus enema\n" +
                        "• Chelate excess iron if necessary\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Reduce stress where at all possible\n" +
                        "• Stop smoking\n" +
                        "• Moderate exercise has been shown to slow the disease progression"
                ss = SpannableString(other_therapy)

            }
            "Allergies" -> {
                other_therapy = "• *Abnormal sulfur metabolism IV therapy: use during attack\n" +
                        "• Tonic IV therapy\n" +
                        "• Avoid living near high levels of truck and other vehicle exhaust\n" +
                        "• Eliminate dust mites from bedding\n" +
                        "• Reduce mold and fungus levels in the living environment\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Do not let children be innoculated with pertussis vaccine unless absolutely necessary\n"
                ss = SpannableString(other_therapy)

            }
            "Alzheimer's Disease" -> {
                other_therapy = "• Nicotine patches: 16 hrs.\n" +
                        "• Remove mercury-amalgam fillings\n" +
                        "• Avoid prolonged exposure to electromagnetic fields\n" +
                        "• Avoid excess iron ingestion and chelate iron if concentrations are too high\n" +
                        "• Chelate aluminum with desferrioxamine if warranted\n" +
                        "• Estrogen replacement therapy\n" +
                        "• Moderate exercise is beneficial as part of a treatment regimen\n" +
                        "• Engage in new kinds of cognitive and intellectually stimulating behaviors on a regular basis.\n"
                ss = SpannableString(other_therapy)
            }
            "Amenorrhea" -> {
                other_therapy = "• Constitutional hydrotherapy\n" +
                        "• Hot sitz baths and alternating sitz baths (hot and cold)\n" +
                        "• *Hot enemas\n" +
                        "• *Cold douches (cold spray - 50° to 70° F for 2-10 seconds)\n" +
                        "• Decrease stress\n" +
                        "• *Keep regular habits (sleep, bathing, meals, exercise, fresh air, sunlight)\n" +
                        "• Do not reduce body fat past about 10 percent\n"
                ss = SpannableString(other_therapy)

            }
            "Anorexia Nervosa" -> {
                other_therapy = "• Do not exercise excessively"
                ss = SpannableString(other_therapy)

            }
            "Aphthous Stomatitis" -> {
                other_therapy = "• *Camphor oil topically\n" +
                        "• Replace mercury amalgam fillings\n" +
                        "• *Alum powder or baking soda topically\n" +
                        "• Stress reduction and relaxation/imagery training"
                ss = SpannableString(other_therapy)
            }
            "Arthritis, Gout" -> {
                other_therapy = "• *Coffee Enema: 3/week during attack\n" +
                        "• *Charcoal Poultice: apply to gout area 4/day for 10 days\n" +
                        "• Reduce weight if overweight\n" +
                        "• Chelate excess lead with EDTA or Vitamin C if indications of lead toxicity"
                ss = SpannableString(other_therapy)

            }
            "Arthritis, Osteo" -> {
                other_therapy = "• Hot epsom salt compress followed by castor oil massage (not directly on joints, but around) - no more than 2 per week\n" +
                        "• Epsom salt spa sessions once a week have been shown to be helpful\n" +
                        "• Daily exercise (walking, cycling, yoga, etc.) prevents immobility and supports the immune system\n" +
                        "• For pain, capsaicin\n" +
                        "• Alternating magnets (north/south) have been shown to increase circulation and reduce arthritis inflammation\n"
                ss = SpannableString(other_therapy)

            }
            "Arthritis, Psoriatic" -> {
                other_therapy = "• Coffee enema: 2/week (also insure that the bowels move every day)\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• D'Adamo blood test for specific dietary recommendations\n" +
                        "• Sea water bathing\n" +
                        "• Oat meal baths (for itching and soothing the nerves)\n" +
                        "• Topical application of Vitamin D in the activated form: Calcitrol or Calcipotriol - BID\n" +
                        "• Get lots of sunshine, preferably with exercise to promote perspiration and reduce stress\n" +
                        "• Weight reduction if appropriate\n" +
                        "• Copper bracelets worn continuously have been shown to relieve arthritis symptoms\n" +
                        "• Hot epsom salt compress followed by castor oil massage (not directly on joints, but around) for arthritis\n" +
                        "• Stop smoking\n" +
                        "• Alternating magnets (north/south) have been shown to increase circulation and reduce arthritis inflammation\n" +
                        "• Avoid exposure to pesticides and silica dust\n"
                ss = SpannableString(other_therapy)

            }
            "Arthritis, Rheumatoid" -> {
                other_therapy = "• Coffee enema: 3/week during flare-ups\n" +
                        "• Copper bracelets worn continuously have been shown to relieve arthritis symptoms\n" +
                        "• Hot epsom salt compress followed by castor oil massage (not directly on joints, but around)\n" +
                        "• Daily exercise (walking, cycling, yoga, etc.) prevents immobility and supports the immune system\n" +
                        "• Stop smoking\n" +
                        "• Alternating magnets (north/south) have been shown to increase circulation and reduce arthritis inflammation\n" +
                        "• Avoid exposure to pesticides and silica dust"
                ss = SpannableString(other_therapy)

            }
            "Asthma" -> {
                other_therapy = "• Abnormal sulfur metabolism IV therapy: use during attack\n" +
                        "• *Asthma IV therapy\n" +
                        "• *Tonic IV therapy\n" +
                        "• *Hydrogen peroxide bath: fill tub with water at 98-100 degrees; add 13-16 ounces of hydrogen peroxide and soak; rest after bath\n" +
                        "• Strengthen intestinal mucosa, i.e., repair leaky gut\n" +
                        "• Avoid antibiotics, especially in the first few years of life\n" +
                        "• Avoid chemical exposure, e.g., hair dressing salons\n" +
                        "• Regular exercise is often beneficial (unless the asthma is exercise-induced)\n" +
                        "• Avoid living near high levels of automobile and truck traffic and other forms of pollution\n" +
                        "• Stop smoking and avoid exposure to second-hand smoke\n" +
                        "• Avoid living in damp surroundings\n" +
                        "• Obese asthmatic children should lose weight"
                ss = SpannableString(other_therapy)

            }
            "Atherosclerosis" -> {
                other_therapy = "• Some form of daily exercise (walking, cycling, yoga, etc.) increases HDL and lowers cholesterol and LDL\n" +
                        "• Reduce stress\n" +
                        "• Remove chlorine from drinking water with a reverse-osmosis water filter\n" +
                        "• Stop smoking\n" +
                        "• Supplement with thyroid hormone if suffering from hypothyroidism\n" +
                        "• *Rinse dishes very well - detergent dissolves fatty acids in cell membranes\n"
                ss = SpannableString(other_therapy)

            }
            "Atopic Dermatitis" -> {
                other_therapy = "• *Coffee enema: 2/week\n" +
                        "• *Tepid (neutral) baths for 20 - 30 minutes TID\n" +
                        "• *Add mineral oil or glycerin to bath\n" +
                        "• *Apply oil (olive oil), cream, or ointment after bath while still wet (key is to preserve moisture)\n" +
                        "• *Humidify home air\n" +
                        "• *Constitutional hydrotherapy\n" +
                        "• *Avoid soap - it is too drying\n" +
                        "• *Preparation H promotes healing of sores and fissures\n" +
                        "• *Wear no perfumes, perfumed ointments, or allergic sensitizers\n" +
                        "• *Don't wear rough (e.g. wool) clothing\n" +
                        "• *Avoid temperature extremes\n" +
                        "• Reduce stress, e.g., meditate, yoga, walk, etc."
                ss = SpannableString(other_therapy)

            }
            "Attention Deficit Disorder" -> {
                other_therapy = "• Chelate lead or other heavy metals if hair analysis or other lab work indicates\n" +
                        "• Avoid television and fluorescent lights"
                ss = SpannableString(other_therapy)

            }
            "Autism" -> {
                other_therapy = "• Chelate lead or other heavy metals if hair analysis or other lab work indicates\n" +
                        "• Prism eyeglass lenses have been helpful in many cases\n" +
                        "• Consider IV immune globulin therapy.\n" +
                        "• Note: the CDC has reported that one is 2.48 times as likely to contract autism if exposed to mercury-containing vaccines (Thimerosal) before the age of 3 months.\n"
                ss = SpannableString(other_therapy)

            }
            "Benign Prostatic Hypertrophy" ->{
                other_therapy =  "• Cold sitz bath - sit in tub of water 1/2 inch below navel with a temperature of 55 - 75 F (12 - 24 C) with feet in a tub of water 105 - 110 F (40 - 43 C) for 3 - 8 minutes\n" +
                        "• Stop smoking\n" +
                        "• *Alternating warm and cool enemas\n" +
                        "• *Frequent sex - daily ejaculations, but avoid prolonged intercourse\n" +
                        "• *Frequent urinary voiding\n" +
                        "• *Avoid prolonged sitting or standing\n" +
                        "• Some form of daily exercise, including Kegal exercise\n" +
                        "• *Reduce stress (stress increases prolactin)\n" +
                        "*If overweight, you must lose some weight"
                ss = SpannableString(other_therapy)
            }
            "Bipolar Disorder" ->{
                other_therapy =  "• Chelate excess vanadium and iron using EDTA or desferoxamine\n" +
                        "• Replace mercury amalgam dental fillings\n" +
                        "• Stop smoking\n" +
                        "• Lose wieght if obese\n"
                ss = SpannableString(other_therapy)
            }
            "Bladder Infection" ->{
                other_therapy =  "• *Anti-infection IV therapy: 3/week\n" +
                        "• Adequate vaginal lubrication during intercourse is necessary\n" +
                        "• Diaphragm may cause infection\n" +
                        "• Susceptible individuals should wash the genital tissues with an antiseptic such as warm hydrastis and calendula infusion before and after intercourse\n" +
                        "• Drinking a full glass of water prior to intercourse would also be advisable to produce urine afterward and flush the urethra of possible pathogens\n" +
                        "• Use a non-deoderized sanitary pad, not tampons\n" +
                        "• Alternating hot and cold sitz baths\n" +
                        "• Estrogen replacement therapy or estrogen introduced vaginally has been shown to be beneficial in post-menopausal women.\n" +
                        "• *Wipe bottom from front to back after a BM\n" +
                        "• *Wear white cotton underwear or none at all, change it daily and do not have it washed at a professional laundry because the soaps are irritating\n" +
                        "• *Avoid contact with bubble baths, shampoos\n" +
                        "• *Shower after swimming to eliminate the chlorine\n" +
                        "• *Do not wear tight pants, let your crotch breathe\n" +
                        "• Hyperbaric oxygen treatments\n"
                ss = SpannableString(other_therapy)
            }
            "Blood Pressure, High" ->{
                other_therapy =  "• Hypertension IV therapy\n" +
                        "• An exercise program is a must. Begin by walking 15 minutes 4 times a week for 2 weeks, then 20 minutes 4 times a week for 2 weeks, then 30 minutes 4 times a week\n" +
                        "• Reduce weight if obese\n" +
                        "• Avoid the NSAIDS, Rofecoxib (Vioxx) and Nabumetone (Relafen) - they increase systolic and diastolic blood pressure\n" +
                        "• Chelate lead and calcium if above normal levels (determined by hair analysis)"
                ss = SpannableString(other_therapy)
            }
            "BPH" ->{
                other_therapy =  "• Cold sitz bath - sit in tub of water 1/2 inch below navel with a temperature of 55 - 75 F (12 - 24 C) with feet in a tub of water 105 - 110 F (40 - 43 C) for 3 - 8 minutes\n" +
                        "• Stop smoking\n" +
                        "• *Alternating warm and cool enemas\n" +
                        "• *Frequent sex - daily ejaculations, but avoid prolonged intercourse\n" +
                        "• *Frequent urinary voiding\n" +
                        "• *Avoid prolonged sitting or standing\n" +
                        "• Some form of daily exercise, including Kegal exercise\n" +
                        "• *Reduce stress (stress increases prolactin)\n" +
                        "• *If overweight, you must lose some weight"
                ss = SpannableString(other_therapy)
            }
            "Bronchitis" ->{
                other_therapy =  "• *Anti-infection IV therapy: every 2 days until bronchitis clears\n" +
                        "• *Heating compress to the chest: daily\n" +
                        "• *Constitutional hydrotherapy\n" +
                        "• *Steam inhalation with vapor balm or eucalyptus oil\n" +
                        "• *Heating pad or hot water bottle on chest and back for 30 minutes\n" +
                        "• *Mustard plaster - 1 part mustard powder, 3 parts flour, mixed with olive oil or water to make a paste. Put on diaper; fold; put on chest for 5 - 20 minutes\n"
                ss = SpannableString(other_therapy)
            }
            "Cancer Prevention" ->{
                other_therapy =  "Most Cancers:\n" +
                        "• Stop smoking and avoid secondhand smoke\n" +
                        "• Maintain regular exercise\n" +
                        "• Reduce your stress\n" +
                        "• Avoid exposure to cadmium\n" +
                        "• Avoid exposure to organochlorines (PCB's, pesticides, herbicides, dioxin, etc.), air pollutin and aromatic hydrocarbons (gasoline, benzene and other fuels)\n" +
                        "• Do not become overweight\n" +
                        "• Avoid excessive air travel\n" +
                        "Breast Cancer:\n" +
                        "• Insure that the thyroid is functioning properly\n" +
                        "• Do not take iron unless proven necessary by lab tests\n" +
                        "• Avoid exposure to electromagnetic fields - reduces melatonin levels (electric blankets, high power lines, etc.)\n" +
                        "vAvoid taking antibiotics\n" +
                        "Prostate Cancer:\n" +
                        "• Do not get a vasectomy unless absolutely necessary\n" +
                        "• Avoid exposure to electromagnetic fields - reduces melatonin levels\n" +
                        "• *  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(other_therapy)
            }
            "Candida Infection" ->{
                other_therapy =  "• Lactobacillus acidophilus enema (or douche): 2/week\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Quit taking antibiotics\n" +
                        "• Avoid oral contraceptives and estrogen supplements\n" +
                        "• Avoid or reduce cortisone use\n" +
                        "• *Wear loose underwear to ventilate vaginal area\n" +
                        "• *Fasting may ameliorate"
                ss = SpannableString(other_therapy)
            }
            "Candidiasis" ->{
                other_therapy =  "• Lactobacillus acidophilus enema (or douche): 2/week\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Quit taking antibiotics\n" +
                        "• Avoid oral contraceptives and estrogen supplements\n" +
                        "• Avoid or reduce cortisone use\n" +
                        "• *Wear loose underwear to ventilate vaginal area\n" +
                        "• *Fasting may ameliorate"
                ss = SpannableString(other_therapy)
            }
            "Canker Sores" ->{
                other_therapy =  "• *Camphor oil topically\n" +
                        "• Replace mercury amalgam fillings\n" +
                        "• *Alum powder or baking soda topically\n" +
                        "• Stress reduction and relaxation/imagery training"
                ss = SpannableString(other_therapy)
            }
            "Cataract Prevention" ->{
                other_therapy =  "• Avoid direct sunlight (UV exposure)\n" +
                        "• Stop smoking and avoid secondhand smoke (cadmium toxicity)\n" +
                        "• If obese, lose weight\n" +
                        "• Avoid the use of statin (cholesterol-lowering) drugs without also taking suitable amounts of Coenzyme Q10\n" +
                        "• Chelate lead if high levels are detected\n"
                ss = SpannableString(other_therapy)
            }
            "CFS/CFIDS" ->{
                other_therapy =  "• Antiviral IV therapy: 2/week\n" +
                        "• Tonic IV therapy\n" +
                        "• Branched amino acid IV therapy\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Eliminate candidal infection if necessary\n" +
                        "• Eliminate as many responsibilities as possible and reduce stress. Use relaxation methods (yoga, massage, tapes, etc.).\n" +
                        "• Consistent, graded, aerobic exercise - walking, swimming, cycling, etc.\n" +
                        "• Avoid exposure to toxic chemicals or substances to which there is a chemical sensitivity.\n" +
                        "• *Consider treating for leaky gut syndrome"
                ss = SpannableString(other_therapy)
            }
            "CHF" ->{
                other_therapy =  "• Congestive heart IV therapy\n" +
                        "• Tonic IV therapy\n" +
                        "• Complete bed rest for 3 weeks or more in severe cases is essential - absolutely no excessive physical exertion\n" +
                        "• Exercise (after required bed rest and fluid reduction)\n" +
                        "• Avoid exposure to high levels of air pollution\n" +
                        "• Supplement with thyroid hormone if suffering from hypothyroidism"
                ss = SpannableString(other_therapy)
            }
            "Cholecystitis" ->{
                other_therapy =  "• Castor oil pack over gall bladder for 30 minutes\n" +
                        "• Epsom salt compress over the gall bladder for 30 minutes\n" +
                        "• Catnip tea enemas\n" +
                        "• Drink 6-8 glasses of water (good, reverse-osmosis filtered water) per day to maintain the water content of bile\n" +
                        "• At bedtime, drink 1 oz. olive oil, then drink 1 oz. grapefruit juice or lemon juice (this causes the gall bladder to contract)\n" +
                        "• Before breakfast on an empty stomach, take one tsp. of table salt in a glass of hot water (stir thoroughly). After drinking, return to bed and lie 45 minutes on the right side. Do this once or twice a week.\n" +
                        "• Quit smoking\n" +
                        "• Daily exercise"
                ss = SpannableString(other_therapy)
            }
            "Cholelithiasis" ->{
                other_therapy =  "• Castor oil pack over gall bladder for 30 minutes\n" +
                        "• Epsom salt compress over the gall bladder for 30 minutes\n" +
                        "• Catnip tea enemas\n" +
                        "• Drink 6-8 glasses of water (good, reverse-osmosis filtered water) per day to maintain the water content of bile\n" +
                        "• Before breakfast on an empty stomach, take one tsp. of table salt in a glass of hot water (stir thoroughly). After drinking, return to bed and lie 45 minutes on the right side. Do this once or twice a week.\n" +
                        "• Quit smoking\n" +
                        "• Daily exercise\n" +
                        "• If obese, reduce weight\n"
                ss = SpannableString(other_therapy)
            }
            "Chronic Fatigue Syndrome" ->{
                other_therapy =  "• Antiviral IV therapy: 2/week\n" +
                        "• Tonic IV therapy\n" +
                        "• Branched amino acid IV therapy\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Eliminate candidal infection if necessary\n" +
                        "• Eliminate as many responsibilities as possible and reduce stress. Use relaxation methods (yoga, massage, tapes, etc.).\n" +
                        "• Consistent, graded, aerobic exercise - walking, swimming, cycling, etc.\n" +
                        "• Avoid exposure to toxic chemicals or substances to which there is a chemical sensitivity.\n" +
                        "• *Consider treating for leaky gut syndrome\n"
                ss = SpannableString(other_therapy)
            }
            "Colitis" ->{
                other_therapy =  "• *Lactobacillus acidophilus enema: 1/day during bouts of diarrhea\n" +
                        "• Relaxation exercises to decrease stress: yoga, deep breathing, moderate walking\n" +
                        "• Hypnotherapy has been found to be effective in some cases\n" +
                        "• Stop smoking"
                ss = SpannableString(other_therapy)
            }
            "Congestive Heart Failure" ->{
                other_therapy =  "• Congestive heart IV therapy\n" +
                        "• Tonic IV therapy\n" +
                        "• Complete bed rest for 3 weeks or more in severe cases is essential - absolutely no excessive physical exertion\n" +
                        "• Exercise (after required bed rest and fluid reduction)\n" +
                        "• Avoid exposure to high levels of air pollution\n" +
                        "• Supplement with thyroid hormone if suffering from hypothyroidism"
                ss = SpannableString(other_therapy)
            }
            "Constipation" ->{
                other_therapy =  "• Exercise regularly\n" +
                        "• Biofeedback\n" +
                        "• Heating Compress to the abdomen\n" +
                        "• Short cold bath - 30 seconds to 1 minute in water as cold as can be tolerated\n" +
                        "• Retrain the bowel:\n" +
                        "Never ignore an urge to defecate\n" +
                        "Routinely sit on the toilet, preferably after each meal, at the same time each day even if there is no urge\n"
                ss = SpannableString(other_therapy)
            }
            "Crohn's Disease" ->{
                other_therapy =  "• Lactobacillus acidophilus enema: 1/day during bouts of diarrhea\n" +
                        "• Avoid antibiotics\n" +
                        "• Crohn's IV therapy\n" +
                        "• *Relaxation exercises to decrease stress: yoga, deep breathing, moderate walking.\n" +
                        "• Stop smoking\n" +
                        "• Test for and repair \"leaky gut\" if necessary to eliminate excessive intestinal permiability.\n"
                ss = SpannableString(other_therapy)
            }
            "Cystitis" ->{
                other_therapy =  "• *Anti-infection IV therapy: 3/week\n" +
                        "• Adequate vaginal lubrication during intercourse is necessary\n" +
                        "• Diaphragm may cause infection\n" +
                        "• Susceptible individuals should wash the genital tissues with an antiseptic such as warm hydrastis and calendula infusion before and after intercourse\n" +
                        "• Drinking a full glass of water prior to intercourse would also be advisable to produce urine afterward and flush the urethra of possible pathogens\n" +
                        "• Use a non-deoderized sanitary pad, not tampons\n" +
                        "• Alternating hot and cold sitz baths\n" +
                        "• Estrogen replacement therapy or estrogen introduced vaginally has been shown to be beneficial in post-menopausal women.\n" +
                        "• *Wipe bottom from front to back after a BM\n" +
                        "• *Wear white cotton underwear or none at all, change it daily and do not have it washed at a professional laundry because the soaps are irritating\n" +
                        "• *Avoid contact with bubble baths, shampoos\n" +
                        "• *Shower after swimming to eliminate the chlorine\n" +
                        "• *Do not wear tight pants, let your crotch breathe\n" +
                        "• Hyperbaric oxygen treatments"
                ss = SpannableString(other_therapy)
            }
            "Depression" ->{
                other_therapy =  "• *Tonic IV therapy\n" +
                        "• Exercise: 15 min. per day for 3 weeks; then 20 min. per day - this is essential to the treatment\n" +
                        "• If taking MAO inhibitor: avoid tyramine foods: cheese, chicken liver, sardines, red wine, yeast, beer, sour cream, eggplants, and green bean pods\n" +
                        "• Get some exposure to sunlight (enhances serotonin levels)\n" +
                        "• Do not lower cholesterol too far below normal, especially in the elderly\n" +
                        "• In post-meopausal women, sometimes hormone replacement therapy will alleviate symptoms of depression\n" +
                        "• In older men, testosterone supplementation is often helpful for depression\n" +
                        "• Avoid exposure to solvents and pesticides\n" +
                        "• Perform yoga postures regularly\n"
                ss = SpannableString(other_therapy)
            }
            "Diabetes Mellitus" ->{
                other_therapy =  "• Diabetes IV therapy\n" +
                        "• Graded exercise program: 15 minutes per day 3 times a week for 1 week, then 15 minutes per day 4 times a week for 2 week, then 20 minutes per day 4 times per week for 3 weeks, then 30 minutes a day 4 times per week\n" +
                        "• *Monitor blood sugar levels before exercising and have a snack at the end of exercising"
                ss = SpannableString(other_therapy)
            }
            "Dysmenorrhea" ->{
                other_therapy =  "• Stop smoking\n" +
                        "• Alleviate stress\n" +
                        "• Acupuncture\n" +
                        "• Spinal manipulation\n" +
                        "• Aromatherapy has been shown to be effective in many cases\n" +
                        "• *Tonic IV therapy: for acute relief\n" +
                        "• *Coffee enema: 1/day 1 week before and during menstrual flow"
                ss = SpannableString(other_therapy)
            }

            "Ear Infection" ->{
                other_therapy =  "• *Cold wet socks (put on cold, wet, cotton socks and put on dry wool socks over them)\n" +
                        "• *Hot (5 min.) then cold (1 min.) compresses over ear (repeat 2 or 3 times)\n" +
                        "• *Constitutional hydrotherapy\n" +
                        "• *Hot foot baths relieve pain of earache very quickly\n" +
                        "• *Light massage around neck while pulling on the ear lobe repeatedly (creates suction with the tragus)\n" +
                        "• *Honey or glycerin in external ear canal (osmotic gradient)\n" +
                        "• *Poultice: place against the outside of the ear for 30 minutes (or taped in place all night if possible)\n" +
                        "• Children who are breast fed are less likely to contract otitis media\n" +
                        "• Consider avoiding the use of antibiotics\n" +
                        "• Avoid smoking and second-hand smoke\n" +
                        "• Avoid use of pacifiers in infants\n" +
                        "• Consider a xylitol nasal spray\n" +
                        "• Avoid baby swimming\n"
                ss = SpannableString(other_therapy)
            }
            "Eczema, Chronic" ->{
                other_therapy =  "• *Coffee enema: 2/week\n" +
                        "• *Tepid (neutral) baths for 20 - 30 minutes TID\n" +
                        "• *Add mineral oil or glycerin to bath\n" +
                        "• *Apply oil (olive oil), cream, or ointment after bath while still wet (key is to preserve moisture)\n" +
                        "• *Humidify home air\n" +
                        "• *Constitutional hydrotherapy\n" +
                        "• *Avoid soap - it is too drying\n" +
                        "• *Preparation H promotes healing of sores and fissures\n" +
                        "• *Wear no perfumes, perfumed ointments, or allergic sensitizers\n" +
                        "• *Don't wear rough (e.g. wool) clothing\n" +
                        "• *Avoid temperature extremes\n" +
                        "• Reduce stress, e.g., meditate, yoga, walk, etc."
                ss = SpannableString(other_therapy)
            }

            "Endometriosis" ->{
                other_therapy =  "• *Tonic IV therapy: during acute pain\n" +
                        "• *Alternating sitz bath: 3 times a week\n" +
                        "• Hyperbaric oxygen therapy (HBOT) - due to the immune factor in endometriosis\n" +
                        "• Avoid exposure to dioxins."
                ss = SpannableString(other_therapy)
            }

            "Erectile Dysfunction" ->{
                other_therapy =  "• Testosterone supplementation if deficient\n" +
                        "• Regular exercise\n" +
                        "• Relaxation exercises 10-15 minutes per day\n" +
                        "• Cigarettes can cause impotence - stop smoking\n"
                ss = SpannableString(other_therapy)
            }

            "Fertility" ->{
                other_therapy =  "   Female:\n" +
                        "• See also Amenorrhea\n" +
                        "• See also Endometriosis\n" +
                        "• See also Uterine fibroids\n" +
                        "• Weight loss is a must if overweight\n" +
                        "• Weight gain is a must if underweight\n" +
                        "• Stop smoking\n" +
                        "   Male:\n" +
                        "• Heavy metal detoxification program (including lead and mercury chelation if necessary)\n" +
                        "• Stop smoking (smoking causes high levels of cadmium which induces infertility)\n" +
                        "• Avoid exposure to herbicides and pesticides\n" +
                        "• Avoid prolonged exposure to excessive heat"
                ss = SpannableString(other_therapy)
            }
            "Fibrocystic Breast Disease" ->{
                other_therapy =  "• *No smoking\n" +
                        "• *Some form of daily exercise (walking, cycling, yoga, etc.)"
                ss = SpannableString(other_therapy)
            }

            "Fibromyalgia" ->{
                other_therapy =  "• Tonic IV therapy\n" +
                        "• Hot sitz baths (end with cold)\n" +
                        "• Structural massage is very important - to break up adhesions\n" +
                        "• Stretching and ROM (range of motion) exercises for affected areas\n" +
                        "• Aerobic exercise on a regular basis\n" +
                        "• Avoid even low levels of exposure to toxic chemicals\n" +
                        "• Fasting (water-only) has been beneficial in some cases\n" +
                        "• Acupuncture is often very beneficial"
                ss = SpannableString(other_therapy)
            }
            "Gallbladder Disease" ->{
                other_therapy =  "• Castor oil pack over gall bladder for 30 minutes\n" +
                        "• Epsom salt compress over the gall bladder for 30 minutes\n" +
                        "• Catnip tea enemas\n" +
                        "• Drink 6-8 glasses of water (good, reverse-osmosis filtered water) per day to maintain the water content of bile\n" +
                        "• At bedtime, drink 1 oz. olive oil, then drink 1 oz. grapefruit juice or lemon juice (this causes the gall bladder to contract)\n" +
                        "• Before breakfast on an empty stomach, take one tsp. of table salt in a glass of hot water (stir thoroughly). After drinking, return to bed and lie 45 minutes on the right side. Do this once or twice a week.\n" +
                        "• Quit smoking\n" +
                        "• Daily exercise\n"
                ss = SpannableString(other_therapy)
            }
            "Gallstones" ->{
                other_therapy =  "• Castor oil pack over gall bladder for 30 minutes\n" +
                        "• Epsom salt compress over the gall bladder for 30 minutes\n" +
                        "• Catnip tea enemas\n" +
                        "• Drink 6-8 glasses of water (good, reverse-osmosis filtered water) per day to maintain the water content of bile\n" +
                        "• Before breakfast on an empty stomach, take one tsp. of table salt in a glass of hot water (stir thoroughly). After drinking, return to bed and lie 45 minutes on the right side. Do this once or twice a week.\n" +
                        "• Quit smoking\n" +
                        "• Daily exercise\n" +
                        "• If obese, reduce weight"
                ss = SpannableString(other_therapy)
            }
            "Gout" ->{
                other_therapy =  "• *Coffee Enema: 3/week during attack\n" +
                        "• *Charcoal Poultice: apply to gout area 4/day for 10 days\n" +
                        "• Reduce weight if overweight\n" +
                        "• Chelate excess lead with EDTA or Vitamin C if indications of lead toxicity"
                ss = SpannableString(other_therapy)
            }
            "Headache, General" ->{
                other_therapy =  "• Constitutional hydrotherapy\n" +
                        "• Get regular exercise\n" +
                        "• Consider biofeedback therapy\n" +
                        "• Consider acupuncture"
                ss = SpannableString(other_therapy)
            }
            "Headache, Migraine" ->{
                other_therapy =  "• Migraine IV therapy\n" +
                        "• Tonic IV therapy\n" +
                        "• Migraine IV push therapy\n" +
                        "• Test for environmental allergens, heavy metal toxicity and hypoglycemia\n" +
                        "• Normalize sleep patterns, i.e., normal start and duration\n" +
                        "• Get regular exercise\n" +
                        "• Hyperbaric oxygen has been shown to be beneficial in some cases\n" +
                        "• Enermed therapy (magnets)"
                ss = SpannableString(other_therapy)
            }
            "Hemorrhoids" ->{
                other_therapy =  "• Warm sitz baths (100 - 105°F)\n" +
                        "• No smoking\n" +
                        "• Daily exercise (walking, cycling, yoga, etc.)\n" +
                        "• Don't sit too long at one time\n" +
                        "• Use cotton or cloth swabs instead of toilet paper\n" +
                        "• Use a damp washcloth to apply granulated sugar to the hemorrhoid"
                ss = SpannableString(other_therapy)
            }
            "Hepatitis" ->{
                other_therapy =  "• Hepatitis IV therapy: 2 times a week\n" +
                        "• Avoid acetaminophen (Tylenol) - it is very hepatotoxic\n" +
                        "• Avoid excess iron"
                ss = SpannableString(other_therapy)
            }
            "Herpes Simplex" ->{
                other_therapy =  "• Antiviral IV therapy: 3/week for 1 month\n" +
                        "• Ice compress: 10 minutes on, 5 minutes off during initial phase\n" +
                        "• Decrease stress and anxiety\n" +
                        "• The following precautions should be taken during an attack:\n" +
                        "• Wear underwear to bed\n" +
                        "• Wash hands before touching other body parts\n" +
                        "• Avoid sexual contact\n" +
                        "• Do not share food, clothing, utensils\n" +
                        "• General prevention:\n" +
                        "• Protect face and lips from sunlight\n" +
                        "• Practice safer sex\n"
                ss = SpannableString(other_therapy)
            }
            "High Blood Pressure" ->{
                other_therapy =  "• Hypertension IV therapy\n" +
                        "• An exercise program is a must. Begin by walking 15 minutes 4 times a week for 2 weeks, then 20 minutes 4 times a week for 2 weeks, then 30 minutes 4 times a week\n" +
                        "• Reduce weight if obese\n" +
                        "• Avoid the NSAIDS, Rofecoxib (Vioxx) and Nabumetone (Relafen) - they increase systolic and diastolic blood pressure\n" +
                        "• Chelate lead and calcium if above normal levels (determined by hair analysis)"
                ss = SpannableString(other_therapy)
            }
            "High Cholesterol" ->{
                other_therapy =  "• Some form of daily exercise (walking, cycling, yoga, etc.) increases HDL and lowers cholesterol and LDL\n" +
                        "• Reduce stress\n" +
                        "• *Rinse dishes very well - detergent dissolves fatty acids in cell membranes"
                ss = SpannableString(other_therapy)
            }
            "HIV" ->{
                other_therapy =  "• Lactobacillus acidophilus enema\n" +
                        "• Chelate excess iron if necessary\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Reduce stress where at all possible\n" +
                        "• Stop smoking\n" +
                        "• Moderate exercise has been shown to slow the disease progression"
                ss = SpannableString(other_therapy)
            }
            "Hyperactivity" ->{
                other_therapy =  "• Chelate lead or other heavy metals if hair analysis or other lab work indicates\n" +
                        "• Avoid television and fluorescent lights"
                ss = SpannableString(other_therapy)
            }
            "Hypercholesterolemia" ->{
                other_therapy =  "• Some form of daily exercise (walking, cycling, yoga, etc.) increases HDL and lowers cholesterol and LDL\n" +
                        "• Reduce stress\n" +
                        "• *Rinse dishes very well - detergent dissolves fatty acids in cell membranes"
                ss = SpannableString(other_therapy)
            }
            "Hypertension" ->{
                other_therapy =  "• Hypertension IV therapy\n" +
                        "• An exercise program is a must. Begin by walking 15 minutes 4 times a week for 2 weeks, then 20 minutes 4 times a week for 2 weeks, then 30 minutes 4 times a week\n" +
                        "• Reduce weight if obese\n" +
                        "• Avoid the NSAIDS, Rofecoxib (Vioxx) and Nabumetone (Relafen) - they increase systolic and diastolic blood pressure\n" +
                        "• Chelate lead and calcium if above normal levels (determined by hair analysis)"
                ss = SpannableString(other_therapy)
            }
            "Hypothyroid" ->{
                other_therapy =  "• Do not use an electric blanket or water bed - body metabolism will be raised slightly if the body is forced to generate its own heat to keep warm\n" +
                        "• Daily exercise (walking, running, cycling, yoga, etc.) - 15-20 minutes will stimulate the thyroid gland and increase metabolism\n" +
                        "• Stop smoking\n" +
                        "• Take a cool shower morning (and evening if you can) to stimulate metabolism\n" +
                        "• Alternating hot and cold to the thyroid gland - hot compresses molded to the neck and upper chest and maintained for 5 minutes. Alternate with an ice cold compress for 30 seconds. Repeat 3 to 5 times. Do this every morning and evening for one week and then mornings only for 30 days.\n" +
                        "• Avoid taking lithium unless absolutely necessary"
                ss = SpannableString(other_therapy)
            }
            "IBS" ->{
                other_therapy =  "• *Lactobacillus acidophilus enema: 1/day during bouts of diarrhea\n" +
                        "• Relaxation exercises to decrease stress: yoga, deep breathing, moderate walking\n" +
                        "• Hypnotherapy has been found to be effective in some cases\n" +
                        "• Stop smoking"
                ss = SpannableString(other_therapy)
            }
            "Impotence" ->{
                other_therapy =  "• Testosterone supplementation if deficient\n" +
                        "• Regular exercise\n" +
                        "• Relaxation exercises 10-15 minutes per day\n" +
                        "• Cigarettes can cause impotence - stop smoking"
                ss = SpannableString(other_therapy)
            }
            "Incontinence, Stress" ->{
                other_therapy =  "• Estrogen replacement therapy\n" +
                        "• Biofeedback and bladder training\n" +
                        "• Regularly timed toileting\n" +
                        "• Cones\n" +
                        "• Pelvic floor exercises (Kegles)\n" +
                        "• Stop smoking"
                ss = SpannableString(other_therapy)
            }
            "Infertility" ->{
                other_therapy =  "Female:\n" +
                        "• See also Amenorrhea\n" +
                        "• See also Endometriosis\n" +
                        "• See also Uterine fibroids\n" +
                        "• Weight loss is a must if overweight\n" +
                        "• Weight gain is a must if underweight\n" +
                        "• Stop smoking\n" +
                        "   Male:\n" +
                        "• Heavy metal detoxification program (including lead and mercury chelation if necessary)\n" +
                        "• Stop smoking (smoking causes high levels of cadmium which induces infertility)\n" +
                        "• Avoid exposure to herbicides and pesticides\n" +
                        "• Avoid prolonged exposure to excessive heat"
                ss = SpannableString(other_therapy)
            }
            "Insomnia" ->{
                other_therapy =  "• Exercise: 15 min. per day for 3 weeks; then 20 min. per day, primarily in the afternoon\n" +
                        "• Early morning exposure to full-spectrum, bright lights\n" +
                        "• Engage in relaxation techniques such as massage, warm drinks and soothing musical tapes prior to bedtime\n" +
                        "• Avoid organic solvents and pesticides\n" +
                        "• Chelate excess lead using EDTA or vitamin C\n" +
                        "• Quit smoking\n"
                ss = SpannableString(other_therapy)
            }
            "Irritable Bowel Syndrome" ->{
                other_therapy =  "• *Lactobacillus acidophilus enema: 1/day during bouts of diarrhea\n" +
                        "• Relaxation exercises to decrease stress: yoga, deep breathing, moderate walking\n" +
                        "• Hypnotherapy has been found to be effective in some cases\n" +
                        "• Stop smoking"
                ss = SpannableString(other_therapy)
            }
            "Longevity" ->{
                other_therapy =  "• Exercise is a must. Start with 15 minutes a day for 4 days a week and gradually increase until doing 30 minutes a day for 4 days a week\n" +
                        "• Avoid ultraviolet light\n" +
                        "• Meditate 20 minutes a day\n" +
                        "• Replace mercury amalgams\n" +
                        "• Lose weight if obese\n" +
                        "• Hormone therapy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(other_therapy)
            }
            "Lupus" ->{
                other_therapy =  "• Avoid quartz dust, antibiotic allergy, environmental pollution and other xenobiotics\n" +
                        "• Stop smoking\n" +
                        "• Remove silicon breast implants\n" +
                        "• Fasting may be beneficial\n"
                ss = SpannableString(other_therapy)
            }
            "Macular Degeneration" ->{
                other_therapy =  "• Macular degeneration IV therapy\n" +
                        "• Stop smoking\n" +
                        "• Avoid excessive ultraviolet radiation (strong sunlight)"
                ss = SpannableString(other_therapy)
            }
            "Manic Depressive Disorder" ->{
                other_therapy =  "• Chelate excess vanadium and iron using EDTA or desferoxamine\n" +
                        "• Replace mercury amalgam dental fillings\n" +
                        "• Stop smoking\n" +
                        "• Lose wieght if obese\n"
                ss = SpannableString(other_therapy)
            }
            "Mastitis" ->{
                other_therapy =  "• Heating Compress to breast: daily\n" +
                        "• Constitutional hydrotherapy - 1 per day\n" +
                        "• Make a poultice of raw potato and carrot and place against the breast for 30 minutes twice a day (or taped in place all night if possible)\n" +
                        "• Ice packs (applied 5 minutes) 1 to 3 times per day along with concurrent hot foot bath\n" +
                        "• Stop smoking\n"
                ss = SpannableString(other_therapy)
            }
            "Memory Loss" ->{
                other_therapy =  "• Read intellectually stimulating articles\n" +
                        "• Do crossword puzzles\n" +
                        "• Take classes\n" +
                        "• Physical exercise\n" +
                        "• Cranial manipulation\n" +
                        "• Postmenopausal women may benefit from estrogen replacement therapy and andropausal men might improve memory with testosterone supplementation\n" +
                        "• Replace mercury amalgam dental fillings with porcelain or other materials\n" +
                        "• Avoid sources of aluminum (e.g., deodorants, aluminum cookware, polluted water) and lead toxicity (e.g., lead paint, lead water pipes)\n" +
                        "• Avoid toxic hydrocarbons (e.g., gasoline, pesticides/insecticides, formaldehyde, carpet glue)\n"
                ss = SpannableString(other_therapy)
            }
            "Menopause" ->{
                other_therapy =  "• Exercise: 30 minutes 3 / week\n" +
                        "• Stop smoking\n" +
                        "• Estrogen replacement therapy (primarily estriol, preferrably from plant sources)\n"
                ss = SpannableString(other_therapy)
            }
            "Migraine Headache" ->{
                other_therapy =  "• Migraine IV therapy\n" +
                        "• Tonic IV therapy\n" +
                        "• Migraine IV push therapy\n" +
                        "• Test for environmental allergens, heavy metal toxicity and hypoglycemia\n" +
                        "• Normalize sleep patterns, i.e., normal start and duration\n" +
                        "• Get regular exercise\n" +
                        "• Hyperbaric oxygen has been shown to be beneficial in some cases\n" +
                        "• Enermed therapy (magnets)"
                ss = SpannableString(other_therapy)
            }
            "Mouth Ulcers" ->{
                other_therapy =  "• *Camphor oil topically\n" +
                        "• Replace mercury amalgam fillings\n" +
                        "• *Alum powder or baking soda topically\n" +
                        "• Stress reduction and relaxation/imagery training\n"
                ss = SpannableString(other_therapy)
            }
            "Multiple Sclerosis" ->{
                other_therapy =  "• MS IV therapy\n" +
                        "• Constitutional hydrotherapy: 3 / week\n" +
                        "• Cold baths to prevent muscular atrophy\n" +
                        "• Cold (50° F) immersion of spastic extremity for 10 minutes followed by exercise\n" +
                        "• Do not smoke\n" +
                        "• Avoid repeated occupational exposure to anesthetics gases\n" +
                        "• Avoid exposure to solvents and other forms of pollution\n" +
                        "• Bee venom treatments have been shown to be helpful for some patients\n" +
                        "• Treat for viral infection if detected"
                ss = SpannableString(other_therapy)
            }

            "Obesity" ->{
                other_therapy =  "• Exercise is a must. Start with 15 minutes a day for 4 days a week and gradually increase until doing 30 minutes a day for 4 days a week\n" +
                        "• For children, reduce time spent watching television\n" +
                        "• Dry friction bath every day"
                ss = SpannableString(other_therapy)
            }
            "Osteoarthritis" ->{
                other_therapy =  "• Hot epsom salt compress followed by castor oil massage (not directly on joints, but around) - no more than 2 per week\n" +
                        "• Epsom salt spa sessions once a week have been shown to be helpful\n" +
                        "• Daily exercise (walking, cycling, yoga, etc.) prevents immobility and supports the immune system\n" +
                        "• For pain, capsaicin\n" +
                        "• Alternating magnets (north/south) have been shown to increase circulation and reduce arthritis inflammation"
                ss = SpannableString(other_therapy)
            }
            "Osteoporosis" ->{
                other_therapy =  "• Exercise is a must\n" +
                        "• Walk outdoors briskly for 10 minutes, 4 times a week, for 2 weeks, then 15 minutes, 4 times a week for 2 weeks, then 20 minutes, 4 times a week for 2 weeks, then 30 minutes, 4 times a week\n" +
                        "• Estrogen replacement therapy for postmenopausal women\n" +
                        "• Stop smoking\n" +
                        "• Avoid repeated or occupational exposure to cadmium"
                ss = SpannableString(other_therapy)
            }
            "Otitis Media" ->{
                other_therapy =  "• *Cold wet socks (put on cold, wet, cotton socks and put on dry wool socks over them)\n" +
                        "• *Hot (5 min.) then cold (1 min.) compresses over ear (repeat 2 or 3 times)\n" +
                        "• *Constitutional hydrotherapy\n" +
                        "• *Hot foot baths relieve pain of earache very quickly\n" +
                        "• *Light massage around neck while pulling on the ear lobe repeatedly (creates suction with the tragus)\n" +
                        "• *Honey or glycerin in external ear canal (osmotic gradient)\n" +
                        "• *Poultice: place against the outside of the ear for 30 minutes (or taped in place all night if possible)\n" +
                        "• Children who are breast fed are less likely to contract otitis media\n" +
                        "• Consider avoiding the use of antibiotics\n" +
                        "• Avoid smoking and second-hand smoke\n" +
                        "• Avoid use of pacifiers in infants\n" +
                        "• Consider a xylitol nasal spray\n" +
                        "• Avoid baby swimming\n"
                ss = SpannableString(other_therapy)
            }
            "Ovarian Cancer" ->{
                other_therapy =  "• * Coffee Enema: daily for 3 months\n" +
                        "• *Smoking marijuana (Cannabis sativa) allievates the nausea and vomiting associated with chemotherapy - this is illegal in some states\n" +
                        "• Sunlight is protective against ovarian cancer"
                ss = SpannableString(other_therapy)
            }
            "Painful Menses" ->{
                other_therapy =  "• Stop smoking\n" +
                        "• Alleviate stress\n" +
                        "• Acupuncture\n" +
                        "• Spinal manipulation\n" +
                        "• Aromatherapy has been shown to be effective in many cases\n" +
                        "• *Tonic IV therapy: for acute relief\n" +
                        "• *Coffee enema: 1/day 1 week before and during menstrual flow"
                ss = SpannableString(other_therapy)
            }
            "Paralysis Agitans" ->{
                other_therapy =  "• Avoid exposure to toxic chemicals and manganese\n" +
                        "• Avoid excess iron ingestion and intake of other metals (chelate if concentrations are too high)\n" +
                        "• Moderate regular exercise is useful in prevention of Parkinson's disease, especially Qigong exercise\n" +
                        "• Exposure to weak electromagnetic fields has been shown to be helpful in reducing symptoms of Parkinson's\n" +
                        "• Estrogen replacement therapy for women has been preventive in various studies\n" +
                        "• Continuous bath/hammock bath for 2 hours or more 5-6 times a week"
                ss = SpannableString(other_therapy)
            }
            "Parkinson's Disease" ->{
                other_therapy =  "• Avoid exposure to toxic chemicals and manganese\n" +
                        "• Avoid excess iron ingestion and intake of other metals (chelate if concentrations are too high)\n" +
                        "• Moderate regular exercise is useful in prevention of Parkinson's disease, especially Qigong exercise\n" +
                        "• Exposure to weak electromagnetic fields has been shown to be helpful in reducing symptoms of Parkinson's\n" +
                        "• Estrogen replacement therapy for women has been preventive in various studies\n" +
                        "• Continuous bath/hammock bath for 2 hours or more 5-6 times a week\n"
                ss = SpannableString(other_therapy)
            }
            "Peptic Ulcers" ->{
                other_therapy =  "• Constitutional hydrotherapy\n" +
                        "• Exercise 20 minutes a day for 4-5 days weekly\n" +
                        "• Quit smoking\n" +
                        "• Don't take aspirin or NSAIDs\n" +
                        "• Reduce stress by exercise, breathing, yoga, etc.\n"
                ss = SpannableString(other_therapy)
            }
            "PMS" ->{
                other_therapy =  "• Constitutional hydrotherapy\n" +
                        "• Sitz bath (alternating hot and cold)\n" +
                        "• Hot foot baths\n" +
                        "• Abdominal massage\n" +
                        "• Aerobic exercise\n" +
                        "• Relaxation (yoga, massage, tapes, etc.).\n" +
                        "• Detoxification\n"
                ss = SpannableString(other_therapy)
            }
            "Premenstrual Syndrome" ->{
                other_therapy =  "• Constitutional hydrotherapy\n" +
                        "• Sitz bath (alternating hot and cold)\n" +
                        "• Hot foot baths\n" +
                        "• Abdominal massage\n" +
                        "• Aerobic exercise\n" +
                        "• Relaxation (yoga, massage, tapes, etc.).\n" +
                        "• Detoxification"
                ss = SpannableString(other_therapy)
            }
            "Psoriasis" ->{
                other_therapy =  "• Coffee enema: 2/week\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Sea water bathing\n" +
                        "• Oat meal baths (for itching and soothing the nerves)\n" +
                        "• Topical application of Vitamin D in the activated form: Calcitrol or Calcipotriol - BID\n" +
                        "• Use enemas (and laxatives if necessary) to insure that the bowels move every day\n" +
                        "• Get lots of sunshine, preferably with meditation\n" +
                        "• Weight reduction if appropriate\n"
                ss = SpannableString(other_therapy)
            }
            "Psoriatic Arthritis" ->{
                other_therapy =  "• Coffee enema: 2/week (also insure that the bowels move every day)\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• D'Adamo blood test for specific dietary recommendations\n" +
                        "• Sea water bathing\n" +
                        "• Oat meal baths (for itching and soothing the nerves)\n" +
                        "• Topical application of Vitamin D in the activated form: Calcitrol or Calcipotriol - BID\n" +
                        "• Get lots of sunshine, preferably with exercise to promote perspiration and reduce stress\n" +
                        "• Weight reduction if appropriate\n" +
                        "• Copper bracelets worn continuously have been shown to relieve arthritis symptoms\n" +
                        "• Hot epsom salt compress followed by castor oil massage (not directly on joints, but around) for arthritis\n" +
                        "• Stop smoking\n" +
                        "• Alternating magnets (north/south) have been shown to increase circulation and reduce arthritis inflammation\n" +
                        "• Avoid exposure to pesticides and silica dust"
                ss = SpannableString(other_therapy)
            }
            "Regional Enteritis" ->{
                other_therapy =  "• Lactobacillus acidophilus enema: 1/day during bouts of diarrhea\n" +
                        "• Avoid antibiotics\n" +
                        "• Crohn's IV therapy\n" +
                        "• *Relaxation exercises to decrease stress: yoga, deep breathing, moderate walking.\n" +
                        "• Stop smoking\n" +
                        "• Test for and repair \"leaky gut\" if necessary to eliminate excessive intestinal permiability."
                ss = SpannableString(other_therapy)
            }
            "Rheumatoid Arthritis" ->{
                other_therapy =  "• Coffee enema: 3/week during flare-ups\n" +
                        "• Copper bracelets worn continuously have been shown to relieve arthritis symptoms\n" +
                        "• Hot epsom salt compress followed by castor oil massage (not directly on joints, but around)\n" +
                        "• Daily exercise (walking, cycling, yoga, etc.) prevents immobility and supports the immune system\n" +
                        "• Stop smoking\n" +
                        "• Alternating magnets (north/south) have been shown to increase circulation and reduce arthritis inflammation\n" +
                        "• Avoid exposure to pesticides and silica dust"
                ss = SpannableString(other_therapy)
            }
            "Rosacea" ->{
                other_therapy =  "• Coffee enema: 3/week\n" +
                        "• Sulfur bath (bath tub about 1/2 full of water at 102° F with 1 oz. of potassium sulfate - dip affected area for 30-60 minutes)\n" +
                        "• Check for the presence of Helicobacter pylori\n" +
                        "• Azelaic acid cream used topically."
                ss = SpannableString(other_therapy)
            }
            "Schizophrenia" ->{
                other_therapy =  "• Check for polysystemic candidiasis\n" +
                        "• Check for autoimmune disorders\n" +
                        "• Consider fasting for several days two times a year."
                ss = SpannableString(other_therapy)
            }
            "SLE" ->{
                other_therapy =  "• Avoid quartz dust, antibiotic allergy, environmental pollution and other xenobiotics\n" +
                        "• Stop smoking\n" +
                        "• Remove silicon breast implants\n" +
                        "• Fasting may be beneficial"
                ss = SpannableString(other_therapy)
            }
            "Sleep Disorder" ->{
                other_therapy =  "• Exercise: 15 min. per day for 3 weeks; then 20 min. per day, primarily in the afternoon\n" +
                        "• Early morning exposure to full-spectrum, bright lights\n" +
                        "• Engage in relaxation techniques such as massage, warm drinks and soothing musical tapes prior to bedtime\n" +
                        "• Avoid organic solvents and pesticides\n" +
                        "• Chelate excess lead using EDTA or vitamin C\n" +
                        "• Quit smoking"
                ss = SpannableString(other_therapy)
            }
            "Stress Incontinence" ->{
                other_therapy =  "• Estrogen replacement therapy\n" +
                        "• Biofeedback and bladder training\n" +
                        "• Regularly timed toileting\n" +
                        "• Cones\n" +
                        "• Pelvic floor exercises (Kegles)\n" +
                        "• Stop smoking\n"
                ss = SpannableString(other_therapy)
            }
            "Systemic Lupus Erythematosus" ->{
                other_therapy =  "• Avoid quartz dust, antibiotic allergy, environmental pollution and other xenobiotics\n" +
                        "• Stop smoking\n" +
                        "• Remove silicon breast implants\n" +
                        "• Fasting may be beneficial"
                ss = SpannableString(other_therapy)
            }
            "Ulcerative Colitis" ->{
                other_therapy =  "• Lactobacillus acidophilus enema: 1/day during bouts of diarrhea\n" +
                        "• Ulcerative colitis IV therapy\n" +
                        "• Relaxation exercises to decrease stress: yoga, deep breathing, moderate walking\n" +
                        "• 1 cup chamomile tea: sip slowly, then lie 10 minutes on left side, 10 minutes on back, 10 minutes on right side\n" +
                        "• Avoid using aspirin and NSAIDs."
                ss = SpannableString(other_therapy)
            }
            "Uterine Fibroids" ->{
                other_therapy =  "• Progesterone cream\n" +
                        "• Alternating sitz bath (week 1 - 2: daily, week 3 - 4: every other day, week 5: rest)\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Exercise to improve pelvic circulation\n" +
                        "• Chelate heavy metals if indicated by hair analysis or other lab work"
                ss = SpannableString(other_therapy)
            }
            "Vaginal Yeast Infection" ->{
                other_therapy =  "• Lactobacillus acidophilus enema (or douche): 2/week\n" +
                        "• Constitutional hydrotherapy\n" +
                        "• Quit taking antibiotics\n" +
                        "• Avoid oral contraceptives and estrogen supplements\n" +
                        "• Avoid or reduce cortisone use\n" +
                        "• *Wear loose underwear to ventilate vaginal area\n" +
                        "• *Fasting may ameliorate\n"
                ss = SpannableString(other_therapy)
            }
        }
        checkAllLinks(ss,other_therapy)
        binding.contentData.text = ss
    }

    private fun setRecommendedLabData(conditionName: String){
        binding.diet.text = "Recommended Labs"
        when(conditionName) {
            "ADD/ADHD" -> {
                recommended_labs = "• Rule out food allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out thyroid problems: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
                val clickableSpan1 = object : ClickableSpan() {
                    override fun onClick(widget: View) {
                        val intent = Intent(
                            this@ConditionDetailActivity,
                            ConditionDetailActivity::class.java
                        )
                        intent.putExtra("heading", "Allergies")
                        startActivity(intent)
                    }
                }
                ss.setSpan(
                    clickableSpan1,
                    recommended_labs.indexOf("food allergies"),
                    recommended_labs.indexOf("food allergies") + 14,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )

            }
            "Adult Acne" -> {
                recommended_labs = "• Rule out acne: Physical Exam, History\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out corticord damage: Drug History\n" +
                        "• Rule out dermatomyositis: Electromyogram, Creatine Kinase, ANA, Skin Biopsy\n" +
                        "• Rule out erythema infectiosum (Fifth Disease): CBC with Diff, Parvovirus B19 Antibody\n" +
                        "• Rule out gram-negative folliculitis: Skin Biopsy with Culture\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "• Rule out perioral dermatitis: Skin Biopsy with Culture\n" +
                        "• Rule out rhinophyma: Physical Exam\n" +
                        "• Rule out rubiosus diabeticorum: Diabetic History\n" +
                        "• Rule out seborrheic dermatitis: Physical Exam, History\n" +
                        "• Rule out sterile eosinphilic pustulosis: Skin Culture and Microiscopy\n" +
                        "• Rule out subacute cutaneous systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n"
                ss = SpannableString(recommended_labs)
            }

            "Age-Related Macular Degeneration" -> {
                recommended_labs = "• Check for macular degeneration: Visual Acuity, Ophthalmic Exam, Photograph of Retina\n" +
                        "• Rule out cataract: Visual Acuity, Pupil Dilation, Tonometry\n" +
                        "• Rule out corneal dystrophies: Ophthalmic Exam, Visual Acuity, Pupil Dilation\n" +
                        "• Rule out diabetic lens: Visual Acuity, Eye Exam, Urinalysis, Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out glaucoma: Visual Acuity, Pupil Dilation, Tonometry, Air Puff, Glaucoma, Gonioscopy, Endocyanine Green Eye Dye\n" +
                        "• Rule out macular hole: Visual Acuity, Ophthalmic Exam, Pupil Dilation\n" +
                        "• Rule out ocular histoplasmosis syndrome: Eye Exam for Histo Spots, Amsler Grid, Pupil Dilation, Fluorescein Angiography\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)

            }
            "Aging Prevention" -> {
                recommended_labs = ""
                ss = SpannableString(recommended_labs)

            }
            "AIDS" -> {
                recommended_labs = "• Check for HIV: ELISA, Western Blot"
                ss = SpannableString(recommended_labs)

            }
            "Allergies" -> {
                recommended_labs = "• Check for allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out celiac disease: Celiac Profile\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)

            }
            "Alzheimer's Disease" -> {
                recommended_labs = "• Check for Alzheimer's Disease: LYMPro, PET Scan\n" +
                        "• Rule out hypothyroidism: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Amenorrhea" -> {
                recommended_labs = "• Check for amenorrhea: Fractionated Estrogens and Progesterone, FSH, LH\n" +
                        "• Rule out GI pathology: Upper GI Series\n" +
                        "• Rule out pelvic infections: PAP Smear, Vaginal Wet Mount, Cervical Cultures, RPR\n" +
                        "• Rule out pituitary tumor: FSH, LH\n" +
                        "• Rule out pregnancy: hCG\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)

            }
            "Anorexia Nervosa" -> {
                recommended_labs = "• Rule out celiac disease: Celiac Profile\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out Crohn's Disease: CBC with Diff, ESR, CRP, Colonoscopy with Biopsy, Upper GI Series\n" +
                        "• Rule out food allergies: IgG Food Allergy Antibody\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)

            }
            "Aphthous Stomatitis" -> {
                recommended_labs = "• Rule out food allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "• Rule out pancreatic insufficiency: Lipase, Amylase\n" +
                        "• Rule out stomach acid problems: Heidelberg\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Arthritis, Gout" -> {
                recommended_labs = "• Check for gout: Gout, Uric Acid\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out degenerative joint disease: X-Ray\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)

            }
            "Arthritis, Osteo" -> {
                recommended_labs = "• Check for osteoarthritis: X-Ray\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out degenerative joint disease: X-Ray\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out gout: Gout, Uric Acid\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)

            }
            "Arthritis, Psoriatic" -> {
                recommended_labs = "• Check for psoriatic arthritis: ANA, Rheumatoid Factor, Skin Biopsy\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out degenerative joint disease: X-Ray\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out gout: Gout, Uric Acid\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out psoriasis: Skin Biopsy\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)

            }
            "Arthritis, Rheumatoid" -> {
                recommended_labs = "• Check for rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out degenerative joint disease: X-Ray\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out gout: Gout, Uric Acid\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)

            }
            "Asthma" -> {
                recommended_labs = "• Check for asthma: Pulmonary Function, Sputum for Eosinophils\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out hypothyroidism: Thyroid Panel with TSH\n" +
                        "• Rule out lung cancer: Chest X-Ray\n" +
                        "• Rule out tuberculosis: PPD Skin, QuantiFERON-TB\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)

            }
            "Atherosclerosis" -> {
                recommended_labs = "• Check for atherosclerosis: Lipid Panel, Apolipoprotein A1, Apolipoprotein B, Cardio CRP, Homocysteine\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c"

                ss = SpannableString(recommended_labs)

            }
            "Atopic Dermatitis" -> {
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out Fifth Disease: CBC with Diff, Parvovirus\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out herpes: Skin Culture\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out impetigo: Skin Culture\n" +
                        "• Rule out psoriasis: Skin Biopsy\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "• Rule out tinea infection: Skin Culture using KOH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)

            }
            "Attention Deficit Disorder" -> {
                recommended_labs = "• Rule out food allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out thyroid problems: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)

            }
            "Autism" -> {
                recommended_labs = "• Rule out heavy metal toxicity: Hair Analysis\n" +
                        "• Rule out hypoglycemia: Fasting Glucose, Oral Glucose Tolerance, Insulin Hypoglycemia\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)

            }

            "Benign Prostatic Hypertrophy" ->{
                recommended_labs = "• Check for BPH: Urodynamic\n" +
                        "• Rule out cadmium and other heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out prostate cancer: PSA II, Anti-malignant Antibody, Ultrasound\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Bipolar Disorder" ->{
                recommended_labs = "• Check for bipolar disorder: History, Physical Exam, Self Assessment for Bipolar Disorder\n" +
                        "• Rule out brain tumor: PET Scan, MRI\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Bladder Infection" ->{
                recommended_labs = "• Check for cystitis: Urinalysis with Culture, CBC with Diff\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out allergy to condoms\n" +
                        "• Rule out cancer: CA125 (in women), Ultrasound\n" +
                        "• In men, rule out chronic prostatitis: Microscopic Analysis of Expressed Prosatic Secretions, Urinalysis with Culture\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• In women, rule out endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out kidney stones: Ultrasound\n" +
                        "• Rule out sexually transmitted diseases: Gram Stain of Urethral Discharge\n" +
                        "• Rule out structual abnormalities: Voiding Cystourethrogram\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Blood Pressure, High" ->{
                recommended_labs = "• Check for hypertension: Sphygmomanometry\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "BPH" ->{
                recommended_labs = "• Check for BPH: Urodynamic\n" +
                        "• Rule out cadmium and other heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out prostate cancer: PSA II, Anti-malignant Antibody, Ultrasound\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Bronchitis" ->{
                recommended_labs = "• Check for bronchitis: Pulmonary Function, Sputum Culture\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out coronary artery disease: ECG, Exercise Stress\n" +
                        "• Rule out lung cancer: Chest X-Ray\n" +
                        "• Rule out tuberculosis: PPD Skin, QuantiFERON-TB\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Cancer Prevention" ->{
                recommended_labs = "• "
                ss = SpannableString(recommended_labs)
            }
            "Candida Infection" ->{
                recommended_labs = "• Check for candidiasis: Candida Panel\n" +
                        "• Rule out adrenal insufficiency: Adrenocortex Stress Profile\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Candidiasis" ->{
                recommended_labs = "• Check for candidiasis: Candida Panel\n" +
                        "• Rule out adrenal insufficiency: Adrenocortex Stress Profile\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Canker Sores" ->{
                recommended_labs = "• Rule out food allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "• Rule out pancreatic insufficiency: Lipase, Amylase\n" +
                        "• Rule out stomach acid problems: Heidelberg\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Cataract Prevention" ->{
                recommended_labs = "• Check for cataract: Ophthalmic Exam, Visual Acuity, Pupil Dilation, Tonometry\n" +
                        "• Rule out corneal dystrophies: Ophthalmic Exam, Visual Acuity, Pupil Dilation\n" +
                        "• Rule out diabetic lens: Visual Acuity, Eye Exam, Urinalysis, Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out glaucoma: Visual Acuity, Pupil Dilation, Tonometry, Air Puff, Glaucoma, Gonioscopy, Endocyanine Green Eye Dye\n" +
                        "• Rule out macular degeneration: Visual Acuity, Ophthalmic Exam, Photograph of Retina\n" +
                        "• Rule out macular hole: Visual Acuity, Ophthalmic Exam, Pupil Dilation\n" +
                        "• Rule out ocular histoplasmosis syndrome: Eye Exam for Histo Spots, Amsler Grid, Pupil Dilation, Fluorescein Angiography\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "CFS/CFIDS" ->{
                recommended_labs = "• Check for chronic fatigue syndrome: ESR, Adrenal Function, Liver Function, Coxsackie Virus B Titer, HHV6 Titer, C. pneumoniae Titer\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out anemia: CBC with Diff\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out Cushing's Disease: Dexamethasone Suppression\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "• Rule out tuberculosis: PPD Skin, QuantiFERON-TB\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "CHF" ->{
                recommended_labs = "• Check for coronary artery disease: Chest X-Ray, ECG, Exercise Stress, B-Type Natriuretic Peptide, Multiple-Gated Acqusition Scanning, Angiogram\n" +
                        "• Rule out kidney disease: Urea Nitrogen, Creatinine, Urea Nitrogen-Creatinine Ratio, Electrolytes\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Cholecystitis" ->{
                recommended_labs = "• Check for gall bladder disease (cholecystitis): Ultrasound, Palpation, Nuclear Medicine Scanning\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out gallstones (cholelithiasis): Ultrasound, Cholecystography\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out hiatal hernia: Barium X-Ray, Endoscopy\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pancreatitis: Amylase, Lipase, Trypsin, CBC, Comprehensive Metabolic Panel, Glucose, CRP, Abdominal Ultrasound\n" +
                        "• Rule out peptic ulcer: Endoscopy, Upper GI Series\n" +
                        "• Rule out recurrent pyogenic cholangitis: CBC, Liver Function, Prothrombin Time, Blood Cultures, Ova and Parasites, MRCP\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Cholelithiasis" ->{
                recommended_labs = "• Check for gallstones (cholelithiasis): Ultrasound, Cholecystography\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out gall bladder disease (cholecystitis): Ultrasound, Palpation, Nuclear Medicine Scanning\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out hiatal hernia: Barium X-Ray, Endoscopy\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pancreatitis: Amylase, Lipase, Trypsin, CBC, Comprehensive Metabolic Panel, Glucose, CRP, Abdominal Ultrasound\n" +
                        "• Rule out peptic ulcer: Endoscopy, Upper GI Series\n" +
                        "• Rule out recurrent pyogenic cholangitis: CBC, Liver Function, Prothrombin Time, Blood Cultures, Ova and Parasites, MRCP\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Chronic Fatigue Syndrome" ->{
                recommended_labs = "• Check for chronic fatigue syndrome: ESR, Adrenal Function, Liver Function, Coxsackie Virus B Titer, HHV6 Titer, C. pneumoniae Titer\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out anemia: CBC with Diff\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out Cushing's Disease: Dexamethasone Suppression\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "• Rule out tuberculosis: PPD Skin, QuantiFERON-TB\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Colitis" ->{
                recommended_labs = "• Check for irritable bowel syndrome: CBC with Diff, ESR, CRP, Colonoscopy with Biopsy\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out celiac disease: Celiac Panel\n" +
                        "• Rule out parasites: Stool Analysis\n" +
                        "• Rule out stricture, cancer, anal fissure, proctitis: Colonoscopy, Colon Biopsis, Defecating Protogram, Anal and Abdominal Ultrasound, Scintigraphy, Colonic Motility, Hydrogen Breath\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Congestive Heart Failure" ->{
                recommended_labs = "• Check for coronary artery disease: Chest X-Ray, ECG, Exercise Stress, B-Type Natriuretic Peptide, Multiple-Gated Acqusition Scanning, Angiogram\n" +
                        "• Rule out kidney disease: Urea Nitrogen, Creatinine, Urea Nitrogen-Creatinine Ratio, Electrolytes\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Constipation" ->{
                recommended_labs = "• Rule out hypothyroidism: Thyroid Panel with TSH\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out narcotic medications: History, Drug Reference Information Analysis\n" +
                        "• Rule out stricture, cancer, anal fissure, proctitis: Colonoscopy with Biopsy, Defecating Protogram, Anal and Abdominal Ultrasound, Scintigraphy, Colonic Motility, Hydrogen Breath\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Crohn's Disease" ->{
                recommended_labs = "• Check for Crohn's Disease: CBC with Diff, ESR, CRP, Colonoscopy with Biopsy, Upper GI Series\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out celiac disease: Celiac Panel\n" +
                        "• Rule out parasites: Stool Analysis\n" +
                        "• Rule out stricture, cancer, anal fissure, proctitis: Colonoscopy, Colon Biopsis, Defecating Protogram, Anal and Abdominal Ultrasound, Scintigraphy, Colonic Motility, Hydrogen Breath\n" +
                        "• Rule out ulcerative colitis: Colonoscopy, Sigmoidoscopy with Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Cystitis" ->{
                recommended_labs = "• Check for cystitis: Urinalysis with Culture, CBC with Diff\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out allergy to condoms\n" +
                        "• Rule out cancer: CA125 (in women), Ultrasound\n" +
                        "• In men, rule out chronic prostatitis: Microscopic Analysis of Expressed Prosatic Secretions, Urinalysis with Culture\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• In women, rule out endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out kidney stones: Ultrasound\n" +
                        "• Rule out sexually transmitted diseases: Gram Stain of Urethral Discharge\n" +
                        "• Rule out structual abnormalities: Voiding Cystourethrogram\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Depression" ->{
                recommended_labs = "• Rule out adrenal insufficiency: Adrenocortex Stress Profile\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out Cushing's Disease: Dexamethasone Suppression\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out hormonal insufficiency: FSH, LH\n" +
                        "• Rule out hypothyroidism: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Diabetes Mellitus" ->{
                recommended_labs = "• Check for diabetes: Urinalysis, Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Dysmenorrhea" ->{
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out appendicitis: CBC with Diff\n" +
                        "• Rule out cancer: CA125, Ultrasound\n" +
                        "• Rule out endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out GI pathology: Upper GI Series\n" +
                        "• Rule out pelvic infections: PAP Smear, Vaginal Wet Mount, Cervical Cultures, RPR\n" +
                        "• Rule out pregnancy: hCG\n" +
                        "• Rule out renal pathology: Ultrasound\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }

            "Ear Infection" ->{
                recommended_labs = "• Check for otitis media: Full Sepsis Workup (Infants Younger than 12 Weeks), Tympanometry, Acoustic Reflectometry\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out Apert Syndrome: X-Ray, CT Scan, MRI, Hearing Assessment\n" +
                        "• Rule out bacteremia: CBC with Diff with Absolute Neurophil and Band Count, CSR, CRP, Urinalysis, Blood Culture\n" +
                        "• Rule out cholesteatoma: Complete Ototscopic Exam, Peoperative CT Scan\n" +
                        "• Rule out colic: History\n" +
                        "• Rule out gastroenteritis: Fecal Leukocytes, Gram Stain of Stool\n" +
                        "• Rule out gastroestrophageal reflux: Upper GI Series, Gastric Scintiscan, Manometry, Esophagogastroduodenoscopy\n" +
                        "• Rule out haemophilus influenzae infection: Culture of CSF/Synovial/Pleural/Paracardial Fluids\n" +
                        "• Rule out head trauma: History\n" +
                        "• Rule out hearing impairment: Hearing Assessment, Complete Otoscopic Exam\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out mastoiditis: Culture of Ear/Blood/Mastoid/Abscess, CBC, ESR, CT Scan\n" +
                        "• Rule out meningitis, bacterial: Lumbar Puncture and Culture of CSF\n" +
                        "• Rule out nasal polyps: Nasal Exam, MRI, CT Scan\n" +
                        "• Rule out nasopharyngeal cancer: CBC with Diff, Blood Chemistry, EBV Capsid IgG and IgM, CT Scan, Biopsy\n" +
                        "• Rule out otitis externa: Culture\n" +
                        "• Rule out otosclerosis: Halo Sign on Fine-Cut Ct Scan, Audiogram\n" +
                        "• Rule out parainfluenza virus infections: Sputum Culture, CBC with Diff\n" +
                        "• Rule out passive smoking and lung disease: History\n" +
                        "• Rule out pharyngitis: Throat Culture\n" +
                        "• Rule out pneumococcal infections: CBC with Diff, Gram Stain, Sputum and Throat Culture\n" +
                        "• Rule out primary ciliary dyskinesia: Direct Video Cinematography, Oscillography\n" +
                        "• Rule out respiratory syncytial virus infection: Sputum Culture, CBC with Diff, Chest X-Ray, Oxygen Saturation\n" +
                        "• Rule out rhinovirus infection: CBC with Diff, Nasopharyngeal Culture\n" +
                        "• Rule out sinusitis: Nasopharyngeal Culture, Paranasal Sinus X-Ray, Ultrasound, CT Scan, MRI, Illumination, Percussion\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Eczema, Chronic" ->{
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out Fifth Disease: CBC with Diff, Parvovirus\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out herpes: Skin Culture\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out impetigo: Skin Culture\n" +
                        "• Rule out psoriasis: Skin Biopsy\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "• Rule out tinea infection: Skin Culture using KOH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }

            "Endometriosis" ->{
                recommended_labs = "• Check for endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out appendicitis: CBC with Diff\n" +
                        "• Rule out cancer: CA125, Ultrasound\n" +
                        "• Rule out GI pathology: Upper GI Series\n" +
                        "• Rule out pelvic infections: PAP Smear, Vaginal Wet Mount, Cervical Cultures, RPR\n" +
                        "• Rule out pregnancy: hCG\n" +
                        "• Rule out renal pathology: Ultrasound\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }

            "Erectile Dysfunction" ->{
                recommended_labs = "• Check for impotence: CIS (Combined Injection and Stimulation), Duplex/Color Ultrasound, Cavernosography\n" +
                        "• Rule out alcoholism: History, Liver panel\n" +
                        "• Rule out atherosclerosis: Lipid Panel, Apolipoprotein A1, Apolipoprotein B, Cardio CRP, Homocysteine\n" +
                        "• Rule out complications of rectal and prostate surgery: History\n" +
                        "• Rule out congenital deformity: CT Scan, Ultrasound\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out drug-induced impotence: History, Blood Chemistry\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out hypergonadotropic hypogonadism: Blood Testosterone Levels\n" +
                        "• Rule out hyperprolactinemia: Fasting Blood Prolactin Levels, MRI\n" +
                        "• Rule out hypertension: sphygmomanometry\n" +
                        "• Rule out long distance biking: History\n" +
                        "• Rule out multiple sclerosis: MRI\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pelvic injury: History, Ultrasound, CT Scan, X-Ray\n" +
                        "• Rule out scleroderma: ANA with Reflex\n" +
                        "• Rule out spinal trauma: History, X-Ray\n" +
                        "• Rule out straddle injury: History\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }

            "Fertility" ->{
                recommended_labs = "• Rule out anemia: CBC with Diff\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out cancer: CA125, Ultrasound\n" +
                        "• Rule out endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out hormonal imbalance: Fractionated Estrogens and Progesterone, FSH, LH\n" +
                        "• Rule out pelvic infections: PAP Smear, Vaginal Wet Mount, Cervical Cultures, RPR\n" +
                        "• Rule out pernicious anemia: Schilling\n" +
                        "• Rule out structural pathology: Ultrasound, Laparoscopy\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Fibrocystic Breast Disease" ->{
                recommended_labs = "• Rule out adenosis: Fine Needle Aspiration Biopsy\n" +
                        "• Rule out breast cancer: X-Ray, Biopsy\n" +
                        "• Rule out cysts: Aspiration Biopsy\n" +
                        "• Rule out duct ectasia: Biopsy\n" +
                        "• Rule out fibroadenoma: Biopsy\n" +
                        "• Rule out galactocoele: Milk Culture Test (if lactating)\n" +
                        "• Rule out lipoma: Biopsy\n" +
                        "• Rule out lymphoma: Peripheral Blood Smear, CBC with Diff, Lymph Node or Bone Marrow Biopsy\n" +
                        "• Rule out neurofibroma: X-Ray, Ultrasound, MRI, Biopsy\n" +
                        "• Rule out Pagets Disease: X-Ray, Ultrasound, Biopsy, Scrape Cytology\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }

            "Fibromyalgia" ->{
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out anemia: CBC with Diff\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Gallbladder Disease" ->{
                recommended_labs = "• Check for gall bladder disease (cholecystitis): Ultrasound, Palpation, Nuclear Medicine Scanning\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out gallstones (cholelithiasis): Ultrasound, Cholecystography\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out hiatal hernia: Barium X-Ray, Endoscopy\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pancreatitis: Amylase, Lipase, Trypsin, CBC, Comprehensive Metabolic Panel, Glucose, CRP, Abdominal Ultrasound\n" +
                        "• Rule out peptic ulcer: Endoscopy, Upper GI Series\n" +
                        "• Rule out recurrent pyogenic cholangitis: CBC, Liver Function, Prothrombin Time, Blood Cultures, Ova and Parasites, MRCP\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Gallstones" ->{
                recommended_labs = "• Check for gallstones (cholelithiasis): Ultrasound, Cholecystography\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out gall bladder disease (cholecystitis): Ultrasound, Palpation, Nuclear Medicine Scanning\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out hiatal hernia: Barium X-Ray, Endoscopy\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pancreatitis: Amylase, Lipase, Trypsin, CBC, Comprehensive Metabolic Panel, Glucose, CRP, Abdominal Ultrasound\n" +
                        "• Rule out peptic ulcer: Endoscopy, Upper GI Series\n" +
                        "• Rule out recurrent pyogenic cholangitis: CBC, Liver Function, Prothrombin Time, Blood Cultures, Ova and Parasites, MRCP\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Gout" ->{
                recommended_labs = "• Check for gout: Gout, Uric Acid\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out degenerative joint disease: X-Ray\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Headache, General" ->{
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out brain tumor and other malignancies: PET Scan, MRI\n" +
                        "• Rule out congestive heart failure: ECG, Exercise Stress, B-Type Natriuretic Peptide, Multiple-Gated Acqusition Scanning, Angiogram\n" +
                        "• Rule out dental disorders: Dental Exam\n" +
                        "• Rule out diabetic acidosis: Oral Glucose Tolerance, Urine Ketone Dip\n" +
                        "• Rule out drug side effects: Drug Reference Information Analysis\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out herpes zoster: Viral Culture of Skin Lesion, Tzanck, CBC with Diff\n" +
                        "• Rule out hyperparathyroidism: PTH\n" +
                        "• Rule out hypertension: Sphygomanometry\n" +
                        "• Rule out migraine: MIDAS\n" +
                        "• Rule out ocular disorders: Ophthalmic Exam\n" +
                        "• Rule out osteomyelitis: MRI, Bone Scan, X-Ray, CBC with Diff\n" +
                        "• Rule out otitis media: Otoscopic Exam\n" +
                        "• Rule out rheumatoid arthritis: Latex, ESR\n" +
                        "• Rule out sinusitis: CT Scan, Illumination, Percussion\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "• Rule out TMJ syndrome: Physical Exam\n" +
                        "• Rule out tuberculosis: PPD Skin\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Headache, Migraine" ->{
                recommended_labs = "• Check for migraine: MIDAS\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out brain tumor and other malignancies: PET Scan, MRI\n" +
                        "• Rule out congestive heart failure: ECG, Exercise Stress, B-Type Natriuretic Peptide, Multiple-Gated Acqusition Scanning, Angiogram\n" +
                        "• Rule out dental disorders: Dental Exam\n" +
                        "• Rule out diabetic acidosis: Oral Glucose Tolerance, Urine Ketone Dip\n" +
                        "• Rule out drug side effects: Drug Reference Information Analysis\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out herpes zoster: Viral Culture of Skin Lesion, Tzanck, CBC with Diff\n" +
                        "• Rule out hyperparathyroidism: PTH\n" +
                        "• Rule out hypertension: Sphygomanometry\n" +
                        "• Rule out ocular disorders: Ophthalmic Exam\n" +
                        "• Rule out osteomyelitis: MRI, Bone Scan, X-Ray, CBC with Diff\n" +
                        "• Rule out otitis media: Otoscopic Exam\n" +
                        "• Rule out rheumatoid arthritis: Latex, ESR\n" +
                        "• Rule out sinusitis: Nasopharyngeal Culture, Paranasal Sinus X-Ray, Ultrasound, CT Scan, MRI, Illumination, Percussion\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "• Rule out TMJ syndrome: Physical Exam\n" +
                        "• Rule out tuberculosis: PPD Skin\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Hemorrhoids" ->{
                recommended_labs = "• Check for hemorrhoids: Anoscopy\n" +
                        "• Rule out anal fissure: Anoscopy\n" +
                        "• Rule out anal fistula: Anoscopy, Sigmoidoscopy\n" +
                        "• Rule out colorectal cancer: Colonoscopy, Guiac, Barium Enema, Transrectal Ultrasound, CT of Abdomen and Pelvis, CEA, Biopsy\n" +
                        "• Rule out condyloma acuminata: Acetowhitening, Biopsy\n" +
                        "• Rule out pedunculated polyp: Colonoscopy, Guiac\n" +
                        "• Rule out perianal abcess: Anoscopy\n" +
                        "• Rule out pruritus ani: Stool Acidity\n" +
                        "• Rule out rectal prolapse: Rectal Exam, Sigmoidoscopy, Barium Enema, Anorectal Manometry\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Hepatitis" ->{
                recommended_labs = "• Check for Hepatitis A: HAV Panel\n" +
                        "• Check for Hepatitis B: HBV Panel\n" +
                        "• Check for Hepatitis C: HCV Panel\n" +
                        "• Rule out actinomycosis: CBC with Diff, ESR, Alkaline Phosphatase, Organism Cultures\n" +
                        "• Rule out alcoholoc liver disease: Liver Function, CBC with Diff, Liver Biopsy, Utrasound, CT Scan, MRI\n" +
                        "• Rule out alpha-1-antitrypsin deficiency: A1AT\n" +
                        "• Rule out amebiasis: CT and MRI of Liver\n" +
                        "• Rule out ascariasis: Stool Ova and Parasite, Abdomenal X-Ray, CBC with Diff\n" +
                        "• Rule out autoimmune hepatitis: ANA, SMA, Anti-LKM, Liver Biopsy\n" +
                        "• Rule out Budd-Chiari Syndrome: Prothrombin, Liver Biopsy, Utrasound, CT, MRI, Hepatic Venography\n" +
                        "• Rule out clonorchiasis: Hybridoma Cell Agglutination, ELISA\n" +
                        "• Rule out cirrhosis: Liver Panel, CBC with Diff, Liver Function, Prothrombin, Liver Biopsy\n" +
                        "• Rule out Crigler-Najjar Syndrome: Bilirubin (Conjugated and Unconjugated), Transferase, Liver Panel\n" +
                        "• Rule out cytomegalovirus: CMV Antibodies IgM and IgG\n" +
                        "• Rule out Dubin-Johnson Syndrome: Ratio of Urinary Coproporphyrin I to Coproporphyrin III, Liver Function, Prothrombin, Hepato-Biliary Scan using Radiopharmaceutical Dyes\n" +
                        "• Rule out echinococcosis: Hydatid Antigen Detection, Indirect Hemagglutination for Echinococcus Antibodies, Indirect Florescent Antibody, ELISA\n" +
                        "• Rule out Epstein Barr: EBV Capsid\n" +
                        "• Rule out fascioliasis: Eggs in Stool, Hemagglutination for Fasciolia Antibodies\n" +
                        "• Rule out fatty liver (steatosis): CT Scan, MRI, Liver Biopsy\n" +
                        "• Rule out Gilbert Syndrome: CBC with Diff, Lactate Dehydrogenase, Liver Function\n" +
                        "• Rule out glycogen storage disease: Creatine Kinase, Fasting Glucose, Urinalysis, Liver Function, Biochemical Assay of Enzyme Activity\n" +
                        "• Rule out hemochromatosis: Hemochromatosis DNA\n" +
                        "• Rule out histoplasmosis and other fungal infections: Culture, Antigen RIA, Histoplasmosis Antibody\n" +
                        "• Rule out Kala-azar: Direct Agglutination\n" +
                        "• Rule out leptosporosis: Indirect Hemagglutination for Leptosporosus Antibody, Cultures of Blood and Urine and CSF, Microscopic Agglutination Test\n" +
                        "• Rule out liver cancer: Alpha Feta Protein\n" +
                        "• Rule out malaria: OptiMAL Assay, NOW Malaria\n" +
                        "• Rule out primary biliary cirrhosis: Liver Function, Ultrasound, Anti-Mitochondrial Antibody, Liver Biopsy\n" +
                        "• Rule out pyrogenic abcess: Blood Culture, Liver Function, CBC with Diff, Abdomenal CT Scan, Liver Biopsy, Ultrasound\n" +
                        "• Rule out sarcoidosis: Kveim, CBC wtih Diff, Serum Calcium, 24-hour Urine Calcium, ACE Level\n" +
                        "• Rule out schistosomiasis: Schistosome Eggs in Urine and/or Stool, CBS with Diff, Schistosomiasis Antibody\n" +
                        "• Rule out sclerosing cholangitis: Cholangiography, Endoscopic Retrograde Cholangiopancreatography\n" +
                        "• Rule out syphilis: VDRL, Darkfield Microscopy, RPR, MHA-TP\n" +
                        "• Rule out toxocarasis: ELISA Anti-TES-Ag, IgG and IgE\n" +
                        "• Rule out toxoplasmosis: Toxoplasmosis Blood Antibody\n" +
                        "• Rule out tuberculosis: PPD Skin, QuantiFERON-TB\n" +
                        "• Rule out ulcerative colitis, Crohns Disease: Colonoscopy with Biopsy\n" +
                        "• Rule out Wilson Disease: Ceruloplasmin, Presence of Kayser-Fleischer Rings, Urinary Copper Excretion rate, Hepatic Copper Concentration using Radiolabelled Copper\n" +
                        "• Rule out yellow fever: CBC with Diff, IgM ELISA, Polymerase Chain Reaction\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Herpes Simplex" ->{
                recommended_labs = "• Check for herpes: Skin Culture\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out benign vulvar lesions (Lipschutz's): Skin Swab, Biopsy, Woodlamp Exam\n" +
                        "• Rule out chronic aphthae: Exclude Systemic Disorders with CBC and Chemistry Panel\n" +
                        "• Rule out Fifth Disease: CBC with Diff, Parvovirus\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out psoriasis: Skin Biopsy\n" +
                        "• Rule out small-vessicle impetigo: Skin Culture\n" +
                        "• Rule out syphilis: VDRL, Darkfield Microscopy, RPR, MHA-TP\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "• Rule out tinea infection: Skin Culture using KOH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "High Blood Pressure" ->{
                recommended_labs = "• Check for hypertension: Sphygmomanometry\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "High Cholesterol" ->{
                recommended_labs = "• Check for Hypercholesterolemia: Lipid Panel, Apolipoprotein A1, Apolipoprotein B, Cardio CRP, Homocysteine\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "HIV" ->{
                recommended_labs = "• Check for HIV: ELISA, Western Blot\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Hyperactivity" ->{
                recommended_labs = "• Rule out food allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out thyroid problems: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Hypercholesterolemia" ->{
                recommended_labs = "• Check for Hypercholesterolemia: Lipid Panel, Apolipoprotein A1, Apolipoprotein B, Cardio CRP, Homocysteine\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Hypertension" ->{
                recommended_labs = "• Check for hypertension: Sphygmomanometry\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Hypothyroid" ->{
                recommended_labs = "• Check for hypothyroidism: Thyroid Panel with TSH, Basal Body Temperature\n" +
                        "• Rule out Addison Disease: Rapid ACTH Stimulation\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out amenorrhea, anovulation, dysmennorhea: Serum Prolaction FSH/LH Estradiol\n" +
                        "• Rule out anemia: CBC with Diff\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out chronic fatigue syndrome (CFIDS): ESR, Adrenal Function, Liver Function, Coxsackie Virus B Titer, HHV6 Titer, C. pneumoniae Titer\n" +
                        "• Rule out Cushing's Disease: Dexamethasone Suppression\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out hypercholesterolemia: Homozygous and Heterozygous FH, Lipid Panel\n" +
                        "• Rule out hypoalbuminemia: Chemistry Panel, CRP, Fecal Fat Studies, Serum Protein Electrophoresis\n" +
                        "• Rule out hypochondriasis: Health Anxiety Inventory, Illness Attitude Scale, Whitely Index of Hypochondriasis\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "IBS" ->{
                recommended_labs = "• Check for irritable bowel syndrome: CBC with Diff, ESR, CRP, Colonoscopy with Biopsy\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out celiac disease: Celiac Panel\n" +
                        "• Rule out parasites: Stool Analysis\n" +
                        "• Rule out stricture, cancer, anal fissure, proctitis: Colonoscopy, Colon Biopsis, Defecating Protogram, Anal and Abdominal Ultrasound, Scintigraphy, Colonic Motility, Hydrogen Breath\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Impotence" ->{
                recommended_labs = "• Check for impotence: CIS (Combined Injection and Stimulation), Duplex/Color Ultrasound, Cavernosography\n" +
                        "• Rule out alcoholism: History, Liver panel\n" +
                        "• Rule out atherosclerosis: Lipid Panel, Apolipoprotein A1, Apolipoprotein B, Cardio CRP, Homocysteine\n" +
                        "• Rule out complications of rectal and prostate surgery: History\n" +
                        "• Rule out congenital deformity: CT Scan, Ultrasound\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out drug-induced impotence: History, Blood Chemistry\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out hypergonadotropic hypogonadism: Blood Testosterone Levels\n" +
                        "• Rule out hyperprolactinemia: Fasting Blood Prolactin Levels, MRI\n" +
                        "• Rule out hypertension: sphygmomanometry\n" +
                        "• Rule out long distance biking: History\n" +
                        "• Rule out multiple sclerosis: MRI\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pelvic injury: History, Ultrasound, CT Scan, X-Ray\n" +
                        "• Rule out scleroderma: ANA with Reflex\n" +
                        "• Rule out spinal trauma: History, X-Ray\n" +
                        "• Rule out straddle injury: History\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Incontinence, Stress" ->{
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out BPH: Ultrasound, Rectal Exam\n" +
                        "• Rule out complications of rectal and prostate surgery: History, CT Scan, MRI\n" +
                        "• Rule out congenital deformity: CT Scan, Ultrasound\n" +
                        "• Rule out detrusor myopathy: Urodynamic Studies, Cystouroethroscopy\n" +
                        "• Rule out detrusor neuropathy: Cystometrography\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out ectopic ureter: Ultrasound, IVP\n" +
                        "• Rule out fistulas: Excretory Urogram\n" +
                        "• Rule out herniated lumbar disc: MRI\n" +
                        "• Rule out herpes: Skin Culture\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pelvic injury: History, Ultrasound, CT Scan, X-Ray\n" +
                        "• Rule out urethral hypermobility secondary to poor anatomic pelvic support: Urodynamic Studies, Cystouroethroscopy\n" +
                        "• Rule out urethral strictures: Retrograde Urethrography\n" +
                        "• Rule out urethral surgery: History\n" +
                        "• Rule out vesical neck contracture: Cystography\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Infertility" ->{
                recommended_labs = "• Rule out anemia: CBC with Diff\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out cancer: CA125, Ultrasound\n" +
                        "• Rule out endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out hormonal imbalance: Fractionated Estrogens and Progesterone, FSH, LH\n" +
                        "• Rule out pelvic infections: PAP Smear, Vaginal Wet Mount, Cervical Cultures, RPR\n" +
                        "• Rule out pernicious anemia: Schilling\n" +
                        "• Rule out structural pathology: Ultrasound, Laparoscopy\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Insomnia" ->{
                recommended_labs = "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out Addison Disease: Rapid ACTH Stimulation\n" +
                        "• Rule out anorexia: History\n" +
                        "• Rule out asthma: Pulmonary Function, Sputum for Eosinophils\n" +
                        "• Rule out bipolar disease (manic phase): History, Self Assessment for Bipolar Disorder\n" +
                        "• Rule out COPD: Arterial Blood Gases\n" +
                        "• Rule out Cushing's Disease: Dexamethasone Suppression\n" +
                        "• Rule out depression: History\n" +
                        "• Rule out headache: History\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out Parkinsons Disease: PET Scan, SPECT\n" +
                        "• Rule out prescription medications: History, Drug Reference Information Analysis\n" +
                        "• Rule out post-traumatic stress disorder: History\n" +
                        "• Rule out restless leg syndrome: History\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out schizophrenia: History\n" +
                        "• Rule out substance abuse: History, Drug Screen, Blood Chemistry\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Irritable Bowel Syndrome" ->{
                recommended_labs = "• Check for irritable bowel syndrome: CBC with Diff, ESR, CRP, Colonoscopy with Biopsy\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out celiac disease: Celiac Panel\n" +
                        "• Rule out parasites: Stool Analysis\n" +
                        "• Rule out stricture, cancer, anal fissure, proctitis: Colonoscopy, Colon Biopsis, Defecating Protogram, Anal and Abdominal Ultrasound, Scintigraphy, Colonic Motility, Hydrogen Breath\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Longevity" ->{
                recommended_labs = "• "
                ss = SpannableString(recommended_labs)
            }
            "Lupus" ->{
                recommended_labs = "• Check for systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "• Rule out acute lymphoblastic leukemia: Hematologist Exam of CBC, Prothrombin Time, Activated Partial Thromboblastin Time, Fibrinogen, Immunophenotyping, Cytogenic and Molecular Diagnosis\n" +
                        "• Rule out acute poststreptococcal glomerulonephritits: Urinalysis, Streptozyme, Blood Chemistry\n" +
                        "• Rule out adrenal insufficiency: Serum ACTH/Cortisol/Aldosterone, Plasma Renin, 24-Hour Urinalysis\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out amenorrhea: History, Hormone Panel, Thyroid Panel with TSH, hCG\n" +
                        "• Rule out anemia: Blood Chemistry, Iron Deficiency Panel\n" +
                        "• Rule out autoimmune and chronic benign neutropenia: Bone Marrow Exam\n" +
                        "• Rule out autoimmune hepatitis: SMAs, CBC with Diff, Liver Panel, Blood Chemistry\n" +
                        "• Rule out chronic fatigue syndrome: ESR, Adrenal Function, Liver Function, Coxsackie Virus B Titer, HHV6 Titer, C. pneumoniae Titer\n" +
                        "• Rule out erythema infectiosum (Fifth Disease): CBC with Diff, Parvovirus B19 Antibody\n" +
                        "• Rule out fibromyalgia: History, CRP, ANA\n" +
                        "• Rule out Goodpasture's Syndrome: Urinalysis, CBC with Diff, Renal Function, Anti-GBM Titers, Renal Biopsy\n" +
                        "• Rule out hematuria: Urinalysis with Culture, Renal Profile, ASO Levels\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out nephrotic syndrome: Urinalysis, CBC with Diff, Renal Function, Anti-GBM Titers, Renal Biopsy\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out other autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out pericarditis, viral: CBC with Diff, Blood Chemistry, Nasopharangeal Aspirate and Stool for Virus Isolation, Blood Culture, Chest X-Ray, Echocardiogram\n" +
                        "• Rule out pleural effusion: Pleural Fluid Analysis, Chest X-Ray\n" +
                        "• Rule out polyarteritis nodosa: CBC with Diff, ESR, CRP, 24-Hour Urine, Creatine Phosphokinase\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out pyelonephritis: Urinalysis, CBC with Diff, Renal Function, Urine Culture, Renal Ultrasound\n" +
                        "• Rule out rheumatic fever: CRP, Heart-Reactive Antibodies D8/17, Chest X-Ray, Echocardiogram\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out serum sickness: CBC with Diff, ESR, Urinalysis, Renal Panel, Quantitative Immunoglobulins\n" +
                        "• Rule out system sclerosis: CBC with Diff, Urinalysis, Blood Chemistry, ESR, ANA with Reflex, Quantitative Immunoglobulins\n" +
                        "• Rule out thyroid disorders: Thyroid Panel with TSH, Anti-TPO, Thyroid Scan with Radioactive Iodine Uptake\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Macular Degeneration" ->{
                recommended_labs = "• Check for macular degeneration: Visual Acuity, Ophthalmic Exam, Photograph of Retina\n" +
                        "• Rule out cataract: Visual Acuity, Pupil Dilation, Tonometry\n" +
                        "• Rule out corneal dystrophies: Ophthalmic Exam, Visual Acuity, Pupil Dilation\n" +
                        "• Rule out diabetic lens: Visual Acuity, Eye Exam, Urinalysis, Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out glaucoma: Visual Acuity, Pupil Dilation, Tonometry, Air Puff, Glaucoma, Gonioscopy, Endocyanine Green Eye Dye\n" +
                        "• Rule out macular hole: Visual Acuity, Ophthalmic Exam, Pupil Dilation\n" +
                        "• Rule out ocular histoplasmosis syndrome: Eye Exam for Histo Spots, Amsler Grid, Pupil Dilation, Fluorescein Angiography\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Manic Depressive Disorder" ->{
                recommended_labs = "• Check for bipolar disorder: History, Physical Exam, Self Assessment for Bipolar Disorder\n" +
                        "• Rule out brain tumor: PET Scan, MRI\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Mastitis" ->{
                recommended_labs = "• Check for mastitis: Physical Exam, Milk Culture, CBC with Diff\n" +
                        "• Rule out abscess: Ultrasound, CBC with Diff, Fine Needle Aspiration Biopsy and Culture\n" +
                        "• Rule out adenosis: Fine Needle Aspiration Biopsy\n" +
                        "• Rule out breast cancer: X-Ray, Biopsy\n" +
                        "• Rule out cysts: Aspiration Biopsy\n" +
                        "• Rule out duct ectasia: Biopsy\n" +
                        "• Rule out fibroadenoma: Biopsy\n" +
                        "• Rule out galactocoele: Milk Culture\n" +
                        "• Rule out generalized dermatitis: History, Physical Exam\n" +
                        "• Rule out lymphoma: Peripheral Blood Smear, CBC with Diff, Lymph Node or Bone Marrow Biopsy\n" +
                        "• Rule out neurofibroma: X-Ray, Ultrasound, MRI, Biopsy\n" +
                        "• Rule out Pagets Disease: X-Ray, Ultrasound, Biopsy, Scrape Cytology\n" +
                        "• Rule out tuberculosis: PPD Skin, QuantiFERON-TB\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Memory Loss" ->{
                recommended_labs = "• Rule out Alzheimer's Disease: LYMPro, PET Scan, EEG\n" +
                        "• Rule out anemia: CBS with Diff, Iron Deficiency Panel\n" +
                        "• Rule out drug toxicity: History, Drug Screen, Drug Reference Information Analysis\n" +
                        "• Rule out electrolyte imbalance: Blood Chemistry Panel, Electrolyte Panel\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out hormonal insufficiency: Hormone Panel\n" +
                        "• Rule out hypoglycemia: Oral Glucose Tolerance\n" +
                        "• Rule out hypothyroidism: Thyroid Panel with TSH\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out meningitis and encephalitis: Lumbar Puncture\n" +
                        "• Rule out menopause: FSH, LH\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out stroke: Non-Contrast CT Scan, EEG, CBC with Diff, Coagulation Profile, Electrolyte Panel, Serum Glucose\n" +
                        "• Rule out syphilis: VDRL, Darkfield Microscopy, RPR, MHA-TP\n" +
                        "• Rule out Vitamin B-12 deficiency: Microbial Assy Serum B-12\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Menopause" ->{
                recommended_labs = "• Check for menopause: FSH, LH\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out hypothyroidism: Thyroid Panel with TSH\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pituitary insufficiency: Hormone Panel, MRI\n" +
                        "• Rule out polycystic ovarian disease: Ultrasound\n" +
                        "• Rule out uterine/endometrial polyps or malignancy or Asherman's Syndrome: Laparoscopy, Ultrasound, CT Scan, MRI\n" +
                        "• Rule out uterine fibroids: Ultrasound\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Migraine Headache" ->{
                recommended_labs = "• Check for migraine: MIDAS\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out brain tumor and other malignancies: PET Scan, MRI\n" +
                        "• Rule out congestive heart failure: ECG, Exercise Stress, B-Type Natriuretic Peptide, Multiple-Gated Acqusition Scanning, Angiogram\n" +
                        "• Rule out dental disorders: Dental Exam\n" +
                        "• Rule out diabetic acidosis: Oral Glucose Tolerance, Urine Ketone Dip\n" +
                        "• Rule out drug side effects: Drug Reference Information Analysis\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out herpes zoster: Viral Culture of Skin Lesion, Tzanck, CBC with Diff\n" +
                        "• Rule out hyperparathyroidism: PTH\n" +
                        "• Rule out hypertension: Sphygomanometry\n" +
                        "• Rule out ocular disorders: Ophthalmic Exam\n" +
                        "• Rule out osteomyelitis: MRI, Bone Scan, X-Ray, CBC with Diff\n" +
                        "• Rule out otitis media: Otoscopic Exam\n" +
                        "• Rule out rheumatoid arthritis: Latex, ESR\n" +
                        "• Rule out sinusitis: Nasopharyngeal Culture, Paranasal Sinus X-Ray, Ultrasound, CT Scan, MRI, Illumination, Percussion\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "• Rule out TMJ syndrome: Physical Exam\n" +
                        "• Rule out tuberculosis: PPD Skin\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Mouth Ulcers" ->{
                recommended_labs = "• Rule out food allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "• Rule out pancreatic insufficiency: Lipase, Amylase\n" +
                        "• Rule out stomach acid problems: Heidelberg\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Multiple Sclerosis" ->{
                recommended_labs = "• Check for multiple sclerosis: Ophthalmic Exam, MRI of Head and Spine with Gadolinium, CBC with Diff, Serum Glucose and Electrolytes, Urinalysis and Microscopy, CT Scan with Contrast\n" +
                        "• Rule out amyotrophic lateral sclerosis (ALS): Electromyography\n" +
                        "• Rule out Bell's Palsy: CBC with Diff, ESR, CT Scan of Face\n" +
                        "• Rule out brain abscess: MRI, CT Scan\n" +
                        "• Rule out Guillain-Barre Syndrome: Liver Function, Spinal Fluid Analysis, MRI with Gadolinium\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out lumbar disc disorders: X-Ray, MRI, CT Scan, Scintigraphy\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out neck trauma: X-Ray, MRI, CT Scan\n" +
                        "• Rule out sarcoidosis: CBC with Diff, 24-Hour Urine, Creatine Kinase, CK-MB Levels, ANA, X-Ray\n" +
                        "• Rule out spinal cord infections: CSF Culture\n" +
                        "• Rule out spinal cord injuries: CBC with Diff, Urinalysis, X-Ray, MRI, CT Scan\n" +
                        "• Rule out stroke: Non-Contrast CT Scan, EEG, CBC with Diff, Coagulation Profile, Electrolyte Panel, Serum Glucose\n" +
                        "• Rule out subdural hematoma: Non-Contrast CT Scan, EEG, CBC with Diff, Coagulation Profile, Electrolyte Panel, Serum Glucose\n" +
                        "• Rule out syphilis: VDRL, Darkfield Microscopy, RPR, MHA-TP\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "• Rule out transient ischemic attack (TIA): Blood Chemistry, Coagulation Profile, ESR, Non-Contrast CT Scan, MRI, MRA\n" +
                        "• Rule out trigeminal neuralgia: History, MRI\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Obesity" ->{
                recommended_labs = "• Rule out Cushing's Disease: Dexamethasone Suppression\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out drug toxicity: History, Drug Screen, Drug Reference Information Analysis\n" +
                        "• Rule out hypothyroidism: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Osteoarthritis" ->{
                recommended_labs = "• Check for osteoarthritis: X-Ray\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out degenerative joint disease: X-Ray\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out gout: Gout, Uric Acid\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Osteoporosis" ->{
                recommended_labs = "• Check for osteoporosis: Bone Density, Bone Scan, SPECT Scan, MRI, DEXA, DPA, SPA, QCT\n" +
                        "• Rule out alcoholism: History, Liver Panel\n" +
                        "• Rule out amyloidosis: Scintigraphy, Tissue Biopsy\n" +
                        "• Rule out anorexia nervosa: History\n" +
                        "• Rule out Cushing's Disease: Dexamethasone Suppression\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out drug toxicity: History, Drug Screen, Drug Reference Information Analysis\n" +
                        "• Rule out estrogen deficiency: Hormone Panel\n" +
                        "• Rule out hyperparathyroidism: PTH\n" +
                        "• Rule out hyperthyroidism: Thyroid Panel with TSH\n" +
                        "• Rule out hypogonadism: Physical Exam, Saliva, Hormone Panel, Pelvic Ultrasound (for women)\n" +
                        "• Rule out leukemia: CBC with Diff, Blood Chemistry, Blood Coaggulation Study, Blood Morphology Stain, Bone Marrow Aspiration\n" +
                        "• Rule out lymphoma: CBC with Diff, Blood Chemistry, Biopsy, X-Ray, CT Scan, MRI, Lymphangiogram, Gallium Scan\n" +
                        "• Rule out malnutrition: History, Blood Chemistry\n" +
                        "• Rule out myeloma: CBC with Diff, Blood Chemistry, Immunoglobulin Levels, Serum Protein Electrophoresis, Urine Protein Electrophoresis, 24_Hour Urine for Bence-Jones\n" +
                        "• Rule out pregnancy: HcG\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Otitis Media" ->{
                recommended_labs = "• Check for otitis media: Full Sepsis Workup (Infants Younger than 12 Weeks), Tympanometry, Acoustic Reflectometry\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out Apert Syndrome: X-Ray, CT Scan, MRI, Hearing Assessment\n" +
                        "• Rule out bacteremia: CBC with Diff with Absolute Neurophil and Band Count, CSR, CRP, Urinalysis, Blood Culture\n" +
                        "• Rule out cholesteatoma: Complete Ototscopic Exam, Peoperative CT Scan\n" +
                        "• Rule out colic: History\n" +
                        "• Rule out gastroenteritis: Fecal Leukocytes, Gram Stain of Stool\n" +
                        "• Rule out gastroestrophageal reflux: Upper GI Series, Gastric Scintiscan, Manometry, Esophagogastroduodenoscopy\n" +
                        "• Rule out haemophilus influenzae infection: Culture of CSF/Synovial/Pleural/Paracardial Fluids\n" +
                        "• Rule out head trauma: History\n" +
                        "• Rule out hearing impairment: Hearing Assessment, Complete Otoscopic Exam\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out mastoiditis: Culture of Ear/Blood/Mastoid/Abscess, CBC, ESR, CT Scan\n" +
                        "• Rule out meningitis, bacterial: Lumbar Puncture and Culture of CSF\n" +
                        "• Rule out nasal polyps: Nasal Exam, MRI, CT Scan\n" +
                        "• Rule out nasopharyngeal cancer: CBC with Diff, Blood Chemistry, EBV Capsid IgG and IgM, CT Scan, Biopsy\n" +
                        "• Rule out otitis externa: Culture\n" +
                        "• Rule out otosclerosis: Halo Sign on Fine-Cut Ct Scan, Audiogram\n" +
                        "• Rule out parainfluenza virus infections: Sputum Culture, CBC with Diff\n" +
                        "• Rule out passive smoking and lung disease: History\n" +
                        "• Rule out pharyngitis: Throat Culture\n" +
                        "• Rule out pneumococcal infections: CBC with Diff, Gram Stain, Sputum and Throat Culture\n" +
                        "• Rule out primary ciliary dyskinesia: Direct Video Cinematography, Oscillography\n" +
                        "• Rule out respiratory syncytial virus infection: Sputum Culture, CBC with Diff, Chest X-Ray, Oxygen Saturation\n" +
                        "• Rule out rhinovirus infection: CBC with Diff, Nasopharyngeal Culture\n" +
                        "• Rule out sinusitis: Nasopharyngeal Culture, Paranasal Sinus X-Ray, Ultrasound, CT Scan, MRI, Illumination, Percussion\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Ovarian Cancer" ->{
                recommended_labs = "• Recto-vaginal examination\n" +
                        "• CA 125 - elevated in 80-85% of patients with serous epithelial cancer and in a lower percentage in other ovarian cancers\n" +
                        "• Color-and-pulsed-Doppler - look for lack of detectable color flow (which is negative for ovarian cancer)\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Painful Menses" ->{
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out appendicitis: CBC with Diff\n" +
                        "• Rule out cancer: CA125, Ultrasound\n" +
                        "• Rule out endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out GI pathology: Upper GI Series\n" +
                        "• Rule out pelvic infections: PAP Smear, Vaginal Wet Mount, Cervical Cultures, RPR\n" +
                        "• Rule out pregnancy: hCG\n" +
                        "• Rule out renal pathology: Ultrasound\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Paralysis Agitans" ->{
                recommended_labs = "• Check for Parkinson's Disease: History, Physical Exam\n" +
                        "• Rule out basal ganglia tumor: Non-Contrast CT Scan, EEG, MRI, Biopsy\n" +
                        "• Rule out Creutzfeldt-Jakob Disease: Brain Biopsy, EEG, MRI, CSF Panel\n" +
                        "• Rule out drug toxicity: History, Drug Screen, Drug Reference Information Analysis\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out hypoparathyroidism: PTH\n" +
                        "• Rule out hypothyroidism: Thyroid Panel with TSH\n" +
                        "• Rule out multiple strokes: Non-Contrast CT Scan, EEG, CBC with Diff, Coagulation Profile, Electrolyte Panel, Serum Glucose\n" +
                        "• Rule out normal pressure hydrocephalus: CT Scan/MRI with Distinguishing Features of NPH\n" +
                        "• Rule out Olivopontocerebellar Atrophy: MRI of Brain\n" +
                        "• Rule out postencephalitic PD: History, Physical Exam\n" +
                        "• Rule out post-traumatic brain injury PD: History, Physical Exam\n" +
                        "• Rule out progressive superanuclear palsy: MRI, PET Scan, SPECT Scan, Sleep Studies\n" +
                        "• Rule out Shy-Drager Syndrome: Blood Levels of Norepinephrine, Valsalva Maneuver, Electromyogram, Tilt Table, Barium Swallow\n" +
                        "• Rule out structural PD: CT Scan, MRI\n" +
                        "• Rule out subdural hematoma: Non-Contrast CT Scan, EEG, CBC with Diff, Coagulation Profile, Electrolyte Panel, Serum Glucose\n" +
                        "• Rule out vascular PD: CT Scan, MRI\n" +
                        "• Rule out Wilson Disease: Ceruloplasmin, Presence of Kayser-Fleischer Rings, Urinary Copper Excretion rate, Hepatic Copper Concentration using Radiolabelled Copper, CT Scan of Head, MRI of Brain\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Parkinson's Disease" ->{
                recommended_labs = "• Check for Parkinson's Disease: History, Physical Exam\n" +
                        "• Rule out basal ganglia tumor: Non-Contrast CT Scan, EEG, MRI, Biopsy\n" +
                        "• Rule out Creutzfeldt-Jakob Disease: Brain Biopsy, EEG, MRI, CSF Panel\n" +
                        "• Rule out drug toxicity: History, Drug Screen, Drug Reference Information Analysis\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out hypoparathyroidism: PTH\n" +
                        "• Rule out hypothyroidism: Thyroid Panel with TSH\n" +
                        "• Rule out multiple strokes: Non-Contrast CT Scan, EEG, CBC with Diff, Coagulation Profile, Electrolyte Panel, Serum Glucose\n" +
                        "• Rule out normal pressure hydrocephalus: CT Scan/MRI with Distinguishing Features of NPH\n" +
                        "• Rule out Olivopontocerebellar Atrophy: MRI of Brain\n" +
                        "• Rule out postencephalitic PD: History, Physical Exam\n" +
                        "• Rule out post-traumatic brain injury PD: History, Physical Exam\n" +
                        "• Rule out progressive superanuclear palsy: MRI, PET Scan, SPECT Scan, Sleep Studies\n" +
                        "• Rule out Shy-Drager Syndrome: Blood Levels of Norepinephrine, Valsalva Maneuver, Electromyogram, Tilt Table, Barium Swallow\n" +
                        "• Rule out structural PD: CT Scan, MRI\n" +
                        "• Rule out subdural hematoma: Non-Contrast CT Scan, EEG, CBC with Diff, Coagulation Profile, Electrolyte Panel, Serum Glucose\n" +
                        "• Rule out vascular PD: CT Scan, MRI\n" +
                        "• Rule out Wilson Disease: Ceruloplasmin, Presence of Kayser-Fleischer Rings, Urinary Copper Excretion rate, Hepatic Copper Concentration using Radiolabelled Copper, CT Scan of Head, MRI of Brain\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Peptic Ulcers" ->{
                recommended_labs = "• Check for peptic ulcer: Endoscopy, Upper GI Series\n" +
                        "• Rule out biliary colic: Liver Panel, Abdomenal Ultrasound, Hepatobiliary Scintography\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out chronic gastritis: Endoscopy with Biopsy\n" +
                        "• Rule out gall bladder disease (cholecystitis): Ultrasound, Palpation, Nuclear Medicine Scanning, Hepatobiliary Scintography, Blood Chemistry\n" +
                        "• Rule out gallstones (cholelithiasis): Ultrasound, Cholecystography, Blood Chemistry, CBC with Diff, Upright/Supine Abdomenal X-Ray\n" +
                        "• Rule out gastroesophageal reflux: Upper GI Series, Gastric Scintiscan, Manometry, Esophagogastroduodenoscopy\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "• Rule out hiatal hernia: Barium X-Ray, Endoscopy\n" +
                        "• Rule out mesenteric artery ischemia: Prothrombin Time, CBC with Diff, Blood Chemistry, Chest X-Ray, CT Scan, Biplane Aortography, Arteriography\n" +
                        "• Rule out myocardial ischemia: Blood Chemistry, Serum Cardiac Markers, CRP, B-Type Naturietic Peptide, Echocardiogram, Nuclearcardio Techniques\n" +
                        "• Rule out pancreatic cancer: CA19-9, CEA, CT Scan, Endoscopic Ultrasonography, MRI\n" +
                        "• Rule out pancreatitis: Amylase, Lipase, Trypsin, Blood Chemistry, CRP, CBC, Comprehensive Metabolic Panel, Arterial Blood Gases, Abdominal CT Scan,Abdominal Ultrasound, Endoscopic Ultrasonography\n" +
                        "• Rule out recurrent pyogenic cholangitis: CBC, Liver Function, Prothrombin Time, Blood Cultures, Ova and Parasites, MRCP\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "PMS" ->{
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out appendicitis: CBC with Diff\n" +
                        "• Rule out cancer: CA125, Ultrasound\n" +
                        "• Rule out endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out GI pathology: Upper GI Series\n" +
                        "• Rule out pelvic infections: PAP Smear, Vaginal Wet Mount, Cervical Cultures, RPR\n" +
                        "• Rule out polycystic ovarian disease: Ultrasound\n" +
                        "• Rule out pregnancy: hCG\n" +
                        "• Rule out renal pathology: Ultrasound\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "• Rule out uterine/endometrial polyps or malignancy or Asherman's Syndrome: Laparoscopy, Ultrasound, CT Scan, MRI\n" +
                        "• Rule out uterine fibroids: Ultrasound\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Premenstrual Syndrome" ->{
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out appendicitis: CBC with Diff\n" +
                        "• Rule out cancer: CA125, Ultrasound\n" +
                        "• Rule out endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out GI pathology: Upper GI Series\n" +
                        "• Rule out pelvic infections: PAP Smear, Vaginal Wet Mount, Cervical Cultures, RPR\n" +
                        "• Rule out polycystic ovarian disease: Ultrasound\n" +
                        "• Rule out pregnancy: hCG\n" +
                        "• Rule out renal pathology: Ultrasound\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "• Rule out uterine/endometrial polyps or malignancy or Asherman's Syndrome: Laparoscopy, Ultrasound, CT Scan, MRI\n" +
                        "• Rule out uterine fibroids: Ultrasound\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Psoriasis" ->{
                recommended_labs = "• Check for psoriasis: Skin Biopsy\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out Fifth Disease: CBC with Diff, Parvovirus\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out herpes: Skin Culture\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out impetigo: Skin Culture\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "• Rule out tinea infection: Skin Culture using KOH\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Psoriatic Arthritis" ->{
                recommended_labs = "• Check for psoriatic arthritis: ANA, Rheumatoid Factor, Skin Biopsy\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out degenerative joint disease: X-Ray\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out gout: Gout, Uric Acid\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out psoriasis: Skin Biopsy\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Regional Enteritis" ->{
                recommended_labs = "• Check for Crohn's Disease: CBC with Diff, ESR, CRP, Colonoscopy with Biopsy, Upper GI Series\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out celiac disease: Celiac Panel\n" +
                        "• Rule out parasites: Stool Analysis\n" +
                        "• Rule out stricture, cancer, anal fissure, proctitis: Colonoscopy, Colon Biopsis, Defecating Protogram, Anal and Abdominal Ultrasound, Scintigraphy, Colonic Motility, Hydrogen Breath\n" +
                        "• Rule out ulcerative colitis: Colonoscopy, Sigmoidoscopy with Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Rheumatoid Arthritis" ->{
                recommended_labs = "• Check for rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out degenerative joint disease: X-Ray\n" +
                        "• Rule out Epstein Barr infection: EBV Capsid IgG and IgM\n" +
                        "• Rule out gout: Gout, Uric Acid\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Rosacea" ->{
                recommended_labs = "• Rule out acne: Physical Exam, History\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out corticord damage: Drug History\n" +
                        "• Rule out dermatomyositis: Electromyogram, Creatine Kinase, ANA, Skin Biopsy\n" +
                        "• Rule out erythema infectiosum (Fifth Disease): CBC with Diff, Parvovirus B19 Antibody\n" +
                        "• Rule out gram-negative folliculitis: Skin Biopsy with Culture\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "• Rule out perioral dermatitis: Skin Biopsy with Culture\n" +
                        "• Rule out rhinophyma: Physical Exam\n" +
                        "• Rule out rubiosus diabeticorum: Diabetic History\n" +
                        "• Rule out seborrheic dermatitis: Physical Exam, History\n" +
                        "• Rule out sterile eosinphilic pustulosis: Skin Culture and Microiscopy\n" +
                        "• Rule out subacute cutaneous systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Schizophrenia" ->{
                recommended_labs = "• Rule out bipolar disorder: History, Physical Exam, Self Assessment for Bipolar Disorder\n" +
                        "• Rule out brain tumor: PET Scan, MRI\n" +
                        "• Rule out brief psychotic disorder: History, Physical Exam\n" +
                        "• Rule out delirium: History, Physical Exam\n" +
                        "• Rule out drugs of abuse: History, Drug Screen\n" +
                        "• Rule out encephalitis: Lumbar Puncture with CSF Culture\n" +
                        "• Rule out frontal brain disorder: History, Physical Exam, PET Scan, MRI\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out post-traumatic stress disorder: History, Physical Exam\n" +
                        "• Rule out obsessive compulsive disorder: History, Physical Exam\n" +
                        "• Rule out schizoaffective disorder: History, Physical Exam\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "SLE" ->{
                recommended_labs = "• Check for systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "• Rule out acute lymphoblastic leukemia: Hematologist Exam of CBC, Prothrombin Time, Activated Partial Thromboblastin Time, Fibrinogen, Immunophenotyping, Cytogenic and Molecular Diagnosis\n" +
                        "• Rule out acute poststreptococcal glomerulonephritits: Urinalysis, Streptozyme, Blood Chemistry\n" +
                        "• Rule out adrenal insufficiency: Serum ACTH/Cortisol/Aldosterone, Plasma Renin, 24-Hour Urinalysis\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out amenorrhea: History, Hormone Panel, Thyroid Panel with TSH, hCG\n" +
                        "• Rule out anemia: Blood Chemistry, Iron Deficiency Panel\n" +
                        "• Rule out autoimmune and chronic benign neutropenia: Bone Marrow Exam\n" +
                        "• Rule out autoimmune hepatitis: SMAs, CBC with Diff, Liver Panel, Blood Chemistry\n" +
                        "• Rule out chronic fatigue syndrome: ESR, Adrenal Function, Liver Function, Coxsackie Virus B Titer, HHV6 Titer, C. pneumoniae Titer\n" +
                        "• Rule out erythema infectiosum (Fifth Disease): CBC with Diff, Parvovirus B19 Antibody\n" +
                        "• Rule out fibromyalgia: History, CRP, ANA\n" +
                        "• Rule out Goodpasture's Syndrome: Urinalysis, CBC with Diff, Renal Function, Anti-GBM Titers, Renal Biopsy\n" +
                        "• Rule out hematuria: Urinalysis with Culture, Renal Profile, ASO Levels\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out nephrotic syndrome: Urinalysis, CBC with Diff, Renal Function, Anti-GBM Titers, Renal Biopsy\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out other autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out pericarditis, viral: CBC with Diff, Blood Chemistry, Nasopharangeal Aspirate and Stool for Virus Isolation, Blood Culture, Chest X-Ray, Echocardiogram\n" +
                        "• Rule out pleural effusion: Pleural Fluid Analysis, Chest X-Ray\n" +
                        "• Rule out polyarteritis nodosa: CBC with Diff, ESR, CRP, 24-Hour Urine, Creatine Phosphokinase\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out pyelonephritis: Urinalysis, CBC with Diff, Renal Function, Urine Culture, Renal Ultrasound\n" +
                        "• Rule out rheumatic fever: CRP, Heart-Reactive Antibodies D8/17, Chest X-Ray, Echocardiogram\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out serum sickness: CBC with Diff, ESR, Urinalysis, Renal Panel, Quantitative Immunoglobulins\n" +
                        "• Rule out system sclerosis: CBC with Diff, Urinalysis, Blood Chemistry, ESR, ANA with Reflex, Quantitative Immunoglobulins\n" +
                        "• Rule out thyroid disorders: Thyroid Panel with TSH, Anti-TPO, Thyroid Scan with Radioactive Iodine Uptake\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Sleep Disorder" ->{
                recommended_labs = "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out Addison Disease: Rapid ACTH Stimulation\n" +
                        "• Rule out anorexia: History\n" +
                        "• Rule out asthma: Pulmonary Function, Sputum for Eosinophils\n" +
                        "• Rule out bipolar disease (manic phase): History, Self Assessment for Bipolar Disorder\n" +
                        "• Rule out COPD: Arterial Blood Gases\n" +
                        "• Rule out Cushing's Disease: Dexamethasone Suppression\n" +
                        "• Rule out depression: History\n" +
                        "• Rule out headache: History\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out Parkinsons Disease: PET Scan, SPECT\n" +
                        "• Rule out prescription medications: History, Drug Reference Information Analysis\n" +
                        "• Rule out post-traumatic stress disorder: History\n" +
                        "• Rule out restless leg syndrome: History\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out schizophrenia: History\n" +
                        "• Rule out substance abuse: History, Drug Screen, Blood Chemistry\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Stress Incontinence" ->{
                recommended_labs = "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out BPH: Ultrasound, Rectal Exam\n" +
                        "• Rule out complications of rectal and prostate surgery: History, CT Scan, MRI\n" +
                        "• Rule out congenital deformity: CT Scan, Ultrasound\n" +
                        "• Rule out detrusor myopathy: Urodynamic Studies, Cystouroethroscopy\n" +
                        "• Rule out detrusor neuropathy: Cystometrography\n" +
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "• Rule out ectopic ureter: Ultrasound, IVP\n" +
                        "• Rule out fistulas: Excretory Urogram\n" +
                        "• Rule out herniated lumbar disc: MRI\n" +
                        "• Rule out herpes: Skin Culture\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out pelvic injury: History, Ultrasound, CT Scan, X-Ray\n" +
                        "• Rule out urethral hypermobility secondary to poor anatomic pelvic support: Urodynamic Studies, Cystouroethroscopy\n" +
                        "• Rule out urethral strictures: Retrograde Urethrography\n" +
                        "• Rule out urethral surgery: History\n" +
                        "• Rule out vesical neck contracture: Cystography\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Systemic Lupus Erythematosus" ->{
                recommended_labs = "• Check for systemic lupus erythematosus (SLE): CBC with Diff, Blood Chemistry, Urinalysis, CRP, ANA with Reflex, Quantitative Immunoglobulins, Tissue Biopsy\n" +
                        "• Rule out acute lymphoblastic leukemia: Hematologist Exam of CBC, Prothrombin Time, Activated Partial Thromboblastin Time, Fibrinogen, Immunophenotyping, Cytogenic and Molecular Diagnosis\n" +
                        "• Rule out acute poststreptococcal glomerulonephritits: Urinalysis, Streptozyme, Blood Chemistry\n" +
                        "• Rule out adrenal insufficiency: Serum ACTH/Cortisol/Aldosterone, Plasma Renin, 24-Hour Urinalysis\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out amenorrhea: History, Hormone Panel, Thyroid Panel with TSH, hCG\n" +
                        "• Rule out anemia: Blood Chemistry, Iron Deficiency Panel\n" +
                        "• Rule out autoimmune and chronic benign neutropenia: Bone Marrow Exam\n" +
                        "• Rule out autoimmune hepatitis: SMAs, CBC with Diff, Liver Panel, Blood Chemistry\n" +
                        "• Rule out chronic fatigue syndrome: ESR, Adrenal Function, Liver Function, Coxsackie Virus B Titer, HHV6 Titer, C. pneumoniae Titer\n" +
                        "• Rule out erythema infectiosum (Fifth Disease): CBC with Diff, Parvovirus B19 Antibody\n" +
                        "• Rule out fibromyalgia: History, CRP, ANA\n" +
                        "• Rule out Goodpasture's Syndrome: Urinalysis, CBC with Diff, Renal Function, Anti-GBM Titers, Renal Biopsy\n" +
                        "• Rule out hematuria: Urinalysis with Culture, Renal Profile, ASO Levels\n" +
                        "• Rule out hepatitis B and C: Hepatitis Panel\n" +
                        "• Rule out HIV: ELISA, Western Blot\n" +
                        "• Rule out infectious arthritis: Joint Fluid Culture\n" +
                        "• Rule out Lyme Disease: Western Blot\n" +
                        "• Rule out nephrotic syndrome: Urinalysis, CBC with Diff, Renal Function, Anti-GBM Titers, Renal Biopsy\n" +
                        "• Rule out occult malignancies: Antimalignant Antibody\n" +
                        "• Rule out osteoarthritis: X-Ray\n" +
                        "• Rule out other autoimmune disorders: ANA with Reflex\n" +
                        "• Rule out pericarditis, viral: CBC with Diff, Blood Chemistry, Nasopharangeal Aspirate and Stool for Virus Isolation, Blood Culture, Chest X-Ray, Echocardiogram\n" +
                        "• Rule out pleural effusion: Pleural Fluid Analysis, Chest X-Ray\n" +
                        "• Rule out polyarteritis nodosa: CBC with Diff, ESR, CRP, 24-Hour Urine, Creatine Phosphokinase\n" +
                        "• Rule out pseudogout: Joint Fluid Aspiration\n" +
                        "• Rule out pyelonephritis: Urinalysis, CBC with Diff, Renal Function, Urine Culture, Renal Ultrasound\n" +
                        "• Rule out rheumatic fever: CRP, Heart-Reactive Antibodies D8/17, Chest X-Ray, Echocardiogram\n" +
                        "• Rule out rheumatoid arthritis: ANA, Rheumatoid Factor\n" +
                        "• Rule out serum sickness: CBC with Diff, ESR, Urinalysis, Renal Panel, Quantitative Immunoglobulins\n" +
                        "• Rule out system sclerosis: CBC with Diff, Urinalysis, Blood Chemistry, ESR, ANA with Reflex, Quantitative Immunoglobulins\n" +
                        "• Rule out thyroid disorders: Thyroid Panel with TSH, Anti-TPO, Thyroid Scan with Radioactive Iodine Uptake\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies.\n" +
                        "\n"
                ss = SpannableString(recommended_labs)
            }
            "Ulcerative Colitis" ->{
                recommended_labs = "• Check for ulcerative colitis: Colonoscopy, Sigmoidoscopy with Tissue Biopsy\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out candidiasis: Candida Panel\n" +
                        "• Rule out celiac disease: Celiac Panel\n" +
                        "• Rule out Crohn's Disease: CBC with Diff, ESR, CRP, Colonoscopy with Biopsy, Upper GI Series\n" +
                        "• Rule out parasites: Stool Analysis\n" +
                        "• Rule out stricture, cancer, anal fissure, proctitis: Colonoscopy, Colon Biopsis, Defecating Protogram, Anal and Abdominal Ultrasound, Scintigraphy, Colonic Motility, Hydrogen Breath\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Uterine Fibroids" ->{
                recommended_labs = "• Check for uterine fibroids: Ultrasound\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody\n" +
                        "• Rule out appendicitis: CBC with Diff\n" +
                        "• Rule out cancer: CA125, Ultrasound\n" +
                        "• Rule out endometriosis: Ultrasound, MRI, Laparoscopy with Biopsy\n" +
                        "• Rule out GI pathology: Upper GI Series\n" +
                        "• Rule out heavy metal poisoning: Hair Analysis\n" +
                        "• Rule out pelvic infections: PAP Smear, Vaginal Wet Mount, Cervical Cultures, RPR\n" +
                        "• Rule out polycystic ovarian disease: Ultrasound\n" +
                        "• Rule out pregnancy: hCG\n" +
                        "• Rule out renal pathology: Ultrasound\n" +
                        "• Rule out thyroid disorder: Thyroid Panel with TSH\n" +
                        "• Rule out uterine/endometrial polyps or malignancy or Asherman's Syndrome: Laparoscopy, Ultrasound, CT Scan, MRI\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
            "Vaginal Yeast Infection" ->{
                recommended_labs = "• Check for candidiasis: Candida Panel\n" +
                        "• Rule out adrenal insufficiency: Adrenocortex Stress Profile\n" +
                        "• Rule out allergies: IgG Food Allergy Antibody, IgG and IgE Inhalent Allergy Antibody\n" +
                        "• Rule out Helicobacter pylori: H. pylori Antibody, H. pylori Antigen, H. pylori Breath, Rapid Urease, Endoscopy with Biopsy\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
                ss = SpannableString(recommended_labs)
            }
        }
        checkAllLinks(ss,recommended_labs)
        binding.contentData.text = ss

    }


    fun checkAllLinks(ss:SpannableString,text:String){

        createLink(ss,"here.",text,"Hydrotherapy","Homeopathy")
        createLink(ss, "anthocyanadin", text.lowercase(), "Supplement", "Bioflavonoids")
        createLink(ss, "bioflavonoids", text.lowercase(), "Supplement", "Bioflavonoids")
        createLink(ss, "Adrenal glandular", text.lowercase(), "Supplement", "Glandulars")
        createLink(ss, "Alternating sitz bath", text.lowercase(), "Supplement", "Sitz Bath (Sitting Bath or Hip Bath)")
        createLink(
            ss,
            "althea officinalis",
            text.lowercase(),
            "Botanical",
            "Althea officinalis (Marshmallow)"
        )
        createLink(
            ss,
            "achillea millefolium",
            text.lowercase(),
            "Botanical",
            "Achillea millefolium (Yarrow)"
        )
        createLink(
            ss,
            "angelica sinensis",
            text.lowercase(),
            "Botanical",
            "Angelica sinensis (Dong quai)"
        )
        createLink(
            ss,
            "arctostaphylos uva ursi",
            text.lowercase(),
            "Botanical",
            "Arctostaphylos uva ursi (Bearberry)"
        )
        createLink(
            ss,
            "acidophilus and bifidus",
            text.lowercase(),
            "Supplement",
            "Acidophilus/Bifidus"
        )
        createLink(ss, "acetyl-l-carnitine", text.lowercase(), "Supplement", "Carnitine")
        createLink(ss, "althea", text.lowercase(), "Botanical", "Althea officinalis (Marshmallow)")
        if(heading!="ADD/ADHD")
        createLink(ss, "allergies", text.lowercase(), "Condition", "Allergies")
        createLink(ss, "Amenorrhea", text.lowercase(), "Condition", "Amenorrhea")
        createLink(ss, "allium sativum", text.lowercase(), "Botanical", "Allium sativum (Garlic)")
        createLink(ss, "Asthma iv therapy", text.lowercase(), "Hydrotherapy", "Asthma IV Treatment")
        createLink(ss, "asthma", text.lowercase(), "Condition", "Asthma")
        createLink(ss,"Acidophilus and Bifidus",text.lowercase(),"Supplement","Lactobacillus Acidophilus and Bifidus (Probiotics)")
        createLink(ss,"Acetyl-L-Carnitine",text.lowercase(),"supplement","Carnitine")
        createLink(ss,"Alanine",text.lowercase(),"Supplement","Alanine")
        createLink(ss,"Amino Acids",text.lowercase(),"Supplement","Amino Acids")
        createLink(ss,"Anthocyanadin",text.lowercase(),"Supplement","Bioflavonoids")
        createLink(ss,"Adrenal Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(ss, "Alzheimer's Disease", text.lowercase(), "Condition", "Alzheimer's Disease")
        createLink(ss, "anorexia nervosa", text.lowercase(), "Condition", "Anorexia Nervosa")
        createLink(ss, "Antiviral IV therapy", text.lowercase(), "Hydrotherapy", "Antiviral IV Treatments")
        createLink(ss, "Anti-infection iv therapy", text.lowercase(), "Hydrotherapy", "Anti-Infection IV Therapy")
        createLink(ss, "arctium lappa", text.lowercase(), "Botanical", "Arctium lappa (Burdock)")
        createLink(
            ss,
            "astragalus membranaceus",
            text.lowercase(),
            "Botanical",
            "Astragalus membranaceus (Astragalus, Milk vetch)"
        )
        createLink(
            ss,
            "abnormal sulfur metabolism iv therapy",
            text.lowercase(),
            "iv",
            "Abnormal Sulfur Metabolism"
        )
        createLink(ss, "beta carotene", text.lowercase(), "Vitamin", "Beta Carotene (Carotenoids)")
        createLink(ss, "beta-carotene", text.lowercase(), "Vitamin", "Beta Carotene (Carotenoids)")
        createLink(ss,"Bioflavonoids",text.lowercase(),"Supplement","Bioflavonoids")
        createLink(ss,"Bromelain",text.lowercase(),"Supplement","Bromelain")
        createLink(ss,"Bone Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(
            ss,
            "berberis vulgaris",
            text.lowercase(),
            "Botanical",
            "Berberis vulgaris (Barberry, Oregon grape)"
        )
        createLink(
            ss,
            "bipolar disease (manic phase)",
            text.lowercase(),
            "Condition",
            "Bipolar Disorder"
        )
        createLink(
            ss,
            "bipolar disorder",
            text.lowercase(),
            "Condition",
            "Bipolar Disorder"
        )
        createLink(
            ss,
            "capsicum frutescens",
            text.lowercase(),
            "Botanical",
            "Capsicum frutescens (Cayenne, Red pepper)"
        )
        createLink(
            ss,
            "Continuous bath/hammock bath",
            text.lowercase(),
            "hydrotherapy",
            "Continuous Bath/Hammock Bath"
        )
        createLink(ss, "curcuma longa", text.lowercase(), "Botanical", "Curcuma longa (Tumeric)")
        createLink(ss, "cysteine", text.lowercase(), "Supplement", "N-Acetyl Cysteine")
        createLink(ss, "calcium", text.lowercase(), "Vitamin", "Calcium")
        createLink(ss, "Copper", text.lowercase(), "Vitamin", "Copper")
        createLink(ss, "copper", text.lowercase(), "Vitamin", "Copper")
        createLink(ss, "cataract", text.lowercase(), "Condition", "Cataract Prevention")
        createLink(ss, "coenzyme q10", text.lowercase(), "Supplement", "Coenzyme Q10")
        createLink(ss,"Coenzyme Q10",text.lowercase(),"Supplement","Coenzyme Q10 (Ubiquinone)")
        createLink(ss,"Carnosine",text.lowercase(),"Supplement","Carnosine")
        createLink(ss,"Cysteine",text.lowercase(),"Supplement","N-Acetyl Cysteine")
        createLink(ss,"Choline",text.lowercase(),"Vitamin","Choline (Lecithin)")
        createLink(ss,"Citrus Bioflavonoids",text.lowercase(),"Supplement","Bioflavonoids")
        createLink(ss, "coffee enema", text.lowercase(), "Hydrotherapy", "Enemas")
        createLink(
            ss,
            "constitutional hydrotherapy",
            text.lowercase(),
            "Hydrotherapy",
            "Constitutional Hydrotherapy"
        )
        createLink(ss, "curcuma", text.lowercase(), "Botanical", "Curcuma longa (Tumeric)")
        createLink(ss, "Congestive heart IV therapy", text.lowercase(), "Hydrotherapy", "Congestive Heart Failure IV Treatment")
        createLink(ss, "congestive heart failure", text.lowercase(), "Hydrotherapy", "Congestive Heart Failure IV Treatment")
        createLink(ss, "Charcoal Poultice", text.lowercase(), "Hydrotherapy", "Poultice")
        createLink(ss, "candidiasis", text.lowercase(), "Condition", "Candidiasis")
        createLink(ss, "Crohn's Disease", text.lowercase(), "Condition", "Crohn's Disease (Regional Enteritis)")
        createLink(ss, "Crohns Disease", text.lowercase(), "Condition", "Crohn's Disease (Regional Enteritis)")
        createLink(ss, "chronic fatigue syndrome", text.lowercase(), "Condition", "Chronic Fatigue Syndrome")
        createLink(ss, "dhea", text.lowercase(), "Supplement", "Dehydroepiandrosterone (DHEA)")
        createLink(ss, "diabetes", text.lowercase(), "Condition", "Diabetes Mellitus (Type 2)")
        createLink(ss, "depression", text.lowercase(), "Condition", "Depression")
        createLink(ss,"Digestive Enzymes",text.lowercase(),"Supplement","Digestive Enzymes")
        createLink(ss,"DHEA (Dehydroepiandrosterone)",text.lowercase(),"Supplement","Dehydroepiandrosterone (DHEA)")
        createLink(ss,"Dehydroepiandrosterone (DHEA)",text.lowercase(),"Supplement","Dehydroepiandrosterone (DHEA)")
        createLink(ss,"Dimethyl Glycine (DMG)",text.lowercase(),"Supplement","Dimethyl Glycine (DMG)")
        createLink(ss, "Diabetes IV therapy", text.lowercase(), "Hydrotherapy", "Diabetes IV Treatment")
        createLink(
            ss,
            "echinacea",
            text.lowercase(),
            "Botanical",
            "Echinacea angustifolia (Purple cone flower)"
        )
        createLink(
            ss,
            "echinacea angustifolia",
            text.lowercase(),
            "Botanical",
            "Echinacea angustifolia (Purple cone flower)"
        )
        createLink(ss, "ephedra sinica", text.lowercase(), "Botanical", "Ephedra sinica (Ma huang)")
        createLink(ss, "endometriosis", text.lowercase(), "Condition", "Endometriosis")
        createLink(ss,"EFA",text.lowercase(),"Supplement","Essential Fatty Acids (EFAs)")
        createLink(ss,"Essential Fatty Acids",text.lowercase(),"Supplement","Essential Fatty Acids (EFAs)")
        createLink(ss,"EDTA",text.lowercase(),"Supplement","Ethylenediaminetetraacetic acid (EDTA)")
        createLink(ss,"Fructooligosaccarides",text.lowercase(),"Supplement","Fructooligosaccarides (FOS)")
        createLink(ss,"Fiber",text.lowercase(),"Food","Fiber")
        createLink(ss,"Fumaric Acid",text.lowercase(),"Supplement","Fumaric Acid")
        createLink(ss, "fiber", text.lowercase(), "Food", "Fiber")
        createLink(ss, "fibromyalgia", text.lowercase(), "Condition", "Fibromyalgia")
        createLink(ss, "folate", text.lowercase(), "Vitamin", "Folate")
        createLink(ss, "food allergies", text.lowercase(), "Condition", "Allergies")
        createLink(ss, "garlic", text.lowercase(), "Botanical", "Allium sativum (Garlic)")
        createLink(ss, "gout", text.lowercase(), "Condition", "Gout")
        createLink(ss, "gall bladder disease (cholecystitis)", text.lowercase(), "Condition", "Gall Bladder Disease (Cholecystitis)")
        createLink(ss, "gallstones (Cholelithiasis)", text.lowercase(), "Condition", "Gallstones (Cholelithiasis)")
        createLink(
            ss,
            "Geranium maculatum (Wild geranium, Cranesbill)".lowercase(),
            text.lowercase(),
            "Botanical",
            "Geranium maculatum (Wild geranium, Cranesbill)"
        )
        createLink(
            ss,
            "geranium",
            text.lowercase(),
            "Botanical",
            "Geranium maculatum (Wild geranium, Cranesbill)"
        )
        createLink(ss, "ginkgo biloba", text.lowercase(), "Botanical", "Ginkgo biloba (Ginkgo)")
        createLink(
            ss,
            "glycyrrhiza glabra",
            text.lowercase(),
            "Botanical",
            "Glycyrrhiza glabra (Licorice)"
        )
        createLink(ss, "glutathione", text.lowercase(), "Supplement", "Glutathione")
        createLink(
            ss,
            "glycyrrhiza glabra",
            text.lowercase(),
            "Botanical",
            "Glycyrrhiza glabra (Licorice)"
        )
        createLink(ss,"Garlic",text.lowercase(),"Food","Allium sativum (Garlic)")
        createLink(ss,"Glutathione",text.lowercase(),"Supplement","Glutathione")
        createLink(ss,"Glucosamine Sulfate",text.lowercase(),"Food","Glucosamine Sulfate")
        createLink(ss,"Glutamic Acid",text.lowercase(),"Supplement","Glutamic Acid")
        createLink(ss,"Hydrochloric Acid (HCL)",text.lowercase(),"Supplement","Hydrochloric Acid")
        createLink(ss,"Hydrochloric Acid",text.lowercase(),"Supplement","Hydrochloric Acid")
        createLink(ss,"5-Hydroxytryptophan",text.lowercase(),"supplement","Tryptophan")
        createLink(ss,"Hypothalamus Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(
            ss,
            "hydrastis",
            text.lowercase(),
            "Botanical",
            "Hydrastis canadensis (Goldenseal)"
        )
        createLink(
            ss,
            "hepatitis B and C",
            text.lowercase(),
            "Condition",
            "Hepatitis"
        )
        createLink(
            ss,
            "hypericum perforatum",
            text.lowercase(),
            "Botanical",
            "Hypericum perforatum (St. John's wort)"
        )
        createLink(
            ss,
            "hydrastis canadensis (Goldenseal)".lowercase(),
            text.lowercase(),
            "Botanical",
            "Hydrastis canadensis (Goldenseal)"
        )
        createLink(
            ss,
            "Hot sitz baths and alternating sitz baths (hot and cold)",
            text.lowercase(),
            "Hydrotherapy",
            "Sitz Bath (Sitting Bath or Hip Bath)"
        )
        createLink(
            ss,
            "Hot enemas",
            text.lowercase(),
            "Hydrotherapy",
            "Enemas"
        )
        createLink(ss, "hydrochloric acid", text.lowercase(), "Supplement", "Hydrochloric Acid")
        createLink(ss, "Heating compress", text.lowercase(), "Hydrotherapy", "Heating Compress")
        createLink(ss, "Hypertension IV therapy", text.lowercase(), "Hydrotherapy", "Hypertension IV Treatment")
        createLink(ss, "Hepatitis IV therapy", text.lowercase(), "Hydrotherapy", "Hepatitis IV Treatment")
        createLink(ss, "hypothyroidism", text.lowercase(), "Condition", "Hypothyroid")
        createLink(ss, "headache", text.lowercase(), "Condition", "Headache")
        createLink(ss, "herpes", text.lowercase(), "Condition", "herpes Simplex")
        createLink(ss, "iron", text.lowercase(), "Vitamin", "Iron")
        createLink(ss,"Inositol",text.lowercase(),"Vitamin","Inositol")
        createLink(ss, "L-glutathione", text.lowercase(), "Supplement", "Glutathione")
        createLink(ss,"L-Arginine",text.lowercase(),"supplement","Arginine")
        createLink(ss,"L-Glutathione",text.lowercase(),"Supplement","Glutathione")
        createLink(ss,"Lysine",text.lowercase(),"Supplement","Lysine")
        createLink(ss,"Lipoic Acid",text.lowercase(),"supplement","Lipoic Acid")
        createLink(ss,"L-Methionine",text.lowercase(),"supplement","Methionine")
        createLink(ss,"L-Carnitine",text.lowercase(),"supplement","Carnitine")
        createLink(ss,"L-Tyrosine",text.lowercase(),"supplement","Tyrosine")
        createLink(ss,"L-Glutamine",text.lowercase(),"supplement","Glutamine")
        createLink(ss,"L-Glycine",text.lowercase(),"supplement","Glycine")
        createLink(
            ss,
            "ligusticum porteri",
            text.lowercase(),
            "Botanical",
            "Ligusticum porteri (Osha)"
        )
        createLink(
            ss,
            "linum usitatissimum ",
            text.lowercase(),
            "Botanical",
            "Linum usitatissimum (Flax, Linseed)"
        )
        createLink(
            ss,
            "Lactobacillus acidophilus enema",
            text.lowercase(),
            "Hydrotherapy",
            "Enemas"
        )
        createLink(ss, "methionine", text.lowercase(), "Supplement", "Methionine")
        createLink(ss, "magnesium", text.lowercase(), "Vitamin", "Magnesium")
        createLink(ss, "manganese", text.lowercase(), "Vitamin", "Manganese")
        createLink(ss, "menopause", text.lowercase(), "condition", "Menopause")
        createLink(ss, "migraine", text.lowercase(), "Condition", "Migraine Headache")
        createLink(ss, "Migraine IV therapy", text.lowercase(), "hydrotherapy", "Migraine IV Treatment")
        createLink(ss, "Migraine IV push therapy", text.lowercase(), "hydrotherapy", "Migraine IV Push Treatment")
        createLink(ss, "MS IV therapy", text.lowercase(), "hydrotherapy", "Multiple Sclerosis IV Treatment")
        createLink(ss, "melatonin", text.lowercase(), "Supplement", "Melatonin")
        createLink(ss, "multiple sclerosis", text.lowercase(), "Condition", "Multiple Sclerosis")
        createLink(
            ss,
            "Macular degeneration iv therapy",
            text.lowercase(),
            "iv",
            "Macular Degeneration"
        )
        createLink(
            ss,
            "macular degeneration",
            text.lowercase(),
            "iv",
            "Macular Degeneration"
        )
        createLink(ss,"Melatonin",text.lowercase(),"supplement","Melatonin")
        createLink(ss,"NADH",text.lowercase(),"supplement","Nicotinamide Adenine Dinucleotide (NADH)")
        createLink(ss,"N-Acetyl Cysteine",text.lowercase(),"Supplement","N-Acetyl Cysteine")
        createLink(ss,"Nerve Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(ss, "niacinamide", text.lowercase(), "Vitamin", "Vitamin B3 (Niacin)")
        createLink(ss, "n-acetyl cysteine", text.lowercase(), "Supplement", "N-Acetyl Cysteine")
        createLink(ss, "omega 3 fatty acids", text.lowercase(), "Fat", "Essential Fatty Acid (EFAs)")
        createLink(ss, "omega 6 fatty acids", text.lowercase(), "Fat", "Essential Fatty Acid (EFAs)")
        createLink(ss, "Omega 3 and 6 Fatty Acids", text.lowercase(), "Fat", "Essential Fatty Acid (EFAs)")
        createLink(ss, "omega-6 fatty acids", text.lowercase(), "Fat", "Essential Fatty Acid (EFAs)")
        createLink(ss, "osteoarthritis", text.lowercase(), "Condition", "osteoarthritis")
        createLink(ss, "otitis media", text.lowercase(), "Condition", "Otitis Media (Ear Infection)")
        createLink(ss,"Omega-3 Fatty Acid",text.lowercase(),"Food","Essential Fatty Acids (EFAs)")
        createLink(ss,"Orchic Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(ss,"Ovary Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(ss, "pycnogenol", text.lowercase(), "Supplement", "Pycnogenol")
        createLink(ss, "psoriasis", text.lowercase(), "Condition", "Psoriasis")
        createLink(ss, "peptic ulcer", text.lowercase(), "Condition", "Peptic Ulcer")
        createLink(ss, "Parkinsons Disease", text.lowercase(), "Condition", "Parkinson's Disease (Paralysis Agitans)")
        createLink(
            ss,
            "panax ginseng",
            text.lowercase(),
            "Botanical",
            "Panax ginseng (Chinese ginseng, Korean ginseng)"
        )
        createLink(
            ss,
            "polygonum multiflorum",
            text.lowercase(),
            "Botanical",
            "Polygonum multiflorum (Fo-ti, He-shou-wu)"
        )
        createLink(ss,"Pycnogenol",text.lowercase(),"Supplement","Pycnogenol")
        createLink(ss,"Phenylalanine",text.lowercase(),"Food","Phenylalanine")
        createLink(ss,"Pituitary Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(ss,"Phosphatidylserine",text.lowercase(),"supplement","Phosphatidylserine")
        createLink(ss,"Quercetin",text.lowercase(),"Supplement","Quercetin")
        createLink(ss,"Red Yeast Rice",text.lowercase(),"Supplement","Red Yeast Rice (Monascus purpureus)")
        createLink(ss,"S-Adenosylmethionine (SAMe)",text.lowercase(),"Food","S-Adenosy-L-Methionine (SAM)")
        createLink(ss,"S-Adenosy-L-Methionine (SAM)",text.lowercase(),"Food","S-Adenosy-L-Methionine (SAM)")
        createLink(
            ss,
            "subacute cutaneous systemic lupus erythematosus",
            text.lowercase(),
            "Condition",
            "Systemic Lupus Erythematosus"
        )
        createLink(
            ss,
            "sitz bath",
            text.lowercase(),
            "Hydrotherapy",
            "Sitz Bath (Sitting Bath or Hip Bath)"
        )
        createLink(
            ss,
            "schizophrenia",
            text.lowercase(),
            "Condition",
            "Schizophrenia"
        )

        createLink(
            ss,
            "systemic lupus erythematosus (SLE)",
            text.lowercase(),
            "Condition",
            "Systemic Lupus Erythematosus (SLE)"
        )
        createLink(ss, "selenium", text.lowercase(), "Vitamin", "Selenium")
        createLink(
            ss,
            "salvia miltiorrhiza",
            text.lowercase(),
            "Botanical",
            "Salvia miltiorrhiza (Dan shen)"
        )
        createLink(
            ss,
            "spilanthes acmella",
            text.lowercase(),
            "Botanical",
            "Spilanthes acmella (Paracress)"
        )
        createLink(ss, "taurine", text.lowercase(), "Supplement", "Taurine")
        createLink(ss, "Tonic iv therapy", text.lowercase(), "iv", "Tonic Therapy")
        createLink(ss, "tumeric", text.lowercase(), "Botanical", "Curcuma longa (Tumeric)")
        createLink(ss,"Taurine",text.lowercase(),"supplement","Taurine")
        createLink(ss,"Trimethylglycine HCL",text.lowercase(),"supplement","Dimethyl Glycine (DMG)")
        createLink(ss,"Thymus Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(ss,"Thyroid Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(ss,"Tyrosine",text.lowercase(),"Supplement","Tyrosine")
        createLink(ss,"Uterus Glandular",text.lowercase(),"Supplement","Glandulars (Protomorphogens)")
        createLink(ss, "urtica urens", text.lowercase(), "Botanical", "Urtica urens (Nettles)")
        createLink(ss, "ulcerative colitis", text.lowercase(), "Condition", "Ulcerative Colitis")
        createLink(
            ss,
            "Ulcerative colitis IV therapy",
            text.lowercase(),
            "Hydrotherapy",
            "Crohn's Disease and Ulcerative Colitis IV Treatment"
        )
        createLink(ss, "Uterine fibroids", text.lowercase(), "Condition", "Uterine Fibroids")
        createLink(
            ss,
            "ulmus",
            text.lowercase(),
            "Botanical",
            "Ulmus fulva (Slippery elm, American elm)"
        )
        createLink(
            ss,
            "ulmus fulva (Slippery Elm, American elm)".lowercase(),
            text.lowercase(),
            "Botanical",
            "Ulmus fulva (Slippery elm, American elm)"
        )
        createLink(ss, "vitamin b6", text.lowercase(), "Vitamin", "Vitamin B6 (Pyridoxine)")
        createLink(ss,"vitamin b-complex",text.lowercase(),"HydroTherapy","B Complex")
        createLink(ss, "vitamin c", text.lowercase(), "Vitamin", "Vitamin C (Ascorbic Acid)")
        createLink(ss, "vitamin d", text.lowercase(), "Vitamin", "Vitamin D (Cholecalciferol)")
        createLink(ss, "vitamin k", text.lowercase(), "Vitamin", "Vitamin K (Quinones)")
        createLink(ss, "vitamin e", text.lowercase(), "Vitamin", "Vitamin E (Tocopherol)")
        createLink(ss, "vitamin a", text.lowercase(), "Vitamin", "Vitamin A (Retinol)")
        createLink(ss, "vanadium", text.lowercase(), "Vitamin", "Vanadium")
        createLink(ss, "vitamin b12", text.lowercase(), "Vitamin","Vitamin B12 (Cobalamin)")
        createLink(
            ss,
            "vaccinium myrtillus",
            text.lowercase(),
            "Botanical",
            "Vaccinium myrtillus (Bilberry)"
        )
        createLink(
            ss,
            "withania somnifera",
            text.lowercase(),
            "Botanical",
            "Withania somnifera (Ashwagandha)"
        )

        createLink(ss, "quercetin", text.lowercase(), "Supplement", "Quercetin")
        createLink(ss, "rheumatoid arthritis", text.lowercase(), "Condition", "Rheumatoid Arthritis")
        createLink(ss, "vanadium", text.lowercase(), "Vitamin", "Vanadium")
        createLink(ss, "zinc", text.lowercase(), "Vitamin", "Zinc")

    }

        private fun createLink(ss: SpannableString, sub_str: String, string: String, activity: String, heading: String) {

            var index = string.indexOf(sub_str)
            while (index != -1) {
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
                        }else if(activity == "Fat"){
                            val intent = Intent(this@ConditionDetailActivity,FattyAcidActivity::class.java)
                            startActivity(intent)
                        }else if(activity == "Food"){
                            val intent = Intent(this@ConditionDetailActivity,FiberDetailActivity::class.java)
                            startActivity(intent)
                        }else if(activity == "Hydrotherapy"){
                            val intent = Intent(this@ConditionDetailActivity,HydroTherapyActivity::class.java)
                            intent.putExtra("heading",heading)
                            startActivity(intent)
                        }else if(activity == "iv"){
                            val intent = Intent(this@ConditionDetailActivity,FourTherapyActivity::class.java)
                            intent.putExtra("heading",heading)
                            startActivity(intent)
                        }
                    }
                }

                ss.setSpan(clickableSpan,index,index+sub_str.length,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                index = string.indexOf(sub_str, index + 1)
            }
        }
    fun makeBold(ss : SpannableString,string:String,substr:String){
        if(string.indexOf(substr)!=-1 )
            ss.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD),string.indexOf(substr),string.indexOf(substr)+substr.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }

}