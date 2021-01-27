package com.github.dnovaes.chowa.presenters

import android.os.Bundle

abstract class BasePresenter {

    private var isViewAlive = false

    abstract fun initialize(extras: Bundle?)

    open fun start() {
        isViewAlive = true
    }

    open fun finalizeView() {
        isViewAlive = false
    }
}
