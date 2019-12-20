package com.example.kotlindemo.constructorstudy

import android.util.Log

/**
 * 该类 主要分析记录构造方法
 */

// 1.子类，继承父类   :类名()
// 2.主构造函数属于类头的一部分= 跟在类名后面，采用constructor关键字
// constructor（参数名：参数类型）；若主构造函数没有任何注解（可见性修饰符），可省略关键字
//class Fruits (color :String ) : Food(){

// 4.次构造函数，必须加constructor关键字，一个类可以有多个构造函数，只是传入参数不同


class Fruits constructor(method :String ) : Food(){

    var method:String ?= null

    //3.初始化的代码放到以init关键字作为前缀的代码块中
    // 主构造函数，走下面的init中的逻辑
    init {
        this.method = method
        println("init 执行")
    }


    //次构造函数1
    constructor():this("次构造方法一"){
        println("次构造方法一")
    }

    //次构造函数2
    constructor(price:Double):this("次构造函数二"){
        println(price)
    }

    //次构造函数3
    constructor(price:Double,name:String):this("次构造方法三"){
        println("次构造方法二$price  $name")
    }

    //4. 构造方法总结：次要构造函数，依赖于主构造函数，主构造函数需要的参数
    //次构造函数都得有，但是次构造函数，可以有其它的参数形式。需要调用init



    override fun banana() {
        super.banana()
        Log.e("long","打印构造函数参数")
    }

    fun println(){
        println("主构造函数传递的参数  $method")
    }
}