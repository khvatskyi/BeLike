package com.riabslob.belike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.b_SignIn).setOnClickListener {
            val i = Intent(this@LoginActivity, ListActivity::class.java)


            val num = findViewById<TextInputEditText>(R.id.tiet_PhoneNumber)
          //  val loginMobileNumberString = login_mobile_number.text.toString()
            i.putExtra("number", num.text.toString())
            startActivity(i)
        }
    }
}