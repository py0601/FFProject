package com.androidapp.ffproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_h.*
import kotlinx.android.synthetic.main.activity_h.mRecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class h : AppCompatActivity() {

    var foodList = arrayListOf<Food>(
        Food("천안옛날호두과자", "천안시 동남구 대흥로 237-1", "080-573-8888", "con_0301"),
        Food("학화호도과자","천안시 구성동 56-1","1599-3370","hodo")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h)

        val mAdapter = MainRvAdapter(this, foodList)
        mRecyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        mRecyclerView.layoutManager = lm
        mRecyclerView.setHasFixedSize(true)

    }
}
