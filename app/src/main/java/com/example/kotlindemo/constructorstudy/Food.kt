package com.example.kotlindemo.constructorstudy

import android.util.Log

// 父类
//在类和方法名前加上  open  关键字，才能被继承和重写
open class Food {
    var str = "我是父类的字符串"

    open fun banana(){
        Log.e("long", "父类的banana方法执行   =$str")
    }
}