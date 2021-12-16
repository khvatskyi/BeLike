package com.riabslob.belike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TarifActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarif)

        findViewById<Button>(R.id.button4).setOnClickListener {
            val i = Intent(this@TarifActivity, ListActivity::class.java)
            startActivity(i)
        }
    }
}