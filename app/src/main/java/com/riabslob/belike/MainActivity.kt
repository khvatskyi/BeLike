package com.riabslob.belike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button5).setOnClickListener {
            val i = Intent(this@MainActivity, ListActivity::class.java)
            startActivity(i)
        }
    }
}