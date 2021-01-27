package com.github.dnovaes.chowa.di.module

import com.github.dnovaes.chowa.presenters.FoodListPresenterImpl
import com.github.dnovaes.chowa.presenters.interactors.FoodListContract
import org.koin.dsl.module

object FoodsModule {
    val instance = module {
        factory<FoodListContract.Presenter> { (view: FoodListContract.View) ->
            FoodListPresenterImpl(view)
        }
    }
}