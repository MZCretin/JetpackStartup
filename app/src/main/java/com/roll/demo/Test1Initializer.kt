package com.roll.demo

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

class Test1Initializer : Initializer<Unit> {
    override fun create(context: Context) {
        Log.e("HHHHH","Test1Initializer初始化")
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}