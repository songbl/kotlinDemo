package com.example.kotlindemo.conststatic

/**
 * 该类模拟 Java中 static +final，使用伴生类实现
 *     public static final String AppId = "6000100";
 */
class CompanionStaticSample {

    //伴生对象，一个类中只能有一个伴生对象，有伴生对象了，就不需要像下面一样加   类名  了
    // 让类的一部分函数和变量静态
    //引用  CompanionStaticSample.AppId
    companion object{
        val  AppId ="600100"
        val AppId2 ="1234"

        init{
            //静态相关的初始化
            //
        }
    }


    //object 修饰的变量和方法都是静态的，引用  CompanionStaticSample.staticObj.AppUid
    object staticObj{
        var AppUid = "500117"
        fun testStaticFun(){
            print("我是静态方法")
        }
    }


}