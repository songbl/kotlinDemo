package com.example.kotlindemo.conststatic

/**
 *  1.Kotlin 的常量必须声明在对象(object)（包括伴生对象）或者top-levelz中，因为常量是静态的
 *  2.const 关键字修饰
 *  3.Kt中只有基本类型和String类型可以声明成常量
 *
 *  4. 对于val(只读变量)，const修饰后是public的；val是私有的，可以通过get方法获取
 */
class Sample {


    companion object{
        //public static final String hostUrl = "https://renji.user";
        const val hostUrl = "https://renji.user"
    }
}