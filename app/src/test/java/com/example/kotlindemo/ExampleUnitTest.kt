package com.example.kotlindemo

import bean.User
import org.junit.Test

import org.junit.Assert.*


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun str1(){
        var a ="a"
        var b: String ="b"
        var c = "$a$b"
        println(c)
    }


    //getter he setter
    @Test
    fun getterTest(){

    }


    //数组
    @Test
    fun arrayTest(){
        //intArrayOf 返回指定的int 数组
        var array : IntArray = intArrayOf(1,2)
        println(array[1])
    }


    @Test
    fun classTest(){
        var user:User = User()
        //类型可以省略，能够自动推导出来
        var user2 = User()
        println(user.test())
        println(user2.test())

        var baseActivity :BaseActivity = SecondActivity()
         baseActivity.abc2()

    }
































}