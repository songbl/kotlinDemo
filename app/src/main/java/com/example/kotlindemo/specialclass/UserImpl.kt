package com.example.kotlindemo.specialclass


/**
 * 实现UserImpl，需要重写getName()方法；
 * 可以不重写getAge()，因为getAge()有方法体
 *
 * 实现接口，使用冒号 ：
 * 继承也使用冒号 ，继承同时要实现接口，之间用逗号，分隔开
 *
 */
class UserImpl() :IUser {

    override fun getName(): String {
        return "漩涡鸣人  =子类"
    }

}