package com.example.kotlindemo.specialclass

/**
 *  object关键字：创建单例类,且是线程安全的
 *      可以继承类，也可以实现接口（object其实就是合并了class功能，又实现了单例）
 */

object SingleInstance {

    val name = "object 创建类中的属性"

    fun method(){
        println("object 中的方法 ")
    }
}