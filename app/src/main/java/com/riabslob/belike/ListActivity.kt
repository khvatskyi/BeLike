package com.riabslob.belike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        findViewById<Button>(R.id.button).setOnClickListener {
            val i = Intent(this@ListActivity, TarifActivity::class.java)
            startActivity(i)
            val texto = findViewById<TextView>(R.id.textView4)
            texto.text = "Family"

        }
}