package com.example.kotlindemo.specialclass

//理解猜测：UserInner(),创建对象的时候，带括号，像是调用主构造函数的意思似的，同理
//内部类创建，在外部类对象基础上，再调用自己的主构造方法
//var userName: UserInner.UserName  = UserInner().UserName()
//userName.l()

class UserInner {
    var age: Int = 6

    inner class UserName {
        var innerAger = 10
        fun l(){
            println("内部类的方法调用 外部类属性$age  自己的属性$innerAger")
        }
    }
}