package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityPhysicalExamBinding

class PhysicalExamActivity : AppCompatActivity() {
    lateinit var binding : ActivityPhysicalExamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhysicalExamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contentData.movementMethod = LinkMovementMethod.getInstance()

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

        binding.subHeading.text = "Blood Pressure:"
        var text = "• Orthostatic hypertension\n" +
                "Consider:  adrenal insufficiency, hypothyroidism, anemia\n" +
                "• Hypertension in a pregnant woman (accompanied by ankle edema)\n" +
                "Consider:  deficiency of protein, magnesium, vitamin B6"

        val ss = SpannableString(text)

        createLink(ss,"hypothyroidism",text,"Condition","Hypothyroid")
        createLink(ss,"magnesium",text,"Vitmain","Magnesium")
        createLink(ss,"vitamin B6",text,"Vitamin","Vitamin B6 (Pyridoxine)")

        makeBold(ss,text,"Orthostatic hypertension")
        makeBold(ss,text,"Hypertension in a pregnant woman (accompanied by ankle edema)")

        binding.contentData.text = ss

        binding.first.setOnClickListener {
            binding.subHeading.text = "Blood Pressure:"

            var text = "• Orthostatic hypertension\n" +
                    "Consider:  adrenal insufficiency, hypothyroidism, anemia\n" +
                    "• Hypertension in a pregnant woman (accompanied by ankle edema)\n" +
                    "Consider:  deficiency of protein, magnesium, vitamin B6"

            val ss = SpannableString(text)

            makeBold(ss,text,"Orthostatic hypertension")
            makeBold(ss,text,"Hypertension in a pregnant woman (accompanied by ankle edema)")

            createLink(ss,"hypothyroidism",text,"Condition","Hypothyroid")
            createLink(ss,"magnesium",text,"Vitmain","Magnesium")
            createLink(ss,"vitamin B6",text,"Vitamin","Vitamin B6 (Pyridoxine)")
            binding.contentData.text = ss

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

            var text = "• Extremely painful when hair is gently pulled\n" +
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

            val ss = SpannableString(text)

            makeBold(ss,text,"Extremely painful when hair is gently pulled")
            makeBold(ss,text,"Flaky dandruff")
            makeBold(ss,text,"Dull, lifeless hair")
            makeBold(ss,text,"Thinning hair in a postmenopausal woman")
            makeBold(ss,text,"Thinning hair in a woman taking birth control pills, pregnant or postpartum")
            makeBold(ss,text,"Thinning hair in a woman not taking birth control/estrogen or pregnant")
            makeBold(ss,text,"Hair loss")
            makeBold(ss,text,"Premature graying")

            createLink(ss,"hypothyroidism",text,"Condition","Hypothyroid")
            createLink(ss,"magnesium",text,"Vitmain","Magnesium")
            createLink(ss,"vitamin B6",text,"Vitamin","Vitamin B6 (Pyridoxine)")

            createLink(ss,"vitamin D",text,"Vitmain","Vitamin D (Cholecalciferol)")
            createLink(ss,"selenium",text,"Vitmain","Selenium")
            createLink(ss,"EFAs",text,"Fat","")
            createLink(ss,"vitamin B6",text,"Vitamin","Vitamin B6 (Pyridoxine)")
            createLink(ss,"DHEA",text,"Supplement","Dehydroepiandrosterone (DHEA)")
            createLink(ss,"folate",text,"Vitamin","Folate")
            createLink(ss,"PABA",text,"Vitamin","PABA (Para-aminobenzoic Acid)")
            createLink(ss,"hydrochloric acid",text,"Condition","Hydrochloric Acid")
            binding.contentData.text = ss


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

                val text = "• Cataract in the older patient\n" +
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

            val ss = SpannableString(text)

            makeBold(ss,text,"Cataract in the older patient")
            makeBold(ss,text,"Floaters")
            makeBold(ss,text,"Retinitis pigmentosa")
            makeBold(ss,text,"Dark circles under both eyes")
            makeBold(ss,text,"Dilated pupils to 1/4 inch or more in a child")

            createLink(ss,"vitamin D",text,"Vitmain","Vitamin D (Cholecalciferol)")
            createLink(ss,"vitamin B2",text,"Vitamin","Vitamin B2 (Riboflavin)")
            createLink(ss,"vitamin A",text,"Vitamin","Vitamin A (Retinol)")
            createLink(ss,"vitamin C",text,"Vitamin","Vitamin C (Ascorbic Acid)")
            createLink(ss,"zinc",text,"Vitamin","Zinc")
            createLink(ss,"selenium",text,"Vitamin","Selenium")
            createLink(ss,"magnesium",text,"Vitamin","Magnesium")
            createLink(ss,"choline",text,"Vitamin","Choline (Lecithin)")
            createLink(ss,"inositol",text,"Vitamin","Inositol")
            createLink(ss,"methionine",text,"Vitamin","Methionine")
            createLink(ss,"calcium",text,"Vitamin","Calcium")
            createLink(ss,"allergies",text,"Condition","Allergies")

            binding.contentData.text = ss
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
            val text = "• Polyps\n" +
                    "\n" +
                    "Consider:  allergies, especially to salicylates including aspirin, artificial colors and flavors and white willow (salix alba)\n" +
                    "• Loss of smell\n" +
                    "\n" +
                    "Consider:  deficiency of zinc, vitamin A"
            val ss = SpannableString(text)

            makeBold(ss,text,"Polyps")
            makeBold(ss,text,"Loss of smell")

            createLink(ss,"vitamin A",text,"Vitamin","Vitamin A (Retinol)")
            createLink(ss,"zinc",text,"Vitamin","Zinc")
            createLink(ss,"allergies",text,"Condition","Allergies")

            binding.contentData.text = ss

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
                val text = "• Hardened or excessive ear wax\n" +
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

            val ss = SpannableString(text)

            makeBold(ss,text,"Hardened or excessive ear wax")
            makeBold(ss,text,"Cracking behind ears")
            makeBold(ss,text,"Diagonal crease across lobes")
            makeBold(ss,text,"Fluid behind TM or recurrent otitis media")
            makeBold(ss,text,"Tinnitus")


            createLink(ss,"vitamin A",text,"Vitamin","Vitamin A (Retinol)")
//            createLink(ss,"vitamin C",text,"Vitamin","Vitamin C (Ascorbic Acid)")
            createLink(ss,"zinc",text,"Vitamin","Zinc")
//            createLink(ss,"selenium",text,"Vitamin","Selenium")
//            createLink(ss,"magnesium",text,"Vitamin","Magnesium")
//            createLink(ss,"choline",text,"Vitamin","Choline (Lecithin)")
//            createLink(ss,"inositol",text,"Vitamin","Inositol")
//            createLink(ss,"methionine",text,"Vitamin","Methionine")
//            createLink(ss,"calcium",text,"Vitamin","Calcium")
            createLink(ss,"allergies",text,"Condition","Allergies")

            binding.contentData.text = ss

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

            val text = "• Cheilosis\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin B2, vitamin B-complex\n" +
                    "• Loss of taste\n" +
                    "\n" +
                    "Consider:  deficiency of zinc\n" +
                    "• Enlarged tonsils in children\n" +
                    "\n" +
                    "Consider:  food allergies"

            val ss = SpannableString(text)

            makeBold(ss,text,"Cheilosis")
            makeBold(ss,text,"Loss of taste")
            makeBold(ss,text,"Enlarged tonsils in children")

            createLink(ss,"zinc",text,"Vitamin","Zinc")
            createLink(ss,"vitamin B2",text,"Condition","Vitamin B2 (Riboflavin)")

            binding.contentData.text = ss

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
                val text = "• Periodontal problems\n" +
                    "\n" +
                    "Consider:  deficiency of co-enzyme Q10, folate, antioxidants, calcium, vitamin C\n" +
                    "• Bruxism\n" +
                    "\n" +
                    "Consider:  allergies or stress"

            val ss = SpannableString(text)

            makeBold(ss,text,"Periodontal problems")
            makeBold(ss,text,"Bruxism")

            createLink(ss,"co-enzyme Q10",text,"Supplement","Coenzyme Q10")
            createLink(ss,"folate",text,"Vitamin","Folate")
            createLink(ss,"vitamin C",text,"Vitamin","Vitamin C (Ascorbic Acid)")
            createLink(ss,"calcium",text,"Vitamin","Calcium")
            createLink(ss,"allergies",text,"Condition","Allergies")

            binding.contentData.text = ss

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
            val text = "• Pale tongue with pale buccal membranes and inner surface of lower eyelids\n" +
                    "\n" +
                    "Consider:  anemia\n" +
                    "• Geographic tongue\n" +
                    "\n" +
                    "Consider:  deficiency of folate, vitamin B12, zinc\n" +
                    "• Swollen and scalloped\n" +
                    "\n" +
                    "Consider:  food allergies"

            val ss = SpannableString(text)

            makeBold(ss,text,"Pale tongue with pale buccal membranes and inner surface of lower eyelids")
            makeBold(ss,text,"Geographic tongue")
            makeBold(ss,text,"Swollen and scalloped")

            createLink(ss,"folate",text,"Vitamin","Folate")
            createLink(ss,"vitamin B12",text,"Vitamin","Vitamin B12 (Cobalamin)")
            createLink(ss,"zinc",text,"Vitamin","Zinc")
            createLink(ss,"food allergies",text,"Condition","Allergies")

            binding.contentData.text = ss

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


            val text = "• Acne in a teenager\n" +
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

            val ss = SpannableString(text)

            makeBold(ss,text,"Acne in a teenager")
            makeBold(ss,text,"Dilated capillaries on cheeks and edges of nose in men")
            makeBold(ss,text,"Reddened facial skin, usually on forehead and cheeks with scattered acne-like lumps")
            makeBold(ss,text,"Slightly yellow tone to facial skin in an older person")
            makeBold(ss,text,"Seborrheic dermatitis on eyebrows, center of forehead, angles of nose, or chest")

            createLink(ss,"selenium",text,"Vitamin","Selenium")
            createLink(ss,"EFAs",text,"Fat","")
            createLink(ss,"zinc",text,"Vitamin","Zinc")
            createLink(ss,"allergies",text,"Condition","Allergies")
            createLink(ss,"hydrochloric acid",text,"Supplement","Hydrochloric Acid")
            createLink(ss,"vitamin B12",text,"Vitamin","Vitamin B12 (Cobalamin)")
            createLink(ss,"folate",text,"Vitamin","Folate")
            createLink(ss,"PABA",text,"Vitamin","PABA (Para-aminobenzoic Acid)")
            createLink(ss,"vitamin B6",text,"Vitamin","Vitamin B6 (Pyridoxine)")

            binding.contentData.text = ss

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
            val text = "• Slightly yellow\n" +
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

            val ss = SpannableString(text)

            makeBold(ss,text,"Slightly yellow")
            makeBold(ss,text,"Dry/rough")
            makeBold(ss,text,"Multiple pigmented skin tags")
            makeBold(ss,text,"Yellow spots, pimples under eyes")
            makeBold(ss,text,"Red nodules on elbow")
            makeBold(ss,text,"Dermatographism")
            makeBold(ss,text,"Follicular hyperkeratosis")
            makeBold(ss,text,"Slow wound healing")
            makeBold(ss,text,"Dry, grayish skin")
            makeBold(ss,text,"Dry, scaly skin")
            makeBold(ss,text,"Scaly dark dermatitis with pigmented lesions")
            makeBold(ss,text,"Yellow with pallor and eruptions")
            makeBold(ss,text,"Irregular brownish/yellowish discoloration on anterior surface of lower leg")
            makeBold(ss,text,"Fissures in heels in men")
            makeBold(ss,text,"Easy bruising")


            createLink(ss,"selenium",text,"Vitamin","Selenium")
            createLink(ss,"EFAs",text,"Fat","")
            createLink(ss,"zinc",text,"Vitamin","Zinc")
            createLink(ss,"allergies",text,"Condition","Allergies")
            createLink(ss,"vitamin B6",text,"Vitamin","Vitamin B6 (Pyridoxine)")
            createLink(ss,"hypothyroidism ",text,"Vitamin","Hypothyroid")
            createLink(ss,"diabetes mellitus",text,"Condition","Diabetes Mellitus")
            createLink(ss,"vitamin A",text,"Vitamin","Vitamin A (Retinol)")
            createLink(ss,"vitamin C",text,"Vitamin","Vitamin C (Ascorbic Acid)")
            createLink(ss,"vitamin K",text,"Vitamin","Vitamin K (Quinones)")
            createLink(ss,"vitamin B3",text,"Vitamin","Vitamin B3 (Niacin)")
            createLink(ss,"beta carotene ",text,"Vitamin","Beta Carotene (Carotenoids)")
            createLink(ss,"biotin",text,"Vitamin","Biotin")

            binding.contentData.text = ss
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
            val text = "• Dry with fissures on knuckles\n" +
                    "\n" +
                    "Consider:  deficiency of EFAs\n" +
                    "• Callouses and contractures\n" +
                    "\n" +
                    "Consider:  deficiency of vitamin E"

            val ss = SpannableString(text)

            makeBold(ss,text,"Dry with fissures on knuckles")
            makeBold(ss,text,"Callouses and contractures")

            createLink(ss,"EFAs",text,"Fat","")
            createLink(ss,"vitamin E",text,"Vitamin","Vitamin E (Tocopherol)")

            binding.contentData.text = ss

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
            val text = "• Flattened and spooned\n" +
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

            val ss = SpannableString(text)

            makeBold(ss,text,"Flattened and spooned")
            makeBold(ss,text,"Thin, weak, bend easily in women")
            makeBold(ss,text,"White spots on nails, for teenagers")
            makeBold(ss,text,"Cracks and splits at fingertips")
            makeBold(ss,text,"Paronychia")
            makeBold(ss,text,"Brittle/splitting nails")
            makeBold(ss,text,"Brittle nails")
            makeBold(ss,text,"Horizontal and vertical ridges")
            makeBold(ss,text,"Dryness with rounded or curved nail ends")
            makeBold(ss,text,"Hangnails")
            makeBold(ss,text,"Discoloration")

            createLink(ss,"iron",text,"Vitamin","Iron")
            createLink(ss,"EFAs",text,"Fat","")
            createLink(ss,"zinc",text,"Vitamin","Zinc")
            createLink(ss,"allergies",text,"Condition","Allergies")
            createLink(ss,"hydrochloric acid",text,"Supplement","Hydrochloric Acid")
            createLink(ss,"vitamin B12",text,"Vitamin","Vitamin B12 (Cobalamin)")
            createLink(ss,"folate",text,"Vitamin","Folate")
            createLink(ss,"hypothyroidism ",text,"Vitamin","Hypothyroid")
            createLink(ss,"diabetes mellitus",text,"Condition","Diabetes Mellitus")
            createLink(ss,"vitamin C",text,"Vitamin","Vitamin C (Ascorbic Acid)")
            createLink(ss,"calcium",text,"Vitamin","Calcium")
            createLink(ss,"wheat allergy",text,"Condition","Allergies")
            createLink(ss,"pancreatic enzymes",text,"Supplement","Digestive Enzymes")

            binding.contentData.text = ss

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
            val text = "• Bursitis\n" +
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


            val ss = SpannableString(text)

            makeBold(ss,text,"Bursitis")
            makeBold(ss,text,"Costochondritis")
            makeBold(ss,text,"Degenerative arthritis, especially with crepitis behind the patella")
            makeBold(ss,text,"Enlarged, painful nodule below the patella on the anterior side")
            makeBold(ss,text,"Pain in lower leg if pressure is applied to tibia")

            createLink(ss,"selenium",text,"Vitamin","Selenium")
            createLink(ss,"vitamin B12",text,"Vitamin","Vitamin B12 (Cobalamin)")
            createLink(ss,"vitamin B6",text,"Vitamin","Vitamin B6 (Pyridoxine)")
            createLink(ss,"calcium",text,"Vitamin","Calcium")
            createLink(ss,"niacinamide",text,"Vitamin","Vitamin B3 (Niacin)")
            createLink(ss,"glucosamine",text,"Supplement","Glucosamine Sulfate")
            createLink(ss,"vitamin E",text,"Vitamin","Vitamin E (Tocopherol)")

            binding.contentData.text = ss


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


    fun makeBold(ss : SpannableString,string:String,substr:String){
        if(string.indexOf(substr)!=-1 )
            ss.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD),string.indexOf(substr),string.indexOf(substr)+substr.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }

    private fun createLink(ss: SpannableString, sub_str: String, string: String, activity: String, heading: String) {

        var index = string.indexOf(sub_str)
        while (index != -1) {
            val clickableSpan = object : ClickableSpan(){
                override fun onClick(widget: View) {
                    val intent : Intent
                    if(activity=="Condition"){
                        intent = Intent(this@PhysicalExamActivity,ConditionDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Supplement"){
                        intent = Intent(this@PhysicalExamActivity,SupplementDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Fiber"){
                        intent = Intent(this@PhysicalExamActivity,FiberDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Vitamin"){
                        intent = Intent(this@PhysicalExamActivity,VitaminMineralDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Botanical"){
                        intent = Intent(this@PhysicalExamActivity,BotanicalDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(heading == "Fat"){
                        val intent = Intent(this@PhysicalExamActivity,FattyAcidActivity::class.java)
                        startActivity(intent)
                    }
                }
            }

            ss.setSpan(clickableSpan,index,index+sub_str.length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            index = string.indexOf(sub_str, index + 1)
        }
    }
}