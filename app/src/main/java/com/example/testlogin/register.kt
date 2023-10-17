package com.example.testlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.text4

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()
        textForgetListerner()
    }
    private fun textForgetListerner(){
        text4.setOnClickListener(){
            startActivities(arrayOf(Intent(this, Login::class.java)))
        }
    }
}