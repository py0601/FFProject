package com.androidapp.ffproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn4.setOnClickListener{
            val intent = Intent(this, Chungcheongnam_do_Acti::class.java)
            startActivity(intent)
        }
    }
}
