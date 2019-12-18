package com.example.kotlindemo

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class SecondActivity : BaseActivity() {


  lateinit var tvTest: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("long","SecondActivity onCreate 执行")
        Log.e("long","打印父类的str参数"+str)
        tvTest = findViewById(R.id.tv_test)
        tvTest.setOnClickListener { abc() }
        //等价于
//        tvTest.setOnClickListener(View.OnClickListener { abc() })
    }

    override fun abc() {
        super.abc()
        Log.e("long","调用父类的 abc函数")
    }


}