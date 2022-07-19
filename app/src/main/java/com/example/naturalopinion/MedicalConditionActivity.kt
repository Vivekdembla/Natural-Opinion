package com.example.naturalopinion

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.Adapter.MedicalAdapter
import com.example.naturalopinion.Adapter.onMedicalItemClick

class MedicalConditionActivity : AppCompatActivity(), onMedicalItemClick {
    lateinit var back_button : ImageView
    lateinit var recyclerView: RecyclerView
    lateinit var medicalAdapter: MedicalAdapter
    private val items = ArrayList<String>()
    val premium = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medical_condition)

        //Status bar color changed
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.white)
        }

            items.add("ADD/ADHD")
            items.add("Adult Acne")
            items.add("Age-Related Macular Degeneration")
            items.add("Aging Prevention")
            items.add("AIDS")
            items.add("Allergies")
            items.add("Alzheimer's Disease")
            items.add("Amenorrhea")
            items.add("Anorexia Nervosa")
            items.add("Aphthous Stomatitis")
            items.add("Arthritis, Gout")
            items.add("Arthritis, Osteo")
            items.add("Arthritis, Psoriatic")
            items.add("Arthritis, Rheumatoid")
            items.add("Asthma")
            items.add("Atherosclerosis")
            items.add("Atopic Dermatitis")
            items.add("Attention Deficit Disorder")
            items.add("Autism")
            items.add("Benign Prostatic Hypertrophy")
            items.add("Bipolar Disorder")
            items.add("Bladder Infection")
            items.add("Blood Pressure, High")
            items.add("BPH")
            items.add("Bronchitis")
            items.add("Cancer Prevention")
            items.add("Candida Infection")
            items.add("Candidiasis")
            items.add("Canker Sores")
            items.add("Cataract Prevention")
            items.add("CFS/CFIDS")
            items.add("CHF")
            items.add("Cholecystitis")
            items.add("Cholelithiasis")
            items.add("Chronic Fatigue Syndrome")
            items.add("Colitis")
            items.add("Congestive Heart Failure")
            items.add("Constipation")
            items.add("Crohn's Disease")
            items.add("Cystitis")
            items.add("Depression")
            items.add("Diabetes Mellitus")
            items.add("Dysmenorrhea")
            items.add("Ear Infection")
            items.add("Eczema, Chronic")
            items.add("Endometriosis")
            items.add("Erectile Dysfunction")
            items.add("Fertility")
            items.add("Fibrocystic Breast Disease")
            items.add("Fibromyalgia")
            items.add("Gallbladder Disease")
            items.add("Gallstones")
            items.add("Gout")
            items.add("Headache, General")
            items.add("Headache, Migraine")
            items.add("Hemorrhoids")
            items.add("Hepatitis")
            items.add("Herpes Simplex")
            items.add("High Blood Pressure")
            items.add("High Cholesterol")
            items.add("HIV")
            items.add("Hyperactivity")
            items.add("Hypercholesterolemia")
            items.add("Hypertension")
            items.add("Hypothyroid")
            items.add("IBS")
            items.add("Impotence")
            items.add("Incontinence")
            items.add("Infertility")
            items.add("Insomnia")
            items.add("Irritable Bowel Syndrome")
            items.add("Longevity")
            items.add("Lupus")
            items.add("Macular Degeneration")
            items.add("Manic Depressive Disorder")
            items.add("Mastitis")
            items.add("Memory Loss")
            items.add("Migraine Headache")
            items.add("Menopause")
            items.add("Mouth Ulcers")
            items.add("Multiple Sclerosis")
            items.add("Obesity")
            items.add("Osteoarthritis")
            items.add("Osteoporosis")
            items.add("Otitis Media")
            items.add("Ovarian Cancer")
            items.add("Painful Menses")
            items.add("Paralysis Agitans")
            items.add("Parkinson's Disease")
            items.add("Peptic Ulcers")
            items.add("PMS")
            items.add("Premenstrual Syndrome")
            items.add("Psoriasis")
            items.add("Psoriatic Arthritis")
            items.add("Regional Enteritis")
            items.add("Rheumatoid Arthritis")
            items.add("Rosacea")
            items.add("Schizophrenia")
            items.add("SLE")
            items.add("Sleep Disorder")
            items.add("Stress Incontinence")
            items.add("Systemic Lupus Erythematosus")
            items.add("Ulcerative Colitis")
            items.add("Uterine Fibroids")
            items.add("Vaginal Yeast Infection")

        back_button = findViewById(R.id.back_button_5)
        recyclerView = findViewById(R.id.medical_recycler)
        medicalAdapter = MedicalAdapter(this,premium,this, items,15)

        //Finish Activity
        back_button.setOnClickListener { finish() }
        setUpRecylerView()
    }

    private fun setUpRecylerView() {
        recyclerView.adapter = medicalAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemCLick(position: Int) {
        if(premium){
            val intent = Intent(this,ConditionDetailActivity::class.java)
            intent.putExtra("heading",items[position])
            startActivity(intent)
        }
        else if(position==15){
            val intent = Intent(this,ConditionDetailActivity::class.java)
            intent.putExtra("heading",items[position])
            startActivity(intent)
        }
    }
}