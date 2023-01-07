package com.example.project1

import kotlin.concurrent.timerTask

fun main() {
    var todo=Todo()
    var task1 = Task(1,"Yara","note",true)
    var task2 = Task(2,"Youssef","note")
    var task3 = Task(3,"Alshammari","note",true)
    println("All Tasks:")
    todo.Add(task1)
    todo.Add(task2)
    todo.Add(task3)
    todo.show()
    println("Search task1 by id:")
    todo.print(1)
    println("Change status:")
    todo.change(task3)
    todo.show()
    println("After remove task2:")
    todo.remove(task2)
    todo.show()

}
data class Task(var id:Int,var name:String,var note:String,var isCompleted:Boolean=false){
}
class Todo{
    var tasks= arrayListOf<Task>()
    private set

    fun show(){
        for (i in tasks) {
            println(i)
        }
    }
    fun print(id:Int){
        for (i in 0 until tasks.size) {
            if (id == tasks[i].id) {
                println("${tasks[i]}")
                break
            }
        }
    }
    fun Add(task:Task){
        val insert= arrayOf(task)
        tasks.addAll(insert)
    }
    fun remove(task:Task){
        val delete= arrayOf(task)
        tasks.removeAll(delete)
    }
    fun change(task:Task){
        if (task.isCompleted == true) {
            task.isCompleted = false
        } else {
            task.isCompleted = true
        }
    }
}
