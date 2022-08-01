package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityClinicalListBinding
import com.example.naturalopinion.databinding.ActivityNutritionalTipsBinding

class NutritionalTipsActivity : AppCompatActivity() {
    lateinit var binding : ActivityNutritionalTipsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNutritionalTipsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        binding.backButton6.setOnClickListener { finish() }

        binding.reference.setOnClickListener {
            val intent = Intent(this,HydroTherapyActivity::class.java)
            intent.putExtra("heading","Reference")
            startActivity(intent)
        }

        binding.subHeading.text = "Eat to live, not live to eat"
        binding.contentData.text = "• A good deal of the problems with healthy diet comes from our attitudes to what it means to nourish ourselves.\n" +
                "• Eating has been associated with festive occasions and with the good life and not with what is right or important for our bodies.\n" +
                "• Commercials are seductive and misleading to the point that we have distorted our tastes almost completely.\n" +
                "• Taste is a matter of conditioning and habit. This phenomena has been noted with many animal studies. For example: Once rats were fed sugar, they gave up their normal diet. Baby food companies often sweeten and salt baby food for the mother's taste, not the baby's.\n" +
                "• Feast days are usually accompanied by lavishly rich foods and if kept to feast days, do not generally cause a problem. If, however, we eat as though every day is a feast day, the body cannot handle the stress load. The results of eating rich foods containing excessive animal proteins, fats, sugars, and refined carbohydrates are invariably digestive overload with putrefaction of undigested food and fermentation with production of toxic by products in the body.\n" +
                "• Your attitude is of paramount importance."
        binding.first.setOnClickListener {
            binding.subHeading.text = "Eat to live, not live to eat"
            binding.contentData.text = "• A good deal of the problems with healthy diet comes from our attitudes to what it means to nourish ourselves.\n" +
                    "• Eating has been associated with festive occasions and with the good life and not with what is right or important for our bodies.\n" +
                    "• Commercials are seductive and misleading to the point that we have distorted our tastes almost completely.\n" +
                    "• Taste is a matter of conditioning and habit. This phenomena has been noted with many animal studies. For example: Once rats were fed sugar, they gave up their normal diet. Baby food companies often sweeten and salt baby food for the mother's taste, not the baby's.\n" +
                    "• Feast days are usually accompanied by lavishly rich foods and if kept to feast days, do not generally cause a problem. If, however, we eat as though every day is a feast day, the body cannot handle the stress load. The results of eating rich foods containing excessive animal proteins, fats, sugars, and refined carbohydrates are invariably digestive overload with putrefaction of undigested food and fermentation with production of toxic by products in the body.\n" +
                    "• Your attitude is of paramount importance."
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
            binding.subHeading.text = "Eat what grows where you live and eat it when the land provides it"
            binding.contentData.text = "• This is an old Macrobiotic law, which unfortunately is not followed by many.\n" +
                    "• The body seems to utilize the food grown where one lives better than imported exotic foods. There may be several reasons for this including the solutions that are used to preserve the food for shipping, the depletion of nutrient value due to age (i.e. oxidation), utilizing under ripened fruit and vegetables to transport.\n" +
                    "• It is interesting that when summer comes and nature starts producing all the greens and vegetables, we roll out the barbecue and cook huge amounts of meats of all kinds. The body does not require heavy proteins and fats in the summer heat. It would be more appropriate to use meat in moderation in the cold winter months. Lettuce and other greens do not provide the calories needed in the cold either.\n" +
                    "• Grains keep over the winter and should be used more then.\n" +
                    "• Root vegetables that keep through the winter are better used then, as are nuts and seeds.\n" +
                    "• Fresh fruits and vegetables are nice, light and nutritious and are best consumed in the heat of the summer.\n" +
                    "• It is estimated that the primitive man had a range area of up to five hundred miles in which he foraged for food. Find out what grows naturally in that range for yourself and make those foods the majority of your diet."

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
            binding.subHeading.text = "Eat nothing that won't spoil but eat it before it does"
            binding.contentData.text = "• All our foods have a natural shelf life, meaning that there is a limit to when they can be consumed safely and when these foods will provide the maximum nutrition with the least amount of noxious substances formed. Using various methods to artificially extend the shelf life is usually accompanied by a denaturing of the food, depleting the value and in some cases producing harmful toxins.\n" +
                    "• Milk is a good example of this guideline. Good unpasteurized milk (raw milk) has a relatively short shelf life and when taken in \"moderation\" is not a bad food. With pasteurization (cooking), although it is supposed to destroy pathological bacteria, destroys the friendly bacteria and the casein, the main milk protein, is changed to calcium caseinate, which is virtually indigestible."

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
            binding.subHeading.text = "Variety is the spice of life"
            binding.contentData.text = "• It is estimated that the average person eats, at most, a variety of 70 foods of the some two thousand different types available.\n" +
                    "• This tendency tends to present a problem after an extended period of time, especially if digestion is poor.\n" +
                    "• The body develops an intolerance to the foods and begins to react producing a variety of symptoms. This is called the monotonous diet.\n" +
                    "• The second part of this guideline is that, with the increase of variety of foods, only a few foods should be eaten at any one time. Having a smorgasbord at every meal is very stressful, as the body requires different enzymes to digest different foods. Digestion cannot be successful if the system is overloaded.\n" +
                    "• The same foods should not be eaten every day. Rotation of the foods and food groups is essential. This is the basis of the rotation diet for allergic patients. Think about the foods that you eat on a daily monotonous basis.\n" +
                    "• Most people consume daily and several times per day: milk, wheat, sugar, coffee, tea, and one kind of meat. It is interesting to note that these very substances are the highest on the allergy lists. When it became popular to substitute soy for milk because of milk intolerance, soy was overused again, and now many people are intolerant of soy."


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
            binding.subHeading.text = "Be moderate"
            binding.contentData.text = "• Moderation seems to be the key to a great many things in life and your diet is no exception. If you take a person and give him wine every day, the liver begins to swell and eventually cirrhosis develops. But if the same person drinks a moderate amount of wine once in a while the liver has a chance to recover before the next exposure.\n" +
                    "• Too much protein and animal products burden the system and no longer provide the energy or repair function they are supposed to provide."

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
            binding.subHeading.text = "Eat and chew your food correctly"
            binding.contentData.text = "• Probably the most important guideline for better health with nutrition is the advice to chew your food. Part of the program at the great Myer Clinic in Austria is simply teaching people to chew their food.\n" +
                    "• Digestion is likened to buttoning a long coat - if the first button is not done right, none of the others line up. Mixing the food well with saliva is an important step in stimulating digestion.\n" +
                    "• Take your time to eat. You cannot eat on the run and expect things to work.\n" +
                    "• Do not eat if you are tired or emotionally upset. Rest and calm down. Then eat lightly and chew your food well.\n" +
                    "• Do not use fluid with your meals. This habit is a bad one. Often we drink liquid with our meals to wash down only partially masticated (chewed) food.\n" +
                    "• Small sips of liquid may be used to refresh your palette between foods. Too much liquid also dilutes the gastric enzymes needed to digest your dinner."

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
            binding.subHeading.text = "Avoid foods with high toxic contents and residue"
            binding.contentData.text = "• In his book, \"Diet for a New America,\" John Robbins discusses the toxic contents of the various food groups. It seems only wise to eat the foods with least amount of poisons and the easiest to digest.\n" +
                    "• Toxicities by group are:\n" +
                    "• Animal products, i.e., meats, contain approximately 50%\n" +
                    "• Dairy products, i.e., milk, cheese, yogurt, contain approximately 25%\n" +
                    "• Vegetables and fruits contain approximately 11%\n" +
                    "• Nuts, seed and grains contain approximately 5%"

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
    }
}