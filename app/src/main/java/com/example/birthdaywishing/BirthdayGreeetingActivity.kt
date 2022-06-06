package com.example.birthdaywishing

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BirthdayGreeetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeeting)
        val name= intent.getStringExtra(NAME_EXTRA)
        val bclass = findViewById<TextView>(R.id.birthdaygreeting)
        bclass.setText("Happy Birthday \n$name!")

    }
}