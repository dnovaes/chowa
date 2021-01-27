package com.github.dnovaes.chowa.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.dnovaes.chowa.utils.TransitionManager
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.core.module.Module

abstract class BaseActivity: AppCompatActivity() {

    abstract val modules: List<Module>

    protected abstract val layoutResource: Int

    protected val transitionManager: TransitionManager by lazy { TransitionManager(this) }

    protected open fun initComponents() {
        loadKoinModules(modules)
    }

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResource)
        initComponents()
    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(modules)
    }

}
