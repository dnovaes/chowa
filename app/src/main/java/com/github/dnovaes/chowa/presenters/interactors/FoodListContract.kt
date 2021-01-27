package com.github.dnovaes.chowa.presenters.interactors

interface FoodListContract {
    interface View {
        fun applyFeedFilter(filterType: String)
        fun onFinish()
    }

    interface Presenter {
        fun onStart()
        fun onBack()
    }

    interface Monitoring { }
}