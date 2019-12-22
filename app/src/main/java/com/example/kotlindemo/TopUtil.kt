package com.example.kotlindemo

// 这样写的属性和函数，属于 package，不在 class/object 内
/**
 *  对于 object 、companion object 和top-level应该选择哪一个 ？
 *   1.如果想写工具类功能，之间创建文件，写top-level[顶层]函数
 *   2.如果需要继承类或者实现接口，就用object 或 companion object
 */

fun topLevelFuncion() {
    println("属于包，不属于类，顶级函数")
}