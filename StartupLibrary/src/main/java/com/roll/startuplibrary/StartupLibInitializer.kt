package com.roll.startuplibrary

import android.content.Context
import androidx.startup.Initializer

class StartupLibInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        StartupInit.init(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}