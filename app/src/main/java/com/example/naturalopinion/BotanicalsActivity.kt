package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick
import com.example.naturalopinion.databinding.ActivityBotanicalsBinding

class BotanicalsActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var botanical_rv: RecyclerView
    lateinit var botanical_adapter_common: MedicalAdapter
    lateinit var botanical_adapter_clinical: MedicalAdapter
    lateinit var botanical_adapter_latin: MedicalAdapter
    lateinit var back_button: ImageView
    lateinit var binding: ActivityBotanicalsBinding
    var index = 1
    val items_by_latin = ArrayList<String>()
    val items_by_common = ArrayList<String>()
    val items_by_clinical = ArrayList<String>()
    var premium = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBotanicalsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.deep_green)
        }
        back_button = findViewById(R.id.back_button_9)

        val pref = getSharedPreferences("Paid", MODE_PRIVATE)
        premium = pref.getBoolean("Premium",false)

        setLists()

        botanical_adapter_common = MedicalAdapter(this, premium, this, items_by_common, 62)
        botanical_adapter_latin = MedicalAdapter(this, premium, this, items_by_latin, 7)
        botanical_adapter_clinical = MedicalAdapter(this, premium, this, items_by_clinical, 3)

        botanical_rv = findViewById(R.id.botanical_rv)
        botanical_rv.adapter = botanical_adapter_clinical
        botanical_rv.layoutManager = LinearLayoutManager(this)

        back_button.setOnClickListener { finish() }


        binding.first.setOnClickListener {
            index = 1
            binding.languageCard.visibility = View.GONE
            botanical_rv.adapter = botanical_adapter_clinical

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this, R.color.skin))
            binding.firstText.setTextColor(ContextCompat.getColor(this, R.color.deep_green))
            binding.first.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.second.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.third.strokeWidth = 5

        }
        binding.second.setOnClickListener {
            index = 2
            binding.languageCard.visibility = View.VISIBLE
            binding.alertMessage.text = "Botanicals By Latin Name"

            botanical_rv.adapter = botanical_adapter_latin

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this, R.color.skin))
            binding.secondText.setTextColor(ContextCompat.getColor(this, R.color.deep_green))
            binding.second.strokeWidth = 0

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.first.strokeWidth = 5

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.thirdText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.third.strokeWidth = 5

        }
        binding.third.setOnClickListener {
            index = 3
            binding.languageCard.visibility = View.VISIBLE
            binding.alertMessage.text = "Botanicals By Common Name"

            botanical_rv.adapter = botanical_adapter_common

            binding.third.setCardBackgroundColor(ContextCompat.getColor(this, R.color.skin))
            binding.thirdText.setTextColor(ContextCompat.getColor(this, R.color.deep_green))
            binding.third.strokeWidth = 0

            binding.second.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.secondText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.second.strokeWidth = 5

            binding.first.setCardBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            binding.firstText.setTextColor(ContextCompat.getColor(this, R.color.skin))
            binding.first.strokeWidth = 5

        }

        binding.searchEdittext.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Do Nothing
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                filter(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {
                // Do Nothing
            }

        })

    }

    private fun setLists() {
        items_by_common.add("Aconite (Aconitum napellus)")
        items_by_common.add("Agrimony (Agrimonia eupatorium)")
        items_by_common.add("Alfalfa (Medicago sativa)")
        items_by_common.add("American elm (Ulmus fulva)")
        items_by_common.add("Anise (Pimpinella anisum)")
        items_by_common.add("Artichoke (Cynara scolymus)")
        items_by_common.add("Ashwagandha (Withania somnifera)")

        items_by_common.add("Barberry (Berberis vulgaris)")
        items_by_common.add("Bearberry (Arctostaphylos uva ursi)")
        items_by_common.add("Bed straw (Galium aparine)")
        items_by_common.add("Belladonna (Atropa belladonna)")
        items_by_common.add("Beth root (Trillium erectum)")
        items_by_common.add("Bilberry (Vaccinium myrtillus)")
        items_by_common.add("Bitter melon (Momordica charantia)")
        items_by_common.add("Black cohosh (Cimicifuga racemosa)")
        items_by_common.add("Bladderdock (Petasites hybridus)")
        items_by_common.add("Bladderwrack (Fucus vesiculosus)")
        items_by_common.add("Blood root (Sanguinaria canadensia)")
        items_by_common.add("Blue cohosh (Caulophyllum thalictroides)")
        items_by_common.add("Bog Rhubarb (Petasites hybridus)")
        items_by_common.add("Bryony (Bryonia alba)")
        items_by_common.add("Buchu (Barosma betulina)")
        items_by_common.add("Buckthorn (Rhamnus frangula)")
        items_by_common.add("Burdock")
        items_by_common.add("Butcher's broom (Ruscus aculeatus)")
        items_by_common.add("Butterbur (Petasites hybridus)")

        items_by_common.add("Calamus (Acorus calamus)")
        items_by_common.add("California poppy (Eschscholzia californica)")
        items_by_common.add("Cascara (Rhamnus purshiana)")
        items_by_common.add("Catnip (Nepeta cataria)")
        items_by_common.add("Cayenne (Capsicum frutescens)")
        items_by_common.add("Celandine (Chelidonium majus)")
        items_by_common.add("Chapparrel (Larrea tridentata)")
        items_by_common.add("Chaste tree (Vitex agnus castus)")
        items_by_common.add("Chickweed (Stellaria media)")
        items_by_common.add("Chinese ginseng (Panax ginseng)")
        items_by_common.add("Cinnamon (Cinnamomum spp.)")
        items_by_common.add("Cleavers (Galium aparine)")
        items_by_common.add("Colt's foot (Tussilago farfara)")
        items_by_common.add("Comfrey (Symphytum officinale)")
        items_by_common.add("Corn silk (Zea mays)")
        items_by_common.add("Corydalis (Corydalis bulbosa)")
        items_by_common.add("Cramp bark (Viburnum opulus)")
        items_by_common.add("Cranesbill (Geranium maculatum)")
        items_by_common.add("Creosote bush (Larrea tridentata)")
        items_by_common.add("Creosotum (Larrea tridentata)")
        items_by_common.add("Curly dock (Rumex crispis)")

        items_by_common.add("Dandelion (Taraxacum officinale)")
        items_by_common.add("Danshen (Salvia miltiorrhiza)")
        items_by_common.add("Devil's claw (Harpagophytum procumbens)")
        items_by_common.add("Devil's club (Oplopanax horridum)")
        items_by_common.add("Desert parsley (Lomatium disectum)")
        items_by_common.add("Dong quai (Angelica sinensis)")

        items_by_common.add("Elder (Sambucus canadensis, nigra)")
        items_by_common.add("Elecampane (Inula helenium)")
        items_by_common.add("Eyebright (Euphrasia officinalis)")

        items_by_common.add("False unicorn (Chamaelirium luteum)")
        items_by_common.add("Fennel (Foeniculum vulgare)")
        items_by_common.add("Fenugreek (Trigonella foenum-graecum)")
        items_by_common.add("Flax (Linum usitatissimum)")
        items_by_common.add("Fo-ti (Polygonum multiflorum)")
        items_by_common.add("Fringe tree (Chionanthus virginicus)")

        items_by_common.add("Garlic (Allium sativum)")
        items_by_common.add("Gelsemium (Gelsemium sempervirens)")
        items_by_common.add("Gentian (Gentiana lutea)")
        items_by_common.add("German chamomile (Matricaria chamomilla)")
        items_by_common.add("Ginger (Zingiber officinale)")
        items_by_common.add("Ginkgo (Ginkgo biloba)")
        items_by_common.add("Goldenseal (Hydrastis canadensis)")
        items_by_common.add("Gota kola (Centella asiatica)")
        items_by_common.add("Grapple plant (Harpagophytum procumbens)")
        items_by_common.add("Green tea (Camellia sinensis)")
        items_by_common.add("Guggulu (Commiphora mukul)")
        items_by_common.add("Gumweed (Grindelia camporum)")
        items_by_common.add("Gymnema (Gymnema sylvestre)")

        items_by_common.add("Hawthorne (Crataegus oxycantha)")
        items_by_common.add("He-shou-wu (Polygonum multiflorum)")
        items_by_common.add("Hops (Humulus lupulus)")
        items_by_common.add("Horehound (Marrubium vulgare)")
        items_by_common.add("Horsechestnut (Aesculus hippocastanum)")
        items_by_common.add("Horseradish (Armoracia rusticana)")
        items_by_common.add("Horsetail (Equisetum arvense)")
        items_by_common.add("Hyssop (Hyssopus officinalis)")

        items_by_common.add("Indian tobacco (Lobelia inflata)")

        items_by_common.add("Jamaican dogwood (Piscidia piscipula)")
        items_by_common.add("Jimson weed (Datura stramonium)")
        items_by_common.add("Juniper (Juniperis communis)")

        items_by_common.add("Kava kava (Piper methysticum)")
        items_by_common.add("Kelp (Fucus versiculosus)")
        items_by_common.add("Khella (Ammi visnaga)")
        items_by_common.add("Korean ginseng (Panax ginseng)")

        items_by_common.add("Lady's mantle (Alchemilla vulgaris)")
        items_by_common.add("Lavender (Lavendula angustifolia)\n")
        items_by_common.add("Lemon balm (Melissa officinalis)\n")
        items_by_common.add("Licorice (Glycyrrhiza glabra)\n")
        items_by_common.add("Lime blossom (Tilia europaea)")
        items_by_common.add("Linden flower (Tilia europaea)")
        items_by_common.add("Linseed (Linum usitatissimum)")
        items_by_common.add("Lion's tooth (Taraxacum officinale)")
        items_by_common.add("Lungwort (Sticta pulmonaria)")

        items_by_common.add("Ma huang (Ephedra sinica)")
        items_by_common.add("Marigold (Calendula officinalis)")
        items_by_common.add("Marshmallow (Althea officinalis)")
        items_by_common.add("Meadowsweet (Filipendula ulmaria)")
        items_by_common.add("Milk thistle (Silybum marianum)")
        items_by_common.add("Milk vetch (Astragalus membranaceus)")
        items_by_common.add("Mistletoe (Viscum alba)")
        items_by_common.add("Monkshood (Aconitum napellus)")
        items_by_common.add("Monk's pepper (Vitex agnus castus)")
        items_by_common.add("Motherwort (Leonurus cardiaca)")
        items_by_common.add("Mullein (Verbascum thapsus)")
        items_by_common.add("Myrrh (Commiphora molmol)")

        items_by_common.add("Nettles (Urtica urens)")

        items_by_common.add("Oats (Avena sativa)")
        items_by_common.add("Old man's beard (Usnea spp.)")
        items_by_common.add("Osha (Ligusticum porteri)")

        items_by_common.add("Paracress (Spilanthes acmella)")
        items_by_common.add("Parsley (Petroselinum crispum)")
        items_by_common.add("Partridge berry (Mitchella repens)")
        items_by_common.add("Passionflower (Passiflora incarnata)")
        items_by_common.add("Pau d' arco (Tabebuia impetiginosa)")
        items_by_common.add("Peppermint (Mentha piperita)")
        items_by_common.add("Pipsissewa (Chimaphilia umbellata)")
        items_by_common.add("Pleurisy root (Asclepias tuberosa)")
        items_by_common.add("Poke (Phytolacca decandra)")
        items_by_common.add("Puke weed (Lobelia inflata)")
        items_by_common.add("Purple cone flower (Echinacea angustifolia)")
        items_by_common.add("Pygeum (Pygeum africanum)")

        items_by_common.add("Queen's root (Stillingia sylvatica)")

        items_by_common.add("Red clover (Trifollium pratense)")
        items_by_common.add("Red pepper (Capsicum frutescens)")
        items_by_common.add("Rhubarb (Rheum officinalis)")
        items_by_common.add("Rosemary (Rosmarius officinalis)")

        items_by_common.add("Sage (Salvia officinalis)")
        items_by_common.add("Saint John's wort (Hypericum perforatum)")
        items_by_common.add("Sarsaparilla (Smilax sarsaparilla)")
        items_by_common.add("Saw palmetto (Serenoa repens)")
        items_by_common.add("Shave grass (Equisetum arvense)")
        items_by_common.add("Siberian ginseng (Eleutherococcus senticosus)")
        items_by_common.add("Skullcap (Scutellaria laterifolia)")
        items_by_common.add("Skunk cabbage (Symplocarpus foetida)")
        items_by_common.add("Slippery elm (Ulmus fulva)")
        items_by_common.add("Southern prickly ash (Zanthoxylum clava-herculis)")
        items_by_common.add("Squawvine (Mitchella repens)")
        items_by_common.add("Stone root (Collinsonia canadensis)")
        items_by_common.add("Sweetflag (Acorus calamus)")

        items_by_common.add("Tea tree (Melaleuca alternifolia)")
        items_by_common.add("Thornapple (Datura stramonium)")
        items_by_common.add("Thoroughwax (Bupleurum chinense)")
        items_by_common.add("Thyme (Thymus vulgaris)")
        items_by_common.add("True unicorn (Aletris farinosa)")
        items_by_common.add("Tumeric (Curcuma longa)")

        items_by_common.add("Valerian (Valeriana officinalis)")
        items_by_common.add("Vervain (Verbena officinalis)")
        items_by_common.add("Western cedar (Thuja plicata, occidentalis)")
        items_by_common.add("Wild geranium (Geranium maculatum)")
        items_by_common.add("Wild indigo (Baptisia tintoria)")
        items_by_common.add("Wild yam (Dioscorea villosa)")
        items_by_common.add("Witch hazel (Hamamelis virginiana)")
        items_by_common.add("Wu wei zi (Schisandra chinensis)")

        items_by_common.add("Yarrow (Achillea millefolium)")
        items_by_common.add("Yellow dock (Rumex crispis)")
        items_by_common.add("Yellow jasmine (Gelsemium sempervirens)")
        items_by_common.add("Yerba santa (Eriodictyon californicum)")
        items_by_common.add("Yew (Taxus brevifolia)")
        items_by_common.add("Yohimbe (Pausinystalia yohimbe)")
        items_by_common.add("Yucca (Yucca spp.)")

        //latin list
        items_by_latin.add("Achillea millefolium (Yarrow)")
        items_by_latin.add("Aconitum napellus (Monkshood, Aconite)")
        items_by_latin.add("Acorus calamus (Sweetflag, Acorus)")
        items_by_latin.add("Aesculus hippocastanum (Horsechestnut)")
        items_by_latin.add("Agrimonia eupatorium (Agrimony)")
        items_by_latin.add("Alchemilla vulgaris (Lady's mantle)")
        items_by_latin.add("Aletris farinosa (True unicorn)")
        items_by_latin.add("Allium sativum (Garlic)")
        items_by_latin.add("Althea officinalis (Marshmallow)")
        items_by_latin.add("Ammi visnaga (Khella)")
        items_by_latin.add("Angelica sinensis (Dong quai)")
        items_by_latin.add("Arctium lappa (Burdock)")
        items_by_latin.add("Arctostaphylos uva ursi (Bearberry)")
        items_by_latin.add("Armoracia rusticana (Horseradish)")
        items_by_latin.add("Asclepias tuberosa (Pleurisy root)")
        items_by_latin.add("Astragalus membranaceus (Milk vetch)")
        items_by_latin.add("Atropa belladonna (Belladonna)")
        items_by_latin.add("Avena sativa (Oats)")

        items_by_latin.add("Baptisia tintoria (Wild indigo)")
        items_by_latin.add("Barosma betulina (Buchu)")
        items_by_latin.add("Berberis vulgaris (Barberry)")
        items_by_latin.add("Bryonia alba (Bryony)")
        items_by_latin.add("Bupleurum chinense (Thoroughwax)")

        items_by_latin.add("Calendula officinalis (Marigold)")
        items_by_latin.add("Camellia sinensis (Green tea)")
        items_by_latin.add("Capsicum frutescens (Cayenne, Red pepper)")
        items_by_latin.add("Caulophyllum thalictroides (Blue cohosh)")
        items_by_latin.add("Centella asiatica (Gota kola)")
        items_by_latin.add("Chamaelirium luteum (False unicorn)")
        items_by_latin.add("Chelidonium majus (Celandine)")
        items_by_latin.add("Chimaphilia umbellata (Pipsissewa)")
        items_by_latin.add("Chionanthus virginicus (Fringe tree)")
        items_by_latin.add("Cimicifuga racemosa (Black cohosh)")
        items_by_latin.add("Cinnamomum spp. (Cinnamon)")
        items_by_latin.add("Collinsonia canadensis (Stone root)")
        items_by_latin.add("Commiphora molmol (Myrrh)")
        items_by_latin.add("Commiphora mukul (Guggulu)")
        items_by_latin.add("Corydalis bulbosa (Corydalis)")
        items_by_latin.add("Crataegus oxycantha (Hawthorne)")
        items_by_latin.add("Curcuma longa (Tumeric)")
        items_by_latin.add("Cynara scolymus (Artichoke)")

        items_by_latin.add("Datura stramonium (Jimson weed, Thornapple)")
        items_by_latin.add("Dioscorea villosa (Wild yam)")

        items_by_latin.add("Echinacea angustifolia (Purple cone flower)")
        items_by_latin.add("Eleutherococcus senticosus (Siberian ginseng)")
        items_by_latin.add("Ephedra sinica (Ma huang)")
        items_by_latin.add("Equisetum arvense (Shave grass, Horsetail)")
        items_by_latin.add("Eriodictyon californicum (Yerba santa)")
        items_by_latin.add("Eschscholzia californica (California poppy)")
        items_by_latin.add("Euphrasia officinalis (Eyebright)")

        items_by_latin.add("Filipendula ulmaria (Meadowsweet)")
        items_by_latin.add("Foeniculum vulgare (Fennel)")
        items_by_latin.add("Fucus vesiculosus (Bladderwrack, Kelp)")

        items_by_latin.add("Galium aparine (Cleavers, Bed straw)")
        items_by_latin.add("Gelsemium sempervirens (Yellow jasmine, Gelsemium)")
        items_by_latin.add("Gentiana lutea (Gentian)")
        items_by_latin.add("Geranium maculatum (Wild geranium, Cranesbill)")
        items_by_latin.add("Ginkgo biloba (Ginkgo)")
        items_by_latin.add("Glycyrrhiza glabra (Licorice)")
        items_by_latin.add("Grindelia camporum (Gumweed)")
        items_by_latin.add("Gymnema sylvestre (Gymnema)")

        items_by_latin.add("Hamamelis virginiana (Witch hazel)")
        items_by_latin.add("Harpagophytum procumbens (Devil's claw, Grapple plant)")
        items_by_latin.add("Humulus lupulus (Hops)")
        items_by_latin.add("Hydrastis canadensis (Goldenseal)")
        items_by_latin.add("Hypericum perforatum (St. John's wort)")
        items_by_latin.add("Hyssopus officinalis (Hyssop)")

        items_by_latin.add("Inula helenium (Elecampane)")

        items_by_latin.add("Juniperis communis (Juniper)")

        items_by_latin.add("Larrea tridentata (Chapparrel, Creosote bush, Creosotum)")
        items_by_latin.add("Lavendula angustifolia (Lavender)")
        items_by_latin.add("Leonurus cardiaca (Motherwort)")
        items_by_latin.add("Ligusticum porteri (Osha)")
        items_by_latin.add("Linum usitatissimum (Flax, Linseed)")
        items_by_latin.add("Lobelia inflata (Indian tobacco, Puke weed)")
        items_by_latin.add("Lomatium disectum (Desert parsley)")

        items_by_latin.add("Marrubium vulgare (Horehound)")
        items_by_latin.add("Matricaria chamomilla (German chamomile)")
        items_by_latin.add("Medicago sativa (Alfalfa)")
        items_by_latin.add("Melaleuca alternifolia (Tea tree)")
        items_by_latin.add("Melissa officinalis (Lemon balm)")
        items_by_latin.add("Mentha piperita (Peppermint)")
        items_by_latin.add("Mitchella repens (Squawvine, Partridge berry)")
        items_by_latin.add("Momordica charantia (Bitter melon)")

        items_by_latin.add("Nepeta cataria (Catnip)")

        items_by_latin.add("Oplopanax horridum (Devil's club)")

        items_by_latin.add("Panax ginseng (Chinese ginseng, Korean ginseng)")
        items_by_latin.add("Passiflora incarnata (Passionflower)")
        items_by_latin.add("Pausinystalia yohimbe (Yohimbe)")
        items_by_latin.add("Petasites hybridus (Butterbur, Bladderdock, Bog Rhubarb)")
        items_by_latin.add("Petroselinum crispum (Parsley)")
        items_by_latin.add("Phytolacca decandra (Poke)")
        items_by_latin.add("Pimpinella anisum (Anise)")
        items_by_latin.add("Piper methysticum (Kava kava)")
        items_by_latin.add("Piscidia piscipula (Jamaican dogwood)")
        items_by_latin.add("Polygonum multiflorum (Fo-ti, He-shou-wu)")
        items_by_latin.add("Pygeum africanum (Pygeum)")

        items_by_latin.add("Rhamnus frangula (Buckthorn)")
        items_by_latin.add("Rhamnus purshiana (Cascara)")
        items_by_latin.add("Rheum officinalis (Rhubarb)")
        items_by_latin.add("Rosmarius officinalis (Rosemary)")
        items_by_latin.add("Rumex crispis (Yellow dock, Curly dock)")
        items_by_latin.add("Ruscus aculeatus (Butcher's broom)")

        items_by_latin.add("Salvia miltiorrhiza (Danshen)")
        items_by_latin.add("Salvia officinalis (Sage)")
        items_by_latin.add("Sambucus canadensis, nigra (Elder)")
        items_by_latin.add("Sanguinaria canadensia (Blood root)")
        items_by_latin.add("Schisandra chinensis (Wu wei zi)")
        items_by_latin.add("Scutellaria laterifolia (Skullcap)")
        items_by_latin.add("Serenoa repens (Saw palmetto)")
        items_by_latin.add("Silybum marianum (Milk thistle)")
        items_by_latin.add("Smilax sarsaparilla (Sarsaparilla)")
        items_by_latin.add("Spilanthes acmella (Paracress)")
        items_by_latin.add("Stellaria media (Chickweed)")
        items_by_latin.add("Sticta pulmonaria (Lungwort)")
        items_by_latin.add("Stillingia sylvatica (Queen's root)")
        items_by_latin.add("Symphytum officinale (Comfrey)")
        items_by_latin.add("Symplocarpus foetida (Skunk cabbage)")

        items_by_latin.add("Tabebuia impetiginosa (Pau d' arco)")
        items_by_latin.add("Tanacetum parthenium (Feverfew)")
        items_by_latin.add("Taraxacum officinale (Dandelion, Lion's tooth)")
        items_by_latin.add("Taxus brevifolia (Yew)")
        items_by_latin.add("Thuja plicata, occidentalis (Western cedar)")
        items_by_latin.add("Thymus vulgaris (Thyme)")
        items_by_latin.add("Tilia europaea (Linden flower, Lime blossom)")
        items_by_latin.add("Trifollium pratense (Red clover)")
        items_by_latin.add("Trigonella foenum-graecum (Fenugreek)")
        items_by_latin.add("Trillium erectum (Beth root)")
        items_by_latin.add("Tussilago farfara (Colt's foot)")

        items_by_latin.add("Ulmus fulva (Slippery elm, American elm)")
        items_by_latin.add("Urtica urens (Nettles)")
        items_by_latin.add("Usnea spp. (Old man's beard)")

        items_by_latin.add("Vaccinium myrtillus (Bilberry)")
        items_by_latin.add("Valeriana officinalis (Valerian)")
        items_by_latin.add("Verbascum thapsus (Mullein)")
        items_by_latin.add("Verbena officinalis (Vervain)")
        items_by_latin.add("Viburnum opulus (Cramp bark)")
        items_by_latin.add("Viscum alba (Mistletoe)")
        items_by_latin.add("Vitex agnus castus (Chaste tree, Monk's pepper)")
        items_by_latin.add("Withania somnifera (Ashwagandha)")

        items_by_latin.add("Yucca spp. (Yucca)")

        items_by_latin.add("Zanthoxylum clava-herculis (Southern prickly ash)")
        items_by_latin.add("Zea mays (Corn silk)")
        items_by_latin.add("Zingiber officinale (Ginger)")

        //Clinical classification
        items_by_clinical.add("Alterative")
        items_by_clinical.add("Analgesic/Anodyne")
        items_by_clinical.add("Antiallergic")
        items_by_clinical.add("Antiatherosclerotic")
        items_by_clinical.add("Antibiotic/Antibacterial")
        items_by_clinical.add("Antidepressant")
        items_by_clinical.add("Antidiarrheic")
        items_by_clinical.add("Antidiuretic")
        items_by_clinical.add("Antidysmenorrheic")
        items_by_clinical.add("Antidyspeptic")
        items_by_clinical.add("Antiedemic")
        items_by_clinical.add("Antifungal")
        items_by_clinical.add("Antiherpetic")
        items_by_clinical.add("Anti-inflammatory")
        items_by_clinical.add("Antineoplastic")
        items_by_clinical.add("Antirheumatic")
        items_by_clinical.add("Antiseptic")
        items_by_clinical.add("Antispasmodic")
        items_by_clinical.add("Antitussive")
        items_by_clinical.add("Antiviral")
        items_by_clinical.add("Astringent")
        items_by_clinical.add("Bitter")
        items_by_clinical.add("Carminative")
        items_by_clinical.add("Cathartic")
        items_by_clinical.add("Cholagogue")
        items_by_clinical.add("Demulcent")
        items_by_clinical.add("Depressant")
        items_by_clinical.add("Diaphoretic")
        items_by_clinical.add("Diuretic")
        items_by_clinical.add("Emetic")
        items_by_clinical.add("Emmenagogue")
        items_by_clinical.add("Estrogenic")
        items_by_clinical.add("Expectorant")
        items_by_clinical.add("Febrifuge")
        items_by_clinical.add("Hemostatic")
        items_by_clinical.add("Hypnotic")
        items_by_clinical.add("Hypoglycemic")
        items_by_clinical.add("Hypotensive")
        items_by_clinical.add("Laxative")
        items_by_clinical.add("Lipotropic")
        items_by_clinical.add("Nervine")
        items_by_clinical.add("Nutritive")
        items_by_clinical.add("Progesteronic")
        items_by_clinical.add("Purgative")
        items_by_clinical.add("Rubefacient")
        items_by_clinical.add("Sedative")
        items_by_clinical.add("Sialagogue")
        items_by_clinical.add("Stimulant")
        items_by_clinical.add("Stomachic")
        items_by_clinical.add("Synergist")
        items_by_clinical.add("Tonic")
        items_by_clinical.add("Toxic")
        items_by_clinical.add("Vasoconstrictor")
        items_by_clinical.add("Vasodilator")
        items_by_clinical.add("Vesicant")
        items_by_clinical.add("Vulnerary")

    }

    override fun onItemCLick(position: Int) {
        if (index == 1) {
            val list = ArrayList<String>()
            if(premium||items_by_clinical[position]=="Antiatherosclerotic"){
                when (items_by_clinical[position]) {
                    "Alterative" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Arctium lappa (Burdock)")
                        list.add("Avena sativa (Oats)")
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Berberis vulgaris (Barberry)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Chimaphilia umbellata (Pipsissewa)")
                        list.add("Chionanthus virginicus (Fringe tree)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Collinsonia canadensis (Stone root)")
                        list.add("Corydalis bulbosa (Corydalis)")
                        list.add("Echinacea angustifolia (Purple cone flower)")
                        list.add("Equisetum arvense (Shave grass, Horsetail)")
                        list.add("Fucus vesiculosus (Bladderwrack, Kelp)")
                        list.add("Galium aparine (Cleavers, Bed straw)")
                        list.add("Geranium maculatum (Wild geranium, Cranesbill)")
                        list.add("Hydrastis canadensis (Goldenseal)")
                        list.add("Hypericum perforatum (St. John's wort)")
                        list.add("Phytolacca decandra (Poke)")
                        list.add("Rumex crispis (Yellow dock, Curly dock)")
                        list.add("Salvia officinalis (Sage)")
                        list.add("Sambucus canadensis, nigra (Elder)")
                        list.add("Sanguinaria canadensia (Blood root)")
                        list.add("Smilax sarsaparilla (Sarsaparilla)")
                        list.add("Stillingia sylvatica (Queen's root)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                        list.add("Trifollium pratense (Red clover)")
                        list.add("Verbena officinalis (Vervain)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                    }
                    "Analgesic/Anodyne" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Aconitum napellus (Monkshood, Aconite)")
                        list.add("Angelica sinensis (Dong quai)")
                        list.add("Arctostaphylos uva ursi (Bearberry)")
                        list.add("Asclepias tuberosa (Pleurisy root)")
                        list.add("Atropa belladonna (Belladonna)")
                        list.add("Bryonia alba (Bryony)")
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Corydalis bulbosa (Corydalis)")
                        list.add("Curcuma longa (Tumeric)")
                        list.add("Datura stramonium (Jimson weed, Thornapple)")
                        list.add("Dioscorea villosa (Wild yam)")
                        list.add("Eschscholzia californica (California poppy)")
                        list.add("Filipendula ulmaria (Meadowsweet)")
                        list.add("Gelsemium sempervirens (Yellow jasmine, Gelsemium)")
                        list.add("Harpagophytum procumbens (Devil's claw, Grapple plant)")
                        list.add("Leonurus cardiaca (Motherwort)")
                        list.add("Matricaria chamomilla (German chamomile)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Passiflora incarnata (Passionflower)")
                        list.add("Petasites hybridus (Butterbur)")
                        list.add("Piper methysticum (Kava kava)")
                        list.add("Piscidia piscipula (Jamaican dogwood)")
                        list.add("Rosmarius officinalis (Rosemary)")
                        list.add("Sticta pulmonaria (Lungwort)")
                        list.add("Symphytum officinale (Comfrey)")
                        list.add("Urtica urens (Nettles)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Verbascum thapsus (Mullein)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Antiallergic" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Angelica sinensis (Dong quai)")
                        list.add("Berberis vulgaris (Barberry)")
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Ephedra sinica (Ma huang)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Hydrastis canadensis (Goldenseal)")
                        list.add("Larrea tridentata (Chapparrel, Creosote bush, Creosotum)")
                        list.add("Linum usitatissimum (Flax, Linseed)")
                        list.add("Spilanthes acmella (Paracress)")
                        list.add("Scutellaria laterifolia (Skullcap)")
                        list.add("Urtica urens (Nettles)")
                    }
                    "Antiatherosclerotic" -> {
                        list.add("Allium sativum (Garlic)")
                        list.add("Camellia sinensis (Green tea)")
                        list.add("Commiphora mukul (Guggulu)")
                        list.add("Crataegus oxycantha (Hawthorn, May bush, Whitethorn)")
                        list.add("Curcuma longa (Tumeric)")
                        list.add("Ginkgo biloba (Ginkgo)")
                        list.add("Medicago sativa (Alfalfa)")
                        list.add("Polygonum multiflorum (Fo-Ti, He-shou-wu)")
                        list.add("Salvia miltiorrhiza (Danshen)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Antibiotic/Antibacterial" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Allium sativum (Garlic)")
                        list.add("Arctium lappa (Burdock)")
                        list.add("Arctostaphylos uva ursi (Bearberry)")
                        list.add("Armoracia rusticana (Horseradish)")
                        list.add("Astragalus membranaceus (Milk vetch)")
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Berberis vulgaris (Barberry)")
                        list.add("Calendula officinalis (Marigold)")
                        list.add("Camellia sinensis (Green tea)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Curcuma longa (Tumeric)")
                        list.add("Echinacea angustifolia (Purple cone flower)")
                        list.add("Fucus vesiculosus (Bladderwrack, Kelp)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Hydrastis canadensis (Goldenseal)")
                        list.add("Hypericum perforatum (St. John's wort)")
                        list.add("Inula helenium (Elecampane)")
                        list.add("Lavendula angustifolia (Lavender)")
                        list.add("Lomatium disectum (Desert parsley)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Momordica charantia (Bitter melon)")
                        list.add("Polygonum multiforum (Fo-ti, He-shou-wu)")
                        list.add("Rheum officinalis (Rhubarb)")
                        list.add("Salvia miltiorrhiza (Danshen)")
                        list.add("Salvia officinalis (Sage)")
                        list.add("Sanguinaria canadensia (Blood root)")
                        list.add("Schisandra chinensis (Wu wei zi)")
                        list.add("Spilanthes acmella (Paracress)")
                        list.add("Tabebuia impetiginosa (Pau d' arco)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                        list.add("Thuja plicata, occidentalis (Western cedar)")
                        list.add("Thymus vulgaris (Thyme)")
                        list.add("Usnea spp. (Old man's beard)")
                        list.add("Vaccinium myrtillus (Bilberry)")
                        list.add("Withania somnifera (Ashwagandha)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                    }
                    "Antidepressant" -> {
                        list.add("Avena sativa (Oats)")
                        list.add("Hypericum perforatum (St. John's wort)")
                        list.add("Verbena officinalis (Vervain)")
                    }
                    "Antidiarrheic" -> {
                        list.add("Agrimonia eupatorium (Agrimony)")
                        list.add("Camellia sinensis (Green tea)")
                        list.add("Trifollium pratense (Red clover)")
                        list.add("Vaccinium myrtillus (Bilberry)")
                    }
                    "Antidiuretic" -> {
                        list.add("Valeriana officinalis (Valerian)")
                    }
                    "Antidysmenorrheic" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Equisetum arvense (Shave grass, Horsetail)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Verbena officinalis (Vervain)")
                    }
                    "Antidyspeptic" -> {
                        list.add("Allium sativum (Garlic)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Melissa officinalis (Lemon balm)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Momordica charantia (Bitter melon)")
                        list.add("Polygonum multiflorum (Fo-ti, He-shou-wu)")
                        list.add("Tanacetum parthenium) (Feverfew)")
                        list.add("Verbena officinalis (Vervain)")
                    }
                    "Antiedemic" -> {
                        list.add("Aesculus hippocastanum (Horsechestnut)")
                    }
                    "Antifungal" -> {
                        list.add("Arctium lappa (Burdock)")
                        list.add("Berberis vulgaris (Barberry)")
                        list.add("Lomatium disectum (Desert parsley)")
                        list.add("Polygonum multiforum (Fo-Ti, He-shou-wu)")
                        list.add("Tabebuia impetiginosa (Pau d' arco)")
                        list.add("Tanacetum parthenium) (Feverfew)")
                    }
                    "Antiherpetic" -> {
                        list.add("Echinacea angustifolia (Purple cone flower)")
                        list.add("Hypericum perforatum (St. John's wort)")
                        list.add("Hyssopus officinalis (Hyssop)")
                        list.add("Lomatium disectum (Desert parsley)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Spilanthes acmella (Paracress)")
                        list.add("Thuja plicata, occidentalis (Western cedar)")
                    }
                    "Anti-inflammatory" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Camellia sinensis (Green tea)")
                        list.add("Curcuma longa (Tumeric)")
                        list.add("Ephedra sinica (Ma huang)")
                        list.add("Foeniculum vulgare (Fennel)")
                        list.add("Geranium maculatum (Wild geranium, Cranesbill)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Harpagophytum procumbens (Devil's claw, Grapple plant)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Larrea tridentata (Chapparrel, Creosote bush, Creosotum)")
                        list.add("Linum usitatissimum (Flax, Linseed)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Petasites hybridus (Butterbur)")
                        list.add("Piper methysticum (Kava kava)")
                        list.add("Polygonum multiflorum (Fo-ti, He-shou-wu)")
                        list.add("Ruscus aculeatus (Butcher's broom)")
                        list.add("Scutellaria laterifolia (Skullcap)")
                        list.add("Tussilago farfara (Colt's foot)")
                        list.add("Withania somnifera (Ashwagandha)")
                    }
                    "Antineoplastic" -> {
                        list.add("Camellia sinensis (Green tea)")
                        list.add("Curcuma longa (Tumeric)")
                        list.add("Echinacea angustifolia (Purple cone flower)")
                        list.add("Larrea tridentata (Chapparrel, Creosote bush, Creosotum)")
                        list.add("Momordica charantia (Bitter melon)")
                        list.add("Rheum officinalis (Rhubarb)")
                        list.add("Tabebuia impetiginosa (Pau d' arco)")
                        list.add("Trifollium pratense (Red clover)")
                        list.add("Withania somnifera (Ashwagandha)")
                    }
                    "Antirheumatic" -> {
                        list.add("Aconitum napellus (Monkshood, Aconite)")
                        list.add("Bryonia alba (Bryony)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Harpagophytum procumbens (Devil's claw, Grapple plant)")
                        list.add("Vitex agnus castus (Chaste tree, Monk's pepper)")
                        list.add("Wathanis somnifera (Ashwagandha)")
                        list.add("Yucca spp. (Yucca)")
                    }
                    "Antiseptic" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Aconitum napellus (Monkshood, Aconite)")
                        list.add("Allium sativum (Garlic)")
                        list.add("Arctostaphylos uva ursi (Bearberry)")
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Barosma betulina (Buchu)")
                        list.add("Calendula officinalis (Marigold)")
                        list.add("Chimaphilia umbellata (Pipsissewa)")
                        list.add("Chionanthus virginicus (Fringe tree)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Echinacea angustifolia (Purple cone flower)")
                        list.add("Hydrastis canadensis (Goldenseal)")
                        list.add("Juniperis communis (Juniper)")
                        list.add("Salvia officinalis (Sage)")
                        list.add("Thuja plicata, occidentalis (Western cedar)")
                        list.add("Thymus vulgaris (Thyme)")
                        list.add("Urtica urens (Nettles)")
                        list.add("Vaccinium myrtillus (Bilberry)")
                    }
                    "Antispasmodlist.add(ic" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Allium sativum (Garlic)")
                        list.add("Ammi visnaga (Khella)")
                        list.add("Atropa belladonna (Belladonna)")
                        list.add("Calendula officinalis (Marigold)")
                        list.add("Caulophyllum thalictroides (Blue cohosh)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Datura stramonium (Jimson weed, Thornapple)")
                        list.add("Dioscorea villosa (Wild yam)")
                        list.add("Ephedra sinica (Ma huang)")
                        list.add("Foeniculum vulgare (Fennel)")
                        list.add("Gelsemium sempervirens (Yellow jasmine, Gelsemium)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Grindelia camporum (Gumweed)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Leonurus cardiaca (Motherwort)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Matricaria chamomilla (German chamomile)")
                        list.add("Melissa officinalis (Lemon balm)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Passiflora incarnata (Passionflower)")
                        list.add("Petasites hybridus (Butterbur)")
                        list.add("Piper methysticum (Kava kava)")
                        list.add("Rosmarius officinalis (Rosemary)")
                        list.add("Scutellaria laterifolia (Skullcap)")
                        list.add("Serenoa repens (Saw palmetto)")
                        list.add("Symplocarpus foetida (Skunk cabbage)")
                        list.add("Thymus vulgaris (Thyme)")
                        list.add("Trifollium pratense (Red clover)")
                        list.add("Trillium erectum (Beth root)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Verbena officinalis (Vervain)")
                        list.add("Viburnum opulus (Cramp bark)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Antitussive" -> {
                        list.add("Arctium lappa (Burdock)")
                        list.add("Asclepias tuberosa (Pleurisy root)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Inula helenium (Elecampane)")
                        list.add("Trifollium pratense (Red clover)")
                        list.add("Verbascum thapsus (Mullein)")
                    }
                    "Antiviral" -> {
                        list.add("Echinacea angustifolia (Purple cone flower)")
                        list.add("Ligusticum porteri (Osha)")
                        list.add("Lomatium disectum (Desert parsley)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Momordica charantia (Bitter melon)")
                        list.add("Phytolacca decandra (Poke)")
                        list.add("Tabebuia impetiginosa (Pau d' arco)")
                    }
                    "Astringent" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Aesculus hippocastanum (Horsechestnut)")
                        list.add("Alchemilla vulgaris (Lady's mantle)")
                        list.add("Althea officinalis (Marshmallow)")
                        list.add("Arctostaphylos uva ursi (Bearberry)")
                        list.add("Berberis vulgaris (Barberry)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Collinsonia canadensis (Stone root)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Equisetum arvense (Shave grass, Horsetail)")
                        list.add("Euphrasia officinalis (Eyebright)")
                        list.add("Geranium maculatum (Wild geranium, Cranesbill)")
                        list.add("Hamamelis virginiana (Witch hazel)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Hydrastis canadensis (Goldenseal)")
                        list.add("Mitchella repens (Squawvine, Partridge berry)")
                        list.add("Rheum officinalis (Rhubarb)")
                        list.add("Salvia officinalis (Sage)")
                        list.add("Sambucus canadensis, nigra (Elder)")
                        list.add("Stillingia sylvatica (Queen's root)")
                        list.add("Urtica urens (Nettles)")
                        list.add("Vaccinium myrtillus (Bilberry)")
                        list.add("Verbena officinalis (Vervain)")
                    }
                    "Bitter" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Agrimonia eupatorium (Agrimony)")
                        list.add("Gentiana lutea (Gentian)")
                        list.add("Harpagophytum procumbens (Devil's claw, Grapple plant)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Rheum officinalis (Rhubarb)")
                        list.add("Silybum marianum (Milk thistle)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                        list.add("Usnea spp. (Old man's beard)")
                    }
                    "Carminative" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Barosma betulina (Buchu)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Foeniculum vulgare (Fennel)")
                        list.add("Hyssopus officinalis (Hyssop)")
                        list.add("Juniperis communis (Juniper)")
                        list.add("Matricaria chamomilla (German chamomile)")
                        list.add("Melaleuca alternifolia (Tea tree)")
                        list.add("Melissa officinalis (Lemon balm)")
                        list.add("Nepeta cataria (Catnip)")
                        list.add("Pimpinella anisum (Anise)")
                        list.add("Salvia officinalis (Sage)")
                        list.add("Sambucus canadensis, nigra (Elder)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Cathartic" -> {
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Bryonia alba (Bryony)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Rhamnus purshiana (Cascara)")
                        list.add("Stillingia sylvatica (Queen's root)")
                    }
                    "Cholagogue" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Arctium lappa (Burdock)")
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Berberis vulgaris (Barberry)")
                        list.add("Calendula officinalis (Marigold)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Chionanthus virginicus (Fringe tree)")
                        list.add("Curcuma longa (Tumeric)")
                        list.add("Cynara scolymus (Artichoke)")
                        list.add("Gentiana lutea (Gentian)")
                        list.add("Lavendula angustifolia (Lavender)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Rheum officinalis (Rhubarb)")
                        list.add("Rosmarius officinalis (Rosemary)")
                        list.add("Sanguinaria canadensia (Blood root)")
                        list.add("Schisandra chinensis (Wu wei zi)")
                        list.add("Stillingia sylvatica (Queen's root)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                        list.add("Verbena officinalis (Vervain)")
                    }
                    "Demulcent" -> {
                        list.add("Althea officinalis (Marshmallow)")
                        list.add("Arctium lappa (Burdock)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Linum usitatissimum (Flax, Linseed)")
                        list.add("Serenoa repens (Saw palmetto)")
                        list.add("Symphytum officinale (Comfrey)")
                        list.add("Thymus vulgaris (Thyme)")
                        list.add("Ulmus fulva (Slippery elm, American elm)")
                        list.add("Verbascum thapsus (Mullein)")
                    }
                    "Depressant" -> {
                        list.add("Aconitum napellus (Monkshood, Aconite)")
                        list.add("Atropa belladonna (Belladonna)")
                        list.add("Datura stramonium (Jimson weed, Thornapple)")
                        list.add("Gelsemium sempervirens (Yellow jasmine, Gelsemium)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Viscum alba (Mistletoe)")
                    }
                    "Diaphoretic" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Aconitum napellus (Monkshood, Aconite)")
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Arctium lappa (Burdock)")
                        list.add("Calendula officinalis (Marigold)")
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Caulophyllum thalictroides (Blue cohosh)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Ephedra sinica (Ma huang)")
                        list.add("Inula helenium (Elecampane)")
                        list.add("Leonurus cardiaca (Motherwort)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Melaleuca alternifolia (Tea tree)")
                        list.add("Nepeta cataria (Catnip)")
                        list.add("Sambucus canadensis, nigra (Elder)")
                        list.add("Symplocarpus foetida (Skunk cabbage)")
                        list.add("Tanacetum parthenium (Feverfew)")
                        list.add("Tilia europaea (Linden flower, Lime blossom)")
                        list.add("Verbena officinalis (Vervain)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Diuretic" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Allium sativum (Garlic)")
                        list.add("Althea officinalis (Marshmallow)")
                        list.add("Arctium lappa (Burdock)")
                        list.add("Arctostaphylos uva ursi (Bearberry)")
                        list.add("Barosma betulina (Buchu)")
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Caulophyllum thalictroides (Blue cohosh)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Chimaphilia umbellata (Pipsissewa)")
                        list.add("Chionanthus virginicus (Fringe tree)")
                        list.add("Collinsonia canadensis (Stone root)")
                        list.add("Equisetum arvense (Shave grass, Horsetail)")
                        list.add("Fucus vesiculosus (Bladderwrack, Kelp)")
                        list.add("Galium aparine (Cleavers, Bed straw)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Grindelia camporum (Gumweed)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Hypericum perforatum (St. John's wort)")
                        list.add("Inula helenium (Elecampane)")
                        list.add("Juniperis communis (Juniper)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Mitchella repens (Squawvine, Partridge berry)")
                        list.add("Petroselinum crispum (Parsley)")
                        list.add("Sambucus canadensis, nigra (Elder)")
                        list.add("Scutellaria laterifolia (Skullcap)")
                        list.add("Serenoa repens (Saw palmetto)")
                        list.add("Symplocarpus foetida (Skunk cabbage)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                        list.add("Thuja plicata, occidentalis (Western cedar)")
                        list.add("Trifollium pratense (Red clover)")
                        list.add("Urtica urens (Nettles)")
                        list.add("Vaccinium myrtillus (Bilberry)")
                        list.add("Verbascum thapsus (Mullein)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                        list.add("Zea mays (Corn silk)")
                    }
                    "Emetic" -> {
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Phytolacca decandra (Poke)")
                        list.add("Sanguinaria canadensia (Blood root)")
                        list.add("Symplocarpus foetida (Skunk cabbage)")
                    }
                    "Emmenagogue" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Caulophyllum thalictroides (Blue cohosh)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Leonurus cardiaca (Motherwort)")
                        list.add("Petroselinum crispum (Parsley)")
                        list.add("Sanguinaria canadensia (Blood root)")
                        list.add("Scutellaria laterifolia (Skullcap)")
                        list.add("Tanacetum parthenium) (Feverfew)")
                        list.add("Thuja plicata, occidentalis (Western cedar)")
                        list.add("Verbena officinalis (Vervain)")
                    }
                    "Estrogenic" -> {
                        list.add("Angelica sinensis (Dong quai)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Dioscorea villosa (Wild yam)")
                        list.add("Foeniculum vulgare (Fennel)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Medicago sativa (Alfalfa)")
                        list.add("Panax ginseng (Chinese ginseng, Korean ginseng)")
                        list.add("Trifollium pratense (Red clover)")
                        list.add("Verbena officinalis (Vervain)")
                        list.add("Vitex agnus castus (Chaste tree, Monk's pepper)")
                    }
                    "Expectorant" -> {
                        list.add("Aesculus hippocastanum (Horsechestnut)")
                        list.add("Allium sativum (Garlic)")
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Ephedra sinica (Ma huang)")
                        list.add("Eriodictyon californicum (Yerba santa)")
                        list.add("Foeniculum vulgare (Fennel)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Grindelia camporum (Gumweed)")
                        list.add("Hyssopus officinalis (Hyssop)")
                        list.add("Inula helenium (Elecampane)")
                        list.add("Juniperis communis (Juniper)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Lomatium disectum (Desert parsley)")
                        list.add("Melaleuca alternifolia (Tea tree)")
                        list.add("Pimpinella anisum (Anise)")
                        list.add("Sanguinaria canadensia (Blood root)")
                        list.add("Serenoa repens (Saw palmetto)")
                        list.add("Thymus vulgaris (Thyme)")
                        list.add("Tussilago farfara (Colt's foot)")
                        list.add("Urtica urens (Nettles)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Febrifuge" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Aconitum napellus (Monkshood, Aconite)")
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Bryonia alba (Bryony)")
                        list.add("Chionanthus virginicus (Fringe tree)")
                        list.add("Gelsemium sempervirens (Yellow jasmine, Gelsemium)")
                        list.add("Verbena officinalis (Vervain)")
                    }
                    "Hemostatic" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Alchemilla vulgaris (Lady's mantle)")
                        list.add("Angelica sinensis (Dong quai)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Equisetum arvense (Shave grass, Horsetail)")
                        list.add("Geranium maculatum (Wild geranium, Cranesbill)")
                        list.add("Hamamelis virginiana (Witch hazel)")
                        list.add("Ruscus aculeatus (Butcher's broom)")
                        list.add("Symphytum officinale (Comfrey)")
                    }
                    "Hypnotic" -> {
                        list.add("Eschscholzia californica (California poppy)")
                        list.add("Passiflora incarnata (Passionflower)")
                        list.add("Piper methysticum (Kava kava)")
                        list.add("Piscidia piscipula (Jamaican dogwood)")
                        list.add("Verbena officinalis (Vervain)")
                    }
                    "Hypoglycemic" -> {
                        list.add("Allium sativum (Garlic)")
                        list.add("Arctium lappa (Burdock)")
                        list.add("Hydrastis canadensis (Goldenseal)")
                        list.add("Momordica charantia (Bitter melon)")
                        list.add("Vaccinium myrtillus (Bilberry)")
                    }
                    "Hypotensive" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Allium sativum (Garlic)")
                        list.add("Camellia sinensis (Green tea)")
                        list.add("Momordica charantia (Bitter melon)")
                        list.add("Passiflora incarnata (Passionflower)")
                        list.add("Polygonum multiflorum (Fo-ti, He-shou-wu)")
                        list.add("Scutellaria laterifolia (Skullcap)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Viscum alba (Mistletoe)")
                        list.add("Withania somnifera (Ashwagandha)")
                    }
                    "Laxative" -> {
                        list.add("Arctium lappa (Burdock)")
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Berberis vulgaris (Barberry)")
                        list.add("Calendula officinalis (Marigold)")
                        list.add("Chionanthus virginicus (Fringe tree)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Galium aparine (Cleavers, Bed straw)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Leonurus cardiaca (Motherwort)")
                        list.add("Linum usitatissimum (Flax, Linseed)")
                        list.add("Momordica charantia (Bitter melon)")
                        list.add("Polygonum multiflorum (Fo-Ti, He-shou-wu)")
                        list.add("Rhamnus purshiana (Cascara)")
                        list.add("Rheum officinalis (Rhubarb)")
                        list.add("Rumex crispis (Yellow dock, Curly dock)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                    }
                    "Lipotropic" -> {
                        list.add("Chionanthus virginicus (Fringe tree)")
                        list.add("Cynara scolymus (Artichoke)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Silybum marianum (Milk thistle)")
                    }
                    "Nervine" -> {
                        list.add("Arctium lappa (Burdock)")
                        list.add("Avena sativa (Oats)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Hypericum perforatum (St. John's wort)")
                        list.add("Leonurus cardiaca (Motherwort)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Nepeta cataria (Catnip)")
                        list.add("Passiflora incarnata (Passionflower)")
                        list.add("Scutellaria laterifolia (Skullcap)")
                        list.add("Serenoa repens (Saw palmetto)")
                        list.add("Trillium erectum (Beth root)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Verbena officinalis (Vervain)")
                        list.add("Viscum alba (Mistletoe)")
                        list.add("Withania somnifera (Ashwagandha)")
                    }
                    "Nutritive" -> {
                        list.add("Crataegus oxycantha (Hawthorn, May bush, Whitethorn)")
                        list.add("Fucus vesiculosus (Bladderwrack, Kelp)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Medicago sativa (Alfalfa)")
                        list.add("Petroselinum crispum (Parsley)")
                        list.add("Symphytum officinale (Comfrey)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                        list.add("Ulmus fulva (Slippery elm, American elm)")
                    }
                    "Progesteronic" -> {
                        list.add("Dioscorea villosa (Wild yam)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Smilax sarsaparilla (Sarsaparilla)")
                        list.add("Vitex agnus castus (Chaste tree, Monk's pepper)")
                    }
                    "Purgative" -> {
                        list.add("Chionanthus virginicus (Fringe tree)")
                        list.add("Hyssopus officinalis (Hyssop)")
                        list.add("Phytolacca decandra (Poke)")
                        list.add("Rheum officinalis (Rhubarb)")
                    }
                    "Rubefacient" -> {
                        list.add("Allium sativum (Garlic)")
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Rosmarius officinalis (Rosemary)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Sedative" -> {
                        list.add("Aconitum napellus (Monkshood, Aconite)")
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Alchemilla vulgaris (Lady's mantle)")
                        list.add("Arctostaphylos uva ursi (Bearberry)")
                        list.add("Avena sativa (Oats)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Eschscholzia californica (California poppy)")
                        list.add("Gelsemium sempervirens (Yellow jasmine, Gelsemium)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Hypericum perforatum (St. John's wort)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Melissa officinalis (Lemon balm)")
                        list.add("Passiflora incarnata (Passionflower)")
                        list.add("Piper methysticum (Kava kava)")
                        list.add("Piscidia piscipula (Jamaican dogwood)")
                        list.add("Scutellaria laterifolia (Skullcap)")
                        list.add("Serenoa repens (Saw palmetto)")
                        list.add("Trifollium pratense (Red clover)")
                        list.add("Tussilago farfara (Colt's foot)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Verbascum thapsus (Mullein)")
                        list.add("Verbena officinalis (Vervain)")
                        list.add("Viburnum opulus (Cramp bark)")
                        list.add("Viscum alba (Mistletoe)")
                        list.add("Withania somnifera (Ashwagandha)")
                        list.add("Zea mays (Corn silk)")
                    }
                    "Sialagogue" -> {
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Barosma betulina (Buchu)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Grindelia camporum (Gumweed)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Sanguinaria canadensia (Blood root)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Stimulant" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Allium sativum (Garlic)")
                        list.add("Arctium lappa (Burdock)")
                        list.add("Asclepias tuberosa (Pleurisy root)")
                        list.add("Baptisia tintoria (Wild indigo)")
                        list.add("Barosma betulina (Buchu)")
                        list.add("Bryonia alba (Bryony)")
                        list.add("Calendula officinalis (Marigold)")
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Cinnamomum spp. (Cinnamon)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Echinacea angustifolia (Purple cone flower)")
                        list.add("Ephedra sinica (Ma huang)")
                        list.add("Fucus vesiculosus (Bladderwrack, Kelp)")
                        list.add("Grindelia camporum (Gumweed)")
                        list.add("Juniperis communis (Juniper)")
                        list.add("Lobelia inflata (Indian tobacco, Puke weed)")
                        list.add("Melaleuca alternifolia (Tea tree)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Panax ginseng (Chinese ginseng, Korean ginseng)")
                        list.add("Petasites hybridus (Butterbur)")
                        list.add("Rhamnus purshiana (Cascara)")
                        list.add("Rosmarius officinalis (Rosemary)")
                        list.add("Sanguinaria canadensia (Blood root)")
                        list.add("Thuja plicata, occidentalis (Western cedar)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                        list.add("Zea mays (Corn silk)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Stomachic" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Aletris farinosa (True unicorn)")
                        list.add("Collinsonia canadensis (Stone root)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Cynara scolymus (Artichoke)")
                        list.add("Gentiana lutea (Gentian)")
                        list.add("Humulus lupulus (Hops)")
                        list.add("Inula helenium (Elecampane)")
                        list.add("Juniperis communis (Juniper)")
                        list.add("Melaleuca alternifolia (Tea tree)")
                        list.add("Mentha piperita (Peppermint)")
                        list.add("Rheum officinalis (Rhubarb)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                        list.add("Thymus vulgaris (Thyme)")
                        list.add("Valeriana officinalis (Valerian)")
                        list.add("Verbena officinalis (Vervain)")
                        list.add("Zingiber offiniale (Ginger)")
                    }
                    "Synergist" -> {
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Althea officinalis (Marshmallow)")
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                    }
                    "Tonic" -> {
                        list.add("Achillea millefolium (Yarrow)")
                        list.add("Acorus calamus (Sweet flag)")
                        list.add("Agrimonia eupatorium (Agrimony)")
                        list.add("Aletris farinosa (True unicorn)")
                        list.add("Arctostaphylos uva ursi (Bearberry)")
                        list.add("Asclepias tuberosa (Pleurisy root)")
                        list.add("Astragalus membranaceus (Milk vetch)")
                        list.add("Barosma betulina (Buchu)")
                        list.add("Berberis vulgaris (Barberry)")
                        list.add("Caulophyllum thalictroides (Blue cohosh)")
                        list.add("Chimaphilia umbellata (Pipsissewa)")
                        list.add("Chionanthus virginicus (Fringe tree)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Collinsonia canadensis (Stone root)")
                        list.add("Corydalis bulbosa (Corydalis)")
                        list.add("Crataegus oxycantha (Hawthorn, May bush, Whitethorn)")
                        list.add("Echinacea angustifolia (Purple cone flower)")
                        list.add("Equisetum arvense (Shave grass, Horsetail)")
                        list.add("Galium aparine (Cleavers, Bed straw)")
                        list.add("Gentiana lutea (Gentian)")
                        list.add("Glycyrrhiza glabra (Licorice)")
                        list.add("Hydrastis canadensis (Goldenseal)")
                        list.add("Inula helenium (Elecampane)")
                        list.add("Leonurus cardiaca (Motherwort)")
                        list.add("Nepeta cataria (Catnip)")
                        list.add("Panax ginseng (Chinese ginseng, Korean ginseng)")
                        list.add("Polygonum multiflorum (Fo-ti, He-shou-wu)")
                        list.add("Rumex crispis (Yellow dock, Curly dock)")
                        list.add("Scutellaria laterifolia (Skullcap)")
                        list.add("Serenoa repens (Saw palmetto)")
                        list.add("Silybum marianum (Milk thistle)")
                        list.add("Tanacetum parthenium) (Feverfew)")
                        list.add("Taraxacum officinale (Dandelion, Lion's tooth)")
                        list.add("Thuja plicata, occidentalis (Western cedar)")
                        list.add("Thymus vulgaris (Thyme)")
                        list.add("Urtica urens (Nettles)")
                        list.add("Usnea spp. (Old man's beard)")
                        list.add("Viburnum opulus (Cramp bark)")
                        list.add("Zanthoxylum clava-herculis (Southern prickly ash)")
                    }
                    "Toxic" -> {
                        list.add("Aconitum napellus (Monkshood, Aconite)")
                        list.add("Datura stramonium (Jimson weed, Thornapple)")
                        list.add("Sanguinaria canadensia (Blood root)")
                        list.add("Valeriana officinalis (Valerian)")
                    }
                    "Vasoconstrilist.add(ctor" -> {
                        list.add("Aesculus hippocastanum (Horsechestnut)")
                        list.add("Euphrasia officinalis (Eyebright)")
                        list.add("Ruscus aculeatus (Butcher's broom)")
                    }
                    "Vasodilator" -> {
                        list.add("Allium sativum (Garlic)")
                        list.add("Ammi visnaga (Khella)")
                        list.add("Atropa belladonna (Belladonna)")
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Cimicifuga racemosa (Black cohosh)")
                        list.add("Foeniculum vulgare (Fennel)")
                        list.add("Ginkgo biloba (Ginkgo)")
                        list.add("Petasites hybridus (Butterbur)")
                    }
                    "Vesicant" -> {
                        list.add("Capsicum frutescens (Cayenne, Red pepper)")
                        list.add("Chelidonium majus (Celandine)")
                    }
                    "Vulnerary" -> {
                        list.add("Althea officinalis (Marshmallow)")
                        list.add("Armoracia rusticana (Horseradish)")
                        list.add("Calendula officinalis (Marigold)")
                        list.add("Chelidonium majus (Celandine)")
                        list.add("Commiphora molmol (Myrrh)")
                        list.add("Echinacea angustifolia (Purple cone flower)")
                        list.add("Grindelia camporum (Gumweed)")
                        list.add("Hamamelis virginiana (Witch hazel)")
                        list.add("Hypericum perforatum (St. John's wort)")
                        list.add("Symphytum officinale (Comfrey)")
                        list.add("Ulmus fulva (Slippery elm, American elm)")
                    }
                }
                val intent = Intent(this,ClinicalListActivity::class.java)
                intent.putStringArrayListExtra("heading",list)
                startActivity(intent)
            }

        } else if (index == 2) {
            if (items_by_latin[position] == "Allium sativum (Garlic)"||premium) {
                val intent = Intent(this, BotanicalDetailActivity::class.java)
                intent.putExtra("heading", items_by_latin[position])
                startActivity(intent)
            }
        } else {
            if (items_by_common[position] == "Garlic (Allium sativum)"||premium) {
                val intent = Intent(this, BotanicalDetailActivity::class.java)
                intent.putExtra("heading", items_by_common[position])
                startActivity(intent)
            }
        }
    }

    fun filter(text: String?) {
        val temp: MutableList<String> = ArrayList()
        if(index==1){
            for (d in items_by_clinical) {
                //or use .equal(text) with you want equal match
                //use .toLowerCase() for better matches
                if (d.lowercase().contains("$text".lowercase())) {
                    temp.add(d)
                }
            }
            //update recyclerview
            botanical_adapter_clinical.updateList(temp)
        }else if(index==2){
            for (d in items_by_latin) {
                //or use .equal(text) with you want equal match
                //use .toLowerCase() for better matches
                if (d.lowercase().contains("$text".lowercase())) {
                    temp.add(d)
                }
            }
            //update recyclerview
            botanical_adapter_latin.updateList(temp)
        }else{
            for (d in items_by_common) {
                //or use .equal(text) with you want equal match
                //use .toLowerCase() for better matches
                if (d.lowercase().contains("$text".lowercase())) {
                    temp.add(d)
                }
            }
            //update recyclerview
            botanical_adapter_common.updateList(temp)
        }

    }
}