package com.chandhu.birthdaycards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createBirthdayButton.setOnClickListener {
            val string : String = nameInput.editableText.toString()
            startActivity(Intent(this,BirthdayGreetingActivity::class.java).putExtra(Companion.NAME_EXTRA,string))
        }
    }
}