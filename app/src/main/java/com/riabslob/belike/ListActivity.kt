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

        val num = intent.getStringExtra("number")
        val texnum = findViewById<TextView>(R.id.textView2)
        texnum.text = num

        findViewById<Button>(R.id.button).setOnClickListener {
            val i = Intent(this@ListActivity, TarifActivity::class.java)
            i.putExtra("texto", "F")
            startActivity(i)
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            val i = Intent(this@ListActivity, TarifActivity::class.java)
            i.putExtra("texto", "I")
            startActivity(i)
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            val i = Intent(this@ListActivity, TarifActivity::class.java)
            i.putExtra("texto", "B")
            startActivity(i)
        }
        }
}