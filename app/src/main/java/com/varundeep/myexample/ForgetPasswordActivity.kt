package com.varundeep.myexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgetPasswordActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var btnOTP: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        email = findViewById(R.id.etEnterEmail)
        btnOTP = findViewById(R.id.btnSendOTP)
        btnOTP.setOnClickListener {
            var mail=email.text.toString()
            if (mail.isNullOrEmpty()){
                email.error="Enter Email"
                email.requestFocus()
            }
            else{
                var intent = Intent( this,OTPActivity::class.java)
                intent.putExtra("email",email.text.toString())
                startActivity(intent)
            }
        }
    }
}