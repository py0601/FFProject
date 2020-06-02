package com.androidapp.ffproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Chungcheongnam_do_Acti : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chungcheongnam_do_)

        btn1.setOnClickListener {
            val intent = Intent(this, ch::class.java)
            startActivity(intent)
        }
    }
}
