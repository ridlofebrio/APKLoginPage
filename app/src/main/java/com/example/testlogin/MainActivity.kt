package com.example.testlogin

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.testlogin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.button1
import kotlinx.android.synthetic.main.activity_main.button2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        btnLoginListerner()
        btnRegisterListerner()
}
    private fun btnLoginListerner() {
        button1.setOnClickListener(){
            startActivities(arrayOf(Intent(this, Login::class.java)))
        }
    }
    private fun btnRegisterListerner() {
        button2.setOnClickListener(){
            startActivities(arrayOf(Intent(this, register::class.java)))
        }
    }

}