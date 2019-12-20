package com.example.kotlindemo.specialclass

/**
 * 该类模拟 Java中 static +final，使用伴生类实现
 *     public static final String AppId = "6000100";
 */
class CompanionSample {

    companion object{
        val  AppId ="600100"
    }
}