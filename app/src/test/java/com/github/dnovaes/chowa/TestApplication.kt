package com.github.dnovaes.chowa

import android.app.Application
import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.KoinContextHandler
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.module.Module

class TestApplication: Application() {

    private val appModules: List<Module> = listOf()

    override fun onCreate() {
        super.onCreate()
        startKoinWithModules(this@TestApplication, appModules)
    }

    override fun onTerminate() {
        stopKoin()
        super.onTerminate()
    }

    private fun startKoinWithModules(
        context: Context,
        modules: List<Module>
    ) {
        if (KoinContextHandler.getOrNull() == null) {
            startKoin {
                androidContext(context)
                modules.forEach {
                    modules(it)
                }
            }
        }
    }

}