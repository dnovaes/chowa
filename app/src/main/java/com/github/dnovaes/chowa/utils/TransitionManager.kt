package com.github.dnovaes.chowa.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.github.dnovaes.chowa.R
import com.github.dnovaes.chowa.ui.base.BaseActivity

class TransitionManager(private val activity: BaseActivity) {

    companion object {
        const val FRAGMENT_ID = R.id.default_fragment
    }

    private val fragmentManager = activity.supportFragmentManager

    fun startFragment(fragmentInstance: Fragment) {
        fragmentManager.beginTransaction().also {
            it.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            it.replace(FRAGMENT_ID, fragmentInstance)
            it.addToBackStack(null)
            it.commit()
        }
    }

}