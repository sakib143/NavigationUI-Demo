package com.example.navigation_demo.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigation_demo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNavigationDrawerMA.setOnClickListener(){
            Intent(this,NavigationDrawerActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}
