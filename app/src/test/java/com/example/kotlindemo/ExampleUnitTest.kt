package com.example.kotlindemo

import com.example.kotlindemo.arrayandcollection.ArraySample
import com.example.kotlindemo.arrayandcollection.CollectionSample
import com.example.kotlindemo.bean.UserBean
import com.example.kotlindemo.constructorstudy.Fruits2
import com.example.kotlindemo.conststatic.CompanionStaticSample
import com.example.kotlindemo.specialclass.SingleInstance
import com.example.kotlindemo.specialclass.UserImpl
import com.example.kotlindemo.specialclass.UserInner
import com.example.kotlindemo.ui.BaseActivity
import com.example.kotlindemo.ui.SecondActivity
import org.junit.Assert.assertEquals
import org.junit.Test


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
        var user:UserBean = UserBean()
        //类型可以省略，能够自动推导出来
        var user2 = UserBean()
        println(user.test())
        println(user2.test())

        var baseActivity : BaseActivity = SecondActivity()
         baseActivity.abc2()
    }

    @Test
    fun constructorTest(){
//        var banana:Fruits = Fruits("主构造函数")
//        var ba1:Fruits = Fruits()
//        ba1.println()
       // banana.println()

        var  fruits2  = Fruits2()
        fruits2.println()

    }

    @Test
    fun InnerClassTest(){
        //理解猜测：UserInner(),创建对象的时候，带括号，像是调用主构造函数的意思似的，同理
        //内部类创建，在外部类对象基础上，再调用自己的主构造方法
        var userName: UserInner.UserName  = UserInner().UserName()
        userName.l()
    }


    @Test
    fun InterfaceImplTest(){
        var user = UserImpl()
        println( user.getAge())
        println(user.getName())
    }


    @Test
    fun SingleInstanceTest(){
        println(SingleInstance.name)
        SingleInstance.method()
        //伴生类  模拟 Java   final+static
        val appId = CompanionStaticSample.AppId2
        println(appId)
    }



    //顶层函数测试
    @Test
    fun topfunctionTest() {
        com.example.kotlindemo.topLevelFuncion()
    }




    //静态的相关测试
    @Test
    fun staticFun(){
        println(CompanionStaticSample.staticObj.AppUid)
        CompanionStaticSample.staticObj.testStaticFun()
    }


    //静态的相关测试
    @Test
    fun arrayTypeTest(){
        var arraySample = ArraySample()
       println(arraySample.arrays.contains("a"))

    }


    //集合的相关测试
    @Test
    fun collectionTest(){
        var collectionSample = CollectionSample()
        collectionSample.mutMapTest()
        println(collectionSample.value1)

    }



























}
