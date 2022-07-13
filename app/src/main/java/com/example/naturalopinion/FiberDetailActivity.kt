package com.example.naturalopinion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Spanned
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityFiberDetailBinding

class FiberDetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityFiberDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFiberDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        binding.backButton6.setOnClickListener { finish() }

        binding.fiberDescription.text = "Fiber is the components of plant cell walls and the undigestible carbohydrates residues, except lignin which is a non carbohydrate polymer. There are several types of fiber: water soluble (e.g., pectin, gums, mucilages) found in fruits; and water insoluble (e.g., cellulose, hemicelluloses) found in wheat bran."
        binding.contentData.text = "• Pill form-can swell 7 times the original size in 1 minute after contact with water\n" +
                "• Fiber-filled gelatin capsules-begin to swell 6 minutes after contact with water\n" +
                "• Best sources of water-soluble fibers for non-laxative effects:\n" +
                "psyllium, guar gum, glucomannan, gum karaya, and pectin"
        binding.subHeading.text = "Supplement Forms"

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


        }
        binding.third.setOnClickListener {
            binding.subHeading.text = "Clinical Indications"
            binding.contentData.text = setTextHTML("• AIDS<br/>" +
                    "• Atherosclerosis<br/>" +
                    "• Cancer prevention<br/>" +
                    "• Candidiasis<br/>" +
                    "• Cholecystitis<br/>" +
                    "• Cholelithiasis<br/>" +
                    "• Chronic fatigue syndrome<br/>" +
                    "• Congestive heart failure<br/>" +
                    "• Constipation<br/>" +
                    "• Crohn's disease<br/>" +
                    "• Diabetes mellitus<br/>" +
                    "• Dysmenorrhea<br/>" +
                    "• Endometriosis<br/>" +
                    "• Eczema<br/>" +
                    "• Fibrocystic breast disease<br/>" +
                    "• Gout<br/>" +
                    "• Headaches<br/>" +
                    "• Hemorrhoids<br/>" +
                    "• Hypertension<br/>" +
                    "• Irritable bowel syndrome<br/>" +
                    "• Menopause<br/>" +
                    "• Multiple sclerosis<br/>" +
                    "• Obesity<br/>" +
                    "• Peptic ulcers<br/>" +
                    "• PMS<br/>" +
                    "• Psoriasis<br/>" +
                    "• Psoriatic arthritis<br/>" +
                    "• Ulcerative colitis<br/>" +
                    "• Uterine fibroid<br/>" +
                    "• Appendicitis<br/>" +
                    "• Autoimmune disorders<br/>" +
                    "• Colon cancer<br/>" +
                    "• Deep-vein thrombosis<br/>" +
                    "• Dental caries<br/>" +
                    "• Diverticulitis<br/>" +
                    "• Pernicious anemia<br/>" +
                    "• Pulmonary embolism<br/>" +
                    "• Renal lithiasis<br/>" +
                    "• Skin disorders<br/>" +
                    "• Thyrotoxicosis<br/>" +
                    "• Varicose veins")

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



        }

    }

    private fun setTextHTML(html: String): Spanned
    {
        val result: Spanned = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(html)
        }
        return result
    }
}