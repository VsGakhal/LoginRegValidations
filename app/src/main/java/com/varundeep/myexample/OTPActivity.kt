package com.varundeep.myexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView


class OTPActivity : AppCompatActivity() {
    lateinit var getId:   TextView
    lateinit var Number1: EditText
    lateinit var Number2: EditText
    lateinit var Number3: EditText
    lateinit var Number4: EditText
    var          email: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpactivity)

        getId   = findViewById(R.id.tvgetID)
        Number1 = findViewById(R.id.etNumber1)
        Number2 = findViewById(R.id.etNumber2)
        Number3 = findViewById(R.id.etNumber3)
        Number4 = findViewById(R.id.etNumber4)
        intent?.let {
            email = it.getStringExtra("email").toString()
        }
        getId.setText(email)

        Number1.doOnTextChanged { text, start, before, count ->

        }
        var et1 = etNumber1.text.toString()
        var et2 = etNumber2.text.toString()
        var et3 = etNumber3.text.toString()
        var et4 = etNumber4.text.toString()
        if (et1.isNotEmpty()) {
            etNumber2.requestFocus()
        } else if (et2.isNotEmpty()) {
            etNumber3.requestFocus()
        } else if (et3.isNotEmpty()) {
            etNumber4.requestFocus()
        }

    }
}