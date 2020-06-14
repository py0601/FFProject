package com.androidapp.ffproject

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class TodoViewModel(application: Application): AndroidViewModel(application) {
    private val mTodoRepository: TodoRepository
    private var mTodoItems: LiveData<List<TodoModel>>

    fun updateTodo(todoModel: TodoModel) {
        mTodoRepository.updateTodo(todoModel)
    }

    fun deleteTodo(todoModel: TodoModel) {
        mTodoRepository.deleteTodo(todoModel)
    }

    init {
        mTodoRepository = TodoRepository(application)
        mTodoItems = mTodoRepository.getTodoList()
    }

    fun insertTodo(todoModel: TodoModel){
        mTodoRepository.insertTodo(todoModel)

}
    fun getTodoList(): LiveData<List<TodoModel>> {
        return mTodoItems
    }
}