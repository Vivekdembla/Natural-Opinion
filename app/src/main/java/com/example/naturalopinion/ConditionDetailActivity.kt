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
            }
            "Allergies" ->{
                diet_detail = "• Isolate and eliminate foods that cause an allergic response or to which there is a sensitivity and do not introduce foods that have a high potential for allergy too early in an infant's diet\n" +
                        "• Eat more garlic"
                ss = SpannableString(diet_detail)
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
            }
            "BPH" ->{
                diet_detail = "• Reduce fat and cholesterol intake especially saturated fats (animal products) and eat more fruits and vegetables\n" +
                        "• Eat foods containing more zinc (nuts - especially walnuts, pumpkin seeds, safflower seeds, and oysters)\n" +
                        "• Avoid drinking beer\n" +
                        "• Eat more soy products\n" +
                        "• *Remove all chemicals and pesticides from diet (eat organic food)"
                ss = SpannableString(diet_detail)
            }
            "Bronchitis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods - especially investigate dairy products, corn, and wheat)\n" +
                        "• Drink warming fluids\n" +
                        "• *Eat lots of garlic and onions and, if, on the cool side, ginger and cayenne\n" +
                        "• *Decrease sugar intake as well as starches and carbohydrates"
                ss = SpannableString(diet_detail)
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
            }
            "CHF" ->{
                diet_detail = "• Avoid excessive dietary salt, sodium and chloride\n" +
                        "• No caffeine, refined carbohydrates and saturated fats\n" +
                        "• Eat high fiber diet\n"
                ss = SpannableString(diet_detail)
            }
            "Cholecystitis" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined carbohydrates\n" +
                        "• Eat high fiber and high complex carbohydrate diet (promotes decrease in bowel transit time)\n" +
                        "• Reduce fats in general and especially animal fats\n" +
                        "• Drink lots of vegetable juices\n"
                ss = SpannableString(diet_detail)
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
            }
            "Congestive Heart Failure" ->{
                diet_detail = "• Avoid excessive dietary salt, sodium and chloride\n" +
                        "• No caffeine, refined carbohydrates and saturated fats\n" +
                        "• Eat high fiber diet"
                ss = SpannableString(diet_detail)
            }
            "Constipation" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity - especially dairy products (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Eat a high fiber diet - more fruits (especially kiwi) and vegetables and less animal products\n" +
                        "• Drink lots of filtered water\n" +
                        "• Use honey instead of sugar as a sweetener"
                ss = SpannableString(diet_detail)
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
            }
            "Dysmenorrhea" ->{
            diet_detail = "• Increase complex carbohydrates to 60-70 % of total calories, including whole grains, legumes, fruits, vegetables and seeds and nuts such as ground raw flaxseed and pumpkin seed\n" +
                    "• Decrease fat, especially from arachidonic acid sources (animal products)\n" +
                    "• *Increase fiber\n"
            ss = SpannableString(diet_detail)
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
            }
            "Hepatitis" ->{
                diet_detail = "• Increase vegetable intake\n" +
                        "• Avoid sucrose and all simple sugars\n" +
                        "• Use lots of tumeric\n" +
                        "• Eliminate alcohol\n"
                ss = SpannableString(diet_detail)
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
            }
            "HIV" ->{
                diet_detail = "• Avoid sucrose and all simple sugars\n" +
                        "• Eat foods high in fiber\n" +
                        "• Reduce fat consumption, especially saturated fats (animal products)\n" +
                        "• Eat more complex carbohydrates, e.g., vegetables, beans, and brown rice\n" +
                        "• Eat lots of garlic, onions, tumeric and shiitake and/or reishi mushrooms\n" +
                        "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)"
                ss = SpannableString(diet_detail)
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
            }
            "Menopause" ->{
                diet_detail = "• Eat low fat, high fiber, vegetarian based diet with whole grains, legumes, raw seeds and nuts, fruits, and vegetables making up the core of the diet\n" +
                        "• Avoid sugar, refined carbohydrates, salt, dairy products, alcohol, and caffeine in coffee, teas, colas, and chocolate\n" +
                        "• Eat foods containing phytoestrogens: soybeans, apples, carrots, yams, green beans, peas, pomegranates, potatoes, red beans, brown rice, whole wheat, rye, sesame seeds, legumes, flaxseed and pumpkin seeds\n"
                ss = SpannableString(diet_detail)
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
            }
            "Obesity" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar, refined carbohydrates, caffeine and alcohol\n" +
                        "• Avoid aspartame (NutraSweet) - people who consume this eat more food\n" +
                        "• Eat high fiber diet"
                ss = SpannableString(diet_detail)
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
            }
            "PMS" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined foods\n" +
                        "• Increase fiber in the diet to approx. 35 - 45 grams per day\n" +
                        "• Decrease salt intake to 3 grams (especially for PMS - H)\n" +
                        "• Decrease consumption of saturated fats, e.g., red meats and dairy products\n" +
                        "• Avoid/decrease caffeine consumption\n"
                ss = SpannableString(diet_detail)
            }
            "Premenstrual Syndrome" ->{
                diet_detail = "• Eliminate foods that cause an allergic response or to which there is a sensitivity (fast, use an elimination diet, or allergy test to isolate such foods)\n" +
                        "• Avoid sugar and refined foods\n" +
                        "• Increase fiber in the diet to approx. 35 - 45 grams per day\n" +
                        "• Decrease salt intake to 3 grams (especially for PMS - H)\n" +
                        "• Decrease consumption of saturated fats, e.g., red meats and dairy products\n" +
                        "• Avoid/decrease caffeine consumption\n"
                ss = SpannableString(diet_detail)
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
            }
            "Uterine Fibroids" ->{
                diet_detail = "• Avoid dairy products, animal fats, sugar, alcohol, salt, caffeine, refined foods, and wheat\n" +
                        "• Increase fiber\n"
                ss = SpannableString(diet_detail)
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

            "Adult Acne" -> {
                vitamin_detail = "• Vitamin A: 100,000-300,000 I.U. for 3 months\n" +
                        "• Vitamin B-Complex : take as directed on the bottle\n" +
                        "• Vitamin C : cream - take as directed on the bottle\n" +
                        "• Zinc: 30 - 60 mg.\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)

            }

            "Age-Related Macular Degeneration" -> {
                vitamin_detail = "• Vitamin C: 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Beta-Carotene: 200,000 I.U.\n" +
                        "• Zinc: 30 - 45 mg.\n" +
                        "• Selenium: 400 mcg."
                ss = SpannableString(vitamin_detail)

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

            }
            "Amenorrhea" -> {
            vitamin_detail = "• Vitamin A: 15,000 - 25,000 I.U.\n" +
                    "• Zinc: 50 mg.\n" +
                    "• *Copper: 2 - 4 mg."
            ss = SpannableString(vitamin_detail)

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

        }
            "Aphthous Stomatitis" -> {
            vitamin_detail = "• Vitamin C: 1 - 3 gm.\n" +
                    "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly (if deficient)\n" +
                    "• Folate: 2 mg. if deficient\n" +
                    "• Zinc: 30 mg.\n" +
                    "• *Copper: 2 - 4 mg.\n" +
                    "• Iron: if deficient"
            ss = SpannableString(vitamin_detail)

        }
            "Arthritis, Gout" -> {
            vitamin_detail = "• Vitamin C: 1 gm. 3 times a day - start with 500 mg. 3 times a day for 1 week, then increase until 1 gm. 3 times a day is reached\n" +
                    "• Vitamin E: 800 I.U.\n" +
                    "• Folic Acid: 25-50 mg. 3 times a day with vitamin C"
            ss = SpannableString(vitamin_detail)

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

        }
            "Atopic Dermatitis" -> {
            vitamin_detail = "• Vitamin A: 50,000 I.U.\n" +
                    "• Vitamin C: 3 - 6 gm.\n" +
                    "• Vitamin E: 400 I.U.\n" +
                    "• Selenium: 250 - 400 mcg.\n" +
                    "• Zinc: 30 mg."
            ss = SpannableString(vitamin_detail)

        }
            "Attention Deficit Disorder" -> {
            vitamin_detail = "• Niacinamide: 1 - 3 gm.\n" +
                    "• Vitamin B6: 20 - 30 mg./kg.\n" +
                    "• Vitamin C: 3 gm. (for chelating heavy metals)\n" +
                    "• Zinc: 30 mg.\n" +
                    "• *Calcium: 1 gm.\n" +
                    "• Magnesium: 500 mg."
            ss = SpannableString(vitamin_detail)

        }
            "Autism" -> {
            vitamin_detail = "• Vitamin B6: 100-200 mg.\n" +
                    "• Folate: 2 - 4 mg.\n" +
                    "• Vitamin C: 1 - 3 gm. in divided doses\n" +
                    "• Magnesium (Aspartate form): 500-2000 mg.\n" +
                    "• Calcium: 500-2000 mg."
            ss = SpannableString(vitamin_detail)

        }

            "Benign Prostatic Hypertrophy" ->{
                vitamin_detail = "• Vitamin D3: 200-400 I.U.\n" +
                        "• *Vitamin E: 800 - 1200 I.U.\n" +
                        "• Zinc: 45 - 90 mg.\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Magnesium: 400 mg.\n" +
                        "• Selenium: 200 - 300 mcg.\n"
                ss = SpannableString(vitamin_detail)
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
            }
            "Bladder Infection" ->{
                vitamin_detail = "• Vitamin A: 25,000 - 50,000 I.U.\n" +
                        "• Vitamin C: 5 - 10 gm. (to bowel tolerance)\n" +
                        "• Vitamin E: 600 I.U.\n" +
                        "• Folate: 1.8 mg. (for patients with uric acid stones)"
                ss = SpannableString(vitamin_detail)
            }
            "Blood Pressure, High" ->{
                vitamin_detail = "• Vitamin B6: 20 - 60 mg.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 200 - 400 I.U.\n" +
                        "• Magnesium: 400 - 800 mg.\n" +
                        "• Calcium: 800 - 1000 mg.\n" +
                        "• Potassium: 4 gm. (this amount may cause stomach upset; eat potassium-containing foods instead, e.g. bananas and oranges)"
                ss = SpannableString(vitamin_detail)
            }
            "BPH" ->{
                vitamin_detail = "• Vitamin D3: 200-400 I.U.\n" +
                        "• *Vitamin E: 800 - 1200 I.U.\n" +
                        "• Zinc: 45 - 90 mg.\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Magnesium: 400 mg.\n" +
                        "• Selenium: 200 - 300 mcg.\n"
                ss = SpannableString(vitamin_detail)
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
            }
            "Canker Sores" ->{
                vitamin_detail = "• Vitamin C: 1 - 3 gm.\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly (if deficient)\n" +
                        "• Folate: 2 mg. if deficient\n" +
                        "• Zinc: 30 mg.\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Iron: if deficient"
                ss = SpannableString(vitamin_detail)
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
            }
            "Cholecystitis" ->{
                vitamin_detail = "• Vitamin A: 10,000 I.U.\n" +
                        "Vitamin C: 1 - 2 gm.\n" +
                        "Vitamin E: 400 - 800 I.U.\n" +
                        "Choline: 1 gm."
                ss = SpannableString(vitamin_detail)
            }
            "Cholelithiasis" ->{
                vitamin_detail = "• Vitamin C: 1 - 2 gm.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Choline: 100 mg. TID\n"
                ss = SpannableString(vitamin_detail)
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
            }
            "Constipation" ->{
                vitamin_detail = "• Vitamin B5: 250 mg.\n" +
                        "• Folic Acid: 20 - 60 mg. (if deficient)\n" +
                        "• Magnesium: 600 - 900 mg."
                ss = SpannableString(vitamin_detail)
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
            }
            "Cystitis" ->{
                vitamin_detail = "• Vitamin A: 25,000 - 50,000 I.U.\n" +
                        "• Vitamin C: 5 - 10 gm. (to bowel tolerance)\n" +
                        "• Vitamin E: 600 I.U.\n" +
                        "• Folate: 1.8 mg. (for patients with uric acid stones)"
                ss = SpannableString(vitamin_detail)
            }
            "Depression" ->{
                vitamin_detail = "• Vitamin B6: 100 mg. TID\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. IM daily to weekly, with folic acid\n" +
                        "• Vitamin B-Complex: 50 times the RDA\n" +
                        "• Folate: 400 mg.\n" +
                        "• Inositol: 500 mg.\n" +
                        "• Magnesium: 500 mg.\n"
                ss = SpannableString(vitamin_detail)
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
            }
            "Dysmenorrhea" ->{
                vitamin_detail = "• Vitamin B-Complex: take as directed\n" +
                        "• Vitamin B3: 100 mg. every 2 hours during cramping\n" +
                        "• Vitamin B6: 50 - 200 mg., increasing dosage during premenstrual phase\n" +
                        "• Vitamin C: 100 mg. every 2 hours during cramping (enhances vitamin B3)\n" +
                        "• Vitamin E: 1200 I.U.\n" +
                        "• Magnesium: 500 - 800 mg."
                ss = SpannableString(vitamin_detail)
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
            }
            "Eczema, Chronic" ->{
                vitamin_detail = "• Vitamin A: 50,000 I.U.\n" +
                        "• Vitamin C: 3 - 6 gm.\n" +
                        "• Vitamin E: 400 I.U.\n" +
                        "• Selenium: 250 - 400 mcg.\n" +
                        "• Zinc: 30 mg."
                ss = SpannableString(vitamin_detail)
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
            }

            "Erectile Dysfunction" ->{
                vitamin_detail = "• High-Potency Multivitamin/Mineral Supplement\n" +
                        "• Vitamin C: 500 - 1000 mg. TID\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Inositol Hexaniacinate: 1000 - 3000 mg.\n" +
                        "• Zinc: 30 - 45 mg. daily\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
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
            }
            "Fibrocystic Breast Disease" ->{
                vitamin_detail = "• Beta Carotene: 50 - 300,000 I.U.\n" +
                        "• Vitamin C: 2 - 5 gm.\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Vitamin B-Complex: 5 - 10 times the normal daily dose\n" +
                        "• Vitamin B6: 200 mg.\n" +
                        "• Iodine (SSKI): 6 - 8 drops (cut back after 2 weeks to 2 - 4 drops)"
                ss = SpannableString(vitamin_detail)
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
            }
            "Gallbladder Disease" ->{
                vitamin_detail = "• Vitamin A: 10,000 I.U.\n" +
                        "• Vitamin C: 1 - 2 gm.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Choline: 1 gm."
                ss = SpannableString(vitamin_detail)
            }
            "Gallstones" ->{
                vitamin_detail = "• Vitamin C: 1 - 2 gm.\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Choline: 100 mg. TID"
                ss = SpannableString(vitamin_detail)
            }
            "Gout" ->{
                vitamin_detail = "• Vitamin C: 1 gm. 3 times a day - start with 500 mg. 3 times a day for 1 week, then increase until 1 gm. 3 times a day is reached\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folic Acid: 25-50 mg. 3 times a day with vitamin C"
                ss = SpannableString(vitamin_detail)
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
            }
            "Headache, Migraine" ->{
                vitamin_detail = "• Vitamin B2: 400 mg.\n" +
                        "• Vitamin B12: 1000 mcg. once a week IM\n" +
                        "• Magnesium: 300-600 mg. in divided dose"
                ss = SpannableString(vitamin_detail)
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
            }
            "Hepatitis" ->{
                vitamin_detail = "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly, with folic acid for alcoholic hepatitis, chronic active hepatitis and viral hepatitis\n" +
                        "• Vitamin C: 1 - 3 gm. TID - hepatitis A and serum hepatitis\n" +
                        "• Vitamin E: 800 - 1600 I.U. for chronic hepatitis\n" +
                        "• Zinc: 30 - 45 mg.\n" +
                        "• Copper: 2 - 4 mg.\n" +
                        "• Selenium: 200 - 300 mcg. - for hepatitis B, viral hepatitis"
                ss = SpannableString(vitamin_detail)
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
            }
            "High Blood Pressure" ->{
                vitamin_detail = "• Vitamin B6: 20 - 60 mg.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 200 - 400 I.U.\n" +
                        "• Magnesium: 400 - 800 mg.\n" +
                        "• Calcium: 800 - 1000 mg.\n" +
                        "• Potassium: 4 gm. (this amount may cause stomach upset; eat potassium-containing foods instead, e.g. bananas and oranges)"
                ss = SpannableString(vitamin_detail)
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
            }
            "Hyperactivity" ->{
                vitamin_detail = "• Niacinamide: 1 - 3 gm.\n" +
                        "• Vitamin B6: 20 - 30 mg./kg.\n" +
                        "• Vitamin C: 3 gm. (for chelating heavy metals)\n" +
                        "• Zinc: 30 mg.\n" +
                        "• *Calcium: 1 gm.\n" +
                        "• Magnesium: 500 mg."
                ss = SpannableString(vitamin_detail)
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
            }
            "Hypertension" ->{
                vitamin_detail = "• Vitamin B6: 20 - 60 mg.\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin E: 200 - 400 I.U.\n" +
                        "• Magnesium: 400 - 800 mg.\n" +
                        "• Calcium: 800 - 1000 mg.\n" +
                        "• Potassium: 4 gm. (this amount may cause stomach upset; eat potassium-containing foods instead, e.g. bananas and oranges)"
                ss = SpannableString(vitamin_detail)
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
            }
            "Impotence" ->{
                vitamin_detail = "• High-Potency Multivitamin/Mineral Supplement\n" +
                        "• Vitamin C: 500 - 1000 mg. TID\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Inositol Hexaniacinate: 1000 - 3000 mg.\n" +
                        "• Zinc: 30 - 45 mg. daily\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
            }
            "Incontinence, Stress" ->{
                vitamin_detail = "• Vitamin C: 1 gm TID\n" +
                        "• Vitamin B12: 1000 mcg. daily or 1 cc IM 3 times a week (especially for geriatric patients)\n"
                ss = SpannableString(vitamin_detail)
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
            }
            "Insomnia" ->{
                vitamin_detail = "• Vitamin B1: 20-40 mg.\n" +
                        "• Vitamin B12: 300-600 mcg.\n" +
                        "• Magnesium (Aspartate form): 1000 mg."
                ss = SpannableString(vitamin_detail)
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
            }
            "Macular Degeneration" ->{
                vitamin_detail = "• Vitamin C: 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Beta-Carotene: 200,000 I.U.\n" +
                        "• Zinc: 30 - 45 mg.\n" +
                        "• Selenium: 400 mcg."
                ss = SpannableString(vitamin_detail)
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
            }
            "Mastitis" ->{
                vitamin_detail = "• Vitamin A: 100,000 I.U.\n" +
                        "• Vitamin C: 1-2 gm. 3 times per day\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Selenium: 200-300 mcg.\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Copper: 2-4 mg."
                ss = SpannableString(vitamin_detail)
            }
            "Memory Loss" ->{
                vitamin_detail = "• Vitamin B1 (Thiamine): 15-30 mg.\n" +
                        "• Vitamin B6: 20 - 50 mg.\n" +
                        "• Vitamin B12: 1000 mcg. once a week IM\n" +
                        "• Vitamin E: 400 - 800 I.U.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Choline: 250 mg.\n"
                ss = SpannableString(vitamin_detail)
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
            }
            "Migraine Headache" ->{
                vitamin_detail = "• Vitamin B2: 400 mg.\n" +
                        "• Vitamin B12: 1000 mcg. once a week IM\n" +
                        "• Magnesium: 300-600 mg. in divided dose"
                ss = SpannableString(vitamin_detail)
            }
            "Mouth Ulcers" ->{
                vitamin_detail = "• Vitamin C: 1 - 3 gm.\n" +
                        "• Vitamin B12: 1,000 - 3,000 mcg. daily to weekly (if deficient)\n" +
                        "• Folate: 2 mg. if deficient\n" +
                        "• Zinc: 30 mg.\n" +
                        "• *Copper: 2 - 4 mg.\n" +
                        "• Iron: if deficient"
                ss = SpannableString(vitamin_detail)
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
            }

            "Obesity" ->{
                vitamin_detail = "• Vitamin C: 1 gm. TID\n" +
                        "• Calcium (Citrate form): 600 -1200 mg."
                ss = SpannableString(vitamin_detail)
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
            }
            "Ovarian Cancer" ->{
                vitamin_detail = "• Beta Carotene: 25,000 I.U. TID\n" +
                        "• Vitamin A: 10,000 I.U. TID\n" +
                        "• Vitamin C: 500 mg. TID\n" +
                        "• Vitamin D: 200 I.U. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Selenium: 300 mcg.\n"
                ss = SpannableString(vitamin_detail)
            }
            "Painful Menses" ->{
                vitamin_detail = "• Vitamin B-Complex: take as directed\n" +
                        "• Vitamin B3: 100 mg. every 2 hours during cramping\n" +
                        "• Vitamin B6: 50 - 200 mg., increasing dosage during premenstrual phase\n" +
                        "• Vitamin C: 100 mg. every 2 hours during cramping (enhances vitamin B3)\n" +
                        "• Vitamin E: 1200 I.U.\n" +
                        "• Magnesium: 500 - 800 mg."
                ss = SpannableString(vitamin_detail)
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
            }
            "Rosacea" ->{
                vitamin_detail = "• Vitamin A: 100,000-300,000 I.U. for 3 months\n" +
                        "• Vitamin B-Complex : take as directed on the bottle\n" +
                        "• Vitamin C : cream - take as directed on the bottle\n" +
                        "• Zinc: 30 - 60 mg.\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
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
            }
            "Sleep Disorder" ->{
                vitamin_detail = "• Vitamin B1: 20-40 mg.\n" +
                        "• Vitamin B12: 300-600 mcg.\n" +
                        "• Magnesium (Aspartate form): 1000 mg."
                ss = SpannableString(vitamin_detail)
            }
            "Stress Incontinence" ->{
                vitamin_detail = "• Vitamin C: 1 gm TID\n" +
                        "• Vitamin B12: 1000 mcg. daily or 1 cc IM 3 times a week (especially for geriatric patients)"
                ss = SpannableString(vitamin_detail)
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
            }
            "Ulcerative Colitis" ->{
                vitamin_detail = "• Vitamin A: 100,000 I.U. initially, then taper to 25,000 I.U.\n" +
                        "• Vitamin C: 1 gm. TID\n" +
                        "• Vitamin E: 800 I.U.\n" +
                        "• Folate: 2 - 4 mg.\n" +
                        "• Zinc: 30 mg. TID\n" +
                        "• Magnesium (Aspartate form): 500 mg.\n"
                ss = SpannableString(vitamin_detail)
            }
            "Uterine Fibroids" ->{
                vitamin_detail = "• Vitamin C: 2 gm. TID\n" +
                        "• Beta-carotene: 150,000 I.U.\n" +
                        "• Selenium: 400 mcg.\n" +
                        "• Zinc: 30 mg.\n" +
                        "• Copper: 2 - 4 mg."
                ss = SpannableString(vitamin_detail)
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
            }
        }

        binding.contentData.text = ss
    }

    private fun setSupplementData(conditionName: String) {
        binding.diet.text = "Supplements"
        when(conditionName){

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

            "Adult Acne" -> {
                supplements_detail = "• Hydrochloric Acid (HCl): 20 - 40 grains (likely, but only if lab work confirms)\n" +
                        "• Digestive Enzymes: 1 - 2 tablets per meal\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(supplements_detail)
            }

            "Age-Related Macular Degeneration" -> {
                supplements_detail = "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Taurine: 1.5 gm. BID\n" +
                        "• Anthocyanadin : 80 -160 mg. (standard extract from Bilberry)"
                ss = SpannableString(supplements_detail)

            }
            "Aging Prevention" -> {
                supplements_detail = "• Glutathionine: 500-1,000 mg.\n" +
                        "• DHEA (Dehydroepiandrosterone): 20-50 mg.\n" +
                        "• Melatonin: 3 mg. at 9 PM\n" +
                        "• Thymus Glandular: 1 tablet TID\n" +
                        "• Coenzyme Q10: 30 mg. BID\n" +
                        "• Omega 6 Fatty Acids: 2 - 4 gm."
                ss = SpannableString(supplements_detail)

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

            }
            "Allergies" -> {
                vitamin_detail = "• EFA: 3 gm.\n" +
                        "• Quercetin: 500 mg. 30 minutes before meals\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Thymus Glandular: 1 tablet BID\n" +
                        "• Adrenal Glandular: 1 tablet BID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(recommended_labs)

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

            }
            "Amenorrhea" -> {
                supplements_detail = "• Ovary Glandular: 1 tablet TID\n" +
                        "• Pituitary Glandular: 1 tablet TID\n" +
                        "• Adrenal Glandular: 1 tablet TID\n" +
                        "• Liver Glandular: 1 tablet TID\n"
                ss = SpannableString(supplements_detail)

            }
            "Anorexia Nervosa" -> {
                supplements_detail = "• 5-Hydroxytryptophan: 50 mg. TID (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• Melatonin: 3-6 mg. at 9PM"
                ss = SpannableString(supplements_detail)

            }
            "Aphthous Stomatitis" -> {
                supplements_detail = "• *Hydrochloric Acid: 10 - 70 grains per meal (if hypochlorhydric)\n" +
                        "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Lysine: 500 - 2000 mg. (if viral/herpetic - reduce dosage after improvement)\n" +
                        "• Acidophilis and Bifidus: apply topically to ulcer during initial stage"
                ss = SpannableString(supplements_detail)
            }
            "Arthritis, Gout" -> {
                supplements_detail = "• Bromelain: 250 mg. 3 times a day away from food\n" +
                        "• Omega 3: 1.5-2.0 gm. a day in divided doses\n" +
                        "• Quercetin: 400 mg. 3 times a day away from food\n" +
                        "• *Digestive Enzymes: 2 tablets with each meal"
                ss = SpannableString(supplements_detail)

            }
            "Arthritis, Osteo" -> {
                supplements_detail = "• S-Adenosylmethionine (SAMe): 1200 mg. in divided doses\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab confirms)\n" +
                        "• Glucosamine Sulfate: 350 mg. TID\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm."
                ss = SpannableString(supplements_detail)

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

            }
            "Arthritis, Rheumatoid" -> {
                supplements_detail = "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Bromelain: 250 mg. TID (between meals)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Glucosamine Sulfate: 500 mg. TID"
                ss = SpannableString(supplements_detail)

            }
            "Asthma" -> {
                supplements_detail = "• N-Acetyl Cysteine: 500 - 1000 mg.\n" +
                        "• Omega 3 Fatty Acids: 3 gm.\n" +
                        "• Quercetin: 500 mg. 30 minutes before meals\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Coenzyme Q10: 60 mg. in small divided doses every 3 - 4 hours"
                ss = SpannableString(supplements_detail)

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

            }
            "Atopic Dermatitis" -> {
                supplements_detail = "• Omega-3 Fatty Acids : 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Hydrochloric Acid (HCl): 10 - 40 grains with each meal if hypochlohydria\n" +
                        "• Quercetin: 500 mg. 30 minutes before meals\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(supplements_detail)

            }
            "Attention Deficit Disorder" -> {
                supplements_detail = "• Omega-3 Fatty Acids: 500-1000 mg. TID\n" +
                        "• Pycnogenol: 20-100 mg. TID\n"
                ss = SpannableString(supplements_detail)

            }
            "Autism" -> {
                supplements_detail = "• Dimethyl Glycine (DMG): 100-200 mg. in divided doses\n" +
                        "• Hydrocholric Acid (HCl): 10 - 40 grains for adults and from 1 - 10 grains for children based on weight (this promotes secretin production)\n" +
                        "• Carnosine: 400 mg. BID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Omega 3 Fatty Acids: 3 gm."
                ss = SpannableString(supplements_detail)

            }
            "Benign Prostatic Hypertrophy" ->{
                supplements_detail = "• Dimethyl Glycine(DMG): 100-200 mg. in divided doses\n" +
                        "• Glutamic Acid: 2.3 gm. for 2 weeks, followed by 1.1 gm. for 3 months\n" +
                        "• Alanine: 2.3 gm. for 2 weeks, followed by 1.1 gm. for 3 months\n" +
                        "• Quercetin: 500 mg. TID (between meals)\n" +
                        "• Prostate Glandular: 1 tablet TID\n" +
                        "• Omega 3 Fatty Acids: 1-3 gm. TID"
                ss = SpannableString(supplements_detail)
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
            }
            "Bladder Infection" ->{
                supplements_detail = "• Arginine: 500 - 2,000 mg. in divided doses on an empty stomach\n" +
                        "• Mannose (powder): 1/4 tsp. 3 - 6 times a day"
                ss = SpannableString(supplements_detail)
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
            }
            "BPH" ->{
                supplements_detail = "• Dimethyl Glycine(DMG): 100-200 mg. in divided doses\n" +
                        "• Glutamic Acid: 2.3 gm. for 2 weeks, followed by 1.1 gm. for 3 months\n" +
                        "• Alanine: 2.3 gm. for 2 weeks, followed by 1.1 gm. for 3 months\n" +
                        "• Quercetin: 500 mg. TID (between meals)\n" +
                        "• Prostate Glandular: 1 tablet TID\n" +
                        "• Omega 3 Fatty Acids: 1-3 gm. TID"
                ss = SpannableString(supplements_detail)
            }
            "Bronchitis" ->{
                supplements_detail = "• N-Acetyl Cysteine: 1 gm. BID\n" +
                        "• Quercetin: 500 mg. TID (between meals)\n" +
                        "• Lung Glandular: 1 tablet TID\n" +
                        "• Bromelain: 150-500 mg. TID (between meals)"
                ss = SpannableString(supplements_detail)
            }
            "Cancer Prevention" ->{
                supplements_detail = "• Most Cancers:\n" +
                        "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Omega-3 Fatty Acids : 2 - 5 gm. TID"
                ss = SpannableString(supplements_detail)
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
            }
            "Canker Sores" ->{
                supplements_detail = "• *Hydrochloric Acid: 10 - 70 grains per meal (if hypochlorhydric)\n" +
                        "• Quercetin: 250 mg. TID (between meals)\n" +
                        "• Lysine: 500 - 2000 mg. (if viral/herpetic - reduce dosage after improvement)\n" +
                        "• Acidophilis and Bifidus: apply topically to ulcer during initial stage"
                ss = SpannableString(supplements_detail)
            }
            "Cataract Prevention" ->{
                supplements_detail = "• 5-Hydroxytryptophan : 50 - 200 mg. TID (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• L-Glutathione: 500 mg. BID away from food\n" +
                        "• Quercetin (if diabetic): 500 mg. TID, 30 minutes before meals\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Melatonin: 3-6 mg. at 9PM"
                ss = SpannableString(supplements_detail)
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
            }
            "Cholelithiasis" ->{
                supplements_detail = "• L-Methionine: 1 gm.\n" +
                        "• L-Taurine: 2 - 4 gm.\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Fiber: 5 - 45 gm. in divided doses with 12 oz. of water per dose"
                ss = SpannableString(supplements_detail)
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
            }
            "Colitis" ->{
                supplements_detail = "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• EFA: 1 - 2 gm. TID between meals\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Fructooligosaccarides: 800 mg TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Fiber : 5 - 45 gm. in divided doses taken with 12 ounces of water per dose"
                ss = SpannableString(supplements_detail)
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
            }
            "Constipation" ->{
                supplements_detail = "• Fiber : 5 - 45 gm. in divided doses taken with 12 ounces of water per dose\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n"
                ss = SpannableString(supplements_detail)
            }
            "Crohn's Disease" ->{
                supplements_detail = "• Quercetin: 400 mg. 20 minutes before meals, TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Omega 3 Fatty Acids : 1-5 gm. TID between meals\n" +
                        "• Fiber: 5 - 45 gm. in divided doses at mealtime with 12 ounces of water per dose\n" +
                        "• Fructooligosaccarides: 800 mg. TID"
                ss = SpannableString(supplements_detail)
            }
            "Cystitis" ->{
                supplements_detail = "• Arginine: 500 - 2,000 mg. in divided doses on an empty stomach\n" +
                        "• Mannose (powder): 1/4 tsp. 3 - 6 times a day"
                ss = SpannableString(supplements_detail)
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
            }
            "Dysmenorrhea" ->{
                supplements_detail = "• Omega 3 and 6 Fatty Acids: 1-5 gm. TID\n" +
                        "• Ovary Glandular: 2 tablet TID\n" +
                        "• Bromelain: 250 - 500 mg. TID on an empty stomach\n" +
                        "• Quercetin: 250 - 500 mg. every 2 hours during cramping (enhances vitamin B3)"
                ss = SpannableString(supplements_detail)
            }

            "Ear Infection" ->{
                supplements_detail = "• Omega 3 Fatty Acids: 250-1000 mg.\n" +
                        "• N-Acetyl Cysteine: 500-1000 mg. BID\n" +
                        "• Quercetin: 50 mg. QID between meals\n" +
                        "• Omega 6 Fatty Acids: 250-500 mg.\n" +
                        "• Thymus Glandular: 500 mg."
                ss = SpannableString(supplements_detail)
            }
            "Eczema, Chronic" ->{
                supplements_detail = "• Omega-3 Fatty Acids : 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Hydrochloric Acid (HCl): 10 - 40 grains with each meal if hypochlohydria\n" +
                        "• Quercetin: 500 mg. 30 minutes before meals\n" +
                        "• Digestive Enzymes: 2 tablets with each meal\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals"
                ss = SpannableString(supplements_detail)
            }

            "Endometriosis" ->{
                supplements_detail = "• Omega 3 (EPA form): 1.5 - 2.0 gm. a day in divided doses\n" +
                        "• *Liver Concentrate: 25 mg. (as a lipotropic factor)\n" +
                        "• *Taurine: 100 mg. (as a lipotropic factor)\n" +
                        "• *DL-Methionine: 100 mg. (as a lipotropic factor)\n" +
                        "• *Trimethylglycine HCl: 100 mg. (as a lipotropic factor)"
                ss = SpannableString(supplements_detail)
            }

            "Erectile Dysfunction" ->{
                supplements_detail = "• Omega-3 Fatty Acids: 1 - 2 gm. TID\n" +
                        "• L-Arginine: 3,000 mg. on empty stomach\n" +
                        "• Dehydroepeandrostrone (DHEA): 20-50 mg.\n" +
                        "• Hypothalamus Glandular: 30 mg. BID\n" +
                        "• Pituitary Glandular: 20 mg. BID\n" +
                        "• Orchic Glandular: 100 mg. BID\n"
                ss = SpannableString(supplements_detail)
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
            }
            "Fibrocystic Breast Disease" ->{
                supplements_detail = "• Omega 3 Fatty Acids: 1 -5 gm. TID\n" +
                        "• Omega 6 Fatty Acids : 500 mg. TID\n" +
                        "• Acidophilus and Bifidus: 1 capsule between meals\n" +
                        "• Ovary, Pituitary, Adrenal and Liver Glandulars: 1 tablet TID\n" +
                        "• *Lipotropic factors"
                ss = SpannableString(supplements_detail)
            }

            "Fibromyalgia" ->{
                supplements_detail = "• Bromelain: 2500 mg. TID between meals\n" +
                        "• Quercetin: 250 mg. TID between meals\n" +
                        "• Melatonin: 3 mg. at 9 PM\n" +
                        "• 5-Hydroxytryptophan: begin with 50 mg. TID, increase up to 200 mg. TID if necessary (Note: approximately 1-3% of oral tryptophan enters the brain compared to 70% of oral 5-HTP)\n" +
                        "• L-Carnitine: 3 gm.\n"
                ss = SpannableString(supplements_detail)
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
            }
            "Gallstones" ->{
                supplements_detail = "• L-Methionine: 1 gm.\n" +
                        "• L-Taurine: 2 - 4 gm.\n" +
                        "• Hydrochloric Acid: 10 - 70 grains per meal (if lab work confirms)\n" +
                        "• Omega-3 Fatty Acids: 2 - 5 gm. TID\n" +
                        "• Omega-6 Fatty Acids: 1 gm. TID\n" +
                        "• Fiber: 5 - 45 gm. in divided doses with 12 oz. of water per dose\n"
                ss = SpannableString(supplements_detail)
            }
            "Gout" ->{
                supplements_detail = "• Bromelain: 250 mg. 3 times a day away from food\n" +
                        "• Omega 3: 1.5-2.0 gm. a day in divided doses\n" +
                        "• Quercetin: 400 mg. 3 times a day away from food\n" +
                        "• *Digestive Enzymes: 2 tablets with each meal"
                ss = SpannableString(supplements_detail)
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
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bipolar Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bladder Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Blood Pressure, High" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "BPH" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bronchitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cancer Prevention" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Candida Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Candidiasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Canker Sores" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cataract Prevention" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "CFS/CFIDS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "CHF" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cholecystitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cholelithiasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Chronic Fatigue Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Colitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Congestive Heart Failure" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Constipation" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Crohn's Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cystitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Depression" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Diabetes Mellitus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Dysmenorrhea" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Ear Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Eczema, Chronic" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Endometriosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Erectile Dysfunction" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Fertility" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Fibrocystic Breast Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Fibromyalgia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gallbladder Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gallstones" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gout" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Headache, General" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Headache, Migraine" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hemorrhoids" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hepatitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Herpes Simplex" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "High Blood Pressure" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "High Cholesterol" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "HIV" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hyperactivity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypercholesterolemia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypertension" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypothyroid" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "IBS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Impotence" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Incontinence, Stress" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Infertility" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Insomnia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Irritable Bowel Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Longevity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Lupus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Macular Degeneration" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Manic Depressive Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Mastitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Memory Loss" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Menopause" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Migraine Headache" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Mouth Ulcers" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Multiple Sclerosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Obesity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Osteoarthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Osteoporosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Otitis Media" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Ovarian Cancer" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Painful Menses" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Paralysis Agitans" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Parkinson's Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Peptic Ulcers" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "PMS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Premenstrual Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Psoriasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Psoriatic Arthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Regional Enteritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Rheumatoid Arthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Rosacea" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Schizophrenia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "SLE" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Sleep Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Stress Incontinence" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Systemic Lupus Erythematosus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Ulcerative Colitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Uterine Fibroids" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Vaginal Yeast Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
        }

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
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bipolar Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bladder Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Blood Pressure, High" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "BPH" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bronchitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cancer Prevention" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Candida Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Candidiasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Canker Sores" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cataract Prevention" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "CFS/CFIDS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "CHF" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cholecystitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cholelithiasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Chronic Fatigue Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Colitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Congestive Heart Failure" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Constipation" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Crohn's Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cystitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Depression" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Diabetes Mellitus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Dysmenorrhea" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Ear Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Eczema, Chronic" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Endometriosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Erectile Dysfunction" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Fertility" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Fibrocystic Breast Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Fibromyalgia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gallbladder Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gallstones" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gout" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Headache, General" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Headache, Migraine" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hemorrhoids" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hepatitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Herpes Simplex" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "High Blood Pressure" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "High Cholesterol" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "HIV" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hyperactivity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypercholesterolemia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypertension" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypothyroid" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "IBS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Impotence" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Incontinence, Stress" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Infertility" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Insomnia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Irritable Bowel Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Longevity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Lupus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Macular Degeneration" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Manic Depressive Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Mastitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Memory Loss" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Menopause" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Migraine Headache" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Mouth Ulcers" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Multiple Sclerosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
               "Obesity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Osteoarthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Osteoporosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Otitis Media" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Ovarian Cancer" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Painful Menses" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Paralysis Agitans" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Parkinson's Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Peptic Ulcers" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "PMS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Premenstrual Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Psoriasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Psoriatic Arthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Regional Enteritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Rheumatoid Arthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Rosacea" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Schizophrenia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "SLE" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Sleep Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Stress Incontinence" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Systemic Lupus Erythematosus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Ulcerative Colitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Uterine Fibroids" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Vaginal Yeast Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
        }

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
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bipolar Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bladder Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Blood Pressure, High" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "BPH" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bronchitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cancer Prevention" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Candida Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Candidiasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Canker Sores" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cataract Prevention" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "CFS/CFIDS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "CHF" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cholecystitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cholelithiasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Chronic Fatigue Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Colitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Congestive Heart Failure" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Constipation" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Crohn's Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cystitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Depression" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Diabetes Mellitus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Dysmenorrhea" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Ear Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Eczema, Chronic" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Endometriosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Erectile Dysfunction" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Fertility" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Fibrocystic Breast Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Fibromyalgia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gallbladder Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gallstones" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gout" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Headache, General" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Headache, Migraine" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hemorrhoids" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hepatitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Herpes Simplex" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "High Blood Pressure" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "High Cholesterol" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "HIV" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hyperactivity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypercholesterolemia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypertension" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypothyroid" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "IBS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Impotence" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Incontinence, Stress" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Infertility" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Insomnia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Irritable Bowel Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Longevity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Lupus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Macular Degeneration" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Manic Depressive Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Mastitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Memory Loss" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Menopause" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Migraine Headache" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Mouth Ulcers" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Multiple Sclerosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

              "Obesity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Osteoarthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Osteoporosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Otitis Media" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Ovarian Cancer" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Painful Menses" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Paralysis Agitans" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Parkinson's Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Peptic Ulcers" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "PMS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Premenstrual Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Psoriasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Psoriatic Arthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Regional Enteritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Rheumatoid Arthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Rosacea" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Schizophrenia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "SLE" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Sleep Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Stress Incontinence" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Systemic Lupus Erythematosus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Ulcerative Colitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Uterine Fibroids" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Vaginal Yeast Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
        }

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
                        "• Rule out diabetes: Fasting Glucose, Fructosamine, Hemoglobin A1c\n" +
                        "*  The recommended use of this supplement or therapy is based on a physiological mechanism or empirical data and is not necessarily supported by peer-reviewed research studies."
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
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bipolar Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bladder Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Blood Pressure, High" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "BPH" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Bronchitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cancer Prevention" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Candida Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Candidiasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Canker Sores" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cataract Prevention" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "CFS/CFIDS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "CHF" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cholecystitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cholelithiasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Chronic Fatigue Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Colitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Congestive Heart Failure" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Constipation" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Crohn's Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Cystitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Depression" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Diabetes Mellitus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Dysmenorrhea" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Ear Infection" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Eczema, Chronic" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Endometriosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Erectile Dysfunction" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Fertility" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Fibrocystic Breast Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }

            "Fibromyalgia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gallbladder Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gallstones" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Gout" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Headache, General" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Headache, Migraine" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hemorrhoids" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hepatitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Herpes Simplex" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "High Blood Pressure" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "High Cholesterol" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "HIV" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hyperactivity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypercholesterolemia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypertension" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Hypothyroid" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "IBS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Impotence" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Incontinence, Stress" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Infertility" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Insomnia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Irritable Bowel Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Longevity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Lupus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Macular Degeneration" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Manic Depressive Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Mastitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Memory Loss" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Menopause" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Migraine Headache" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Mouth Ulcers" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Multiple Sclerosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Obesity" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Osteoarthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Osteoporosis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Otitis Media" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Ovarian Cancer" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Painful Menses" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Paralysis Agitans" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Parkinson's Disease" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Peptic Ulcers" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "PMS" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Premenstrual Syndrome" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Psoriasis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Psoriatic Arthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Regional Enteritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Rheumatoid Arthritis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Rosacea" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Schizophrenia" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "SLE" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Sleep Disorder" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Stress Incontinence" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Systemic Lupus Erythematosus" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Ulcerative Colitis" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Uterine Fibroids" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
            }
            "Vaginal Yeast Infection\n" ->{
                diet_detail = ""
                ss = SpannableString(diet_detail)
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