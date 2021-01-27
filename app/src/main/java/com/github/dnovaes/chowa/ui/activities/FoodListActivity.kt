package com.github.dnovaes.chowa.ui.activities

import com.github.dnovaes.chowa.R
import com.github.dnovaes.chowa.di.module.FoodsModule
import com.github.dnovaes.chowa.ui.base.BaseActivity
import com.github.dnovaes.chowa.ui.fragments.FoodOverviewFragment

class FoodListActivity : BaseActivity() {

    override val layoutResource = R.layout.activity_food_list

    override val modules = listOf(FoodsModule.instance)

    override fun initComponents() {
        super.initComponents()
        startInitialFragment()
    }

    private fun startInitialFragment() {
        transitionManager.startFragment(FoodOverviewFragment.newInstance())
    }
}
