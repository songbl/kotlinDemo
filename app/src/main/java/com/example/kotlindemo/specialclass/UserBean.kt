package com.example.kotlindemo.specialclass

/**
 *  数据类 ，用于保存数据（Bean），
 *  表示：data
 *  使用：创建类时回自动创建以下的方法
 *      1. getter/setter方法
 *      2. equals()/hashCode
 *      3. toString()
 *      4.copy()函数，复制一个对象，改变它的一些属性，但其余保持不变
 *
 *
 *   // copy函数使用
 *       var user = UserBean("hjc",26)
 *       var user1 = UserBean.copy(age = 30)
 *       输出user1.toString()，结果是：User(userName=hjc,age=30)
 */
//对象类主构造方法至少有一个参数
//数据类不能用open、abstract、sealed(封闭类)、inner标识
data class UserBean(var name:String,var age:Int) {
}