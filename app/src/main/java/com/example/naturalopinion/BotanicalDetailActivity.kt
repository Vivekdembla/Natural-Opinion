package com.example.naturalopinion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Spannable
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
    lateinit var binding: ActivityBotanicalDetailBinding
    var heading = ""
    var therapeutic_details = ""
    var indication_details = ""
    var contraindication_details = ""
    var chemical_details = ""
    var toxic_details = ""
    var ss: SpannableString = SpannableString("")
    var premium = false
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

        val pref = getSharedPreferences("Paid", MODE_PRIVATE)
        premium = pref.getBoolean("Premium", false)

        binding.backButton6.setOnClickListener { finish() }

        setTherapeuticAction(heading)
        binding.botanical.text = heading

        binding.reference.setOnClickListener {
            val intent = Intent(this, HydroTherapyActivity::class.java)
            intent.putExtra("heading", "Reference")
            startActivity(intent)
        }

        binding.first.setOnClickListener {
            binding.subHeading.text = "Therapeutic Actions"
            setTherapeuticAction(heading)

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this, R.color.skin))
            binding.firstText.setTextColor(ContextCompat.getColor(this, R.color.deep_green))
            binding.first.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.third.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.sixth.strokeWidth = 5

        }
        binding.second.setOnClickListener {
            binding.subHeading.text = "Clinical Indications"
            setIndicationAction(heading)


            binding.second.setCardBackgroundColor(ContextCompat.getColor(this, R.color.skin))
            binding.secondText.setTextColor(ContextCompat.getColor(this, R.color.deep_green))
            binding.second.strokeWidth = 0

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.first.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.third.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.sixth.strokeWidth = 5


        }
        binding.third.setOnClickListener {
            binding.subHeading.text = "Contraindications"
            setContraIndicationAction(heading)

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this, R.color.skin))
            binding.thirdText.setTextColor(ContextCompat.getColor(this, R.color.deep_green))
            binding.third.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.second.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.first.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.sixth.strokeWidth = 5

        }
        binding.forth.setOnClickListener {
            binding.subHeading.text = "Drug/Nutrient Interaction"
            setDrugDetail(heading)

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.skin))
            binding.forthText.setTextColor(ContextCompat.getColor(this, R.color.deep_green))
            binding.forth.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.third.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.first.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.fifth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.sixth.strokeWidth = 5


        }
        binding.fifth.setOnClickListener {
            binding.subHeading.text = "Chemical Constituents"
            setChemicalDetail(heading)

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.skin))
            binding.fifthText.setTextColor(ContextCompat.getColor(this, R.color.deep_green))
            binding.fifth.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.third.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.first.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.forth.strokeWidth = 5

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.sixthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.sixth.strokeWidth = 5

        }
        binding.sixth.setOnClickListener {
            binding.subHeading.text = "Toxicity"
            setToxicityDetail(heading)

            binding.sixth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.skin))
            binding.sixthText.setTextColor(ContextCompat.getColor(this, R.color.deep_green))
            binding.sixth.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.third.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.first.strokeWidth = 5

            binding.forth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.forthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.forth.strokeWidth = 5

            binding.fifth.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.fifthText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.fifth.strokeWidth = 5


        }
    }

    private fun setToxicityDetail(heading: String) {
        var text = ""
        when (heading) {
            "Achillea millefolium (Yarrow)", "Yarrow (Achillea millefolium)" -> {
                text = "• B-iso-thujone can cause:\n" +
                        "• Vomiting\n" +
                        "• Stomach and intestinal cramps\n" +
                        "• Retention of urine\n" +
                        "• Extreme cases with large doses:\n" +
                        "• Convulsions\n" +
                        "• Renal damage\n" +
                        "• Tremors\n" +
                        "• Vertigo"
            }
            "Aconitum napellus (Monkshood, Aconite)", "Monkshood (Aconitum napellus)" -> {
                text = "• Toxic dose: greater than 10 drops of the tincture\n" +
                        "• Fatal dose: 5 ml. of the tincture, or 1 gm. of the plant\n" +
                        "• Symptoms include:\n" +
                        "• Chest pain\n" +
                        "• Extreme anxiety\n" +
                        "• Hypotensive\n" +
                        "• Irregular heart beat\n" +
                        "• Loss of speech control\n" +
                        "• Nausea\n" +
                        "• Pinpoint pupils\n" +
                        "• Throat, hands and mouth numb\n" +
                        "• Ventricular fibrillation in 1 - 7 hours\n" +
                        "• Vomiting\n" +
                        "• Death is due to respiratory failure\n" +
                        "• Treatment:\n" +
                        "• Activated charcoal\n" +
                        "• Atropine to prevent slowing of the heart\n" +
                        "• CPR\n" +
                        "• Keep warm and quiet\n" +
                        "• Next-gastric lavage Oxygen as needed\n" +
                        "• Supine with elevated feet"
            }
            "Acorus calamus (Sweetflag, Acorus)", "Sweetflag (Acorus calamus)" -> {
                text = "• (In rats)\n" +
                        "Fluid in the abdomen (ascites)\n" +
                        "Growth depression\n" +
                        "Heart and liver changes\n" +
                        "Possibly intestinal malignancies"
            }
            "Aesculus hippocastanum (Horsechestnut)", "Horsechestnut (Aesculus hippocastanum)" -> {
                text = "• Toxic: a few nuts can cause severe symptoms\n" +
                        "• Fatal: in children, a few nuts may cause death\n" +
                        "• Symptoms:\n" +
                        "• Coma\n" +
                        "• Increased temperature\n" +
                        "• Inflamed membranes\n" +
                        "• Mental stupor\n" +
                        "• Nausea\n" +
                        "• Nervous twitching\n" +
                        "• Uncoordination\n" +
                        "• Vertigo\n" +
                        "• Vomiting\n" +
                        "• Death due to respiratory paralysis\n" +
                        "• Treatment:\n" +
                        "• Charcoal\n" +
                        "• Emesis\n" +
                        "• Establish adequate respiration\n" +
                        "• Gastric lavage\n" +
                        "• Maintain fluid and electrolyte balance"
            }
            "Agrimonia eupatorium (Agrimony)", "Agrimony (Agrimonia eupatorium)" -> {
                text = "• None known"
            }
            "Alchemilla vulgaris (Lady's mantle)", "Lady's mantle (Alchemilla vulgaris)" -> {
                text = "• No known toxicity"
            }
            "Aletris farinosa (True unicorn)", "True unicorn (Aletris farinosa)" -> {
                text = "• With extremely high doses, an individual may experience:\n" +
                        "Dizziness\n" +
                        "Drowsiness\n" +
                        "Upset stomach"
            }
            "Allium sativum (Garlic)", "Garlic (Allium sativum)" -> {
                text = "• Allergic contact dermatitis\n" +
                        "• Goitrogenic (agent that promotes goiter growth in the thyroid)\n" +
                        "• Irritation to digestive tract\n" +
                        "• Leukocytosis (increased white blood cells in the blood)"
            }
            "Althea officinalis (Marshmallow)", "Marshmallow (Althea officinalis)" -> {
                text = "• None known"
            }
            "Ammi visnaga(Khella)", "Khella (Ammi visnaga)" -> {
                text = "• No known toxicity"
            }
            "Angelica sinensis (Dong quai)", "Dong quai (Angelica sinensis)" -> {
                text = "• Very low toxicity, but the furocoumarins could cause photosensitivity"
            }
            "Arctium lappa (Burdock)", "Burdock (Arctium lappa)" -> {
                text =
                    "• No known toxicity but long term use or excessive doses of the seed can cause urinary tract irritation\n" +
                            "• Contains phytosterols - do not use excessively"
            }
            "Arctostaphylos uva ursi (Bearberry)", "Bearberry (Arctostaphylos uva ursi)" -> {
                text = "• Convulsions in very large doses"
            }
            "Armoracia rusticana (Horseradish)", "Horseradish (Armoracia rusticana)" -> {
                text = "• Overuse may blister the skin if using topically"
            }
            "Asclepias tuberosa (Pleurisy root)", "Pleurisy root (Asclepias tuberosa)" -> {
                text = "• Symptoms:\n" +
                        "• CNS depression\n" +
                        "• Diarrhea\n" +
                        "• GI upset\n" +
                        "• Nausea\n" +
                        "• Vomiting\n" +
                        "• Death due to respiratory paralysis\n" +
                        "• Treatment:\n" +
                        "• Activated charcoal\n" +
                        "• Avoid use of drugs\n" +
                        "• Emesis or gastric lavage"
            }
            "Astragalus membranaceus (Milk vetch)", "Milk vetch (Astragalus membranaceus)" -> {
                text = "• None known"
            }
            "Atropa belladonna (Belladonna)", "Belladonna (Atropa belladonna)" -> {
                text = "• Symptoms:\n" +
                        "• Drowsiness\n" +
                        "• Dryness\n" +
                        "• Dysphagia\n" +
                        "• Great thirst\n" +
                        "• Indistinct, lost, or double vision\n" +
                        "• Nausea\n" +
                        "• Pupillary dilation\n" +
                        "• Rapid breathing\n" +
                        "• Talkative or wild delirium\n" +
                        "• Suppression of urine\n" +
                        "• Vomiting\n" +
                        "• Antidote:\n" +
                        "• Emetics (i.e. mustard, zinc sulphate, or powdered ipecac)\n" +
                        "• Lavage tube\n" +
                        "• Stomach pump\n" +
                        "• Tickling of the throat to provoke emesis"
            }
            "Avena sativa (Oats)", "Oats (Avena sativa)" -> {
                text = "• Extremely large doses can cause headaches located at the back of the head"
            }
            "Baptisia tintoria (Wild indigo)", "Wild indigo (Baptisia tintoria)" -> {
                text = "• Symptoms:\n" +
                        "• Anorexia\n" +
                        "• Diarrhea\n" +
                        "• Quickened respiration and heart beat\n" +
                        "• Vomiting\n" +
                        "• Death by respiratory paralysis\n" +
                        "• Treatment:\n" +
                        "• Activated charcoal\n" +
                        "• Emesis or gastric lavage\n" +
                        "• Phenylephrine or dopamine for hypotension\n" +
                        "• IV diazepam for seizures"
            }
            "Barosma betulina (Buchu)", "Buchu (Barosma betulina)" -> {
                text = "• Toxicity may cause gastroenteritis"
            }
            "Berberis vulgaris (Barberry)", "Barberry (Berberis vulgaris)" -> {
                text = "• Nontoxic at recommended dosages\n" +
                        "• Overdose for an extended length of time may cause:\n" +
                        "Eye irritation\n" +
                        "Kidney irritation\n" +
                        "Lethargy\n" +
                        "Nose bleed\n" +
                        "Skin irritation\n" +
                        "Stomach upset"
            }
            "Bryonia alba(Bryony)", "Bryony (Bryonia alba)" -> {
                text = "• Fatal dose: children-1-5 berries; adults-40 berries\n" +
                        "• Symptoms include:\n" +
                        "• Cardiac depression\n" +
                        "• Cold perspiration and collapse\n" +
                        "• Congestive headaches\n" +
                        "• Decrease in temperature\n" +
                        "• Diarrhea\n" +
                        "• Vomiting\n" +
                        "• Death\n" +
                        "• Dermatitis or vesiculation from whole plant contact\n" +
                        "• Treatment:\n" +
                        "• Keep warm\n" +
                        "• Strong tea\n" +
                        "• Use water copiously\n" +
                        "• Wash for dermatitis"
            }
            "Bupleurum chinense (Thoroughwax)", "Thoroughwax (Bupleurum chinense)" -> {
                text = "• Limited data"
            }
            "Calendula officinalis (Marigold)", "Marigold (Calendula officinalis)" -> {
                text = "• No known toxicity"
            }
            "Camellia sinensis (Green tea)", "Green tea (Camellia sinensis)" -> {
                text = "• No known toxicity"
            }
            "Capsicum frutescens (Cayenne, Red pepper)", "Cayenne (Capsicum frutescens)" -> {
                text =
                    "• In large doses - GI irritation with vomiting, purging, and pain in the stomach and bowel"
            }
            "Caulophyllum thalictroides (Blue cohosh)", "Blue cohosh (Caulophyllum thalictroides)" -> {
                text = "• Toxicity could occur in extremely large doses\n" +
                        "• Symptoms:\n" +
                        "Cardiovascular collapse\n" +
                        "Constriction of coronary blood vessels\n" +
                        "Convulsions\n" +
                        "Headache\n" +
                        "Hypertension\n" +
                        "Nausea"
            }
            "Centella asiatica (Gota kola)", "Gota kola (Centella asiatica)" -> {
                text = "• Orally - tolerated very well\n" +
                        "• Topically - may rarely cause contact dermatitis"
            }
            "Chamaelirium luteum (False unicorn)", "False unicorn (Chamaelirium luteum)" -> {
                text = "• Large doses may cause nausea and vomiting"
            }
            "Chelidonium majus (Celandine)", "Celandine (Chelidonium majus)" -> {
                text = "• Symptoms:\n" +
                        "Burning in the mouth and throat\n" +
                        "Coma\n" +
                        "Nausea\n" +
                        "Vomiting\n" +
                        "Death\n" +
                        "• Treatment:\n" +
                        "Charcoal\n" +
                        "Emesis or gastric lavage"
            }
            "Chimaphilia umbellata (Pipsissewa)", "Pipsissewa (Chimaphilia umbellata)" -> {
                text = "• None known"
            }
            "Chionanthus virginicus (Fringe tree)", "Fringe tree (Chionanthus virginicus)" -> {
                text = "• No known toxicity"
            }
            "Cimicifuga racemosa (Black cohosh)", "Black cohosh (Cimicifuga racemosa)" -> {
                text = "• Symptoms:\n" +
                        "Decreased pulse and blood pressure\n" +
                        "Dilated pupils\n" +
                        "Flushed face\n" +
                        "Frontal headache with a severe bursting sensation\n" +
                        "Injected conjunctiva\n" +
                        "Joint pain\n" +
                        "Light-headed\n" +
                        "Nausea\n" +
                        "Stiffness\n" +
                        "Trembling limbs\n" +
                        "Vomiting"
            }
            "Cinnamomum spp. (Cinnamon)", "Cinnamon (Cinnamomum spp.)" -> {
                text = "• Toxic dose: .5 ml / kg for the oil internally\n" +
                        "• Doses exceeding 2 grams:\n" +
                        "Narcotic effect\n" +
                        "Convulsions\n" +
                        "Delirium\n" +
                        "Hallucinations\n" +
                        "Death\n" +
                        "• External toxicity:\n" +
                        "Burning\n" +
                        "Dermatitis\n" +
                        "Redness\n" +
                        "• Internal toxicity:\n" +
                        "Kidney damage\n" +
                        "Nausea\n" +
                        "Vomiting"
            }
            "Collinsonia canadensis (Stone root)", "Stone root (Collinsonia canadensis)" -> {
                text = "• No known toxicity"
            }
            "Commiphora molmol (Myrrh)", "Myrrh (Commiphora molmol)" -> {
                text = "• Large doses may cause irritation of the kidneys and diarrhea"
            }
            "Commiphora mukul (Guggulu)", "Guggulu (Commiphora mukul)" -> {
                text = "• No known toxicity"
            }
            "Corydalis bulbosa (Corydalis)", "Corydalis (Corydalis bulbosa)" -> {
                text = "• Use with caution due to alkaloids"
            }
            "Crataegus oxycantha (Hawthorne)", "Hawthorne (Crataegus oxycantha)" -> {
                text = "• None known"
            }
            "Curcuma longa (Tumeric)", "Tumeric (Curcuma longa)" -> {
                text = "• None known"
            }
            "Cynara scolymus (Artichoke)", "Artichoke (Cynara scolymus)" -> {
                text = "• Considered safe"
            }
            "Datura stramonium (Jimson weed, Thornapple)", "Jimson weed (Datura stramonium)" -> {
                text = "• Symptoms:\n" +
                        "Confusion\n" +
                        "Coma\n" +
                        "Double vision\n" +
                        "Hallucinations\n" +
                        "Palpitations\n" +
                        "Restlessness\n" +
                        "Thirst\n" +
                        "Urge to urinate but unable\n" +
                        "• Antidote:\n" +
                        "Activated charcoal by mouth\n" +
                        "Control body temperature by alcohol sponging and ice\n" +
                        "Gastric lavage\n" +
                        "Observe for at least 45 hours"
            }
            "Dioscorea villosa (Wild yam)", "Wild yam (Dioscorea villosa)" -> {
                text = "• May cause nausea, vomiting, diarrhea in very large doses"
            }
            "Echinacea angustifolia (Purple cone flower)", "Purple cone flower (Echinacea angustifolia)" -> {
                text = "• None known"
            }
            "Eleutherococcus senticosus (Siberian ginseng)", "Siberian ginseng (Eleutherococcus senticosus)" -> {
                text = "• Toxic dose produces:\n" +
                        "Insomnia"
            }
            "Ephedra sinica (Ma huang)", "Ma huang (Ephedra sinica)" -> {
                text = "• Symptoms include:\n" +
                        "CNS stimulation\n" +
                        "Nausea\n" +
                        "Tachycardia\n" +
                        "Tremors\n" +
                        "Urinary retention"
            }
            "Equisetum arvense (Shave grass, Horsetail)", "Shave grass (Equisetum arvense)" -> {
                text = "• When used chronically, may produce beri-beri like symptoms:\n" +
                        "Acute cerebral symptoms\n" +
                        "Cardiac symptoms\n" +
                        "Peripheral neuropathy"
            }
            "Eriodictyon californicum (Yerba santa)", "Yerba santa (Eriodictyon californicum)" -> {
                text = "• No known toxicity"
            }
            "Eschscholzia californica (California poppy)", "California poppy (Eschscholzia californica)" -> {
                text = "• No known toxicity"
            }
            "Euphrasia officinalis (Eyebright)", "Eyebright (Euphrasia officinalis)" -> {
                text = "• No known toxicity"
            }
            "Filipendula ulmaria (Meadowsweet)", "Meadowsweet (Filipendula ulmaria)" -> {
                text = "• No known toxicity"
            }
            "Foeniculum v• ulgare (Fennel)", "Fennel (Foeniculum vulgare)" -> {
                text = "• Overdose of the essential oil can cause:\n" +
                        "Nausea\n" +
                        "Pulmonary edema\n" +
                        "Seizures\n" +
                        "Vomiting"
            }
            "Fucus vesiculosus (Bladderwrack, Kelp)", "Bladderwrack (Fucus vesiculosus)" -> {
                text = "• See contraindications"
            }
            "Galium aparine (Cleavers, Bed straw)", "Cleavers (Galium aparine)" -> {
                text = "• None known"
            }
            "Gelsemium sempervirens (Yellow jasmine, Gelsemium)", "Yellow jasmine (Gelsemium sempervirens)" -> {
                text = "• Sympotms include:\n" +
                        "Convulsions\n" +
                        "Double vision with drooping eyelids and lower jaw\n" +
                        "Hypotension\n" +
                        "Intense abdominal cramps\n" +
                        "Internal strabismus\n" +
                        "Lowered temperature\n" +
                        "Death from respiratory failure and cardiac arrest\n" +
                        "• Treatment:\n" +
                        "2 mg. of atropine every 4 hours\n" +
                        "Activated charcoal\n" +
                        "Castor oil purge\n" +
                        "CPR\n" +
                        "Digitalis to sustain heart\n" +
                        "IV diazepam for seizures\n" +
                        "Lavage\n" +
                        "Morphine\n" +
                        "Oxygen as needed"
            }
            "Gentiana lutea (Gentian)", "Gentian (Gentiana lutea)" -> {
                text = "• Symptoms:\n" +
                        "Diarrhea\n" +
                        "Fullness of pulse\n" +
                        "Headache\n" +
                        "Nausea\n" +
                        "Vomiting\n" +
                        "• Treatment:\n" +
                        "Activated charcoal\n" +
                        "Emesis or gastric lavage"
            }
            "Geranium maculatum (Wild geranium, Cranesbill)", "Wild geranium (Geranium maculatum)" -> {
                text = "• None known"
            }
            "Ginkgo biloba (Ginkgo)", "Ginkgo (Ginkgo biloba)" -> {
                text =
                    "• Contact with or ingestion of the fruit pulp has produced severe allergic reactions - the correct form of ginkgo is: Standardized extract (24% ginkgo heterosides): 40 mg. 3 times per day"
            }
            "Glycyrrhiza glabra (Licorice)", "Licorice (Glycyrrhiza glabra)" -> {
                text =
                    "• Chronic use may mimic aldosteronism by increasing sodium resorption and potassium excretion by the kidney\n" +
                            "• Symptoms:\n" +
                            "Edema\n" +
                            "Headache\n" +
                            "Hypertension\n" +
                            "Hypokalemia\n" +
                            "Vertigo"
            }
            "Grindelia camporum (Gumweed)", "Gumweed (Grindelia camporum)" -> {
                text = "• Large doses may produce kidney and stomach irritation"
            }
            "Gymnema sylvestre (Gymnema)", "Gymnema (Gymnema sylvestre)" -> {
                text = "• No known toxicity, gymnema does not lower blood sugar in healthy people"
            }
            "Hamamelis virginiana (Witch hazel)", "Witch hazel (Hamamelis virginiana)" -> {
                text = "• In rare cases, witch hazel tannins may cause liver damage"
            }
            "Harpagophytum procumbens (Devil's claw, Grapple plant)", "Devil's claw (Harpagophytum procumbens)" -> {
                text = "• No known toxicity"
            }
            "Humulus lupulus (Hops)", "Hops (Humulus lupulus)" -> {
                text = "• Contact with the pollen from the strobiles may cause dermatitis"
            }
            "Hydrastis canadensis (Goldenseal)", "Goldenseal (Hydrastis canadensis)" -> {
                text =
                    "• Catarrhal inflammation of the mucous linings of the hepatic ducts and gall bladder, causing an icteric hue to skin\n" +
                            "• Continued large doses may cause ulceration of mucous membranes with extreme dryness and fissure formation"
            }
            "Hypericum perforatum (St. John's wort)", "Saint John's wort (Hypericum perforatum)" -> {
                text = "• At extremely high doses, may cause photosensitivity"
            }
            "Hyssopus officinalis (Hyssop)", "Hyssop (Hyssopus officinalis)" -> {
                text = "• Use only in small doses"
            }
            "Inula helenium (Elecampane)", "Elecampane (Inula helenium)" -> {
                text = "• Large doses may cause:\n" +
                        "Diarrhea\n" +
                        "Gastric spasms\n" +
                        "Symptoms of paralysis\n" +
                        "Vomiting"
            }
            "Juniperis communis (Juniper)", "Juniper (Juniperis communis)" -> {
                text = "• Chronic over-dosage may cause kidney damage"
            }
            "Larrea tridentata (Chapparrel, Creosote bush, Creosotum)", "Chapparrel (Larrea tridentata)" -> {
                text = "• Discontinue use if these symptoms appear:\n" +
                        "Dark urine\n" +
                        "Fatigue\n" +
                        "Fever\n" +
                        "Jaundice\n" +
                        "Nausea\n" +
                        "Yellow discoloration of the eyes"
            }
            "Lavendula angustifolia (Lavender)", "Lavender (Lavendula angustifolia)" -> {
                text = "• No known toxicity"
            }
            "Leonurus cardiaca (Motherwort)", "Motherwort (Leonurus cardiaca)" -> {
                text = "• None known"
            }
            "Ligusticum porteri (Osha)", "Osha (Ligusticum porteri)" -> {
                text = "• None known"
            }
            "Linum usitatissimum (Flax, Linseed)", "Flax (Linum usitatissimum)" -> {
                text = "• None known"
            }
            "Lobelia inflata (Indian tobacco, Puke weed)", "Indian tobacco (Lobelia inflata)" -> {
                text = "• 1 drop of lobeline alkaloid causes vomiting\n" +
                        "• Toxic levels usually product vomiting, lessening the results\n" +
                        "• Symptoms include:\n" +
                        "Convulsions\n" +
                        "Diarrhea\n" +
                        "Hypothermia\n" +
                        "Mental confusion\n" +
                        "Nausea and vomiting\n" +
                        "Pinpoint pupils\n" +
                        "Paralysis\n" +
                        "Salivation\n" +
                        "Stupor\n" +
                        "Tachypnea\n" +
                        "Tremors\n" +
                        "Death due to respiratory paralysis\n" +
                        "• Antidote:\n" +
                        "Activated charcoal in water by mouth\n" +
                        "Atropine: 2 mg. subcutaneous\n" +
                        "Gastric lavage\n" +
                        "Saline cathartics and fluids"
            }
            "Lomatium disectum (Desert parsley)", "Desert parsley (Lomatium disectum)" -> {
                text =
                    "• Ingestion of the fresh plant root and products has may produce a skin rash in some individuals that disappears when discontinued"
            }
            "Marrubium vulgare (Horehound)", "Horehound (Marrubium vulgare)" -> {
                text = "• No known toxicity"
            }
            "Matricaria chamomilla (German chamomile)", "German chamomile (Matricaria chamomilla)" -> {
                text = "• No known toxicity"
            }
            "Medicago sativa (Alfalfa)", "Alfalfa (Medicago sativa)" -> {
                text = "• None known"
            }
            "Melaleuca alternifolia (Tea tree)", "Tea tree (Melaleuca alternifolia)" -> {
                text = "• Extremely safe for topical antiseptic"
            }
            "Melissa officinalis (Lemon balm)", "Lemon balm (Melissa officinalis)" -> {
                text = "• No known toxicity"
            }
            "Mentha piperita (Peppermint)", "Peppermint (Mentha piperita)" -> {
                text = "• Hypersensitivity signs:\n" +
                        "Bradycardia\n" +
                        "Heartburn\n" +
                        "Muscle tremor\n" +
                        "Skin rash"
            }
            "Mitchella repens (Squawvine, Partridge berry)", "Squawvine (Mitchella repens)" -> {
                text = "• No known toxicity"
            }
            "Momordica charantia (Bitter melon)", "Bitter melon (Momordica charantia)" -> {
                text = "• No known toxicity - see Contraindications and Drug/Nutrient Interactions"
            }
            "Nepeta cataria (Catnip)", "Catnip (Nepeta cataria)" -> {
                text = "• No known toxicity"
            }
            "Oplopanax horridum (Devil's club)", "Devil's club (Oplopanax horridum)" -> {
                text = "• Overdoses can produce hypertension"
            }
            "Panax ginseng (Chinese ginseng, Korean ginseng)", "Chinese ginseng (Panax ginseng)" -> {
                text = "• Overdoses can produce hypertension"
            }
            "Passiflora incarnata (Passionflower)", "Passionflower (Passiflora incarnata)" -> {
                text = "• Symptoms:\n" +
                        "Convulsions\n" +
                        "CNS depression\n" +
                        "Decreased blood pressure\n" +
                        "Decreased body temperature\n" +
                        "Motor paralysis"
            }
            "Pausinystalia yohimbe (Yohimbe)", "Yohimbe (Pausinystalia yohimbe)" -> {
                text =
                    "• 12 milligrams can induce a hypertensive crises if taken with tricyclic antidepressants\n" +
                            "• 10 milligrams can induce mania in bipolar disease\n" +
                            "• 15 milligrams have been associated with bronchospasm\n" +
                            "• 15-20 milligrams of yohimbine alkaloid can induce hypertension\n" +
                            "• Treatment for toxic dose:\n" +
                            "Activated charcoal\n" +
                            "Atropine\n" +
                            "Emesis or gastric lavage\n" +
                            "Monitor and treat serum potassium imbalance or glucose/insulin"
            }
            "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)", "Butterbur (Petasites hybridus)" -> {
                text =
                    "• Do NOT use unprocessed Petasite due to the alkaloids although alkaloid-free varieties are cultivated under laboratory conditions\n" +
                            "• Pyrrolizidine alkaloids may cause:\n" +
                            "Birth defects\n" +
                            "Cancer\n" +
                            "Genetic damage\n" +
                            "Liver damage"
            }
            "Petroselinum crispum (Parsley)", "Parsley (Petroselinum crispum)" -> {
                text = "• No known toxicity"
            }
            "Phytolacca decandra (Poke)", "Poke (Phytolacca decandra)" -> {
                text = "• Limit use to short duration\n" +
                        "• Symptoms of long term use or overdose happen slowly and may be difficult to recognize\n" +
                        "• Symptoms include:\n" +
                        "Burning in mouth and stomach\n" +
                        "Decreased blood pressure\n" +
                        "GI disturbances\n" +
                        "Nausea , vomiting and diarrhea\n" +
                        "Slow heart and pulse\n" +
                        "If consumption is greater than 1/2 ounce of the berries or root or 10 berries in an infant, coma and death by respiratory paralysis"
            }
            "Pimpinella anisum (Anise)", "Anise (Pimpinella anisum)\n" -> {
                text = "• Symptoms include:\n" +
                        "Mild liver lesions\n" +
                        "Nausea\n" +
                        "Pulmonary edema\n" +
                        "Seizures\n" +
                        "Skin irritation\n" +
                        "Vomiting"
            }
            "Piper methysticum (Kava kava)", "Kava kava (Piper methysticum)" -> {
                text = "• Long term consumption of large doses can cause:\n" +
                        "Dry, pigmented, scaly skin, especially on the palms of the hands, soles of the feet, forearms, back and shins\n" +
                        "Goes away when kava is discontinued\n" +
                        "• More than 9 grams per day can elevate GGT, but is reversible with discontinuation"
            }
            "Piscidia piscipula (Jamaican dogwood)", "Jamaican dogwood (Piscidia piscipula)" -> {
                text = "• Very low toxicity\n" +
                        "• Symptoms:\n" +
                        "Decreased sensation\n" +
                        "Lowered blood pressure\n" +
                        "Reduced respiratory rate and volume"
            }
            "Polygonum multiflorum (Fo-ti, He-shou-wu)", "Fo-ti (Polygonum multiflorum)" -> {
                text = "• Unprocessed root may cause mild diarhea\n" +
                        "• Very high doses may cause numbness in arms or legs"
            }
            "Pygeum africanum (Pygeum)", "Pygeum (Pygeum africanum)" -> {
                text = "• No significant toxicity"
            }
            "Rhamnus frangula (Buckthorn)", "Buckthorn (Rhamnus frangula)" -> {
                text = "• Cascara bark that is at least 1 year old is non purgative\n" +
                        "• Symptoms include:\n" +
                        "Abdominal pain\n" +
                        "Diarrhea with nausea and vomiting\n" +
                        "Kidney damage\n" +
                        "• Treatment:\n" +
                        "Activated charcoal\n" +
                        "Avoid use of drugs\n" +
                        "Emesis or gastric lavage"
            }
            "Rhamnus purshiana (Cascara)", "Cascara (Rhamnus purshiana)" -> {
                text = "• Cascara bark that is at least 1 year old is non purgative\n" +
                        "• Symptoms include:\n" +
                        "Abdominal pain\n" +
                        "Diarrhea with nausea and vomiting\n" +
                        "Kidney damage\n" +
                        "• Treatment:\n" +
                        "Activated charcoal\n" +
                        "Avoid use of drugs\n" +
                        "Emesis or gastric lavage"
            }
            "Rheum officinalis (Rhubarb)", "Rhubarb (Rheum officinalis)" -> {
                text =
                    "• No known toxicity of rhubarb if use is prescribed by a qualified physician"
            }
            "Rosmarius officinalis (Rosemary)", "Rosemary (Rosmarius officinalis)" -> {
                text = "• No known toxicity"
            }
            "Rumex crispis (Yellow dock, Curly dock)", "Yellow dock (Rumex crispis)" -> {
                text = "• None"
            }
            "Ruscus aculeatus (Butcher's broom)", "Butcher's broom (Ruscus aculeatus)" -> {
                text = "• No known toxicity"
            }
            "Salvia miltiorrhiza (Danshen)", "Danshen (Salvia miltiorrhiza)" -> {
                text = "• Limited data - no known toxicity"
            }
            "Salvia officinalis (Sage)", "Sage (Salvia officinalis)" -> {
                text = "• Toxic dose: Thujone 30 mg/kg body weight\n" +
                        "• Overdose symptoms:\n" +
                        "Convulsions\n" +
                        "Dry mouth\n" +
                        "Local irritation\n" +
                        "• Tea should only be taken for 1 - 2 weeks at a time"
            }
            "Sambucus canadensis, nigra (Elder)", "Elder (Sambucus canadensis, nigra)" -> {
                text = "• Sambunigrin is the toxic glycoside (cooking destroys the toxin)\n" +
                        "• Signs of toxicity:\n" +
                        "• Convulsions\n" +
                        "• Diarrhea\n" +
                        "• Dizziness\n" +
                        "• Gastrointestinal distress\n" +
                        "• Headache\n" +
                        "• Nausea\n" +
                        "• Tachycardia\n" +
                        "• Vomiting\n" +
                        "• Treatment:\n" +
                        "• Amyl nitrite under nose or mouth 30 seconds each minute\n" +
                        "• Cathartic\n" +
                        "• Charcoal, after gastric lavage, preceded by endotracheal intubation\n" +
                        "• IV diazepam\n" +
                        "• IV sodium nitrite followed with sodium thiosulfate"
            }
            "Sanguinaria canadensia (Blood root)", "Blood root (Sanguinaria canadensia)" -> {
                text = "• Symptoms:\n" +
                        "Diarrhea\n" +
                        "Dilated pupils\n" +
                        "Headaches\n" +
                        "Increased expectoration\n" +
                        "Muscular relaxation\n" +
                        "Nausea\n" +
                        "Cold extremeties\n" +
                        "Vomiting\n" +
                        "Death by cardiac failure\n" +
                        "• Treatment:\n" +
                        "Charcoal\n" +
                        "Maintain fluid and electrolyte balance\n" +
                        "Strong tea"
            }
            "Schisandra chinensis (Wu wei zi)", "Wu wei zi (Schisandra chinensis)" -> {
                text = "• Uncommon but may include:\n" +
                        "Abdominal upset\n" +
                        "Decreased appetite\n" +
                        "Skin rash"
            }
            "Scutellaria laterifolia (Skullcap)", "Skullcap (Scutellaria laterifolia)" -> {
                text =
                    "• Excessive dosage may stimulate rather than sedate the central nervous system"
            }
            "Serenoa repens (Saw palmetto)", "Saw palmetto (Serenoa repens)" -> {
                text = "• None"
            }
            "Silybum marianum (Milk thistle)", "Milk thistle (Silybum marianum)" -> {
                text =
                    "• Due to silymarin's ability to increase bile flow, stools may be looser\n" +
                            "• Very low toxicity"
            }
            "Smilax sarsaparilla (Sarsaparilla)", "Sarsaparilla (Smilax sarsaparilla)" -> {
                text = "• None known"
            }
            "Spilanthes acmella (Paracress)", "Paracress (Spilanthes acmella)" -> {
                text = "• No known toxicity"
            }
            "Stellaria media (Chickweed)", "Chickweed (Stellaria media)" -> {
                text = "• No known toxicity"
            }
            "Sticta pulmonaria (Lungwort)", "Lungwort (Sticta pulmonaria)" -> {
                text = "• None known"
            }
            "Stillingia sylvatica (Queen's root)", "Queen's root (Stillingia sylvatica)" -> {
                text = "• Do not use excessively"
            }
            "Symphytum officinale (Comfrey)", "Comfrey (Symphytum officinale)" -> {
                text = "• In large doses:\n" +
                        "Deacreased vision\n" +
                        "Headache\n" +
                        "Nausea\n" +
                        "Vertigo\n" +
                        "Vomiting"
            }
            "Symplocarpus foetida (Skunk cabbage)", "Skunk cabbage (Symplocarpus foetida)" -> {
                text = "• No known toxicity"
            }
            "Tabebuia impetiginosa (Pau d' arco)", "Pau d' arco (Tabebuia impetiginosa)" -> {
                text = "• No known toxicity"
            }
            "Tanacetum parthenium) (Feverfew)", "Feverfew (Tanacetum parthenium)" -> {
                text = "• Chewing the leaves may cause aphthous stomatitis\n" +
                        "• No report of toxic reactions"
            }
            "Taraxacum officinale (Dandelion, Lion's tooth)", "Dandelion (Taraxacum officinale)" -> {
                text = "• Considered safe, even in large amounts"
            }
            "Taxus brevifolia (Yew)", "Yew (Taxus brevifolia)" -> {
                text = "• Very poisonous\n" +
                        "• Symptoms including:\n" +
                        "CNS depressant\n" +
                        "Leucopenia\n" +
                        "Nausea"
            }
            "Thuja plicata, occidentalis (Western cedar)", "Western cedar (Thuja plicata, occidentalis)" -> {
                text = "• Thujone is toxic in large doses\n" +
                        "• Sumptoms include:\n" +
                        "Catharsis\n" +
                        "Coma\n" +
                        "Convulsions associated with lesions of the cerebral cortex\n" +
                        "Decreased blood pressure\n" +
                        "GI irritation\n" +
                        "Death\n" +
                        "• Treatment:\n" +
                        "Activated charcoal\n" +
                        "Avoid aspiration pneumonitis\n" +
                        "Cathartic\n" +
                        "Emetic or gastric lavage\n" +
                        "Establish respiration\n" +
                        "Monitor cardiac function closely\n" +
                        "Seizures: IV diazepam"
            }
            "Thymus vulgaris (Thyme)", "Thyme (Thymus vulgaris)" -> {
                text = "• Toxic dose: Oil- .2-1 ml; thymol 1-5 grams\n" +
                        "• External symptoms:\n" +
                        "Derrmatitis\n" +
                        "• Internal symptoms:\n" +
                        "Diarrhea\n" +
                        "Nephritis\n" +
                        "Profuse sweating\n" +
                        "Reduced temperature\n" +
                        "Warmth in stomach\n" +
                        "• Treatment:\n" +
                        "Activated charcoal\n" +
                        "Dilute with water or milk immediately\n" +
                        "Emesis if less than 5% solution\n" +
                        "Gastric lavage if greater than 5% solution ingested\n" +
                        "Obtain baseline liver and renal measurements\n" +
                        "Monitor acid/base balance\n" +
                        "Seizures: IV diazepam"
            }
            "Tilia europaea (Linden flower, Lime blossom)", "Linden flower (Tilia europaea)" -> {
                text = "• No known toxicity"
            }
            "Trifollium pratense (Red clover)", "Red clover (Trifollium pratense)" -> {
                text = "• None known"
            }
            "Trigonella foenum-graecum (Fenugreek)", "Fenugreek (Trigonella foenum-graecum)" -> {
                text = "• No known toxicity"
            }
            "Trillium erectum (Beth root)", "Beth root (Trillium erectum)" -> {
                text = "• No toxicity"
            }
            "Tussilago farfara (Colt's foot)", "Colt's foot (Tussilago farfara)" -> {
                text = "• Prolonged and heavy usage of the alkaloid, pyrrolizidine, can cause:\n" +
                        "Elevated liver enzymes\n" +
                        "Liver and kidney teratogenicity\n" +
                        "Potential liver toxicity"
            }
            "Ulmus fulva (Slippery elm, American elm)", "Slippery elm (Ulmus fulva)" -> {
                text = "• None known"
            }
            "Urtica urens (Nettles)", "Nettles (Urtica urens)" -> {
                text = "• Apply Rumex crispis topically if 'stung' by stinging nettle leaves"
            }
            "Usnea spp. (Old man's beard)", "Old man's beard (Usnea spp.)" -> {
                text = "• No known toxicity"
            }
            "Vaccinium myrtillus (Bilberry)", "Bilberry (Vaccinium myrtillus)" -> {
                text = "• No known toxicity"
            }
            "Valeriana officinalis (Valerian)", "Valerian (Valeriana officinalis)" -> {
                text = "• Toxic overdose produces:\n" +
                        "Agitation\n" +
                        "Central paralysis\n" +
                        "Decreased sensibility, motility and reflex excitability\n" +
                        "Giddiness\n" +
                        "Headache\n" +
                        "Nausea\n" +
                        "Perverted vision\n" +
                        "Restlessness"
            }
            "Verbascum thapsus (Mullein)", "Mullein (Verbascum thapsus)" -> {
                text = "• None known"
            }
            "Verbena officinalis (Vervain)", "Vervain (Verbena officinalis)" -> {
                text = "• A glycoside in vervain may cause vomiting"
            }
            "Viburnum opulus (Cramp bark)", "Cramp bark (Viburnum opulus)" -> {
                text = "• None known"
            }
            "Viscum alba (Mistletoe)", "Mistletoe (Viscum alba)" -> {
                text = "• Berries are highly poisonous\n" +
                        "• Can cause:\n" +
                        "Bloody diarrhea\n" +
                        "Cardiovascular collapse\n" +
                        "Coma\n" +
                        "Delirium\n" +
                        "Hallucinations\n" +
                        "Muscular spasms to the point of convulsions\n" +
                        "Respiratory difficulty\n" +
                        "Slow heart rate (bradycardia)\n" +
                        "Vomiting\n" +
                        "Death in 10 hours after ingestion"
            }
            "Vitex agnus castus (Chaste tree, Monk's pepper)", "Chaste tree (Vitex agnus castus)" -> {
                text = "• Generally regarded as safe - can use for months without any side effects"
            }
            "Withania somnifera (Ashwagandha)", "Ashwagandha (Withania somnifera)" -> {
                text =
                    "• No known toxicity, this Ayurvedic herb is given to young children and elderly people in India"
            }
            "Yucca spp. (Yucca)", "Yucca (Yucca spp.)" -> {
                text = "• No known toxicity"
            }
            "Zanthoxylum clava-herculis (Southern prickly ash)", "Southern prickly ash (Zanthoxylum clava-herculis)" -> {
                text = "• No known toxicity"
            }
            "Zea mays (Corn silk)", "Corn silk (Zea mays)" -> {
                text = "• No known toxicity"
            }
            "Zingiber officinale (Ginger)", "Ginger (Zingiber officinale)" -> {
                text = "• None known"
            }
        }
        ss = SpannableString(text)
        makeBold(ss, text, "Death")
        binding.contentData.text = ss
    }

    private fun setChemicalDetail(heading: String) {
        var text = ""
        when (heading) {
            "Achillea millefolium (Yarrow)", "Yarrow (Achillea millefolium)" -> {
                text = "• Achilleic acid (identical to aconitic acid)\n" +
                        "• Alkanes\n" +
                        "• Alkaloids:\n" +
                        "• Achilleine\n" +
                        "• Betonicine\n" +
                        "• Stachydrine\n" +
                        "• Apigenin, an antispasmodic agent\n" +
                        "• B-iso-thujone, see Toxicity\n" +
                        "• Betaine\n" +
                        "• Earthly ash consisting of nitrates, phosphates, and chlorides of potash and line\n" +
                        "• Fatty acids:\n" +
                        "• Linoleic\n" +
                        "• Oleic\n" +
                        "• Palmatic\n" +
                        "• Lactones\n" +
                        "• Potassium and calcium salts\n" +
                        "• Rutin\n" +
                        "• Salicylic acid (anti-inflammatory anodyne organic acid\n" +
                        "• Saponins\n" +
                        "• Sterols - Beta sitosterol\n" +
                        "• Succinic acid\n" +
                        "• Trigonelline\n" +
                        "• Volatile oils:\n" +
                        "• Azulene\n" +
                        "• Camphor\n" +
                        "• Cineol\n" +
                        "• Sabinene\n" +
                        "• Pinene"
            }
            "Aconitum napellus (Monkshood, Aconite)", "Monkshood (Aconitum napellus)" -> {
                text = "• Acids:\n" +
                        "• Aconitic acid\n" +
                        "• Itaconic acid\n" +
                        "• Terpenoid alkaloids including:\n" +
                        "• Aconitine, dicyl ester - has short lived cardiotonic action then cardiac depression, arrhythmia and cardiac arrest\n" +
                        "• Benzoylaconine\n" +
                        "• Hypaconitine\n" +
                        "• Napelline\n" +
                        "• Neopelline\n" +
                        "• Picraconitine\n" +
                        "• Traces of sparteine and ephedrine\n" +
                        "• Starch\n" +
                        "• Sugars"
            }
            "Acorus calamus (Sweetflag, Acorus)", "Sweetflag (Acorus calamus)" -> {
                text = "• Acoric acid\n" +
                        "• Acorin, a bitter glycoside\n" +
                        "• Bitters\n" +
                        "• Muscilage\n" +
                        "• Resin\n" +
                        "• Tannins\n" +
                        "• Sesquiterpenes\n" +
                        "• Volatile oils:\n" +
                        "• Aserone\n" +
                        "• Azulene\n" +
                        "• Eugenol\n" +
                        "• Calamene\n" +
                        "• Camphor\n" +
                        "• Cineole\n" +
                        "• Cis-methyl isoeugenol\n" +
                        "• Linalol\n" +
                        "• Pinene"
            }
            "Aesculus hippocastanum (Horsechestnut)", "Horsechestnut (Aesculus hippocastanum)" -> {
                text = "• Acyl groups are usually tiglic, angelic, or acetic acids\n" +
                        "• Aescin composed of :\n" +
                        "• Acylated glycosides of protoaesigenin and barringtogenol-C\n" +
                        "• Hippocaesculin\n" +
                        "• Nicotine\n" +
                        "• Saponins\n" +
                        "• Silicic acid, a source of silicon"
            }
            "Agrimonia eupatorium (Agrimony)", "Agrimony (Agrimonia eupatorium)" -> {
                text = "• Bitter principles\n" +
                        "• Essential oil\n" +
                        "• Mucilage\n" +
                        "• Phytosterols\n" +
                        "• Silica\n" +
                        "• Tannins"
            }
            "Alchemilla vulgaris (Lady's mantle)", "Lady's mantle (Alchemilla vulgaris)" -> {
                text = "• Salicylic acid\n" +
                        "• Tannins - 6-8%, consisting mainly of glycosides of ellagic acid"
            }
            "Aletris farinosa (True unicorn)", "True unicorn (Aletris farinosa)" -> {
                text = "• Diosgenin, a steroid glycone containing estrogenic-like action\n" +
                        "• Gentrogenin, similar to diosgenin\n" +
                        "• Resin\n" +
                        "• Volatile oil"
            }
            "Allium sativum (Garlic)", "Garlic (Allium sativum)" -> {
                text = "• Allicin\n" +
                        "• Alliin\n" +
                        "• Enzymes including:\n" +
                        "• Alliinase\n" +
                        "• Myrosinase\n" +
                        "• Peroxidase\n" +
                        "• High concentrations of trace minerals, particularly selenium and germanium\n" +
                        "• Mucilage\n" +
                        "• Phytosterols\n" +
                        "• Resin\n" +
                        "• Sulphur compounds\n" +
                        "• Vitamins"
            }
            "Althea officinalis (Marshmallow)", "Marshmallow (Althea officinalis)" -> {
                text = "• Asparagin - colorless, odorless crystalline mucilage\n" +
                        "• Asparagine - an alkaloid also found in soy, lupine, sprouting vetch, not thought to cause problems\n" +
                        "• Calcium oxalate\n" +
                        "• Coumarins\n" +
                        "• Mucilage - bassorin is the principle mucilage\n" +
                        "• Pectin\n" +
                        "• Starch\n" +
                        "• Sugar:\n" +
                        "• Arabinose\n" +
                        "• Galactose\n" +
                        "• Glucose\n" +
                        "• Rhamnose\n" +
                        "• Xylose\n" +
                        "• Tannin\n" +
                        "• Vitamins:\n" +
                        "• Vitamin A\n" +
                        "• B complex\n" +
                        "• Vitamin C\n" +
                        "• Vitamin E"
            }
            "Ammi visnaga(Khella)", "Khella (Ammi visnaga)" -> {
                text = "• Coumarins\n" +
                        "• Furanochromones (psoralens):\n" +
                        "Khellin\n" +
                        "Visnagin\n" +
                        "• Visdadine, an anti-anginal agent\n" +
                        "• Visnadin\n" +
                        "• Volatile oil"
            }
            "Angelica sinensis (Dong quai)", "Dong quai (Angelica sinensis)" -> {
                text = "• Coumarins:\n" +
                        "• Archangelicine\n" +
                        "• Berapten\n" +
                        "• Osthole\n" +
                        "• Osthenol\n" +
                        "• Ostruthol\n" +
                        "• Umbelliferone\n" +
                        "• Flavonol glycosides\n" +
                        "• Folinic acid\n" +
                        "• Nicotinic acid\n" +
                        "• Phytoestrogens\n" +
                        "• Vitamins:\n" +
                        "• Biotin\n" +
                        "• Folic acid\n" +
                        "• Vitamin B12\n" +
                        "• Vitamin E\n" +
                        "• Volatile oil containing:\n" +
                        "• Caninene\n" +
                        "• Carvacrol\n" +
                        "• Isosafrole\n" +
                        "• Linoleic acid\n" +
                        "• n-butylphthalide\n" +
                        "• n-dodecanol\n" +
                        "• n-tetradecanol\n" +
                        "• Palmitic acid\n" +
                        "• Safrole\n" +
                        "• Sequterpenes"
            }
            "Arctium lappa (Burdock)", "Burdock (Arctium lappa)" -> {
                text = "• Alkaloids\n" +
                        "• Flavonoids\n" +
                        "• Glycoside arctiine\n" +
                        "• Inulin\n" +
                        "• Lignans, including arctigenin\n" +
                        "• Minerals:\n" +
                        "• Calcium\n" +
                        "• Iron\n" +
                        "• Phosphorus\n" +
                        "• Sodium\n" +
                        "• Mucilage\n" +
                        "• Organic acids\n" +
                        "• Polysaccharides\n" +
                        "• Sesquaturpine lactone\n" +
                        "• Steroids - phytosterol and stigmasterol\n" +
                        "• Tannins\n" +
                        "• Vitamins:\n" +
                        "• Vitamin A\n" +
                        "• Vitamin B1\n" +
                        "• Vitamin B2\n" +
                        "• Vitamin B3\n" +
                        "• Vitamin C\n" +
                        "• Volatile oils"
            }
            "Arctostaphylos uva ursi (Bearberry)", "Bearberry (Arctostaphylos uva ursi)" -> {
                text = "• Achilleic acid, identical to aconitic acid\n" +
                        "• Alkaloids:\n" +
                        "• Achilleine\n" +
                        "• Betonicine\n" +
                        "• Stachydrine\n" +
                        "• Alkanes\n" +
                        "• Apigenin, an antispasmodic agent\n" +
                        "• Betaine\n" +
                        "• Calcium salts\n" +
                        "• Earthly ash consisting of nitrates, phosphates, and chlorides of potash and line\n" +
                        "• Fatty acids:\n" +
                        "• Linoleic\n" +
                        "• Oleic\n" +
                        "• Palmatic\n" +
                        "• Lactones\n" +
                        "• Potassium\n" +
                        "• Rutin\n" +
                        "• Saponins\n" +
                        "• Salicylic acid (anti-inflammatory anodyne organic acid)\n" +
                        "• Succinic acid\n" +
                        "• Sterols - Beta sitosterol\n" +
                        "• Trigonelline\n" +
                        "• Volatile oils:\n" +
                        "• Azulene\n" +
                        "• Camphor\n" +
                        "• Cineol\n" +
                        "• Pinene\n" +
                        "• Sabinene"
            }
            "Armoracia rusticana (Horseradish)", "Horseradish (Armoracia rusticana)" -> {
                text = "• Asparagine\n" +
                        "• Glucosinolates\n" +
                        "• Sinigrin, which releases allyl isothiocyanate on contact with the enzyme myrosin during crushing and when combined with water yields mustard oil\n" +
                        "• 2-phenylethylglucosinolate\n" +
                        "• Resin\n" +
                        "• Sugar\n" +
                        "• Vitamin B complex\n" +
                        "• Vitamin C"
            }
            "Asclepias tuberosa (Pleurisy root)", "Pleurisy root (Asclepias tuberosa)" -> {
                text = "• Alpha- and B-amyrin\n" +
                        "• Amino acids\n" +
                        "• Cardenolides:\n" +
                        "• Asclepiadin\n" +
                        "• Choline\n" +
                        "• Flavonoids:\n" +
                        "Isorhamnetin\n" +
                        "Kaempferol\n" +
                        "Quercitin\n" +
                        "Rutin\n" +
                        "• Friedalin\n" +
                        "• Viburnitol"
            }
            "Astragalus membranaceus (Milk vetch)", "Milk vetch (Astragalus membranaceus)" -> {
                text = "• Amino acids\n" +
                        "• Astragalosides I-VII\n" +
                        "• Beta-sitosterol\n" +
                        "• Betaine\n" +
                        "• Choline\n" +
                        "• Glycosides\n" +
                        "• Plant acid\n" +
                        "• Polysaccharides\n" +
                        "• Rumatakenin\n" +
                        "• Saponins\n" +
                        "• Sugar\n" +
                        "• Vitamin A"
            }
            "Atropa belladonna (Belladonna)", "Belladonna (Atropa belladonna)" -> {
                text = "• Atropine\n" +
                        "• Hyocyamine\n" +
                        "• Scopolamine"
            }
            "Avena sativa (Oats)", "Oats (Avena sativa)" -> {
                text = "• Alkaloids:\n" +
                        "• Avenine, stimulates the central nervous system\n" +
                        "• Trigonelline\n" +
                        "• Calcium\n" +
                        "• Copper\n" +
                        "• Fats\n" +
                        "• Flavonoids\n" +
                        "• Iron\n" +
                        "• Magnesium\n" +
                        "• Manganese\n" +
                        "• Protein (gluten)\n" +
                        "• Saponins\n" +
                        "• Starch\n" +
                        "• Sterol\n" +
                        "• Zinc"
            }
            "Baptisia tintoria (Wild indigo)", "Wild indigo (Baptisia tintoria)" -> {
                text = "• Alkaloids:\n" +
                        "Baptitoxine\n" +
                        "Cytisine\n" +
                        "• Coumarins\n" +
                        "• Flavonoids\n" +
                        "• Isoflavones:\n" +
                        "Biochanin A\n" +
                        "Daidzein\n" +
                        "Genistein\n" +
                        "• Polysaccharides"
            }
            "Barosma betulina (Buchu)", "Buchu (Barosma betulina)" -> {
                text = "• 8-acetylthiomethone\n" +
                        "• 8-mercapto-p-methan-3-one\n" +
                        "• Flavonoids:\n" +
                        "Diosmin\n" +
                        "Hesperidin\n" +
                        "Quercitin\n" +
                        "Rutin\n" +
                        "• Isopulegone\n" +
                        "• Mucilage\n" +
                        "• Piperitone epoxide\n" +
                        "• Pulegone\n" +
                        "• Tannin\n" +
                        "• Volatile oil:\n" +
                        "Diosphenol (buchu camphor)\n" +
                        "Limonene\n" +
                        "Menthone"
            }
            "Berberis vulgaris (Barberry)", "Barberry (Berberis vulgaris)" -> {
                text = "• Acids:\n" +
                        "Chelidonic\n" +
                        "Citric\n" +
                        "Malic\n" +
                        "Tartaric\n" +
                        "• Alkaloids:\n" +
                        "Berbamine\n" +
                        "Berberine\n" +
                        "Berberubine\n" +
                        "Columbamine\n" +
                        "Oxycanthine\n" +
                        "Palmatine"
            }
            "Bryonia alba(Bryony)", "Bryony (Bryonia alba)" -> {
                text = "• Cucurbitacins including:\n" +
                        "Cucurbitacins B, D, E, I, J, K, L\n" +
                        "Tetrahydrocucurbitacin I\n" +
                        "• Polyhydroxyunsaturated fatty acids including:\n" +
                        "Trihydroxyoctadecadienic acids\n" +
                        "• Tannins\n" +
                        "• Volatile oil"
            }
            "Bupleurum chinense (Thoroughwax)", "Thoroughwax (Bupleurum chinense)" -> {
                text = "• Essential oil containing:\n" +
                        "Bupleurumol\n" +
                        "Furfurol\n" +
                        "• Saikogenins"
            }
            "Calendula officinalis (Marigold)", "Marigold (Calendula officinalis)" -> {
                text = "• Bitter principle\n" +
                        "• Carotenoids\n" +
                        "• Essential oil\n" +
                        "• Flavonoids:\n" +
                        "Chlorogenic acidn\n" +
                        "Quercitin glycosides including rutin\n" +
                        "Narcissi\n" +
                        "• Mucilage\n" +
                        "• Pentacyclic alcohols:\n" +
                        "Arnidoil\n" +
                        "Brein\n" +
                        "Calenduladiol\n" +
                        "Erythrodiol\n" +
                        "Faradol\n" +
                        "Heliantriol C and F\n" +
                        "Longispinogenine\n" +
                        "Ursatriol\n" +
                        "• Saponins\n" +
                        "• Sterols"
            }
            "Camellia sinensis (Green tea)", "Green tea (Camellia sinensis)" -> {
                text = "• Caffeine - 10-100 mg/cup\n" +
                        "• Catechin polyphenols:\n" +
                        "Epicatechin\n" +
                        "Epicatechin-3-0-gallate\n" +
                        "Epigallocatechin\n" +
                        "Epigallocatechin-3-0-gallate (anticarcinogenic)\n" +
                        "Gallocatechin-3-0-gallate\n" +
                        "Methyl-epigallocatechin-3-0-gallate\n" +
                        "• Chlorophyll\n" +
                        "• Flavonoids\n" +
                        "• Fluoride\n" +
                        "• Lignin\n" +
                        "• Organic acids\n" +
                        "• Polyphenols - 300-400 mg/cup\n" +
                        "• Polysaccharides\n" +
                        "• Proanthocyanidins\n" +
                        "• Protein\n" +
                        "• Theanine\n" +
                        "• Vitamin C\n" +
                        "• Vitamin E"
            }
            "Capsicum frutescens (Cayenne, Red pepper)", "Cayenne (Capsicum frutescens)" -> {
                text =
                    "• Capsaicin, a phenolic resin that depletes the amount of substance P in sensory nerves and inhibits platelet aggregation\n" +
                            "• Capsicin, a rubefacient volatile oil\n" +
                            "• Fixed oil\n" +
                            "• Resin\n" +
                            "• Vitamin C"
            }
            "Caulophyllum thalictroides (Blue cohosh)", "Blue cohosh (Caulophyllum thalictroides)" -> {
                text = "• Alkaloids including\n" +
                        "Anagyrine\n" +
                        "Baptifoline\n" +
                        "Magnoflorine\n" +
                        "Methylcytisine (may elevate blood pressure, stimulate respiration, and stimulate intestinal motility)\n" +
                        "• Calcium\n" +
                        "• Iron\n" +
                        "• Magnesium\n" +
                        "• Phosphorus\n" +
                        "• Phytosterols\n" +
                        "• Potassium\n" +
                        "• Saponins\n" +
                        "• Silicon"
            }
            "Centella asiatica (Gota kola)", "Gota kola (Centella asiatica)" -> {
                text = "• Amino acids\n" +
                        "• Beta carotene\n" +
                        "• Glycerides of fatty acids\n" +
                        "• Falvonoids:\n" +
                        "Kaempferol\n" +
                        "Myo-inositol\n" +
                        "Quercetin\n" +
                        "• Potassium\n" +
                        "• Resins\n" +
                        "• Sterols:\n" +
                        "Campesterol\n" +
                        "Sitosterol\n" +
                        "Stigmasterol\n" +
                        "• Sugars\n" +
                        "• Triterpenoid components:\n" +
                        "Asiatic acid\n" +
                        "Asiaticoside\n" +
                        "Madecassic acid\n" +
                        "Madecassoside\n" +
                        "• Various polyacetylene compounds\n" +
                        "• Vellarin, a bitter\n" +
                        "• Volatile oil composed of:\n" +
                        "An unidentified terpene acetate\n" +
                        "Camphor\n" +
                        "Cineole"
            }
            "Chamaelirium luteum (False unicorn)", "False unicorn (Chamaelirium luteum)" -> {
                text = "• Diosgenin\n" +
                        "• Glycosides:\n" +
                        "Chamaelirin\n" +
                        "Helonin\n" +
                        "• Steroidal saponins"
            }
            "Chelidonium majus (Celandine)", "Celandine (Chelidonium majus)" -> {
                text = "• Alkaloids including:\n" +
                        "Allocryptopine\n" +
                        "Berberine\n" +
                        "Chelamine\n" +
                        "Chelerythrine\n" +
                        "Chelidonine\n" +
                        "Coptisine\n" +
                        "Magnoflorine\n" +
                        "Protopine\n" +
                        "Sanguinarine\n" +
                        "• Sparteine\n" +
                        "• Carotene\n" +
                        "• Chelidonic acid\n" +
                        "• Chelidoniol\n" +
                        "• Choline\n" +
                        "• Histamine\n" +
                        "• Tyramine\n" +
                        "• Vitamin C\n" +
                        "• Saponins"
            }
            "Chimaphilia umbellata (Pipsissewa)", "Pipsissewa (Chimaphilia umbellata)" -> {
                text = "• Flavonoids:\n" +
                        "Avicularin\n" +
                        "Hyperoside\n" +
                        "Kaempferol\n" +
                        "• Hydroquinones (In alkaline urine, hydroquinone is an effective antimicrobial and contributes to the antiseptic activity in the urinary tract):\n" +
                        "Arbutin, an antiseptic that is hydrolyzed in gastric fluid to hydroquinone\n" +
                        "Isohomoarbutin\n" +
                        "• Naphthaquinones:\n" +
                        "Chimaphilin\n" +
                        "Renifolin\n" +
                        "• Triterpenes:\n" +
                        "Beta-stiosterol\n" +
                        "Taraxasterol\n" +
                        "Ursolic acid"
            }
            "Chionanthus virginicus (Fringe tree)", "Fringe tree (Chionanthus virginicus)" -> {
                text = "• Chionanthin\n" +
                        "• Hemolytic saponin glycoside\n" +
                        "• Phyllyrin, a lignan glycoside"
            }
            "Cimicifuga racemosa (Black cohosh)", "Black cohosh (Cimicifuga racemosa)" -> {
                text = "• Alkaloids:\n" +
                        "n-Methycytisine\n" +
                        "• Isoflavones:\n" +
                        "Formononetin\n" +
                        "• Organic acids:\n" +
                        "Butryic acid\n" +
                        "Ferulic acid (anti-inflammatory effect that could also alleviate pain)\n" +
                        "Gallic acid\n" +
                        "Isoferulic acid\n" +
                        "Palmitic acid\n" +
                        "Salicylic acid\n" +
                        "• Resin\n" +
                        "• Tannin\n" +
                        "• Triterpene glycosides:\n" +
                        "Actein (aglycon - acetylacteol)\n" +
                        "Cimigoside\n" +
                        "Cimifugine (aglycone - cimigenol)\n" +
                        "Racemoside\n" +
                        "• Volatile oil"
            }
            "Cinnamomum spp. (Cinnamon)", "Cinnamon (Cinnamomum spp.)" -> {
                text = "• Cinnzelanin\n" +
                        "• Cinnzelanol\n" +
                        "• Coumarin\n" +
                        "• Essential oil:\n" +
                        "Cinnamaldehyde\n" +
                        "Cinnamyl acetate\n" +
                        "Cinnamy alcohol\n" +
                        "Cuminaldehyde\n" +
                        "Eugenol\n" +
                        "Methyleugenol\n" +
                        "• Tannins:\n" +
                        "Polymeric tetrahydroxyflavandiols"
            }
            "Collinsonia canadensis (Stone root)", "Stone root (Collinsonia canadensis)" -> {
                text = "• Alkaloids\n" +
                        "• Essential oil\n" +
                        "• Saponins\n" +
                        "• Tannin"
            }
            "Commiphora molmol (Myrrh)", "Myrrh (Commiphora molmol)" -> {
                text = "• Furanosesquiterpenes:\n" +
                        "2-methoxy furanodiene\n" +
                        "Curzerenone\n" +
                        "Furanodiene\n" +
                        "Furanodienone\n" +
                        "Lindestrene\n" +
                        "• Gums:\n" +
                        "4-O-methylglucuronic acid\n" +
                        "Arabinose\n" +
                        "Galactose\n" +
                        "Xylose\n" +
                        "• Resins:\n" +
                        "Alpha- and B- and gamma-commiphoric acids\n" +
                        "Alpha- and B-herabomyrrhols\n" +
                        "Commiferin\n" +
                        "Commiphorinic acids\n" +
                        "Heeraboresene\n" +
                        "• Sterols\n" +
                        "• Volatile oil:\n" +
                        "Cadinene\n" +
                        "Cuminaldehyde\n" +
                        "Elemol\n" +
                        "Eugenol\n" +
                        "Heerabolene"
            }
            "Commiphora mukul (Guggulu)", "Guggulu (Commiphora mukul)" -> {
                text = "• Diterpenes\n" +
                        "• Esters\n" +
                        "• Fatty alcohols\n" +
                        "• Ketone fraction composed of steroids:\n" +
                        "E- and Z-guggulsterone (cholesterol lowering components)\n" +
                        "• Sterols\n" +
                        "• Volatile oil containing cembrene A"
            }
            "Corydalis bulbosa (Corydalis)", "Corydalis (Corydalis bulbosa)" -> {
                text = "• Alkaloids:\n" +
                        "Bulbocapriine\n" +
                        "Corybulbine\n" +
                        "Corydaline\n" +
                        "Corycavamine\n" +
                        "Corycavidine\n" +
                        "Corydine\n" +
                        "Isocorybulbine\n" +
                        "Protopine\n" +
                        "Tetrahydropalmatine"
            }
            "Crataegus oxycantha (Hawthorne)", "Hawthorne (Crataegus oxycantha)" -> {
                text = "• Amygdalin\n" +
                        "• Cardiotonic amines:\n" +
                        "Isobutylamine\n" +
                        "Omethoxphenylethylamine\n" +
                        "Phenylethylamine\n" +
                        "Tyramine\n" +
                        "• Catechins\n" +
                        "• Choline and acetycholine\n" +
                        "• Flavone glycosides\n" +
                        "• Flavonoids:\n" +
                        "Quercetin\n" +
                        "Quercetin-3-galactoside\n" +
                        "Vitexin\n" +
                        "Vitexin-4'-rhamnoside\n" +
                        "• Flavonoid compounds:\n" +
                        "Anthocyanidins\n" +
                        "Proanthocyanidins\n" +
                        "• Pectins: triterpene acids - oleanolic, ursolic, crataegolic\n" +
                        "• Purine derivatives:\n" +
                        "Adenine\n" +
                        "Adenosine\n" +
                        "Caffeic acid\n" +
                        "Guanine\n" +
                        "• Saponins\n" +
                        "• Trimethylamine, a circulatory depressant\n" +
                        "• Vitamin C"
            }
            "Curcuma longa (Tumeric)", "Tumeric (Curcuma longa)" -> {
                text = "• Curcumin, an antioxidant and antiedemic\n" +
                        "• Orange-yellow volatile oil containing:\n" +
                        "Alantone\n" +
                        "Tumerone\n" +
                        "Zingerberone\n" +
                        "• Resin\n" +
                        "• Sugars:\n" +
                        "Arabinose\n" +
                        "Glucose\n" +
                        "Fructose\n" +
                        "• Ukonan-A, a phagocytosis activating factor\n" +
                        "• Ukonan-D, a reticuloendothelial system-potentiating activity"
            }
            "Cynara scolymus (Artichoke)", "Artichoke (Cynara scolymus)" -> {
                text = "• 1,3 dicaffeoylquinic acid\n" +
                        "• 3-caffeoylquinic acid\n" +
                        "• Beta-sitosterol\n" +
                        "• Caffeic acid\n" +
                        "• Cynarin\n" +
                        "• Flavonoids\n" +
                        "• Heteroside-B\n" +
                        "• Inulin\n" +
                        "• Minerals:\n" +
                        "Boron\n" +
                        "Calcium\n" +
                        "Iron\n" +
                        "Magnesium\n" +
                        "Manganese\n" +
                        "Phosphorus\n" +
                        "Potassium\n" +
                        "Zinc\n" +
                        "• Oleic acid\n" +
                        "• Palmitic acid\n" +
                        "• Protein\n" +
                        "• Scolymoside\n" +
                        "• Sesquiterpene lactones\n" +
                        "• Stigmasterol\n" +
                        "• Tannin\n" +
                        "• Vitamins:\n" +
                        "Niacin\n" +
                        "Pantothenic acid\n" +
                        "Riboflavin\n" +
                        "Vitamin B1\n" +
                        "Vitamin B6"
            }
            "Datura stramonium (Jimson weed, Thornapple)", "Jimson weed (Datura stramonium)" -> {
                text = "• Tropane alkaloids:\n" +
                        "Hyoscamine\n" +
                        "Hyoscine\n" +
                        "Traces of atropine"
            }
            "Dioscorea villosa (Wild yam)", "Wild yam (Dioscorea villosa)" -> {
                text = "• Alkaloids:\n" +
                        "Dioscorine\n" +
                        "• Phytosterols\n" +
                        "• Tannins\n" +
                        "• Starch\n" +
                        "• Steroidal saponins:\n" +
                        "Botogenin\n" +
                        "Dioscin and Trillin which yield Diosgenin, a constituent possessing potential hormonal effects"
            }
            "Echinacea angustifolia (Purple cone flower)", "Purple cone flower (Echinacea angustifolia)" -> {
                text = "• Echinoside - glycoside having weak antibiotic activity\n" +
                        "• Essential oils:\n" +
                        "Caryohpylene\n" +
                        "Caryophylene epoxide\n" +
                        "Humulene\n" +
                        "• Fructose\n" +
                        "• Glucose\n" +
                        "• Inulin\n" +
                        "• Mucopolysaccarides - known as echinacin\n" +
                        "• Polysaccharide, arabinogalactan\n" +
                        "• Tannins\n" +
                        "• Trihydroxyphenyl - proprionic acid\n" +
                        "• Vitamin C"
            }
            "Eleutherococcus senticosus (Siberian ginseng)", "Siberian ginseng (Eleutherococcus senticosus)" -> {
                text = "• Triterpenoid spaonins called eleutherosides"
            }
            "Ephedra sinica (Ma huang)", "Ma huang (Ephedra sinica)" -> {
                text = "• Ephedrine, an alkaloid that is molecularly similar to catecholamines"
            }
            "Equisetum arvense (Shave grass, Horsetail)", "Shave grass (Equisetum arvense)" -> {
                text = "• Alkaloids:\n" +
                        "Nicotine\n" +
                        "Palustrine\n" +
                        "Palustrinine\n" +
                        "• Flavonoids\n" +
                        "• Magnesium\n" +
                        "• Manganese\n" +
                        "• Potassium\n" +
                        "• Silica\n" +
                        "• Saponins:\n" +
                        "Equisetonin\n" +
                        "• Sulphur\n" +
                        "• Tannin"
            }
            "Eriodictyon californicum (Yerba santa)", "Yerba santa (Eriodictyon californicum)" -> {
                text = "• Ericolin, a glycoside\n" +
                        "• Flavonoids:\n" +
                        "Chrysoeriodictyol\n" +
                        "Eriodictyol\n" +
                        "Homoeriodictyol, also known as eriodictyone\n" +
                        "Xanthoeriodictyol\n" +
                        "• Resin:\n" +
                        "Cerotic acid\n" +
                        "Eriodonol\n" +
                        "Pentatriacontane\n" +
                        "Triacontane"
            }
            "Eschscholzia californica (California poppy)", "California poppy (Eschscholzia californica)" -> {
                text = "• Alkaloids similar to opium poppy:\n" +
                        "Allocryptopine\n" +
                        "Californidine\n" +
                        "Chelerytrine\n" +
                        "Eschscoltzin\n" +
                        "N-methyllaurotanin\n" +
                        "Protopine\n" +
                        "Sanguinarine\n" +
                        "• Flavone glycosides"
            }
            "Euphrasia officinalis (Eyebright)", "Eyebright (Euphrasia officinalis)" -> {
                text = "• Amino acids\n" +
                        "• Choline\n" +
                        "• Iridoid glycosides:\n" +
                        "Aucubin\n" +
                        "• Phenolic acids:\n" +
                        "Caffeic acid\n" +
                        "Ferulic acid\n" +
                        "• Resins\n" +
                        "• Sterols\n" +
                        "• Tannins-both condensed and hydrolysale gallic acid types\n" +
                        "• Volatile oil"
            }
            "Filipendula ulmaria (Meadowsweet)", "Meadowsweet (Filipendula ulmaria)" -> {
                text = "• Citric acid\n" +
                        "• Coumarin\n" +
                        "• Flavonoids:\n" +
                        "Avicularin\n" +
                        "Hyperoside\n" +
                        "Kaempferol derivatives\n" +
                        "Polyphenolics\n" +
                        "Quercetin derivatives\n" +
                        "Rutin\n" +
                        "Spiraeoside\n" +
                        "• Phenolic glycosides:\n" +
                        "Gaultherin\n" +
                        "Monotropin\n" +
                        "Spiraein\n" +
                        "• Tannin\n" +
                        "• Vitamin C\n" +
                        "• Volatile oil containing:\n" +
                        "Anisaldehyde\n" +
                        "Ethylsalicylate\n" +
                        "Methylsalicylate\n" +
                        "Methoxybenzaldehyde\n" +
                        "Salicylaldehyde"
            }
            "Foeniculum v• ulgare (Fennel)", "Fennel (Foeniculum vulgare)" -> {
                text = "• 2-6% essential oil consisting of:\n" +
                        "• 50-70% of the sweet trans-anethole\n" +
                        "• 20% of the bitter and camphoraceous (+)-fenchone\n" +
                        "• Camphene\n" +
                        "• Estragole\n" +
                        "• Limonene\n" +
                        "• Pinene\n" +
                        "• Alpha-phellandrene\n" +
                        "• Anisaldehyde\n" +
                        "• Fixed oils:\n" +
                        "• Linoleic acid\n" +
                        "• Oleic acid\n" +
                        "• Petroselenic acid\n" +
                        "• Flavonoids:\n" +
                        "• Kaempferol glycoside\n" +
                        "• Quercitin glycoside\n" +
                        "• Rutin glycoside\n" +
                        "• Methylchavicol\n" +
                        "• Minerals:\n" +
                        "• Calcium\n" +
                        "• Potassium\n" +
                        "• Protein\n" +
                        "• Organic acids\n" +
                        "• Vitamins"
            }
            "Fucus vesiculosus (Bladderwrack, Kelp)", "Bladderwrack (Fucus vesiculosus)" -> {
                text = "• Fucophorethols which are polyhydroxyoligophenylethers\n" +
                        "• High molecular weight phlorotannin derivatives\n" +
                        "• Iodine\n" +
                        "• Mannitol\n" +
                        "• Mucopolysaccharides including algin\n" +
                        "• Mucilage\n" +
                        "• Phenolic compounds:\n" +
                        "Free phloroglucinol\n" +
                        "Fucols\n" +
                        "• Polar lipids\n" +
                        "• Potassium\n" +
                        "• Sulphuryl-, sulphonyl- and phosphonyl-glycosyl estr diglycerides\n" +
                        "• Volatile oil"
            }
            "Galium aparine (Cleavers, Bed straw)", "Cleavers (Galium aparine)" -> {
                text = "• Anthraquinone derivatives:\n" +
                        "Alizarin and derivatives\n" +
                        "Galiosin and simple anthraquinones\n" +
                        "Xanthopurpurin and its esters\n" +
                        "• Coumarins\n" +
                        "• Iridoids:\n" +
                        "Asperuloside\n" +
                        "Deacetylasperulosidic acid\n" +
                        "• Polyphenolic acids:\n" +
                        "Caffeic\n" +
                        "Gallic\n" +
                        "P-coumaric"
            }
            "Gelsemium sempervirens (Yellow jasmine, Gelsemium)", "Yellow jasmine (Gelsemium sempervirens)" -> {
                text = "• Alkaloids (CNS depressants) including:\n" +
                        "Gelsdine\n" +
                        "Gelsemidine\n" +
                        "Gelsemicine\n" +
                        "Gelsemine\n" +
                        "Gelsevirine\n" +
                        "• Coumarins:\n" +
                        "Fabitin\n" +
                        "Scopoletin, also known as gelsemic acid\n" +
                        "• Iridoids:\n" +
                        "9-hydroxy-semperoside\n" +
                        "Brasoside\n" +
                        "Gelsemiol with 1- and 3-glucosides\n" +
                        "Gelsemide with 7-glycoside\n" +
                        "Semperoside\n" +
                        "• Tannins"
            }
            "Gentiana lutea (Gentian)", "Gentian (Gentiana lutea)" -> {
                text = "• Alkaloids:\n" +
                        "Gentianine\n" +
                        "Gentialutine\n" +
                        "• Gentiopicrin, a bitter principle\n" +
                        "• Iridoids:\n" +
                        "Amarogentin\n" +
                        "Gentiopicrosider\n" +
                        "Swertiamarin\n" +
                        "• Phenolic acids:\n" +
                        "Caffeic\n" +
                        "Gentisic\n" +
                        "Protocatechuic\n" +
                        "Sinapic\n" +
                        "Syringic\n" +
                        "• Sugars:\n" +
                        "Gentianose\n" +
                        "Gentiobiose\n" +
                        "• Xanthones:\n" +
                        "1,3,7-trimethoxyxanthone Gentisein\n" +
                        "Gentisin\n" +
                        "Isogentisin"
            }
            "Geranium maculatum (Wild geranium, Cranesbill)", "Wild geranium (Geranium maculatum)" -> {
                text = "• Gum\n" +
                        "• Organic acids:\n" +
                        "Galic acid\n" +
                        "• Pectin\n" +
                        "• Resin\n" +
                        "• Starch\n" +
                        "• Tannins"
            }
            "Ginkgo biloba (Ginkgo)", "Ginkgo (Ginkgo biloba)" -> {
                text = "• Aglycones:\n" +
                        "Isorthamnetine\n" +
                        "Kaempferol\n" +
                        "Quercetin\n" +
                        "• Carptempods:\n" +
                        "Lutein\n" +
                        "Zeaxanthin\n" +
                        "• Heteroside flavonoids\n" +
                        "• Organic acids\n" +
                        "• Proanthocyanidins:\n" +
                        "Cyanidine\n" +
                        "Delphinidine\n" +
                        "• Terpenes:\n" +
                        "Diterpene ginkgolides A, B and C (Ginkgolide B is a PAF antagonist)\n" +
                        "Sesquiterpene bilobalide"
            }
            "Glycyrrhiza glabra (Licorice)", "Licorice (Glycyrrhiza glabra)" -> {
                text = "• Acidic resin\n" +
                        "• Amines\n" +
                        "• Amino acids\n" +
                        "• Asparagin, a mucilage\n" +
                        "• Chalcones\n" +
                        "• Coumarins:\n" +
                        "Herniarin\n" +
                        "Umbelliferone\n" +
                        "• Flavonoids\n" +
                        "• Glycyramarin\n" +
                        "• Glycyrrhizin, a derivative of glycyrrhetinic acid similar to hormones produced in the adrenal cortex, especially desoxycorticosterone (DOCA)\n" +
                        "• Gums\n" +
                        "• Inflavonoids:\n" +
                        "Glabrol\n" +
                        "Isoflavonol\n" +
                        "Kumatakenin\n" +
                        "Licoricone\n" +
                        "• Lignins\n" +
                        "• Phytosterols, both estrogenic and cortisone-like\n" +
                        "• Resins\n" +
                        "• Starch\n" +
                        "• Sugar:\n" +
                        "Glucose\n" +
                        "Sucrose\n" +
                        "• Tannin\n" +
                        "• Triterpenoids\n" +
                        "• Volatile oils:\n" +
                        "Fenchone\n" +
                        "Thujone"
            }
            "Grindelia camporum (Gumweed)", "Gumweed (Grindelia camporum)" -> {
                text = "• Alkaloid:\n" +
                        "Grindeline\n" +
                        "• Flavonoids:\n" +
                        "Acacetin\n" +
                        "Kumatakenin\n" +
                        "Quercitin\n" +
                        "• Resin\n" +
                        "• Saponins:\n" +
                        "Grindelin\n" +
                        "• Selenium\n" +
                        "• Tannins\n" +
                        "• Volatile oil"
            }
            "Gymnema sylvestre (Gymnema)", "Gymnema (Gymnema sylvestre)" -> {
                text = "• Gymnemic acid"
            }
            "Hamamelis virginiana (Witch hazel)", "Witch hazel (Hamamelis virginiana)" -> {
                text = "• Bitters\n" +
                        "• Flavonoids:\n" +
                        "Astragalin\n" +
                        "Kaempferol\n" +
                        "Myricitrin\n" +
                        "Quercitin\n" +
                        "• Gallic acid\n" +
                        "• Resin\n" +
                        "• Saponins\n" +
                        "• Tannins:\n" +
                        "Gallotannins with condensed catechins and proanthocyanins\n" +
                        "• Volatile oil containing:\n" +
                        "Alpha-, Beta-, and gamma hamamelitannins with condensed tannins:\n" +
                        "d-gallocatechin\n" +
                        "l-epigallocatechin\n" +
                        "l-epicatechin\n" +
                        "Hexenol\n" +
                        "n-hexen-2-al"
            }
            "Harpagophytum procumbens (Devil's claw, Grapple plant)", "Devil's claw (Harpagophytum procumbens)" -> {
                text = "• Flavonoids:\n" +
                        "Luteolin glycosides\n" +
                        "Kaempferol\n" +
                        "• Harpagoquinone\n" +
                        "• Iridoid glycosides:\n" +
                        "Harpagoside\n" +
                        "Procumbide\n" +
                        "• Oleanolic and ursolic acid derivatives and esters\n" +
                        "• Phenolic acids:\n" +
                        "Chlorogenic acid\n" +
                        "Cinnamic acid\n" +
                        "• Sugars:\n" +
                        "Glucose\n" +
                        "Raffinose\n" +
                        "Saccharose\n" +
                        "Stachyose\n" +
                        "• Triterpenes"
            }
            "Humulus lupulus (Hops)", "Hops (Humulus lupulus)" -> {
                text =
                    "• Flavonoids, mainly glycosides of kaemphferol, rutin, astragalin and quercitin\n" +
                            "• Resin, composed of alpha-bitter acids including adhumulone, cohumulone, humulone and others and beta-bitter acids including lupulone, colupulone, adlupulone and others\n" +
                            "• Volatile oil composed of humulene with B-caryophyllene, myrcene, farnesene, 2-methylbut-3-ene-2-ol, 3-methylbut-2-ene-1-al, 2,3,4-trithiahexane\n" +
                            "• 2-methylpropanoic and 3-methylbutanoic acids which increase in concentration in stored extracts\n" +
                            "• Humulone (lupamaric acid) and lupulinic acid convert to isovaleric acid on storage\n" +
                            "• Bitter resins and oil are known collectively as lupulin\n" +
                            "• Amino acids\n" +
                            "• Estrogenic-like substances\n" +
                            "• Geraniol\n" +
                            "• Linalool\n" +
                            "• Citral\n" +
                            "• Serolidol\n" +
                            "• Linionene"
            }
            "Hydrastis canadensis (Goldenseal)", "Goldenseal (Hydrastis canadensis)" -> {
                text = "• Alkaloids:\n" +
                        "Berberine, a choleretic shown to triple bile secretion for 1.5 hours\n" +
                        "Canadine\n" +
                        "Hydrastine\n" +
                        "Hydrastinine\n" +
                        "• Resin"
            }
            "Hypericum perforatum (St. John's wort)", "Saint John's wort (Hypericum perforatum)" -> {
                text = "• Alkanes\n" +
                        "• Carotenoids\n" +
                        "• Essential oil containing:\n" +
                        "Alpha and beta pinene\n" +
                        "Caryophyllene\n" +
                        "Methyl-2-octane\n" +
                        "N-nonane\n" +
                        "N-octane\n" +
                        "N-decanal\n" +
                        "Traces of limonene and myrcene\n" +
                        "• Flavonoids\n" +
                        "• Hypericins\n" +
                        "• Pseudohypericin\n" +
                        "• Phytosterols\n" +
                        "• Phenolic caroxylic acids:\n" +
                        "Caffeic acid\n" +
                        "Chlorogenic acid\n" +
                        "Ferulic acid\n" +
                        "Gentisic acid"
            }
            "Hyssopus officinalis (Hyssop)", "Hyssop (Hyssopus officinalis)" -> {
                text = "• Flavonoids\n" +
                        "• Gum\n" +
                        "• Hyssopin, a glycoside\n" +
                        "• Insolic acid\n" +
                        "• Marrubiin, a bitter\n" +
                        "• Oleonolic acid\n" +
                        "• Resin\n" +
                        "• Volatile oil containing:\n" +
                        "Camphene\n" +
                        "Isopinocamphone\n" +
                        "Pinenes\n" +
                        "Pinocamphone\n" +
                        "Teripnene"
            }
            "Inula helenium (Elecampane)", "Elecampane (Inula helenium)" -> {
                text = "• Inulin\n" +
                        "• Resin\n" +
                        "• Sterols\n" +
                        "• Volatile oil containing:\n" +
                        "Alamtolactone (also known as helenalin or elecampane camphor)\n" +
                        "Alantic acid\n" +
                        "Azulene\n" +
                        "Isoalantolactone and its dihydro derivatives\n" +
                        "Sesquiterpene lactones"
            }
            "Juniperis communis (Juniper)", "Juniper (Juniperis communis)" -> {
                text = "• 1,4-dimethyl-3-cyclohexen-1-yl methyl ketone\n" +
                        "• Flavone Glycosides\n" +
                        "• Invert sugar\n" +
                        "• Organic acids:\n" +
                        "• Acetic acid\n" +
                        "• Formic acid\n" +
                        "• Malic acid\n" +
                        "• Resin\n" +
                        "• Tannin\n" +
                        "• Vitamin C\n" +
                        "• Volatile oils:\n" +
                        "• Cadinene\n" +
                        "• Camphene\n" +
                        "• Limonene\n" +
                        "• Myrcene\n" +
                        "• Pinene\n" +
                        "• Sabinene"
            }
            "Larrea tridentata (Chapparrel, Creosote bush, Creosotum)", "Chapparrel (Larrea tridentata)" -> {
                text = "• Alkaloids\n" +
                        "• Flavonoids\n" +
                        "• NDGA (Norhydroguiuratic acid)\n" +
                        "• Resins"
            }
            "Lavendula angustifolia (Lavender)", "Lavender (Lavendula angustifolia)" -> {
                text = "• Coumarins:\n" +
                        "Coumarin\n" +
                        "Dihydrocoumarin\n" +
                        "Herniarin\n" +
                        "Umbelliferone\n" +
                        "• Luteolin, a flavonoid\n" +
                        "• Ursolic acid, a triterpene\n" +
                        "• Volatile oil:\n" +
                        "4-Butanolide\n" +
                        "5-Pentyl-5-pentanolide\n" +
                        "Borneol\n" +
                        "Cadinene\n" +
                        "Camphor\n" +
                        "Caryophyllene\n" +
                        "Lavandulyl acetate\n" +
                        "Limonene\n" +
                        "Linalool\n" +
                        "Linalyl acetate"
            }
            "Leonurus cardiaca (Motherwort)", "Motherwort (Leonurus cardiaca)" -> {
                text = "• Alkaloids\n" +
                        "• Apigenin\n" +
                        "• Caffeic acid\n" +
                        "• Diterpenes of the labdane type such as leocardin\n" +
                        "• Essential oil\n" +
                        "• Flavonoids:\n" +
                        "• Glycosides\n" +
                        "• Leonurine-a bitter\n" +
                        "• Leonurinine\n" +
                        "• Tannic acid\n" +
                        "• Quercitin\n" +
                        "• Quercetrin"
            }
            "Ligusticum porteri (Osha)", "Osha (Ligusticum porteri)" -> {
                text = "• Limited data"
            }
            "Linum usitatissimum (Flax, Linseed)", "Flax (Linum usitatissimum)" -> {
                text = "• Amygdalin\n" +
                        "• Linamarine-a cyanogenic glycoside\n" +
                        "• Linoleic and linolenic acids\n" +
                        "• Mucilage\n" +
                        "• Protein"
            }
            "Lobelia inflata (Indian tobacco, Puke weed)", "Indian tobacco (Lobelia inflata)" -> {
                text = "• Chelidonic acid\n" +
                        "• Gum\n" +
                        "• Lipids\n" +
                        "• Lobelic acid\n" +
                        "• Pyridine alkaloids:\n" +
                        "Lobelanidine\n" +
                        "Lobelanine\n" +
                        "Lobeline\n" +
                        "• Resin\n" +
                        "• Volatile oil"
            }
            "Lomatium disectum (Desert parsley)", "Desert parsley (Lomatium disectum)" -> {
                text = "• Carbohydrates\n" +
                        "• Essential oil\n" +
                        "• Free fatty acids\n" +
                        "• Furnaocoumarins:\n" +
                        "Columbianetin\n" +
                        "Nodakenetin\n" +
                        "• Protein\n" +
                        "• Resin\n" +
                        "• Saponin\n" +
                        "• Tannin\n" +
                        "• Vitamin C"
            }
            "Marrubium vulgare (Horehound)", "Horehound (Marrubium vulgare)" -> {
                text = "• Alkaloids:\n" +
                        "Betonicine and its isomer turicine\n" +
                        "• Choline\n" +
                        "• Diterpene lactone:\n" +
                        "Marrubiin\n" +
                        "• Diterpene alcohols:\n" +
                        "Marrubiol\n" +
                        "Marrubenol\n" +
                        "Sclareol\n" +
                        "Peregrinin\n" +
                        "Dihydroperegrinin\n" +
                        "• Phytosterols\n" +
                        "• Resin\n" +
                        "• Tannin\n" +
                        "• Volatile oil"
            }
            "Matricaria chamomilla (German chamomile)", "German chamomile (Matricaria chamomilla)" -> {
                text = "• Amino acids\n" +
                        "• Azulenes:\n" +
                        "Chamazulene (a sesquiterpene derivative that relieves pain, encourages wound healing, is anti-inflammatory and antispasmodic)\n" +
                        "Guiazulene\n" +
                        "Matricine (volatile oil that degrades to chamazulene with distillation)\n" +
                        "a-Bisabolol oxides A and B\n" +
                        "a-Bisabolone oxide A\n" +
                        "Farnesene\n" +
                        "• Choline\n" +
                        "• Coumarins:\n" +
                        "Umbelliferon\n" +
                        "Herniarin\n" +
                        "• Flavonoids:\n" +
                        "Apigenin (a potent spasmolytic agent)\n" +
                        "Luteolin\n" +
                        "Patuletin\n" +
                        "Quercitin\n" +
                        "• Polysaccharides\n" +
                        "• Salicylate derivatives\n" +
                        "• Spiroethers (dicyclos ether having antiphlogistic and antispasmodic properties):\n" +
                        "Cis- and trans-en-dicycloether\n" +
                        "• Volatile oil, up to 2%, containing:a-bisabolol (speeds up healing of ulcers)\n" +
                        "• Xyloglucurans"
            }
            "Medicago sativa (Alfalfa)", "Alfalfa (Medicago sativa)" -> {
                text =
                    "• Anti-estrogen' - a chloroform soluble compound that reduces estrogenic activity of phytoestrogens, estradiol, and diethylstillbestrol\n" +
                            "• L-canavanine\n" +
                            "• Nutrients:\n" +
                            "Beta-Carotene\n" +
                            "Bioflavonoids\n" +
                            "Calcium\n" +
                            "Folic acid\n" +
                            "Iron\n" +
                            "Magnesium\n" +
                            "Niacin\n" +
                            "Phosphorous\n" +
                            "Potassium\n" +
                            "Riboflavin\n" +
                            "Thiamine\n" +
                            "Vitamin C\n" +
                            "Vitamin D\n" +
                            "Vitamin E\n" +
                            "Vitamin K\n" +
                            "Zinc\n" +
                            "• Phytoestrogens:\n" +
                            "Bichanin A\n" +
                            "Coumestrol\n" +
                            "Diadzein\n" +
                            "Formonetin\n" +
                            "Genistein\n" +
                            "• TRH-like substance\n" +
                            "• Tricin\n" +
                            "• Triacontanol"
            }
            "Melaleuca alternifolia (Tea tree)", "Tea tree (Melaleuca alternifolia)" -> {
                text = "• Oil containing:\n" +
                        "1-terpinen-4-ol\n" +
                        "Gamma-terpinene\n" +
                        "1,8-cineol\n" +
                        "p-cymene"
            }
            "Melissa officinalis (Lemon balm)", "Lemon balm (Melissa officinalis)" -> {
                text = "• Eugenl acetate\n" +
                        "• Flavonoids:\n" +
                        "Luteolin-7-glucoside\n" +
                        "Rhamnazin\n" +
                        "• Polyphenolics:\n" +
                        "Caffeic acid\n" +
                        "Protocatechuic acid\n" +
                        "Rosmarinic acid\n" +
                        "• Tannins\n" +
                        "• Terpenes:\n" +
                        "B-carophyllene\n" +
                        "Citronellal\n" +
                        "Geraniol\n" +
                        "Linalool\n" +
                        "Nerol\n" +
                        "• Triterpenic acids:\n" +
                        "Pomolic acid\n" +
                        "Ursolic acid\n" +
                        "• Volatile oil:\n" +
                        "Citral a and b with caryophyllene oxide"
            }
            "Mentha piperita (Peppermint)", "Peppermint (Mentha piperita)" -> {
                text = "• Azulenes\n" +
                        "• Bitter principle\n" +
                        "• Carotenes\n" +
                        "• Choline\n" +
                        "• Essential oil containing:\n" +
                        "Alpha- and beta-pinene\n" +
                        "Cineole\n" +
                        "Jasmone\n" +
                        "Isomenthol\n" +
                        "Isomenthone\n" +
                        "Ledol\n" +
                        "Limonene\n" +
                        "Menthofuran\n" +
                        "Menthol\n" +
                        "Menthone\n" +
                        "Menthyl acetate\n" +
                        "Neomenthol\n" +
                        "Piperitone\n" +
                        "Pulegone\n" +
                        "Viridiflorol\n" +
                        "• Flavonoids:\n" +
                        "Menthoside\n" +
                        "Rutin\n" +
                        "• Rosmarinic acid\n" +
                        "• Tannins"
            }
            "Mitchella repens (Squawvine, Partridge berry)", "Squawvine (Mitchella repens)" -> {
                text = "• Alkaloids\n" +
                        "• Glycosides\n" +
                        "• Tannins\n" +
                        "• Mucilages"
            }
            "Momordica charantia (Bitter melon)", "Bitter melon (Momordica charantia)" -> {
                text = "• 5-Alpha stigmasta-7,25-Dien-3-betalOL\n" +
                        "• 5-Hydroxytryptamine\n" +
                        "• Alkaloids\n" +
                        "• Alpha and beta momorcharin - possess immunosuppressive activities\n" +
                        "• Alpha-elaneostearic acid\n" +
                        "• Ascorbigen\n" +
                        "• Beta-sitosterol-d-glucoside\n" +
                        "• Charantin\n" +
                        "• Citrulline\n" +
                        "• Cryptoxanthin\n" +
                        "• Elasterol\n" +
                        "• Flavochrome\n" +
                        "• Fluoride\n" +
                        "• Gaba\n" +
                        "• Galacturonic acid\n" +
                        "• Lanosterol\n" +
                        "• Lutein\n" +
                        "• Lycopene\n" +
                        "• Momordicin\n" +
                        "• Momordicoside-F-1\n" +
                        "• Momordicoside-F-2\n" +
                        "• Momordicoside-G\n" +
                        "• Momordicoside-I\n" +
                        "• Mutachrome\n" +
                        "• Oxalate\n" +
                        "• Oxalic acid\n" +
                        "• Pipecolic acid\n" +
                        "• Polypeptide-p\n" +
                        "• Rubixanthin\n" +
                        "• Stigmasta-5,25-dien-3-beta-ol\n" +
                        "• Sugars\n" +
                        "• Zeaxanthin\n" +
                        "• Zeinoxanthin"
            }
            "Nepeta cataria (Catnip)", "Catnip (Nepeta cataria)" -> {
                text = "• Iridoids:\n" +
                        "7-deoxyloganic acid\n" +
                        "Epideoxyloganic acid\n" +
                        "• Tannins\n" +
                        "• Volatile oil:\n" +
                        "5,9-dehydronepetalactone\n" +
                        "Carvacrol\n" +
                        "Citronellal\n" +
                        "Geraniol\n" +
                        "Monoterpenes a- and B-nepetalactone\n" +
                        "Nepetalic acid\n" +
                        "Nerol\n" +
                        "Pulegone\n" +
                        "Thymol"
            }
            "Oplopanax horridum (Devil's club)", "Devil's club (Oplopanax horridum)" -> {
                text = "• Acetylenic compounds:\n" +
                        "Falcarinol and Falcarintriol\n" +
                        "Panaxydol and Panaxytriol\n" +
                        "• Calcium\n" +
                        "• Choline\n" +
                        "• Copper\n" +
                        "• Iron\n" +
                        "• Magnesium\n" +
                        "• Manganese\n" +
                        "• Pectin\n" +
                        "• Saponin glycosides, referred to as ginsenosides by Japanese and panaxosides by Russians\n" +
                        "• Starch\n" +
                        "• Sterols\n" +
                        "• Sugars\n" +
                        "• Vitamin B1\n" +
                        "• Vitamin B2\n" +
                        "• Vitamin B12\n" +
                        "• Vanadium\n" +
                        "• Volatile oil containing:\n" +
                        "Beta-elemene\n" +
                        "• Zinc"
            }
            "Panax ginseng (Chinese ginseng, Korean ginseng)", "Chinese ginseng (Panax ginseng)" -> {
                text = "• Acetylenic compounds:\n" +
                        "Falcarinol and Falcarintriol\n" +
                        "Panaxydol and Panaxytriol\n" +
                        "• Calcium\n" +
                        "• Choline\n" +
                        "• Copper\n" +
                        "• Iron\n" +
                        "• Magnesium\n" +
                        "• Manganese\n" +
                        "• Pectin\n" +
                        "• Saponin glycosides, referred to as ginsenosides by Japanese and panaxosides by Russians\n" +
                        "• Starch\n" +
                        "• Sterols\n" +
                        "• Sugars\n" +
                        "• Vanadium\n" +
                        "• Vitamin B1\n" +
                        "• Vitamin B2\n" +
                        "• Vitamin B12\n" +
                        "• Volatile oil containing:\n" +
                        "Beta-elemene\n" +
                        "• Zinc"
            }
            "Passiflora incarnata (Passionflower)", "Passionflower (Passiflora incarnata)" -> {
                text = "• Alkaloids:\n" +
                        "Harmane\n" +
                        "Harmol\n" +
                        "Harmaline, a toxic constituent, maybe hallucinogenic\n" +
                        "Harmine\n" +
                        "Harmalol\n" +
                        "• Calcium\n" +
                        "• Gum\n" +
                        "• Flavonoids:\n" +
                        "Apigenin and various glycosides (antispasmodic and anti-inflammatory activity)\n" +
                        "Homoorientin\n" +
                        "Isovitexin\n" +
                        "Kaempferol\n" +
                        "Luteolin\n" +
                        "Orientin\n" +
                        "Quercetin\n" +
                        "Rutin\n" +
                        "Saponaretin\n" +
                        "Saponarin\n" +
                        "Vitexin\n" +
                        "• Iron\n" +
                        "• Phosphorus\n" +
                        "• Sterols\n" +
                        "• Sugars"
            }
            "Pausinystalia yohimbe (Yohimbe)", "Yohimbe (Pausinystalia yohimbe)" -> {
                text = "• Indole alkaloids:\n" +
                        "Alpha-Yohimbane\n" +
                        "Beta-Yohimbane\n" +
                        "Coryantheine\n" +
                        "Pseudoyohombine\n" +
                        "Yohimbine"
            }
            "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)", "Butterbur (Petasites hybridus)" -> {
                text = "• 3-Isopetasanestern\n" +
                        "• Isopetasin\n" +
                        "• Petasin\n" +
                        "• Pyrrolizidine alkaloids"
            }
            "Petroselinum crispum (Parsley)", "Parsley (Petroselinum crispum)" -> {
                text = "• Calcium\n" +
                        "• Coumarins:\n" +
                        "• 8- and 5-methoxypsoralen\n" +
                        "• Bergapten\n" +
                        "• Imperatorin\n" +
                        "• Isopimpinellin\n" +
                        "• Psoralen\n" +
                        "• Xanthotoxin\n" +
                        "• Essential oils:\n" +
                        "• Apiol\n" +
                        "• Apiolin\n" +
                        "• B-phellandrene\n" +
                        "• Camphene\n" +
                        "• Eugenol\n" +
                        "• a-thujene\n" +
                        "• a- and B-pinene\n" +
                        "• p-mentha-1,3,8_triene\n" +
                        "• 4-isoprepenyl-1-methylbenzene\n" +
                        "• 2-(p-toluyl)propan-2-ol\n" +
                        "• l-Lmonene\n" +
                        "• Myristicin\n" +
                        "• Flavonoids:\n" +
                        "• Apigenin-7-glucoside\n" +
                        "• Apiin\n" +
                        "• Luteolin\n" +
                        "• Luteolin-7-glucoside\n" +
                        "• Iron\n" +
                        "• Manganese\n" +
                        "• Phosphorus\n" +
                        "• Vitamin A\n" +
                        "• Vitamin C"
            }
            "Phytolacca decandra (Poke)", "Poke (Phytolacca decandra)" -> {
                text = "• Alkaloid:\n" +
                        "Phytolaccine\n" +
                        "• Formic acid\n" +
                        "• Lectins, glycoproteins, Pa-1 to Pa-5\n" +
                        "• Phytolaccic acid\n" +
                        "• Resin\n" +
                        "• Saponin\n" +
                        "• Tannin\n" +
                        "• Vitamin K"
            }
            "Pimpinella anisum (Anise)", "Anise (Pimpinella anisum)\n" -> {
                text = "• Calcium\n" +
                        "• Carbohydrates\n" +
                        "• Coumarins:\n" +
                        "Bergapten\n" +
                        "Unbelliferone\n" +
                        "Scopoletin\n" +
                        "• Fatty acids\n" +
                        "• Flavonoid glycosides:\n" +
                        "Rutin\n" +
                        "Isovitexin\n" +
                        "Quercetin glycoside\n" +
                        "Luteolin glycoside\n" +
                        "Apigenin glycoside\n" +
                        "• Fixed oil\n" +
                        "• Iron\n" +
                        "• Lipids\n" +
                        "• Protein\n" +
                        "• Sterols\n" +
                        "• Volatile oil"
            }
            "Piper methysticum (Kava kava)", "Kava kava (Piper methysticum)" -> {
                text = "• Kavalactones\n" +
                        "• Minerals, especially potassium\n" +
                        "• Pipermethysticine, a piperidine alkaloid\n" +
                        "• Proteins\n" +
                        "• Pyrone derivatives:\n" +
                        "Dihydrokawain\n" +
                        "Dihydromethysticin\n" +
                        "Kawain\n" +
                        "Yangonin\n" +
                        "• Simple sugars\n" +
                        "• Starch"
            }
            "Piscidia piscipula (Jamaican dogwood)", "Jamaican dogwood (Piscidia piscipula)" -> {
                text = "• Alkaloid\n" +
                        "• B-sitosterol\n" +
                        "• Glycosides:\n" +
                        "Icthyone\n" +
                        "Jamaicin\n" +
                        "Piscidin\n" +
                        "• Isoflavonoes:\n" +
                        "Lisetin\n" +
                        "Isothyone\n" +
                        "• Retonoids:\n" +
                        "Isomilletone\n" +
                        "Milletone\n" +
                        "Rotenone\n" +
                        "• Organic acids:\n" +
                        "Piscidic acid and its mono- and diethyl esters, fukiic acid and its 3'-O-methyl esters"
            }
            "Polygonum multiflorum (Fo-ti, He-shou-wu)", "Fo-ti (Polygonum multiflorum)" -> {
                text = "• Glycosides\n" +
                        "• Lecithin"
            }
            "Pygeum africanum (Pygeum)", "Pygeum (Pygeum africanum)" -> {
                text = "• Fatty acids\n" +
                        "• Ferulic acid esters, bound to n-tetracosanol and n-docosanol\n" +
                        "• Pentacyclic triterpenes:\n" +
                        "Crataegolic acids\n" +
                        "Oleanolic acid\n" +
                        "Ursolic acid\n" +
                        "• Sterolic triterpenes:\n" +
                        "B-sitosterone\n" +
                        "B-sitosterol"
            }
            "Rhamnus frangula (Buckthorn)", "Buckthorn (Rhamnus frangula)" -> {
                text = "• Aloe-emodin\n" +
                        "• Anthrquinone glycosides including:\n" +
                        "Barbaloin\n" +
                        "Cascarosides A, B, C and D\n" +
                        "Chrysaloin\n" +
                        "Frangulin\n" +
                        "• Chrysophanol\n" +
                        "• Emodin\n" +
                        "• Heterodianthrones palmidin A, B, and C, dianthrones\n" +
                        "• Oxanthrone\n" +
                        "• Rhein\n" +
                        "• Tannins"
            }
            "Rhamnus purshiana (Cascara)", "Cascara (Rhamnus purshiana)" -> {
                text = "• Aloe-emodin\n" +
                        "• Anthrquinone glycosides including:\n" +
                        "Barbaloin\n" +
                        "Cascarosides A, B, C and D\n" +
                        "Chrysaloin\n" +
                        "Frangulin\n" +
                        "• Chrysophanol\n" +
                        "• Emodin\n" +
                        "• Heterodianthrones palmidin A, B, and C, dianthrones\n" +
                        "• Oxanthrone\n" +
                        "• Rhein\n" +
                        "• Tannins"
            }
            "Rheum officinalis (Rhubarb)", "Rhubarb (Rheum officinalis)" -> {
                text =
                    "• Anthraquinones, including emodin, aloe-emodin, chrysophanic acid, rhein and physcion with their O-glycosides - sennosides A, B, C, D, E and F, glucorhein, chrysophanein and glucoemodin (which gives the herb a purgative effect)\n" +
                            "• Bitters (which have a gentle tonic bitter effect and aperitive effect in small doses)\n" +
                            "• Stilbene derivatives\n" +
                            "• Rutin\n" +
                            "• Tannins: d-catechin and epicatechin gallate with various coumaroyl galloyl glucosides and fructoses (which gives the herb an astringent effect)\n" +
                            "• Volatile oil containing cinnamic, diisobutyl phthalate and ferulic acids\n" +
                            "• Note: Constituents may turn urine reddish brown or yellowish brown"
            }
            "Rosmarius officinalis (Rosemary)", "Rosemary (Rosmarius officinalis)" -> {
                text = "• Flavonoids:\n" +
                        "6-methoxygenkwanin\n" +
                        "Apigenin (produces anti-inflammatory effect)\n" +
                        "Diosmetin\n" +
                        "Diosmin (decreases capillary fragility)\n" +
                        "Genkwanin\n" +
                        "Hispidulin\n" +
                        "Luteolin\n" +
                        "Sinensetin\n" +
                        "• Diterpenes:\n" +
                        "Carnosolic acid\n" +
                        "Picrosalvin\n" +
                        "Rosmariquinone\n" +
                        "• Rosmarinic acid (produces anti-inflammatory effect)\n" +
                        "• Triterpenes:\n" +
                        "Oleanolic acid\n" +
                        "Ursolic acid (produces anti-inflammatory effect)\n" +
                        "• Volatile oil containing:\n" +
                        "Borneol\n" +
                        "Camphene\n" +
                        "Camphor\n" +
                        "Cineole\n" +
                        "Limonene\n" +
                        "Linalool\n" +
                        "Isobutyl acetate\n" +
                        "3-octanone\n" +
                        "Terpineol\n" +
                        "Verbenol"
            }
            "Rumex crispis (Yellow dock, Curly dock)", "Yellow dock (Rumex crispis)" -> {
                text = "• Calcium\n" +
                        "• Chrysaphoric acid (organic acid) - laxative\n" +
                        "• Emodin anthraquinone - laxative\n" +
                        "• Iron"
            }
            "Ruscus aculeatus (Butcher's broom)", "Butcher's broom (Ruscus aculeatus)" -> {
                text = "• Saponin glycosides including:\n" +
                        "Ruscogenin (similar to those found in Dioscorea villosa)"
            }
            "Salvia miltiorrhiza (Danshen)", "Danshen (Salvia miltiorrhiza)" -> {
                text = "• 1,2,15,16-tetrahydrotanshiquinone\n" +
                        "• Cryptotanshinone\n" +
                        "• Danshensu\n" +
                        "• Danshexinkun B\n" +
                        "• Dihydroisotanshone I\n" +
                        "• Dihydrotanshinone I\n" +
                        "• Diterpenoids\n" +
                        "• Flavanone\n" +
                        "• Hydroxytanshinone II-A\n" +
                        "• Magnesium lithospermate B, a tetramer of caffeic acid\n" +
                        "• Methylenetanshiquinone\n" +
                        "• Methyltanshinonate\n" +
                        "• Miltirone\n" +
                        "• Nortanshinone\n" +
                        "• Polyphenolic acids\n" +
                        "• Protocatechuic aldehyde\n" +
                        "• Tanshinone II A"
            }
            "Salvia officinalis (Sage)", "Sage (Salvia officinalis)" -> {
                text = "• Diterpene bitters:\n" +
                        "Carnosolic acid\n" +
                        "Picrosalvin\n" +
                        "• Estrogenic substances\n" +
                        "• Flavonoids:\n" +
                        "6-methoxygenkwanin\n" +
                        "Genkwanin\n" +
                        "Hispidulin\n" +
                        "Luteolin\n" +
                        "Salvigenin\n" +
                        "• Phenolic acids:\n" +
                        "Caffeic acid\n" +
                        "Labiatic acid\n" +
                        "Rosmarinic acid\n" +
                        "• Salviatannin, a condensed catechin\n" +
                        "• Volatile oil containing:\n" +
                        "a- and B-thujone (a-thujone contains toxic constituent)\n" +
                        "2-methyl-3-methylene-5-heptene\n" +
                        "Borneol\n" +
                        "Camphor\n" +
                        "Cineole"
            }
            "Sambucus canadensis, nigra (Elder)", "Elder (Sambucus canadensis, nigra)" -> {
                text = "• Alkanes\n" +
                        "• Bioflavonoids\n" +
                        "• Cyanogenetic glycosides\n" +
                        "• Sambunigrin\n" +
                        "• Fixed oil, containing free fatty acids:\n" +
                        "• Linoleic and linolenic acids\n" +
                        "• Palmitic acid\n" +
                        "• Flavonoids:\n" +
                        "• Rutin\n" +
                        "• Quercitin\n" +
                        "• Kaempferol\n" +
                        "• Phenolic acids:\n" +
                        "• Chlorogenic acid\n" +
                        "• Pectin\n" +
                        "• Triterpenes:\n" +
                        "• 30-B-hydroxyursolic acid\n" +
                        "• a- and B-amyrin\n" +
                        "• Free and esterified sterols\n" +
                        "• Oleanolic acid\n" +
                        "• Ursolic acid\n" +
                        "• Vitamin C"
            }
            "Sanguinaria canadensia (Blood root)", "Blood root (Sanguinaria canadensia)" -> {
                text = "• Isoquinoline alkaloids:\n" +
                        "Berberine\n" +
                        "Chelerythrine\n" +
                        "Chelilutine\n" +
                        "Chelirubine\n" +
                        "Coptisine\n" +
                        "Oxysanguinaridine\n" +
                        "Protopine\n" +
                        "Sanguidaridine\n" +
                        "Sanguidimerine\n" +
                        "Sanguilutine\n" +
                        "Sanguinarine\n" +
                        "Sanguirubine\n" +
                        "a- and B-allocryptopine"
            }
            "Schisandra chinensis (Wu wei zi)", "Wu wei zi (Schisandra chinensis)" -> {
                text = "• Acids\n" +
                        "• Essential oils\n" +
                        "• Lignans:\n" +
                        "Deoxyschizandrin\n" +
                        "Gomisin A (liver protective effects by functioning as antioxidants to prevent the lipid peroxidation produced by harmful substances such as carbon tetrachloride\n" +
                        "Pregomisin\n" +
                        "Schizandrin\n" +
                        "Wuweizisu (liver protective effects by functioning as antioxidants to prevent the lipid peroxidation produced by harmful substances such as carbon tetrachloride"
            }
            "Scutellaria laterifolia (Skullcap)", "Skullcap (Scutellaria laterifolia)" -> {
                text = "• Bitter\n" +
                        "• Cellulose\n" +
                        "• Flavonoid glycoside:\n" +
                        "Scutellarin\n" +
                        "Scutellanein\n" +
                        "• Iridoids:\n" +
                        "Catalpol\n" +
                        "• Lignin\n" +
                        "• Resins\n" +
                        "• Sugar\n" +
                        "• Tannins\n" +
                        "• Volatile oil and waxes:\n" +
                        "C13, C33 and C35 hydrocarbons"
            }
            "Serenoa repens (Saw palmetto)", "Saw palmetto (Serenoa repens)" -> {
                text = "• Carotenes\n" +
                        "• Free fatty acids:\n" +
                        "Capric\n" +
                        "Caprylic\n" +
                        "Caproic\n" +
                        "Lauric\n" +
                        "Palmitic\n" +
                        "Oleic\n" +
                        "• Green volatile oil\n" +
                        "• Lipase\n" +
                        "• Polysaccharides:\n" +
                        "Arabinose\n" +
                        "Galactose\n" +
                        "• Resin\n" +
                        "• Steroidal saponins:\n" +
                        "Beta sitosterol\n" +
                        "Cycloartenol\n" +
                        "Lupenone\n" +
                        "Lupeol\n" +
                        "Stigmasterol\n" +
                        "• Tannins"
            }
            "Silybum marianum (Milk thistle)", "Milk thistle (Silybum marianum)" -> {
                text = "• Silymarin containing:\n" +
                        "Silibin, most biological active component\n" +
                        "Silichristine\n" +
                        "Silidianin"
            }
            "Smilax sarsaparilla (Sarsaparilla)", "Sarsaparilla (Smilax sarsaparilla)" -> {
                text = "• Resins\n" +
                        "• Saponin glycosides:\n" +
                        "Paralinic acid\n" +
                        "Pollinastanol\n" +
                        "Salesparin\n" +
                        "Sarsaparillin\n" +
                        "Sarsapgenin\n" +
                        "Sarsaponin\n" +
                        "Sitosterol\n" +
                        "Sitosterol-d glycoside\n" +
                        "Smilacin\n" +
                        "Smilgenin\n" +
                        "Stigmasterol\n" +
                        "• Starch"
            }
            "Spilanthes acmella (Paracress)", "Paracress (Spilanthes acmella)" -> {
                text = "• Isobutylamides"
            }
            "Stellaria media (Chickweed)", "Chickweed (Stellaria media)" -> {
                text = "• B-carboline alkaloids:\n" +
                        "Harman\n" +
                        "Norharman\n" +
                        "• Coumarins:\n" +
                        "Chicoriin\n" +
                        "Esculetin\n" +
                        "Esculin\n" +
                        "Umbelliferone\n" +
                        "Scopoletin\n" +
                        "• Inulin\n" +
                        "• Sesquiterpene lactones:\n" +
                        "Lactucin\n" +
                        "Lactupicrin"
            }
            "Sticta pulmonaria (Lungwort)", "Lungwort (Sticta pulmonaria)" -> {
                text = "• Iron\n" +
                        "• Silicic acid\n" +
                        "• Tannin\n" +
                        "• Vitamin C"
            }
            "Stillingia sylvatica (Queen's root)", "Queen's root (Stillingia sylvatica)" -> {
                text = "• "
            }
            "Symphytum officinale (Comfrey)", "Comfrey (Symphytum officinale)" -> {
                text = "• Allantoin\n" +
                        "• Asparagine\n" +
                        "• Carotene\n" +
                        "• Choline\n" +
                        "• Muscilage, composed of a polysaccharide containing glucose and fructose\n" +
                        "• Phenolic acids:\n" +
                        "Caffeic acid\n" +
                        "Chlorogenic acid\n" +
                        "Lithospermic acid\n" +
                        "Rosmarinic acid\n" +
                        "• Pyrrolizidine alkaloids (hepatotoxic in aminals but these alkaloids are usually not found in commercial samples):\n" +
                        "Echimidine\n" +
                        "Lycopsamine\n" +
                        "Symlandine\n" +
                        "Symphytine\n" +
                        "• Protein\n" +
                        "• Steroidal saponins\n" +
                        "• Tannins\n" +
                        "• Triterpenes\n" +
                        "• Vitamin B12\n" +
                        "• Zinc"
            }
            "Symplocarpus foetida (Skunk cabbage)", "Skunk cabbage (Symplocarpus foetida)" -> {
                text = "• A fixed oil\n" +
                        "• Fat\n" +
                        "• Salts of lime, silica, iron, and manganese\n" +
                        "• Starch\n" +
                        "• Volatile oil\n" +
                        "• Wax"
            }
            "Tabebuia impetiginosa (Pau d' arco)", "Pau d' arco (Tabebuia impetiginosa)" -> {
                text = "• Labachol\n" +
                        "• Lapachenole\n" +
                        "• Quercetin\n" +
                        "• Quinones:\n" +
                        "• Naphthoquinone\n" +
                        "• Anthraquinones"
            }
            "Tanacetum parthenium) (Feverfew)", "Feverfew (Tanacetum parthenium)" -> {
                text = "• Chrysanthemonin, a dimeric germacranolide\n" +
                        "• Essential oils:\n" +
                        "Alpha-pinene\n" +
                        "Beta-farnesine\n" +
                        "Bornyl acetate\n" +
                        "Bornyl angelate\n" +
                        "Costic acid\n" +
                        "L-borneol\n" +
                        "L-camphor\n" +
                        "Spiroketal enol esters\n" +
                        "Terpenes\n" +
                        "• Esters:\n" +
                        "3Beta-hydroxyparthenolide\n" +
                        "3Betal-hydroxycostunolide\n" +
                        "8Alpha-hydroxyestafiatin\n" +
                        "Artemorin and its epoxide\n" +
                        "Parthenolide\n" +
                        "Reynosin\n" +
                        "• Parthenolide, a sesquiterpene lactone\n" +
                        "• Sesquiterpene lactones"
            }
            "Taraxacum officinale (Dandelion, Lion's tooth)", "Dandelion (Taraxacum officinale)" -> {
                text = "• Calcium\n" +
                        "• Chlorophyll\n" +
                        "• Choline\n" +
                        "• Copper\n" +
                        "• Fatty acids\n" +
                        "• Flavonoids - apigenin 7-O-glucoside, luteolin 7-O-glucoside\n" +
                        "• Inulin and levulin - regulates blood sugar\n" +
                        "• Iron\n" +
                        "• Manganese\n" +
                        "• Pectin\n" +
                        "• Phosphorus\n" +
                        "• Potassium\n" +
                        "• Resin\n" +
                        "• Riboflavin\n" +
                        "• Silicon\n" +
                        "• Taraxacin - a bitter\n" +
                        "• Taraxanthin - a carotenoid pigment\n" +
                        "• Taraxerol and taraxasterol - two phytosterols\n" +
                        "• Vitamin A\n" +
                        "• Vitamin B-complex\n" +
                        "• Vitamin C\n" +
                        "• Vitamin D\n" +
                        "• Vitamin K\n" +
                        "• Zinc"
            }
            "Taxus brevifolia (Yew)", "Yew (Taxus brevifolia)" -> {
                text = "• Alkaloids including:\n" +
                        "Taxine\n" +
                        "Taxagifine\n" +
                        "• Benzenoids\n" +
                        "• Diterpenes including paclitaxel, sold under the name Taxol\n" +
                        "• Enzymes\n" +
                        "• Flavonoids\n" +
                        "• Glycosides\n" +
                        "• Lignans including isotaxiresinol"
            }
            "Thuja plicata, occidentalis (Western cedar)", "Western cedar (Thuja plicata, occidentalis)" -> {
                text = "• Flavonoids\n" +
                        "• Mucilage\n" +
                        "• Tannins\n" +
                        "• Volatile oil containing:\n" +
                        "• Borneol\n" +
                        "• Borny acetate\n" +
                        "• Camphor\n" +
                        "• Isothujone\n" +
                        "• l-a-thujene\n" +
                        "• l-fenchone\n" +
                        "• Limonen\n" +
                        "• Sabinene\n" +
                        "• Thujone"
            }
            "Thymus vulgaris (Thyme)", "Thyme (Thymus vulgaris)" -> {
                text = "• Caffeic acid\n" +
                        "• Flavonoids:\n" +
                        "Apigenin\n" +
                        "Luteolin\n" +
                        "Naringenin\n" +
                        "Thymonin\n" +
                        "• Iron\n" +
                        "• Labiatic acid\n" +
                        "• Tannins\n" +
                        "• Volatile oil:\n" +
                        "1,8-cineole\n" +
                        "a-pinene\n" +
                        "Borneol\n" +
                        "Bornyl and linalyl acetate\n" +
                        "Carvacrol\n" +
                        "Geraniol\n" +
                        "Linalool\n" +
                        "Thymol\n" +
                        "Thymol methyl ether"
            }
            "Tilia europaea (Linden flower, Lime blossom)", "Linden flower (Tilia europaea)" -> {
                text = "• Coumarin fraxoside\n" +
                        "• Flavonoids:\n" +
                        "Astralagin\n" +
                        "Hesperidin\n" +
                        "Quercitin\n" +
                        "Tiliroside\n" +
                        "• Mucilage\n" +
                        "• Phenolic acids:\n" +
                        "Caffeic acid\n" +
                        "Chlorogenic acid\n" +
                        "• Tannins\n" +
                        "• Vanillin\n" +
                        "• Volatile oil containing farnesol"
            }
            "Trifollium pratense (Red clover)", "Red clover (Trifollium pratense)" -> {
                text = "• Coumarin, a lactone glycoside with an anticoagulant action\n" +
                        "• Isoflavones:\n" +
                        "• Biochanin A\n" +
                        "• Daidzein\n" +
                        "• Genistein\n" +
                        "• Resins\n" +
                        "• Tannins"
            }
            "Trigonella foenum-graecum (Fenugreek)", "Fenugreek (Trigonella foenum-graecum)" -> {
                text = "• Alkaloids:\n" +
                        "Carpaine\n" +
                        "Gentianine\n" +
                        "Trigoneline\n" +
                        "• Calcium\n" +
                        "• Flavonoids:\n" +
                        "Isovitexin\n" +
                        "Luteolin\n" +
                        "Orientin\n" +
                        "Quercetin\n" +
                        "Vicenins 1 and 2\n" +
                        "Vitexin\n" +
                        "• Iron\n" +
                        "• Mucilage, mainly galactomannan\n" +
                        "• Steroidal saponin, diosgenine and its isomers:\n" +
                        "Gitogenin\n" +
                        "Tigogenin\n" +
                        "Yamogenin\n" +
                        "• Vitamin A\n" +
                        "• Thiamine (vitamin B1)\n" +
                        "• Vitamin C\n" +
                        "• Volatile oil containing:\n" +
                        "3-hydroxy-4,5-dimethyl-2-furanone\n" +
                        "e-muurolene\n" +
                        "B-elemene\n" +
                        "B-selinene\n" +
                        "Dihydroactinidiolide\n" +
                        "Dihydrobenzofuran"
            }
            "Trillium erectum (Beth root)", "Beth root (Trillium erectum)" -> {
                text = "• Saponin glycosides:\n" +
                        "Trillarin\n" +
                        "Trillin"
            }
            "Tussilago farfara (Colt's foot)", "Colt's foot (Tussilago farfara)" -> {
                text = "• Alkaloid:\n" +
                        "Pyrrolizidine\n" +
                        "• Bitter glucoside\n" +
                        "• Flavonoids:\n" +
                        "Hyperoside\n" +
                        "Isoquercetin\n" +
                        "Rutin\n" +
                        "• Mucilage\n" +
                        "• Resin\n" +
                        "• Tussilagone\n" +
                        "• Volatile oil"
            }
            "Ulmus fulva (Slippery elm, American elm)", "Slippery elm (Ulmus fulva)" -> {
                text = "• Amino acids\n" +
                        "• Bromine\n" +
                        "• Calcium\n" +
                        "• Iodine\n" +
                        "• Mainly mucilage\n" +
                        "• Starch\n" +
                        "• Sugar\n" +
                        "• Tannin\n" +
                        "• Traces of manganese and zinc"
            }
            "Urtica urens (Nettles)", "Nettles (Urtica urens)" -> {
                text = "• Chlorophyll\n" +
                        "• Formic acid (major constituent)\n" +
                        "• Histamine\n" +
                        "• Iron\n" +
                        "• Minerals\n" +
                        "• Plant enzymes"
            }
            "Usnea spp. (Old man's beard)", "Old man's beard (Usnea spp.)" -> {
                text = "• Limited data"
            }
            "Vaccinium myrtillus (Bilberry)", "Bilberry (Vaccinium myrtillus)" -> {
                text = "• Anthocyanosides:\n" +
                        "Myrtillin (a component that lowers blood glucose)\n" +
                        "• Citric acid\n" +
                        "• Malic acid\n" +
                        "• Vitamin C"
            }
            "Valeriana officinalis (Valerian)", "Valerian (Valeriana officinalis)" -> {
                text = "• a-Kessyl alcohol\n" +
                        "• Alkaloids:\n" +
                        "Actinidine\n" +
                        "Valerine\n" +
                        "Valerianine\n" +
                        "Chatinine\n" +
                        "• Bornyl acetate\n" +
                        "• Bornyl isovalerate\n" +
                        "• Choline\n" +
                        "• Citronellyl isovalerate\n" +
                        "• Eugenyl and esoeugenyl isovalerate\n" +
                        "• Faurinone\n" +
                        "• Faurinols\n" +
                        "• Flavonoids\n" +
                        "• Hydroxyvalerenic acid\n" +
                        "• Iridoids known as valepotriates:\n" +
                        "Acevaltrate\n" +
                        "Deacetylisovaltrate\n" +
                        "Didrovaltrate\n" +
                        "Homodivaltrate\n" +
                        "Homovaltrate\n" +
                        "Isovaltrate\n" +
                        "Valechlorine\n" +
                        "Valeridine\n" +
                        "Valtrate\n" +
                        "• Isovaleric acid\n" +
                        "• Sterols\n" +
                        "• Tannins\n" +
                        "• Valerenal\n" +
                        "• Valerenone\n" +
                        "• Volatile oil containing:\n" +
                        "Valerenic acid"
            }
            "Verbascum thapsus (Mullein)", "Mullein (Verbascum thapsus)" -> {
                text = "• Acid saponin\n" +
                        "• Amaroid\n" +
                        "• Bitter\n" +
                        "• Gum\n" +
                        "• Mucilage\n" +
                        "• Resins\n" +
                        "• Volatile oil"
            }
            "Verbena officinalis (Vervain)", "Vervain (Verbena officinalis)" -> {
                text =
                    "• Glycoside iridoide monoterpenes including verbenalin, verbenin and bastatoside\n" +
                            "• Tannin\n" +
                            "• Flavonoids including hispidulin, jaceosidin and nepetin\n" +
                            "• Mucilage\n" +
                            "• Essential oil, beta-myrcene"
            }
            "Viburnum opulus (Cramp bark)", "Cramp bark (Viburnum opulus)" -> {
                text = "• Bitter principle\n" +
                        "• Scopoletin - a uterine and small muscle antispasmodic\n" +
                        "• Valeric acid\n" +
                        "• Viburnin"
            }
            "Viscum alba (Mistletoe)", "Mistletoe (Viscum alba)" -> {
                text = "• Amines of beta-phenylamine choline, tyramine\n" +
                        "• Flavonoids:\n" +
                        "Quercetin-derived\n" +
                        "• Glycoproteins:\n" +
                        "Lectins I, II, III\n" +
                        "Vicumin\n" +
                        "• Histamine\n" +
                        "• Mucilage\n" +
                        "• Phenylcarboxylic acids:\n" +
                        "Caffeic\n" +
                        "Gentisic\n" +
                        "• Resin\n" +
                        "• Triterpenoid saponins\n" +
                        "• Viscotoxins I, II, III, - a cardioactive polypeptides"
            }
            "Vitex agnus castus (Chaste tree, Monk's pepper)", "Chaste tree (Vitex agnus castus)" -> {
                text = "• Castine, a bitter\n" +
                        "• Flavonoids\n" +
                        "• Glycosides\n" +
                        "• Possible alkaloids\n" +
                        "• Volatile oil"
            }
            "Withania somnifera (Ashwagandha)", "Ashwagandha (Withania somnifera)" -> {
                text = "• Ashwagandholine, an alkaloid\n" +
                        "• Withaferin A, has significant antitumor and radiosensitizing effects in experimental tumors of animals in vivo, without any noticeable systemic toxicity\n" +
                        "• Withanolides, steroidal compounds whose action and appearance resemble the active constituents of Asian ginseng (Panax ginseng) known as ginsenosides"
            }
            "Yucca spp. (Yucca)", "Yucca (Yucca spp.)" -> {
                text = "• Aglycones:\n" +
                        "Kammogenin\n" +
                        "Yuccagenin\n" +
                        "• Saponin"
            }
            "Zanthoxylum clava-herculis (Southern prickly ash)", "Southern prickly ash (Zanthoxylum clava-herculis)" -> {
                text = "• Alkaloids:\n" +
                        "B-fagarine\n" +
                        "Candicine\n" +
                        "Chelerythrine\n" +
                        "Gamma-fagarine\n" +
                        "Laurifoline\n" +
                        "Magnoflorine\n" +
                        "Nitidine\n" +
                        "Tambetarine\n" +
                        "• Amides:\n" +
                        "Herculin\n" +
                        "Neoherculin, which is identical to the echinacein found in Echinacea angustifolia\n" +
                        "• Asarinin, a lignan\n" +
                        "• Resins\n" +
                        "• Tannins\n" +
                        "• Volatile oil"
            }
            "Zea mays (Corn silk)", "Corn silk (Zea mays)" -> {
                text = "• Allantoin\n" +
                        "• Anthocyanins\n" +
                        "• Calcium\n" +
                        "• Cryptoxanthin\n" +
                        "• Glycoproteins\n" +
                        "• Plant acids\n" +
                        "• Potassium\n" +
                        "• Saponins\n" +
                        "• Sterols:\n" +
                        "Beta-sitosterol\n" +
                        "Stigmasterol\n" +
                        "• Sugars\n" +
                        "• Vitamin C\n" +
                        "• Vitamin K"
            }
            "Zingiber officinale (Ginger)", "Ginger (Zingiber officinale)" -> {
                text = "• Lipids:\n" +
                        "• Free fatty acids\n" +
                        "• Lecithins\n" +
                        "• Phophatidic acid\n" +
                        "• Triglycerides\n" +
                        "• Protein\n" +
                        "• Resin\n" +
                        "• Starch\n" +
                        "• Vitamin A\n" +
                        "• Vitamin B3 (Niacin)\n" +
                        "• Volatile oils:\n" +
                        "• Borneol\n" +
                        "• Cineole\n" +
                        "• Gingerol\n" +
                        "• Phellandrene\n" +
                        "• Shogoal, an aleoresin having an aromatic ketone form, found with volatile oils\n" +
                        "• Zingiberene\n" +
                        "• Zingiberole, an oleoresin having an aromatic ketone form, found in volatile oils"
            }
        }
        ss = SpannableString(text)

        createLink(ss, "amino acids", text.lowercase(), "Supplement", "Amino Acids")
        createLink(ss, "biotin", text.lowercase(), "Vitamin", "Biotin")
        createLink(ss, "bioflavonoids", text.lowercase(), "Supplement", "Bioflavonoids")
        createLink(ss, "beta carotene", text.lowercase(), "Vitamin", "Beta Carotene (Carotenoids)")
        createLink(ss, "calcium", text.lowercase(), "Vitamin", "Calcium")
        createLink(ss, "copper", text.lowercase(), "Vitamin", "Copper")
        createLink(ss, "choline", text.lowercase(), "Vitamin", "Choline (Lecithin)")
        createLink(ss, "carotene", text.lowercase(), "Vitamin", "Beta Carotene (Carotenoids)")
        createLink(ss, "folic acid", text.lowercase(), "Vitamin", "Folate (Folic Acid)")
        createLink(ss, "flavonoids", text.lowercase(), "Supplement", "Bioflavonoids")
        createLink(ss, "iron", text.lowercase(), "Vitamin", "Iron")
        createLink(ss, "iodine", text.lowercase(), "Vitamin", "Iodine")
        createLink(ss, "linoleic and linolenic acids", text.lowercase(), "Fat", "")
        createLink(ss, "niacin", text.lowercase(), "Vitamin", "Vitamin B3 (Niacin)")
        createLink(ss, "magnesium", text.lowercase(), "Vitamin", "Magnesium")
        createLink(ss, "manganese", text.lowercase(), "Vitamin", "Manganese")
        createLink(ss, "phosphorus", text.lowercase(), "Vitamin", "Phosphorus")
        createLink(ss, "potassium", text.lowercase(), "Vitamin", "Potassium")
        createLink(ss, "riboflavin", text.lowercase(), "Vitamin", "Vitamin B2 (Riboflavin)")
        createLink(ss, "silicon", text.lowercase(), "Vitamin", "Silicon")
        createLink(ss, "sodium", text.lowercase(), "Vitamin", "Sodium")
        createLink(ss, "thiamine", text.lowercase(), "Vitamin", "Vitamin B1 (Thiamine)")
        createLink(ss, "vitamin b12", text.lowercase(), "Vitamin", "Vitamin B12 (Cobalamin)")
        createLink(ss, "vitamin c", text.lowercase(), "Vitamin", "Vitamin C (Ascorbic Acid)")
        createLink(ss, "vitamin b3", text.lowercase(), "Vitamin", "Vitamin B3 (Niacin)")
        createLink(ss, "vitamin b2", text.lowercase(), "Vitamin", "Vitamin B2 (Riboflavin)")
        createLink(ss, "vitamin b1", text.lowercase(), "Vitamin", "Vitamin B1 (Thiamine)")
//        createLink(ss,"vitamin b complex",text.lowercase(),"Vitamin","")
        createLink(ss, "vitamin d", text.lowercase(), "Vitamin", "Vitamin D (Cholecalciferol)")
        createLink(ss, "vitamin a", text.lowercase(), "Vitamin", "Vitamin A (Retinol)")
        createLink(ss, "vitamin k", text.lowercase(), "Vitamin", "Vitamin K (Quinones)")
        createLink(ss, "vitamin e", text.lowercase(), "Vitamin", "Vitamin E (Tocopherol)")
        createLink(ss, "vanadium", text.lowercase(), "Vitamin", "Vanadium")
        createLink(ss, "vitamin b12", text.lowercase(), "Vitamin", "")
        createLink(ss, "quercetin", text.lowercase(), "Supplement", "Quercetin")
        createLink(ss, "zinc", text.lowercase(), "Vitamin", "Zinc")
//        createLink(ss,"B complex",text.lowercase(),"Vitamin","")

        binding.contentData.text = ss
    }

    private fun setDrugDetail(heading: String) {
        binding.subHeading.text = "Drug/Nutrient Interaction:"
        var text = ""
        when (heading) {
            "Achillea millefolium (Yarrow)", "Yarrow (Achillea millefolium)" -> {
                text =
                    "• Counterproductive to use medications that inhibit stomach acid production, ie antacids, gastric acid secretion inhibitors and histamine H2 receptor antagonists, since yarrow promotes stomach acid secretion"
            }
            "Aconitum napellus (Monkshood, Aconite)", "Monkshood (Aconitum napellus)" -> {
                text = "• No interactions have been reported"
            }
            "Acorus calamus (Sweetflag, Acorus)", "Sweetflag (Acorus calamus)" -> {
                text =
                    "• Counterproductive to use medications that inhibit stomach acid production, ie antacids, gastric acid secretion inhibitors and histamine H2 receptor antagonists, since calamus promotes stomach acid secretion"
            }
            "Aesculus hippocastanum (Horsechestnut)", "Horsechestnut (Aesculus hippocastanum)" -> {
                text =
                    "• Aspirin or anticoagulants interact with aesculin, the antithrombin constituent, causing increased bleeding"
            }
            "Agrimonia eupatorium (Agrimony)", "Agrimony (Agrimonia eupatorium)" -> {
                text = "• Insulin levels should be monitored due to the hypoglycemic activity"
            }
            "Alchemilla vulgaris (Lady's mantle)", "Lady's mantle (Alchemilla vulgaris)" -> {
                text = "• Antagonizes pitocin"
            }
            "Aletris farinosa (True unicorn)", "True unicorn (Aletris farinosa)" -> {
                text = "• Antagonizes pitocin in contracting uterine muscle\n" +
                        "• Narcotic, emetic and cathartic in large doses of fresh root"
            }
            "Allium sativum (Garlic)", "Garlic (Allium sativum)" -> {
                text = "• Insulin dosage should be monitored due to the hypoglycemic activity\n" +
                        "• Warfarin's anticoagulant effect is increased due to the fibrinolytic activity of allicin, trisulfides, ajoene and adenosine"
            }
            "Althea officinalis (Marshmallow)", "Marshmallow (Althea officinalis)" -> {
                text =
                    "• Anti-inflammatory activity potentiates the effects of topical steroids\n" +
                            "• Oral drugs or herbs taken with marshmallow may have delayed absorption due to the mucilage content"
            }
            "Ammi visnaga(Khella)", "Khella (Ammi visnaga)" -> {
                text = "• Digitoxin toxicity is decreased by visnadin"
            }
            "Angelica sinensis (Dong quai)", "Dong quai (Angelica sinensis)" -> {
                text = "• No interactions have been reported"
            }
            "Arctium lappa (Burdock)", "Burdock (Arctium lappa)" -> {
                text = "• Insulin should be monitored due to the hypoglycemic activity"
            }
            "Arctostaphylos uva ursi (Bearberry)", "Bearberry (Arctostaphylos uva ursi)" -> {
                text =
                    "• Urinary acidifer drugs inhibit conversion of arbutin to the active form, hydroquinone, decreasing the effectiveness of bearberry"
            }
            "Armoracia rusticana (Horseradish)", "Horseradish (Armoracia rusticana)" -> {
                text =
                    "• Counterproductive to use medications that inhibit stomach acid production, ie antacids, gastric acid secretion inhibitors and histamine H2 receptor antagonists, since horseradish promotes stomach acid secretion"
            }
            "Asclepias tuberosa (Pleurisy root)", "Pleurisy root (Asclepias tuberosa)" -> {
                text = "• May enhance the effect of digitaloid glycosides"
            }
            "Astragalus membranaceus (Milk vetch)", "Milk vetch (Astragalus membranaceus)" -> {
                text = "• No interactions have been reported"
            }
            "Atropa belladonna (Belladonna)", "Belladonna (Atropa belladonna)" -> {
                text = "• Limited data"
            }
            "Avena sativa (Oats)", "Oats (Avena sativa)" -> {
                text = "• Antagonizes the antinociceptive effect of morphine\n" +
                        "• Antagonizes the hypertensive response to nicotine in animal studies\n" +
                        "• Hydrocolloidal fiber of oats may slow absorption of oral drugs"
            }
            "Baptisia tintoria (Wild indigo)", "Wild indigo (Baptisia tintoria)" -> {
                text = "• Limited data"
            }
            "Barosma betulina (Buchu)", "Buchu (Barosma betulina)" -> {
                text = "• Acute genitourinary tract inflammation\n" +
                        "• Pregnancy due to the mucosal irritant property"
            }
            "Berberis vulgaris (Barberry)", "Barberry (Berberis vulgaris)" -> {
                text =
                    "• Counterproductive to use medications that inhibit stomach acid production, ie antacids, gastric acid secretion inhibitors and histamine H2 receptor antagonists, since Berberis promotes stomach acid secretion\n" +
                            "• May interfere with vitamin B metabolism"
            }
            "Bryonia alba(Bryony)", "Bryony (Bryonia alba)" -> {
                text = "• Limited data"
            }
            "Bupleurum chinense (Thoroughwax)", "Thoroughwax (Bupleurum chinense)" -> {
                text = "• Limited data"
            }
            "Calendula officinalis (Marigold)", "Marigold (Calendula officinalis)" -> {
                text =
                    "• Increases hexobarbital sleeping time associated with sedative action of hydroalcoholic extracts in animal studies"
            }
            "Camellia sinensis (Green tea)", "Green tea (Camellia sinensis)" -> {
                text = "• Limited data"
            }
            "Capsicum frutescens (Cayenne, Red pepper)", "Cayenne (Capsicum frutescens)" -> {
                text =
                    "• ACE inhibitors may cause coughing when capsaicin cream is used topically\n" +
                            "• Aspirin damage to the gastric mucosa is decreased if chili powder is ingested 30 minutes before taking aspirin\n" +
                            "• Hexobarbital sleeping time and plasma concentration are increased with acute use of cayenne but decreased with chronic use in animal studies\n" +
                            "• Theophylline absorption is increased if taken before or concurrently with capsicum fruit in animal studies"
            }
            "Caulophyllum thalictroides (Blue cohosh)", "Blue cohosh (Caulophyllum thalictroides)" -> {
                text = "• Limited data"
            }
            "Centella asiatica (Gota kola)", "Gota kola (Centella asiatica)" -> {
                text = "• Limited data"
            }
            "Chamaelirium luteum (False unicorn)", "False unicorn (Chamaelirium luteum)" -> {
                text = "• Limited data"
            }
            "Chelidonium majus (Celandine)", "Celandine (Chelidonium majus)" -> {
                text = "• Limited data"
            }
            "Chimaphilia umbellata (Pipsissewa)", "Pipsissewa (Chimaphilia umbellata)" -> {
                text = "• Limited data"
            }
            "Chionanthus virginicus (Fringe tree)", "Fringe tree (Chionanthus virginicus)" -> {
                text = "• Limited data"
            }
            "Cimicifuga racemosa (Black cohosh)", "Black cohosh (Cimicifuga racemosa)" -> {
                text = "• May prolong the hypnotic action of barbiturates"
            }
            "Cinnamomum spp. (Cinnamon)", "Cinnamon (Cinnamomum spp.)" -> {
                text = "• Limited data"
            }
            "Collinsonia canadensis (Stone root)", "Stone root (Collinsonia canadensis)" -> {
                text = "• Limited data"
            }
            "Commiphora molmol (Myrrh)", "Myrrh (Commiphora molmol)" -> {
                text = "• Water will cause myrrh to precipitate"
            }
            "Commiphora mukul (Guggulu)", "Guggulu (Commiphora mukul)" -> {
                text = "• Limited data"
            }
            "Corydalis bulbosa (Corydalis)", "Corydalis (Corydalis bulbosa)" -> {
                text = "• Limited data"
            }
            "Crataegus oxycantha (Hawthorne)", "Hawthorne (Crataegus oxycantha)" -> {
                text =
                    "• Enhances the effects of digitalis, g-strophanthin, the cardiac herbs, Convallaria majalis and Adonis vernalis, and the cardiac glycosides, digitoxin and digoxin, due to the polymeric procyanidins"
            }
            "Curcuma longa (Tumeric)", "Tumeric (Curcuma longa)" -> {
                text =
                    "• Solid alcohol extract reduces frequency of duodenal and gastric ulcers caused by indomethacin and reserpine"
            }
            "Cynara scolymus (Artichoke)", "Artichoke (Cynara scolymus)" -> {
                text = "• No interactions have been reported"
            }
            "Datura stramonium (Jimson weed, Thornapple)", "Jimson weed (Datura stramonium)" -> {
                text = "• Patients on antidepressant drugs should avoid Datura"
            }
            "Dioscorea villosa (Wild yam)", "Wild yam (Dioscorea villosa)" -> {
                text = "• Limited data"
            }
            "Echinacea angustifolia (Purple cone flower)", "Purple cone flower (Echinacea angustifolia)" -> {
                text =
                    "• Reduces recurrence rate of vaginal candidiasis when used with econazole nitrate cream locally"
            }
            "Eleutherococcus senticosus (Siberian ginseng)", "Siberian ginseng (Eleutherococcus senticosus)" -> {
                text =
                    "• Enhances monomycin and kanamycin efficacy in treating Shigella dysentery and Proteus entercolitis\n" +
                            "• Inhibits breakdown of hexobarbital in animal studies\n" +
                            "• Insulin should be monitored due to the hypoglycemic activity"
            }
            "Ephedra sinica (Ma huang)", "Ma huang (Ephedra sinica)" -> {
                text = "• Amitriptyline blocks the hypertensive effect of ephedrine\n" +
                        "• Decreases the effect of dexamethasone\n" +
                        "• Methyl xanthines, including caffeine and theophylline, taken concurrently with ephedrine produce increased thermogenesis resulting in decrease of body fat\n" +
                        "• Monoamine oxidase inhibitors, including tranylcypromine, phenelzine, selegiline and moclobemide, taken concurrently with ephedrine can elevate blood pressure\n" +
                        "• Reserpine antagonizes indirect sympathomimetic effects of ephedrine, including hypertension and mydriasis\n" +
                        "• Urinary acidifiers, includig ammonium chloride, increase the rate of ephedrine and pseudoephedrine excretion\n" +
                        "• Urinary alkalinizers, including sodium bicarbonate, decrease the rate of ephedrine and pseudoephedrine excretion"
            }
            "Equisetum arvense (Shave grass, Horsetail)", "Shave grass (Equisetum arvense)" -> {
                text =
                    "• Diuretic effect can cause loss of potassium and may potentiate the toxic effects of digitalis and its cardiac glycosides\n" +
                            "• Promotes the breakdown of thaimine"
            }
            "Eriodictyon californicum (Yerba santa)", "Yerba santa (Eriodictyon californicum)" -> {
                text = "• Limited data"
            }
            "Eschscholzia californica (California poppy)", "California poppy (Eschscholzia californica)" -> {
                text =
                    "• May enhance monoamine oxidase inhibitors due to inhibition of MAO-B by hydroalcoholic extracts\n" +
                            "• Tincture enhances the hypnotic effect of pentabarbital due to the alkaloids"
            }
            "Euphrasia officinalis (Eyebright)", "Eyebright (Euphrasia officinalis)" -> {
                text = "• Limited data"
            }
            "Filipendula ulmaria (Meadowsweet)", "Meadowsweet (Filipendula ulmaria)" -> {
                text = "• Limited data"
            }
            "Foeniculum v• ulgare (Fennel)", "Fennel (Foeniculum vulgare)" -> {
                text = "• Limited data"
            }
            "Fucus vesiculosus (Bladderwrack, Kelp)", "Bladderwrack (Fucus vesiculosus)" -> {
                text = "• Lithium carbonate enhances large doses of iodides found in bladderwrack"
            }
            "Galium aparine (Cleavers, Bed straw)", "Cleavers (Galium aparine)" -> {
                text = "• No interactions have been reported"
            }
            "Gelsemium sempervirens (Yellow jasmine, Gelsemium)", "Yellow jasmine (Gelsemium sempervirens)" -> {
                text = "• Limited data"
            }
            "Gentiana lutea (Gentian)", "Gentian (Gentiana lutea)" -> {
                text =
                    "• Counterproductive to use medications that inhibit stomach acid production, ie antacids, gastric acid secretion inhibitors and histamine H2 receptor antagonists, since gentian promotes stomach acid secretion"
            }
            "Geranium maculatum (Wild geranium, Cranesbill)", "Wild geranium (Geranium maculatum)" -> {
                text = "• Limited data"
            }
            "Ginkgo biloba (Ginkgo)", "Ginkgo (Ginkgo biloba)" -> {
                text =
                    "• Aspirin and ginkgo taken concurrently may produce spontaneous bleeding due to reduced platelet aggretion activity\n" +
                            "• Potentiates papaverine penile injections for impotence"
            }
            "Glycyrrhiza glabra (Licorice)", "Licorice (Glycyrrhiza glabra)" -> {
                text =
                    "• Corticoid treatment - glycyrrhizin interferes with 5 beta-reductase breakdown of corticosteroids, thus prolonging its biological half-life\n" +
                            "• Potentiates hypokalemia and sodium retention when used with insulin\n" +
                            "• Potentiates potassium loss when used with diuretics like thiazides\n" +
                            "• Potentiates potassium loss when used with stimulant laxatives\n" +
                            "• Potentiates the activity of anthraquinone drugs or herbs containing anthraquinones\n" +
                            "• Potentiates the toxicity of cardiac glycosides like digitalis due to potassium loss in the urine\n" +
                            "• Reduces ulcer formation caused by aspirin intake"
            }
            "Grindelia camporum (Gumweed)", "Gumweed (Grindelia camporum)" -> {
                text = "• Limited data"
            }
            "Gymnema sylvestre (Gymnema)", "Gymnema (Gymnema sylvestre)" -> {
                text =
                    "• Glibenclamide and tolbutamide effects were enhanced in non-insulin dependent diabetics\n" +
                            "• Insulin must be monitored due to the insulin-lowering effects"
            }
            "Hamamelis virginiana (Witch hazel)", "Witch hazel (Hamamelis virginiana)" -> {
                text = "• Limited data"
            }
            "Harpagophytum procumbens (Devil's claw, Grapple plant)", "Devil's claw (Harpagophytum procumbens)" -> {
                text = "• Limited data"
            }
            "Humulus lupulus (Hops)", "Hops (Humulus lupulus)" -> {
                text =
                    "• In animal studies, hops potentiates pentobarbital leading to increased sleep duration"
            }
            "Hydrastis canadensis (Goldenseal)", "Goldenseal (Hydrastis canadensis)" -> {
                text = "• May deplete B vitamins"
            }
            "Hypericum perforatum (St. John's wort)", "Saint John's wort (Hypericum perforatum)" -> {
                text =
                    "• Avoid all food and medications known to have a negative interaction with MAO-inhibiting drugs:\n" +
                            "Beer\n" +
                            "Cheeses\n" +
                            "L-dopa\n" +
                            "Pickled herring\n" +
                            "Wine\n" +
                            "Yeast\n" +
                            "• Effect of reserpine is antagonized\n" +
                            "• Sleeping time of alcohol is enhanced\n" +
                            "• Monitor closely when using with selective serotonin reuptake inhibitors, including fluoxetine"
            }
            "Hyssopus officinalis (Hyssop)", "Hyssop (Hyssopus officinalis)" -> {
                text = "• Limited data"
            }
            "Inula helenium (Elecampane)", "Elecampane (Inula helenium)" -> {
                text = "• Limited data"
            }
            "Juniperis communis (Juniper)", "Juniper (Juniperis communis)" -> {
                text =
                    "• Oral hypoglycemic medications or insulin users should monitor insulin levels regularly due to the hypoglycemic effect of juniper berries"
            }
            "Larrea tridentata (Chapparrel, Creosote bush, Creosotum)", "Chapparrel (Larrea tridentata)" -> {
                text = "• Limited data"
            }
            "Lavendula angustifolia (Lavender)", "Lavender (Lavendula angustifolia)" -> {
                text = "• Limited data"
            }
            "Leonurus cardiaca (Motherwort)", "Motherwort (Leonurus cardiaca)" -> {
                text = "• Limited data"
            }
            "Ligusticum porteri (Osha)", "Osha (Ligusticum porteri)" -> {
                text = "• Limited data"
            }
            "Linum usitatissimum (Flax, Linseed)", "Flax (Linum usitatissimum)" -> {
                text =
                    "• Oral drugs or herbs taken at the same time as flax may have delayed absorption due to the mucilage content"
            }
            "Lobelia inflata (Indian tobacco, Puke weed)", "Indian tobacco (Lobelia inflata)" -> {
                text = "• Limited data"
            }
            "Lomatium disectum (Desert parsley)", "Desert parsley (Lomatium disectum)" -> {
                text =
                    "• Coumarins found in Lomatium may may exacerbate the effect of other blood thinning agents"
            }
            "Marrubium vulgare (Horehound)", "Horehound (Marrubium vulgare)" -> {
                text = "• Limited data"
            }
            "Matricaria chamomilla (German chamomile)", "German chamomile (Matricaria chamomilla)" -> {
                text = "• Liquid extract prevents ulcers caused by ethyl alcohol\n" +
                        "• Volatile oil inhibits ulcers caused by indomethacin"
            }
            "Medicago sativa (Alfalfa)", "Alfalfa (Medicago sativa)" -> {
                text = "• Decreases the activity of warfarin due to high vitamin K content\n" +
                        "• Increases xenobiotic metabolism in the liver due to hepatic microsomal oxidase reaction"
            }
            "Melaleuca alternifolia (Tea tree)", "Tea tree (Melaleuca alternifolia)" -> {
                text = "• Limited data"
            }
            "Melissa officinalis (Lemon balm)", "Lemon balm (Melissa officinalis)" -> {
                text = "• Extract increases pentobarbital hypnotic effects\n" +
                        "• Volatile oil enhances hexobarbital narcosis"
            }
            "Mentha piperita (Peppermint)", "Peppermint (Mentha piperita)" -> {
                text = "• No interactions have been reported"
            }
            "Mitchella repens (Squawvine, Partridge berry)", "Squawvine (Mitchella repens)" -> {
                text = "• Limited data"
            }
            "Momordica charantia (Bitter melon)", "Bitter melon (Momordica charantia)" -> {
                text =
                    "• Diabetic individuals must monitor insulin - due to the hypoglycemic effect\n" +
                            "• May interact with chlorpropamide and cause an additive hypoglycemia effect"
            }
            "Nepeta cataria (Catnip)", "Catnip (Nepeta cataria)" -> {
                text = "• Prolongs sleeping time of hexobarbital due to nepetalic acid"
            }
            "Oplopanax horridum (Devil's club)", "Devil's club (Oplopanax horridum)" -> {
                text =
                    "• Insulin or oral hypoglycemic drugs should be monitored due to the hypoglycemic effect"
            }
            "Panax ginseng (Chinese ginseng, Korean ginseng)", "Chinese ginseng (Panax ginseng)" -> {
                text =
                    "• In diabetics, insulin should be monitored due to the hypoglycemic effects\n" +
                            "• Decreases anticoagulant effects of warfarin"
            }
            "Passiflora incarnata (Passionflower)", "Passionflower (Passiflora incarnata)" -> {
                text = "• Increases sleeping time of hexobarbital and pentobarbital"
            }
            "Pausinystalia yohimbe (Yohimbe)", "Yohimbe (Pausinystalia yohimbe)" -> {
                text =
                    "• Amphetamines, cocaine, ephedrine, epinephrine, chlorpromazine, promazine, chloprotixene, phenoxybenzamine and phentolamine increase toxicity of yohimbine\n" +
                            "• Clonidine and reserpine decrease anxiety caused by yohimbine\n" +
                            "• Metoprolol, penbutolol and propranolol protect against toxicity of yohimbine in animal studies\n" +
                            "• Naloxone and yohimbine taken concurrently may produce anxiety, hot and cold flashes, nausea, palpitations, increased cortisol and erections in male individuals\n" +
                            "• Never to be taken with foods or substances containing tyramine:\n" +
                            "Liver\n" +
                            "Cheese\n" +
                            "Red wine\n" +
                            "Certain decongestants\n" +
                            "• Tricyclic antidepressants, including imipramine, clomipramine and amitriptyline, and yohimbine taken concurrently may produce hypertension"
            }
            "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)", "Butterbur (Petasites hybridus)" -> {
                text = "• No interactions have been reported"
            }
            "Petroselinum crispum (Parsley)", "Parsley (Petroselinum crispum)" -> {
                text = "• Limited data"
            }
            "Phytolacca decandra (Poke)", "Poke (Phytolacca decandra)" -> {
                text = "• Limited data"
            }
            "Pimpinella anisum (Anise)", "Anise (Pimpinella anisum)\n" -> {
                text = "• Limited data"
            }
            "Piper methysticum (Kava kava)", "Kava kava (Piper methysticum)" -> {
                text = "• Can enhance CNS depressants like alprazolan and pentobarbital\n" +
                        "• Can enhance the hypnotic effect of alcohol\n" +
                        "• Decreases efficacy of levadopa"
            }
            "Piscidia piscipula (Jamaican dogwood)", "Jamaican dogwood (Piscidia piscipula)" -> {
                text = "• Limited data"
            }
            "Polygonum multiflorum (Fo-ti, He-shou-wu)", "Fo-ti (Polygonum multiflorum)" -> {
                text = "• Do not take with onions, chives or garlic - empirical\n" +
                        "• No known interactions with drugs have been reported"
            }
            "Pygeum africanum (Pygeum)", "Pygeum (Pygeum africanum)" -> {
                text = "• Limited data"
            }
            "Rhamnus frangula (Buckthorn)", "Buckthorn (Rhamnus frangula)" -> {
                text = "• May cause a decrease in oral drug absorption\n" +
                        "• May increase potency of cardiac glycosides, including Adonis, Convallaria, Digitalis, Helleborus, Strophanthus and Urginea, due to electrolyte loss\n" +
                        "• Taken concurrently with diuretics may cause hypokalemia"
            }
            "Rhamnus purshiana (Cascara)", "Cascara (Rhamnus purshiana)" -> {
                text =
                    "• May increase potency of cardiac glycosides, including Adonis, Convallaria, Digitalis, Helleborus, Strophanthus and Urginea, due to electrolyte loss\n" +
                            "• Concurrent use with diuretics may lead to electrolyte imbalances"
            }
            "Rheum officinalis (Rhubarb)", "Rhubarb (Rheum officinalis)" -> {
                text =
                    "• Prolonged use may lead to potassium depletion leading to the increased toxic effects of cardiac glycosides, including Adonis, Convallaria, Digitalis, Helleborus, Strophanthus and Urginea\n" +
                            "• Theoretically any oral drug may have reduced absorption due to decreased bowel transit time\n" +
                            "• May enhance the effects of potassium-depleting diuretics"
            }
            "Rosmarius officinalis (Rosemary)", "Rosemary (Rosmarius officinalis)" -> {
                text = "• Limited data"
            }
            "Rumex crispis (Yellow dock, Curly dock)", "Yellow dock (Rumex crispis)" -> {
                text = "• Limited data"
            }
            "Ruscus aculeatus (Butcher's broom)", "Butcher's broom (Ruscus aculeatus)" -> {
                text = "• Limited data"
            }
            "Salvia miltiorrhiza (Danshen)", "Danshen (Salvia miltiorrhiza)" -> {
                text =
                    "• Increases warfarin activity due to the ability to inhibit platelet cAMP phosphodiesterase"
            }
            "Salvia officinalis (Sage)", "Sage (Salvia officinalis)" -> {
                text = "• Limited data"
            }
            "Sambucus canadensis, nigra (Elder)", "Elder (Sambucus canadensis, nigra)" -> {
                text = "• Limited data"
            }
            "Sanguinaria canadensia (Blood root)", "Blood root (Sanguinaria canadensia)" -> {
                text = "• Limited data"
            }
            "Schisandra chinensis (Wu wei zi)", "Wu wei zi (Schisandra chinensis)" -> {
                text = "• Limited data"
            }
            "Scutellaria laterifolia (Skullcap)", "Skullcap (Scutellaria laterifolia)" -> {
                text = "• In animal studies, enhances the hypnotic effect of barbiturates\n" +
                        "• In vivo studies, acts as agonist ligand at the benzodiazepine-GABA receptor complex"
            }
            "Serenoa repens (Saw palmetto)", "Saw palmetto (Serenoa repens)" -> {
                text = "• Limited data"
            }
            "Silybum marianum (Milk thistle)", "Milk thistle (Silybum marianum)" -> {
                text =
                    "• Prevents kidney damage from cisplatin without decreasing its antitumor effectiveness\n" +
                            "• Prevents liver damage from acetaminophen\n" +
                            "• Prevents liver damage from alcohol\n" +
                            "• Prevents liver damage from butyrophenones\n" +
                            "• Prevents liver damage from dilantin\n" +
                            "• Prevents liver damage from halothane\n" +
                            "• Prevents liver damage from phenothiazines"
            }
            "Smilax sarsaparilla (Sarsaparilla)", "Sarsaparilla (Smilax sarsaparilla)" -> {
                text = "• Limited data"
            }
            "Spilanthes acmella (Paracress)", "Paracress (Spilanthes acmella)" -> {
                text = "• Limited data"
            }
            "Stellaria media (Chickweed)", "Chickweed (Stellaria media)" -> {
                text = "• Limited data"
            }
            "Sticta pulmonaria (Lungwort)", "Lungwort (Sticta pulmonaria)" -> {
                text = "• Limited data"
            }
            "Stillingia sylvatica (Queen's root)", "Queen's root (Stillingia sylvatica)" -> {
                text = "• Limited data"
            }
            "Symphytum officinale (Comfrey)", "Comfrey (Symphytum officinale)" -> {
                text = "• Limited data"
            }
            "Symplocarpus foetida (Skunk cabbage)", "Skunk cabbage (Symplocarpus foetida)" -> {
                text = "• Limited data"
            }
            "Tabebuia impetiginosa (Pau d' arco)", "Pau d' arco (Tabebuia impetiginosa)" -> {
                text = "• Limited data"
            }
            "Tanacetum parthenium) (Feverfew)", "Feverfew (Tanacetum parthenium)" -> {
                text = "• No interactions have been reported"
            }
            "Taraxacum officinale (Dandelion, Lion's tooth)", "Dandelion (Taraxacum officinale)" -> {
                text =
                    "• Counterproductive to use medications that inhibit stomach acid production, ie antacids, gastric acid secretion inhibitors and histamine H2 receptor antagonists, since dandelion root promotes stomach acid secretion\n" +
                            "• Insulin or oral hypoglycemic drugs should be monitored due to the hypoglycemic effect\n" +
                            "• May increase lithium toxicity due to the sodium excretion effect"
            }
            "Taxus brevifolia (Yew)", "Yew (Taxus brevifolia)" -> {
                text = "• Limited data"
            }
            "Thuja plicata, occidentalis (Western cedar)", "Western cedar (Thuja plicata, occidentalis)" -> {
                text = "• Limited data"
            }
            "Thymus vulgaris (Thyme)", "Thyme (Thymus vulgaris)" -> {
                text = "• Limited data"
            }
            "Tilia europaea (Linden flower, Lime blossom)", "Linden flower (Tilia europaea)" -> {
                text = "• Limited data"
            }
            "Trifollium pratense (Red clover)", "Red clover (Trifollium pratense)" -> {
                text = "• Individuals on heparin therapy should be monitored closely\n"
            }
            "Trigonella foenum-graecum (Fenugreek)", "Fenugreek (Trigonella foenum-graecum)" -> {
                text =
                    "• Delayed absorption of oral drugs due to coating of the GI tract with mucilage\n" +
                            "• Insulin levels in diabetics should be monitored due to the hypoglycemic effect"
            }
            "Trillium erectum (Beth root)", "Beth root (Trillium erectum)" -> {
                text = "• Limited data"
            }
            "Tussilago farfara (Colt's foot)", "Colt's foot (Tussilago farfara)" -> {
                text = "• Limited data"
            }
            "Ulmus fulva (Slippery elm, American elm)", "Slippery elm (Ulmus fulva)" -> {
                text = "• Limited data"
            }
            "Urtica urens (Nettles)", "Nettles (Urtica urens)" -> {
                text = "• Enhances anti-inflammatory effect of diclofenae in low doses"
            }
            "Usnea spp. (Old man's beard)", "Old man's beard (Usnea spp.)" -> {
                text = "• Limited data"
            }
            "Vaccinium myrtillus (Bilberry)", "Bilberry (Vaccinium myrtillus)" -> {
                text =
                    "• Insulin or oral hypoglycemic drugs should be monitored due to the hypoglycemic effect"
            }
            "Valeriana officinalis (Valerian)", "Valerian (Valeriana officinalis)" -> {
                text = "• Aqueous alkaline extract enhances sleeping time of thiopental\n" +
                        "• Ethanol extract prolonged thiopental anaesthesia\n" +
                        "• Valerenic acid enhances sleeping time of pentobarbital\n" +
                        "• Valepotriate-containing valerian substances may be used for benzodiazepine drug withdrawal\n" +
                        "• Valerian increases sedative effects of hypnotic drugs"
            }
            "Verbascum thapsus (Mullein)", "Mullein (Verbascum thapsus)" -> {
                text = "• Limited data"
            }
            "Verbena officinalis (Vervain)", "Vervain (Verbena officinalis)" -> {
                text = "• Limited data"
            }
            "Viburnum opulus (Cramp bark)", "Cramp bark (Viburnum opulus)" -> {
                text = "• Limited data"
            }
            "Viscum alba (Mistletoe)", "Mistletoe (Viscum alba)" -> {
                text = "• Limited data"
            }
            "Vitex agnus castus (Chaste tree, Monk's pepper)", "Chaste tree (Vitex agnus castus)" -> {
                text =
                    "• May counteract the effectiveness of birth control pills and other hormone therapy"
            }
            "Withania somnifera (Ashwagandha)", "Ashwagandha (Withania somnifera)" -> {
                text = "• No interactions have been reported"
            }
            "Yucca spp. (Yucca)", "Yucca (Yucca spp.)" -> {
                text = "• Limited data"
            }
            "Zanthoxylum clava-herculis (Southern prickly ash)", "Southern prickly ash (Zanthoxylum clava-herculis)" -> {
                text =
                    "• Counterproductive to use medications that inhibit stomach acid production, ie antacids, gastric acid secretion inhibitors and histamine H2 receptor antagonists, since prickly ash bark promotes stomach acid secretion"
            }
            "Zea mays (Corn silk)", "Corn silk (Zea mays)" -> {
                text = "• In diabetics, insulin should be monitored due to the hypoglycemic effects"
            }
            "Zingiber officinale (Ginger)", "Ginger (Zingiber officinale)" -> {
                text = "• Increases absorption of oral drugs including sulphaguanidine\n" +
                        "• Prevents vomiting caused by cyclophosphamide if taken before administration"
            }
        }
        ss = SpannableString(text)
        binding.contentData.text = ss
    }//

    private fun setContraIndicationAction(heading: String) {
        binding.subHeading.text = "Contraindications:"
        var text = ""
        when (heading) {
            "Achillea millefolium (Yarrow)", "Yarrow (Achillea millefolium)" -> {
                text = "• External use:\n" +
                        "• Contact dermatitis in sensitive individuals\n" +
                        "• Gastrointestinal inflammation:\n" +
                        "• Crohn's disease\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Ulcerative colitis\n" +
                        "• Increased central nervous system function (CNS hyperfunction)\n" +
                        "• Pregnancy:\n" +
                        "• Due to the emmenagogue and abortifacient effects"
            }
            "Aconitum napellus (Monkshood, Aconite)", "Monkshood (Aconitum napellus)" -> {
                text = "• No contraindications have been reported"
            }
            "Acorus calamus (Sweetflag, Acorus)", "Sweetflag (Acorus calamus)" -> {
                text =
                    "• Pregnancy - due to the emmenagogue effect and genotoxic property of asarone"
            }
            "Aesculus hippocastanum (Horsechestnut)", "Horsechestnut (Aesculus hippocastanum)" -> {
                text = "• Acute kidney inflammation\n" +
                        "• Bleeding disorders, due to the antithrombin activity of aesculin\n" +
                        "• Children under age 4\n" +
                        "• Gastrointestinal ulcers\n" +
                        "• Pregnancy"
            }
            "Agrimonia eupatorium (Agrimony)", "Agrimony (Agrimonia eupatorium)" -> {
                text = "• "
            }
            "Alchemilla vulgaris (Lady's mantle)", "Lady's mantle (Alchemilla vulgaris)" -> {
                text = "• None known"
            }
            "Aletris farinosa (True unicorn)", "True unicorn (Aletris farinosa)" -> {
                text =
                    "• Pregnancy - due to either depression or stimulation of animal uteri studies"
            }
            "Allium sativum (Garlic)", "Garlic (Allium sativum)" -> {
                text = "• Acute inflammation\n" +
                        "• Dehydration\n" +
                        "• Hypoglycemia\n" +
                        "• Impending surgery\n" +
                        "• Insomnia\n" +
                        "• Large amounts can decrease the uptake of iodine by the thyroid\n" +
                        "• Organ transplants\n" +
                        "• Pemphigus\n" +
                        "• Sulphur compounds of garlic may be difficult for some patients to digest"
            }
            "Althea officinalis (Marshmallow)", "Marshmallow (Althea officinalis)" -> {
                text = "• No known contraindications"
            }
            "Ammi visnaga(Khella)", "Khella (Ammi visnaga)" -> {
                text = "• May cause photodermatitis in sensitive individuals\n" +
                        "• Pregnancy due to emmenagogue and uterine stimulating activity of khellin"
            }
            "Angelica sinensis (Dong quai)", "Dong quai (Angelica sinensis)" -> {
                text = "• Gastroesophageal reflux due to the gastric stimulating effects\n" +
                        "• Pregnancy\n" +
                        "• Women with heavy menstrual flow due to the uterine vasodilatory effect"
            }
            "Arctium lappa (Burdock)", "Burdock (Arctium lappa)" -> {
                text =
                    "• Pregnancy due to the oxytocic effect and uterine stimulant action on animal uteri"
            }
            "Arctostaphylos uva ursi (Bearberry)", "Bearberry (Arctostaphylos uva ursi)" -> {
                text = "• CNS (central nervous system) hyperfunction\n" +
                        "• Gastrointestinal inflammation - Crohn's disease, IBS, ulcerative colitis\n" +
                        "• Pregnancy due to the uterine stimulants, berberine, palmatine, jatorrhizine and columbamine"
            }
            "Armoracia rusticana (Horseradish)", "Horseradish (Armoracia rusticana)" -> {
                text = "• Hypothyroidism and taking thyroxine"
            }
            "Asclepias tuberosa (Pleurisy root)", "Pleurisy root (Asclepias tuberosa)" -> {
                text =
                    "• Pregnancy due to uterine stimulation and estrogenic activity reported in animal research"
            }
            "Astragalus membranaceus (Milk vetch)", "Milk vetch (Astragalus membranaceus)" -> {
                text = "• None known"
            }
            "Atropa belladonna (Belladonna)", "Belladonna (Atropa belladonna)" -> {
                text = "• Elderly\n" +
                        "• Glaucoma\n" +
                        "• Hypertension of the globe of the eye\n" +
                        "• Keratitis with superficial vascularity\n" +
                        "• Marginal corneal ulcers\n" +
                        "• Phlyctenular keratitis after the acute inflammation"
            }
            "Avena sativa (Oats)", "Oats (Avena sativa)" -> {
                text = "• None known"
            }
            "Baptisia tintoria (Wild indigo)", "Wild indigo (Baptisia tintoria)" -> {
                text = "• Hyperemia due to the alkaloid baptitoxine\n" +
                        "• Pregnancy"
            }
            "Barosma betulina (Buchu)", "Buchu (Barosma betulina)" -> {
                text = "• Acute genitourinary tract inflammation\n" +
                        "• Pregnancy due to the mucosal irritant property"
            }
            "Berberis vulgaris (Barberry)", "Barberry (Berberis vulgaris)" -> {
                text =
                    "• Pregnancy due to the uterine stimulants, berberine, palmatine, jatorrhizine and columbamine"
            }
            "Bryonia alba(Bryony)", "Bryony (Bryonia alba)" -> {
                text = "• Pregnancy"
            }
            "Bupleurum chinense (Thoroughwax)", "Thoroughwax (Bupleurum chinense)" -> {
                text = "• None known"
            }
            "Calendula officinalis (Marigold)", "Marigold (Calendula officinalis)" -> {
                text = "• Pregnancy due to emmenagogue and abortifacient effects"
            }
            "Camellia sinensis (Green tea)", "Green tea (Camellia sinensis)" -> {
                text =
                    "• Individual may experience caffeine symptoms including nervousness, insomnia, anxiety or irritability\n" +
                            "• Lactating women due to avoid sleep disorder in infant due to caffeine\n" +
                            "• Pregnancy due to caffeine constituent"
            }
            "Capsicum frutescens (Cayenne, Red pepper)", "Cayenne (Capsicum frutescens)" -> {
                text = "• Avoid in acute inflammation"
            }
            "Caulophyllum thalictroides (Blue cohosh)", "Blue cohosh (Caulophyllum thalictroides)" -> {
                text = "• Angina\n" +
                        "• Cardiac insufficiency\n" +
                        "• Metorrhagia due to increase blood to the pelvis\n" +
                        "• Pregnancy due to uterine stimulation"
            }
            "Centella asiatica (Gota kola)", "Gota kola (Centella asiatica)" -> {
                text = "• Pregnancy due to the emmenagogue and abortifacient effects"
            }
            "Chamaelirium luteum (False unicorn)", "False unicorn (Chamaelirium luteum)" -> {
                text = "• None known"
            }
            "Chelidonium majus (Celandine)", "Celandine (Chelidonium majus)" -> {
                text = "• Children due to the potential toxicity\n" +
                        "• Pregnancy, due to the alkaloids chelidonine, sparteine, protopine, chelerythrine and berberine"
            }
            "Chimaphilia umbellata (Pipsissewa)", "Pipsissewa (Chimaphilia umbellata)" -> {
                text = "• Pregnancy"
            }
            "Chionanthus virginicus (Fringe tree)", "Fringe tree (Chionanthus virginicus)" -> {
                text = "• Bile duct obstruction\n" +
                        "• Pregnancy"
            }
            "Cimicifuga racemosa (Black cohosh)", "Black cohosh (Cimicifuga racemosa)" -> {
                text = "• First trimester of pregnancy due to emmenagogue effect\n" +
                        "• Lactation due to the irritating effect on the baby's stomach mucosa"
            }
            "Cinnamomum spp. (Cinnamon)", "Cinnamon (Cinnamomum spp.)" -> {
                text = "• Persons with a cinnamon allergy\n" +
                        "• Pregnancy due to the emmenagogue effect\n" +
                        "• Stomach or intestinal ulcers due to the carminative effect"
            }
            "Collinsonia canadensis (Stone root)", "Stone root (Collinsonia canadensis)" -> {
                text = "• None known"
            }
            "Commiphora molmol (Myrrh)", "Myrrh (Commiphora molmol)" -> {
                text = "• Acute gastric inflammation\n" +
                        "• Excessive uterine bleeding due to the emmenagogue effect\n" +
                        "• Pregnancy due to the emmenagogue and abortifacient effects"
            }
            "Commiphora mukul (Guggulu)", "Guggulu (Commiphora mukul)" -> {
                text = "• Hyperthyroidism\n" +
                        "• Pregnancy due to the emmenagogue effects"
            }
            "Corydalis bulbosa (Corydalis)", "Corydalis (Corydalis bulbosa)" -> {
                text = "• None known"
            }
            "Crataegus oxycantha (Hawthorne)", "Hawthorne (Crataegus oxycantha)" -> {
                text = "• None known"
            }
            "Curcuma longa (Tumeric)", "Tumeric (Curcuma longa)" -> {
                text = "• Bile duct obstruction due to cholagogue activity\n" +
                        "• Pregnancy due to the uterine stimulant effect"
            }
            "Cynara scolymus (Artichoke)", "Artichoke (Cynara scolymus)" -> {
                text =
                    "• Allergic hypersensitivity to artichoke or other species in the Asteracea family\n" +
                            "• Bile duct obstruction due to the cholagogue effect"
            }
            "Datura stramonium (Jimson weed, Thornapple)", "Jimson weed (Datura stramonium)" -> {
                text = "• Glaucoma\n" +
                        "• Pregnancy\n" +
                        "• Prostatic disease\n" +
                        "• Tachycardia"
            }
            "Dioscorea villosa (Wild yam)", "Wild yam (Dioscorea villosa)" -> {
                text = "• None"
            }
            "Echinacea angustifolia (Purple cone flower)", "Purple cone flower (Echinacea angustifolia)" -> {
                text = "• None known - can be used for pediatrics and geriatrics"
            }
            "Eleutherococcus senticosus (Siberian ginseng)", "Siberian ginseng (Eleutherococcus senticosus)" -> {
                text = "• Hypertension due to the effect on the adrendal glands\n" +
                        "• Use lower doses in the sick or the elderly patient"
            }
            "Ephedra sinica (Ma huang)", "Ma huang (Ephedra sinica)" -> {
                text = "• Anorexia nervosa due to appetite suppressive effects\n" +
                        "• Diabetes due to hyperglycemic activity of ephedrine\n" +
                        "• Enlarged prostate gland due to alpha-adrenergic activity causing contraction of the bladder neck\n" +
                        "• Glaucoma due to reduced fluid drainage from the eye\n" +
                        "• Heart disease due to the arrhythmiceffects\n" +
                        "• Hypertension due to vasoconstrictive activity\n" +
                        "• Hyperthyroidism due to the increased T3 to T4 ration after four weeks of ephedrine use\n" +
                        "• Insomnia due to adrenergic stimulant effects\n" +
                        "• Pregnancy\n" +
                        "• Raynaud's disease\n" +
                        "• Stomach ulcers due to reduction of mucus production\n" +
                        "• Weak, aged, or debilitated patient"
            }
            "Equisetum arvense (Shave grass, Horsetail)", "Shave grass (Equisetum arvense)" -> {
                text = "• Cardiovascular problems\n" +
                        "• Hypertension\n" +
                        "• Pregnant"
            }
            "Eriodictyon californicum (Yerba santa)", "Yerba santa (Eriodictyon californicum)" -> {
                text = "• None known"
            }
            "Eschscholzia californica (California poppy)", "California poppy (Eschscholzia californica)" -> {
                text =
                    "• Pregnancy due to the uterine stimulating effects of the alkaloid cryptopine"
            }
            "Euphrasia officinalis (Eyebright)", "Eyebright (Euphrasia officinalis)" -> {
                text = "• None known"
            }
            "Filipendula ulmaria (Meadowsweet)", "Meadowsweet (Filipendula ulmaria)" -> {
                text = "• May cause allergic hypersensitivity in persons sensitive to salicylates"
            }
            "Foeniculum v• ulgare (Fennel)", "Fennel (Foeniculum vulgare)" -> {
                text = "• Allergic hypersensitivity - empirical data\n" +
                        "• Infants due to the essential oil - speculative\n" +
                        "• Pregnancy due to the emmenagogue effect and phytoestrogen activity - empirical data\n" +
                        "• Prolonged usage unless under a physician's care - due to the speculative procarcinogenic estragole constituent in the volatile oil"
            }
            "Fucus vesiculosus (Bladderwrack, Kelp)", "Bladderwrack (Fucus vesiculosus)" -> {
                text = "• Goiter\n" +
                        "• Graves disease\n" +
                        "• Hyperthyroidism\n" +
                        "• Lactation\n" +
                        "• Pregnancy"
            }
            "Galium aparine (Cleavers, Bed straw)", "Cleavers (Galium aparine)" -> {
                text = "• None known"
            }
            "Gelsemium sempervirens (Yellow jasmine, Gelsemium)", "Yellow jasmine (Gelsemium sempervirens)" -> {
                text = "• Hypotension\n" +
                        "• Pregnancy"
            }
            "Gentiana lutea (Gentian)", "Gentian (Gentiana lutea)" -> {
                text = "• Acute gastric inflammation"
            }
            "Geranium maculatum (Wild geranium, Cranesbill)", "Wild geranium (Geranium maculatum)" -> {
                text = "• Best used with a demulcent herb\n" +
                        "• Do not use with acute or profuse internal bleeding"
            }
            "Ginkgo biloba (Ginkgo)", "Ginkgo (Ginkgo biloba)" -> {
                text =
                    "• Amenorrhea (Ginkgolide B may prevent ovulation through its activity as a PAF antagonist and create anovulatory menstrual cycles)\n" +
                            "• Menorrhagia\n" +
                            "• Since ginkgo increases blood supply to the brain, caution is to be taken in high-risk stroke patients"
            }
            "Glycyrrhiza glabra (Licorice)", "Licorice (Glycyrrhiza glabra)" -> {
                text = "• Cholestatic liver disorders\n" +
                        "• Edema\n" +
                        "• Hyperaldosterone\n" +
                        "• Hypertension\n" +
                        "• Liver cirrhosis\n" +
                        "• Pregnancy\n" +
                        "• Renal failure"
            }
            "Grindelia camporum (Gumweed)", "Gumweed (Grindelia camporum)" -> {
                text = "• None known"
            }
            "Gymnema sylvestre (Gymnema)", "Gymnema (Gymnema sylvestre)" -> {
                text =
                    "• Desensitizes the taste buds to sweet and bitter tasting foods for 3 hours after ingesting (Can be avoided by taking herb in capsule)\n" +
                            "• Hypoglycemia"
            }
            "Hamamelis virginiana (Witch hazel)", "Witch hazel (Hamamelis virginiana)" -> {
                text = "• Sensitive individuals may experience irritation of the stomach"
            }
            "Harpagophytum procumbens (Devil's claw, Grapple plant)", "Devil's claw (Harpagophytum procumbens)" -> {
                text = "• Acute gall bladder disease\n" +
                        "• Gastric and duodenal ulcers\n" +
                        "• Pregnancy"
            }
            "Humulus lupulus (Hops)", "Hops (Humulus lupulus)" -> {
                text = "• Marked depression due to the sedative effect"
            }
            "Hydrastis canadensis (Goldenseal)", "Goldenseal (Hydrastis canadensis)" -> {
                text = "• Hypoglycemia\n" +
                        "• Pregnancy due to uterine stimulation from berberine, hydrastine, canadine, hydrastinine in animal uteri studies"
            }
            "Hypericum perforatum (St. John's wort)", "Saint John's wort (Hypericum perforatum)" -> {
                text = "• May cause gastric discomfort if not taken with food\n" +
                        "• Pregnancy due to the emmenagogue and abortifacient effects"
            }
            "Hyssopus officinalis (Hyssop)", "Hyssop (Hyssopus officinalis)" -> {
                text = "• Pregnancy due to the emmenagogue and abortifacient effects"
            }
            "Inula helenium (Elecampane)", "Elecampane (Inula helenium)" -> {
                text =
                    "• Hypersensitive individuals may develop contact dermatitis when touching elecampane\n" +
                            "• Pregnancy"
            }
            "Juniperis communis (Juniper)", "Juniper (Juniperis communis)" -> {
                text =
                    "• Acute or chronic inflammatory conditions of the kidneys due to irritation by hydrocarbon volatile oil components like pinenes and cadinene:\n" +
                            "• Use in small dosages and combined with a mucilaginous demulcent like marshmallow to counter the possible urinary tract irritation\n" +
                            "• Hypertension due to the diuretic action stimulating the glomerulus with little excretion of sodium\n" +
                            "• Nephritis\n" +
                            "• Pregnancy because the essential oil prevents implantation of fetus on days 0-4 of pregnancy in mice"
            }
            "Larrea tridentata (Chapparrel, Creosote bush, Creosotum)", "Chapparrel (Larrea tridentata)" -> {
                text = "• Pregnancy\n" +
                        "• Avoid long-term use due to alkaloid constituents and stimulating substances\n" +
                        "• Hepatotoxicity or liver damage"
            }
            "Lavendula angustifolia (Lavender)", "Lavender (Lavendula angustifolia)" -> {
                text = "• Attention deficit disorder\n" +
                        "• Bipolar disorder\n" +
                        "• Depression\n" +
                        "• Headaches related to stress\n" +
                        "• Insomnia\n" +
                        "• Chest infections, use in steam inhalation\n" +
                        "• Insect stings, use topically\n" +
                        "• Insomnia\n" +
                        "• Rheumatic pain, use topically"
            }
            "Leonurus cardiaca (Motherwort)", "Motherwort (Leonurus cardiaca)" -> {
                text =
                    "• Pregnancy due to the emmenagogue effect and because it contains the animal uterine-stimulating constituents, stachydrine and leonurine"
            }
            "Ligusticum porteri (Osha)", "Osha (Ligusticum porteri)" -> {
                text = "• Pregnancy"
            }
            "Linum usitatissimum (Flax, Linseed)", "Flax (Linum usitatissimum)" -> {
                text = "• Bowel obstruction"
            }
            "Lobelia inflata (Indian tobacco, Puke weed)", "Indian tobacco (Lobelia inflata)" -> {
                text =
                    "• Asthma of cardiac decompensation,'hypertension' sinus arrhythmia or bundle branch block\n" +
                            "• Avoid in the very young and elderly\n" +
                            "• Decompensation\n" +
                            "• Dyspnea from enlarged or fatty heart\n" +
                            "• Hydropericardium\n" +
                            "• Hydrothorax\n" +
                            "• Hypertension\n" +
                            "• Nervous prostration\n" +
                            "• Paralysis\n" +
                            "• Poisoning with a depressing substance\n" +
                            "• Pregnancy due to similarity of lobeline to nicotine\n" +
                            "• Shock\n" +
                            "• Valvular incompetence of the heart"
            }
            "Lomatium disectum (Desert parsley)", "Desert parsley (Lomatium disectum)" -> {
                text = "• Can cause photodermatitis in sensitive individuals\n" +
                        "• Pregnancy"
            }
            "Marrubium vulgare (Horehound)", "Horehound (Marrubium vulgare)" -> {
                text = "• Pregnancy due to the abortifacient effects"
            }
            "Matricaria chamomilla (German chamomile)", "German chamomile (Matricaria chamomilla)" -> {
                text = "• Allergic hypersensitivity in very rare cases\n" +
                        "• Early pregnancy with excessively large doses"
            }
            "Medicago sativa (Alfalfa)", "Alfalfa (Medicago sativa)" -> {
                text = "• Pregnancy - excessive use\n" +
                        "• Systemic lupus erythematosus due to the L-canavanine"
            }
            "Melaleuca alternifolia (Tea tree)", "Tea tree (Melaleuca alternifolia)" -> {
                text = "• None known"
            }
            "Melissa officinalis (Lemon balm)", "Lemon balm (Melissa officinalis)" -> {
                text = "• Hypothyroidism due to the antithyropic effects\n" +
                        "• Pregnancy due to the emmenagogue effects"
            }
            "Mentha piperita (Peppermint)", "Peppermint (Mentha piperita)" -> {
                text = "• Acute gallstones due to the choleretic effect\n" +
                        "• Early pregnancy\n" +
                        "• Hiatal hernia, due to relaxing effect of lower esophageal sphincter\n" +
                        "• Small children should not inhale essential oil"
            }
            "Mitchella repens (Squawvine, Partridge berry)", "Squawvine (Mitchella repens)" -> {
                text = "• None known"
            }
            "Momordica charantia (Bitter melon)", "Bitter melon (Momordica charantia)" -> {
                text = "• Pregnancy - due to the abortifacient effect in rat studies"
            }
            "Nepeta cataria (Catnip)", "Catnip (Nepeta cataria)" -> {
                text = "• Pregnancy due to the abortifacient effect"
            }
            "Oplopanax horridum (Devil's club)", "Devil's club (Oplopanax horridum)" -> {
                text = "• Acute illness, such as colds, flu or allergy attack\n" +
                        "• Bronchitis\n" +
                        "• Children\n" +
                        "• Excessive menstrual bleeding\n" +
                        "• Hypertension\n" +
                        "• Pregnancy"
            }
            "Panax ginseng (Chinese ginseng, Korean ginseng)", "Chinese ginseng (Panax ginseng)" -> {
                text = "• Acute illness, such as colds, flu or allergy attack\n" +
                        "• Bronchitis\n" +
                        "• Children\n" +
                        "• Excessive menstrual bleeding\n" +
                        "• Hypertension\n" +
                        "• Pregnancy"
            }
            "Passiflora incarnata (Passionflower)", "Passionflower (Passiflora incarnata)" -> {
                text = "• Pregnancy due to uterine stimulation"
            }
            "Pausinystalia yohimbe (Yohimbe)", "Yohimbe (Pausinystalia yohimbe)" -> {
                text = "• Anxiety\n" +
                        "• Bipolar disorder, yohimbe can enduce a manic episode\n" +
                        "• Depression\n" +
                        "• Diabetes\n" +
                        "• Heart, liver or kidney disease\n" +
                        "• Hypotension\n" +
                        "• Nervous disorders, especially schizophrenia"
            }
            "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)", "Butterbur (Petasites hybridus)" -> {
                text = "• Lactation\n" +
                        "• Pregnancy"
            }
            "Petroselinum crispum (Parsley)", "Parsley (Petroselinum crispum)" -> {
                text = "• Pregnancy"
            }
            "Phytolacca decandra (Poke)", "Poke (Phytolacca decandra)" -> {
                text = "• Pregnancy"
            }
            "Pimpinella anisum (Anise)", "Anise (Pimpinella anisum)\n" -> {
                text = "• Some individuals may exhibit allergic hypersensitivity"
            }
            "Piper methysticum (Kava kava)", "Kava kava (Piper methysticum)" -> {
                text = "• Driving an automobile after excessive intake\n" +
                        "• Pregnancy or nursing"
            }
            "Piscidia piscipula (Jamaican dogwood)", "Jamaican dogwood (Piscidia piscipula)" -> {
                text = "• Children and elderly due to neuromuscular depression"
            }
            "Polygonum multiflorum (Fo-ti, He-shou-wu)", "Fo-ti (Polygonum multiflorum)" -> {
                text = "• Hypersensitive to Fo-Ti may result in a skin rash"
            }
            "Pygeum africanum (Pygeum)", "Pygeum (Pygeum africanum)" -> {
                text = "• None known"
            }
            "Rhamnus frangula (Buckthorn)", "Buckthorn (Rhamnus frangula)" -> {
                text = "• Children\n" +
                        "• Inflammatory disorders:\n" +
                        "• Appendicitis\n" +
                        "• Colitis\n" +
                        "• Crohn's disease\n" +
                        "• Irritable bowel\n" +
                        "• Ulcerative colitis\n" +
                        "• Nursing mothers\n" +
                        "• Pregnancy\n" +
                        "• Using for more than 10 days may cause electrolyte and water loss"
            }
            "Rhamnus purshiana (Cascara)", "Cascara (Rhamnus purshiana)" -> {
                text = "• Inflammatory disorders:\n" +
                        "Appendicitis\n" +
                        "Colitis\n" +
                        "Crohn's disease\n" +
                        "Irritable bowel\n" +
                        "Ulcerative colitis\n" +
                        "• Pregnancy\n" +
                        "• Using for more than 10 days may cause electrolyte and water loss"
            }
            "Rheum officinalis (Rhubarb)", "Rhubarb (Rheum officinalis)" -> {
                text =
                    "• Pregnancy due to the uterine stimulant activity (although some research has shown rhubarb to be beneficial to pregnant women with hypertension)\n" +
                            "• Prolonged use of large doses could cause loss of electrolytes including potassium\n" +
                            "• Intestinal obstruction due to the anthraquinone effects\n" +
                            "• Lactating women\n" +
                            "• Inflammatory disorders, including Crohn's, ulcerative colitis, appendicitis, iritable bowel, may be aggrevated by the irritating effects of anthraquinone constituents\n" +
                            "• Kidney problems although there is evidence that the whole herb can help prevent kidney damage or prolong kidney function when damaged"
            }
            "Rosmarius officinalis (Rosemary)", "Rosemary (Rosmarius officinalis)" -> {
                text = "• Pregnancy due to the abortifacient and emmenagogue effects"
            }
            "Rumex crispis (Yellow dock, Curly dock)", "Yellow dock (Rumex crispis)" -> {
                text = "• None"
            }
            "Ruscus aculeatus (Butcher's broom)", "Butcher's broom (Ruscus aculeatus)" -> {
                text = "• None known"
            }
            "Salvia miltiorrhiza (Danshen)", "Danshen (Salvia miltiorrhiza)" -> {
                text = "• Individuals taking blood coagulants should not use this herb"
            }
            "Salvia officinalis (Sage)", "Sage (Salvia officinalis)" -> {
                text = "• Pregnancy due to the abortifacient and emmenagogue effects"
            }
            "Sambucus canadensis, nigra (Elder)", "Elder (Sambucus canadensis, nigra)" -> {
                text = "• None known"
            }
            "Sanguinaria canadensia (Blood root)", "Blood root (Sanguinaria canadensia)" -> {
                text =
                    "• Pregnancy due to the uterine effects of berberine, chelerythrine and protopine"
            }
            "Schisandra chinensis (Wu wei zi)", "Wu wei zi (Schisandra chinensis)" -> {
                text = "• Epilepsy\n" +
                        "• High blood pressure\n" +
                        "• Peptic ulcers\n" +
                        "• Pregnancy except under medical supervision to promote uterine contractions during labor"
            }
            "Scutellaria laterifolia (Skullcap)", "Skullcap (Scutellaria laterifolia)" -> {
                text = "• None known"
            }
            "Serenoa repens (Saw palmetto)", "Saw palmetto (Serenoa repens)" -> {
                text = "• None"
            }
            "Silybum marianum (Milk thistle)", "Milk thistle (Silybum marianum)" -> {
                text = "• None known"
            }
            "Smilax sarsaparilla (Sarsaparilla)", "Sarsaparilla (Smilax sarsaparilla)" -> {
                text = "• None known"
            }
            "Spilanthes acmella (Paracress)", "Paracress (Spilanthes acmella)" -> {
                text = "• None known"
            }
            "Stellaria media (Chickweed)", "Chickweed (Stellaria media)" -> {
                text = "• None known"
            }
            "Sticta pulmonaria (Lungwort)", "Lungwort (Sticta pulmonaria)" -> {
                text = "• None known"
            }
            "Stillingia sylvatica (Queen's root)", "Queen's root (Stillingia sylvatica)" -> {
                text = "• Nursing mothers"
            }
            "Symphytum officinale (Comfrey)", "Comfrey (Symphytum officinale)" -> {
                text = "• Extended use longer than 4 weeks\n" +
                        "• Liver disease due to alkaloid hepatotoxicity\n" +
                        "• Nursing mothers due to pyrrolizidine alkaloids\n" +
                        "• Pregnancy due to pyrrolizidine alkaloid"
            }
            "Symplocarpus foetida (Skunk cabbage)", "Skunk cabbage (Symplocarpus foetida)" -> {
                text = "• None known"
            }
            "Tabebuia impetiginosa (Pau d' arco)", "Pau d' arco (Tabebuia impetiginosa)" -> {
                text = "• None known"
            }
            "Tanacetum parthenium) (Feverfew)", "Feverfew (Tanacetum parthenium)" -> {
                text = "• Pregnancy, due to emmenagogue effect\n" +
                        "• Sensitive individual may develop exudative dermatitis from external contact"
            }
            "Taraxacum officinale (Dandelion, Lion's tooth)", "Dandelion (Taraxacum officinale)" -> {
                text = "• Acute cholecystitis\n" +
                        "• Acute diarrhea\n" +
                        "• Irritable or inflammatory conditions of the stomach or intestines"
            }
            "Taxus brevifolia (Yew)", "Yew (Taxus brevifolia)" -> {
                text = "• Pregnancy"
            }
            "Thuja plicata, occidentalis (Western cedar)", "Western cedar (Thuja plicata, occidentalis)" -> {
                text = "• Dry irritable cough\n" +
                        "• Pregnancy due to the emmenagogue effect"
            }
            "Thymus vulgaris (Thyme)", "Thyme (Thymus vulgaris)" -> {
                text = "• Pregnancy"
            }
            "Tilia europaea (Linden flower, Lime blossom)", "Linden flower (Tilia europaea)" -> {
                text = "• Hypotension"
            }
            "Trifollium pratense (Red clover)", "Red clover (Trifollium pratense)" -> {
                text = "• Clotting disorders\n" +
                        "• Pre-surgery patients"
            }
            "Trigonella foenum-graecum (Fenugreek)", "Fenugreek (Trigonella foenum-graecum)" -> {
                text = "• Pregnancy due to the emmenagogue effect"
            }
            "Trillium erectum (Beth root)", "Beth root (Trillium erectum)" -> {
                text = "• Pregnancy due to the emmenagogue effect"
            }
            "Tussilago farfara (Colt's foot)", "Colt's foot (Tussilago farfara)" -> {
                text = "• Contraindicated in pregnancy due to abortifacient effect\n" +
                        "• Contraindicated in pregnancy and nursing due to the content of hepatotoxic pyrrolizidine alkaloids\n" +
                        "• Liver disease due to the alkaloid pyrrolizidine"
            }
            "Ulmus fulva (Slippery elm, American elm)", "Slippery elm (Ulmus fulva)" -> {
                text = "• None"
            }
            "Urtica urens (Nettles)", "Nettles (Urtica urens)" -> {
                text = "• Pregnancy due to the emmenagogue effects"
            }
            "Usnea spp. (Old man's beard)", "Old man's beard (Usnea spp.)" -> {
                text = "• None known"
            }
            "Vaccinium myrtillus (Bilberry)", "Bilberry (Vaccinium myrtillus)" -> {
                text = "• None known"
            }
            "Valeriana officinalis (Valerian)", "Valerian (Valeriana officinalis)" -> {
                text = "• Occasionally has opposite effect, stimulating instead of sedating\n" +
                        "• Thyroid dysfunction"
            }
            "Verbascum thapsus (Mullein)", "Mullein (Verbascum thapsus)" -> {
                text = "• None known"
            }
            "Verbena officinalis (Vervain)", "Vervain (Verbena officinalis)" -> {
                text = "• Pregnancy due to the emmenagogue effect"
            }
            "Viburnum opulus (Cramp bark)", "Cramp bark (Viburnum opulus)" -> {
                text = "• None known"
            }
            "Viscum alba (Mistletoe)", "Mistletoe (Viscum alba)" -> {
                text = "• Pregnancy due to uterine stimulation"
            }
            "Vitex agnus castus (Chaste tree, Monk's pepper)", "Chaste tree (Vitex agnus castus)" -> {
                text =
                    "• Pregnancy due to emmenagogue effect but may be helpful in first trimester to prevent miscarriage"
            }
            "Withania somnifera (Ashwagandha)", "Ashwagandha (Withania somnifera)" -> {
                text = "• Pregnancy"
            }
            "Yucca spp. (Yucca)", "Yucca (Yucca spp.)" -> {
                text = "• Pregnancy"
            }
            "Zanthoxylum clava-herculis (Southern prickly ash)", "Southern prickly ash (Zanthoxylum clava-herculis)" -> {
                text = "• Pregnancy due to the emmenagogue effect"
            }
            "Zea mays (Corn silk)", "Corn silk (Zea mays)" -> {
                text = "• None known"
            }
            "Zingiber officinale (Ginger)", "Ginger (Zingiber officinale)" -> {
                text = "• Can cause sensation of heat and burning within the stomach\n" +
                        "• Patients with \"sensitive\" stomachs may not always tolerate ginger\n" +
                        "• Pregnancy due to the emmenagogue effects"
            }
        }
        ss = SpannableString(text)
        binding.contentData.text = ss
    }//

    private fun setIndicationAction(heading: String) {
        binding.subHeading.text = "Clinical Indications:"
        var text = ""
        when (heading) {
            "Achillea millefolium (Yarrow)", "Yarrow (Achillea millefolium)" -> {
                text = "• Allergies\n" +
                        "• Dysmenorrhea\n" +
                        "• Hemorrhoids\n" +
                        "• Peptic ulcer\n" +
                        "• Antibacterial:\n" +
                        "• Gram positive bacteria\n" +
                        "• Gram negative bacteria\n" +
                        "• Circulatory disorders\n" +
                        "• Hemorrhaging disorders\n" +
                        "• Influenza and colds\n" +
                        "• Lacerations and puncture wounds - topically\n" +
                        "• Menorrhagia with uterine atony\n" +
                        "• Pain associated with pelvic disorders\n" +
                        "• Uterine spasms\n" +
                        "• Vaginitis with vaginal atony"
            }
            "Aconitum napellus (Monkshood, Aconite)", "Monkshood (Aconitum napellus)" -> {
                text = "• Endometriosis\n" +
                        "• Bruises, topically\n" +
                        "• Sciatica, topically\n" +
                        "• Trigeminal\n" +
                        "• Used in various forms of heart disease with aconitine removed"
            }
            "Acorus calamus (Sweetflag, Acorus)", "Sweetflag (Acorus calamus)" -> {
                text = "• AIDS - wasting\n" +
                        "• Anorexia nervosa\n" +
                        "• Digestive disorders that require secretory activity to be increased\n" +
                        "• Indigestion (dyspepsia)\n" +
                        "• Reduces intestinal gas (flatulence) and bloating after meals\n" +
                        "• Stimulates the appetite\n" +
                        "• Stomach cancer - symptomatic relief only\n" +
                        "• Tobacco addiction (rhizome (root) is chewed for this)\n" +
                        "• Varicose veins - topically"
            }
            "Aesculus hippocastanum (Horsechestnut)", "Horsechestnut (Aesculus hippocastanum)" -> {
                text = "• BPH\n" +
                        "• Hemorrhoids\n" +
                        "• Bedwetting\n" +
                        "• Lymphedema\n" +
                        "• Relaxes bronchial spasms\n" +
                        "• Relaxes ureter spasms, especially left sided\n" +
                        "• Venous congestion"
            }
            "Agrimonia eupatorium (Agrimony)", "Agrimony (Agrimonia eupatorium)" -> {
                text = "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Gout\n" +
                        "• Peptic ulcers\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Stress Incontinence\n" +
                        "• Ulcerative colitis\n" +
                        "• Cirrhosis of the liver\n" +
                        "• Coagulation of the blood\n" +
                        "• Enuresis\n" +
                        "• GI disorders by toning mucous membranes, improving their secretion and absorption\n" +
                        "• Gingivitis\n" +
                        "• Hypochlorhydria\n" +
                        "• Irritation of the urinary tract\n" +
                        "• Menorrhagia"
            }
            "Alchemilla vulgaris (Lady's mantle)", "Lady's mantle (Alchemilla vulgaris)" -> {
                text = "• Diarrhea caused by gastroenteritis\n" +
                        "• Leukorrhea\n" +
                        "• Menorrhagia, metrorrhagia - useful in the luteal phase of the cycle\n" +
                        "• Menstrual headache"
            }
            "Aletris farinosa (True unicorn)", "True unicorn (Aletris farinosa)" -> {
                text = "• Amenorrhea\n" +
                        "• Dysmenorrhea\n" +
                        "• Fertility/Infertility\n" +
                        "• Menopause\n" +
                        "• Dyspepsia\n" +
                        "• Flatulence\n" +
                        "• Hormonal insufficiency\n" +
                        "• Inflammation of the pelvic organs\n" +
                        "• Miscarriage prevention\n" +
                        "• Prolapse of vagina or uterus\n" +
                        "• Uterine sedative"
            }
            "Allium sativum (Garlic)", "Garlic (Allium sativum)" -> {
                text = "• AIDS\n" +
                        "• Allergies\n" +
                        "• Asthma\n" +
                        "• Atherosclerosis\n" +
                        "• Attention deficit disorder\n" +
                        "• Bronchitis\n" +
                        "• Cancer prevention\n" +
                        "• Candidiasis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Diabetes mellitus\n" +
                        "• Hypertension\n" +
                        "• Otitis media\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Bacterial, viral, and fungal infections\n" +
                        "• Cancer\n" +
                        "• Cardiovascular diseases\n" +
                        "• Flatulence\n" +
                        "• Fungal infections of the skin - use topically\n" +
                        "• Hypercholesterolemia\n" +
                        "• Inflammatory conditions\n" +
                        "• Nausea\n" +
                        "• Parasite infections\n" +
                        "• Respiratory disorders\n" +
                        "• Vaginitis"
            }
            "Althea officinalis (Marshmallow)", "Marshmallow (Althea officinalis)" -> {
                text = "• Amenorrhea\n" +
                        "• Dysmenorrhea\n" +
                        "• Fertility/Infertility\n" +
                        "• Menopause\n" +
                        "• Dyspepsia\n" +
                        "• Flatulence\n" +
                        "• Hormonal insufficiency\n" +
                        "• Inflammation of the pelvic organs\n" +
                        "• Miscarriage prevention\n" +
                        "• Prolapse of vagina or uterus\n" +
                        "• Uterine sedative"
            }
            "Ammi visnaga(Khella)", "Khella (Ammi visnaga)" -> {
                text = "• Asthma, chronic\n" +
                        "• Hypertension\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Angina\n" +
                        "• Emphysema\n" +
                        "• Mild obstructive pulmonary disease\n" +
                        "• Urinary tract stones\n" +
                        "• Vitiligo"
            }
            "Angelica sinensis (Dong quai)", "Dong quai (Angelica sinensis)" -> {
                text = "• Allergies\n" +
                        "• Amenorrhea\n" +
                        "• Asthma\n" +
                        "• Fertility/Infertility\n" +
                        "• Headaches\n" +
                        "• Hypertension\n" +
                        "• Menopause\n" +
                        "• Osteoarthritis\n" +
                        "• PMS\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Alcoholism\n" +
                        "• Anemia\n" +
                        "• Arrhythmia\n" +
                        "• Cancer\n" +
                        "• Constipation\n" +
                        "• Hot flashes associated with menopause\n" +
                        "• Intestinal spasms/cramps\n" +
                        "• Menstrual irregularities\n" +
                        "• Sciatica\n" +
                        "• Uterine cramps\n" +
                        "• Vasculitis"
            }
            "Arctium lappa (Burdock)", "Burdock (Arctium lappa)" -> {
                text = "• AIDS\n" +
                        "• Amenorrhea\n" +
                        "• Cancer prevention\n" +
                        "• Congestive heart failure\n" +
                        "• Constipation\n" +
                        "• Diabetes mellitus\n" +
                        "• Eczema\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Gout\n" +
                        "• Memory loss\n" +
                        "• Menopause\n" +
                        "• Osteoarthritis\n" +
                        "• PMS\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Uterine fibroid\n" +
                        "• Cancer\n" +
                        "• Indigestion\n" +
                        "• Kidney weakness with risk of stone formation\n" +
                        "• Lymphatic congestion\n" +
                        "• Sciatica\n" +
                        "• Skin disorders:\n" +
                        "• Acne\n" +
                        "• Boils\n" +
                        "• Carbuncles\n" +
                        "• Impetigo\n" +
                        "• Sties\n" +
                        "• Sore throat\n" +
                        "• Urinary calculi\n" +
                        "• UTI"
            }
            "Arctostaphylos uva ursi (Bearberry)", "Bearberry (Arctostaphylos uva ursi)" -> {
                text = "• Allergies\n" +
                        "• Cystitis\n" +
                        "• Dysmenorrhea\n" +
                        "• Eczema\n" +
                        "• Cholecystitis\n" +
                        "• Hemorrhoids\n" +
                        "• Peptic ulcers\n" +
                        "• Psoriasis\n" +
                        "• Acne\n" +
                        "• Amebiasis\n" +
                        "• Cholera\n" +
                        "• Circulatory disorders\n" +
                        "• Hemorrhaging disorders\n" +
                        "• Influenza and colds\n" +
                        "• Lacerations and puncture wounds - topically\n" +
                        "• Menorrhagia\n" +
                        "• Pain associated with pelvic disorders"
            }
            "Armoracia rusticana (Horseradish)", "Horseradish (Armoracia rusticana)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Cystitis\n" +
                        "• Gout\n" +
                        "• Rheumatic joints, use as a poultice to stimulate blood flow"
            }
            "Asclepias tuberosa (Pleurisy root)", "Pleurisy root (Asclepias tuberosa)" -> {
                text = "• Bronchitis\n" +
                        "• Influenza\n" +
                        "• Pleurisy\n" +
                        "• Pneumonia"
            }
            "Astragalus membranaceus (Milk vetch)", "Milk vetch (Astragalus membranaceus)" -> {
                text = "• AIDS\n" +
                        "• Alzheimer's disease\n" +
                        "• Asthma\n" +
                        "• Constipation\n" +
                        "• Fertility/Infertility\n" +
                        "• Peptic ulcer\n" +
                        "• Diarrhea\n" +
                        "• Infections including:\n" +
                        "• Diplococcus\n" +
                        "• Staphylococcal strains\n" +
                        "• Streptococcus\n" +
                        "• Lack of appetite\n" +
                        "• Respiratory disorders"
            }
            "Atropa belladonna (Belladonna)", "Belladonna (Atropa belladonna)" -> {
                text =
                    "• Biliary dyskinesia (condition which prevents the flow of bile from the gall bladder to the intestinal tract)\n" +
                            "• Cystitis, acute pain\n" +
                            "• Endometrosis, acute pain\n" +
                            "• Encephalitis\n" +
                            "• Enteralgia\n" +
                            "• Gastralgia\n" +
                            "• Physiological antidote in acute poisoning by morphine (opium), eserine (physostigmine), muscarine (mushroom poisoning), and pilocarpine\n" +
                            "• Post influenza parkinsonism\n" +
                            "• Shock\n" +
                            "• Spasms due to hyperacidity\n" +
                            "• Spasms of the involuntary muscles\n" +
                            "• Sustains respiration in strychnine poisoning and chloroform and ether narcosis\n" +
                            "• Uterine and ovarian neuralgias (sharp pain along the course of a nerve in the uterus and ovaries)"
            }
            "Avena sativa (Oats)", "Oats (Avena sativa)" -> {
                text = "• Bipolar disorder\n" +
                        "• Depression\n" +
                        "• Insomnia\n" +
                        "• Breaking addictive habits, including morphine, opium, alcohol, nicotine, coffee, etc\n" +
                        "• Insomnia"
            }
            "Baptisia tintoria (Wild indigo)", "Wild indigo (Baptisia tintoria)" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Cancer prevention\n" +
                        "• Ulcerative colitis\n" +
                        "• Amebic dysentery\n" +
                        "• Cellulitis\n" +
                        "• Gingivitis\n" +
                        "• Inflammation of the lymph glands\n" +
                        "• Laryngitis\n" +
                        "• Local cervical erosion\n" +
                        "• Pharyngitis\n" +
                        "• Tonsilitis\n" +
                        "• Ulcers, externally\n" +
                        "• Vaginitis"
            }
            "Barosma betulina (Buchu)", "Buchu (Barosma betulina)" -> {
                text = "• Cystitis, especially where there is painful and burning urination\n" +
                        "• Complaints of the urinary tract\n" +
                        "• Prostatitis\n" +
                        "• Urethritis"
            }
            "Berberis vulgaris (Barberry)", "Barberry (Berberis vulgaris)" -> {
                text = "• Allergies\n" +
                        "• Aphthous stomatitis\n" +
                        "• Cancer prevention\n" +
                        "• Candidiasis\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Constipation\n" +
                        "• Eczema\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Hepatitis\n" +
                        "• Psoriasis\n" +
                        "• Acne\n" +
                        "• Amebiasis\n" +
                        "• Cholera\n" +
                        "• Conjunctivitis\n" +
                        "• Infections caused by:\n" +
                        "• Candida a\n" +
                        "• Chlamydia sp\n" +
                        "• Corynebacterium d\n" +
                        "• Diplococcus p\n" +
                        "• E. coli\n" +
                        "• Entamoeba h\n" +
                        "• Giardia l\n" +
                        "• Leishmania d\n" +
                        "• N. meningitidis\n" +
                        "• Neisseria g\n" +
                        "• Pseudomonas sp\n" +
                        "• Salmonella t\n" +
                        "• Shigella d\n" +
                        "• Treponema p\n" +
                        "• Trichomonas v\n" +
                        "• Vibrio c\n" +
                        "• Maldigestion"
            }
            "Bryonia alba(Bryony)", "Bryony (Bryonia alba)" -> {
                text = "• Endometriosis\n" +
                        "• Headache from frontal region to occiput\n" +
                        "• Hypertension\n" +
                        "• Intestinal ulcers\n" +
                        "• Myalgia, topically"
            }
            "Bupleurum chinense (Thoroughwax)", "Thoroughwax (Bupleurum chinense)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Hepatitis\n" +
                        "• Herpes simplex\n" +
                        "• PMS\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Hot flashes associated with menopause\n" +
                        "• Measles"
            }
            "Calendula officinalis (Marigold)", "Marigold (Calendula officinalis)" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Dysmenorrhea\n" +
                        "• Otitis media\n" +
                        "• Peptic ulcers\n" +
                        "• Burns (use in a poultice)\n" +
                        "• Callouses (use in a poultice)\n" +
                        "• Conjunctivitis (cold infusion)\n" +
                        "• Corns (use in a poultice)\n" +
                        "• Impetigo (use in a poultice)\n" +
                        "• Stings (use in a poultice)\n" +
                        "• Thrush caused by Candida albicans\n" +
                        "• Varicose veins (use in a poultice)\n" +
                        "• Warts (use in a poultice)"
            }
            "Camellia sinensis (Green tea)", "Green tea (Camellia sinensis)" -> {
                text = "• Atherosclerosis\n" +
                        "• Cancer prevention\n" +
                        "• Cystitis\n" +
                        "• Hypertension\n" +
                        "• Obesity\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Dental caries\n" +
                        "• Diarrhea\n" +
                        "• Pneumonia\n" +
                        "• Pyelonephritis\n" +
                        "• Sickle cell anemia\n" +
                        "• Skin infections"
            }
            "Capsicum frutescens (Cayenne, Red pepper)", "Cayenne (Capsicum frutescens)" -> {
                text = "• Allergies\n" +
                        "• Atherosclerosis\n" +
                        "• Bronchitis\n" +
                        "• Congestive heart failure\n" +
                        "• Memory loss\n" +
                        "• Topically for:\n" +
                        "• Alopecia\n" +
                        "• Neuralgia\n" +
                        "• Pleuritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Effective for dialysis-induced itching\n" +
                        "• GI problems\n" +
                        "• Increases body heat by stimulating circulation\n" +
                        "• Stimulate appetite\n" +
                        "• Stimulate digestion\n" +
                        "• Stimulate peristalsis\n" +
                        "• Used with other herbs, it can promote circulation in the stomach and enhance the absorption of the other herbs"
            }
            "Caulophyllum thalictroides (Blue cohosh)", "Blue cohosh (Caulophyllum thalictroides)" -> {
                text = "• Amenorrhea\n" +
                        "• Asthma\n" +
                        "• Dysmenorrhea\n" +
                        "• Rheumatoid arthritis, eases pain\n" +
                        "• Cough\n" +
                        "• Epilepsy\n" +
                        "• Infertility\n" +
                        "• Labor tonic, due to oxytocic effect, can hasten a delayed labor\n" +
                        "• Oligomenorrhea"
            }
            "Centella asiatica (Gota kola)", "Gota kola (Centella asiatica)" -> {
                text = "• Chronic fatigue syndrome\n" +
                        "• Diabetes mellitus\n" +
                        "• Eczema\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Hemorrhoids\n" +
                        "• Hypertension\n" +
                        "• Impotence\n" +
                        "• Incontinence\n" +
                        "• Memory loss\n" +
                        "• Multiple sclerosis\n" +
                        "• Peptic ulcer\n" +
                        "• Stress Incontinence\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• 2nd and 3rd degree burns by gas, boiling water or electrical current - daily compresses or IM injections\n" +
                        "• Abscesses\n" +
                        "• Anal fissures\n" +
                        "• Bladder ulcers\n" +
                        "• Cellulite\n" +
                        "• Cirrhosis\n" +
                        "• Improving mental function\n" +
                        "• Keloids\n" +
                        "• Leprosy\n" +
                        "• Lupus erythematosus\n" +
                        "• Mental retardation\n" +
                        "• Mycosis fungiodes\n" +
                        "• Perineal lesions\n" +
                        "• Periodontal disease\n" +
                        "• Retinal detachment\n" +
                        "• Scleroderma - by reducing joint pain, improving finger mobility and decreasing skin hardening\n" +
                        "• Skin ulcers\n" +
                        "• Surgical wounds\n" +
                        "• Tuberculosis\n" +
                        "• Varicose veins\n" +
                        "• Venous insufficiency\n" +
                        "• Wound healing"
            }
            "Chamaelirium luteum (False unicorn)", "False unicorn (Chamaelirium luteum)" -> {
                text = "• Amenorrhea\n" +
                        "• Dysmenorrhea\n" +
                        "• Impotence\n" +
                        "• Incontinence\n" +
                        "• Menorrhagia\n" +
                        "• Nausea of pregnancy\n" +
                        "• Threatened miscarriage"
            }
            "Chelidonium majus (Celandine)", "Celandine (Chelidonium majus)" -> {
                text = "• Bronchitis\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Endometriosis\n" +
                        "• Headache, including migraines due to bilious complaints that usually present with pain around the right scapula extending up into the back of the neck, behind the right ear and over the head and around the area of the right eye\n" +
                        "• Cataracts, fresh juice is used directly in the eye\n" +
                        "• Hepatitis\n" +
                        "• Warts, latex from the plant is used to dissolve them"
            }
            "Chimaphilia umbellata (Pipsissewa)", "Pipsissewa (Chimaphilia umbellata)" -> {
                text = "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Cystitis\n" +
                        "• Albuminuria\n" +
                        "• Glucosuria\n" +
                        "• Prostatic irritation\n" +
                        "• Pyelonephritis"
            }
            "Chionanthus virginicus (Fringe tree)", "Fringe tree (Chionanthus virginicus)" -> {
                text = "• Cholecystitis, for treatment and prevention\n" +
                        "• Cholelithiasis, for treatment and prevention if there is no blockage\n" +
                        "• Endometriosis\n" +
                        "• Chronic conditions of the liver\n" +
                        "• Chronic conditions of the spleen\n" +
                        "• Hepatitis\n" +
                        "• Jaundice when it is not due to a blockage\n" +
                        "• Pancreatic inactivity"
            }
            "Cimicifuga racemosa (Black cohosh)", "Black cohosh (Cimicifuga racemosa)" -> {
                text = "• Amenorrhea\n" +
                        "• Dysmenorrhea\n" +
                        "• Endometriosis\n" +
                        "• Menopause\n" +
                        "• Osteoarthritis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Dyspepsia\n" +
                        "• Infertility\n" +
                        "• Influenza with chilliness, aching muscles and an acute fever\n" +
                        "• Muscular pain due to nervous tension\n" +
                        "• Neuralgia\n" +
                        "• Normalizes female hormone activity\n" +
                        "• Pertussis\n" +
                        "• Reproductive tract problems related to congestion, nervous irritability of the reproductive organs, achy muscles and irritability or depression\n" +
                        "• Sciatic pain\n" +
                        "• Tinnitus"
            }
            "Cinnamomum spp. (Cinnamon)", "Cinnamon (Cinnamomum spp.)" -> {
                text = "• Constipation\n" +
                        "• Dysmenorrhea\n" +
                        "• Hemorrhoids\n" +
                        "• Hypertension\n" +
                        "• Cold or flu with chilliness, aching, sweating but cold skin\n" +
                        "• Diarrhea\n" +
                        "• Digestive irritation - use in small doses because cinnamon can cause digestive irritation in large doses\n" +
                        "• Nausea and vomiting\n" +
                        "• Passive gastric bleeding\n" +
                        "• Passive pulmonary bleeding\n" +
                        "• Passive intestinal bleeding\n" +
                        "• Passive renal bleeding"
            }
            "Collinsonia canadensis (Stone root)", "Stone root (Collinsonia canadensis)" -> {
                text = "• Cholelithiasis\n" +
                        "• Hemorrhoids\n" +
                        "   specifically with hard dry stools or alternating constipation and diarrhea\n" +
                        "• Anal fissure\n" +
                        "• Diarrhea\n" +
                        "• Follicular tonsillitis\n" +
                        "• Gastroenteritis with diarrhea\n" +
                        "• Pelvic or rectal congestion secondary to portal back-pressure and venous stasis\n" +
                        "• Renal lithiasis\n" +
                        "• Varicocele\n" +
                        "• Varicose veins"
            }
            "Commiphora molmol (Myrrh)", "Myrrh (Commiphora molmol)" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Boils\n" +
                        "• Brucellosis\n" +
                        "• Gingivitis\n" +
                        "• Laryngitis\n" +
                        "• Pharyngitis\n" +
                        "• Sinusitis\n" +
                        "• Thrush caused by Candida albicans\n" +
                        "• Tinea pedis\n" +
                        "• Tonsilitis"
            }
            "Commiphora mukul (Guggulu)", "Guggulu (Commiphora mukul)" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Boils\n" +
                        "• Brucellosis\n" +
                        "• Gingivitis\n" +
                        "• Laryngitis\n" +
                        "• Pharyngitis\n" +
                        "• Sinusitis\n" +
                        "• Thrush caused by Candida albicans\n" +
                        "• Tinea pedis\n" +
                        "• Tonsilitis"
            }
            "Corydalis bulbosa (Corydalis)", "Corydalis (Corydalis bulbosa)" -> {
                text = "• Dysmenorrhea\n" +
                        "• Fibromyalgia\n" +
                        "• Headache\n" +
                        "• Hemorrhoids\n" +
                        "• Gastric and abdominal pain"
            }
            "Crataegus oxycantha (Hawthorne)", "Hawthorne (Crataegus oxycantha)" -> {
                text = "• Atherosclerosis\n" +
                        "• Congestive heart failure\n" +
                        "• Hypertension\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Acute myocardial insufficiency\n" +
                        "• Angina pectoris\n" +
                        "• Digitalis withdrawal\n" +
                        "• Dyspnea\n" +
                        "• Endocarditis, myocarditis and pericarditis\n" +
                        "• Hypertrophy\n" +
                        "• Inflammation\n" +
                        "• Nervous depression\n" +
                        "• Palpitations\n" +
                        "• Periodontal disease\n" +
                        "• Tachycardia\n" +
                        "• Valvular murmur\n" +
                        "• Vertigo"
            }
            "Curcuma longa (Tumeric)", "Tumeric (Curcuma longa)" -> {
                text = "• AIDS\n" +
                        "• Alzheimer's Disease\n" +
                        "• Asthma\n" +
                        "• Atherosclerosis\n" +
                        "• Cancer prevention\n" +
                        "• Cholelithiasis\n" +
                        "• Crohn's disease\n" +
                        "• Diabetes mellitus\n" +
                        "• Dysmenorrhea\n" +
                        "• Eczema\n" +
                        "• Hepatitis\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Peptic ulcer\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Rosacea\n" +
                        "• Ulcerative colitis\n" +
                        "• Bruises\n" +
                        "• Carcinogen exposure\n" +
                        "• Cataract prevention\n" +
                        "• Colic\n" +
                        "• Essential oil is antifungal at a dilution of 1 to 500\n" +
                        "• Flatulence\n" +
                        "• Inhibit gram-positive bacteria (much less than conventional antibiotics)\n" +
                        "• Inhibits tobacco smoke mutagenicity, nitrosamine formation, and lymphoma growth while increasing enzyme detoxification in the liver\n" +
                        "• Jaundice\n" +
                        "• Menstrual difficulties\n" +
                        "• Pain\n" +
                        "• Toothache\n" +
                        "• Trauma"
            }
            "Cynara scolymus (Artichoke)", "Artichoke (Cynara scolymus)" -> {
                text = "• Cholecystitis (Gallbladder disease)\n" +
                        "• Cholelithiasis (Gallstones)\n" +
                        "• Hepatitis\n" +
                        "• Alcohol-related liver disorders\n" +
                        "• Anemia\n" +
                        "• Dyspepsia\n" +
                        "• Hypercholesterolemia"
            }
            "Datura stramonium (Jimson weed, Thornapple)", "Jimson weed (Datura stramonium)" -> {
                text =
                    "• Asthma in combination with other herbs i.e. Belladonna, Lobelia, Ephedra\n" +
                            "• Cerebral irritation\n" +
                            "• Convulsive cough\n" +
                            "• Destructive delirium\n" +
                            "• Localized and superficial pain\n" +
                            "• Pain of sciatica and rheumatism topically\n" +
                            "• Paralysis agitans and other forms of tremor\n" +
                            "• Restlessness\n" +
                            "• Spasms with pain"
            }
            "Dioscorea villosa (Wild yam)", "Wild yam (Dioscorea villosa)" -> {
                text = "• Amenorrhea\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Cystitis\n" +
                        "• Dysmenorrhea\n" +
                        "• Endometriosis\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibrocystic breast disease\n" +
                        "• PMS\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Flatulence\n" +
                        "• Hormonal imbalance\n" +
                        "• Low progesterone/high estrogen related problems\n" +
                        "• Menorrhagia\n" +
                        "• Nausea of pregnancy\n" +
                        "• Neuralgia due to poor circulation\n" +
                        "• Paroxysmal pain due to contraction of non-striated musculature of tubular organs caused by irritation and gradually relieved by pressure\n" +
                        "• Spontaneous abortions\n" +
                        "• Threatened miscarriage\n" +
                        "• Uterine cramps\n" +
                        "• UTI"
            }
            "Echinacea angustifolia (Purple cone flower)", "Purple cone flower (Echinacea angustifolia)" -> {
                text = "• AIDS\n" +
                        "• Bronchitis\n" +
                        "• Crohn's disease\n" +
                        "• Cystitis\n" +
                        "• Herpes simplex\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Mastitis\n" +
                        "• Otitis media\n" +
                        "• Peptic ulcer\n" +
                        "• Rosacea\n" +
                        "• Ulcerative colitis\n" +
                        "• Infections - colds\n" +
                        "• Insect stings\n" +
                        "• Poisoning\n" +
                        "• Recurrent boils, acne, skin problems\n" +
                        "• Snake bites\n" +
                        "• Tonsilitis"
            }
            "Eleutherococcus senticosus (Siberian ginseng)", "Siberian ginseng (Eleutherococcus senticosus)" -> {
                text = "• Bipolar disorder\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Depression\n" +
                        "• Diabetes\n" +
                        "• Insomnia\n" +
                        "• Memory loss\n" +
                        "• Multiple sclerosis\n" +
                        "• Schizophrenia\n" +
                        "• Any disease where fatigue appears to slow the mental processes or drain the adrenal glands\n" +
                        "• Hyperlipidemia\n" +
                        "• Hypotension\n" +
                        "• Malignant arrhythmias\n" +
                        "• Radiation recovery"
            }
            "Ephedra sinica (Ma huang)", "Ma huang (Ephedra sinica)" -> {
                text = "• Allergies\n" +
                        "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Obesity\n" +
                        "• Cough\n" +
                        "• Hayfever\n" +
                        "• Influenza and common cold\n" +
                        "• Upper respiratory infections"
            }
            "Equisetum arvense (Shave grass, Horsetail)", "Shave grass (Equisetum arvense)" -> {
                text = "• Cystitis\n" +
                        "• Osteoporosis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Stress Incontinence\n" +
                        "• Enuresis\n" +
                        "• Edema of the legs due to metabolic disorders\n" +
                        "• Hematuria\n" +
                        "• Prostatitis\n" +
                        "• Renal calculi\n" +
                        "• Urethritis\n" +
                        "• UTI"
            }
            "Eriodictyon californicum (Yerba santa)", "Yerba santa (Eriodictyon californicum)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Cystitis\n" +
                        "• Any condition with a cough and poor expectoration\n" +
                        "• Colds\n" +
                        "• Hay fever\n" +
                        "• Laryngitis\n" +
                        "• Topically:\n" +
                        "Bruises\n" +
                        "Inflammations\n" +
                        "Rheumatic pain"
            }
            "Eschscholzia californica (California poppy)", "California poppy (Eschscholzia californica)" -> {
                text = "• Attention deficit disorder\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Insomnia, especially in children"
            }
            "Euphrasia officinalis (Eyebright)", "Eyebright (Euphrasia officinalis)" -> {
                text = "• Asthma\n" +
                        "• Otitis media\n" +
                        "• Blepharitis, can be used as a compress over the eye\n" +
                        "• Conjunctivitis\n" +
                        "• Eye problems that involve sore, itchy eyes which have a discharge\n" +
                        "• Hay fever\n" +
                        "• Hordeolum\n" +
                        "• Nasal congestion\n" +
                        "• Pharyngitis\n" +
                        "• Sinusitis"
            }
            "Filipendula ulmaria (Meadowsweet)", "Meadowsweet (Filipendula ulmaria)" -> {
                text = "• Fibromyalgia\n" +
                        "• Gout\n" +
                        "• Headache\n" +
                        "• Osteoarthritis\n" +
                        "• Peptic ulcer disease, against ulcerogenic aspirin and ethanol in animal studies\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Heartburn\n" +
                        "• Hyperacidity\n" +
                        "• Nausea"
            }
            "Foeniculum v• ulgare (Fennel)", "Fennel (Foeniculum vulgare)" -> {
                text = "• Constipation\n" +
                        "• Hepatitis\n" +
                        "• Cough\n" +
                        "• Flatulence\n" +
                        "• Indigestion"
            }
            "Fucus vesiculosus (Bladderwrack, Kelp)", "Bladderwrack (Fucus vesiculosus)" -> {
                text = "• Chronic fatigue syndrome\n" +
                        "• Hypothyroidism\n" +
                        "• Multiple sclerosis\n" +
                        "• Obesity associated with hypothyroidism\n" +
                        "• Rheumatoid arthritis (external poultice)\n" +
                        "• Any condition where fatigue is a complication"
            }
            "Galium aparine (Cleavers, Bed straw)", "Cleavers (Galium aparine)" -> {
                text = "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Cystitis\n" +
                        "• Eczema\n" +
                        "• Otitis media\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Bladder problems\n" +
                        "• Cancer - involving the lymph system\n" +
                        "• Dysuria\n" +
                        "• Enuresis in children\n" +
                        "• Kidney problems\n" +
                        "• Lymphadenophy\n" +
                        "• Urinary lithiasis"
            }
            "Gelsemium sempervirens (Yellow jasmine, Gelsemium)", "Yellow jasmine (Gelsemium sempervirens)" -> {
                text = "• Endometrosis\n" +
                        "• Insomnia, in small doses\n" +
                        "• Urinary tract irritation with scarce urine"
            }
            "Gentiana lutea (Gentian)", "Gentian (Gentiana lutea)" -> {
                text = "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Dyspepsia\n" +
                        "• Gastritis\n" +
                        "• Heartburn"
            }
            "Geranium maculatum (Wild geranium, Cranesbill)", "Wild geranium (Geranium maculatum)" -> {
                text = "• Crohn's disease\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Peptic ulcer\n" +
                        "• Rosacea\n" +
                        "• Ulcerative colitis - geranium and hydrastis together tend to stop intestinal bleeding and suppuration\n" +
                        "• Chronic or sub acute bowel disorders - dries long-standing thick secretions, promotes solid stool formation\n" +
                        "• Diarrhea\n" +
                        "• Mucosal inflammations"
            }
            "Ginkgo biloba (Ginkgo)", "Ginkgo (Ginkgo biloba)" -> {
                text = "• Aging prevention\n" +
                        "• Alzheimer's disease\n" +
                        "• Atherosclerosis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Congestive heart failure\n" +
                        "• Depression\n" +
                        "• Eczema\n" +
                        "• Hypertension\n" +
                        "• Hypothyroidism\n" +
                        "• Impotence\n" +
                        "• Macular degeneration\n" +
                        "• Memory loss\n" +
                        "• Migraine headache\n" +
                        "• Multiple sclerosis\n" +
                        "• Ovarian cancer\n" +
                        "• Schizophrenia\n" +
                        "• Bed wetting\n" +
                        "• Chemical toxicity\n" +
                        "• Coronary ischemia\n" +
                        "• Degenerative diseases\n" +
                        "• Dementia\n" +
                        "• Diabetic retinopathy\n" +
                        "• Dizziness and disturbed equilibrium\n" +
                        "• Erectile dysfunction\n" +
                        "• Hearing loss, tinnitus\n" +
                        "• Inappropriate platelet aggregation\n" +
                        "• Intermittent claudication\n" +
                        "• Migraines due to its ability to stabilize platelets and serotonin levels in the brain\n" +
                        "• Raynauds disease\n" +
                        "• Retinal insufficiency\n" +
                        "• Senility\n" +
                        "• Varicose veins"
            }
            "Glycyrrhiza glabra (Licorice)", "Licorice (Glycyrrhiza glabra)" -> {
                text = "• AIDS\n" +
                        "• Allergies\n" +
                        "• Amenorrhea\n" +
                        "• Anorexia nervosa\n" +
                        "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Cancer prevention\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Constipation\n" +
                        "• Crohn's disease\n" +
                        "• Cystitis\n" +
                        "• Eczema\n" +
                        "• Endometriosis\n" +
                        "• Fertility/Infertility\n" +
                        "• Hepatitis\n" +
                        "• Herpes simplex\n" +
                        "• Mastitis\n" +
                        "• Menopause\n" +
                        "• Osteoporosis\n" +
                        "• Otitis media\n" +
                        "• Peptic ulcer\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Ulcerative colitis\n" +
                        "• Acute intermittent porphyria\n" +
                        "• Adrenal fatigue\n" +
                        "• All throat and bronchial irritations\n" +
                        "• Bacteria infections\n" +
                        "• Catarrh\n" +
                        "• Coughs\n" +
                        "• Gastritis\n" +
                        "• Hypoglycemia\n" +
                        "• Immune deficient states\n" +
                        "• Liver diseases - mononucleosis (where the liver enzymes are abnormally high)\n" +
                        "• Urinary tract irritation\n" +
                        "• Viral infections"
            }
            "Grindelia camporum (Gumweed)", "Gumweed (Grindelia camporum)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Dermatitis, especially poison oak rash, eczema and insect bite\n" +
                        "• Emphysema\n" +
                        "• Hayfever"
            }
            "Gymnema sylvestre (Gymnema)", "Gymnema (Gymnema sylvestre)" -> {
                text = "• Diabetes, type I and II"
            }
            "Hamamelis virginiana (Witch hazel)", "Witch hazel (Hamamelis virginiana)" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Eczema\n" +
                        "• Hemorrhoids\n" +
                        "• Incontinence\n" +
                        "• Bruises\n" +
                        "• Eye Inflammations, use as a compress\n" +
                        "• Sprains\n" +
                        "• Varicose veins"
            }
            "Harpagophytum procumbens (Devil's claw, Grapple plant)", "Devil's claw (Harpagophytum procumbens)" -> {
                text = "• Cholecystitis\n" +
                        "• Cholelithiasiss\n" +
                        "• Gout\n" +
                        "• Obesity\n" +
                        "• Osteoarthritis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Dyspepsia\n" +
                        "• Hypercholesterolemia\n" +
                        "• Hyperlipidemia"
            }
            "Humulus lupulus (Hops)", "Hops (Humulus lupulus)" -> {
                text = "• Crohn's disease\n" +
                        "• Dysmenorrhea, taken prior to onset of pain\n" +
                        "• Insomnia\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Menopause\n" +
                        "• Externally, ulcers\n" +
                        "• Nervous stomach"
            }
            "Hydrastis canadensis (Goldenseal)", "Goldenseal (Hydrastis canadensis)" -> {
                text = "• AIDS\n" +
                        "• Allergies\n" +
                        "• Anorexia nervosa\n" +
                        "• Aphthous stomatitis or erosion of mucous surfaces\n" +
                        "• Crohn's disease\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Mastitis\n" +
                        "• Otitis media\n" +
                        "• Peptic ulcer\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rosacea\n" +
                        "• Ulcerative colitis\n" +
                        "• Uterine fibroid\n" +
                        "• Atonic gastric irritability\n" +
                        "• Catarrhal states of mucous membranes\n" +
                        "• Colds\n" +
                        "• Conjunctivitis\n" +
                        "• Flu\n" +
                        "• Ice water dyspepsia\n" +
                        "• Infections - Staph and Strep\n" +
                        "• Lack of bowel coordination\n" +
                        "• Muscular atony\n" +
                        "• Passive hemorrhages from the pelvic organs\n" +
                        "• Prolapse\n" +
                        "• Vaginitis"
            }
            "Hypericum perforatum (St. John's wort)", "Saint John's wort (Hypericum perforatum)" -> {
                text = "• AIDS\n" +
                        "• Anorexia nervosa\n" +
                        "• Bipolar disorder\n" +
                        "• Depression\n" +
                        "• Hemorroids\n" +
                        "• Herpes simplex , types 1 and 2\n" +
                        "• Incontinence\n" +
                        "• Insomnia\n" +
                        "• Migraine headaches\n" +
                        "• Otitis media\n" +
                        "• Antibacterial against both gram positive and negative bacteria, including:\n" +
                        "• Escherichia coli\n" +
                        "• Proteus vulgaris\n" +
                        "• Pseudomonas aeruginosa\n" +
                        "• Staphylococcus aureus\n" +
                        "• Streptococcus mutans\n" +
                        "• Antiviral against Epsteine-Barr virus\n" +
                        "• Antiviral against influenza types A and B\n" +
                        "• Antiviral against vesicular stomatitis virus\n" +
                        "• Circulatory disorders\n" +
                        "• Facial neuralgia after dental extractions\n" +
                        "• Seasonal affective disorder (SAD)\n" +
                        "• Topically:\n" +
                        "• Antibacterial wounds\n" +
                        "• Burns\n" +
                        "• Muscular pain\n" +
                        "• Toothache"
            }
            "Hyssopus officinalis (Hyssop)", "Hyssop (Hyssopus officinalis)" -> {
                text = "• Bronchitis\n" +
                        "• Herpes simplex\n" +
                        "• Anxiety\n" +
                        "• Burns - as a compress\n" +
                        "• Cold\n" +
                        "• Coughs\n" +
                        "• Dyspepsia\n" +
                        "• Influenza\n" +
                        "• Petit mal"
            }
            "Inula helenium (Elecampane)", "Elecampane (Inula helenium)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Herpes simplex, externally\n" +
                        "• Peptic ulcer\n" +
                        "• Coughs, especially irritating bronchial coughs in children\n" +
                        "• Emphysema\n" +
                        "• Scabies, externally\n" +
                        "• Silicosis\n" +
                        "• Sinusitis\n" +
                        "• Tuberculosis"
            }
            "Juniperis communis (Juniper)", "Juniper (Juniperis communis)" -> {
                text = "• Amenorrhea\n" +
                        "• Cystitis\n" +
                        "• Dysmenorrhea\n" +
                        "• Gout\n" +
                        "• Osteoarthritis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Atonic liver conditions\n" +
                        "• Bed wetting\n" +
                        "• Dyspepsia\n" +
                        "• Edema from renal suppression\n" +
                        "• Kidney infection with atony\n" +
                        "• Neuralgic pain\n" +
                        "• Renal congestion\n" +
                        "• Sciatica\n" +
                        "• Urethritis"
            }
            "Larrea tridentata (Chapparrel, Creosote bush, Creosotum)", "Chapparrel (Larrea tridentata)" -> {
                text = "• Otitis media\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Any infectious or inflammatory process\n" +
                        "• Neoplasm\n" +
                        "• Skin lesions (use externally)\n" +
                        "• Upper respiratory infections\n" +
                        "• UTI"
            }
            "Lavendula angustifolia (Lavender)", "Lavender (Lavendula angustifolia)" -> {
                text = "• Attention deficit disorder\n" +
                        "• Bipolar disorder\n" +
                        "• Depression\n" +
                        "• Headaches related to stress\n" +
                        "• Insomnia\n" +
                        "• Chest infections, use in steam inhalation\n" +
                        "• Insect stings, use topically\n" +
                        "• Insomnia\n" +
                        "• Rheumatic pain, use topically"
            }
            "Leonurus cardiaca (Motherwort)", "Motherwort (Leonurus cardiaca)" -> {
                text = "• Amenorrhea\n" +
                        "• Dysmenorrhea\n" +
                        "• Fertility/Infertility\n" +
                        "• Hypertension due to stress\n" +
                        "• Menopause\n" +
                        "• PMS\n" +
                        "• Heart palpitations\n" +
                        "• Herpes zoster nerve pain\n" +
                        "• Hyperthyroidism\n" +
                        "• Hyperthyroid cardiac reactions\n" +
                        "• Insomnia\n" +
                        "• Lumbar pain\n" +
                        "• Pelvic pain\n" +
                        "• Tachycardia"
            }
            "Ligusticum porteri (Osha)", "Osha (Ligusticum porteri)" -> {
                text = "• AIDS\n" +
                        "• Herpes simplex\n" +
                        "• Respiratory tract infection, especially debilitating with much mucus and congestion in the tissues\n" +
                        "• Viral infections"
            }
            "Linum usitatissimum (Flax, Linseed)", "Flax (Linum usitatissimum)" -> {
                text = "• Allergies\n" +
                        "• Cholelithiasis\n" +
                        "• Hemorrhoids due to constipation\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Boils\n" +
                        "• Constipation\n" +
                        "• GI inflammation\n" +
                        "• Irritative cough\n" +
                        "• Pharyngitis\n" +
                        "• Skin irritations\n" +
                        "• Upper respiratory infections"
            }
            "Lobelia inflata (Indian tobacco, Puke weed)", "Indian tobacco (Lobelia inflata)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Rheumatoid arthritis - pain\n" +
                        "• Angina pectoris pain\n" +
                        "• Bradycardia\n" +
                        "• Contact dermatitis from poison oak, insect bites and stings (use topically)\n" +
                        "• Contusion pain\n" +
                        "• Dyspnea\n" +
                        "• Emetic\n" +
                        "• Gastric stimulant to augment appetite and stimulate peristalsis\n" +
                        "• Muscle spasms\n" +
                        "• Muscular rigidity during labor\n" +
                        "• Neuralgia\n" +
                        "• Nicotine withdrawal due to the similarity to nicotine on autonomic ganglia\n" +
                        "• Orchitis pain\n" +
                        "• Pharyngitis pain\n" +
                        "• Pleurisy\n" +
                        "• Pleurodynia\n" +
                        "• Tonsillitis pain\n" +
                        "• Whooping cough"
            }
            "Lomatium disectum (Desert parsley)", "Desert parsley (Lomatium disectum)" -> {
                text = "• Bronchitis\n" +
                        "• Viral infections, especially Epstein Barr virus, condlyloma and herpes simplex virus\n" +
                        "• Gastrointestinal infections\n" +
                        "• Genitourinary infections"
            }
            "Marrubium vulgare (Horehound)", "Horehound (Marrubium vulgare)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Hypertension\n" +
                        "• Dyspepsia\n" +
                        "• Extrasystolic arrhythmia\n" +
                        "• Upper respiratory tract infections"
            }
            "Matricaria chamomilla (German chamomile)", "German chamomile (Matricaria chamomilla)" -> {
                text = "• Asthma (use as steam inhalation)\n" +
                        "• Bipolar disorder\n" +
                        "• Eczema (use externally to soothe)\n" +
                        "• Insomnia\n" +
                        "• Otitis media (very safe for children)\n" +
                        "• Anxiety\n" +
                        "• Dyspepsia\n" +
                        "• Gastritis\n" +
                        "• Gingivitis\n" +
                        "• Hyperactive children\n" +
                        "• Insomnia\n" +
                        "• Pharyngitis\n" +
                        "• PMS migraines\n" +
                        "• Teething babies"
            }
            "Medicago sativa (Alfalfa)", "Alfalfa (Medicago sativa)" -> {
                text = "• Atherosclerosis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Eczema\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Menopause\n" +
                        "• Osteoarthritis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Anemia\n" +
                        "• Hormonal imbalances\n" +
                        "• Malnutrition, wasting, chronic disease, weakness\n" +
                        "• Slow blood coagulation"
            }
            "Melaleuca alternifolia (Tea tree)", "Tea tree (Melaleuca alternifolia)" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Candidiasis, daily douche with 1 quart of water and 0.4 % concentration of the oil\n" +
                        "• Acne\n" +
                        "• Bromhidrosis\n" +
                        "• Onychomycosis, in conjunction with debridement\n" +
                        "• Pharyngitis\n" +
                        "• Sinusitis\n" +
                        "• Tinea pedis, massaged into the feet daily\n" +
                        "• Trichomonas vaginalis"
            }
            "Melissa officinalis (Lemon balm)", "Lemon balm (Melissa officinalis)" -> {
                text = "• Amenorrhea\n" +
                        "• Attention deficit disorder\n" +
                        "• Depression\n" +
                        "• Eczema\n" +
                        "• Herpes simplex\n" +
                        "• Hypertension\n" +
                        "• Nervous headaches\n" +
                        "• Dyspepsia\n" +
                        "• Graves disease\n" +
                        "• Insomnia\n" +
                        "• Vegetative dystonia"
            }
            "Mentha piperita (Peppermint)", "Peppermint (Mentha piperita)" -> {
                text = "• Candidiasis\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Crohn's disease\n" +
                        "• Dysmenorrhea\n" +
                        "• Herpes simplex\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Memory loss\n" +
                        "• Otitis media\n" +
                        "• Peptic ulcer\n" +
                        "• Ulcerative colitis\n" +
                        "• Anxiety\n" +
                        "• Cellulitis\n" +
                        "• Colic\n" +
                        "• Common cold\n" +
                        "• Constipation\n" +
                        "• Cramps\n" +
                        "• Diarrhea\n" +
                        "• Enteritis\n" +
                        "• Fatigue\n" +
                        "• Flatulent dyspepsia\n" +
                        "• Gastritis\n" +
                        "• Heartburn\n" +
                        "• Indigestion\n" +
                        "• Influenza A virus\n" +
                        "• Migraine headache - associalted with digestion\n" +
                        "• Mumps\n" +
                        "• Senility"
            }
            "Mitchella repens (Squawvine, Partridge berry)", "Squawvine (Mitchella repens)" -> {
                text = "• Amenorrhea\n" +
                        "• Dysmenorrhea\n" +
                        "• Incontinence\n" +
                        "• Infertility\n" +
                        "• Threatened spontaneous abortion"
            }
            "Momordica charantia (Bitter melon)", "Bitter melon (Momordica charantia)" -> {
                text = "• Diabetes mellitus\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Systemic lupus erythematosus (SLE)\n" +
                        "• Graft rejections\n" +
                        "• Organ transplant rejections"
            }
            "Nepeta cataria (Catnip)", "Catnip (Nepeta cataria)" -> {
                text = "• Attention deficit disorder\n" +
                        "• Bronchitis\n" +
                        "• Dyspepsia\n" +
                        "• Influenza"
            }
            "Oplopanax horridum (Devil's club)", "Devil's club (Oplopanax horridum)" -> {
                text = "• Diabetes mellitus\n" +
                        "• Improves concentration and endurance, ie memory loss\n" +
                        "• Improves stamina:\n" +
                        "• Aging\n" +
                        "• Debility\n" +
                        "• Insomnia\n" +
                        "• Sexual inadequacy\n" +
                        "• Stress"
            }
            "Panax ginseng (Chinese ginseng, Korean ginseng)", "Chinese ginseng (Panax ginseng)" -> {
                text = "• Aging prevention\n" +
                        "• Congestive heart failure\n" +
                        "• Diabetes mellitus\n" +
                        "• Fertility/Infertility\n" +
                        "• Impotence\n" +
                        "• Memory loss\n" +
                        "• Aging\n" +
                        "• Debility\n" +
                        "• Improves stamina\n" +
                        "• Insomnia\n" +
                        "• Sexual inadequacy\n" +
                        "• Stress\n\n" +
                        "• Improves concentration and endurance"
            }
            "Passiflora incarnata (Passionflower)", "Passionflower (Passiflora incarnata)" -> {
                text = "• Attention deficit disorder\n" +
                        "• Fibromyalgia\n" +
                        "• Headaches\n" +
                        "• Hypertension\n" +
                        "• Parkinson's disease\n" +
                        "• Anxiety\n" +
                        "• Epilepsy\n" +
                        "• Insomnia\n" +
                        "• Restlessness"
            }
            "Pausinystalia yohimbe (Yohimbe)", "Yohimbe (Pausinystalia yohimbe)" -> {
                text = "• Atherosclerosis\n" +
                        "• Hypertension\n" +
                        "• Impotence\n" +
                        "• Angina pectoris\n" +
                        "• Narcolepsy"
            }
            "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)", "Butterbur (Petasites hybridus)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Dysmenorrhea\n" +
                        "• Headache, tension\n" +
                        "• Migraine\n" +
                        "• Peptic ulcer\n" +
                        "• Cervical-thoracic syndrome\n" +
                        "• Cough\n" +
                        "• Cramp, intestinal\n" +
                        "• Cramp, stomach\n" +
                        "• Pain, lumbosacral\n" +
                        "• Renal calculus (kidney stone)\n" +
                        "• Vesical calculus (bladder stone)"
            }
            "Petroselinum crispum (Parsley)", "Parsley (Petroselinum crispum)" -> {
                text = "• Congestive heart failure\n" +
                        "• Cystitis\n" +
                        "• Gout\n" +
                        "• Hypertension\n" +
                        "• Obesity\n" +
                        "• Dyspepsia\n" +
                        "• Urinary lithiasis"
            }
            "Phytolacca decandra (Poke)", "Poke (Phytolacca decandra)" -> {
                text = "• Cancer prevention\n" +
                        "• Endometriosis\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Herpes simplex\n" +
                        "• Mastitis\n" +
                        "• Uterine fibroid\n" +
                        "• Influenza\n" +
                        "• Lymphadenopathy\n" +
                        "• Mumps\n" +
                        "• Parotitis\n" +
                        "• Pharyngitis\n" +
                        "• Tonsillitis\n" +
                        "• Upper respiratory infections"
            }
            "Pimpinella anisum (Anise)", "Anise (Pimpinella anisum)\n" -> {
                text = "• Bronchitis\n" +
                        "• Cough\n" +
                        "• Flatulence\n" +
                        "• Indigestion"
            }
            "Piper methysticum (Kava kava)", "Kava kava (Piper methysticum)" -> {
                text = "• Asthma\n" +
                        "• Attention deficit disorder (and hyperactivity syndrome)\n" +
                        "• Bipolar disorder\n" +
                        "• Cholecystitis, acute\n" +
                        "• Depression\n" +
                        "• Fibromyalgia\n" +
                        "• Headache, tension\n" +
                        "• Insomnia\n" +
                        "• Anxiety\n" +
                        "• Insomnia\n" +
                        "• Interstitial cystitis, pain and spasms\n" +
                        "• Muscle spasms, pain and inflammation\n" +
                        "• Stroke recovery\n" +
                        "• Ureter spasms"
            }
            "Piscidia piscipula (Jamaican dogwood)", "Jamaican dogwood (Piscidia piscipula)" -> {
                text = "• Asthma\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Dysmenorrhea\n" +
                        "• Fibromyalgia\n" +
                        "• Headache\n" +
                        "• Insomnia\n" +
                        "• Migraine headache\n" +
                        "• Neuralgia"
            }
            "Polygonum multiflorum (Fo-ti, He-shou-wu)", "Fo-ti (Polygonum multiflorum)" -> {
                text = "• Aging prevention\n" +
                        "• Atherosclerosis\n" +
                        "• Bronchitis\n" +
                        "• Diabetes\n" +
                        "• Hypertension\n" +
                        "• Insomnia\n" +
                        "• Schizophrenia\n" +
                        "• Anemia\n" +
                        "• Boil\n" +
                        "• Carbuncle\n" +
                        "• Infertility, male - due to weak seminal emission\n" +
                        "• Lymphadema\n" +
                        "• Musculoskeletal pain:\n" +
                        "• Knee\n" +
                        "• Leg numbness\n" +
                        "• Lower back\n" +
                        "• Premature gray hair\n" +
                        "• Vaginal discharge - white or yellowish\n" +
                        "• Vertigo"
            }
            "Pygeum africanum (Pygeum)", "Pygeum (Pygeum africanum)" -> {
                text = "• BPH\n" +
                        "• Impotence\n" +
                        "• Male infertility\n" +
                        "• Prostatitis"
            }
            "Rhamnus frangula (Buckthorn)", "Buckthorn (Rhamnus frangula)" -> {
                text = "• Cancer prevention\n" +
                        "• Chronic constipation"
            }
            "Rhamnus purshiana (Cascara)", "Cascara (Rhamnus purshiana)" -> {
                text = "• Cancer prevention\n" +
                        "• Chronic constipation"
            }
            "Rheum officinalis (Rhubarb)", "Rhubarb (Rheum officinalis)" -> {
                text = "• Cholelithiasis\n" +
                        "• Jaundice\n" +
                        "• Constipation\n" +
                        "• Diabetic nephropathy\n" +
                        "• Gallbladder diseases\n" +
                        "• Liver diseases\n" +
                        "• Nephritis"
            }
            "Rosmarius officinalis (Rosemary)", "Rosemary (Rosmarius officinalis)" -> {
                text = "• Any condition that causes fatigue, ie multiple sclerosis\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Congestive heart failure\n" +
                        "• Depression\n" +
                        "• Headache\n" +
                        "• Memory loss\n" +
                        "• Multiple sclerosis\n" +
                        "• Dyspepsia\n" +
                        "• Flatulence\n" +
                        "• Muscular pain - externally in a poultice\n" +
                        "• Neuralgia - externally in a poultice\n" +
                        "• Premature baldness\n" +
                        "• Psychological tension\n" +
                        "• Sciatica - externally in a poultice"
            }
            "Rumex crispis (Yellow dock, Curly dock)", "Yellow dock (Rumex crispis)" -> {
                text = "• Osteoporosis\n" +
                        "• Anemia\n" +
                        "• Chronic skin disorders\n" +
                        "• Chronic sore throat with glandular engorgement and hypersecretion\n" +
                        "• Digestive dysfunction\n" +
                        "• Dry, irritative laryngeal cough\n" +
                        "• Nervous dyspepsia with epigastric fullness and pain extending into the chest"
            }
            "Ruscus aculeatus (Butcher's broom)", "Butcher's broom (Ruscus aculeatus)" -> {
                text = "• Hemorrhoids\n" +
                        "• Varicose veins"
            }
            "Salvia miltiorrhiza (Danshen)", "Danshen (Salvia miltiorrhiza)" -> {
                text = "• Aging prevention\n" +
                        "• Atherosclerosis\n" +
                        "• Hypertension\n" +
                        "• Coronary heart disease\n" +
                        "• Hemorrhage\n" +
                        "• Kidney failure\n" +
                        "• Metorrhagia"
            }
            "Salvia officinalis (Sage)", "Sage (Salvia officinalis)" -> {
                text = "• Amenorrhea\n" +
                        "• Aphthous stomatitis\n" +
                        "• Dysmenorrhea\n" +
                        "• Hot flashes associated with menopause (due to anti-hidrotic property)\n" +
                        "• Dyspepsia\n" +
                        "• Gingivitis\n" +
                        "• Glossitis\n" +
                        "• Laryngitis\n" +
                        "• Pharyngitis\n" +
                        "• Quincy\n" +
                        "• Tonsillitis"
            }
            "Sambucus canadensis, nigra (Elder)", "Elder (Sambucus canadensis, nigra)" -> {
                text = "• Otitis media\n" +
                        "• Colds\n" +
                        "• Hayfever\n" +
                        "• Influenza\n" +
                        "• Skin disorders when tissues are full, flabby and edematous"
            }
            "Sanguinaria canadensia (Blood root)", "Blood root (Sanguinaria canadensia)" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Laryngitis\n" +
                        "• Nasal polypi"
            }
            "Schisandra chinensis (Wu wei zi)", "Wu wei zi (Schisandra chinensis)" -> {
                text = "• Asthma\n" +
                        "• Bipolar disorder\n" +
                        "• Depression\n" +
                        "• Hepatitis\n" +
                        "• Insomnia\n" +
                        "• Immunodeficient states\n" +
                        "• Insomnia\n" +
                        "• Night sweats\n" +
                        "• Prolonged diarrhea"
            }
            "Scutellaria laterifolia (Skullcap)", "Skullcap (Scutellaria laterifolia)" -> {
                text = "• Bipolar disorder\n" +
                        "• Depression\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Hypertension\n" +
                        "• Insomnia\n" +
                        "• PMS\n" +
                        "• Anxiety\n" +
                        "• Epilepsy\n" +
                        "• Hysterical states\n" +
                        "• Insomnia\n" +
                        "• Muscular pain and inflammation\n" +
                        "• Seizures"
            }
            "Serenoa repens (Saw palmetto)", "Saw palmetto (Serenoa repens)" -> {
                text = "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Impotence\n" +
                        "• Chronic emaciating diseases where there is weight loss, weakness, debility and tissue wasting\n" +
                        "• Dysuria\n" +
                        "• Low libido\n" +
                        "• Urinary lithiasis"
            }
            "Silybum marianum (Milk thistle)", "Milk thistle (Silybum marianum)" -> {
                text = "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Hepatitis\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Amanita phalloides poisoning\n" +
                        "• Cirrhosis\n" +
                        "• Cholangitis\n" +
                        "• Detoxification\n" +
                        "• Fatty infiltration of the liver"
            }
            "Smilax sarsaparilla (Sarsaparilla)", "Sarsaparilla (Smilax sarsaparilla)" -> {
                text = "• Amenorrhea\n" +
                        "• Eczema\n" +
                        "• Fertility/Infertility\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Hormonal balancing in women and men"
            }
            "Spilanthes acmella (Paracress)", "Paracress (Spilanthes acmella)" -> {
                text = "• Allergies\n" +
                        "• Candidiasis\n" +
                        "• Herpes simplex\n" +
                        "• Bacterial diseases\n" +
                        "• Cold\n" +
                        "• Gingivitis\n" +
                        "• Influenza\n" +
                        "• Infections\n" +
                        "• Swollen glands\n" +
                        "• Viral diseases"
            }
            "Stellaria media (Chickweed)", "Chickweed (Stellaria media)" -> {
                text = "• Congestive heart failure\n" +
                        "• Gout\n" +
                        "• Hypertension\n" +
                        "• Obesity\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis"
            }
            "Sticta pulmonaria (Lungwort)", "Lungwort (Sticta pulmonaria)" -> {
                text = "• Bronchitis\n" +
                        "• Headaches that accompany hayfever and colds\n" +
                        "• Irritative cough\n" +
                        "• Muscle aching of influenza\n" +
                        "• Muscle aching of URI\n" +
                        "• Pulmonary inflammations"
            }
            "Stillingia sylvatica (Queen's root)", "Queen's root (Stillingia sylvatica)" -> {
                text = "• Bronchitis\n" +
                        "• Cancer prevention\n" +
                        "• Eczema\n" +
                        "• Hemorrhoids\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Laryngitis"
            }
            "Symphytum officinale (Comfrey)", "Comfrey (Symphytum officinale)" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Bronchitis\n" +
                        "• Constipation\n" +
                        "• Eczema\n" +
                        "• Peptic ulcer disease\n" +
                        "• Psoriasis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Ulcerative colitis\n" +
                        "• Chronic varicose ulcers\n" +
                        "• External ulcers, use as a compress or poultice\n" +
                        "• Fractures, use as a compress or poultice"
            }
            "Symplocarpus foetida (Skunk cabbage)", "Skunk cabbage (Symplocarpus foetida)" -> {
                text = "• Asthma\n" +
                        "• Chorea\n" +
                        "• Chronic catarrh\n" +
                        "• Chronic rheumatism\n" +
                        "• Colds\n" +
                        "• Hysteria\n" +
                        "• Influenza\n" +
                        "• Respiratory congestion\n" +
                        "• Stimulates granulations and eases pain when applied topically"
            }
            "Tabebuia impetiginosa (Pau d' arco)", "Pau d' arco (Tabebuia impetiginosa)" -> {
                text = "• Candidiasis\n" +
                        "• Herpes simplex\n" +
                        "• Cancer"
            }
            "Tanacetum parthenium) (Feverfew)", "Feverfew (Tanacetum parthenium)" -> {
                text = "• Asthma, during an attack\n" +
                        "• Dysmenorrhea\n" +
                        "• Insomnia\n" +
                        "• Migraine headache\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Dizziness\n" +
                        "• Dyspepsia\n" +
                        "• Tinnitus\n" +
                        "• Vomiting"
            }
            "Taraxacum officinale (Dandelion, Lion's tooth)", "Dandelion (Taraxacum officinale)" -> {

                text = "• Amenorrhea\n" +
                        "• Anorexia nervosa\n" +
                        "• Cholecystitis\n" +
                        "• Cholelithiasis\n" +
                        "• Constipation\n" +
                        "• Diabetes mellitus\n" +
                        "• Eczema\n" +
                        "• Fertility/Infertility\n" +
                        "• Hepatitis\n" +
                        "• Hypertension\n" +
                        "• Obesity\n" +
                        "• Osteoporosis\n" +
                        "• PMS\n" +
                        "• Uterine fibroid\n" +
                        "• Antimicrobial - Proteus, Escherichia, Salmonella\n" +
                        "• Bile duct inflammation\n" +
                        "• Cancer - in animal studies\n" +
                        "• Chronic degenerative disease\n" +
                        "• Diabetes - in animal studies\n" +
                        "• Fluid retention\n" +
                        "• Jaundice\n" +
                        "• Liver congestion\n" +
                        "• Weak digestion"
            }
            "Taxus brevifolia (Yew)", "Yew (Taxus brevifolia)" -> {
                text = "• Advanced breast carcinomas\n" +
                        "• Central nervous system carcinoma\n" +
                        "• Cancer - colon, ovarian\n" +
                        "• Hepatocellular carcinoma\n" +
                        "• Kidney carcinoma\n" +
                        "• Leukemias\n" +
                        "• Lung carcinoma\n" +
                        "• Melanomas\n" +
                        "• Pancreatic carcinoma"
            }
            "Thuja plicata, occidentalis (Western cedar)", "Western cedar (Thuja plicata, occidentalis)" -> {
                text = "• Amenorrhea\n" +
                        "• Aphthous stomatitis\n" +
                        "• Bronchitis\n" +
                        "• Cystitis\n" +
                        "• Herpes simplex\n" +
                        "• Psoriasis\n" +
                        "• Rheumatoid arthritis - use as a compress\n" +
                        "• Stress Incontinence\n" +
                        "• Impetigo - use externally\n" +
                        "• Ringworm\n" +
                        "• Warts - use externally"
            }
            "Thymus vulgaris (Thyme)", "Thyme (Thymus vulgaris)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Candidiasis\n" +
                        "• Ascarids\n" +
                        "• Bed wetting\n" +
                        "• Coughs\n" +
                        "• Dyspepsia\n" +
                        "• Flatulence\n" +
                        "• Hookworm\n" +
                        "• Influenza\n" +
                        "• Laryngitis\n" +
                        "• Tonsillitis\n" +
                        "• Whooping couh"
            }
            "Tilia europaea (Linden flower, Lime blossom)", "Linden flower (Tilia europaea)" -> {
                text = "• Hypertension\n" +
                        "• Arteriosclerosis\n" +
                        "• Colds\n" +
                        "• Migraine"
            }
            "Trifollium pratense (Red clover)", "Red clover (Trifollium pratense)" -> {
                text = "• Bronchitis\n" +
                        "• Cancer prevention\n" +
                        "• Eczema\n" +
                        "• Chronic skin diseases\n" +
                        "• Laryngitis\n" +
                        "• Malignant neoplasms - after removal, patients are slower in redeveloping new growths when given trifolium daily\n" +
                        "• Pertussis"
            }
            "Trigonella foenum-graecum (Fenugreek)", "Fenugreek (Trigonella foenum-graecum)" -> {
                text = "• Bronchitis\n" +
                        "• Diabetes mellitus\n" +
                        "• Impotence\n" +
                        "• Menopause"
            }
            "Trillium erectum (Beth root)", "Beth root (Trillium erectum)" -> {
                text = "• Bronchitis with profuse expectoration\n" +
                        "• Uterine fibroid\n" +
                        "• External ulcers - use as a poultice or ointment\n" +
                        "• Menorrhagia\n" +
                        "• Metorrhagia\n" +
                        "• Uterine hemorrhage"
            }
            "Tussilago farfara (Colt's foot)", "Colt's foot (Tussilago farfara)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Coughs\n" +
                        "• Emphysema\n" +
                        "• Pharyngitis"
            }
            "Ulmus fulva (Slippery elm, American elm)", "Slippery elm (Ulmus fulva)" -> {
                text = "• Crohn's Disease\n" +
                        "• Irritable bowel syndrome\n" +
                        "• Peptic ulcer\n" +
                        "• Rosacea\n" +
                        "• Ulcerative colitis\n" +
                        "• Coughs\n" +
                        "• Gastritis\n" +
                        "• Pharyngitis\n" +
                        "• Vaginitis"
            }
            "Urtica urens (Nettles)", "Nettles (Urtica urens)" -> {
                text = "• Allergies\n" +
                        "• Asthma\n" +
                        "• Benign prostatic hypertrophy (BPH)\n" +
                        "• Congestive heart failure and venous insufficiency\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Chronic cystitis\n" +
                        "• Eczema in infants\n" +
                        "• Gout\n" +
                        "• Multiple sclerosis\n" +
                        "• Osteoarthritic\n" +
                        "• Alopecia after an illness\n" +
                        "• Chronic tendonitis\n" +
                        "• Neuralgic\n" +
                        "• Sciatic pain\n" +
                        "• Sprains\n" +
                        "• Topically for cutaneous nerve irritation"
            }
            "Usnea spp. (Old man's beard)", "Old man's beard (Usnea spp.)" -> {
                text = "• Bronchitis\n" +
                        "• Candidiasis\n" +
                        "• Cystitis\n" +
                        "• Influenza\n" +
                        "• Pharyngitis\n" +
                        "• Upper respiratory infections"
            }
            "Vaccinium myrtillus (Bilberry)", "Bilberry (Vaccinium myrtillus)" -> {
                text = "• Cataract prevention\n" +
                        "• Diabetes mellitus\n" +
                        "• Dysmenorrhea\n" +
                        "• Gout\n" +
                        "• Macular degeneration\n" +
                        "• Peptic ulcer\n" +
                        "• Schizophrenia\n" +
                        "• Diabetic retinopathy\n" +
                        "• Glaucoma\n" +
                        "• Varicose veins"
            }
            "Valeriana officinalis (Valerian)", "Valerian (Valeriana officinalis)" -> {
                text = "• Depression\n" +
                        "• Dysmenorrhea\n" +
                        "• Fibromyalgia\n" +
                        "• Headaches\n" +
                        "• Insomnia\n" +
                        "• PMS\n" +
                        "• Migraine headache"
            }
            "Verbascum thapsus (Mullein)", "Mullein (Verbascum thapsus)" -> {
                text = "• Asthma\n" +
                        "• Bronchitis\n" +
                        "• Cystitis\n" +
                        "• Otitis media\n" +
                        "• Bactericidal\n" +
                        "• Coughs - dry and hoarse\n" +
                        "• Diarrhea\n" +
                        "• Urethritis"
            }
            "Verbena officinalis (Vervain)", "Vervain (Verbena officinalis)" -> {
                text = "• Amenorrhea\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Menopause\n" +
                        "• PMS\n" +
                        "• Uterine fibroids\n" +
                        "• Acne, associated with PMS\n" +
                        "• Insufficient lactation\n" +
                        "• Menstrual cycle irregularities"
            }
            "Viburnum opulus (Cramp bark)", "Cramp bark (Viburnum opulus)" -> {
                text = "• Dysmenorrhea\n" +
                        "• Endometriosis\n" +
                        "• Osteoporosis\n" +
                        "• Uterine fibroid\n" +
                        "• Labor tonic\n" +
                        "• Obstinate hiccough\n" +
                        "• Pain and spasm in voluntary muscles\n" +
                        "• Painful spasm of hollow organs - stomach, intestines, ureters, uterus"
            }
            "Viscum alba (Mistletoe)", "Mistletoe (Viscum alba)" -> {
                text = "• Hypertension\n" +
                        "• Cancer - ovarian, bronchial, malignant pleural effusion\n" +
                        "• Tachycardia"
            }
            "Vitex agnus castus (Chaste tree, Monk's pepper)", "Chaste tree (Vitex agnus castus)" -> {
                text = "• Amenorrhea\n" +
                        "• Fertility/Infertility\n" +
                        "• Fibrocystic breast disease\n" +
                        "• Menopause\n" +
                        "• PMS\n" +
                        "• Uterine fibroids\n" +
                        "• Acne, associated with PMS\n" +
                        "• Insufficient lactation\n" +
                        "• Menstrual cycle irregularities"
            }
            "Withania somnifera (Ashwagandha)", "Ashwagandha (Withania somnifera)" -> {
                text = "• Aging prevention\n" +
                        "• Alzheimer's\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Hypertension\n" +
                        "• Impotence due to aging or stress\n" +
                        "• Insomnia\n" +
                        "• Memory loss\n" +
                        "• Multiple sclerosis\n" +
                        "• Anemia\n" +
                        "• Aspergillus infection\n" +
                        "• Chronic inflammation\n" +
                        "• Cognitive function deficits\n" +
                        "• Depressed white blood cell count due to cytotoxic drugs\n" +
                        "• Glandular swelling\n" +
                        "• Infertility\n" +
                        "• Problems of old age"
            }
            "Yucca spp. (Yucca)", "Yucca (Yucca spp.)" -> {
                text = "• Osteoarthritis (may take 3 days - 3 months to note improvement)\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis (may take 3 days - 3 months to note improvement)"
            }
            "Zanthoxylum clava-herculis (Southern prickly ash)", "Southern prickly ash (Zanthoxylum clava-herculis)" -> {
                text = "• Aphthous stomatitis\n" +
                        "• Cancer prevention\n" +
                        "• Chronic fatigue syndrome\n" +
                        "• Congestive heart failure\n" +
                        "• Memory loss\n" +
                        "• Multiple sclerosis\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Gastric irritation with gas and burping"
            }
            "Zea mays (Corn silk)", "Corn silk (Zea mays)" -> {
                text = "• Asthma\n" +
                        "• Benign prostatic hyperplasia (BPH)\n" +
                        "• Congestive heart failure\n" +
                        "• Cystitis (safe to use with bladder/renal disorders in children)\n" +
                        "• Hypertension\n" +
                        "• Incontinence\n" +
                        "• Obesity where water loss is needed\n" +
                        "• PMS bloating\n" +
                        "• Enuresis\n" +
                        "• Prostatitis\n" +
                        "• Pyelitis\n" +
                        "• Urethritis\n" +
                        "• Urinary lithiasis"
            }
            "Zingiber officinale (Ginger)", "Ginger (Zingiber officinale)" -> {
                text = "• Atherosclerosis\n" +
                        "• Bronchitis\n" +
                        "• Congestive heart failure\n" +
                        "• Constipation\n" +
                        "• Diabetes mellitus\n" +
                        "• Hypertension\n" +
                        "• Memory loss\n" +
                        "• Migraine headache\n" +
                        "• Psoriatic arthritis\n" +
                        "• Rheumatoid arthritis\n" +
                        "• Cardiac diseases\n" +
                        "• Chemotherapy-induced vomiting using the tincture, not the tea\n" +
                        "• Colds/respiratory congestion\n" +
                        "• Inflammation\n" +
                        "• Menstrual cramps especially with oligomenorrhea\n" +
                        "• Motion sickness\n" +
                        "• Nausea of pregnancy\n" +
                        "• Post operative nausea\n" +
                        "• Stomach and intestinal cramps, especially due to undigested food, low stomach acid\n" +
                        "• Weak digestion with gas and bloating"
            }
        }
        ss = SpannableString(text)

        createLink(ss, "aging prevention", text.lowercase(), "Condition", "Aging Prevention")
        createLink(ss, "aids", text.lowercase(), "Condition", "AIDS")
        createLink(ss, "anorexia nervosa", text.lowercase(), "Condition", "Anorexia Nervosa")
        createLink(ss, "autism", text.lowercase(), "Condition", "Autism")
        createLink(
            ss,
            "attention deficit disorder",
            text.lowercase(),
            "Condition",
            "Attention Deficit Disorder"
        )
        createLink(ss, "allergies", text.lowercase(), "Condition", "Allergies")
        createLink(ss, "alzheimer's disease", text.lowercase(), "Condition", "Alzheimer's Disease")
        createLink(ss, "aphthous stomatitis", text.lowercase(), "Condition", "Aphthous Stomatitis")
        createLink(ss, "asthma", text.lowercase(), "Condition", "Asthma")
        createLink(ss, "atherosclerosis", text.lowercase(), "Condition", "Atherosclerosis")
        createLink(ss, "autism", text.lowercase(), "Condition", "Autism")
        createLink(ss, "bipolar disorder", text.lowercase(), "Condition", "Bipolar Disorder")
        createLink(ss, "bronchitis", text.lowercase(), "Condition", "Bronchitis")
        createLink(ss, "bipolar disease", text.lowercase(), "Condition", "Bipolar Disorder")
        createLink(
            ss,
            "benign prostatic hypertrophy (BPH)",
            text.lowercase(),
            "Condition",
            "Benign Prostatic Hypertrophy"
        )
        createLink(
            ss,
            "benign prostatic hypertrophy",
            text.lowercase(),
            "Condition",
            "Benign Prostatic Hypertrophy"
        )
        createLink(ss, "cancer prevention", text.lowercase(), "Condition", "Cancer Prevention")
        createLink(ss, "cataract", text.lowercase(), "Condition", "Cataract")
        createLink(ss, "cataract prevention", text.lowercase(), "Condition", "Cataract prevention")
        createLink(
            ss,
            "chronic fatigue syndrome",
            text.lowercase(),
            "Condition",
            "Chronic Fatigue Syndrome"
        )
        createLink(
            ss,
            "congestive heart failure",
            text.lowercase(),
            "Condition",
            "Congestive Heart Failure"
        )
        createLink(ss, "cholecystitis", text.lowercase(), "Condition", "Cholecystitis")
        createLink(ss, "candidiasis", text.lowercase(), "Condition", "Candidiasis")
        createLink(ss, "cholelithiasis", text.lowercase(), "Condition", "Cholelithiasis")
        createLink(ss, "crohn's disease", text.lowercase(), "Condition", "Crohn's Disease")
        createLink(ss, "diabetes", text.lowercase(), "Condition", "Diabetes Mellitus")
        createLink(ss, "depression", text.lowercase(), "Condition", "Depression")
        createLink(ss, "dysmenorrhea", text.lowercase(), "Condition", "Dysmenorrhea")
        createLink(ss, "dysmenorrhea", text.lowercase(), "Condition", "Dysmenorrhea")
        createLink(ss, "eczema", text.lowercase(), "Condition", "Eczema")
        createLink(ss, "endometriosis", text.lowercase(), "Condition", "Endometriosis")
        createLink(ss, "fertility/infertility", text.lowercase(), "Condition", "Fertility")
        createLink(ss, "fertility", text.lowercase(), "Condition", "Fertility")
        createLink(
            ss,
            "fibrocystic breast disease",
            text.lowercase(),
            "Condition",
            "Fibrocystic Breast Disease"
        )
        createLink(ss, "fibromyalgia", text.lowercase(), "Condition", "Fibromyalgia")
        createLink(ss, "gout", text.lowercase(), "Condition", "Gout")
        createLink(ss, "headache", text.lowercase(), "Condition", "Headache")
        createLink(ss, "hepatitis c", text.lowercase(), "Condition", "Hepatitis")
        createLink(ss, "hepatitis", text.lowercase(), "Condition", "Hepatitis")
        createLink(ss, "herpes simplex", text.lowercase(), "Condition", "Herpes Simplex")
        createLink(ss, "hmorrhoids", text.lowercase(), "Condition", "Hemorrhoids")
        createLink(ss, "hypertension", text.lowercase(), "Condition", "Hypertension")
        createLink(
            ss,
            "hypercholesterolemia",
            text.lowercase(),
            "Condition",
            "Hypercholesterolemia"
        )
        createLink(ss, "hypothyroidism", text.lowercase(), "Condition", "Hypothyroidism")
        createLink(ss, "impotence", text.lowercase(), "Condition", "Impotence")
        createLink(ss, "insomnia", text.lowercase(), "Condition", "Insomnia")
        createLink(
            ss,
            "irritable bowel syndrome",
            text.lowercase(),
            "Condition",
            "Irritable Bowel Syndrome"
        )
        createLink(
            ss,
            "macular degeneration",
            text.lowercase(),
            "Condition",
            "Macular Degeneration"
        )
        createLink(
            ss,
            "macular degeneration",
            text.lowercase(),
            "Condition",
            "Macular Degeneration"
        )
        createLink(ss, "menopause", text.lowercase(), "Condition", "Menopause")
        createLink(ss, "multiple sclerosis", text.lowercase(), "Condition", "Multiple Sclerosis")
        createLink(ss, "memory Loss", text.lowercase(), "Condition", "Memory Loss")
        createLink(ss, "obesity", text.lowercase(), "Condition", "Obesity")
        createLink(ss, "otitis media", text.lowercase(), "Condition", "Otitis Media")
        createLink(ss, "osteoarthritis", text.lowercase(), "Condition", "Osteoarthritis")
        createLink(ss, "short term memory loss", text.lowercase(), "Condition", "Memory Loss")
        createLink(ss, "peptic ulcers", text.lowercase(), "Condition", "Peptic Ulcers")
        createLink(ss, "psoriasis", text.lowercase(), "Condition", "Psoriasis")
        createLink(ss, "pms", text.lowercase(), "Condition", "PMS")
        createLink(ss, "psoriatic arthritis", text.lowercase(), "Condition", "Psoriatic Arthritis")
        createLink(ss, "parkinson's disease", text.lowercase(), "Condition", "Parkinson's Disease")
        createLink(
            ss,
            "rheumatoid arthritis",
            text.lowercase(),
            "Condition",
            "Rheumatoid Arthritis"
        )
        createLink(
            ss,
            "rheumatoid arthritis",
            text.lowercase(),
            "Condition",
            "Rheumatoid Arthritis"
        )
        createLink(ss, "schizophrenia", text.lowercase(), "Condition", "Schizophrenia")
        createLink(ss, "uterine fibroids", text.lowercase(), "Condition", "Uterine Fibroids")
        createLink(ss, "ulcerative colitis", text.lowercase(), "Condition", "Ulcerative Colitis")

        binding.contentData.text = ss
    }//

    private fun setTherapeuticAction(heading: String) {
        binding.subHeading.text = "Therapeutic Actions:"
        var text = ""
        when (heading) {
            "Achillea millefolium (Yarrow)", "Yarrow (Achillea millefolium)" -> {
                text = "• Anodyne - due to prostaglandin-inhibiting action\n" +
                        "• Anti-inflammatory\n" +
                        "• Antiseptic\n" +
                        "• Antispasmodic\n" +
                        "• Astringent\n" +
                        "• Bitter tonic\n" +
                        "• Carminative\n" +
                        "• Cholagogue\n" +
                        "• Decongestant\n" +
                        "• Diaphoretic\n" +
                        "Hot infusion - stimulating diaphoretic effect\n" +
                        "Cold infusion - diuretic effect or tones gastric organs\n" +
                        "• Diuretic\n" +
                        "• Hemostatic\n" +
                        "• Hypotensive\n" +
                        "• Stimulant\n" +
                        "• Urinary antiseptic"
            }
            "Aconitum napellus (Monkshood, Aconite)", "Monkshood (Aconitum napellus)" -> {
                text = "• Analgesic\n" +
                        "• Anti-inflammatory\n" +
                        "• Increases coronary flow\n" +
                        "• Vasodilation of the blood vessels in limbs (animal studies)"
            }
            "Acorus calamus (Sweetflag, Acorus)", "Sweetflag (Acorus calamus)" -> {
                text = "• Anti-anorectic\n" +
                        "• Aromatic bitter\n" +
                        "• Carminative\n" +
                        "• Diaphoretic\n" +
                        "• Emmenagogue\n" +
                        "• Excitant and mild gastric tonic\n" +
                        "• Secretegogue\n" +
                        "• Sedative\n" +
                        "• Sialagogue\n" +
                        "• Stimulant\n" +
                        "• Stomachic\n" +
                        "• Synergist"
            }
            "Aesculus hippocastanum (Horsechestnut)", "Horsechestnut (Aesculus hippocastanum)" -> {
                text = "• Active against influenza virus (in vitro)\n" +
                        "• Antagonizes the effects of bradykinin\n" +
                        "• Anti-edematous\n" +
                        "• Anti-exudative\n" +
                        "• Anti-inflammatory\n" +
                        "• Antispasmodic\n" +
                        "• Antitumor activity in vitro:\n" +
                        "Constituents, hippocaesculin and barringtogenol-C-21-angelate)\n" +
                        "• Astringent, especially to the genito-urinary system\n" +
                        "• Decreases capillary permeability:\n" +
                        "Due to inhibition of lysosomal enzymes and stimulation of the production and release of prostaglandins of the F-alpha type, which induce contraction of veins\n" +
                        "• Increases plasma levels of ACTH, corticosterone and glucose in animal studies\n" +
                        "• Vulnerary - use externally"
            }
            "Agrimonia eupatorium (Agrimony)", "Agrimony (Agrimonia eupatorium)" -> {
                text = "• Gentle anti-diuretic\n" +
                        "• Genito-urinary tonic and astringent\n" +
                        "• Hypoglycemic\n" +
                        "• Mild astringent\n" +
                        "• Mild bitter tonic"
            }
            "Alchemilla vulgaris (Lady's mantle)", "Lady's mantle (Alchemilla vulgaris)" -> {
                text = "• Astringent\n" +
                        "• Hemostatic\n" +
                        "• Sedative"
            }
            "Aletris farinosa (True unicorn)", "True unicorn (Aletris farinosa)" -> {
                text = "• Bitter - increases gastric mucosal secretions\n" +
                        "• Bitter - increases gallbladder secretions\n" +
                        "• Uterine tonic"
            }
            "Allium sativum (Garlic)", "Garlic (Allium sativum)" -> {
                text = "• Ameliorates numerous factors which promote atherogenesis\n" +
                        "• Antibacterial, including:\n" +
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
                        "• Antifungal, including:\n" +
                        "Candida albicans\n" +
                        "Epidermophyton\n" +
                        "Microsporum\n" +
                        "Trichophyton\n" +
                        "• Antihelminthic, including:\n" +
                        "Ascaris lumbricoides\n" +
                        "Hookworms\n" +
                        "• Antineoplastic\n" +
                        "• Antispasmodic\n" +
                        "• Antiviral\n" +
                        "• Carminative\n" +
                        "• Decongestant\n" +
                        "• Decreases systolic pressure for 20-30 mm Hg and diastolic pressure by 10-20 mm Hg\n" +
                        "• Diaphoretic\n" +
                        "• Digestive stimulant\n" +
                        "• Diuretic\n" +
                        "• Activates natural killer cells and T cells\n" +
                        "• Emmenagogue\n" +
                        "• Expectorant\n" +
                        "• Hypoglycemic action - allicin competes with insulin for insulin-inactivating compounds allowing for more free insulin to be in circulation\n" +
                        "• Inhibits cyclo-oxygenase, the enzyme needed to convert arachidonic acid to thromboxane A2 which is the most potent stimulus of platelet aggregation\n" +
                        "• Inhibits lipoxygenase, interrupting the synthesis of leukotrienes, thromboxanes and prostaglandins\n" +
                        "• Inhibits nitrosamine formation\n" +
                        "• Increases serum fibrinolytic activity\n" +
                        "• Lowers lipids (LDL and VLDL) while increasing HDL"
            }
            "Althea officinalis (Marshmallow)", "Marshmallow (Althea officinalis)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Antispasmodic\n" +
                        "• Demulcent\n" +
                        "• Stimulates IL-1 and INF production in vitro\n" +
                        "• Stimulates T and B cell activity\n" +
                        "• Vulnerary"
            }
            "Ammi visnaga (Khella)", "Khella (Ammi visnaga)" -> {
                text =
                    "• Antispasmodic with specific action as a coronary vasodilator and bronchodilator\n" +
                            "• Calcium antagonist\n" +
                            "• Decreases the toxicity of the cardiac glycoside digitoxin due to the coronary vasodilator and antiarrhythmic effects\n" +
                            "• Improves blood supply to the myocardium"
            }
            "Angelica sinensis (Dong quai)", "Dong quai (Angelica sinensis)" -> {
                text = "• Analgesic activity\n" +
                        "• Antispasmodic if made as a proper infusion or a liquid extract\n" +
                        "• Calcium channel blocker\n" +
                        "• Dilates coronary blood vessels\n" +
                        "• Dilates peripheral blood vessels\n" +
                        "• Enhances leukocyte numbers\n" +
                        "• Enhances phagocytic activity\n" +
                        "• Enhances interferon production\n" +
                        "• Enhances macrophage activity\n" +
                        "• Enhances tumor cell destruction\n" +
                        "• Hormone balancing\n" +
                        "• Hypotensive - dilates coronary vessels and relieves vasospasms\n" +
                        "• Increases blood flow to heart, brain and extremities\n" +
                        "• Inhibits platelet aggregation\n" +
                        "• Inhibits synthesis of allergy related antibodies - IgE\n" +
                        "• Relaxes smooth muscles in the intestines and uterus\n" +
                        "• Stimulates nonspecific host defense mechanisms\n" +
                        "• Stimulates uterine cell multiplication\n" +
                        "• Strengthens heart contractility while decreasing the rate of contractions\n" +
                        "• Uterine tonic if the volatile oil is decocted"
            }
            "Arctium lappa (Burdock)", "Burdock (Arctium lappa)" -> {
                text = "• Antibacterial\n" +
                        "• Antifungal\n" +
                        "• Anti-inflammatory\n" +
                        "• Antitussive\n" +
                        "• Aperient\n" +
                        "• Blood purifier\n" +
                        "• Cholagogue\n" +
                        "• Complex polymer found in burdock reduces the mutagenicity of direct and indirect mutagens\n" +
                        "• Demulcent\n" +
                        "• Diaphoretic\n" +
                        "• Diuretic, especially the seeds\n" +
                        "• GI stimulant\n" +
                        "• Hormone restorative\n" +
                        "• Hypoglycemic\n" +
                        "• Inhibits Ehrlich ascite carcinoma and Yoshima sarcoma in mice\n" +
                        "• Liver tonic\n" +
                        "• Nervine\n" +
                        "• Potent cytotoxic effects against HL-60 human lymphocytic leukemia (lignans, including arctigenin)\n" +
                        "• Promotes blood and lymph circulation\n" +
                        "• Root contains a tumor growth inhibiting mixture\n" +
                        "• Root contains water-soluble polysaccharides which exhibited chemotactic activity for granulocytic leukocytes and antitumor effects against solid sarcoma 37 tumor in CAFI mice\n" +
                        "• Seed induces differentiation in mouse myeloid leukemia cell"
            }
            "Arctostaphylos uva ursi (Bearberry)", "Bearberry (Arctostaphylos uva ursi)" -> {
                text = "• Antibacterial against both gram positive and negative bacteria\n" +
                        "• Anti-inflammatory\n" +
                        "• Antioxidant\n" +
                        "• Anti-tumor activity\n" +
                        "• Astringent\n" +
                        "• Cholagogue\n" +
                        "• Diuretic\n" +
                        "• Effective against:\n" +
                        "Bacteria\n" +
                        "Cutaneous leishmaniasis\n" +
                        "Giardia\n" +
                        "Protozoa\n" +
                        "Yeast\n" +
                        "• Promotes elimination of catabolic residues\n" +
                        "• Reduces uterine spasms\n" +
                        "• Supports the immune system\n" +
                        "• Urinary antiseptic"
            }
            "Armoracia rusticana (Horseradish)", "Horseradish (Armoracia rusticana)" -> {
                text = "• Antibiotic due to the mustard oil\n" +
                        "• Effective in lung and urinary infections because mustard oil is excreted through these channels\n" +
                        "• Powerful circulatory stimulant\n" +
                        "• Rubefacient"
            }
            "Asclepias tuberosa (Pleurisy root)", "Pleurisy root (Asclepias tuberosa)" -> {
                text = "• Antispasmodic, induces peripheral capillary relaxation\n" +
                        "• Diaphoretic\n" +
                        "• Expectorant\n" +
                        "• Relieves pain and eases breathing"
            }
            "Astragalus membranaceus (Milk vetch)", "Milk vetch (Astragalus membranaceus)" -> {
                text = "• Adaptogenic\n" +
                        "• Anti-inflammatory\n" +
                        "• Antimicrobial against:\n" +
                        "Diplococcus\n" +
                        "Shigella\n" +
                        "Staphylococcus aureus\n" +
                        "Streptococcus\n" +
                        "• Antioxidant\n" +
                        "• Anti-tumor activity\n" +
                        "• Antiviral\n" +
                        "• Cardiotonic\n" +
                        "• Diuretic only in weakness-induced water retention\n" +
                        "• Hepatoprotective\n" +
                        "• Hypotensive due to both vasodilator and cardiodepressor activity\n" +
                        "• Increases natural killler cell and T cell activity\n" +
                        "• Promotes the production of interferons\n" +
                        "• Promotes tissue regeneration\n" +
                        "• Potects against WBC drops during chemotherapy by protecting the adrenal cortical function and decreasing bone marrow suppression\n" +
                        "• Protects kidney function\n" +
                        "• Strengthens immune system\n" +
                        "• Supports the lungs\n" +
                        "• Tonic"
            }
            "Atropa belladonna (Belladonna)", "Belladonna (Atropa belladonna)" -> {
                text =
                    "• Anodyne and anesthetic to sensory nerve terminals when applied topically\n" +
                            "• Antispasmodic especially for the GI\n" +
                            "• Febrile state in large doses\n" +
                            "• Motor inhibitor to smooth muscles of the bladder, rectum, stomach, and intestines\n" +
                            "• Mydriasis due to paralysis of the terminal occulomotor nerve\n" +
                            "• Paralysis in toxic amounts\n" +
                            "• Parasympathetic depressant\n" +
                            "• Secretory suppressor except those of the kidneys and bowels\n" +
                            "• Stimulates in small doses\n" +
                            "• Suppresses secretion by depression of the terminal nerves in medium doses\n" +
                            "• Vasodilator of cervical and facial vessels"
            }
            "Avena sativa (Oats)", "Oats (Avena sativa)" -> {
                text = "• Alterative\n" +
                        "• Antidepressant\n" +
                        "• Cerebral trophorestorative\n" +
                        "• Nervine\n" +
                        "• Sedative\n" +
                        "• Stimulates the nervous system due to the property of the alkaloid, avenine\n" +
                        "• Stimulates the limbic system and motor ganglis leading to increased energy and sense of well-being"
            }
            "Baptisia tintoria (Wild indigo)", "Wild indigo (Baptisia tintoria)" -> {
                text = "• Antimicrobial\n" +
                        "• Antiseptic\n" +
                        "• Cholagogue\n" +
                        "• Focused infection especially the ear, nose and throat\n" +
                        "• Immunomodulator, it activates macrophages and increases interleukin-1 production\n" +
                        "• Induces apoptosis (genistein)\n" +
                        "• Induces differentiation in 5 human melanoma cell lines, human medulloblastoma and neuroblastoma cell lines, mouse embryonal carcinoma cells, mouse leukemia cells, HL-60 and human erythroid K-562 clones (genistein)\n" +
                        "• Inhibits differentiation in human leukemia HL-60 cells, B16 melanoma cells and HL-60 cells (daidzein)\n" +
                        "• Inhibits mitosis in vitro in rat ovarian granulosa, human neuroblastoma cells, Jurkat T-leukemia, rat lymphoma, human gastric carcinoma, human myelogenous leukemia, human lymphocytic leukemia, human prostate cancer and ER-positive and ER-negative human breast cancer cell lines (genistein)\n" +
                        "• Inhibits ten human gastrointestinal cell lines (genistein and biochanin A )\n" +
                        "• Lymphagogue\n" +
                        "• Promotes normal cellular metabolism that supports healthy tissues"
            }
            "Barosma betulina (Buchu)", "Buchu (Barosma betulina)" -> {
                text = "• Carminative\n" +
                        "• Diuretic\n" +
                        "• Mild urinary tract anti-inflammatory\n" +
                        "• Removes uric acid\n" +
                        "• Soothes pelvic nerves\n" +
                        "• Stimulant\n" +
                        "• Urinary antiseptic"
            }
            "Berberis vulgaris (Barberry)", "Barberry (Berberis vulgaris)" -> {
                text = "• Activates macrophages\n" +
                        "• Alterative\n" +
                        "• Antibiotic against:\n" +
                        "Bacteria\n" +
                        "Fungus\n" +
                        "Protozoa\n" +
                        "• Anti-inflammatory\n" +
                        "• Antioxidant\n" +
                        "• Antipyretic\n" +
                        "• Anti-tumor activity\n" +
                        "• Astringent\n" +
                        "• Cholagogue\n" +
                        "• In vitro was a potent macrophage activator for inducing cytostatic activity against tumor cells\n" +
                        "• Increases blood supply to the spleen\n" +
                        "• Inhibits the respiration of ascites tumor by 15%\n" +
                        "• Inhibits oxygen uptake by neoplastic cells\n" +
                        "• Induces differentiation in human teratocarcinoma\n" +
                        "• Kills cancer cells\n" +
                        "• Laxative\n" +
                        "• Promotes elimination of catabolic residues\n" +
                        "• Supports the immune system"
            }
            "Bryonia alba (Bryony)", "Bryony (Bryonia alba)" -> {
                text = "• Anodyne\n" +
                        "• Antitumor effects\n" +
                        "• Induce hypoglycemia\n" +
                        "• Neural stimulant\n" +
                        "• Prostaglandin-like activity in isolated smooth muscle preparations and platelet aggregation"
            }
            "Bupleurum chinense (Thoroughwax)", "Thoroughwax (Bupleurum chinense)" -> {
                text = "• Activates phagocytic activity in peritoneal macrophages\n" +
                        "• Anti-inflammatory\n" +
                        "• Hepatoprotective\n" +
                        "• Inhibitory effect on D-galactosamine-induced hepatitis\n" +
                        "• Interacts with sialic acid residues of viral glycoproteins on the envelope of Herpes simplex and measles viruses\n" +
                        "• Stimulates T and B cells"
            }
            "Calendula officinalis (Marigold)", "Marigold (Calendula officinalis)" -> {
                text = "• Antifungal\n" +
                        "• Anti-inflammatory\n" +
                        "• Antiseptic\n" +
                        "• Antispasmodic\n" +
                        "• Antitrichomonal (in vitro)\n" +
                        "• Demulcent\n" +
                        "• Emmenagogue\n" +
                        "• Lymphagogue\n" +
                        "• Promote the formation of granulation tissue by first intention\n" +
                        "• Stimulates the flow of bile\n" +
                        "• Supports normal connective tissue\n" +
                        "• Useful for prevention or treatment of congealed tissue or tumors"
            }
            "Camellia sinensis (Green tea)", "Green tea (Camellia sinensis)" -> {
                text = "• Antibacterial against gram positive and negative bacteria\n" +
                        "• Binds and neutralizes free radicals due to hydroxyl groups\n" +
                        "• Blocks inflammatory responses to ultraviolet A and B radiation\n" +
                        "• Blocks interaction of growth factors and tumor-promoting hormones with receptors\n" +
                        "• Chelates metal ions like iron\n" +
                        "• Chemoprotective or inhibitory against cancer, including:\n" +
                        "Bladder\n" +
                        "Leukemia\n" +
                        "Liver\n" +
                        "Lung\n" +
                        "Oral leukoplakia\n" +
                        "Ovarian\n" +
                        "Skin\n" +
                        "• Increases Lactobacilli and Bifidobacteria and decreases Bracteroidaceae, Enterobacteriaceae and eubacteria\n" +
                        "• Induces hepatic phase II enzymes\n" +
                        "• Inducts apoptosis of several cancer cells\n" +
                        "• Inhibits alpha-amylase and sucrase\n" +
                        "• Inhibits biochemical markers of tumor initiation and promotion\n" +
                        "• Inhibits cell replication\n" +
                        "• Inhibits cyclooxygenase, lipoxygenase and angiotensin converting enzyme\n" +
                        "• Inhibits dense cell formation in sickle cell anemia\n" +
                        "• Inhibits DNA damage by psoralen/ultraviolet A radiation in psoriasis patients\n" +
                        "• Inhibits formation of nitrosamines from amino acids and nitrite food additives\n" +
                        "• Inhibits growth of mammary cancer cell lins\n" +
                        "• Inhibits histidine decarboxylase\n" +
                        "• Inhibits interaction of estrogen with receptor sites\n" +
                        "• Inhibits lipases and reduces lipolyis of triglycerides\n" +
                        "• Inhibits neutrophil migration that occurs in the inflammatory process\n" +
                        "• Inhibits production of arachidonic acid metabolites, including leukotrienes and pro-inflammatory prostaglandins\n" +
                        "• Preventative against cancer, including (the studies are not conclusive):\n" +
                        "• Breast\n" +
                        "• Colon\n" +
                        "• Esophagus\n" +
                        "• Pancreas\n" +
                        "• Prostate\n" +
                        "• Stomach\n" +
                        "• Prolongs sympathetic stimulation of thermogenesis\n" +
                        "• Stabilizes collagen\n" +
                        "• Stimulates glutathione peroxidase and catalase"
            }
            "Capsicum frutescens (Cayenne, Red pepper)", "Cayenne (Capsicum frutescens)" -> {
                text = "• Anodyne\n" +
                        "• Antiseptic\n" +
                        "• Aphrodisiac\n" +
                        "• Capillary dilator\n" +
                        "• Decrease bronchospasm and pulmonary airflow obstruction induced by aerosol histamine\n" +
                        "• Diaphoretic\n" +
                        "• Expectorant\n" +
                        "• External liniment in arthritis\n" +
                        "• GI stimulant\n" +
                        "• Inhibits the growth of gastric pathogen Helicobacter pylori\n" +
                        "• Inhibits platelet aggregation\n" +
                        "• Mildly diuretic\n" +
                        "• Neural stimulant\n" +
                        "• Promotes adrenocortical activity and corticosteroid production\n" +
                        "• Reduce vascular permeability and edema caused by histamine, bradykinin and cigarette smoke\n" +
                        "• Rubefacient\n" +
                        "• Stabilize lung membrane lipids, protecting against edema and lipid peroxidation caused by gaseous lung irritants\n" +
                        "• Stimulates appetite, in small doses\n" +
                        "• Synergist\n" +
                        "• Topical vasodilator\n" +
                        "• Vasomotor stimulant\n" +
                        "• Vessicant"
            }
            "Caulophyllum thalictroides (Blue cohosh)", "Blue cohosh (Caulophyllum thalictroides)" -> {
                text = "• Antispasmodic, used to ease false labor pains\n" +
                        "• Diuretic\n" +
                        "• Emmenagogue\n" +
                        "• Expectorant\n" +
                        "• Female reproductive tract tonic\n" +
                        "• Parturifacient\n" +
                        "• Problems with the male reproductive tract, including orchitis and impotence\n" +
                        "• Relieves false labor pains while increasing the strength of the contractions during actual labor, pain in childbirth and \"after pains\"\n" +
                        "• Reproductive tract debility arising from chronic inflammatory conditions\n" +
                        "• Uterine tonic, used where there is a weakness or loss of tone, especially if there is a threat of miscarriage"
            }
            "Centella asiatica (Gota kola)", "Gota kola (Centella asiatica)" -> {
                text = "• Accelerates the healing time for wounds, burns and ulcers\n" +
                        "• Adaptogen\n" +
                        "• Analgesic\n" +
                        "• Anti-inflammatory\n" +
                        "• Antiseptic\n" +
                        "• Circulatory stimulant\n" +
                        "• Connective tissue balancing effect\n" +
                        "• Corticosteroid-sparing effects in rats under stressful conditions\n" +
                        "• Decreases adrenal enlargement\n" +
                        "• Decreases scar tissue buildup after injuries\n" +
                        "• Diuretic\n" +
                        "• Enhances connective tissue by stimulating glycosaminoglycan synthesis without promoting excessive collagen synthesis\n" +
                        "• Improve memory\n" +
                        "• Increases chondroitin sulfate and hyaluronic acid, structural components\n" +
                        "• Increases development and maintainenece of blood vessels to connective tissue\n" +
                        "• Increases endurance and energy\n" +
                        "• Increases formation of mucin\n" +
                        "• Increases keratinization of epidermis by stimulation of germinal layer of the skin\n" +
                        "• Increases tensile strength of dermis\n" +
                        "• Laxative\n" +
                        "• Mild anti-stress, tranquilizing and anti-anxiety action by enhancing cholinergic mechanisms\n" +
                        "• Reduces stress-induced ulcers\n" +
                        "• Stimulates nail and hair follicle growth"
            }
            "Chamaelirium luteum (False unicorn)", "False unicorn (Chamaelirium luteum)" -> {
                text = "• Emetic\n" +
                        "• Diuretic\n" +
                        "• Strengthens the reproductive system of both women and men\n" +
                        "• Uterine tonic for atony or prolapse\n" +
                        "• Vaginal laxity"
            }
            "Chelidonium majus (Celandine)", "Celandine (Chelidonium majus)" -> {
                text =
                    "• Analgesic, from components chelidonine, a-allocryptopine and sanguinarine\n" +
                            "• Antibacterial, from components protopine, sanguinarine, chelerythrine, and chelidonine\n" +
                            "• Anti-inflammatory\n" +
                            "• Antispasmodic, specific for bile ducts and bronchi but disappears with prolonged storage of the dried herb\n" +
                            "• Antitumor\n" +
                            "• Cholagogue, stimulates the liver and gallbaldder\n" +
                            "• Diuretic\n" +
                            "• Hepatoprotective, causing the liver to secrete a less viscous and more profuse bile and prevents formation of biliary calculi\n" +
                            "• Increases production of urine\n" +
                            "• Inhibits development of anaphylactic sock\n" +
                            "• Lipotropic\n" +
                            "• Lowers arterial blood pressure\n" +
                            "• Relaxes smooth muscle spasms, including bronchospasm, from component chelidonine\n" +
                            "• Stimulates digestive enzymes\n" +
                            "• Weak central nervous system sedative"
            }
            "Chimaphilia umbellata (Pipsissewa)", "Pipsissewa (Chimaphilia umbellata)" -> {
                text = "• Alterative\n" +
                        "• Atonic chronic conditions and infectious conditions with catarrh and stagnant lymph system\n" +
                        "• Diuretic\n" +
                        "• Genitourinary antiseptic\n" +
                        "• Increases renal circulation and stimulates tubular function\n" +
                        "• Mild lymphatic stimulant\n" +
                        "• Scanty, painful urination with mucous"
            }
            "Chionanthus virginicus (Fringe tree)", "Fringe tree (Chionanthus virginicus)" -> {
                text = "• Antiseptic\n" +
                        "• Acts on the digestive organs, urinary tract and venous system to relieve congestion\n" +
                        "• Cathartic\n" +
                        "• Promotes the flow of bile from the gallbladder\n" +
                        "• Stimulates appetite\n" +
                        "• Stimulates gastric secretions"
            }
            "Cimicifuga racemosa (Black cohosh)", "Black cohosh (Cimicifuga racemosa)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Antispasmodic\n" +
                        "• Competes in vitro with 17-beta-estradiol for estrogen receptor binding sites\n" +
                        "• Decreases the growth of the breast carcinoma cell line 435 when tested in vitro\n" +
                        "• Diaphoretic\n" +
                        "• Digestive stimulant\n" +
                        "• Dilates the bronchioles\n" +
                        "• Diuretic\n" +
                        "• Emmenagogue-relaxes the uterus\n" +
                        "• Female reproductive tonic\n" +
                        "• Hypotensive\n" +
                        "• Increases and normalizes uterine contractions during labor\n" +
                        "• Inhibitory activity in vitro and in vivo on bone resorption in ovariectomized rats as well as rats on low calcium diets\n" +
                        "• Mild expectorant\n" +
                        "• Peripheral vasodilator\n" +
                        "• Relaxes sleletal muscles\n" +
                        "• Relaxes smooth muscles of the blood vessels\n" +
                        "• Relaxes the uterus\n" +
                        "• Sedative\n" +
                        "• Suppress luteinizing hormone surges associated with hot flashes in menopausal woman\n" +
                        "• Useful for after-pains following labor"
            }
            "Cinnamomum spp. (Cinnamon)", "Cinnamon (Cinnamomum spp.)" -> {
                text = "• Anodyne due to its prostaglandin-inhibiting action\n" +
                        "• Antibacterial, inhibiting E. coli, Staph aureus\n" +
                        "• Antifungal, inhibiting Candida albicans\n" +
                        "• Astringent\n" +
                        "• Carminative, enhances trypsin activity\n" +
                        "• Causes contraction of the uterine muscles and arrests bleeding\n" +
                        "• Diaphoretic\n" +
                        "• Hemostatic\n" +
                        "• Hypotensive, stimulates peripheral blood flow\n" +
                        "• Inhibits cyclooxygenase and lipoxygenase enzymes of arachidonic acid metabolism\n" +
                        "• Stimulates and then depresses the nervous system"
            }
            "Collinsonia canadensis (Stone root)", "Stone root (Collinsonia canadensis)" -> {
                text = "• Anti-lithic\n" +
                        "• Astringent to mucous surfaces\n" +
                        "• Diuretic\n" +
                        "• Stimulates and tones the alimentary mucous membranes\n" +
                        "• Strengthen structure and function of veins\n" +
                        "• Tonic\n" +
                        "• Vasocontracting to the portal system"
            }
            "Commiphora molmol (Myrrh)", "Myrrh (Commiphora molmol)" -> {
                text = "• Antifungal\n" +
                        "• Anti-inflammatory\n" +
                        "• Antiseptic\n" +
                        "• Antispasmodic\n" +
                        "• Expectorant\n" +
                        "• Stimulant\n" +
                        "• Stimulates the production of white blood cells"
            }
            "Commiphora mukul (Guggulu)", "Guggulu (Commiphora mukul)" -> {
                text = "• Activates the thyroid gland\n" +
                        "• Antifungal\n" +
                        "• Anti-inflammatory - in acute models, comparable to 1/5 hydrocortisone and equal to phenylbutazone and ibuprofen; in chronic models, it is more effective than all three\n" +
                        "• Antioxidant\n" +
                        "• Antiseptic\n" +
                        "• Increases catecholamine biosynthesis and activity (in cholesterol fed rabbits)\n" +
                        "• Inhibits platelet aggregation\n" +
                        "• Lowers VLDLs and LDLs while elevating HDLs\n" +
                        "• Stimulates liver metabolism of LDL cholesterol"
            }
            "Corydalis bulbosa (Corydalis)", "Corydalis (Corydalis bulbosa)" -> {
                text = "• Anodyne, analgesic effect approximately 1% that of the strength of opium"
            }
            "Crataegus oxycantha (Hawthorne)", "Hawthorne (Crataegus oxycantha)" -> {
                text = "• Adaptogen specific for the circulatory system\n" +
                        "• Cardiotonic\n" +
                        "• Collagen stabilizing action\n" +
                        "• Cross links collagen fibers\n" +
                        "• Improves cardiac metabolism\n" +
                        "• Improves coronary circulation by dilating coronary vessels\n" +
                        "• Increases and sustains action of arterioles with principle influence on the myocardium\n" +
                        "• Increases enzyme metabolism in heart muscle\n" +
                        "• Increases intracellular vitamin C levels and stabilizes it\n" +
                        "• Increases oxygen utilization by the heart\n" +
                        "• Inhibits angiotensin converting enzyme\n" +
                        "• Inhibits cAMP phosphodiesterase thus increasing the levels of cAMP\n" +
                        "• Inhibits enzymatic cleavage by enzymes secreted by leukocytes during inflammation\n" +
                        "• Prevents free radical damage\n" +
                        "• Prevents the release and synthesis of compounds that promote inflammation (histamine, prostaglandins, serine proteases, leukotrienes)\n" +
                        "• Regulates distribution of heart rhythm\n" +
                        "• Restores myocardial reserve\n" +
                        "• Sedative\n" +
                        "• Trophorestorative"
            }
            "Curcuma longa (Tumeric)", "Tumeric (Curcuma longa)" -> {
                text = "• Analgesic\n" +
                        "• Anticoagulant\n" +
                        "• Antifertility action\n" +
                        "• Anti-inflammatory\n" +
                        "• Antimicrobial\n" +
                        "• Antineoplastic\n" +
                        "• Antioxidant\n" +
                        "• Antiplatelet-aggregator\n" +
                        "• Carminative\n" +
                        "• Cholagogue\n" +
                        "• Emmenagogue\n" +
                        "• Hepatoprotective\n" +
                        "• Hypotensive\n" +
                        "• Increases glutathione content in liver\n" +
                        "• Increases rate-limiting step of cholesterol conversion into bile acids\n" +
                        "• Inhibits platelet aggregation\n" +
                        "• Inhibits lymphocytic activity\n" +
                        "• Lowers LDL cholesterol and raises HDL cholesterol\n" +
                        "• Stabilizes lysosomal membranes\n" +
                        "• Stimulates digestive enzymes\n" +
                        "• Topical antibacterial and antifungal\n" +
                        "• Tumor-preventing activity"
            }
            "Cynara scolymus (Artichoke)", "Artichoke (Cynara scolymus)" -> {
                text = "• Decreases the rate of cholesterol synthesis in the liver\n" +
                        "• Digestive tonic\n" +
                        "• Enhances biliary excretion of cholesterol\n" +
                        "• Increases bile production in the liver - cholagogue\n" +
                        "• Increases the contractive power of the bile duct - choliokinetic\n" +
                        "• Increases the flow of bile from the gallbladder by 60% and 4 times normal in a 12-hour period - choleretic\n" +
                        "• Liver detoxification\n" +
                        "• Protective to liver tissue\n" +
                        "• Reduces blood fat\n" +
                        "• Reduces cholesterol and cholinesterase levels\n" +
                        "• Significant liver regenerating and protecting effects"
            }
            "Datura stramonium (Jimson weed, Thornapple)", "Jimson weed (Datura stramonium)" -> {
                text = "• Anodyne\n" +
                        "• Anticholinergic\n" +
                        "• Antispasmodic\n" +
                        "• Hallucinogenic\n" +
                        "• Mydriatic\n" +
                        "• Narcotic\n" +
                        "• Sedative"
            }
            "Dioscorea villosa (Wild yam)", "Wild yam (Dioscorea villosa)" -> {
                text = "• Anodyne\n" +
                        "• Anti-inflammatory\n" +
                        "• Antispasmodic\n" +
                        "• Autonomic nerve relaxant useful in painful gastrointestinal conditions due to irritation and spasm, neuralgic conditions and restlessness\n" +
                        "• Carminative\n" +
                        "• Cholagogue\n" +
                        "• Estrogenic\n" +
                        "• Mild diaphoretic"
            }
            "Echinacea angustifolia (Purple cone flower)", "Purple cone flower (Echinacea angustifolia)" -> {
                text = "• Alterative\n" +
                        "• Antibacteria\n" +
                        "• Antifungal\n" +
                        "• Anti-inflammatory\n" +
                        "• Antiviral - both RNA and DNA viruses\n" +
                        "• Constituent, arabinogalactan:\n" +
                        "Activates macrophages to cytotoxicity against tumor cells and micro-organisms, producing tumor necrosis factor (TNF), interleukin-1, interleukin-6, interferon-2 and slight increase in T-lymphocyte proliferation\n" +
                        "Decreases inflammatory allergic reactions to mild food allergies\n" +
                        "• Immune stimulating:\n" +
                        "Enhances antibody binding\n" +
                        "Enhances antibody dependent cytotoxicity\n" +
                        "Enhances phagocytosis\n" +
                        "Improves carbon clearance\n" +
                        "Interferon activation\n" +
                        "• Inhibits hyaluronidase\n" +
                        "• Root oil has inhibited leukemia cells in vitro and in vivo\n" +
                        "• Slight stimulation of the adrenal cortex"
            }
            "Eleutherococcus senticosus (Siberian ginseng)", "Siberian ginseng (Eleutherococcus senticosus)" -> {
                text = "• Adaptogen\n" +
                        "• Binds to progestin, estrogen, mineralcorticoid and glucocorticoid receptors\n" +
                        "• Boosts physical endurance levels\n" +
                        "• Circulatory stimulant\n" +
                        "• Enhances oxygen metabolism in tissues and organs\n" +
                        "• Improves hypothalamic-pituitary-adrenal axis feed back control\n" +
                        "• Increases and activates natural killer cells and lymphocytes\n" +
                        "• Increases endurance and concentration\n" +
                        "• Strengthens the digestion and kidneys\n" +
                        "• Supports the adrenal system\n" +
                        "• Vasodilator"
            }
            "Ephedra sinica (Ma huang)", "Ma huang (Ephedra sinica)" -> {
                text = "• Alpha and beta adrenergic agonist\n" +
                        "• Anti-inflammatory due to inhibition of prostaglandin E2 synthesis\n" +
                        "• Antispasmodic\n" +
                        "• Antitussive\n" +
                        "• Bronchodilator, effect occurs in one hour after ingestion and lasts about 5 hours\n" +
                        "• Decongestant\n" +
                        "• Diaphoretic\n" +
                        "• Expectorant\n" +
                        "• Increases cardiac output\n" +
                        "• Increases coronary, cerebral, and muscle blood flow at the expense of splanchnic and renal blood flow\n" +
                        "• Increases diastolic and systolic blood pressure\n" +
                        "• Increases heart rate\n" +
                        "• Increases metabolic rate of adipose tissue\n" +
                        "• Mild relaxant for all smooth muscles\n" +
                        "• Promotes weight loss\n" +
                        "• Releases norepinephrine from sympathetic neurons\n" +
                        "• Stimulant\n" +
                        "• Sympathomimetic - both alpha and beta adrenergic receptors as well as the release of norepinephrine"
            }
            "Equisetum arvense (Shave grass, Horsetail)", "Shave grass (Equisetum arvense)" -> {
                text = "• Astringent\n" +
                        "• Causes diuresis without altering the electrolyte balance\n" +
                        "• Diuretic\n" +
                        "• Hemostatic\n" +
                        "• Increases connective tissue tone and resistance\n" +
                        "• Styptic\n" +
                        "• Urinary astringent\n" +
                        "• Urinary tonic"
            }
            "Eriodictyon californicum (Yerba santa)", "Yerba santa (Eriodictyon californicum)" -> {
                text = "• Aids in digestion\n" +
                        "• Antimicrobia\n" +
                        "• Aromatic\n" +
                        "• Bronchodilator\n" +
                        "• Carminative\n" +
                        "• Expectorant"
            }
            "Eschscholzia californica (California poppy)", "California poppy (Eschscholzia californica)" -> {
                text = "• Anodyne\n" +
                        "• Antispasmodic\n" +
                        "• Hypnotic\n" +
                        "• Non-addictive alternative to the opium poppy, though less powerful\n" +
                        "• Sedative"
            }
            "Euphrasia officinalis (Eyebright)", "Eyebright (Euphrasia officinalis)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Antiseptic\n" +
                        "• Astringent\n" +
                        "• Decongestant\n" +
                        "• Disorders of the mucous membranes\n" +
                        "• Expectorant\n" +
                        "• Vasoconstrictor and astrigent to nasal and conjunctival mucosa"
            }
            "Filipendula ulmaria (Meadowsweet)", "Meadowsweet (Filipendula ulmaria)" -> {
                text = "• Anodyne\n" +
                        "• Antacid, by protecting and soothing the mucous membrances of the digestive tract\n" +
                        "• Antibacterial against (in vitro):\n" +
                        "• Bacillus subtilis\n" +
                        "• Corynebacterium diphtheriae\n" +
                        "• Diplococcus pneumoniae\n" +
                        "• E. coli\n" +
                        "• Klebsiella pneumoniae\n" +
                        "• Staph. aureus\n" +
                        "• Staph. hemolyticus\n" +
                        "• Strep hemolyticus\n" +
                        "• Strep pyogenes\n" +
                        "• Shigella dysentericae\n" +
                        "• Shigella flexneri\n" +
                        "• Anti-inflammatory\n" +
                        "• Antirheumatic\n" +
                        "• Astringent\n" +
                        "• Promotes excretion of uric acid"
            }
            "Foeniculum vulgare (Fennel)", "Fennel (Foeniculum vulgare)" -> {
                text = "• Acts on beta 2 receptors, effecting vasodilation\n" +
                        "• Anti-inflammatory\n" +
                        "• Antispasmodic\n" +
                        "• Carminative\n" +
                        "• Flavoring\n" +
                        "• Galactagogue\n" +
                        "• Increases liver regeneration in partially hepatectomized rats\n" +
                        "• Mild expectorant\n" +
                        "• Possesses estrogenic effects\n" +
                        "• Promotes bronchodilation\n" +
                        "• Relaxes the bladder\n" +
                        "• Relaxes the intestines\n" +
                        "• Relaxes the uterus"
            }
            "Fucus vesiculosus (Bladderwrack, Kelp)", "Bladderwrack (Fucus vesiculosus)" -> {
                text = "• Antibiotic activity\n" +
                        "• Anti-obesity agent, probably due to the effect on an underactive thyroid\n" +
                        "• Diuretic\n" +
                        "• Immunomodulatory\n" +
                        "• Induces lymphocyte transformation\n" +
                        "• Metabolic stimulant\n" +
                        "• Supplies minerals and trace elements like iodine, in the form of inorganic salts or bound to proteins and lipids"
            }
            "Galium aparine (Cleavers, Bed straw)", "Cleavers (Galium aparine)" -> {
                text = "• Alterative\n" +
                        "• Corrects inability to pass normal catabolic wastes\n" +
                        "• Diuretic\n" +
                        "• Hypotensive\n" +
                        "• Laxative\n" +
                        "• Lymphagogue\n" +
                        "• Supports the immune system\n" +
                        "• Tonic"
            }
            "Gelsemium sempervirens (Yellow jasmine, Gelsemium)", "Yellow jasmine (Gelsemium sempervirens)" -> {
                text = "• Anodyne\n" +
                        "• Antispasmodic\n" +
                        "• Initially stimulates then depresses neural function\n" +
                        "• Sedative"
            }
            "Gentiana lutea (Gentian)", "Gentian (Gentiana lutea)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Bitter, stimulates the appetite and digestion by stimulating the digestive juices, saliva, gastric juices and bile\n" +
                        "• Cholagogue\n" +
                        "• Facilitates absorption of nutrients\n" +
                        "• Promotes peristalsis\n" +
                        "• Sialagogue\n" +
                        "• Tonic"
            }
            "Geranium maculatum (Wild geranium, Cranesbill)", "Wild geranium (Geranium maculatum)" -> {
                text = "• Astringent\n" +
                        "• Atonic tissues with discharges due to over-relaxation\n" +
                        "• Diarrhea\n" +
                        "• Passive hemorrhages\n" +
                        "• Styptic\n" +
                        "• Ulceration of the mucous membranes and digestive tract"
            }
            "Ginkgo biloba (Ginkgo)", "Ginkgo (Ginkgo biloba)" -> {
                text = "• Antioxidant, inhibiting lipid peroxidase and free radical damage\n" +
                        "• Decreases platelet aggregation, adhesion and degranulation\n" +
                        "• Diminishes cerebral edema\n" +
                        "• Enhances membrane sodium-potassium ATPase\n" +
                        "• Enhances utilization of oxygen and increases cellular uptake of glucose\n" +
                        "• Improves mitochondrial respiration\n" +
                        "• Improves synthesis of cerebral neurotransmitters\n" +
                        "• Inhibits phosphodiesterase, increasing cAMP and promoting smooth muscle relaxation\n" +
                        "• Inhibits the action of proteolytic enzymes\n" +
                        "• Modulation of neurotransmitter\n" +
                        "• Normalizes acetylcholine receptors in the hippocampus\n" +
                        "• Normalizes circulation in areas most affected by microembolization, i.e. hippocampus and stratum\n" +
                        "• Protects a transplanted kidney against cyclosporin damage\n" +
                        "• Protects against radiation-induced injuries as shown in the use of ginkgo at the Chernobyl disaster\n" +
                        "• Stabilizes lysomal membranes\n" +
                        "• Vasodilation by direct stimulation of the release of endothelium-derived relaxing factor and prostacyclin)"
            }
            "Glycyrrhiza glabra (Licorice)", "Licorice (Glycyrrhiza glabra)" -> {
                text = "• Adrenal-modulator\n" +
                        "• Anti-allergic\n" +
                        "• Antibacterial\n" +
                        "• Antimutagen\n" +
                        "• Antioxidant\n" +
                        "• Antiviral\n" +
                        "• Decreases inflammation by enhancing movement of leucocytes towards inflamed areas\n" +
                        "• Demulcent\n" +
                        "• Expectorant with secretolytic and secretomotor activity\n" +
                        "• Flavoring\n" +
                        "• Hepatoprotective\n" +
                        "• Immune stimulating\n" +
                        "• Increases interferon production and inhibits the activity of phospholipase A and the formation of prostaglandin E2 in activated peritoneal macrophages\n" +
                        "• Inhibits alpha 4-5 beta-reductase and thus inhibits the breakdown of adrenal cortical hormone\n" +
                        "• Inhibits growth of sarcoma-45 and Ehrlich ascites cells\n" +
                        "• Inhibits RC mammary carcinoma and lymphosarcoma 150 in mice\n" +
                        "• Inhibits suppressor T-lymphocyte activity\n" +
                        "• Induces interferon production\n" +
                        "• Laxative\n" +
                        "• Liver tonic and protectant\n" +
                        "• Spasmolytic\n" +
                        "• Steroidal - estrogenic\n" +
                        "• Stimulates natural killer cell activity"
            }
            "Grindelia camporum (Gumweed)", "Gumweed (Grindelia camporum)" -> {
                text = "• Antispasmodic\n" +
                        "• Bronchial relaxant\n" +
                        "• Expectorant\n" +
                        "• Sedative expectorant\n" +
                        "• Sialagogue\n" +
                        "• Vulnerary topically"
            }
            "Gymnema sylvestre (Gymnema)", "Gymnema (Gymnema sylvestre)" -> {
                text = "• Antiatherosclerotic\n" +
                        "• Enhances the production of endogenous insulin through regeneration of pancreatic beta cells that produce insulin (animal studies)\n" +
                        "• Hypolipidemic"
            }
            "Hamamelis virginiana (Witch hazel)", "Witch hazel (Hamamelis virginiana)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Astringent\n" +
                        "• Hemostatic, especially for passive hemorrhages, wounds, local inflammations and venous laxity and congestion"
            }
            "Harpagophytum procumbens (Devil's claw, Grapple plant)", "Devil's claw (Harpagophytum procumbens)" -> {
                text = "• Anodyne/analgesic\n" +
                        "• Anti-arthritic\n" +
                        "• Anti-inflammatory\n" +
                        "• Bitter"
            }
            "Humulus lupulus (Hops)", "Hops (Humulus lupulus)" -> {
                text = "• Relaxes smooth muscles, especially in the digestive tract\n" +
                        "• Anaphrodisiac for men due to the estrogenic substances\n" +
                        "• Diuretic due to asparagin\n" +
                        "• Antibacterial due to humulone and lupulone\n" +
                        "• Antispasmodic effect on uteri in animal studies\n" +
                        "• Anti inflammatory, especially in the areas of the digestive tract\n" +
                        "• Sedative, promotes sleep\n" +
                        "• Astringent"
            }
            "Hydrastis canadensis (Goldenseal)", "Goldenseal (Hydrastis canadensis)" -> {
                text = "• Adrenolytic\n" +
                        "• Antimicrobia against:\n" +
                        "• Amebiasis\n" +
                        "• Bacteria\n" +
                        "• Cholera\n" +
                        "• Giardia\n" +
                        "• Protozoa\n" +
                        "• Visceral and cutaneous leishmaniasis\n" +
                        "• Yeast\n" +
                        "• Astringent\n" +
                        "• Enhances splenic blood flow\n" +
                        "• Bitter tonic\n" +
                        "• Immune support\n" +
                        "• Increases macrophage activity\n" +
                        "• Laxative in small doses\n" +
                        "• Stimulates the normal action of the liver and gall bladder\n" +
                        "• Styptic\n" +
                        "• Triples bile secretion for 1.5 hours\n" +
                        "• In vitro was a potent macrophage activator for inducing cytostatic activity against tumor cells"
            }
            "Hypericum perforatum (St. John's wort)", "Saint John's wort (Hypericum perforatum)" -> {
                text = "• Antibacterial\n" +
                        "• Antidepressant due to a blocking of serotonin resorption by postsynaptic receptors and maybe by increasing light utilization and influencing the serotonin-melatonin metabolism\n" +
                        "• Anti-inflammatory\n" +
                        "• Antiretroviral\n" +
                        "• Antiviral\n" +
                        "• Astringent\n" +
                        "• Hepatoprotective\n" +
                        "• Inhibits monoamine oxidase (MAO) types A and B\n" +
                        "• Raises the concentration of melatonin (hypericin)\n" +
                        "• Sedative"
            }
            "Hyssopus officinalis (Hyssop)", "Hyssop (Hyssopus officinalis)" -> {
                text = "• Antiviral, especially against Herpes simplex\n" +
                        "• Antispasmodic\n" +
                        "• Astringent\n" +
                        "• Carminative\n" +
                        "• Cholagogue\n" +
                        "• Diaphoretic\n" +
                        "• Emmenagogue\n" +
                        "• Expectorant\n" +
                        "• Sedative"
            }
            "Inula helenium (Elecampane)", "Elecampane (Inula helenium)" -> {
                text = "• Antibacterial\n" +
                        "• Antifungal\n" +
                        "• Antihelmintic in animal studies\n" +
                        "• Anti-inflammatory\n" +
                        "• Bitter tonic\n" +
                        "• Carminative\n" +
                        "• Diaphoretic\n" +
                        "• Diuretic\n" +
                        "• Emmenagogue\n" +
                        "• Expectorant\n" +
                        "• Hypotensive in animal studies\n" +
                        "• Immune stimulant\n" +
                        "• Increases bile flow\n" +
                        "• Tonifying to the lungs and digestive system\n" +
                        "• Sedative in animal studies\n" +
                        "• Strengthens and cleansesto the respiratory tract mucous membranes"
            }
            "Juniperis communis (Juniper)", "Juniper (Juniperis communis)" -> {
                text = "• Anti-inflammatory due to prostaglandin inhibiting action\n" +
                        "• Antiseptic\n" +
                        "• Bronchodilator\n" +
                        "• Carminative\n" +
                        "• Expectorant\n" +
                        "• Hypoglycemic\n" +
                        "• Increases stomach HCl\n" +
                        "• Renal vasodilator\n" +
                        "• Stimulating diuretic acting on the glomerulus to increase filtration rate\n" +
                        "• Urinary antiseptic\n" +
                        "• Urinary irritant\n" +
                        "• Urinary stimulant\n" +
                        "• Uterine stimulant"
            }
            "Larrea tridentata (Chapparrel, Creosote bush, Creosotum)", "Chapparrel (Larrea tridentata)" -> {
                text = "• Antibacterial\n" +
                        "• Antifungal\n" +
                        "• Anti-inflammatory\n" +
                        "• Antineoplastic\n" +
                        "• Antioxidant\n" +
                        "• Decreases histamine and SRSA from lung tissue\n" +
                        "• Decreases prostaglandin and thrombaxane synthesis by inhibiting cyclooxygenase\n" +
                        "• HETE and lukotriene synthesis are reduced by inhibition of lipoxygenase\n" +
                        "• Inhibits contractile response within lung parencyma"
            }
            "Lavendula angustifolia (Lavender)", "Lavender (Lavendula angustifolia)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Antimicrobial against:\n" +
                        "• Diphtheria\n" +
                        "• Pneumococcus\n" +
                        "• Streptococcus\n" +
                        "• Typhoid bacilli\n" +
                        "• CNS depressive activity in animal studies\n" +
                        "• Spasmolytic\n" +
                        "• Stimulates the diencephalon, causing relaxation of autonomic function"
            }
            "Leonurus cardiaca (Motherwort)", "Motherwort (Leonurus cardiaca)" -> {
                text = "• Antiplatelet aggregation action\n" +
                        "• Antispasmodic\n" +
                        "• Cardiac tonic\n" +
                        "• Decreases blood lipids\n" +
                        "• Diuretic\n" +
                        "• Emmenagogue\n" +
                        "• Female tonic\n" +
                        "• Hypotensive\n" +
                        "• Nervine\n" +
                        "• Normalizes heart function\n" +
                        "• Sedative\n" +
                        "• Stimulating"
            }
            "Ligusticum porteri (Osha)", "Osha (Ligusticum porteri)" -> {
                text = "• Antiviral\n" +
                        "• Diaphoretic\n" +
                        "• Diuretic\n" +
                        "• Immune stimulating properties\n" +
                        "• Promotes expectoration"
            }
            "Linum usitatissimum (Flax, Linseed)", "Flax (Linum usitatissimum)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Bulking agent\n" +
                        "• Demulcent\n" +
                        "• Emollient\n" +
                        "• Laxative\n" +
                        "• Lubricating agent\n" +
                        "• Mucilaginous agent"
            }
            "Lobelia inflata (Indian tobacco, Puke weed)", "Indian tobacco (Lobelia inflata)" -> {
                text =
                    "• Inhibits cardioactivity (slowing pulse rate and blood pressure) followed by increased pulse and blood pressure in small doses\n" +
                            "• Lowers carbon dioxide threshold to increase respiration\n" +
                            "• Produces pain and nausea in moderate doses\n" +
                            "• Promotes gastric secretions and is a stimulant in small doses\n" +
                            "• Promotes mucous secretions in respiratory passages\n" +
                            "• Powerful and exhausting emesis followed by profound relaxation in large doses\n" +
                            "• Sialagogue\n" +
                            "• Stimulates autonomic ganglia followed by depression\n" +
                            "• Stimulates preganglionic nicotinic receptors and secondarily depresses them\n" +
                            "• Stimulates respiratory centers in small doses and paralyzes respiration in large doses\n" +
                            "• Thins tenacious mucous"
            }
            "Lomatium disectum (Desert parsley)", "Desert parsley (Lomatium disectum)" -> {
                text = "• Antibacterial to:\n" +
                        "• Candida albicans\n" +
                        "• Clostridium (5 strains)\n" +
                        "• Corynebacterium diptherium\n" +
                        "• Diplococcus pneumonia\n" +
                        "• E. coli\n" +
                        "• Hemophilus influenza\n" +
                        "• Mycobacterium tuberculosis\n" +
                        "• Neisseria gonorrhea\n" +
                        "• Proteus vulgaris\n" +
                        "• Pseudomonas aeruginosa\n" +
                        "• Salmonella\n" +
                        "• Shigella (3 strains)\n" +
                        "• Staph aureus\n" +
                        "• Streptococcus pyogenes\n" +
                        "• Antifungal\n" +
                        "• Antiseptic\n" +
                        "• Antiviral to both RNA and DNA viruses\n" +
                        "• Expectorant"
            }
            "Marrubium vulgare (Horehound)", "Horehound (Marrubium vulgare)" -> {
                text = "• Expectorant\n" +
                        "• Bitter tonic\n" +
                        "• Antiseptic\n" +
                        "• Cholagogue\n" +
                        "• Normalizes irregular heart beat in small amounts\n" +
                        "• Vasodilatory"
            }
            "Matricaria chamomilla (German chamomile)", "German chamomile (Matricaria chamomilla)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Antispasmodic\n" +
                        "• Anti toxic against both staph and strep\n" +
                        "• Nervine\n" +
                        "• Diaphoretic\n" +
                        "• Analgesic\n" +
                        "• Sedative"
            }
            "Medicago sativa (Alfalfa)", "Alfalfa (Medicago sativa)" -> {
                text = "• Nourishing\n" +
                        "• Hormonal balance due to amphoteric (ability to either lower or raise estrogen activity) action of phytoestrogens\n" +
                        "• Accumulates in the tissues and increases concentration of available phytoestrogens\n" +
                        "• Decrease cholesterol levels\n" +
                        "• Shrinkage effect on atherosclerotic plaque"
            }
            "Melaleuca alternifolia (Tea tree)", "Tea tree (Melaleuca alternifolia)" -> {
                text = "• Organisms inhibited by tea tree oil:\n" +
                        "Candida albicans\n" +
                        "Pseudomonas aeruginosa\n" +
                        "Propionibacterium acnes\n" +
                        "Staphylococcus aureus\n" +
                        "Streptococcus pyrogenes \n" +
                        "Trichophyton mentagrophytes"
            }
            "Melissa officinalis (Lemon balm)", "Lemon balm (Melissa officinalis)" -> {
                text = "• Antihistamine activity\n" +
                        "• Antithyroid\n" +
                        "• Antiviral, especially Herpes simplex\n" +
                        "• Inhibits many of the effects of exogenous and endogenous thyroid stimulating hormone by interfering with binding of TSH to plasma membranes and by inhibiting the enzyme iodothyronine deiodinase\n" +
                        "• Inhibits protein biosynthesis in cell-free systems of rat liver\n" +
                        "• Inhibits receptor binding and biological activity of immunoglobulins in the blood of patients with Graves disease\n" +
                        "• Inhibits tumor cells dividing\n" +
                        "• Mild vasodilatory effect of peripheral vessels\n" +
                        "• Promotes menstrual cycles\n" +
                        "• Sedative"
            }
            "Mentha piperita (Peppermint)", "Peppermint (Mentha piperita)" -> {
                text = "• Analgesic, topical\n" +
                        "• Antiinflammatory\n" +
                        "• Antiulcer properties\n" +
                        "• Blocks calcium influx into muscle cells causing inhibition of isolated contractions\n" +
                        "• Calms and strengthens nerves\n" +
                        "• Calms an upset stomach\n" +
                        "• Decreases flaccidity in the GI tract\n" +
                        "• Digestive aid\n" +
                        "• Dissolves gallstones\n" +
                        "• Eliminates heartburn\n" +
                        "• Improves solubility of bile\n" +
                        "• Increases bile acid and lecithin levels in the gallbladder\n" +
                        "• Inhibits and kills micro-organisms:\n" +
                        "• Candida albicans\n" +
                        "• Herpes simplex\n" +
                        "• Influenza A viruses\n" +
                        "• Mumps virus\n" +
                        "• Pseudomonas acruginosa\n" +
                        "• Streptococcus pyogenes\n" +
                        "• Staphylococcus aureus\n" +
                        "• Inhibits constipation\n" +
                        "• Inhibits diarrhea\n" +
                        "• Inhibits hypercontractility of intestinal smooth muscle\n" +
                        "• Mild anaesthetic to stomach wall\n" +
                        "• Normalizes gastrointestinal activity\n" +
                        "• Prevents congestion of blood to the brain\n" +
                        "• Reduces bile cholesterol levels\n" +
                        "• Stimulates circulation\n" +
                        "• Stimulates contractile activity and bile secretion in the gallbladder"
            }
            "Mitchella repens (Squawvine, Partridge berry)", "Squawvine (Mitchella repens)" -> {
                text = "• Astringent\n" +
                        "• Calming effect on the nervous system\n" +
                        "• Emmenagogue\n" +
                        "• Improves digestion\n" +
                        "• Improves laxity yet reduces spasms\n" +
                        "• Increases uterine circulation yet reduces congestion\n" +
                        "• Prepares for childbirth (parturient)"
            }
            "Momordica charantia (Bitter melon)", "Bitter melon (Momordica charantia)" -> {
                text = "• Antibiotic\n" +
                        "• Antitumor activity - due to the constituents lutein and lycopene\n" +
                        "• Antiviral\n" +
                        "• Aphrodisiac\n" +
                        "• Increases tissue uptake of glucose due to charantin\n" +
                        "• Decreases cGMP:cAMP ratio\n" +
                        "• Immunosuppressive, modulating activity of both T and B lymphocytes and suppressing macrophage activity\n" +
                        "• Inhibits corticotropin-induced lipolysis creating an insulin-sparing action\n" +
                        "• Insulinomimetic\n" +
                        "• Hypotensive\n" +
                        "• Laxative\n" +
                        "• Lowers blood glucose\n" +
                        "• Stimulates lipogenesis\n" +
                        "• Stomachic\n" +
                        "• Vermifuge"
            }
            "Nepeta cataria (Catnip)", "Catnip (Nepeta cataria)" -> {
                text = "• Carminative\n" +
                        "• Diaphoretic\n" +
                        "• Sedative\n" +
                        "• Spasmolytic"
            }
            "Oplopanax horridum (Devil's club)", "Devil's club (Oplopanax horridum)" -> {
                text = "• Adaptogen\n" +
                        "• Antifatigue and stimulant properties\n" +
                        "• CNS sedative\n" +
                        "• Control homeostasis by acting on the endocrine system\n" +
                        "• Hypoglycemic (in rat studies)\n" +
                        "• Increases capacity of skeletal muscle to oxidize free fatty acids in preference to glucose to produce cellular energy\n" +
                        "• Increases plasma levels of ACTH and corticosterone\n" +
                        "• Inhibits thrombin induced conversion of fibrinogen to fibrin, preventing platelet aggregation (in rat studies)\n" +
                        "• Stimulates the biosynthesis of proteins (in rat studies)"
            }
            "Panax ginseng (Chinese ginseng, Korean ginseng)", "Chinese ginseng (Panax ginseng)" -> {
                text = "• Antifatigue and stimulant properties\n" +
                        "• CNS sedative\n" +
                        "• Controls homeostasis by acting on the endocrine system\n" +
                        "• Enhances interferon production\n" +
                        "• Enhances natural killer cell activity\n" +
                        "• Hypoglycemic (in rat studies)\n" +
                        "• Improves hypothalamic-pituitary-adrenal axis feed back control\n" +
                        "• Inhibits thrombin induced conversion of fibrinogen to fibrin, preventing platelet aggregation (in rat studies)\n" +
                        "• Increases capacity of skeletal muscle to oxidize free fatty acids in preference to glucose to produce cellular energy\n" +
                        "• Increases IgG and IgM formation\n" +
                        "• Increases plasma levels of ACTH and corticosterone\n" +
                        "• Increases the number and activity of lymphocytes in healthy subjects due to the ginsenoside constituents\n" +
                        "• Stimulant\n" +
                        "• Stimulates the biosynthesis of proteins (in rat studies)\n" +
                        "• Tonic"
            }
            "Passiflora incarnata (Passionflower)", "Passionflower (Passiflora incarnata)" -> {
                text = "• Anodyne\n" +
                        "• Antispasmodic\n" +
                        "• Hypnotic\n" +
                        "• Hypotensive (depresses motor activity and blood pressure transiently)\n" +
                        "• Sedative (has CNS depressant activity without affecting respiratory rate)"
            }
            "Pausinystalia yohimbe (Yohimbe)", "Yohimbe (Pausinystalia yohimbe)" -> {
                text = "• Alpha-2-adrenergic blocker\n" +
                        "• Anesthetic effect, similar to cocaine\n" +
                        "• Aphrodisiac\n" +
                        "• Dilates peripheral blood vessels\n" +
                        "• Increases reflex excitability of the lower region of the spinal cord\n" +
                        "• Monoamine oxidase inhibitor\n" +
                        "• Vasodilator-skin and mucous membranes"
            }
            "Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)", "Butterbur (Petasites hybridus)" -> {
                text = "• Appetite stimulant\n" +
                        "• Anodyne\n" +
                        "• Antiinflammatory\n" +
                        "• Antispasmodic\n" +
                        "• Inhibits leukotriene synthesis in the arachidonic acid cycle providing an antiinflammatory effect\n" +
                        "• Protects from ulcer formation and cell damage due to leukotriene inhibition\n" +
                        "• Reduces spontaneous activity and spasms in smooth muscle and vascular walls\n" +
                        "• Vasodilatory"
            }
            "Petroselinum crispum (Parsley)", "Parsley (Petroselinum crispum)" -> {
                text = "• Antioxidant\n" +
                        "• Carminative\n" +
                        "• Diuretic\n" +
                        "• Emmenagogue\n" +
                        "• Encourages uric acid elimination\n" +
                        "• Increases milk in lactating woman\n" +
                        "• Inhibits histamine release\n" +
                        "• Tones uterine muscles"
            }
            "Phytolacca decandra (Poke)", "Poke (Phytolacca decandra)" -> {
                text = "• Alterative\n" +
                        "• Anti-inflammatory\n" +
                        "• Antiviral-inhibits the replication of influenza, HSV-1, URI viruses and poliovirus\n" +
                        "• Cathartic\n" +
                        "• Mitogentic for T-cells or for both T-cells and B-cells (lectins, glycoproteins, Pa-1 to Pa-5)\n" +
                        "• Stimulates B and T lymphocytes\n" +
                        "• Stimulates elimination from tissue\n" +
                        "• Stimulates production of interleukin 1 and tumor necrosis factor"
            }
            "Pimpinella anisum (Anise)", "Anise (Pimpinella anisum)\n" -> {
                text = "• Carminative\n" +
                        "• Expectorant - increases mucociliary transport\n" +
                        "• Mild estrogenic effects"
            }
            "Piper methysticum (Kava kava)", "Kava kava (Piper methysticum)" -> {
                text =
                    "• Able to maintain cognitive effects unlike most drugs given as a sedative or hypnotic\n" +
                            "• Acts primarily on the limbic system\n" +
                            "• Analgesic\n" +
                            "• Anticonvulsant\n" +
                            "• Anti-inflammatory\n" +
                            "• Antispasmodic\n" +
                            "• Hypnotic\n" +
                            "• Improves memory\n" +
                            "• Muscle relaxant\n" +
                            "• Protects against brain damage due to ischemia\n" +
                            "• Sedative"
            }
            "Piscidia piscipula (Jamaican dogwood)", "Jamaican dogwood (Piscidia piscipula)" -> {
                text = "• Analgesic\n" +
                        "• Antispasmodic for smooth muscles\n" +
                        "• Sedative"
            }
            "Polygonum multiflorum (Fo-ti, He-shou-wu)", "Fo-ti (Polygonum multiflorum)" -> {
                text = "• Antibacterial activity\n" +
                        "• Antiinflammatory effects\n" +
                        "• Antioxidant activity\n" +
                        "• Cardiovascular activity\n" +
                        "• Increases energy\n" +
                        "• Lowers blood pressure\n" +
                        "• Mild laxative effect\n" +
                        "• Promotes growth and development of red blood cells\n" +
                        "• Promotes intestinal peristalsis\n" +
                        "• Reduces atherosclerotic lesions\n" +
                        "• Reduces blood cholesterol levels\n" +
                        "• Tonic to maintain youthful vigor"
            }
            "Pygeum africanum (Pygeum)", "Pygeum (Pygeum africanum)" -> {
                text =
                    "• Anti-inflammatory within the prostatic epithelium (pentacyclic triterpenes)\n" +
                            "• Decreases intraprostatic cholesterol content and thus preventing accumulation of cholesterol in the prostatic tissue affected with either benign prostatic hypertrophy or prostate cancer\n" +
                            "• Decreases LH and testosterone while increasing adrenal secretion of adrenal androgens and corticosteroids (n-docosanol)\n" +
                            "• Decreases serum prolactin levels which leads to a decrease uptake of testosterone and increase synthesis of dihydrotestosterone in the prostate (n-docosanol)\n" +
                            "• Improves capacity to achieve an erection\n" +
                            "• Improves composition of seminal fluid, alkaline phosphatase and protein\n" +
                            "• Increases prostatic secretions\n" +
                            "• Prevents intraprostatic formation of prostaglandins (sterolic fraction)"
            }
            "Rhamnus frangula (Buckthorn)", "Buckthorn (Rhamnus frangula)" -> {
                text = "• Diuretic\n" +
                        "• Inhibit protein synthesis in neoplastic cells due to decreasing cellular respiration rates and decreasing glycolysis\n" +
                        "• Laxative\n" +
                        "• Possess cytotoxic mechanisms (Rhein and emodin)"
            }
            "Rhamnus purshiana (Cascara)", "Cascara (Rhamnus purshiana)" -> {
                text = "• Acts on the large intestine (cascarosides)\n" +
                        "• Inhibits protein synthesis in neoplastic cells due to decreasing cellular respiration rates and decreasing glycolysis\n" +
                        "• Laxative\n" +
                        "• Possess cytotoxic mechanisms (rhein and emodin)\n" +
                        "• Stimulates peristalsis\n" +
                        "• Tones relaxed muscles of the GI tract"
            }
            "Rheum officinalis (Rhubarb)", "Rhubarb (Rheum officinalis)" -> {
                text = "• Improves uremic indices significantly\n" +
                        "• Cholinergic action in rodent studies\n" +
                        "• Increases gastric secretion in low doses and acts as an appetite stimulant\n" +
                        "• Increases bile secretion\n" +
                        "• Powerful antispasmodic in isolated rat intestine - emodin constituent\n" +
                        "• Decreases blood glucose in animal studies\n" +
                        "• Lowers cholesterol and triglycerides levels in chronic kidney failure\n" +
                        "• Mild stimulating tonic to the liver, gall bladder and alimentary mucous membranes\n" +
                        "• Suppresses secretion of hepatitis B virus surface antigen in vitro\n" +
                        "• Purgative properties in large doses due to the anthraquinone constituents followed by an astringent action making it a good herb to thoroughly cleanse the gastrointestinal tract\n" +
                        "• Astringent due to the tannin constituents\n" +
                        "• Anti cancer activity due to emodin\n" +
                        "• Antibacterial"
            }
            "Rosmarius officinalis (Rosemary)", "Rosemary (Rosmarius officinalis)" -> {
                text = "• Anodyne\n" +
                        "• Anti-inflammatory\n" +
                        "• Antiseptic\n" +
                        "• Astringent\n" +
                        "• Circulatory and nervine stimulant\n" +
                        "• Decreases capillary fragility\n" +
                        "• Diaphoretic\n" +
                        "• Nervine - antidepressant\n" +
                        "• Stimulates hair follicles\n" +
                        "• Supresses the endotoxin-induced activation of complement, the formation of prostacyclin, both hypotensive phases, thrombocytopenia and the concomitant release of thromboxane Az\n" +
                        "• Tones and calms the digestive tract"
            }
            "Rumex crispis (Yellow dock, Curly dock)", "Yellow dock (Rumex crispis)" -> {
                text = "• Alterative\n" +
                        "• Laxative\n" +
                        "• Tonic"
            }
            "Ruscus aculeatus (Butcher's broom)", "Butcher's broom (Ruscus aculeatus)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Diaphoretic\n" +
                        "• Diminishes vascular permeability\n" +
                        "• Produces a-adrenergic effects on isolated cutaneous veins causing contraction"
            }
            "Salvia miltiorrhiza (Danshen)", "Danshen (Salvia miltiorrhiza)" -> {
                text =
                    "• Activates kallikrein-kinin system in the (rat) kidney to promote production and secretion of prostaglandin E2, inducing dilation of renal vascular system, an increase in renal blood flow and glomerular filtration rate\n" +
                            "• Antimicrobial\n" +
                            "• Decreases blood urea nitrogen, serum creatinine, methylguanidine, guanidinosuccinic acid and inorganic phosphate (in rat studies)\n" +
                            "• Dilates coronary arteries\n" +
                            "• Free radical scavenger - active oxygen has been shown to be involved with proliferation of mesangial cells\n" +
                            "• Inhibits platelet aggregation\n" +
                            "• Increases coronary blood flow without affecting heart rate\n" +
                            "• May ameliorate the development of HTN through excretion of urinary sodium and by improving renal hemodynamics\n" +
                            "• Preventive effects on development of respiratory distress syndrome\n" +
                            "• Prostaglandin E2 inhibits proliferation of mesangial cells (in glomeruli) and acts antagonistically against vasoconstriction brought about from Thromboxane A2\n" +
                            "• Reduces accumulation of methylguanidine and guanidinosuccinic acid levels - methylguanidine and guanidinosuccinic acid have been reported to cause platelet dynfunction, hemolytic activity, glucose metabolism disturbance and inhibition of lymphocyte transformation"
            }
            "Salvia officinalis (Sage)", "Sage (Salvia officinalis)" -> {
                text = "• Antibacterial, especially against Staph aureus\n" +
                        "• Anti-hidrotic\n" +
                        "• Antiseptic\n" +
                        "• Antispasmodic\n" +
                        "• Astringent\n" +
                        "• Carminative - soothes mucous membranes\n" +
                        "• Stimulates muscles of the uterus"
            }
            "Sambucus canadensis, nigra (Elder)", "Elder (Sambucus canadensis, nigra)" -> {
                text = "• Anti-inflammatory (due to ursolic acid content)\n" +
                        "• Astrigent\n" +
                        "• Diaphoretic (bioflavonoids promote circulation)\n" +
                        "• Diuretic (berries)\n" +
                        "• Laxative (berries)"
            }
            "Sanguinaria canadensia (Blood root)", "Blood root (Sanguinaria canadensia)" -> {
                text = "• Antibacterial\n" +
                        "• Antiviral\n" +
                        "• Cardioactive\n" +
                        "• Emetic\n" +
                        "• Expectorant\n" +
                        "• Relaxes bronchial muscles\n" +
                        "• Stimulates peripheral circulation\n" +
                        "• Uncouples oxidative phosphorylation and intercalate with DNA"
            }
            "Schisandra chinensis (Wu wei zi)", "Wu wei zi (Schisandra chinensis)" -> {
                text = "• Adaptogen\n" +
                        "• Antibacterial\n" +
                        "• Antioxidant\n" +
                        "• Builds strength\n" +
                        "• Cholagogue\n" +
                        "• Hepatoprotective\n" +
                        "• Immunomodulator\n" +
                        "• Increases brain efficiency\n" +
                        "• Increases mental alertness\n" +
                        "• Increases work capacity\n" +
                        "• Liver restorative\n" +
                        "• Lowers blood levels of serum glutamic pyruvic transaminase (SGPT)- lignan content\n" +
                        "• Lung tonic\n" +
                        "• Reduce the cytotoxic effects of carbon tetrachloride and galactosamine on cultured rat liver cells"
            }
            "Scutellaria laterifolia (Skullcap)", "Skullcap (Scutellaria laterifolia)" -> {
                text = "• Antispasmodic due to the glycosides\n" +
                        "• Antihistamine (animal studies show skullcap to inhibit arachidonic acid pathways)\n" +
                        "• Antihypertensive\n" +
                        "• Nervine\n" +
                        "• Sedative due to the glycosides"
            }
            "Serenoa repens (Saw palmetto)", "Saw palmetto (Serenoa repens)" -> {
                text = "• Anti estrogenic\n" +
                        "• Aphrodisiac and sexual rejuvenator - historically\n" +
                        "• Diuretic\n" +
                        "• Inhibition of dihydrotestosterone - inhibition of multiplication of prostatic cells - reducing hyperplasia"
            }
            "Silybum marianum (Milk thistle)", "Milk thistle (Silybum marianum)" -> {
                text = "• Antioxidant\n" +
                        "• Detoxifies hormones, chemicals and drugs\n" +
                        "• Increases glutathione content of the liver\n" +
                        "• Increases SOD\n" +
                        "• Increases solubility of bile\n" +
                        "• Inhibits both cell growth and DNA synthesis in a time-dependent manner with large loss of cell viability in cervical carcinoma cells\n" +
                        "• Lipoxygenase inhibitor thus inhibiting leukotriene damage\n" +
                        "• Neutralizes toxic radicals in liver parenchyma\n" +
                        "• Prevents liver destruction\n" +
                        "• Protective effectagainst tumor promotion, primarily targeted against stage I tumors (in animal studies)\n" +
                        "• Reduces hepatic inflammation\n" +
                        "• Stabilizes hepatocellular membranes by modifying phospholipid turnover\n" +
                        "• Stimulates liver protein synthesis but does not stimulate malignant liver cells"
            }
            "Smilax sarsaparilla (Sarsaparilla)", "Sarsaparilla (Smilax sarsaparilla)" -> {
                text = "• Binds endotoxins in the GI tract\n" +
                        "• Binds to cholesterol\n" +
                        "• Hormonal balancing"
            }
            "Spilanthes acmella (Paracress)", "Paracress (Spilanthes acmella)" -> {
                text = "• Antifungal\n" +
                        "• Antiviral\n" +
                        "• Antiseptic\n" +
                        "• Enhances the immune system's resistance to infections\n" +
                        "• Stimulates wound healing"
            }
            "Stellaria media (Chickweed)", "Chickweed (Stellaria media)" -> {
                text = "• Antirheumatic\n" +
                        "• Diuretic\n" +
                        "• Emollient\n" +
                        "• Laxative\n" +
                        "• Tonic"
            }
            "Sticta pulmonaria (Lungwort)", "Lungwort (Sticta pulmonaria)" -> {
                text = "• Anodyne to thoracic pain\n" +
                        "• Antirheumatic\n" +
                        "• Antitussive\n" +
                        "• Expectorant"
            }
            "Stillingia sylvatica (Queen's root)", "Queen's root (Stillingia sylvatica)" -> {
                text = "• Astringent\n" +
                        "• Cathartic, in large doses\n" +
                        "• Diuretic, in small doses\n" +
                        "• Emetic, in large doses\n" +
                        "• Irritants that influence lymphatic and secretory functions (diterpene esters, including prostatin and gnidilatin)\n" +
                        "• Laxative, in small doses\n" +
                        "• Shown to reduce growth of tumors in DBA mice with RC mammary carcinomas\n" +
                        "• Stimulating expectorant"
            }
            "Symphytum officinale (Comfrey)", "Comfrey (Symphytum officinale)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Antimutagenic activity, increases survival times of mice bearing spontaneous tumors and decreased tumor growth\n" +
                        "• Antipsoriatic\n" +
                        "• Aqueous extract stimulates the release of a prostaglandin-like material from gastric mucosa\n" +
                        "• Breaks down red blood cells, therefore used for bruises\n" +
                        "• Demulcent mucilage makes a powerful healing agent in mucosal ulcers\n" +
                        "• Stimulates IL-1 and INF production in vitro\n" +
                        "• Stimulates T and B cell activity\n" +
                        "• Soothing and wound healing due to allantoin\n" +
                        "• Stimulates cell proliferation that promotes the growth of bone, cartilage and connective tissue"
            }
            "Symplocarpus foetida (Skunk cabbage)", "Skunk cabbage (Symplocarpus foetida)" -> {
                text = "• Antispasmodic\n" +
                        "• Diaphoretic\n" +
                        "• Diuretic\n" +
                        "• Emetic\n" +
                        "• Expectorant\n" +
                        "• Narcotic"
            }
            "Tabebuia impetiginosa (Pau d' arco)", "Pau d' arco (Tabebuia impetiginosa)" -> {
                text = "• Antifungal, including Candida albicans\n" +
                        "• Anti-inflammatory\n" +
                        "• Antimicrobial to gram positive bacteria, including Brucellosis\n" +
                        "• Antineoplastic\n" +
                        "• Antitubercular\n" +
                        "• Antiviral, including herpes 1 and 2, vesicular stomatitis virus and polio\n" +
                        "• Parasitical, including Schistosoma mansoni , malaria and acid fast mycobacteria"
            }
            "Tanacetum parthenium) (Feverfew)", "Feverfew (Tanacetum parthenium)" -> {
                text = "• Antiinflammatory action similar to cortisone and NSAIDS\n" +
                        "• Decreases smooth muscle response to endogenous substances, including:\n" +
                        "Acetylcholine\n" +
                        "Bradykinin\n" +
                        "Histamine\n" +
                        "Norepinephrine\n" +
                        "Prostaglandins\n" +
                        "• Serotonin\n" +
                        "• Diaphoretic\n" +
                        "• Enhances secretion of inflammatory and allergic mediators including histamine and serotonin\n" +
                        "• Inhibits initial stage of manufacture of inflammatory prostaglandins, thromboxanes and leukotrienes\n" +
                        "• Inhibits platelet aggregation\n" +
                        "• Tonic effect on vascular smooth muscle\n" +
                        "• Uterine stimulant"
            }
            "Taraxacum officinale (Dandelion, Lion's tooth)", "Dandelion (Taraxacum officinale)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Antirheumatic\n" +
                        "• Anti-tumor agent\n" +
                        "• Bitter\n" +
                        "• Cholagogue effect\n" +
                        "• Choleric effect\n" +
                        "• Depurative\n" +
                        "• Diuretic - non potassium wasting\n" +
                        "• Hypoglycemic\n" +
                        "• Lactagogue\n" +
                        "• Laxative\n" +
                        "• Liver tonic\n" +
                        "• Stimulant for the urinary system"
            }
            "Taxus brevifolia (Yew)", "Yew (Taxus brevifolia)" -> {
                text = "• Ability to ploymerize tubulin in the absence of cofactors\n" +
                        "• Break down of the mitotic spindle during mitosis is blocked and the cell can no longer divide into daughter cells\n" +
                        "• Binds to the microtubules and inhibits their depolymerization into tubulin\n" +
                        "• Prevents cancer cells from replicating\n" +
                        "• Targets the rapidly dividing cancer cells\n" +
                        "• There may exist other mechanisms also by which the anticancer activity of paclitaxel works"
            }
            "Thuja plicata, occidentalis (Western cedar)", "Western cedar (Thuja plicata, occidentalis)" -> {
                text = "• Antifungal\n" +
                        "• Antiviral\n" +
                        "• Emmenagogue\n" +
                        "• Expectorant - bronchial disorders where there is catarrh\n" +
                        "• Stimulant\n" +
                        "• Stimulates smooth muscles, especially those of the bronchials and uterus"
            }
            "Thymus vulgaris (Thyme)", "Thyme (Thymus vulgaris)" -> {
                text = "• Antibacterial\n" +
                        "• Antifungal\n" +
                        "• Anthelmintic, especially hookworms and ascarids\n" +
                        "• Antithyrotropic effect (in animal studies)\n" +
                        "• Expectorant\n" +
                        "• Larvicidal, kills mosquito larvae\n" +
                        "• Spasmolytic\n" +
                        "• Urinary tract antiseptic"
            }
            "Tilia europaea (Linden flower, Lime blossom)", "Linden flower (Tilia europaea)" -> {
                text = "• Antispasmodic\n" +
                        "• Diaphoretic\n" +
                        "• Diuretic\n" +
                        "• Hypotensive\n" +
                        "• Nervine"
            }
            "Trifollium pratense (Red clover)", "Red clover (Trifollium pratense)" -> {
                text = "• Alterative\n" +
                        "• Anticoagulant\n" +
                        "• Antineoplastic\n" +
                        "• Antispasmodic especially for spasms of the respiratory tract\n" +
                        "• Diuretic\n" +
                        "• Estrogenic\n" +
                        "• Induces apoptosis (genistein)\n" +
                        "• Induces differentiation in 5 human melanoma cell lines, human medulloblastoma and neuroblastoma cell lines, mouse embryonal carcinoma cells, mouse leukemia cells, HL-60 and human erythroid K-562 clones due to genistein\n" +
                        "• Inhibits mitosis in vitro in rat ovarian granulosa, human neuroblastoma cells, Jurkat T-leukemia, rat lymphoma, human gastric carcinoma, human myelogenous leukemia, human lymphocytic leukemia, human prostate cancer and ER-positive and ER-negative human breast cancer cell lines (genistein)\n" +
                        "• Inhibits ten human gastrointestinal cell lines (Genistein and biochanin A )\n" +
                        "• Inhibits differentiation in human leukemia HL-60 cells, B16 melanoma cells and HL-60 cells ( Daidzein)"
            }
            "Trigonella foenum-graecum (Fenugreek)", "Fenugreek (Trigonella foenum-graecum)" -> {
                text = "• Expectorant\n" +
                        "• Galactogogue\n" +
                        "• Inhibits liver carcinoma (in animal studies)\n" +
                        "• Mild smooth muscle relaxant without affecting either the heart or blood pressure\n" +
                        "• Promotes healing of gastric ulcers\n" +
                        "• Reduces blood levels of cholesterol\n" +
                        "• Reduces blood lipids\n" +
                        "• Reduces glucose (in animal studies)\n" +
                        "• Slows metabolism of nicotinic acid into NAD thus decreasing glycolysis and B-oxidation of fatty acids"
            }
            "Trillium erectum (Beth root)", "Beth root (Trillium erectum)" -> {
                text = "• Antispasmodic\n" +
                        "• Astringent\n" +
                        "• Expectorant\n" +
                        "• Nervine\n" +
                        "• Uterine tonic"
            }
            "Tussilago farfara (Colt's foot)", "Colt's foot (Tussilago farfara)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Compound, L-652-469, is a platelet activating factor antagonist and calcium channel blocker\n" +
                        "• Decreases time for bronchial cilia to recover after damage from smoking\n" +
                        "• Expectorant\n" +
                        "• Potent cardiovascular stimulant, a feature of tussilagone\n" +
                        "• Sedative"
            }
            "Ulmus fulva (Slippery elm, American elm)", "Slippery elm (Ulmus fulva)" -> {
                text = "• Demulcent - used to soothe irritated mucosal tissues\n" +
                        "• Nutritive\n" +
                        "• Vulnerary"
            }
            "Urtica urens (Nettles)", "Nettles (Urtica urens)" -> {
                text = "• Anodyne\n" +
                        "• Astringent\n" +
                        "• Cardiotonic\n" +
                        "• Diuretic\n" +
                        "• Galactagogue\n" +
                        "• Genito-urinary tonic\n" +
                        "• Renal antiseptic"
            }
            "Usnea spp. (Old man's beard)", "Old man's beard (Usnea spp.)" -> {
                text = "• Antibiotic\n" +
                        "• Bitter\n" +
                        "• Inhibits growth of bacteria, Salmonella typhosa\n" +
                        "• Inhibits growth of gram-positive organism"
            }
            "Vaccinium myrtillus (Bilberry)", "Bilberry (Vaccinium myrtillus)" -> {
                text = "• Decreases blood-brain barrier permeability\n" +
                        "• Decreases capillary fragility and permeability\n" +
                        "• Inhibits enzymatic cleavage of collagen\n" +
                        "• Inhibits platelet aggregation\n" +
                        "• Increases endothelium barrier of membranes\n" +
                        "• Increases gastric mucus\n" +
                        "• Lowers blood glucose\n" +
                        "• Prevents free radical damage\n" +
                        "• Prevents release and synthesis of serine proteases, leukotrienes, histamine and prostaglandins that promote inflammation\n" +
                        "• Promotes cross-linking of collagen fibers, reinforcing ground substance, cartilage, ligaments, and tendons\n" +
                        "• Relaxes smooth muscles\n" +
                        "• Stimulates vasodilatory prostaglandin production\n" +
                        "• Vitamin P activity"
            }
            "Valeriana officinalis (Valerian)", "Valerian (Valeriana officinalis)" -> {
                text = "• Anodyne\n" +
                        "• Antidiuretic\n" +
                        "• Antimicrobial to gram positive bacteria\n" +
                        "• Antispasmodic\n" +
                        "• Decreases blood pressure\n" +
                        "• Increases bile flow\n" +
                        "• Normalization of the central nervous system\n" +
                        "• Sedative - binds to the same brain receptors as Valium and other benzodiazepine drugs but does not appear to have side effects (impaired mental function, morning hangover, dependency)"
            }
            "Verbascum thapsus (Mullein)", "Mullein (Verbascum thapsus)" -> {
                text = "• Astringent\n" +
                        "• Expectorant\n" +
                        "• Genito-urinary tract sedative\n" +
                        "• Respiratory demulcent\n" +
                        "• Sedative mucilage with mild anodyne effect"
            }
            "Verbena officinalis (Vervain)", "Vervain (Verbena officinalis)" -> {
                text = "• Antidepressant\n" +
                        "• Antispasmodic\n" +
                        "• Alterative\n" +
                        "• Astringent\n" +
                        "• Calms irregularities in digestion\n" +
                        "• Diaphoretic\n" +
                        "• Estrogen-receptor binding acting as an agonist similar to estradiol in animal studies\n" +
                        "• Hepatic\n" +
                        "• Galactagogue due to the glycosides\n" +
                        "• Hypnotic/sedative\n" +
                        "• Nervine - strengthens the nervous system especially when there is mental exhaustion due to overexertion"
            }
            "Viburnum opulus (Cramp bark)", "Cramp bark (Viburnum opulus)" -> {
                text = "• Antispasmodic - especially to the uterus\n" +
                        "• Nervine\n" +
                        "• Tonic\n" +
                        "• Uterine sedative"
            }
            "Viscum alba (Mistletoe)", "Mistletoe (Viscum alba)" -> {
                text = "• Antispasmodic\n" +
                        "• Anti-tumor activity\n" +
                        "• cAMP-phosphodiesterase inhibitory activity\n" +
                        "• Cardiotonic\n" +
                        "• Diuretic\n" +
                        "• Hypotensive\n" +
                        "• Immunostimulant\n" +
                        "• Increases intestinal motility\n" +
                        "• Increases uterine motility\n" +
                        "• Nervine\n" +
                        "• Peripheral vasodialator\n" +
                        "• Slows heart rate"
            }
            "Vitex agnus castus (Chaste tree, Monk's pepper)", "Chaste tree (Vitex agnus castus)" -> {
                text = "• Anaphrodisiac\n" +
                        "• Decreases FSH secretion\n" +
                        "• Galactagogue - improves both quantity of milk and let-down mechanism\n" +
                        "• Increases LH secretion\n" +
                        "• Stimulates the corpus luteum"
            }
            "Withania somnifera (Ashwagandha)", "Ashwagandha (Withania somnifera)" -> {
                text = "• Anemia with emaciation\n" +
                        "• Anti-inflammatory\n" +
                        "• Antitumor activity, in animal studies\n" +
                        "• Ayurvedic superior rejuvenative herb for the muscles, bone marrow and semen\n" +
                        "• Catalyzes the anabolic processes of the body\n" +
                        "• Free-radical scavenging activity\n" +
                        "• Hypotensive\n" +
                        "• Immunomodulating\n" +
                        "• Increases phagocytosis and intracellular killing of peritoneal macrophages\n" +
                        "• Inhibits aging\n" +
                        "• Nervous exhaustion\n" +
                        "• Nurtures and clarifies the mind promoting dreamless sleep\n" +
                        "• Promotes the healing of tissue\n" +
                        "• Regenerates the hormonal system\n" +
                        "• Sedative\n" +
                        "• Stimulates the immune system\n" +
                        "• Stress-induced health conditions"
            }
            "Yucca spp. (Yucca)", "Yucca (Yucca spp.)" -> {
                text = "• Anti-inflammatory\n" +
                        "• Antioxidant\n" +
                        "• Stimulant"
            }
            "Zanthoxylum clava-herculis (Southern prickly ash)", "Southern prickly ash (Zanthoxylum clava-herculis)" -> {
                text = "• Analgesic\n" +
                        "• Antimicrobial\n" +
                        "• Antineoplastic activities\n" +
                        "• Antipyretic\n" +
                        "• Antirheumatic\n" +
                        "• Carminative\n" +
                        "• Diaphoretic\n" +
                        "• Indenoisoquinoline analogue 9 of nitidine was found to possess significant anticancer activity against P388 lymphocytic leukemia, L1210 lymphoid leukemia and B16 melanocarcinoma\n" +
                        "• Nitidine and fagaronine inhibited the topoisomerase I-mediated relaxation of supercoiled pSP64 plasmid DNA more effectively than the antitumor agent, camptothecin\n" +
                        "• Promotes capillary circulation\n" +
                        "• Restores vascular tone\n" +
                        "• Stimulates circulation\n" +
                        "• Stimulates salivary glands and mucous membranes"
            }
            "Zea mays (Corn silk)", "Corn silk (Zea mays)" -> {
                text = "• Antiviral\n" +
                        "• Demulcent\n" +
                        "• Diuretic\n" +
                        "• Enhances IgG and IgM formation\n" +
                        "• Genito-urinary sedative\n" +
                        "• Hypoglycemic\n" +
                        "• Inhibits IgE formation\n" +
                        "• Produces interferon\n" +
                        "• Stimulant"
            }
            "Zingiber officinale (Ginger)", "Ginger (Zingiber officinale)" -> {
                text = "• Cardiotonic activity\n" +
                        "• Carminative\n" +
                        "• Decreases the risk of thrombus formation in thrombophlebitis\n" +
                        "• Diaphoretic\n" +
                        "• Expectorant\n" +
                        "• Inhibits platelet aggregation\n" +
                        "• Influences prostaglandin metabolism - potent inhibitor of prostaglandin and thromboxane synthesis\n" +
                        "• Lowers serum and liver cholesterol levels\n" +
                        "• Positive inotropic effect on the heart\n" +
                        "• Possesses a fibrinolytic quality\n" +
                        "• Promotes stomach secretions\n" +
                        "• Rubefacient\n" +
                        "• Sialagogue"
            }
        }

        ss = SpannableString(text)
        createLink(ss, "glutathione", text, "Supplement", "Glutathione")
        binding.contentData.text = ss
    }//


    private fun createLink(
        ss: SpannableString,
        sub_str: String,
        string: String,
        activity: String,
        heading: String
    ) {

        var index = string.indexOf(sub_str)
        while (index != -1) {
            val clickableSpan = object : ClickableSpan() {
                override fun onClick(widget: View) {
                    val intent: Intent
                    if (activity == "Condition") {
                        intent = Intent(
                            this@BotanicalDetailActivity,
                            ConditionDetailActivity::class.java
                        )
                        intent.putExtra("heading", heading)
                        startActivity(intent)
                    } else if (activity == "Supplement") {
                        intent = Intent(
                            this@BotanicalDetailActivity,
                            SupplementDetailActivity::class.java
                        )
                        intent.putExtra("heading", heading)
                        startActivity(intent)
                    } else if (activity == "Fiber") {
                        intent =
                            Intent(this@BotanicalDetailActivity, FiberDetailActivity::class.java)
                        intent.putExtra("heading", heading)
                        startActivity(intent)
                    } else if (activity == "Vitamin") {
                        intent = Intent(
                            this@BotanicalDetailActivity,
                            VitaminMineralDetailActivity::class.java
                        )
                        intent.putExtra("heading", heading)
                        startActivity(intent)
                    } else if (activity == "Botanical") {
                        intent = Intent(
                            this@BotanicalDetailActivity,
                            BotanicalDetailActivity::class.java
                        )
                        intent.putExtra("heading", heading)
                        startActivity(intent)
                    } else if (heading == "Fat") {
                        val intent =
                            Intent(this@BotanicalDetailActivity, FattyAcidActivity::class.java)
                        startActivity(intent)
                    }
                }
            }

            ss.setSpan(
                clickableSpan, index, index + sub_str.length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            index = string.indexOf(sub_str, index + 1)
        }
    }

    fun makeBold(ss: SpannableString, string: String, substr: String) {
        if (string.indexOf(substr) != -1)
            ss.setSpan(
                android.text.style.StyleSpan(android.graphics.Typeface.BOLD),
                string.indexOf(substr),
                string.indexOf(substr) + substr.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
    }

}