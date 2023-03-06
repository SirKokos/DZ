package com.example.dz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity1 : AppCompatActivity() {
    var bScanner: Button? = null
    var bReg: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        bScanner = findViewById(R.id.button2)
        bReg = findViewById(R.id.button)
        bScanner?.setOnClickListener {
            startActivity((Intent(this, QrScanner::class.java)))
        }
        bReg?.setOnClickListener {
            startActivity((Intent(this, Reg::class.java)))
        }
    }
}