package com.androidapp.ffproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.IgnoreExtraProperties
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = FirebaseDatabase.getInstance().reference

        btn4.setOnClickListener{
            val intent = Intent(this, Chungcheongnam_do_Acti::class.java)
            startActivity(intent)
        }

    }

    @IgnoreExtraProperties
    data class User(
            var name: String? = "",
            var addr: String? = "",
            var number: String? = ""
    )

    private fun writeNewUser(userId: String, name: String, addr: String?, number: String?) {
        val user = User(name, addr, number)
        database.child("users").child(userId).setValue(user)
        database.child("users").child(userId).child("username").setValue(name)
    }




}
