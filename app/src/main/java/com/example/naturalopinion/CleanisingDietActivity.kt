package com.example.naturalopinion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityCleanisingDietBinding

class CleanisingDietActivity : AppCompatActivity() {
    lateinit var binding : ActivityCleanisingDietBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCleanisingDietBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        binding.subHeading.text = "Steamed vegetables:"
        binding.contentData.text = "• The primary reason for using steamed vegetables is that steaming improves the utilization or the availability of the food substances and it reduces the irritating residue in the gut, allowing it to restore itself.\n" +
                "• Eat a variety of any and all vegetables that you tolerate.\n" +
                "• Do not use aluminum cookware or a microwave."

        binding.backButton6.setOnClickListener { finish() }
        binding.first.setOnClickListener {
            binding.subHeading.text = "Steamed vegetables:"
            binding.contentData.text = "• The primary reason for using steamed vegetables is that steaming improves the utilization or the availability of the food substances and it reduces the irritating residue in the gut, allowing it to restore itself.\n" +
                    "• Eat a variety of any and all vegetables that you tolerate.\n" +
                    "• Do not use aluminum cookware or a microwave."
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
            binding.subHeading.text = "Grains:"
            binding.contentData.text = "• Eat one to two cups of cooked grains per day of those you tolerate.\n" +
                    "• Allowed grains are: millet, basmati or brown rice, quinoa, and amaranth.\n" +
                    "• Other grain foods that may be eaten are rice crisps and wasa crackers."


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
            binding.subHeading.text = "Fish:"
            binding.contentData.text = "• Deep sea fish is preferred - no shellfish.\n" +
                    "• The fish should be poached, baked, steamed, or broiled."


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
            binding.subHeading.text = "Chicken:"
            binding.contentData.text = "• Eat only white meat and do not eat the skin.\n" +
                    "• The chicken should be baked, broiled, or steamed."


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
            binding.subHeading.text = "Fruit:"
            binding.contentData.text = "• Eat 1 or 2 pieces of practically any fruit except citrus."


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
            binding.subHeading.text = "Sweeteners:"
            binding.contentData.text = "• Very small amounts of maple syrup and honey may be used.\n" +
                    "Absolutely no sugar, Nutrasweet, or any other sweetener is allowed."


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
            binding.subHeading.text = "Butter/Oils:"
            binding.contentData.text = "• For butter, mix together 1 pound of butter and 1 cup of extra virgin olive oil (from a new dark jar). Whip at room temperature and store in the refrigerator. Provides the benefits and taste of butter and essential fatty acids.\n" +
                    "• Use extra virgin olive oil for all other situations requiring oil."


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
            binding.subHeading.text = "Herbal teas and good water to drink:"
            binding.contentData.text = "• Drink 8 to 10 glasses of reverse-osmosis filtered water every day.\n" +
                    "• Drink 2 to 4 cups of herbal tea. Herbal teas are best taken in the evening, sipped slowly. You might try taking them by the teaspoonful for a time."


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
            binding.subHeading.text = "For the time-being, avoid the following foods:"
            binding.contentData.text = "• Milk, cheese, and eggs\n" +
                    "• Breads and white flour\n" +
                    "• Fried food of any kind\n" +
                    "• Tea, coffee, and alcohol\n" +
                    "• Peanuts and peanut butter\n" +
                    "• Citrus except for lemon\n" +
                    "• Meat - red meat and especially pork and pork products\n" +
                    "• Sugar, Nutrasweet, and all sweeteners (except maple syrup and honey)"

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
            binding.subHeading.text = "The approach to meals:"
            binding.contentData.text = "• Eat only fruit for breakfast. Steam the vegetables you're going to have for lunch. Save the broth.\n" +
                    "Drink the broth from the vegetable steamer at 11:00 AM with a little sea salt.\n" +
                    "Eat the steamed vegetables and some kind of grain for lunch.\n" +
                    "Have steamed vegetables, grain, and chicken or fish for dinner."

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

    }
}