package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.method.MovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityFiberDetailBinding

class FiberDetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityFiberDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFiberDetailBinding.inflate(layoutInflater)
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

        binding.fiberDescription.text = ""
        binding.contentData.text = "• Fiber is the components of plant cell walls and the undigestible carbohydrates residues, except lignin which is a non carbohydrate polymer. There are several types of fiber: water soluble (e.g., pectin, gums, mucilages) found in fruits; and water insoluble (e.g., cellulose, hemicelluloses) found in wheat bran."
        binding.subHeading.text = "Description"

        binding.desc.setOnClickListener {

            binding.contentData.text = "• Fiber is the components of plant cell walls and the undigestible carbohydrates residues, except lignin which is a non carbohydrate polymer. There are several types of fiber: water soluble (e.g., pectin, gums, mucilages) found in fruits; and water insoluble (e.g., cellulose, hemicelluloses) found in wheat bran."
            binding.subHeading.text = "Description"

            binding.desc.setCardBackgroundColor(ContextCompat.getColor(this,R.color.skin))
            binding.descText.setTextColor(ContextCompat.getColor(this,R.color.deep_green))
            binding.desc.strokeWidth = 0

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

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.first.strokeWidth = 5


        }
        binding.first.setOnClickListener {
            binding.subHeading.text = "Supplement Forms"
            binding.contentData.text = "• Pill form-can swell 7 times the original size in 1 minute after contact with water\n" +
                    "• Fiber-filled gelatin capsules-begin to swell 6 minutes after contact with water\n" +
                    "• Best sources of water-soluble fibers for non-laxative effects:\n" +
                    "psyllium, guar gum, glucomannan, gum karaya, and pectin"

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

            binding.desc.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.desc.strokeWidth = 5

        }
        binding.second.setOnClickListener {
            binding.subHeading.text = "Foods Containing Fiber"
            binding.contentData.text = "• Fruits:\n" +
                    "Apple with skin-medium (3.5 gm.)\n" +
                    "Banana-medium (1/4 gm.)\n" +
                    "Blueberries-1/2 cup (1.8 gm.)\n" +
                    "Cherries-10 (1.2 gm.)\n" +
                    "Figs-5 (8.6 gm.)\n" +
                    "Orange-medium (2.6 gm.)\n" +
                    "Peach-medium (2.8 gm.)\n" +
                    "Pear-medium (5.2 gm.)\n" +
                    "Prunes dried-3 (1.9 gm.)\n" +
                    "Raisins-1/4 cup (2.0 gm.)\n" +
                    "Raspberries-1/2 cup (3.0 gm.)\n" +
                    "• Vegetables:\n" +
                    "Acorn squash-1/2 cup (1.7 gm.)\n" +
                    "Asparagus-1/2 cup (1.0 gm.)\n" +
                    "Avocado-medium (4.6 gm.)\n" +
                    "Bean sprouts-1/2 cup (1.5 gm.)\n" +
                    "Broccoli-1/2 cup (2.3 gm.)\n" +
                    "Brussels sprouts-1/2 cup (3.4 gm.)\n" +
                    "Cabbage-1/2 cup (1/4 gm.)\n" +
                    "Carrot-medium (2.3 gm.)\n" +
                    "Cauliflower raw-1/2 cup (1.4 gm.)\n" +
                    "Celery stalk-medium (0.7 gm.)\n" +
                    "Corn-1/2 cup (3.0 gm.)\n" +
                    "Green beans-1/2 cup (1.1 gm.)\n" +
                    "Green pepper raw-1/2 cup (0.5 gm.)\n" +
                    "Cucumber raw-1/2 cup (0.4 gm.)\n" +
                    "Lettuce raw-10 leaves (2.0 gm.)\n" +
                    "Mushrooms raw-1/2 cup (0.6 gm.)\n" +
                    "Onions raw-1/2 cup (0.9 gm.)\n" +
                    "Potato baked-medium (3.9 gm.)\n" +
                    "Rice brown-1/2 cup (1.6 gm.)\n" +
                    "Rice white-1/2 cup (0.8 gm.)\n" +
                    "Spinach raw-1/2 cup (0.6 gm.)\n" +
                    "Sweet potato-medium (3.9 gm.)\n" +
                    "Tomato raw-medium (1.5 gm.)\n" +
                    "Zucchini-1/2 cup (1.8 gm.)\n" +
                    "• Legumes:\n" +
                    "Beans, baked-1/2 cup (8.8 gm.)\n" +
                    "Dried peas-1/2 cup (4.7 gm.)\n" +
                    "Lentils-1/2 cup (3.7 gm.)\n" +
                    "Lima beans-1/2 cup (6.5 gm.)\n" +
                    "Kidney beans-1/2 cup (7.3 gm.)\n" +
                    "Navy beans-1/2 cup (6.0 gm.)\n" +
                    "• Cereals:\n" +
                    "All Bran regular-1/2 cup (12.7 gm.)\n" +
                    "All Bran extra fiber-1/2 cup (13.0 gm.)\n" +
                    "Bran Flakes-3/4 cup (3.0 gm.)\n" +
                    "Bran Chex - 2/3 cup (4.6 gm.)\n" +
                    "Corn Bran-2/3 cup (5.4 gm.)\n" +
                    "Cracklin' Oat Bran-1/2 cup (4.0 gm.)\n" +
                    "Grape Nuts-1/2 cup (4.0 gm.)\n" +
                    "Fiber-One-1/2 cup (12.0 gm.)\n" +
                    "Quaker Oats uncooked-1/2 cup (4.5 gm.)\n" +
                    "Raisin Bran-2/3 cup (4.0 gm.)\n" +
                    "Shredded Wheat-2/3 cup (2.6 gm.)\n" +
                    "Wheat germ-3 Tablespoons (3.0 gm.)\n" +
                    "100% Bran-1/2 cup (8.4 gm.)"

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

            binding.desc.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.desc.strokeWidth = 5

        }
        binding.third.setOnClickListener {
            binding.subHeading.text = "Clinical Indications"
            val text ="• AIDS\n" +
                    "• Atherosclerosis\n" +
                    "• Cancer prevention\n" +
                    "• Candidiasis\n" +
                    "• Cholecystitis\n" +
                    "• Cholelithiasis\n" +
                    "• Chronic fatigue syndrome\n" +
                    "• Congestive heart failure\n" +
                    "• Constipation\n" +
                    "• Crohn's disease\n" +
                    "• Diabetes mellitus\n" +
                    "• Dysmenorrhea\n" +
                    "• Endometriosis\n" +
                    "• Eczema\n" +
                    "• Fibrocystic breast disease\n" +
                    "• Gout\n" +
                    "• Headaches\n" +
                    "• Hemorrhoids\n" +
                    "• Hypertension\n" +
                    "• Irritable bowel syndrome\n" +
                    "• Menopause\n" +
                    "• Multiple sclerosis\n" +
                    "• Obesity\n" +
                    "• Peptic ulcers\n" +
                    "• PMS\n" +
                    "• Psoriasis\n" +
                    "• Psoriatic arthritis\n" +
                    "• Ulcerative colitis\n" +
                    "• Uterine fibroid\n" +
                    "• Appendicitis\n" +
                    "• Autoimmune disorders\n" +
                    "• Colon cancer\n" +
                    "• Deep-vein thrombosis\n" +
                    "• Dental caries\n" +
                    "• Diverticulitis\n" +
                    "• Pernicious anemia\n" +
                    "• Pulmonary embolism\n" +
                    "• Renal lithiasis\n" +
                    "• Skin disorders\n" +
                    "• Thyrotoxicosis\n" +
                    "• Varicose veins"

            val ss = SpannableString(text)
            createLink(ss,"Aging prevention",text,"Condition","Aging Prevention")
            createLink(ss,"AIDS",text,"Condition","AIDS")
            createLink(ss,"Candidiasis",text,"Condition","Candidiasis")
            createLink(ss,"Constipation",text,"Condition","Constipation")
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
            createLink(ss,"Multiple sclerosis",text,"Condition","Multiple Sclerosis")
            createLink(ss,"Menopause",text,"Condition","Menopause")
            createLink(ss,"Uterine fibroid",text,"Condition","Uterine Fibroids")
            createLink(ss,"Memory Loss",text,"Condition","Memory Loss")
            createLink(ss,"Obesity",text,"Condition","Obesity")
            createLink(ss,"Osteoarthritis",text,"Condition","Osteoarthritis")
            createLink(ss,"osteoarthritis",text,"Condition","Osteoarthritis")
            createLink(ss,"Short term memory loss",text,"Condition","Memory Loss")
            createLink(ss,"Peptic ulcers",text,"Condition","Peptic Ulcers")
            createLink(ss,"Psoriasis",text,"Condition","Psoriasis")
            createLink(ss,"PMS",text,"Condition","PMS")
            createLink(ss,"Psoriatic arthritis",text,"Condition","Psoriatic Arthritis")
            createLink(ss,"psoriatic arthritis",text,"Condition","Psoriatic Arthritis")
            createLink(ss,"Parkinson's disease",text,"Condition","Parkinson's Disease")
            createLink(ss,"Rheumatoid arthritis",text,"Condition","Rheumatoid Arthritis")
            createLink(ss,"rheumatoid arthritis",text,"Condition","Rheumatoid Arthritis")
            createLink(ss,"Schizophrenia",text,"Condition","Schizophrenia")
            createLink(ss,"Uterine Fibroids",text,"Condition","Uterine Fibroids")
            createLink(ss,"Ulcerative colitis",text,"Condition","Ulcerative Colitis")

            binding.contentData.text = ss

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

            binding.desc.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.desc.strokeWidth = 5

        }
        binding.forth.setOnClickListener {
            binding.subHeading.text = "Physiologic therapeutics"
            binding.contentData.text = "• Binds to bile acids, causing a decrease in blood cholesterol\n" +
                    "• Can cause constipation if initial dose is too large or insufficient water at the time the fiber supplement is taken\n" +
                    "• Decreases gastric emptying resulting in better digestion and absorption\n" +
                    "• Decreases hyperglycemic response\n" +
                    "• Decreases transit time\n" +
                    "• Increases intestional bacterial flora\n" +
                    "• Increases pancreatic secretion\n" +
                    "• Increases satiety"

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

            binding.desc.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.desc.strokeWidth = 5


        }
        binding.fifth.setOnClickListener {
            binding.subHeading.text = "Drug/Nutrient Interaction"
            binding.contentData.text = "• May interfere with absorption of certain drugs and minerals - take fiber supplements hours away from medications"

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

            binding.desc.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.desc.strokeWidth = 5

        }
        binding.sixth.setOnClickListener {
            binding.subHeading.text = "Adverse Reactions and Toxicity"
            binding.contentData.text = "• Fiber supplements in pill form are contraindicated in disorders of the esophagus\n" +
                    "• Sudden increase in dietary fiber can cause flatulence and abdominal pain/discomfort"

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

            binding.desc.setCardBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            binding.descText.setTextColor(ContextCompat.getColor(this,R.color.skin))
            binding.desc.strokeWidth = 5

        }

    }


    private fun createLink(ss: SpannableString, sub_str: String, string: String, activity: String, heading: String) {

        var index = string.indexOf(sub_str)
        while (index != -1) {
            val clickableSpan = object : ClickableSpan(){
                override fun onClick(widget: View) {
                    val intent : Intent
                    if(activity=="Condition"){
                        intent = Intent(this@FiberDetailActivity,ConditionDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Supplement"){
                        intent = Intent(this@FiberDetailActivity,SupplementDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Fiber"){
                        intent = Intent(this@FiberDetailActivity,FiberDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Vitamin"){
                        intent = Intent(this@FiberDetailActivity,VitaminMineralDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(activity=="Botanical"){
                        intent = Intent(this@FiberDetailActivity,BotanicalDetailActivity::class.java)
                        intent.putExtra("heading",heading)
                        startActivity(intent)
                    }else if(heading == "Fat"){
                        val intent = Intent(this@FiberDetailActivity,FattyAcidActivity::class.java)
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