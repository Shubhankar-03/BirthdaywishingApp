package com.example.birthdaywishing

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CreateBirthdayCard(view: View) {
        val n = findViewById<EditText>(R.id.nameinput)
        val name = n.editableText.toString();
        //Toast.makeText(this, "name is $name",Toast.LENGTH_LONG).show()
         val intent = Intent(this , BirthdayGreeetingActivity::class.java)
        intent.putExtra("name_extra", name)
        startActivity(intent)
    }
}