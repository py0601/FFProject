package com.androidapp.ffproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_h.*

class s : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var foodList = arrayListOf<Food>(
            Food("박순자 아우내순대", "충남 천안시 동남구 병천면 아우내순대길 47","041-564-1242", "aune" ),
            Food("청화집순대", "천안시 동남구 병천면 충절로 1749", "041-564-1558", "cheng")
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s)

        /*리스트 클릭 이벤트*/
        val mAdapter = MainRvAdapter(this, foodList) {}
        mRecyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        mRecyclerView.layoutManager = lm
        mRecyclerView.setHasFixedSize(true)
    }

}