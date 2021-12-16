package com.riabslob.belike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class TarifActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarif)

        val texto = intent.getStringExtra("texto")
        if(texto=="F"){
            val tex = findViewById<TextView>(R.id.textView5)
            tex.text = "Without limit"
            val tex1 = findViewById<TextView>(R.id.textView7)
            tex1.text = "6GB"
            val tex2 = findViewById<TextView>(R.id.textView10)
            tex2.text = "40"
            val tex3 = findViewById<TextView>(R.id.textView9)
            tex3.text = "Tariff Family"
        }
        if(texto =="I"){
            val tex = findViewById<TextView>(R.id.textView5)
            tex.text = "100 hours"
            val tex1 = findViewById<TextView>(R.id.textView7)
            tex1.text = "Without limit"
            val tex2 = findViewById<TextView>(R.id.textView10)
            tex2.text = "20"
            val tex3 = findViewById<TextView>(R.id.textView9)
            tex3.text = "Tariff Internet"
        }
        if(texto=="B"){
            val tex = findViewById<TextView>(R.id.textView5)
            tex.text = "Without limit"
            val tex1 = findViewById<TextView>(R.id.textView7)
            tex1.text = "Without limit"
            val tex2 = findViewById<TextView>(R.id.textView10)
            tex2.text = "Without limit"
            val tex3 = findViewById<TextView>(R.id.textView9)
            tex3.text = "Tariff Best"
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            val i = Intent(this@TarifActivity, ListActivity::class.java)
            startActivity(i)
        }
    }
}