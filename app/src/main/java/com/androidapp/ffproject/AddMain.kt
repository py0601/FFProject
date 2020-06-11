package com.androidapp.ffproject

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.activity_add.rl_todo_list
import kotlinx.android.synthetic.main.activity_add.view.*
import kotlinx.android.synthetic.main.activity_h.view.*
import kotlinx.android.synthetic.main.dialog_add_todo.view.*
import java.util.*
import kotlin.collections.ArrayList

class AddMain : AppCompatActivity() {

    private lateinit var mTodoListAdapter: TodoListAdapter
    private val mTodoItems: ArrayList<TodoModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        initRecyclerView()
        initAddButton()
    }

    private fun initRecyclerView() {
        mTodoListAdapter = TodoListAdapter(mTodoItems)

        rl_todo_list.run {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@AddMain)
            adapter = mTodoListAdapter
        }
    }

    private fun initAddButton() {
        btn_add_todo.setOnClickListener {
            openAddTodoDialog()
        }
    }

    private fun openAddTodoDialog() {
        val dialogView = layoutInflater.inflate(R.layout.dialog_add_todo, null)
        val dialog = AlertDialog.Builder(this)
            .setTitle("추가하기")
            .setView(dialogView)
            .setPositiveButton("확인", { dialogInterface, i -> val title = dialogView.et_todo_title.text.toString()
                val description = dialogView.et_todo_description.text.toString()
                val createdDate = Date().time
                val todoModel = TodoModel(title, description, createdDate)
                mTodoListAdapter.addItem(todoModel)
                mTodoListAdapter.notifyDataSetChanged() })

            .setNegativeButton("취소", null)
            .create()
        dialog.show()
    }
}
