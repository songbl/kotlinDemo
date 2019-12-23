package com.example.kotlindemo.arrayandcollection

/**
 *  Kt中：数组和列表的协变和Java中相反
 *      可变集合/不可变集合
 *         只有mutableMapOf()创建的Map才可以修改，Kotlin的集合分为两种：
 *          1.只读
 *          2.可变
 *       有两层意思：
 *          1. 集合的size不可变
 *          2. 集合的元素值不可变
 *
 *   例子：
 *     listOf() 创建不可变的list，mutableListOf() 创建可变的List
 *     setOf() ,mutableSetOf()
 *     mapOf() ,mutableMapOf()
 *          有mutable前缀的函数创建的是可变的集合，没有mutable前缀的创建的是不可变的结合
 *     可以通过toMutable*() 系函数转化成可变的结合
 *     toMutable* 返回创建的新的集合，原有的集合依然不可变
 *
 *
 */
class CollectionSample {

    //List 多了一个协变（covariant）特性，也就是说可以将子类的List
    //付给父类的List变量
    val strList = listOf("a","b","v")
    val strAny : List<Any> = strList




    //Set,同样支持协变
   val strSet = setOf<String>("a","b","c")




    //Map , to 表示键和值关联，叫做【中缀表达式】
    val map :Map<String,Int> = mapOf("key1" to 1,"key2" to  2)
    //都是有类型推算的，所有可以不写类型
    val map2 = mapOf("keys" to 1,"key2" to  2)

    //取值方式
    val value1 = map.get("key1")
    val value2 = map["key2"]

    //存值,修改；放在函数中执行才行呢，外面是声明的成员....
    fun mutMapTest(){
        val numbersMap = mutableMapOf("one" to 1, "two" to 2)
        numbersMap.put("three", 3)
        println(numbersMap)
    }


    //将不可变的集合转化成可变的集合
    fun changeMutablCollection(){
        val strList = listOf("a", "b", "c")
        //toMutable* 返回创建的新的集合，原有的集合依然不可变
        val toMutableList = strList.toMutableList()
        toMutableList.add("d")

    }



    //Kt还引入了一个新的容器类型Sequence，它和Iterable一样用来比那里一组数据
    //并可以对每个元素进行特定的处理
    //直接创建
    val sequenceOf = sequenceOf("a", "b")
    //通过Iterable 创建
    val list = listOf("a","b")
    val sequenceOf2 = list.asSequence()








}