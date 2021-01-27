package com.github.dnovaes.chowa

import android.app.Application
import com.github.dnovaes.chowa.di.module.FoodsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ChowaApplication: Application() {

    companion object {
        private lateinit var instance: ChowaApplication
        fun get(): ChowaApplication = instance
    }

    override fun onCreate() {
        super.onCreate()

        val appModules = listOf(FoodsModule.instance)
        instance = this
        startKoin {
            androidContext(this@ChowaApplication)
            modules(appModules)
        }
    }
}