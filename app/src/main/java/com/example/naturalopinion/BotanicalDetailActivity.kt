package com.example.naturalopinion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Spanned
import android.view.WindowManager
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBotanicalDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        heading = intent.getStringExtra("heading").toString()

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
            binding.contentData.text =  therapeutic_details

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
            binding.contentData.text =  indication_details


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
            binding.contentData.text =  contraindication_details

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
            binding.contentData.text =  drug_details

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
            binding.contentData.text =  chemical_details

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
            binding.contentData.text =  toxic_details

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
        }
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
        }
    }

    private fun setDrugDetail(heading: String) {
        if(heading=="Allium sativum (Garlic)" || heading=="Garlic (Allium sativum)"){
            drug_details = "Insulin dosage should be monitored due to the hypoglycemic activity\n" +
                    "Warfarin's anticoagulant effect is increased due to the fibrinolytic activity of allicin, trisulfides, ajoene and adenosine"
        }
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
        }
    }

    private fun setIndicationAction(heading: String) {
        if(heading=="Allium sativum (Garlic)" || heading=="Garlic (Allium sativum)"){
            indication_details = "AIDS\n" +
                    "Asthma\n" +
                    "Atherosclerosis\n" +
                    "Candidiasis\n" +
                    "Chronic fatigue syndrome\n" +
                    "Diabetes mellitus\n" +
                    "Hypertension\n" +
                    "Otitis media\n" +
                    "Psoriasis\n" +
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
        }
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