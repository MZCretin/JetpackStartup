package com.roll.startuplibrary2

import android.content.Context
import androidx.startup.Initializer

class StartupLibInitializer : Initializer<StartupInit> {

    override fun create(context: Context): StartupInit {
        return StartupInit.init(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}