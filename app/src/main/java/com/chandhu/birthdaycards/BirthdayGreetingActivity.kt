package com.chandhu.birthdaycards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name: String? = intent.getStringExtra(Companion.NAME_EXTRA)
        birthdayGreeting.text = "Happy Birthday\n $name!"
    }
}