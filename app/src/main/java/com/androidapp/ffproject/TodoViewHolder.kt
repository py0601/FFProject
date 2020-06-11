package com.androidapp.ffproject

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_todo.view.*
import java.text.SimpleDateFormat
import java.util.*

class TodoViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val title = view.tv_todo_title
    val descripton = view.tv_todo_description
    val createdDate = view.tv_todo_created_date

    fun bind(todoModel: TodoModel){
        title.text = todoModel.title
        descripton.text = todoModel.description
        createdDate.text = todoModel.createdDate.toDateString("yyyy,MM,dd HH:mm")
    }

    fun Long.toDateString(format: String): String {
        val simpleDateFormat = SimpleDateFormat(format)
        return simpleDateFormat.format((Date(this)))
    }

}


