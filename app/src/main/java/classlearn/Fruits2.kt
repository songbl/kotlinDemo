package classlearn

import android.util.Log
/**
* 该类 测试了，次要构造方法 ，依托主要构造方法
 *      主要构造方法没有参数，this传递的是空
*/
class Fruits2 constructor() : Food(){

    var col:String ?= null

    //3.初始化的代码放到以init关键字作为前缀的代码块中
    // 主构造函数，走下面的init中的逻辑
    init {
        println("init 主构造函数")
    }


    //次构造函数，(主构造函数没有参数，所以this后面是空的)
    constructor(price:Double) : this() {
        println(price)
    }

    override fun banana() {
        super.banana()
        Log.e("long","打印构造函数参数")
    }

    fun println(){
        println(col)
    }
}