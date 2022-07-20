package com.example.naturalopinion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivitySulphiteBinding

class HydroTherapyActivity : AppCompatActivity() {
    lateinit var binding : ActivitySulphiteBinding
    var heading = ""
    var ss = SpannableString("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySulphiteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        binding.backButton6.setOnClickListener { finish() }

        heading = intent.getStringExtra("heading").toString()
        binding.fiber.text = heading

        if(heading=="Homeopathy"){
            binding.contentData.text = "Twenty-five centuries ago, Hippocrates taught the principle, 'the same things which cause a disease cure it.' Around 1790, Christian Samuel Hahnemann, a brillant German physician, chemist and toxicologist, began conducting experiments with the known medicines of that particular time, aconite, belladonna, cinchona, ipecac, mercury, etc., using himself as the patient. For example, he observed that taking quinine brought on symptoms of malaria, the disease that quinine often cured. After years and many agents tested, he concluded that 'like cures like' but only when the agent was very weak or infinitesimal.\n" +
                    "\n" +
                    "For 200 years since Hahnemann, homeopaths have studied the behavior of humans when brought into contact with a single substance. They collected data about such substances, referred to as remedies, in homeopathic repertories, including Kent's Repertory, Standard Repertory and Homeopathic Medical Repertory, to name a few.\n" +
                    "\n" +
                    "The remedies are made from substances taken from the vegetable, mineral, and animal kingdoms. Each remedy is diluted and succussed (shaken in a stylized fashion), yielding a solution that probably contains none of the original molecules but contains the electromagnetic imprint. Each remedy has its own profile, or personality, which is matched to the patient's profile.\n" +
                    "\n" +
                    "Europe, especially Germany, and India use homeopathy as a primary treatment modality. Even though the molecule of the original substance cannot be scientifically measured, numerous research articles have appeared, showing the effectiveness of homeopathic remedies in children and animals in double-blind studies. One research article showed homeopathic remedies contained no molecules of the original substances, and yet each remedy possessed a different lattice configuration upon freezing.\n" +
                    "\n" +
                    "Homeopathic remedies are becoming more popular in the United States. The remedies are non-invasive, without harmful side-effects and fairly cheap compared to conventional drug therapy. Someone interested in homeopathy should consult a homeopathic physician before taking any remedies.\n" +
                    "\n" +
                    "Natural Medical Protocols has included a Homeopathy section in each of the medical conditions. All the remedies listed are merely suggestions. The attending physician should take the whole homeopathic picture before prescribing."
        }
        else if(heading == "Sulfite Sources"){
            binding.fiber.text = "Food Sources of Sulfites"
            var s = "Alcoholic Beverages:\n" +
                    "• Beer\n" +
                    "• Cocktail mixes\n" +
                    "• Most distilled liquors\n" +
                    "• Wine\n" +
                    "• Wine coolers\n" +
                    "(Labeling of sulfites in alcoholic beverages is required if the concentration is 10 parts per million or greater.)\n" +
                    "\n" +
                    "Baked Goods:\n" +
                    "• Bread with dough conditioners\n" +
                    "• Cookies\n" +
                    "• Crackers\n" +
                    "• Crepes\n" +
                    "Mixes with dried fruits or vegetables\n" +
                    "• Pie crust\n" +
                    "• Pizza crust\n" +
                    "• Quiche crust\n" +
                    "• Soft pretzels\n" +
                    "• Tortillas and tortilla shells\n" +
                    "• Waffles\n" +
                    "Condiments and Relishes:\n" +
                    "• Horseradish\n" +
                    "• Olives\n" +
                    "• Onion and pickle relishes\n" +
                    "• Pickles\n" +
                    "• Salad dressing mixes\n" +
                    "• Wine vinegar\n" +
                    "Confections and Frostings:\n" +
                    "• All canned or packaged frosting mixes\n" +
                    "Dairy Product Analogs:\n" +
                    "• All processed 'cheese foods' containing filled milk (skim milk enriched in fat content by addition of vegetable oils)\n" +
                    "Dried Vegetables:\n" +
                    "• Chives\n" +
                    "• Herbs and spices\n" +
                    "• Parsley\n" +
                    "Fish and Shellfish (fresh):\n" +
                    "• Scallops\n" +
                    "• Shrimp\n" +
                    "• Fish and Shellfish (frozen, canned, dried):\n" +
                    "• Clams\n" +
                    "• Crab\n" +
                    "• Dried cod\n" +
                    "• Lobster\n" +
                    "• Scallops\n" +
                    "• Shrimp\n" +
                    "Fresh Fruits and Vegetables:\n" +
                    "• 'Fresh cut' potatoes (as delivered to restaurants)\n" +
                    "• Grapes (sulfur dioxide is used as a fungicide on grapes)\n" +
                    "Gelatins, Puddings, Fillings:\n" +
                    "• Flavored and unflavored gelatin\n" +
                    "• Fruit fillings\n" +
                    "• Jelling agents\n" +
                    "• Pectin\n" +
                    "Grain Products and Pasta:\n" +
                    "• Batters\n" +
                    "• Breading\n" +
                    "• Cornstarch\n" +
                    "• Gravies\n" +
                    "• Hominy\n" +
                    "• Modified food starch\n" +
                    "• Noodle/rice mixes\n" +
                    "• Spinach pasta\n" +
                    "Hard Candies:\n" +
                    "• All clear, hard candy\n" +
                    "Jams and Jellies:\n" +
                    "• All jams and jellies\n" +
                    "Nuts and Nut Products:\n" +
                    "• Shredded coconut\n" +
                    "Plant-Protein Products:\n" +
                    "• Soy protein products including tofu, textured vegetable protein, and infant formula\n" +
                    "Processed Fruits:\n" +
                    "• All dried fruit, including raisins and prunes\n" +
                    "• Canned, bottled or frozen fruit\n" +
                    "• Glazed fruit\n" +
                    "• Maraschino cherries\n" +
                    "Processed Vegetables:\n" +
                    "• All frozen vegetables (including french fries, deli potato salad)\n" +
                    "• Canned vegetables (including potatoes)\n" +
                    "• Dried vegetables\n" +
                    "• Instant mashed potatoes\n" +
                    "• Pickled vegetables (including sauerkraut, cauliflower and peppers)\n" +
                    "• Vegetable juices\n" +
                    "Refined Sugar:\n" +
                    "• All sugars, including brown, white, powdered, and raw\n" +
                    "Snack Foods:\n" +
                    "• Dried fruit snacks\n" +
                    "• Filled Crackers\n" +
                    "• Potato chips\n" +
                    "• Tortilla chips\n" +
                    "• Trail mixes"
            ss = SpannableString(s)
            makeBold(ss,s,"Alcoholic Beverages:")
            makeBold(ss,s,"Baked Goods:")
            makeBold(ss,s,"Condiments and Relishes:")
            makeBold(ss,s,"Confections and Frostings:")
            makeBold(ss,s,"Dairy Product Analogs:")
            makeBold(ss,s,"Dried Vegetables:")
            makeBold(ss,s,"Fish and Shellfish (fresh):")
            makeBold(ss,s,"Fish and Shellfish (frozen, canned, dried):")
            makeBold(ss,s,"Fresh Fruits and Vegetables:")
            makeBold(ss,s,"Gelatins, Puddings, Fillings:")
            makeBold(ss,s,"Grain Products and Pasta:")
            makeBold(ss,s,"Hard Candies:")
            makeBold(ss,s,"Jams and Jellies:")
            makeBold(ss,s,"Nuts and Nut Products:")
            makeBold(ss,s,"Plant-Protein Products:")
            makeBold(ss,s,"Processed Fruits:")
            makeBold(ss,s,"Processed Vegetables:")
            makeBold(ss,s,"Refined Sugar:")
            makeBold(ss,s,"Snack Foods:")
            binding.contentData.text = ss
        }
        else
            itemsNeeded(heading)
        setButtons(heading)
        binding.first.setOnClickListener {
            itemsNeeded(heading)

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

        }
        binding.second.setOnClickListener {
            instructions(heading)
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


        }
        binding.third.setOnClickListener {

            clinicalIndications(heading)

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


        }
        binding.forth.setOnClickListener {

            contraIndication(heading)

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



        }
        binding.fifth.setOnClickListener {

            actionMechanism(heading)

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


        }

    }

    private fun setButtons(heading: String) {
        when(heading){
            "Continuous Bath" -> {
                binding.first.visibility = View.VISIBLE
                binding.firstText.text = "Items Needed"

                binding.second.visibility = View.VISIBLE
                binding.secondText.text = "Instructions:"

                binding.third.visibility = View.VISIBLE
                binding.firstText.text = "Clincial Indications"

                binding.forth.visibility = View.VISIBLE
                binding.firstText.text = "Contraindications"
            }
            "Constitutional Hydrotherapy" -> {

                binding.first.visibility = View.VISIBLE
                binding.firstText.text = "Items Needed"

                binding.second.visibility = View.VISIBLE
                binding.secondText.text = "Instructions:"

                binding.third.visibility = View.VISIBLE
                binding.firstText.text = "Clincial Indications"

                binding.forth.visibility = View.VISIBLE
                binding.firstText.text = "Contraindications"
            }
            "Enemas" -> {

                binding.first.visibility = View.VISIBLE
                binding.firstText.text = "Enema"

                binding.second.visibility = View.VISIBLE
                binding.secondText.text = "Directions"
            }
            "Heating Compress" -> {
                binding.fiberDescription.text = "A heating compress is moist heat via a cold compress applied to a body part and covered with wool or flannel."

                binding.first.visibility = View.VISIBLE
                binding.firstText.text = "Materials"

                binding.second.visibility = View.VISIBLE
                binding.secondText.text = "Procedure"

                binding.third.visibility = View.VISIBLE
                binding.firstText.text = "Clinical Indications"

            }
            "Poultices" -> {

                binding.first.visibility = View.VISIBLE
                binding.firstText.text = "Materials Needed"

                binding.second.visibility = View.VISIBLE
                binding.secondText.text = "Procedure"

                binding.third.visibility = View.VISIBLE
                binding.firstText.text = "Clincial Indications"

                binding.forth.visibility = View.VISIBLE
                binding.firstText.text = "Contraindications"
            }
            "Sitz Bath" -> {
                binding.fiberDescription.text = "Patient sits with lower abdomen and pelvis immersed in water."
                binding.first.visibility = View.VISIBLE
                binding.firstText.text = "Indications"

                binding.second.visibility = View.VISIBLE
                binding.secondText.text = "Action Mechanism"

                binding.third.visibility = View.VISIBLE
                binding.firstText.text = "Materials"

                binding.forth.visibility = View.VISIBLE
                binding.firstText.text = "Procedure"

                binding.fifth.visibility = View.VISIBLE
                binding.fifthText.text = "Contraindications"
            }
        }
    }

    private fun actionMechanism(heading: String) {
        var s = ""
        var ss = SpannableString("")
        when(heading){
            "Sitz Bath" -> {
                s = "General:\n" +
                        "Inability to move with safety and ease (e.g. debility, obesity)\n" +
                        "Hot foot bath is contraindicated in peripheral vascular disease\n" +
                        "Specific:\n" +
                        "Hot:\n" +
                        "Hemorrhage\n" +
                        "Menorrhagia\n" +
                        "Atonic conditions i.e. prolapsus\n" +
                        "Pelvic congestion\n" +
                        "Cold:\n" +
                        "Acute lung congestion\n" +
                        "Heart problems\n" +
                        "Acute inflammation\n" +
                        "Painful conditions\n" +
                        "Spasms\n" +
                        "Colics\n" +
                        "Alternating:\n" +
                        "See listings under hot and cold"
                ss = SpannableString(s)
            }
        }
        binding.contentData.text = ss
    }

    private fun contraIndication(heading: String) {
        var s = ""
        var ss = SpannableString("")
        when(heading){
            "Continuous Bath" -> {
                s = "None known"
                ss = SpannableString(s)
            }
            "Constitutional Hydrotherapy" -> {
                s = "Acute asthma\n" +
                        "Acute bladder infection\n" +
                        "Fear of treatment\n" +
                        "Malignant fever\n" +
                        "Patient with oral temperature less than 97 F"
                ss = SpannableString(s)
            }
            "Poultices" -> {
                s = "Allergy to poultice substance"
                ss = SpannableString(s)

            }
            "Sitz Bath" -> {
                s = "Place towel on bottom of tub and drape towels over the front and back of the tub to protect patient's buttocks, back, and popliteal area\n" +
                        "Fill sitz and foot tubs with water of appropriate temperature and amounts as indicated below:\n" +
                        "Hot bath:\n" +
                        "Amount: 1/2 \" above navel\n" +
                        "Temperature: 106 - 110 F (41 - 43 C)\n" +
                        "Foot bath: 110 - 112 F (43 - 45 C)\n" +
                        "Duration: 3 - 8 minutes\n" +
                        "Cold bath:\n" +
                        "Amount: 1/2\" below navel\n" +
                        "Temperature: 55 - 75 F (12 - 24 C)\n" +
                        "Foot bath: 105 - 110 F (40 - 43 C)\n" +
                        "Duration: 3 - 8 minutes\n" +
                        "Neutral bath:\n" +
                        "Amount: to navel\n" +
                        "Temperature: 92 - 97 F (33 - 36 C)\n" +
                        "Foot bath: --\n" +
                        "Duration: 1/2 - 2 hours\n" +
                        "Alternating hot and cold bath:\n" +
                        "2-5 minutes hot\n" +
                        "20-60 seconds cold\n" +
                        "Carefully assist the patient in and out of the bath\n" +
                        "Cover patient with sheet and/or blanket if desired by patient\n" +
                        "For the hot sitz bath: apply cold compresses to forehead and back of neck\n" +
                        "Finish hot sitz by pouring cold water over all parts bathed in hot water\n" +
                        "Start alternating sitz with hot and end with cold\n" +
                        "Finish hot foot bath with cold effusion to feet\n" +
                        "Rest patient for at least 30 minutes after bath"
                ss = SpannableString(s)
            }
        }
        binding.contentData.text = ss
    }

    private fun clinicalIndications(heading: String) {
        var s = ""
        var ss = SpannableString("")
        when(heading){
            "Continuous Bath" -> {
                s = "Parkinson's disease\n" +
                        "Abscess\n" +
                        "Burns\n" +
                        "Fecal fistula\n" +
                        "Itching\n" +
                        "Pain\n" +
                        "Pemphigus\n" +
                        "Spasms"
                ss = SpannableString(s)
            }
            "Constitutional Hydrotherapy" -> {
                s = "AIDS\n" +
                        "Allergies\n" +
                        "Amenorrhea\n" +
                        "Asthma, chronic\n" +
                        "Bronchitis\n" +
                        "Candidiasis\n" +
                        "Chronic fatigue syndrome\n" +
                        "Crohn's disease\n" +
                        "Depression\n" +
                        "Diabetes\n" +
                        "Dysmenorrhea\n" +
                        "Eczema\n" +
                        "Hemorrhoids\n" +
                        "Hypertension\n" +
                        "Irritable bowel syndrome\n" +
                        "Mastitis\n" +
                        "Multiple sclerosis\n" +
                        "Obesity\n" +
                        "Otitis media\n" +
                        "Peptic ulcer\n" +
                        "PMS\n" +
                        "Psoriasis\n" +
                        "Psoriatic arthritis\n" +
                        "Rheumatoid arthritis\n" +
                        "Ulcerative colitis\n" +
                        "Uterine fibroid\n" +
                        "Almost any medical condition except those listed in Contraindications section\n" +
                        "Colds\n" +
                        "Dyspepsia\n" +
                        "Environmental hypersensitivity\n" +
                        "Flu\n" +
                        "Infertility\n" +
                        "Lymphangitis\n" +
                        "Pleurisy\n" +
                        "Raynaud's disease\n" +
                        "Varicose veins"
                ss = SpannableString(s)
                makeBold(ss,s,"Contraindications")
            }
            "Heating Compress" -> {
                s = "Chest compress:\n" +
                        "\n" +
                        "Asthma-if acute, start with hot first for 5-10 minutes\n" +
                        "Bronchitis - chronic\n" +
                        "Mastitis - acute\n" +
                        "Pneumonia\n" +
                        "Chest cold\n" +
                        "Early influenza\n" +
                        "Cough\n" +
                        "Abdominal compress:\n" +
                        "\n" +
                        "Constipation\n" +
                        "Crohn's disease\n" +
                        "Ulcerative colitis\n" +
                        "Irritable bowel syndrome\n" +
                        "Appendicitis, chronic\n" +
                        "Backache\n" +
                        "Biliary stasis\n" +
                        "Diarrhea\n" +
                        "Dyspepsia\n" +
                        "Flatulence\n" +
                        "Insomnia\n"
                ss = SpannableString(s)

            }
            "Poultices" -> {
                s = "Fibromyalgia\n" +
                        "Mastitis\n" +
                        "Otitis media\n" +
                        "Pain\n" +
                        "Congestion\n" +
                        "Inflammation\n" +
                        "Bee stings\n" +
                        "Insect bites\n" +
                        "Abscesses\n" +
                        "Swelling\n" +
                        "Wound healing\n" +
                        "Antisepsis"
                ss = SpannableString(s)

            }
            "Sitz Bath" -> {
                s = "Washtub or sitz tub\n" +
                        "Foot tub\n" +
                        "Bath thermometer\n" +
                        "Towels\n" +
                        "Sheet/blanket to cover patient if necessary\n" +
                        "Hot water\n" +
                        "Cold water\n" +
                        "Washcloths"
                ss = SpannableString(s)
            }
        }
        binding.contentData.text = ss
    }

    private fun instructions(heading: String) {
        var s = ""
        var ss = SpannableString("")
        when(heading){
            "Continuous Bath" -> {
                s = "Place clamps or hooks in wall at each end of the tub\n" +
                        "Suspend hammock/sheet on clamps/hooks in the tub, clearing the bottom of the tub when patient is lying in the hammock\n" +
                        "Keep water temperature 92-98 degrees (depending on patient's level of comfort) by continuously running water into the tub\n" +
                        "Feet should be kept out of water to prevent swelling\n" +
                        "Soak for 2 to 12 hours 5-6 times a week\n" +
                        "Scrub with soap and water after soaking\n" +
                        "Apply vaseline or lanolin\n" +
                        "End procedure with 5-10 minutes of exercise"
                ss = SpannableString(s)
            }
            "Constitutional Hydrotherapy" -> {
                s = "Place 1 or more wool blankets on bed-like area, followed by a sheet.\n" +
                        "The person is to lie down in the center of the sheet, nude to the top of the pelvic bone. Add a pillow under the head if the person would be more comfortable.\n" +
                        "Wrap the person in the sheet and blankets, leaving the front exposed.\n" +
                        "Apply the hot towel to the person's front from chin to pubic bone.\n" +
                        "Wrap the person immediately.\n" +
                        "Leave these hot towels on the patient for 5 minutes.\n" +
                        "During these 5 minutes, prepare the second towel by soaking it in ice water.\n" +
                        "Wring the towel as dry as possible.\n" +
                        "At the end of 5 minutes, remove the hot towel and apply the cold towel.\n" +
                        "Wrap securely.\n" +
                        "Leave for 10 minutes.\n" +
                        "After the 10 minutes, check the towel. If the towel has not heated up, leave it on for another 5 minutes or until it is warm to the touch.\n" +
                        "Have the person flip over onto the stomach and do the identical procedure on the back.\n" +
                        "After completing both sides, allow the person to rest quietly for 10-15 minutes."
                ss = SpannableString(s)
                makeBold(ss,s,"hot")
                makeBold(ss,s,"ice")
                makeBold(ss,s,"cold")
            }
            "Enemas" -> {
                s = "Fill enema bag\n" +
                        "Hook about 4 feet above floor (on towel rack)\n" +
                        "Knee-chest position with chest against floor and rectum higher than head\n" +
                        "Insert nozzle tip into rectum, using lubricant if needed\n" +
                        "Empty water into rectum, and hold inside rectum as much as possible\n" +
                        "Massage abdomen in counter-clockwise direction\n" +
                        "When bag is empty or no more fluid can be held, remove tip\n" +
                        "Lie on each side for 5 minutes, while massaging abdomen\n" +
                        "Discard contents of rectum into toilet\n" +
                        "Repeat until bag is empty"
                ss = SpannableString(s)
            }
            "Heating Compress" -> {
                s = "Soak cotton compress in cold (ice) water\n" +
                        "Wring out as much water as possible\n" +
                        "Apply compress to treated area\n" +
                        "Add plastic wrap over cotton\n" +
                        "Wrap snugly in wool or flannel cloth so no air can circulate within compress\n" +
                        "Secure wrap with pins or fastening device\n" +
                        "Keep compress in place until the body has heated the cold cotton cloth"
                ss = SpannableString(s)

            }
            "Poultices" -> {
                s = "Make poultice paste\n" +
                        "Apply paste to cotton or directly to skin\n" +
                        "Place cotton cloth over treatment area\n" +
                        "Cover with plastic\n" +
                        "Cover with wool\n" +
                        "Secure\n" +
                        "Leave on for 1/2-8 hours"
                ss = SpannableString(s)

            }
            "Sitz Bath" -> {
                s = "Pelvic and abdominal organs receive reflexive effects from spinal cord\n" +
                        "Direct effects according to the water temperature and duration of bath (e.g., hot - relaxing; cold - tonifying; neutral - calmative)\n" +
                        "Derivation from the head and lungs\n" +
                        "Hot foot bath minimizes the possibility of congestion via the derivative effects"
                ss = SpannableString(s)
            }
        }
        binding.contentData.text = ss
    }

    private fun itemsNeeded(heading: String) {
        var s = ""
        when(heading){
            "Continuous Bath" -> {
                s = "Bathtub with running water\n" +
                        "Hammock or sheet\n" +
                        "Rubber pillow for head and feet\n" +
                        "Carpenter's clamps or strong hooks"
                ss = SpannableString(s)
            }
            "Constitutional Hydrotherapy" -> {
                s = "1 wet towel heated in microwave or with hot water until just tolerated when pressed to the wrists (not too hot to burn the person)\n" +
                        "1 towel placed in cold water with ice cubes\n" +
                        "bed with 1 wool blanket and 1 sheet (more blankets if available)"
                ss = SpannableString(s)
                makeBold(ss,"heated",s)
                makeBold(ss,"hot",s)
                makeBold(ss,"cold",s)
                makeBold(ss,"ice",s)
            }
            "Enemas" -> {
                s = "Garlic-Epsom Salt Enema:\n" +
                        "Ingredients:\n" +
                        "3 cloves of chopped garlic in 2 quarts of water\n" +
                        "Simmer for 5 minutes\n" +
                        "Add 2 Tbl. Epsom salt\n" +
                        "When cool, pour into bag\n" +
                        "Add extra water to fill bag and correct temperature\n" +
                        "Use warm, not hot water\n" +
                        "Precautions:\n" +
                        "Very purging\n" +
                        "Use no more than twice during a fast\n" +
                        "Coffee Enema:\n" +
                        "Ingredients:\n" +
                        "Regular ground coffee, not instant\n" +
                        "4 Tbl. coffee to 2 quarts of hot water\n" +
                        "Brew in coffee maker/pot\n" +
                        "When cool, pour into bag\n" +
                        "Clinical Indications:\n" +
                        "Dysmenorrhea\n" +
                        "Eczema\n" +
                        "Gout\n" +
                        "Irritable bowel syndrome\n" +
                        "Psoriasis\n" +
                        "Psoriatic arthritis\n" +
                        "Rheumatoid arthritis\n" +
                        "Rosacea\n" +
                        "Chronic constipation\n" +
                        "Liver ailments\n" +
                        "Past or present drug abuse\n" +
                        "Salt and Soda Enema:\n" +
                        "Ingredients:\n" +
                        "1 Tbl. sea salt\n" +
                        "1 Tbl. baking soda\n" +
                        "2 quarts water\n" +
                        "Mae West Enema:\n" +
                        "Ingredients:\n" +
                        "To the coffee enema, add:\n" +
                        "1 Tbl. sea salt\n" +
                        "1 Tbl. baking soda\n" +
                        "Add enough water to coffee enema to make 2 quarts\n" +
                        "Wheat Grass Enema:\n" +
                        "Ingredients:\n" +
                        "1-2 oz. fresh wheat grass juice\n" +
                        "2 quarts water\n" +
                        "Can substitute green juice or chlorophyll for wheat grass\n" +
                        "Lactobacillis Acidophilus Enema:\n" +
                        "Ingredients:\n" +
                        "2 Tbl. yogurt or\n" +
                        "4 - 5 caps dry acidophilus or\n" +
                        "1/8 tsp. powdered acidophilus\n" +
                        "2 quarts water\n" +
                        "Clinical Indications:\n" +
                        "AIDS\n" +
                        "Candidiasis\n" +
                        "Crohn's disease\n" +
                        "Irritable bowel syndrome\n" +
                        "Ulcerative colitis\n" +
                        "Do not use yogurt if dairy allergy\n" +
                        "Last day of fast\n" +
                        "Vinegar Enema:\n" +
                        "Ingredients:\n" +
                        "2 Tbl. white vinegar\n" +
                        "2 quarts warm water"
                ss = SpannableString(s)
            }
            "Heating Compress" -> {
                s = "Cotton cloth large enough to cover area to be treated\n" +
                        "Wool or flannel cloth large enough to cover cotton cloth\n" +
                        "Safety pins or fastening devices\n" +
                        "Plastic (i.e. garbage bag or cellophane wrap)\n" +
                        "Cold water"
                ss = SpannableString(s)

            }
            "Poultices" -> {
                s = "Poultice substances:\n" +
                        "Powdered charcoal\n" +
                        "Herbs\n" +
                        "Charcoal and flaxseed oil (for otitis media)\n" +
                        "Ginger and carrot (for otitis media)\n" +
                        "Cooked onion (for otitis media)\n" +
                        "Mustard\n" +
                        "Clay\n" +
                        "Coffee\n" +
                        "Shredded carrots\n" +
                        "Shredded potatoes\n" +
                        "Water:\n" +
                        "Hot\n" +
                        "Enough to make a paste out of poultice substance\n" +
                        "Freshly shredded vegetables usually provide enough moisture\n" +
                        "Cotton cloth\n" +
                        "Large enough to cover designated area\n" +
                        "Plastic\n" +
                        "Large enough to cover cotton\n" +
                        "Wool\n" +
                        "Large enough to cover plastic\n" +
                        "Pin, tape or bandage for fastening"
                ss = SpannableString(s)

            }
            "Sitz Bath" -> {
                s = "Hot bath:\n" +
                        "Amenorrhea\n" +
                        "Fibromyalgia\n" +
                        "Headache - congestive\n" +
                        "Painful hemorrhoids\n" +
                        "Uterine fibroids\n" +
                        "Painful spasms (vaginismus, tenesmus)\n" +
                        "Colic (e.g., intestinal, uterine, nephritic)\n" +
                        "Suppressed menses\n" +
                        "Insomnia\n" +
                        "Neuralgia (e.g., intestinal, ovarian, testicular)\n" +
                        "Sciatica\n" +
                        "Lumbago\n" +
                        "Cold bath:\n" +
                        "BPH (benign prostatic hypertrophy)\n" +
                        "Incontinence due to BPH\n" +
                        "Enuresis\n" +
                        "Menorrhagia\n" +
                        "Prolapsus (e.g., uterine, rectocele, cystocele)\n" +
                        "Constipation\n" +
                        "Stage fright\n" +
                        "Neutral bath:\n" +
                        "Cystitis - acute\n" +
                        "Pruritis ani\n" +
                        "Pruritis vulvae\n" +
                        "Mental or sexual excitement\n" +
                        "Alternating hot and cold baths:\n" +
                        "Cystitis - chronic\n" +
                        "Endometriosis\n" +
                        "Headache - congestive\n" +
                        "Hemorrhoids\n" +
                        "PMS\n" +
                        "Uterine fibroid\n" +
                        "Constipation\n" +
                        "Vaginal infection\n" +
                        "Postpartum\n" +
                        "PID\n" +
                        "Improving neuralgias\n" +
                        "Prostatitis\n" +
                        "Improving insomnia\n" +
                        "Fissures\n" +
                        "Pelvic congestion"
                ss = SpannableString(s)
            }
        }
        binding.contentData.text = ss
    }
    fun makeBold(ss : SpannableString,string:String,substr:String){
        if(string.indexOf(substr)!=-1 )
            ss.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD),string.indexOf(substr),string.indexOf(substr)+substr.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
}