package com.example.kotlindemo.specialclass

/**
 *  接口 关键之 interface
 *
 *  2.方法体
 *         接口中的方法可以有默认方法体，有默认方法体的方法可以不重写
 *         区别于Java，Java不支持接口中的方法有方法体
 *
 *  3.Kotlin 中 object: 也可以用来创建匿名类的对象
 */

interface IUser {

    fun getName():String //无默认方法体，必须重写

    fun getAge():Int{   //有默认方法体，可不重写
        return 25
    }
}