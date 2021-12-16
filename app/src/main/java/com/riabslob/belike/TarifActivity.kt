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
            val tex1 = findViewById<TextView>(R.id.textView)


        }
        if(texto =="I"){

        }
        if(texto=="B"){

        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            val i = Intent(this@TarifActivity, ListActivity::class.java)
            startActivity(i)
        }
    }
}