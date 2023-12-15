package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val idData = intent.getStringExtra("dataFromSignInActivity")
        val editText = findViewById<EditText>(R.id.edt_id)
        editText.setText(idData)

        val btn = findViewById<Button>(R.id.btn_close)

        btn.setOnClickListener {
            finish()
        }
    }
}