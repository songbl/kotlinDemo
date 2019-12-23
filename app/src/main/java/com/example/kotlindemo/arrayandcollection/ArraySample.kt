package com.example.kotlindemo.arrayandcollection

/**
 *  不支持协变，java中支持。
 *
 *      val strs:Array<String> =  arrayOf("a","b","c")
 *      val anys<any> = strs //compile-error type mismatch
 *      子数组对象不能付给父类数组对象
 *
 *   Java中：
 *      String[] strs = {"a", "b", "c"};
 *      Object[] objs = strs; // success
 *
 */
class ArraySample {

    //String[] strs = {"a","b","c"}
    val arrays :Array<String> = arrayOf("a","b","c")
}