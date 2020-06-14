package com.androidapp.ffproject

import android.app.Application
import androidx.lifecycle.LiveData
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

class TodoRepository(application: Application) {
    private var mTodoDatabase: TodoDatabase
    private var mTodoDAO: TodoDAO
    private var mTodoItems: LiveData<List<TodoModel>>

    init {
        mTodoDatabase = TodoDatabase.getInstance(application)
        mTodoDAO = mTodoDatabase.todoDao()
        mTodoItems = mTodoDAO.getTodoList()
    }

    fun getTodoList(): LiveData<List<TodoModel>> {
        return mTodoItems
    }

    fun insertTodo(todoModel: TodoModel) {
        Observable.just(todoModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mTodoDAO.insertTodo(todoModel)
            }, {

            })
    }

    fun updateTodo(todoModel: TodoModel) {
        Observable.just(todoModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mTodoDAO.updateTodo(todoModel)
            }, {

            })
    }

    fun deleteTodo(todoModel: TodoModel) {
        Observable.just(todoModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mTodoDAO.deleteTodo(todoModel)
            }, {

            })
    }

}