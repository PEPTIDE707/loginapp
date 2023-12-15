package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn = findViewById<Button>(R.id.btn_sig_up)



        btn.setOnClickListener {
            val edit_name = findViewById<EditText>(R.id.edt_upname)
            val edit_id = findViewById<EditText>(R.id.edt_upid)
            val edit_pass = findViewById<EditText>(R.id.edt_uppassw)

            val name = edit_name!!.text.toString()
            val user = edit_id!!.text.toString()
            val pass = edit_pass!!.text.toString()
            if (name == "" || user == "" || pass ==""){
                Toast.makeText(this,"이름과 아이디, 비밀번호를 모두 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
            else {
                finish()
            }
        }

    }
}