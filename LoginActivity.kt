package com.example.studentcontactapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.studentcontactapp.MainActivity
import com.example.studentcontactapp.R
import com.example.studentcontactapp.utils.PrefManager

class LoginActivity : AppCompatActivity() {

    lateinit var pref: PrefManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        pref = PrefManager(this)
        // auto login kalau remember aktif
        if (pref.isLoggedIn() && pref.isRemember()) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val cbRemember = findViewById<CheckBox>(R.id.cbRemember)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username == "admin" && password == "123456") {

                pref.setLogin(username, cbRemember.isChecked)

                startActivity(Intent(this, MainActivity::class.java))
                finish()

            } else {
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}