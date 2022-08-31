package com.example.pharmahelp

import android.os.Bundle
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.homeopathic.*

class HomeopathicActivity : AppCompatActivity() {
    val language = arrayOf<String>("Arsenicum", "Beladona", "AdelPekana 20ml", "Berberis Pentarkan 20g","Chestal Honey Multisymptom Formula","Similasan Pink eye Relief","Tussistin 200ml","Trimohilis weight Management 900 Tablets","calculus repl Dr.advice")
    val price = arrayOf<String>("ksh.300", "ksh.400", "ksh.350", "ksh.152","ksh.500","ksh.200","ksh.356","ksh290","ksh.!!00")
    val image = arrayOf<Int>(R.drawable.arsenicum, R.drawable.adel, R.drawable.adel ,R.drawable.berberis,R.drawable.chestalhoney,R.drawable.similasan,R.drawable.tussistin,R.drawable.trimohilis,R.drawable.calculus)
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homeopathic)
        val homeoListAdapter = HomeoListAdapter(this, language, image, price)
        Homeolist.adapter = homeoListAdapter
        Homeolist.onItemClickListener = AdapterView.OnItemClickListener { _, _, _, _ ->

            Toast.makeText(this@HomeopathicActivity, "Sorry!! Its a Virtual App. Shopping not possible ",
                Toast.LENGTH_LONG).show()
    }


}}