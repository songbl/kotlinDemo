package com.example.kotlindemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


//: 表示继承，同样也可以表示实现接口
//: Kotlin 里面的类默认是final的，而Java里只有加上final关键字的类才是final
 open class BaseActivity : AppCompatActivity() {

    var str :String = "Kotlin 无参数无返回值 函数定义"
    var strFirst ="一"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("long","BaseActivity")
    }



   open fun abc(){
       Log.e("long","$str$strFirst")
    }
    fun abc2() : Unit {
//        Log.e("long","$str"+"二")
          println("$str"+"二")
    }
}
