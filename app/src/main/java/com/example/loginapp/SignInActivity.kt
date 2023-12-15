package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btn = findViewById<Button>(R.id.btn_login)
        btn.setOnClickListener {

            val edit_id = findViewById<EditText>(R.id.etx_idd)
            val edit_pass = findViewById<EditText>(R.id.etx_passw)

            val user = edit_id!!.text.toString()
            val pass = edit_pass!!.text.toString()

            if (user == "" || pass == "") {
                Toast.makeText(this, "아이디와 비밀번호를 모두 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
            else {
                val idData = edit_id.text.toString()
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("dataFromSignInActivity", idData)
                startActivity(intent)
            }
        }

        val btn2 = findViewById<Button>(R.id.btn_signup)
        btn2.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}