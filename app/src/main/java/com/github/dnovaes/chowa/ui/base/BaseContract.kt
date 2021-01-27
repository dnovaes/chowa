package com.github.dnovaes.chowa.ui.base

import android.os.Bundle

abstract class BaseContract {

    private var isViewAlive = false

    abstract fun initialize(extras: Bundle?)

    open fun start() {
        isViewAlive = true
    }

    open fun finalizeView() {
        isViewAlive = false
    }
}
