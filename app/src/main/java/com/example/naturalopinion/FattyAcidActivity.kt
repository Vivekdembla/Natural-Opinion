package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityFattyAcidBinding

class FattyAcidActivity : AppCompatActivity() {
    lateinit var binding : ActivityFattyAcidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFattyAcidBinding.inflate(layoutInflater)
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

        binding.first.setOnClickListener {
            binding.subHeading.text = "Supplement Forms (Omega 3):"
            binding.contentData.text = "• Alpha-linolenic (ALA) - flaxseed, soy, linseed oil, chloroplasts\n" +
                    "• Eicosapentanoic acid (EPA) - salmon, herring, sardine, mackerel, etc."
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

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5


        }
        binding.second.setOnClickListener {
            binding.subHeading.text = "Labs (Omega 3):"
            binding.contentData.text = "• Fatty acid profile of serum lipids"


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
            binding.subHeading.text = "Clinical Indications (Omega 3):"
            val text = "• AIDS\n" +
                    "• Allergies\n" +
                    "• Alzheimer's disease\n" +
                    "• Asthma\n" +
                    "• Atherosclerosis\n" +
                    "• Attention deficit disorder\n" +
                    "• Bipolar disorder\n" +
                    "• Benign prostatic hypertrophy (BPH)\n" +
                    "• Cancer prevention\n" +
                    "• Candidiasis\n" +
                    "• Cataract\n" +
                    "• Cholecystitis\n" +
                    "• Cholelithiasis\n" +
                    "• Congestive heart failure\n" +
                    "• Crohn's disease\n" +
                    "• Depression\n" +
                    "• Diabetes mellitus\n" +
                    "• Dysmenorrhea\n" +
                    "• Eczema\n" +
                    "• Endometriosis\n" +
                    "• Fibrocystic breast disease\n" +
                    "• Gout\n" +
                    "• Headaches\n" +
                    "• Hemorrhoids\n" +
                    "• Hepatitis\n" +
                    "• Hypertension\n" +
                    "• Impotence\n" +
                    "• Insomnia\n" +
                    "• Irritable bowel syndrome\n" +
                    "• Menopause\n" +
                    "• Multiple sclerosis\n" +
                    "• Osteoarthritis\n" +
                    "• Osteoporosis\n" +
                    "• Otitis media\n" +
                    "• Peptic ulcer\n" +
                    "• PMS\n" +
                    "• Psoriasis\n" +
                    "• Psoriatic arthritis\n" +
                    "• Rheumatoid arthritis and other autoimmune disorders\n" +
                    "• Rosacea\n" +
                    "• Schizophrenia\n" +
                    "• Systemic lupus erythematosus (SLE)\n" +
                    "• Ulcerative colitis\n" +
                    "• Colorectal cancer prevention\n" +
                    "• Constipation\n" +
                    "• Endometriosis"
            val ss = SpannableString(text)

            createLink(ss,"Aging prevention",text,"Condition","Aging Prevention")
            createLink(ss,"AIDS",text,"Condition","AIDS")
            createLink(ss,"Anorexia nervosa",text,"Condition","Anorexia Nervosa")
            createLink(ss,"Autism",text,"Condition","Autism")
            createLink(ss,"Attention decficit disorder (ADD)",text,"Condition","Attention Deficit Disorder")
            createLink(ss,"Allergies",text,"Condition","Allergies")
            createLink(ss,"Alzheimer's disease",text,"Condition","Alzheimer's Disease")
            createLink(ss,"Aphthous stomatitis",text,"Condition","Aphthous Stomatitis")
            createLink(ss,"Asthma",text,"Condition","Asthma")
            createLink(ss,"Attention deficit disorder",text,"Condition","Attention Deficit Disorder")
            createLink(ss,"Atherosclerosis",text,"Condition","Atherosclerosis")
            createLink(ss,"Autism",text,"Condition","Autism")
            createLink(ss,"Bipolar disorder",text,"Condition","Bipolar Disorder")
            createLink(ss,"Bipolar disease",text,"Condition","Bipolar Disorder")
            createLink(ss,"Benign prostatic hypertrophy (BPH)",text,"Condition","Benign Prostatic Hypertrophy")
            createLink(ss,"Benign prostatic hypertrophy",text,"Condition","Benign Prostatic Hypertrophy")
            createLink(ss,"Cancer prevention",text,"Condition","Cancer Prevention")
            createLink(ss,"Cataract",text,"Condition","Cataract")
            createLink(ss,"Candidiasis",text,"Condition","Candidiasis")
            createLink(ss,"Cataract prevention",text,"Condition","Cataract prevention")
            createLink(ss,"Chronic fatigue syndrome",text,"Condition","Chronic Fatigue Syndrome")
            createLink(ss,"Congestive heart failure",text,"Condition","Congestive Heart Failure")
            createLink(ss,"Cholecystitis",text,"Condition","Cholecystitis")
            createLink(ss,"Cholelithiasis",text,"Condition","Cholelithiasis")
            createLink(ss,"Crohn's disease",text,"Condition","Crohn's Disease")
            createLink(ss,"Diabetes",text,"Condition","Diabetes Mellitus")
            createLink(ss,"Depression",text,"Condition","Depression")
            createLink(ss,"Dysmenorrhea",text,"Condition","Dysmenorrhea")
            createLink(ss,"dysmenorrhea",text,"Condition","Dysmenorrhea")
            createLink(ss,"Eczema",text,"Condition","Eczema")
            createLink(ss,"Endometriosis",text,"Condition","Endometriosis")
            createLink(ss,"Fertility/Infertility",text,"Condition","Fertility")
            createLink(ss,"Fertility",text,"Condition","Fertility")
            createLink(ss,"Fibrocystic breast disease",text,"Condition","Fibrocystic Breast Disease")
            createLink(ss,"Fibromyalgia",text,"Condition","Fibromyalgia")
            createLink(ss,"Gout",text,"Condition","Gout")
            createLink(ss,"Headache",text,"Condition","Headache")
            createLink(ss,"Hepatitis C",text,"Condition","Hepatitis")
            createLink(ss,"Hepatitis",text,"Condition","Hepatitis")
            createLink(ss,"Herpes simplex",text,"Condition","Herpes Simplex")
            createLink(ss,"Hemorrhoids",text,"Condition","Hemorrhoids")
            createLink(ss,"Hypertension",text,"Condition","Hypertension")
            createLink(ss,"Hypercholesterolemia",text,"Condition","Hypercholesterolemia")
            createLink(ss,"Hypothyroidism",text,"Condition","Hypothyroidism")
            createLink(ss,"Impotence",text,"Condition","Impotence")
            createLink(ss,"Insomnia",text,"Condition","Insomnia")
            createLink(ss,"Irritable bowel syndrome",text,"Condition","Irritable Bowel Syndrome")
            createLink(ss,"Macular degeneration",text,"Condition","Macular Degeneration")
            createLink(ss,"Macular degeneration",text,"Condition","Macular Degeneration")
            createLink(ss,"Menopause",text,"Condition","Menopause")
            createLink(ss,"Multiple sclerosis",text,"Condition","Multiple Sclerosis")
            createLink(ss,"Memory Loss",text,"Condition","Memory Loss")
            createLink(ss,"Obesity",text,"Condition","Obesity")
            createLink(ss,"Osteoarthritis",text,"Condition","Osteoarthritis")
            createLink(ss,"Osteoporosis",text,"Condition","Osteoporosis")
            createLink(ss,"Otitis media",text,"Condition","Otitis Media")
            createLink(ss,"osteoarthritis",text,"Condition","Osteoarthritis")
            createLink(ss,"Short term memory loss",text,"Condition","Memory Loss")
            createLink(ss,"Peptic ulcers",text,"Condition","Peptic Ulcers")
            createLink(ss,"Psoriasis",text,"Condition","Psoriasis")
            createLink(ss,"PMS",text,"Condition","PMS")
            createLink(ss,"Psoriatic arthritis",text,"Condition","Psoriatic Arthritis")
            createLink(ss,"psoriatic arthritis",text,"Condition","Psoriatic Arthritis")
            createLink(ss,"Parkinson's disease",text,"Condition","Parkinson's Disease")
            createLink(ss,"Peptic ulcer",text,"Condition","Peptic Ulcer")
            createLink(ss,"Rheumatoid arthritis",text,"Condition","Rheumatoid Arthritis")
            createLink(ss,"Rosacea",text,"Condition","Rosacea")
            createLink(ss,"rheumatoid arthritis",text,"Condition","Rheumatoid Arthritis")
            createLink(ss,"Schizophrenia",text,"Condition","Schizophrenia")
            createLink(ss,"Systemic lupus erythematosus (SLE)",text,"Condition","Systemic Lupus Erythematosus")
            createLink(ss,"Uterine Fibroids",text,"Condition","Uterine Fibroids")
            createLink(ss,"Ulcerative colitis",text,"Condition","Ulcerative Colitis")

            binding.contentData.text = ss

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
            binding.subHeading.text = "Physiologic Therapeutics (Omega 3 - EPA: 3 - 10 gms. in divided doses):"
            binding.contentData.text = "• Alters eicosanoid production\n" +
                    "• Decreases blood cholesterol\n" +
                    "• Decrease platelet aggregation\n" +
                    "• Decreases triglycerides\n" +
                    "• Enhances lymph function\n" +
                    "• Increases exercise tolerance\n" +
                    "• Increases HDL\n" +
                    "• Precursor for series 3 prostaglandins (PGE 3)\n" +
                    "• Suppresses division in cancer cell lines"


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
            binding.subHeading.text = "Drug/Nutrient Interaction (Omega 3):"
            binding.contentData.text = "• Requires vitamin E and possibly other antioxidants when ingesting large doses of EFAs"


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
            binding.subHeading.text = "Adverse Reactions and Toxicity (Omega 3):"
            binding.contentData.text = "• Keep unsaturated oils in refrigerator\n" +
                    "• May cause peroxidation damage in large doses if taken without antioxidant supplementation"

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
            binding.subHeading.text = "Supplement Forms (Omega 6):"
            binding.contentData.text = "• Linoleic - vegetable, nut, and seed oils and evening primrose oil\n" +
                    "• Gamma-linolenic (GLA) - breast milk, evening primrose, black currant, and borage oils"

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
            binding.subHeading.text = "Labs (Omega 6):"
            binding.contentData.text = "• Fatty acid profile of serum lipids"

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
            binding.subHeading.text = "Clinical Indications (Omega 6):"
            val text = "• Aging prevention\n" +
                    "• AIDS\n" +
                    "• Allergies\n" +
                    "• Asthma\n" +
                    "• Atherosclerosis\n" +
                    "• Bipolar disorder\n" +
                    "• Cholecystitis\n" +
                    "• Cholelithiasis\n" +
                    "• Crohn's disease\n" +
                    "• Depression\n" +
                    "• Eczema\n" +
                    "• Fibrocystic breast disease\n" +
                    "• Headaches\n" +
                    "• Hemorrhoids\n" +
                    "• Hepatitis\n" +
                    "• Hypertension\n" +
                    "• Insomnia\n" +
                    "• Irritable bowel syndrome\n" +
                    "• Menopause\n" +
                    "• Multiple sclerosis\n" +
                    "• Obesity\n" +
                    "• Otitis media\n" +
                    "• Parkinson's disease\n" +
                    "• Peptic ulcer\n" +
                    "• PMS - irritability and depression\n" +
                    "• Psoriasis\n" +
                    "• Psoriatic arthritis\n" +
                    "• Rheumatoid arthritis (does not work if patient is on steroids) and other autoimmune disorders\n" +
                    "• Rosacea\n" +
                    "• Schizophrenia\n" +
                    "• Systemic lupus erythematosus\n" +
                    "• Ulcerative colitis\n" +
                    "• Cancer prevention\n" +
                    "• Hypercholesterolemia\n" +
                    "• Neurologic conditions - multiple sclerosis, Guillaine Barre syndrome\n" +
                    "• Prevention of alcohol withdrawal\n" +
                    "• Prevention of lithium toxicity\n" +
                    "• Raynauds\n" +
                    "• Scleroderma\n" +
                    "• Selected cases of schizophrenia"

            val ss = SpannableString(text)

            createLink(ss,"Aging prevention",text,"Condition","Aging Prevention")
            createLink(ss,"AIDS",text,"Condition","AIDS")
            createLink(ss,"Anorexia nervosa",text,"Condition","Anorexia Nervosa")
            createLink(ss,"Autism",text,"Condition","Autism")
            createLink(ss,"Attention decficit disorder (ADD)",text,"Condition","Attention Deficit Disorder")
            createLink(ss,"Allergies",text,"Condition","Allergies")
            createLink(ss,"Alzheimer's disease",text,"Condition","Alzheimer's Disease")
            createLink(ss,"Aphthous stomatitis",text,"Condition","Aphthous Stomatitis")
            createLink(ss,"Asthma",text,"Condition","Asthma")
            createLink(ss,"Atherosclerosis",text,"Condition","Atherosclerosis")
            createLink(ss,"Autism",text,"Condition","Autism")
            createLink(ss,"Bipolar disorder",text,"Condition","Bipolar Disorder")
            createLink(ss,"Bipolar disease",text,"Condition","Bipolar Disorder")
            createLink(ss,"Benign prostatic hypertrophy (BPH)",text,"Condition","Benign Prostatic Hypertrophy")
            createLink(ss,"Benign prostatic hypertrophy",text,"Condition","Benign Prostatic Hypertrophy")
            createLink(ss,"Cancer prevention",text,"Condition","Cancer Prevention")
            createLink(ss,"Cataract",text,"Condition","Cataract")
            createLink(ss,"Cataract prevention",text,"Condition","Cataract prevention")
            createLink(ss,"Chronic fatigue syndrome",text,"Condition","Chronic Fatigue Syndrome")
            createLink(ss,"Congestive heart failure",text,"Condition","Congestive Heart Failure")
            createLink(ss,"Cholecystitis",text,"Condition","Cholecystitis")
            createLink(ss,"Cholelithiasis",text,"Condition","Cholelithiasis")
            createLink(ss,"Crohn's disease",text,"Condition","Crohn's Disease")
            createLink(ss,"Diabetes",text,"Condition","Diabetes Mellitus")
            createLink(ss,"Depression",text,"Condition","Depression")
            createLink(ss,"Dysmenorrhea",text,"Condition","Dysmenorrhea")
            createLink(ss,"dysmenorrhea",text,"Condition","Dysmenorrhea")
            createLink(ss,"Eczema",text,"Condition","Eczema")
            createLink(ss,"Endometriosis",text,"Condition","Endometriosis")
            createLink(ss,"Fertility/Infertility",text,"Condition","Fertility")
            createLink(ss,"Fertility",text,"Condition","Fertility")
            createLink(ss,"Fibrocystic breast disease",text,"Condition","Fibrocystic Breast Disease")
            createLink(ss,"Fibromyalgia",text,"Condition","Fibromyalgia")
            createLink(ss,"Gout",text,"Condition","Gout")
            createLink(ss,"Headaches",text,"Condition","Headache")
            createLink(ss,"Otitis media",text,"Condition","Otitis Media")
            createLink(ss,"Hepatitis",text,"Condition","Hepatitis")
            createLink(ss,"Herpes simplex",text,"Condition","Herpes Simplex")
            createLink(ss,"Hemorrhoids",text,"Condition","Hemorrhoids")
            createLink(ss,"Hypertension",text,"Condition","Hypertension")
            createLink(ss,"Hypercholesterolemia",text,"Condition","Hypercholesterolemia")
            createLink(ss,"Hypothyroidism",text,"Condition","Hypothyroidism")
            createLink(ss,"Impotence",text,"Condition","Impotence")
            createLink(ss,"Insomnia",text,"Condition","Insomnia")
            createLink(ss,"Irritable bowel syndrome",text,"Condition","Irritable Bowel Syndrome")
            createLink(ss,"Macular degeneration",text,"Condition","Macular Degeneration")
            createLink(ss,"Peptic ulcer",text,"Condition","Peptic Ulcers")
            createLink(ss,"Psoriasis",text,"Condition","Psoriasis")
            createLink(ss,"Multiple sclerosis",text,"Condition","Multiple Sclerosis")
            createLink(ss,"Memory Loss",text,"Condition","Memory Loss")
            createLink(ss,"Menopause",text,"Condition","Menopause")
            createLink(ss,"Obesity",text,"Condition","Obesity")
            createLink(ss,"Osteoarthritis",text,"Condition","Osteoarthritis")
            createLink(ss,"osteoarthritis",text,"Condition","Osteoarthritis")
            createLink(ss,"Rosacea",text,"Condition","Rosacea")
            createLink(ss,"Peptic ulcers",text,"Condition","Peptic Ulcers")
            createLink(ss,"Psoriasis",text,"Condition","Psoriasis")
            createLink(ss,"PMS",text,"Condition","PMS")
            createLink(ss,"Psoriatic arthritis",text,"Condition","Psoriatic Arthritis")
            createLink(ss,"psoriatic arthritis",text,"Condition","Psoriatic Arthritis")
            createLink(ss,"Parkinson's disease",text,"Condition","Parkinson's Disease")
            createLink(ss,"Rheumatoid arthritis",text,"Condition","Rheumatoid Arthritis")
            createLink(ss,"rheumatoid arthritis",text,"Condition","Rheumatoid Arthritis")
            createLink(ss,"Schizophrenia",text,"Condition","Schizophrenia")
            createLink(ss,"multiple sclerosis",text,"Condition","Multiple Sclerosis")
            createLink(ss,"Uterine Fibroids",text,"Condition","Uterine Fibroids")
            createLink(ss,"Systemic lupus erythematosus",text,"Condition","Systemic Lupus Erythematosus")

            binding.contentData.text = ss

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
            binding.subHeading.text = "Physiologic Therapeutics (Omega 6 - EPO: 2 - 4 gms.):"
            binding.contentData.text = "• Deceases blood cholesterol\n" +
                    "• Decreases platelet aggregation\n" +
                    "• GLA decreases growth of malignant cell lines in vitro\n" +
                    "• PGE 1 decreases kidney damage in mice\n" +
                    "• PGE 1 needed for T-lymphocyte function\n" +
                    "• Precursor for series 1 prostaglandins (PGE 1)"

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

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
            binding.subHeading.text = "Drug/Nutrient Interaction (Omega 6):"
            binding.contentData.text = "• Requires vitamin E and possibly other antioxidants when ingesting large doses of EFAs"

            binding.twelve.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.twelveText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.twelve.strokeWidth = 5

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
            binding.subHeading.text = "Adverse Reactions and Toxicity (Omega 6):"
            binding.contentData.text = "• Keep unsaturated oils in refrigerator\n" +
                    "• May cause peroxidation damage in large doses if taken without antioxidant supplementation"

            binding.eleven.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.elevenText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.eleven.strokeWidth = 5

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

    }
    private fun createLink(ss: SpannableString, sub_str: String, string: String, activity: String, heading: String) {

        var index = string.indexOf(sub_str)
        while (index != -1) {
            val clickableSpan = object : ClickableSpan(){
                override fun onClick(widget: View) {
                    val intent : Intent
                    if(activity=="Condition"){
                        intent = Intent(this@FattyAcidActivity,ConditionDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Supplement"){
                        intent = Intent(this@FattyAcidActivity,SupplementDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Fiber"){
                        intent = Intent(this@FattyAcidActivity,FiberDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Vitamin"){
                        intent = Intent(this@FattyAcidActivity,VitaminMineralDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Botanical"){
                        intent = Intent(this@FattyAcidActivity,BotanicalDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(heading == "Fat"){
                        val intent = Intent(this@FattyAcidActivity,FattyAcidActivity::class.java)
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