package com.androidapp.ffproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_ch.*
import kotlinx.android.synthetic.main.activity_h.*
import kotlinx.android.synthetic.main.dialog_add_todo.view.*
import java.util.*
import kotlin.collections.ArrayList

class ch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ch)

        btnhodu.setOnClickListener {
            val intent = Intent(this, h::class.java)
            startActivity(intent)
        }

        btnsunde.setOnClickListener {
            val intent = Intent(this, s::class.java)
            startActivity(intent)
        }

        btnadd.setOnClickListener {
            val intent = Intent(this, AddMain::class.java)
            startActivity(intent)
        }
    }
}
