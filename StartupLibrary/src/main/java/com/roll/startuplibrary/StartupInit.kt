package com.roll.startuplibrary

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.util.Log
import androidx.startup.Initializer

/**
 * 初始化
 */
@SuppressLint("StaticFieldLeak")
object StartupInit {

    //全局存储context
    private var context: Context? = null

    /**
     * 模拟初始化
     */
    fun init(context: Context): StartupInit {
        Log.e("HHHHHH","StartupInit被初始化了")
        this.context = context
        return this
    }
}