package com.example.naturalopinion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ClickableSpan
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityProImmuneFoodBinding

class ProImmuneFood : AppCompatActivity() {
    lateinit var binding : ActivityProImmuneFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProImmuneFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        binding.backButton6.setOnClickListener { finish() }

        binding.first.setOnClickListener {
            setPro()
            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.first.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.second.strokeWidth = 5

        }
        binding.second.setOnClickListener {
            binding.subHeading.text = "Anti-Immunity Foods"
                val s = "The foods in this list should be avoided to minimize your risk of diet-induced cancer and to promote maximum immune responsiveness.\n" +
                    "Beverages:\n" +
                    "Alcohol\n" +
                    "All artificially sweetened drinks\n" +
                    "Artificial fruit drinks\n" +
                    "Canned and pasteurized juices\n" +
                    "Cocoa\n" +
                    "Coffee\n" +
                    "Flavored and colored beverages\n" +
                    "Non-dairy creamers\n" +
                    "Dairy Products:\n" +
                    "All orange and pasteurized cheeses\n" +
                    "All processed and imitation butter\n" +
                    "Ice cream, and toppings\n" +
                    "Eggs:\n" +
                    "Fried\n" +
                    "Fruit:\n" +
                    "Canned, sweetened\n" +
                    "Grains:\n" +
                    "Hull-less grains and seeds (pasta, crackers, snack foods, white rice, prepared or cold cereal, cooked seeds)\n" +
                    "White flour products\n" +
                    "Meats:\n" +
                    "All red meats\n" +
                    "Nuts:\n" +
                    "Roasted and/or salted, especially peanuts\n" +
                    "Oils:\n" +
                    "Hydrogenated margarine\n" +
                    "Refined fats and oils (unsaturated as well as saturated)\n" +
                    "Shortening\n" +
                    "Seasonings:\n" +
                    "Excessive use of hot spices\n" +
                    "Pepper\n" +
                    "Soups:\n" +
                    "Canned and creamed (thickened)\n" +
                    "Commercial bouillons\n" +
                    "Fat stock\n" +
                    "Sweets:\n" +
                    "Refined sugars (white, brown, turbinado)\n" +
                    "All artificial sweets\n" +
                    "Candy\n" +
                    "Chocolate\n" +
                    "Syrup\n" +
                    "Vegetables:\n" +
                    "Canned\n" +
                    "Corn chips\n" +
                    "Deep-fried potatoes in any form\n" +
                    "Additional recommendations:\n" +
                    "Avoid eating anything that has been sprayed with insecticides\n" +
                    "Avoid eating foods with additives (especially monosodium glutamate [MSG] and others ending in \"-ate\")\n" +
                    "Foods with artificial colors, flavors, and preservatives"
            val ss = SpannableString(s)
            makeBold(ss,s,"Beverages:")
            makeBold(ss,s,"Dairy Products:")
            makeBold(ss,s,"Eggs:")
            makeBold(ss,s,"Fruit:")
            makeBold(ss,s,"Grains:")
            makeBold(ss,s,"Meats:")
            makeBold(ss,s,"Nuts:")
            makeBold(ss,s,"Oils:")
            makeBold(ss,s,"Seasonings:")
            makeBold(ss,s,"Soups:")
            makeBold(ss,s,"Additional recommendations:")
            makeBold(ss,s,"Sweets:")
            makeBold(ss,s,"Vegetables:")

            binding.contentData.text = ss

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.secondText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.second.strokeWidth = 0

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5
        }
    }

    private fun setPro() {

        binding.subHeading.text = "Pro-Immunity Foods"
//        binding.contentData.text =
            var s = "Beverages:\n" +
                "Fresh fruit juices\n" +
                "Herb teas (e.g. Mathake*, chamomile, mint, papaya, no caffeine)\n" +
                "Vegetable juices\n" +
                "Dairy Products:\n" +
                "Buttermilk\n" +
                "Eggs (poached or soft boiled)\n" +
                "Nonfat cottage cheese\n" +
                "Raw milk\n" +
                "Uncolored cheese\n" +
                "Yogurt\n" +
                "Fruit:\n" +
                "All dried (without sulfur), stewed, fresh, and frozen (unsweetened)\n" +
                "Grains:\n" +
                "Brown rice\n" +
                "Cream of wheat\n" +
                "Whole grain bread (e.g. rye, oats, wheat, bran, buckwheat, millet)\n" +
                "Whole grain cereals (e.g. rye, oats, wheat, bran, buckwheat, millet)\n" +
                "Whole grain muffin (e.g. rye, oats, wheat, bran, buckwheat, millet)\n" +
                "Whole seeds (sesame, pumpkin, sunflower, flaxseed)\n" +
                "Meats:\n" +
                "Gradually reduce\n" +
                "Nuts:\n" +
                "All fresh, raw, or lightly roasted (unsalted)\n" +
                "Oils:\n" +
                "Cold-pressed, extra-virgin olive oil\n" +
                "Seasonings:\n" +
                "Garlic\n" +
                "Marjoram\n" +
                "Onion\n" +
                "Parsley\n" +
                "Rosemary\n" +
                "Soups:\n" +
                "Any soups made from scratch (e.g. salt-free vegetables, chicken, barley, millet, brown rice)\n" +
                "Sprouts:\n" +
                "Lentil\n" +
                "Mung\n" +
                "Pea\n" +
                "Wheat\n" +
                "Sweets:\n" +
                "Pure maple syrup (in limited amounts only)\n" +
                "Pure, unfiltered honey\n" +
                "Unsulfured molasses\n" +
                "Vegetables:\n" +
                "All raw and not overcooked, fresh or frozen\n" +
                "Potatoes (baked or boiled)\n" +
                "\n" +
                "\n" +
                "* A Fijian herb long utilized to stimulate immune reactivity, only recently introduced in the West."
        val ss = SpannableString(s)
        makeBold(ss,s,"Beverages:")
        makeBold(ss,s,"Dairy Products:")
        makeBold(ss,s,"Fruit:")
        makeBold(ss,s,"Grains:")
        makeBold(ss,s,"Meats:")
        makeBold(ss,s,"Nuts:")
        makeBold(ss,s,"Oils:")
        makeBold(ss,s,"Seasonings:")
        makeBold(ss,s,"Soups:")
        makeBold(ss,s,"Sprouts:")
        makeBold(ss,s,"Sweets:")
        makeBold(ss,s,"Vegetables:")

        binding.contentData.text = ss
    }
    fun makeBold(ss : SpannableString,string:String,substr:String){
        ss.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD),string.indexOf(substr),string.indexOf(substr)+substr.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
}