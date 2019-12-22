package com.example.kotlindemo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.kotlindemo.R
import com.example.kotlindemo.specialclass.IUser
import com.example.kotlindemo.specialclass.UserImpl


//: 表示继承，同样也可以表示实现接口
//: Kotlin 里面的类默认是final的，而Java里只有加上final关键字的类才是final
class MainActivity : AppCompatActivity() {

    var str :String = "Kotlin 无参数无返回值 函数定义"
    var strFirst ="一"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        noNameTestFun()
    }



    fun abc(){
        println("$str$strFirst")
    }
    fun abc2() : Unit {
        println("$str"+"二")
    }



    fun noNameTestFun(){
        var user = UserImpl()
       user.printName(object: IUser{
           override fun getName(): String {
               return "匿名 牛逼  接口{}"
           }
       })
    }
}
