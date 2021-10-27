package com.roll.demo

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

class TestInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        Log.e("HHHHH","TestInitializer触发")
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(Test1Initializer::class.java,Test2Initializer::class.java)
    }
}