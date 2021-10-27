package com.roll.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.startup.AppInitializer
import com.roll.startuplibrary2.StartupLibInitializer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        findViewById<Button>(R.id.btn_01).setOnClickListener {
            AppInitializer.getInstance(this)
                .initializeComponent(StartupLibInitializer::class.java)
        }
    }
}