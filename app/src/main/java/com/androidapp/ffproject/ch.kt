package com.androidapp.ffproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class ch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ch)

        btn2.setOnClickListener {
            val intent = Intent(this, h::class.java)
            startActivity(intent)
        }

    }
}
