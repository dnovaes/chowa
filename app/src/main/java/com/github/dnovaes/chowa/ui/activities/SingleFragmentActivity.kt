package com.github.dnovaes.chowa.ui.activities

import androidx.annotation.RestrictTo
import androidx.fragment.app.Fragment
import com.github.dnovaes.chowa.ui.base.BaseActivity
import org.koin.core.module.Module
import com.github.dnovaes.chowa.R
import com.github.dnovaes.chowa.ui.fragments.FoodOverviewFragment
import com.github.dnovaes.chowa.utils.TransitionManager

@RestrictTo(RestrictTo.Scope.TESTS)
class SingleFragmentActivity: BaseActivity() {

    override val layoutResource: Int = R.layout.activity_food_list

    override val modules: List<Module> = listOf()

    fun startFragment(fragment: Fragment) {
        val transitionManager = TransitionManager(this)
        transitionManager.startFragment(FoodOverviewFragment.newInstance())
    }

}