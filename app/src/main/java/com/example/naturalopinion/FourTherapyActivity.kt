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
import com.example.naturalopinion.databinding.ActivityForgotBinding
import com.example.naturalopinion.databinding.ActivityFourTherapyBinding
import com.example.naturalopinion.databinding.ActivityProImmuneFoodBinding

class FourTherapyActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourTherapyBinding
    var heading = ""
    var ss = SpannableString("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourTherapyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contentData.movementMethod = LinkMovementMethod.getInstance()

        heading = intent.getStringExtra("heading").toString()


        if(heading=="Crohn's Disease"){
            binding.fiber.text = "Crohn's Disease and Ulcerative Colitis IV Treatment"
        }else if(heading=="Macular Degeneration"){
            binding.fiber.text = "Macular Degeneration IV Treatment"
        }else if(heading=="Migraine Headaches"){
            binding.fiber.text = "Migraine IV Treatment"
        }else if(heading=="IV Migraine Push"){
            binding.fiber.text = "Migraine IV Push Treatment"
        }else{
            binding.fiber.text = heading + " IV Treatment"
        }

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

        setOptions(heading)
        setFirst(heading)
        binding.first.setOnClickListener {
            setFirst(heading)
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

        }
        binding.second.setOnClickListener {
            setSecond(heading)
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


        }
        binding.third.setOnClickListener {

            setThird(heading)
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

        }
        binding.forth.setOnClickListener {
            setForth(heading)

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



        }

    }

    private fun setForth(heading: String) {
        var s = ""
        when(heading){
            "Antiviral" -> {
                s = "IV:\n" +
                        "Selenium: 2 cc\n" +
                        "Vitamin B-complex: 2 ml.\n" +
                        "Dexpanthenol: 2 ml.\n" +
                        "Hydroxycobalamin: 1 ml.\n" +
                        "Magnesium chloride: 5 ml.\n" +
                        "HCl: 5 ml.\n" +
                        "Ascorbic acid (500 mg/ml): 10 ml\n" +
                        "Directions:\n" +
                        "In 100 ml. of lactated ringers, give over 30 minutes.\n" +
                        "IV HCl potentiates the WBCs but do not use in infections that have no outlet for drainage (e.g. brain abscess).\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
                ss = SpannableString(s)

            }
        }
        makeBold(ss,s,"IV:")
        makeBold(ss,s,"Directions:")
        setLinks(ss,s)
        binding.contentData.text = ss

    }

    private fun setThird(heading: String) {
        var s = ""
        when(heading){
            "Antiviral" -> {
                s = "IV:\n" +
                        "Ascorbic acid (500mg./ml.): 100 ml.\n" +
                        "Calcium gluconate: 50 ml.\n" +
                        "Vitamin B-complex: 5 ml.\n" +
                        "Hydroxycobalamin: 3 ml.\n" +
                        "Pyridoxine: 3 ml.\n" +
                        "Magnesium chloride: 10 ml.\n" +
                        "ACE (adrenal cortical extract): 6 ml.\n" +
                        "Sterile water: 450 ml.\n" +
                        "Directions:\n" +
                        "Administer over at least 2.5 hours.\n" +
                        "Use a large vein."
            }
            "Tonic Therapy" -> {
                s = "IV:\n" +
                        "AMP (50 mg.): 2 cc\n" +
                        "Glycyrrhiza (glycyron) (2 mg.): 2 cc\n" +
                        "Germanium (100 mg.): 1 cc\n" +
                        "Normal saline: 5 - 7 cc\n" +
                        "1/2 Normal saline: 100 - 125 cc\n" +
                        "or\n" +
                        "Lactated Ringer's: 100 - 125 cc\n" +
                        "Directions:\n" +
                        "Give IV over 30 - 45 minute period.\n" +
                        "Give K+ before and after.\n" +
                        "Indications:\n" +
                        "Allergic rhinitis, chronic sinusitis\n" +
                        "Asthma\n" +
                        "Chronic fatigue syndrome (CFS)\n" +
                        "Congestive heart failure (CHF)\n" +
                        "Depression, chronic\n" +
                        "Fibromyalgia\n" +
                        "Angina\n" +
                        "Urticaria\n" +
                        "Muscle spasms\n" +
                        "Acute infections\n" +
                        "Senile dementia"
            }
        }
        ss = SpannableString(s)
        makeBold(ss,s,"IV:")
        makeBold(ss,s,"Directions:")

        setLinks(ss,s)
        binding.contentData.text = ss

    }

    private fun setSecond(heading: String) {
        var s = ""
        when(heading){
            "Antiviral" -> {
                s = "IV:\n" +
                        "Vitamin B-complex: 1 cc\n" +
                        "Vitamin B12: l cc\n" +
                        "Pantothenic acid: 1 cc\n" +
                        "Vitamin B6: 1 cc\n" +
                        "Magnesium: 1 cc\n" +
                        "Calcium glyceroposphate: 1cc\n" +
                        "Sodium ascorbate: 9 cc\n" +
                        "Saline: 5 cc\n" +
                        "Directions:\n" +
                        "Do as a slow IV push. If painful inject 1/2 cc, wait, inject another 1/2 cc.\n" +
                        "Patient can squeeze a ball with same hand to enhance blood flow."
            }
            "Asthma" -> {
                s = "IV:\n" +
                        "L-Arginine: 9 cc\n" +
                        "Magnesium sulfate 50%: 10 cc\n" +
                        "Vitamin B6: 5 cc\n" +
                        "ACE (adrenal cortical extract): 20 cc\n" +
                        "Vitamin B12: l0 cc\n" +
                        "Vitamin C: 20 cc\n" +
                        "Vitamin B-complex: 2 cc\n" +
                        "1/2 Normal saline: 250 cc\n" +
                        "Total: 326 cc\n" +
                        "Directions:\n" +
                        "In 250 cc 1/2 normal saline run over 1-2 hours\n" +
                        "Slow down if magnesium is \"over heating.\""
            }
            "Tonic Therapy" -> {
                s = "IV:\n" +
                        "Vitamin B12 (IM only):1 cc--0.38 mOsm\n" +
                        "Selenium 40 mcg./cc.:10 cc--0.0l mOsm\n" +
                        "Vitamin B-complex: 2 cc--4.28 mOsm\n" +
                        "Vitamin B5 (Dexpanthenol) 500 mg: 1 cc--2.6 mOsm\n" +
                        "Magnesium sulfate (500 mg./ml.): 2 cc--8.12 mOsm\n" +
                        "HCl (2 mg./ml. of 1:500): 5 cc--0.55 mOsm\n" +
                        "Ascorbic acid (500 mg/ml): l0 cc--29.2 mOsm\n" +
                        "1/2 Normal saline (0.45%): 125 cc--20.0 mOsm"
            }
        }
        ss = SpannableString(s)
        makeBold(ss,s,"IV:")
        makeBold(ss,s,"Directions:")

        setLinks(ss,s)
        binding.contentData.text = ss
    }

    private fun setFirst(heading: String) {
        var s = ""
        when(heading){
            "Abnormal Sulfur Metabolism"->{
                s = "IV:\n" +
                        "• Molybdenum: 2 cc\n" +
                        "• Vitamin B6: 5 cc\n" +
                        "• Vitamin B-complex: 2 cc\n" +
                        "• Vitamin B12: 10 cc\n" +
                        "• 1/2 Normal saline or lactated ringers: 150 cc\n" +
                        "Directions:\n" +
                        "• Give over a 30-45 minute span, usually twice weekly.\n" +
                        "• Check RBC and serum copper prior to 1st IV, 5th IV, and l0th (or last) IV.\n" +
                        "• Add 1 mg copper if serum or RBC copper drops or if complaint of onset of depression.\n" +
                        "• Repeat urinary sulfite and/or 24-hr urine for sulfur and sulfate after 6 treatments.\n" +
                        "• In cases of allergy and asthma, screen ingredients for possible hypersensitivity before first administration. If abnormal, check with doctor.\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
                ss = SpannableString(s)
                makeBold(ss,s,"IV")
                makeBold(ss,s,"Directions:")
            }
            "Acne" -> {
                s = "IV:\n" +
                        "Folic acid: 0.5 cc (IM injection only)\n" +
                        "• Vitamin B-complex: 1 cc\n" +
                        "• Riboflavin: 1 cc\n" +
                        "• Pyridoxine HCl: 1 cc\n" +
                        "• Histadine: 0.5 cc\n" +
                        "• Trace minerals #5: 2 cc\n" +
                        "• Sterile water: 30 cc\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
                ss = SpannableString(s)
                makeBold(ss,s,"IV:")
            }
            "Alcoholism"->{
                s = "IV:\n" +
                        "Vitamin E: 2 cc (IM injection only)\n" +
                        "Folic acid: 1 cc (IM injection only)\n" +
                        "Hydroxycobalmin: 1 cc (IM injection only)\n" +
                        "Glutathione: 3 cc\n" +
                        "Niacin: 1 cc\n" +
                        "Pantothenic acid: 3 cc\n" +
                        "Vitamin B-complex: 2 cc\n" +
                        "Magnesium chloride: 2 cc\n" +
                        "MTE #7: 2 cc\n" +
                        "Vitamin C: 6 cc\n" +
                        "Ca1cium phosphate: 2 cc\n" +
                        "Sterile water: 20 cc\n" +
                        "Directions:\n" +
                        "Give 3 times a week for 1 month.\n" +
                        "Then once a week for 1 month.\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
                ss = SpannableString(s)
                makeBold(ss,s,"IV:")
                makeBold(ss,s,"Directions:")
            }
            "Anti-Infection"->{
                s = "IV:\n" +
                        "Vitamin B-complex: 1 ml\n" +
                        "Dexpanthenol: 2 ml\n" +
                        "Hydroxycobalamin: 1 ml\n" +
                        "Magnesium chloride: 5 ml\n" +
                        "Hydrochloric acid: 5 ml\n" +
                        "Ascorbic acid (500 mg/ml): l0 ml\n" +
                        "Lactated Ringer's: 100 ml\n" +
                        "Directions:\n" +
                        "Give over 30 minute period\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
                ss = SpannableString(s)
                makeBold(ss,s,"IV:")
                makeBold(ss,s,"Directions:")
            }
            "Antiviral" -> {
                s = "IV:\n" +
                        "Selenium: 2 cc\n" +
                        "ACE (adrenal cortical extract): 6 cc\n" +
                        "Vitamin C (500 mg./ml.): 100 cc\n" +
                        "Calcium gluconate: 50 cc\n" +
                        "Vitamin B-complex: 5 cc\n" +
                        "Vitamin B12: 3 cc\n" +
                        "Magnesium sulfate: 4 cc\n" +
                        "Vitamin B6 (100 mg/ml): 3 cc\n" +
                        "Sodium bicarbonate: 10 - 12 cc (if needed for vein irritation)\n" +
                        "Sterile water: 450 cc\n" +
                        "Directions:\n" +
                        "Give 30 drops/min. in large vein if possible.\n" +
                        "Indications:\n" +
                        "Cold\n" +
                        "Flu\n" +
                        "Infection"

            }
            "Arrhythmia" -> {
                s = "IV:\n" +
                        "Selenium: 200 mcg\n" +
                        "Manganese: 2 mg\n" +
                        "Magnesium sulfate: 2 gm\n" +
                        "Copper: 2 mg\n" +
                        "Taurine: 1 gm\n" +
                        "Potassium chloride: 10 mEg\n" +
                        "Directions:\n" +
                        "Mix 100 cc sterile water and infuse over 30-45 minutes.\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Asthma" -> {
                s = "IV:\n" +
                        "Molybdenum: (25-500 mcg.)\n" +
                        "Vitamin B6: 200 mg.\n" +
                        "Vitamin B12: 1,000 mcg.\n" +
                        "Magnesium chloride: 500 mg.\n" +
                        "Directions:\n" +
                        "Administer 2-3 times a week for 6-8 weeks.\n" +
                        "Follow IV treatment with oral molybdenum 1-3 gms. a day.\n" +
                        "Monitor urinary sulfite and/or inorganic/organic sulfate.\n" +
                        "Taper molybdenum dose with improvement.\n" +
                        "Monitor RBC copper levels with long-term molybdenum administration."
            }
            "Celiac Disease" -> {
                s = "IV:\n" +
                        "Vitamin K: 2 cc (Because of vitamin K injections, a prothrombin time should be done at every 3-4 week intervals)\n" +
                        "Vitamin E: 2 cc (IM injection only)\n" +
                        "Vitamin B-complex: 3 cc\n" +
                        "MTE #5: 2 cc\n" +
                        "Pyridoxine HCl: 1 cc\n" +
                        "Hydroxycobalamin: 1 cc\n" +
                        "Rubidium: 1 cc\n" +
                        "Magnesium chloride: 2 cc\n" +
                        "Calcium gluconate: 1 cc\n" +
                        "Sterile water: 26 cc\n" +
                        "Directions:\n" +
                        "Give 2 times a week for 4 weeks\n" +
                        "Then 1 time a week for 10 weeks\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Congestive Heart Failure" -> {
                s = "IV:\n" +
                        "Taurine: 4 cc\n" +
                        "Magnesium sulfate: 2 cc\n" +
                        "Calcium gluconate: 2 cc\n" +
                        "Pyridoxine HCl: 1 cc\n" +
                        "Vitamin B-complex: 3 cc\n" +
                        "Rodaguine: l0 cc\n" +
                        "Lactated Ringer's: l3 cc\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity.\n" +
                        "\n" +
                        "Copyright 1998 - 2008 by L. Vicky Crouse, ND and James S. Reiley, ND. All rights reserved (ISSN 1527-0661)."
            }
            "Crohn's Disease" -> {
                s = "IV:\n" +
                        "Vitamln K: l2 cc (Because of vitamin K injections, a prothrombin time should be done at 3-4 week intervals)\n" +
                        "Hydroxycobalamin: 2 cc (IM injection only)\n" +
                        "Folic acid: 1 cc (IM injection only)\n" +
                        "Vitamin E: 2 cc (IM injection only)\n" +
                        "Vitamin B-complex: 3 cc\n" +
                        "Rubidium: 2 cc\n" +
                        "MTE #4: 3 cc\n" +
                        "Zinc: 1 cc\n" +
                        "Vitamin C: 6 cc\n" +
                        "Magnesium chloride: 1 cc\n" +
                        "Calcium gluconate: 2 cc\n" +
                        "Pantothenic acid: 2 cc\n" +
                        "Sterile water:15 cc\n" +
                        "Directions:\n" +
                        "It is possible that injections of Glucosamine will add to the healing process, as well as other Amino Acids\n" +
                        "Give 3 cc daily for 35 days; then 2 times weekly for 2 weeks; then 1 time every 4 weeks\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Diabetes" -> {
                s = "IV:\n" +
                        "Calcium gluconate: 4 gm\n" +
                        "Magnesium sulfate: 3 gm\n" +
                        "Zinc sulfate: 10 mg\n" +
                        "Copper: 1 mg\n" +
                        "Chromium: 300 mcg\n" +
                        "Selenium: 200 mcg\n" +
                        "Manganese chloride: 300 mcg\n" +
                        "Molybdenum: 150 mcg\n" +
                        "Rubidium: 100 mcg\n" +
                        "Boron: 1 mg\n" +
                        "Lithium: 3 mg\n" +
                        "Strontium: 680 mcg\n" +
                        "Vanadium: 50 mcg\n" +
                        "1/2 Normal saline: 250 ml\n" +
                        "Directions:\n" +
                        "The therapy is given in a slow push of approximately 10 minutes\n" +
                        "Guard against infiltration\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Glaucoma" ->{
                s = "IV:\n" +
                        "ACE (adrenal cortical extract): 6.-.10 ml.\n" +
                        "Chromium (4 mcg./ml.): 12.5 ml.\n" +
                        "Thiamine (100 mg./ml.): 1 ml.\n" +
                        "Lactated Ringer's: 150 ml.\n" +
                        "Directions:\n" +
                        "Give over 30 minute period\n" +
                        "Increase the dose of chromium each time by 50 mcg (12.5 ml.) to a maximum of 200 mcg. in 200 ml. of lactated Ringer's\n" +
                        "Administer weekly until chromium dosage has reached 200 mcg; then every two weeks for one month; then monthly\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Hepatitis" ->{
                s = "IV:\n" +
                        "Ascorbic acid (500 mg./ml.): 150 ml.\n" +
                        "Calcium gluconate: 50 ml.\n" +
                        "Vitamin B12: 3 ml.\n" +
                        "Vitamin B6: 3 ml.\n" +
                        "Selenium: 2 ml.\n" +
                        "Vitamin B-complex: 5 ml.\n" +
                        "Magnesium sulfate: 4 ml.\n" +
                        "Sodium bicarbonate 8.4%: 10 - 12 ml. (if needed to relieve vein irritation)\n" +
                        "Sterile water: 450 ml.\n" +
                        "Directions:\n" +
                        "Infuse over 4 - 5 hours\n" +
                        "Advise patient to maximize oral vitamin C intake between IV treatments (to bowel tolerance)\n" +
                        "Digestive enzymes will increase bowel tolerance."

            }
            "Hypertension" -> {
                s = "IV:\n" +
                        "Magnesium chloride: 5 - l0 ml.\n" +
                        "Pyridoxine: 4 - 6 ml.\n" +
                        "Lactated Ringer's: 100 ml.\n" +
                        "Directions:\n" +
                        "Give over 30 minute period\n" +
                        "Can be administered BID\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Macular Degeneration" -> {
                s = "Option #1:\n" +
                        "Zinc (1 mg./ml.): 10 ml.\n" +
                        "Selenium (40 mcg./ml.): 10 ml.\n" +
                        "Lactated Ringer's: 120 ml.\n" +
                        " \n" +
                        "\n" +
                        "Option #2:\n" +
                        "MTE #5 concentrate: 2 ml.\n" +
                        "Selenium  (40 mcg./ml.): 8 ml.\n" +
                        "Lactated Ringer's: 120 ml.\n" +
                        "(This option provides about the same amount of zinc and selenium, but also provides copper, chromium, and manganese.)\n" +
                        "\n" +
                        "Directions:\n" +
                        "Give over 30 minute period\n" +
                        "Give twice weekly for four weeks\n" +
                        "Dosage may then be doubled and given weekly as needed for maintenance\n" +
                        " \n" +
                        "\n" +
                        "Option #3:\n" +
                        "Trace minerals: 1 ml.\n" +
                        "Vitamin C (500 mg./ml.): 5 ml.\n" +
                        "Calcium gluconate: 4 ml.\n" +
                        "Magnesium chloride: 15 ml.\n" +
                        "Vitamin B-complex: 2 cc\n" +
                        "Vitamin B6: 2 ml.\n" +
                        "Selenium: 5 ml.\n" +
                        "Taurine: 150 mg.\n" +
                        "Procaine: 5 ml.\n" +
                        "DMSO 100%: 5 ml.\n" +
                        "Sterile water: 250 ml.\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Migraine Headaches" -> {
                s = "IV:\n" +
                        "ACE (adrenal cortical extract): 6 - 10 cc\n" +
                        "or\n" +
                        "Maxicort: 2 - 5 cc\n" +
                        "Magnesium: 3 - 4 cc\n" +
                        "Vitamin B6: 3 cc\n" +
                        "Normal saline: 5 - 7 cc\n" +
                        "Directions:\n" +
                        "Give IV with a slow push\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "IV Migraine Push" -> {
                s = "IV:\n" +
                        "L-arginine: 1000 mg\n" +
                        "Magnesium sulfate: 3 - 4 gm\n" +
                        "Vitamin B6: 200-300 mg\n" +
                        "Directions:\n" +
                        "Give IV with a slow push, gauging to patient's comfort level\n" +
                        "Warning:\n" +
                        "Too rapid infusion can cause hypotension and other side effects\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Multiple Sclerosis" -> {
                s = "IV:\n" +
                        "Vitamin E: 2 cc daily (IM injection only)\n" +
                        "Vitamin A: 2 cc daily (IM injection only)\n" +
                        "Pycnogenol: 2 cc daily (IM injection only)\n" +
                        "Glutathione: 2 ml.\n" +
                        "Dimethyl glycine: 2 ml.\n" +
                        "Vitamin C: 6 cc\n" +
                        "Vitamin B-complex: 3 cc\n" +
                        "Pantothenic acid: 2 cc\n" +
                        "Pyridoxine HCl: 1 cc\n" +
                        "MTE #7: 3 cc\n" +
                        "Calcium gluconate: 2 cc\n" +
                        "Magnesium sulphate: 3 cc\n" +
                        "NAC: 1 cc\n" +
                        "Rubidium: 2 cc\n" +
                        "Sterile water: 27 cc\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Nausea/Vomiting of Pregnancy" -> {
                s = "IV:\n" +
                        "Vitamin B-complex: 1 cc\n" +
                        "Vitamin B12: 1 cc\n" +
                        "Pantothenic acid: 1 cc\n" +
                        "Vitamin B6: 1 cc\n" +
                        "Magnesium: 1 cc\n" +
                        "Calcium glycerophosphate: 1 cc\n" +
                        "Sodium ascorbate: 1 cc\n" +
                        "Saline: 4 cc\n" +
                        "Directions:\n" +
                        "Do as a slow IV push\n" +
                        "If painful, inject ½1/2cc, wait, inject another 1/2 cc\n" +
                        "Patient can squeeze a ball with same hand to enhance blood flow\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Stroke" -> {
                s = "IV:\n" +
                        "DMSO: 2O cc\n" +
                        "Directions:\n" +
                        "Given within 2 hours of the stroke may abort most of the symptoms\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Tonic Therapy" ->{
                s = "IV:\n" +
                        "Magnesium chloride hexahydrate (20%): 2 - 5 ml.\n" +
                        "Calcium gluconate (10%): 2 - 4 ml.\n" +
                        "Hydroxycobalamin (1,000 mcg./ml.): 1 ml.\n" +
                        "Pyridoxine (100 mg./ml.): 1 ml.\n" +
                        "Dexpanthenol (250 mg./ml.): 1 ml.\n" +
                        "Vitamin B-complex: 1 ml.\n" +
                        "Vitamin C (222 mg./ml.): 20 ml.\n" +
                        "(Vitamin C without preservative is more irritating to the vein. If you do use it, reduce dose by 60%.)\n" +
                        "Alternative Tonic Therapy:\n" +
                        "Magnesium sulfate: 3 ml.\n" +
                        "Calcium gluconate: 3 ml.\n" +
                        "Hydroxycobalamin: 1 ml.\n" +
                        "Vitamin B6: 1 ml.\n" +
                        "Dexpanthenol: 1 ml.\n" +
                        "Vitamin B-complex: 1 ml.\n" +
                        "Sodium ascorbate: 1 ml.\n" +
                        "Sterile water: 15 ml.\n" +
                        "(Adjust pH to 7 - 7.5 if necessary, with sodium bicarbonate injection. Give by slow IV push over 15 minutes)\n" +
                        "Preparation:\n" +
                        "Slowly over 5 - 15 minutes\n" +
                        "25G butterfly needle\n" +
                        "10-20 ml. of sterile water to reduce injection site pain if necessary\n" +
                        "20 - 25 mEq. of potassium orally if patient is subject to hypokalemia, repeat 4 - 6 hours later\n" +
                        "Indications:\n" +
                        "Asthma, acute or chronic - consider 6-30 ml. of vitamin C and double doses of pyridoxine, dexpanthenol and vitamin B12\n" +
                        "Chronic fatigue syndrome and Epstein Barr virus\n" +
                        "Congestive heart failure (CHF) to help increase the ejection fraction\n" +
                        "Depression, chronic\n" +
                        "Fibromyalgia\n" +
                        "Seasonal allergic rhinitis\n" +
                        "Acute infections\n" +
                        "Angina\n" +
                        "Ischemic vascular disease\n" +
                        "Muscle spasm, acute or chronic\n" +
                        "Senile dementia\n" +
                        "Sinusitis, chronic\n" +
                        "Urticaria, acute or chronic - consider 6-30 ml. of vitamin C and double doses of pyridoxine, dexpanthenol and vitamin B12\n" +
                        "Consideration:\n" +
                        "Calcium probably should be excluded in patients with cardiac arrhythmias and the maximum tolerated amount of magnesium should be considered\n"
            }
            "Trace Minerals" -> {
                s = "IV #1:\n" +
                        "Calcium gluconate: 4 gm.\n" +
                        "Magnesium sulfate: 2 gm.\n" +
                        "Zinc: 5 mg.\n" +
                        "Copper: 1 mg.\n" +
                        "Chromium: 50 mcg.\n" +
                        "Selenium: 200 mcg.\n" +
                        "Manganese: 0.1 mg.\n" +
                        "Molybdenum: 50 mcg.\n" +
                        "Rubidium: 50 mcg.\n" +
                        "Boron: 500 mcg.\n" +
                        "Lithium: 2 mg.\n" +
                        "Strontium: 200 mcg.\n" +
                        "Vanadium: 25 mcg.\n" +
                        "Saline (0.45% ): 250 ml.\n" +
                        "IV #2:\n" +
                        "Calcium gluconate: 4 gm.\n" +
                        "Magnesium sulfate: 2 gm.\n" +
                        "Zinc: 10 mg.\n" +
                        "Copper: 1 mg.\n" +
                        "Chromium: 50 mcg.\n" +
                        "Selenium: 200 mcg.\n" +
                        "Manganese: 0.l mg.\n" +
                        "Molybdenum: 100 mcg.\n" +
                        "Rubidium: 50 mcg.\n" +
                        "Boron: 500 mcg.\n" +
                        "Lithium: 2 mg.\n" +
                        "Strontium: 400 mcg.\n" +
                        "Vanadium: 25 mcg.\n" +
                        "Saline (0.45%): 250 ml.\n" +
                        "IV #3:\n" +
                        "Calcium gluconate: 5 gm.\n" +
                        "Magnesium sulfate: 3 gm.\n" +
                        "Zinc sulfate: 10 mg.\n" +
                        "Copper: 2 mg.\n" +
                        "Chromium: 50 mcg.\n" +
                        "Selenium: 200 mcg.\n" +
                        "Manganese chloride: 0.2 mg.\n" +
                        "Molybdenum: l50 mcg.\n" +
                        "Rubidium: l00 mcg.\n" +
                        "Boron: 1 mg.\n" +
                        "Lithium: 3 mg.\n" +
                        "Strontium: 680 mcg.\n" +
                        "Vanadium: 50 mcg.\n" +
                        "1/2 Normal saline: 250 ml.\n" +
                        "IV #4:\n" +
                        "Calcium gluconate: 5 gm.\n" +
                        "Magnesium sulfate: 3 gm.\n" +
                        "Zinc: l0 mg.\n" +
                        "Copper: 2 mg.\n" +
                        "Chromium: 100 mcg.\n" +
                        "Selenium: 400 mcg.\n" +
                        "Manganese: 0.2 mg.\n" +
                        "Molybdenum: 200 mcg.\n" +
                        "Rubidium: l00 mcg.\n" +
                        "Boron: 1.5 mg.\n" +
                        "Lithium: 4 mg.\n" +
                        "Strontium: 600 mcg.\n" +
                        "Vanadium: 25 mcg.\n" +
                        "Saline (0.45%): 250 ml.\n" +
                        "IV #5 and #6:\n" +
                        "Calcium gluconate: 6 gm.\n" +
                        "Magnesium sulfate: 4 gm.\n" +
                        "Zinc: l0 mg.\n" +
                        "Copper: 2 mg.\n" +
                        "Chromium: 200 mcg.\n" +
                        "Selenium: 400 mcg.\n" +
                        "Manganese: 0.5 mg.\n" +
                        "Molybdenum: 250 mcg.\n" +
                        "Rubidium: 100 mcg.\n" +
                        "Boron: 2 mg.\n" +
                        "Lithium: 5 mg.\n" +
                        "Strontium: 1 mg.\n" +
                        "Vanadium: 25 mcg.\n" +
                        "Saline (0.45%): 250 ml.\n" +
                        "Uses:\n" +
                        "Remineralization between chelation treatments\n" +
                        "For people who are not absorbing their nutrients well e.g. hypochiorhydria patients (Also need to add\n" +
                        "vitamin B12 and vitamin B-complex)\n" +
                        "Indequate minerals intake from the foods\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "Vitamins/Minerals/Amino Acids" -> {
                s = "IV:\n" +
                        "• Sodium ascorbate: 20 ml.\n" +
                        "• Freeamine: 100 ml.\n" +
                        "• Calcium gluconate: 10 ml.\n" +
                        "• Magnesium sulfate: 3 ml.\n" +
                        "• MTE #5: 10 ml.\n" +
                        "• Vitamin B6: 1 ml.\n" +
                        "• Dexpanthenol: 2 ml.\n" +
                        "• Vitamin B-complex: 1 ml.\n" +
                        "• Potassium chloride: 5 ml.\n" +
                        "• Sodium bicarbonate: 10 ml.\n" +
                        "(injection or q.s. to adjust pH to 7 - 7.5)\n" +
                        "• Sterile water for injection: 500 ml.\n" +
                        "Directions:\n" +
                        "• Procaine 2 ml may be added if the solution irritates the veins\n" +
                        "• Solution is approximately iso-osmolar with 10 ml of vitamin C and no bicarbonate; somewhat hyperosmolar as presented here\n" +
                        "• Give over 2.5 - 3 hours by slow IV drip\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this IV therapy will vary according to each manufacturer's specific osmolarity."
            }
            "WBC Stimulation" -> {
                s = "1. Conversation with patient to make sure whole situation is understood.\n" +
                        "• There will be three blood draws:\n" +
                        "1st draw - just before stimulation treatment\n" +
                        "2nd draw -24 hours later - close to exact; they report to Lab\n" +
                        "3rd draw - 48 hours later - close to exact; they report to Lab\n" +
                        "2. Arrange with laboratory early in this process for the first blood draw to occur in I.V room. Blood goes back to lab for first analysis.\n" +
                        "\n" +
                        "3. As soon as first blood samples are withdrawn out of the butterfly for injection, the stimulation is given in a slow push of approximately 10 minutes. Infiltration must be guarded against.\n" +
                        "Injection:\n" +
                        "• 1.500 HCl: 5 cc\n" +
                        "• Saline: 5 cc\n" +
                        "* The amounts of the vitamins, minerals and other substances used in this I V therapy will vary according to each manufacturer's specific osmolarity."
            }

        }
        ss = SpannableString(s)
        makeBold(ss,s,"Option #1:")
        makeBold(ss,s,"Option #2:")
        makeBold(ss,s,"Option #3:")
        makeBold(ss,s,"IV:")
        makeBold(ss,s,"Directions:")
        makeBold(ss,s,"Indications:")
        makeBold(ss,s,"Warning:")
        if(heading=="Tonic Therapy"){
            makeBold(ss,s,"Consideration:")
            makeBold(ss,s,"Preparation:")
            makeBold(ss,s,"Alternative Tonic Therapy:")
        }
        if(heading=="Trace Minerals"){
            makeBold(ss,s,"IV #1:")
            makeBold(ss,s,"IV #2:")
            makeBold(ss,s,"IV #3:")
            makeBold(ss,s,"IV #4:")
            makeBold(ss,s,"IV #5 and #6:")
            makeBold(ss,s,"Uses:")
        }
        if(heading == "WBC Stimulation"){
            makeBold(ss,s,"Injection:")
        }
        setLinks(ss,s)


        binding.contentData.text = ss
    }

    private fun setOptions(heading: String) {
        when(heading){
            "Antiviral" ->{
                binding.second.visibility = View.VISIBLE
                binding.secondText.text = "Treatment 2"
                binding.third.visibility = View.VISIBLE
                binding.thirdText.text = "Treatment 3 (Long)"
                binding.forth.visibility = View.VISIBLE
                binding.forthText.text = "Treatment 4 (Short)"
            }
            "Asthma" -> {
                binding.second.visibility = View.VISIBLE
                binding.secondText.text = "Asthma Spasmolytic IV Treatment"
                binding.firstText.text = "Asthma IV Treatment"
            }
            "Tonic Therapy" -> {
                binding.second.visibility = View.VISIBLE
                binding.secondText.text = "Short Anti-viral IV Treatment"
                binding.third.visibility = View.VISIBLE
                binding.thirdText.text = "Tonic Plus(add to Short Anti-viral IV)"
            }
        }
    }

    private fun setLinks(ss : SpannableString, s : String){
        createLink(ss,"asthma",s,"Condition","Asthma")
        createLink(ss,"Asthma",s,"Condition","Asthma")
        createLink(ss,"Allergic rhinitis",s,"Condition","Allergies")
        createLink(ss,"Ascorbic acid",s,"Vitamin","Vitamin C (Ascorbic Acid)")
        createLink(ss,"ACE (adrenal cortical extract)",s,"Supplement","Glandulars")
        createLink(ss,"allergies",s,"Vitamin","Allergies")
        createLink(ss,"Boron",s,"Vitamin","Boron")
        createLink(ss,"Calcium gluconate",s,"Vitamin","Calcium")
        createLink(ss,"Ca1cium phosphate",s,"Vitamin","Calcium")
        createLink(ss,"Ca1cium",s,"Vitamin","Calcium")
        createLink(ss,"Calcium glycerophosphate",s,"Vitamin","Calcium")
        createLink(ss,"Copper",s,"Vitamin","Copper")
        createLink(ss,"Chromium",s,"Vitamin","Chromium")
        createLink(ss,"Congestive heart failure (CHF)",s,"Condition","Congestive Heart Failure")
        createLink(ss,"Chronic fatigue syndrome",s,"Condition","Chronic Fatigue Syndrome")
        createLink(ss,"Dexpanthenol",s,"Vitamin","Vitamin B5 (Pantothenic Acid)")
        createLink(ss,"Depression",s,"Condition","Depression")
        createLink(ss,"Dimethyl glycine",s,"Supplement","Dimethyl Glycine (DMG)")
        createLink(ss,"Folic acid",s,"Vitamin","Folate")
        createLink(ss,"Fibromyalgia",s,"Condition","Fibromyalgia")
        createLink(ss,"Glutathione",s,"Supplement","Glutathione")
        createLink(ss,"Glycyrrhiza",s,"Botanical","Glycyrrhiza glabra (Licorice)")
        createLink(ss,"Germanium",s,"Vitamin","Germanium")
        createLink(ss,"Hydroxycobalmin",s,"Vitamin","Vitamin B12 (Cobalamin)")
        createLink(ss,"Hydroxycobalamin",s,"Vitamin","Vitamin B12 (Cobalamin)")
        createLink(ss,"HCl",s,"Supplement","Hydrochloric Acid")
        createLink(ss,"Hydrochloric acid",s,"Supplement","Hydrochloric Acid")
        createLink(ss,"L-Arginine:",s,"Supplement","Arginine")
        createLink(ss,"L-arginine:",s,"Supplement","Arginine")
        createLink(ss,"Lithium",s,"Supplement","Lithium")
        createLink(ss,"Magnesium sulfate",s,"Vitamin","Magnesium")
        createLink(ss,"Magnesium chloride",s,"Vitamin","Magnesium")
        createLink(ss,"Magnesium",s,"Vitamin","Magnesium")
        createLink(ss,"Molybdenum",s,"Vitamin","Molybdenum")
        createLink(ss,"molybdenum",s,"Vitamin","Molybdenum")
        createLink(ss,"Manganese",s,"Vitamin","Manganese")
        createLink(ss,"NAC",s,"Supplement","N-Acetyl Cysteine")
        createLink(ss,"Niacin",s,"Vitamin","Vitamin B3 (Niacin)")
        createLink(ss,"Pyridoxine HCl",s,"Vitamin","Vitamin B6 (Pyridoxine)")
        createLink(ss,"Pyridoxine",s,"Vitamin","Vitamin B6 (Pyridoxine)")
        createLink(ss,"Pycnogenol",s,"Supplement","Pycnogenol")
        createLink(ss,"Pantothenic acid",s,"Vitamin","Vitamin B5 (Pantothenic Acid)")
        createLink(ss,"Potassium chloride",s,"Vitamin","Potassium")
        createLink(ss,"Riboflavin",s,"Vitamin","Vitamin B2 (Riboflavin)")
        createLink(ss,"Selenium",s,"Vitamin","Selenium")
        createLink(ss,"Selenium  ",s,"Vitamin","Selenium")
        createLink(ss,"Strontium",s,"Vitamin","Strontium")
        createLink(ss,"Seasonal allergic rhinitis",s,"Condition","Allergies")
        createLink(ss,"Sodium",s,"Vitamin","Sodium")
        createLink(ss,"Taurine",s,"Supplement","Taurine")
        createLink(ss,"Thiamine",s,"Vitamin","Vitamin B1 (Thiamine)")
        createLink(ss,"Vitamin C".lowercase(),s.lowercase(),"Vitamin","Vitamin C (Ascorbic Acid)")
        createLink(ss,"Vitamin A",s,"Vitamin","Vitamin A (Retinol)")
        createLink(ss,"Vanadium",s,"Vitamin","Vanadium")
        createLink(ss,"Vitamin B6",s,"Vitamin","Vitamin B6 (Pyridoxine)")
        createLink(ss,"Vitamin B5",s,"Vitamin","Vitamin B5 (Pantothenic Acid)")
        createLink(ss,"vitamin b12",s.lowercase(),"Vitamin","Vitamin B12 (Cobalamin)")
        createLink(ss,"Vitamin E",s,"Vitamin","Vitamin E (Tocopherol)")
        createLink(ss,"Vitamin K",s,"Vitamin","Vitamin K (Quinones)")
        createLink(ss,"Zinc",s,"Vitamin","Zinc")
        createLink(ss,"Zinc sulfate",s,"Vitamin","Zinc")
        createLink(ss,"vitamin b-complex",s.lowercase(),"HydroTherapy","B Complex")
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
                        intent = Intent(this@FourTherapyActivity,ConditionDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Supplement"){
                        intent = Intent(this@FourTherapyActivity,SupplementDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Fiber"){
                        intent = Intent(this@FourTherapyActivity,FiberDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Vitamin"){
                        intent = Intent(this@FourTherapyActivity,VitaminMineralDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Botanical"){
                        intent = Intent(this@FourTherapyActivity,BotanicalDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity == "Fat"){
                        val intent = Intent(this@FourTherapyActivity,FattyAcidActivity::class.java)
                        startActivity(intent)
                    }else if(activity == "HydroTherapy"){
                        val intent = Intent(this@FourTherapyActivity,HydroTherapyActivity::class.java)
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
}