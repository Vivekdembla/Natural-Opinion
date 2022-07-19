package com.example.naturalopinion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityPhysicalExamBinding

class PhysicalExamActivity : AppCompatActivity() {
    lateinit var binding : ActivityPhysicalExamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhysicalExamBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        binding.backButton6.setOnClickListener { finish() }

        binding.subHeading.text = "Blood Pressure:"
        binding.contentData.text = "• Orthostatic hypertension\n" +
                "Consider:  adrenal insufficiency, hypothyroidism, anemia\n" +
                "• Hypertension in a pregnant woman (accompanied by ankle edema)\n" +
                "Consider:  deficiency of protein, magnesium, vitamin B6"

        binding.first.setOnClickListener {
            binding.subHeading.text = "Blood Pressure:"
            binding.contentData.text = "• Orthostatic hypertension\n" +
                    "Consider:  adrenal insufficiency, hypothyroidism, anemia\n" +
                    "• Hypertension in a pregnant woman (accompanied by ankle edema)\n" +
                    "Consider:  deficiency of protein, magnesium, vitamin B6"

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.first.strokeWidth = 0

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

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

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5


        }
        binding.second.setOnClickListener {
            binding.subHeading.text = "Hair:"
            binding.contentData.text = "• Extremely painful when hair is gently pulled\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin D\n" +
                    "• Flaky dandruff\n" +
                    "\n" +
                    "Consider:  deficiency of selenium, EFAs, vitamin B-complex with emphasis on vitamin B6\n" +
                    "• Dull, lifeless hair\n" +
                    "\n" +
                    "Consider:  deficiency of EFAs\n" +
                    "• Thinning hair in a postmenopausal woman\n" +
                    "\n" +
                    "Consider:  deficiency of DHEA\n" +
                    "• Thinning hair in a woman taking birth control pills, pregnant or postpartum\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin B-complex with emphasis of vitamin B6 and folate\n" +
                    "• Thinning hair in a woman not taking birth control/estrogen or pregnant\n" +
                    "\n" +
                    "Consider:  deficiency of hydrochloric acid and pepsin\n" +
                    "• Hair loss\n" +
                    "\n" +
                    "Consider:  parasites or heavy metal toxicity\n" +
                    "Consider:  deficiency of vitamin B-complex, EFAs\n" +
                    "• Premature graying\n" +
                    "\n" +
                    "Consider:  deficiency of PABA"

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5


            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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
            binding.subHeading.text = "Eyes:"
            binding.contentData.text = "• Cataract in the older patient\n" +
                    "\n" +
                    "Consider:  glucose imbalance\n" +
                    "Consider:  deficiency of vitamin B2, vitamin A, vitamin C, zinc, selenium, magnesium\n" +
                    "• Floaters\n" +
                    "\n" +
                    "Consider:  deficiency of choline, inositol, methionine\n" +
                    "• Retinitis pigmentosa\n" +
                    "\n" +
                    "Consider:  deficiency of calcium, vitamin D\n" +
                    "• Dark circles under both eyes\n" +
                    "\n" +
                    "Consider:  allergies, fatigue, emotional upset, pregnancy, hormone treatment\n" +
                    "• Dilated pupils to 1/4 inch or more in a child\n" +
                    "\n" +
                    "Consider:  allergies, especially to milk"

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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
            binding.subHeading.text = "Nose:"
            binding.contentData.text = "• Polyps\n" +
                    "\n" +
                    "Consider:  allergies, especially to salicylates including aspirin, artificial colors and flavors and white willow (salix alba)\n" +
                    "• Loss of smell\n" +
                    "\n" +
                    "Consider:  deficiency of zinc, vitamin A"

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5


            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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
            binding.subHeading.text = "Ears:"
            binding.contentData.text = "• Hardened or excessive ear wax\n" +
                    "\n" +
                    "Consider:  deficiency of EFAs\n" +
                    "• Cracking behind ears\n" +
                    "\n" +
                    "Consider:  deficiency of zinc\n" +
                    "• Diagonal crease across lobes\n" +
                    "\n" +
                    "Consider:  cardiovascular disease\n" +
                    "Consider:  deficiency of vitamin E\n" +
                    "• Fluid behind TM or recurrent otitis media\n" +
                    "\n" +
                    "Consider:  allergies, especially to milk\n" +
                    "• Tinnitus\n" +
                    "\n" +
                    "Consider:  allergies, aspirin toxicity or cardiovascular disease"


            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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
            binding.subHeading.text = "Mouth:"
            binding.contentData.text = "• Cheilosis\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin B2, vitamin B-complex\n" +
                    "• Loss of taste\n" +
                    "\n" +
                    "Consider:  deficiency of zinc\n" +
                    "• Enlarged tonsils in children\n" +
                    "\n" +
                    "Consider:  food allergies"

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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
            binding.subHeading.text = "Teeth:"
            binding.contentData.text = "• Periodontal problems\n" +
                    "\n" +
                    "Consider:  deficiency of co-enzyme Q10, folate, antioxidants, calcium, vitamin C\n" +
                    "• Bruxism\n" +
                    "\n" +
                    "Consider:  allergies or stress"

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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
            binding.subHeading.text = "Tongue:"
            binding.contentData.text = "• Pale tongue with pale buccal membranes and inner surface of lower eyelids\n" +
                    "\n" +
                    "Consider:  anemia\n" +
                    "• Geographic tongue\n" +
                    "\n" +
                    "Consider:  deficiency of folate, vitamin B12, zinc\n" +
                    "• Swollen and scalloped\n" +
                    "\n" +
                    "Consider:  food allergies"

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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
            binding.subHeading.text = "Face:"
            binding.contentData.text = "• Acne in a teenager\n" +
                    "\n" +
                    "Consider:  allergies\n" +
                    "Consider:  deficiency of zinc, EFAs, selenium in boys\n" +
                    "• Dilated capillaries on cheeks and edges of nose in men\n" +
                    "\n" +
                    "Consider:  alcoholism\n" +
                    "Consider:  deficiency of hydrochloric acid and low pepsin production\n" +
                    "• Reddened facial skin, usually on forehead and cheeks with scattered acne-like lumps\n" +
                    "\n" +
                    "Consider:  deficiency of hydrochloric acid and low pepsin production\n" +
                    "• Slightly yellow tone to facial skin in an older person\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin B12, folate, vitamin B-complex\n" +
                    "• Seborrheic dermatitis on eyebrows, center of forehead, angles of nose, or chest\n" +
                    "\n" +
                    "Consider:  deficiency of PABA, vitamin B6, vitamin B-complex, EFAs"

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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
            binding.subHeading.text = "Skin:"
            binding.contentData.text = "• Slightly yellow\n" +
                    "\n" +
                    "Consider:  overconsumption of carrots or hypothyroidism (thyroid provides the hormone necessary to transform beta carotene to vitamin A)\n" +
                    "• Dry/rough\n" +
                    "\n" +
                    "Consider:  deficiency of EFAs, vitamin A\n" +
                    "• Multiple pigmented skin tags\n" +
                    "\n" +
                    "Consider:  diabetes mellitus, especially if female\n" +
                    "• Yellow spots, pimples under eyes\n" +
                    "\n" +
                    "Consider:  diabetes mellitus or hypoglycemia\n" +
                    "• Red nodules on elbow\n" +
                    "\n" +
                    "Consider:  deficiency of EFAs\n" +
                    "• Dermatographism\n" +
                    "\n" +
                    "Consider:  allergies\n" +
                    "• Follicular hyperkeratosis\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin A, EFAs, zinc\n" +
                    "• Slow wound healing\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin A, EFAs, vitamin B6, vitamin C, zinc\n" +
                    "Consider:  heavy metal toxicity\n" +
                    "• Dry, grayish skin\n" +
                    "\n" +
                    "Consider:  deficiency of biotin\n" +
                    "• Dry, scaly skin\n" +
                    "\n" +
                    "Consider:  cadmium toxicity\n" +
                    "• Scaly dark dermatitis with pigmented lesions\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin B3\n" +
                    "• Yellow with pallor and eruptions\n" +
                    "\n" +
                    "Consider:  selenium toxicity\n" +
                    "• Irregular brownish/yellowish discoloration on anterior surface of lower leg\n" +
                    "\n" +
                    "Consider:  diabetes mellitus\n" +
                    "• Fissures in heels in men\n" +
                    "\n" +
                    "Consider:  deficiency of EFAs, zinc\n" +
                    "• Easy bruising\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin C, vitamin K"

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5


            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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
        binding.eleven.setOnClickListener {
            binding.subHeading.text = "Hands:"
            binding.contentData.text = "• Dry with fissures on knuckles\n" +
                    "\n" +
                    "Consider:  deficiency of EFAs\n" +
                    "• Callouses and contractures\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin E"

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.eleven.strokeWidth = 0

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
        binding.twelve.setOnClickListener {
            binding.subHeading.text = "Nails:"
            binding.contentData.text = "• Flattened and spooned\n" +
                    "\n" +
                    "Consider:  iron deficiency anemia\n" +
                    "Consider:  deficiency of hydrochloric acid or malabsorption\n" +
                    "• Thin, weak, bend easily in women\n" +
                    "\n" +
                    "Consider:  hypothyroidism\n" +
                    "Consider:  deficiency of hydrochloric acid and pepsin, EFAs, calcium, zinc\n" +
                    "• White spots on nails, for teenagers\n" +
                    "\n" +
                    "Consider:  malabsorption due to gluten/gliadin intolerance (wheat allergy) or low pancreatic enzymes\n" +
                    "Consider:  deficiency of zinc\n" +
                    "• Cracks and splits at fingertips\n" +
                    "\n" +
                    "Consider:  deficiency of zinc, EFAs\n" +
                    "• Paronychia\n" +
                    "\n" +
                    "Consider:  deficiency of EFAs, zinc\n" +
                    "• Brittle/splitting nails\n" +
                    "\n" +
                    "Consider:  deficiency of hydrochloric acid and vitamin B12\n" +
                    "• Brittle nails\n" +
                    "\n" +
                    "Consider:  deficiency of calcium, iron, zinc\n" +
                    "• Horizontal and vertical ridges\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin B-complex\n" +
                    "• Dryness with rounded or curved nail ends\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin B12\n" +
                    "• Hangnails\n" +
                    "\n" +
                    "Consider:  deficiency of protein, folate, vitamin C\n" +
                    "• Discoloration\n" +
                    "\n" +
                    "Consider:  diabetes mellitus or allergies"

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteen.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.twelve.strokeWidth = 0

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
        binding.thirteen.setOnClickListener {
            binding.subHeading.text = "Musculoskeletal:"
            binding.contentData.text = "• Bursitis\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin B12\n" +
                    "• Costochondritis\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin B6, spinal adjustment\n" +
                    "• Degenerative arthritis, especially with crepitis behind the patella\n" +
                    "\n" +
                    "Consider:  deficiency of niacinamide, glucosamine\n" +
                    "• Enlarged, painful nodule below the patella on the anterior side\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin E, selenium\n" +
                    "• Pain in lower leg if pressure is applied to tibia\n" +
                    "\n" +
                    "Consider:  deficiency of calcium, niacinamide"

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

            binding.ten.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.tenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.ten.strokeWidth = 5

            binding.thirteen.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.thirteenText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.thirteen.strokeWidth = 0

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