package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.naturalopinion.databinding.ActivityBotanicalDetailBinding

class BotanicalDetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityBotanicalDetailBinding
    var heading = ""
    var therapeutic_details = ""
    var indication_details = ""
    var contraindication_details = ""
    var drug_details = ""
    var chemical_details = ""
    var toxic_details = ""
    var ss : SpannableString = SpannableString("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBotanicalDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        heading = intent.getStringExtra("heading").toString()

        binding.contentData.movementMethod = LinkMovementMethod.getInstance()

        //Status bar color changed
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.deep_green)

        binding.backButton6.setOnClickListener { finish() }

        setTherapeuticAction(heading)
        binding.botanical.text = heading
        binding.contentData.text = therapeutic_details
        binding.subHeading.text = "Therapeutic Actions"

        binding.first.setOnClickListener {
            binding.subHeading.text = "Therapeutic Actions"
            setTherapeuticAction(heading)

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
            binding.subHeading.text = "Clinical Indications"
            setIndicationAction(heading)


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
            binding.subHeading.text = "Contraindications"
            setContraIndicationAction(heading)

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
            binding.subHeading.text = "Drug/Nutrient Interaction"
            setDrugDetail(heading)

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
            binding.subHeading.text = "Chemical Constituents"
            setChemicalDetail(heading)

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
            binding.subHeading.text = "Toxicity"
            setToxicityDetail(heading)

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

    private fun setToxicityDetail(heading: String) {
        if(heading=="Allium sativum (Garlic)" || heading=="Garlic (Allium sativum)"){
            toxic_details = "Allergic contact dermatitis\n" +
                    "Goitrogenic (agent that promotes goiter growth in the thyroid)\n" +
                    "Irritation to digestive tract\n" +
                    "Leukocytosis (increased white blood cells in the blood)"
            ss = SpannableString(toxic_details)
        }else if(heading=="Achillea millefolium (Yarrow)" || heading=="Yarrow (Achillea millefolium)"){
            toxic_details = "B-iso-thujone can cause:\n" +
                    "Vomiting\n" +
                    "Stomach and intestinal cramps\n" +
                    "Retention of urine\n" +
                    "Extreme cases with large doses:\n" +
                    "Convulsions\n" +
                    "Renal damage\n" +
                    "Tremors\n" +
                    "Vertigo"
            ss = SpannableString(toxic_details)
        }
        binding.contentData.text = ss
    }

    private fun setChemicalDetail(heading: String) {
        if(heading=="Allium sativum (Garlic)" || heading=="Garlic (Allium sativum)"){
            chemical_details = "Allicin\n" +
                    "Alliin\n" +
                    "Enzymes including:\n" +
                    "Alliinase\n" +
                    "Myrosinase\n" +
                    "Peroxidase\n" +
                    "High concentrations of trace minerals, particularly selenium and germanium\n" +
                    "Mucilage\n" +
                    "Phytosterols\n" +
                    "Resin\n" +
                    "Sulphur compounds\n" +
                    "Vitamins"
            ss = SpannableString(chemical_details)
        }else if(heading=="Achillea millefolium (Yarrow)" || heading=="Yarrow (Achillea millefolium)"){
            chemical_details = "Achilleic acid (identical to aconitic acid)\n" +
                    "Alkanes\n" +
                    "Alkaloids:\n" +
                    "Achilleine\n" +
                    "Betonicine\n" +
                    "Stachydrine\n" +
                    "Apigenin, an antispasmodic agent\n" +
                    "B-iso-thujone, see Toxicity\n" +
                    "Betaine\n" +
                    "Earthly ash consisting of nitrates, phosphates, and chlorides of potash and line\n" +
                    "Fatty acids:\n" +
                    "Linoleic\n" +
                    "Oleic\n" +
                    "Palmatic\n" +
                    "Lactones\n" +
                    "Potassium and calcium salts\n" +
                    "Rutin\n" +
                    "Salicylic acid (anti-inflammatory anodyne organic acid\n" +
                    "Saponins\n" +
                    "Sterols - Beta sitosterol\n" +
                    "Succinic acid\n" +
                    "Trigonelline\n" +
                    "Volatile oils:\n" +
                    "Azulene\n" +
                    "Camphor\n" +
                    "Cineol\n" +
                    "Sabinene\n" +
                    "Pinene"
            ss = SpannableString(chemical_details)
        }
        binding.contentData.text = ss
    }

    private fun setDrugDetail(heading: String) {
        if(heading=="Allium sativum (Garlic)" || heading=="Garlic (Allium sativum)"){
            drug_details = "Insulin dosage should be monitored due to the hypoglycemic activity\n" +
                    "Warfarin's anticoagulant effect is increased due to the fibrinolytic activity of allicin, trisulfides, ajoene and adenosine"
            ss = SpannableString(drug_details)
        }else if(heading=="Achillea millefolium (Yarrow)" || heading=="Yarrow (Achillea millefolium)"){
            drug_details = "Counterproductive to use medications that inhibit stomach acid production, ie antacids, gastric acid secretion inhibitors and histamine H2 receptor antagonists, since yarrow promotes stomach acid secretion"
            ss = SpannableString(drug_details)
        }
        binding.contentData.text = ss
    }

    private fun setContraIndicationAction(heading: String) {
        if(heading=="Allium sativum (Garlic)" || heading=="Garlic (Allium sativum)"){
            contraindication_details = "Acute inflammation\n" +
                    "Dehydration\n" +
                    "Hypoglycemia\n" +
                    "Impending surgery\n" +
                    "Insomnia\n" +
                    "Large amounts can decrease the uptake of iodine by the thyroid\n" +
                    "Organ transplants\n" +
                    "Pemphigus\n" +
                    "Sulphur compounds of garlic may be difficult for some patients to digest"
            ss = SpannableString(contraindication_details)
        }else if(heading=="Achillea millefolium (Yarrow)" || heading=="Yarrow (Achillea millefolium)"){
            contraindication_details = "External use:\n" +
                    "Contact dermatitis in sensitive individuals\n" +
                    "Gastrointestinal inflammation:\n" +
                    "Crohn's disease\n" +
                    "Irritable bowel syndrome\n" +
                    "Ulcerative colitis\n" +
                    "Increased central nervous system function (CNS hyperfunction)\n" +
                    "Pregnancy:\n" +
                    "Due to the emmenagogue and abortifacient effects"
            ss = SpannableString(contraindication_details)
        }
        binding.contentData.text = ss
    }

    private fun setIndicationAction(heading: String) {
        if(heading=="Allium sativum (Garlic)" || heading=="Garlic (Allium sativum)"){
            indication_details = "AIDS\n" +
                    "Allergies\n" +
                    "Asthma\n" +
                    "Atherosclerosis\n" +
                    "Attention deficit disorder\n" +
                    "Bronchitis\n" +
                    "Cancer prevention\n" +
                    "Candidiasis\n" +
                    "Chronic fatigue syndrome\n" +
                    "Diabetes mellitus\n" +
                    "Hypertension\n" +
                    "Otitis media\n" +
                    "Psoriasis\n" +
                    "Psoriatic arthritis\n" +
                    "Bacterial, viral, and fungal infections\n" +
                    "Cancer\n" +
                    "Cardiovascular diseases\n" +
                    "Flatulence\n" +
                    "Fungal infections of the skin - use topically\n" +
                    "Hypercholesterolemia\n" +
                    "Inflammatory conditions\n" +
                    "Nausea\n" +
                    "Parasite infections\n" +
                    "Respiratory disorders\n" +
                    "Vaginitis"
            ss = SpannableString(indication_details)

            createLink(ss,"AIDS",indication_details,"Condition","AIDS")
            createLink(ss,"Allergies",indication_details,"Condition","Allergies")
            createLink(ss,"Asthma",indication_details,"Condition","Asthma")
            createLink(ss,"Atherosclerosis",indication_details,"Condition","Atherosclerosis")
            createLink(ss,"Attention deficit disorder",indication_details,"Condition","Attention Deficit Disorder")
            createLink(ss,"Bronchitis",indication_details,"Condition","Bronchitis")
            createLink(ss,"Cancer prevention",indication_details,"Condition","Cancer Prevention")
            createLink(ss,"Candidiasis",indication_details,"Condition","Candidiasis")
            createLink(ss,"Chronic fatigue syndrome",indication_details,"Condition","Chronic Fatigue Syndrome")
            createLink(ss,"Diabetes mellitus",indication_details,"Condition","Diabetes Mellitus")
            createLink(ss,"Hypertension",indication_details,"Condition","Hypertension")
            createLink(ss,"Otitis media",indication_details,"Condition","Otitis Media")
            createLink(ss,"Psoriasis",indication_details,"Condition","Psoriasis")
            createLink(ss,"Psoriatic arthritis",indication_details,"Condition","Psoriatic Arthritis")

        }
        else if(heading=="Achillea millefolium (Yarrow)" || heading=="Yarrow (Achillea millefolium)"){
            indication_details = "Allergies\n" +
                    "Dysmenorrhea\n" +
                    "Hemorrhoids\n" +
                    "Peptic ulcer\n" +
                    "Antibacterial:\n" +
                    "Gram positive bacteria\n" +
                    "Gram negative bacteria\n" +
                    "Circulatory disorders\n" +
                    "Hemorrhaging disorders\n" +
                    "Influenza and colds\n" +
                    "Lacerations and puncture wounds - topically\n" +
                    "Menorrhagia with uterine atony\n" +
                    "Pain associated with pelvic disorders\n" +
                    "Uterine spasms\n" +
                    "Vaginitis with vaginal atony"
            ss = SpannableString(indication_details)
            createLink(ss,"Allergies",indication_details,"Condition","Allergies")
            createLink(ss,"Dysmenorrhea",indication_details,"Condition","Dysmenorrhea")
            createLink(ss,"Hemorrhoids",indication_details,"Condition","Hemorrhoids")
            createLink(ss,"Peptic ulcer",indication_details,"Condition","Peptic Ulcer")
        }

        binding.contentData.text = ss
    }


    private fun setTherapeuticAction(heading: String) {
        if(heading=="Allium sativum (Garlic)" || heading=="Garlic (Allium sativum)"){
            therapeutic_details = "Ameliorates numerous factors which promote atherogenesis\n" +
                    "Antibacterial, including:\n" +
                    "Alpha- and beta-hemolytic Bacillus\n" +
                    "Brucella\n" +
                    "Citrobacter sp.\n" +
                    "Escherichia coli\n" +
                    "Klebsiella pneumoniae\n" +
                    "Mycobacteria\n" +
                    "Proteus vulgaris\n" +
                    "Salmonella enteritidis\n" +
                    "Staphylococcus aureus\n" +
                    "Streptococcus\n" +
                    "Vibrio\n" +
                    "Antifungal, including:\n" +
                    "Candida albicans\n" +
                    "Epidermophyton\n" +
                    "Microsporum\n" +
                    "Trichophyton\n" +
                    "Antihelminthic, including:\n" +
                    "Ascaris lumbricoides\n" +
                    "Hookworms\n" +
                    "Antineoplastic\n" +
                    "Antispasmodic\n" +
                    "Antiviral\n" +
                    "Carminative\n" +
                    "Decongestant\n" +
                    "Decreases systolic pressure for 20-30 mm Hg and diastolic pressure by 10-20 mm Hg\n" +
                    "Diaphoretic\n" +
                    "Digestive stimulant\n" +
                    "Diuretic\n" +
                    "Emmenagogue\n" +
                    "Expectorant\n" +
                    "Hypoglycemic action - allicin competes with insulin for insulin-inactivating compounds allowing for more free insulin to be in circulation\n" +
                    "Inhibits cyclo-oxygenase, the enzyme needed to convert arachidonic acid to thromboxane A2 which is the most potent stimulus of platelet aggregation\n" +
                    "Inhibits lipoxygenase, interrupting the synthesis of leukotrienes, thromboxanes, and prostaglandins\n" +
                    "Inhibits nitrosamine formation\n" +
                    "Increases serum fibrinolytic activity\n" +
                    "Lowers lipids (LDL and VLDL) while increasing HDL\n" +
                    "Rubefacient"
            ss = SpannableString(therapeutic_details)

        }else if(heading=="Achillea millefolium (Yarrow)" || heading=="Yarrow (Achillea millefolium)"){
            therapeutic_details = "Anodyne - due to prostaglandin-inhibiting action\n" +
                    "Anti-inflammatory\n" +
                    "Antiseptic\n" +
                    "Antispasmodic\n" +
                    "Astringent\n" +
                    "Bitter tonic\n" +
                    "Carminative\n" +
                    "Cholagogue\n" +
                    "Decongestant\n" +
                    "Diaphoretic\n" +
                    "Hot infusion - stimulating diaphoretic effect\n" +
                    "Cold infusion - diuretic effect or tones gastric organs\n" +
                    "Diuretic\n" +
                    "Hemostatic\n" +
                    "Hypotensive\n" +
                    "Stimulant\n" +
                    "Urinary antiseptic"
            ss = SpannableString(therapeutic_details)
        }
        binding.contentData.text = ss
    }

    private fun createLink(ss: SpannableString, sub_str: String, string: String, activity: String, heading: String) {
        val clickableSpan = object : ClickableSpan(){
            override fun onClick(widget: View) {
                var intent : Intent
                if(activity=="Condition"){
                    intent = Intent(this@BotanicalDetailActivity,ConditionDetailActivity::class.java)
                    intent.putExtra("heading",heading)
                    startActivity(intent)
                }
            }
        }
        ss.setSpan(clickableSpan,string.indexOf(sub_str),string.indexOf(sub_str)+sub_str.length,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    }

}