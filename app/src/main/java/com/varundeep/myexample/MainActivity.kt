package com.varundeep.myexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var btnLogin: Button
    lateinit var tvForgotPassword: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        email = findViewById(R.id.etEnterEmail)
        password = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvForgotPassword = findViewById(R.id.tvForgotPassword)

        tvForgotPassword.setOnClickListener {
            var intent = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            var enteredEmail = email.text.toString()
            var enteredPassword = password.text.toString()
            if (email.text.toString().isNullOrEmpty()==true){
                email.error=resources.getString(R.string.enter_email)
            }
            else if(password.text.toString().isNullOrEmpty()==true){
                password.error=resources.getString(R.string.Password)
                password.requestFocus()
            }
            else if ((password.text.toString().length?:0)<6){
                password.error=resources.getString(R.string.Password)
            }
            else {

                Toast.makeText(this,R.string.imp,Toast.LENGTH_LONG).show()
            }


        }
    }
}