package com.github.dnovaes.chowa.food

import androidx.fragment.app.Fragment
import androidx.test.core.app.ActivityScenario
import com.github.dnovaes.chowa.TestApplication
import com.github.dnovaes.chowa.ui.activities.SingleFragmentActivity
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(application = TestApplication::class)
abstract class BaseFragmentTest<T: Fragment>() {

    open fun startSpecs(commands: T.() -> Unit) {
        runFragmentTests (newInstance()) {
            this.apply(commands)
        }
    }

    abstract fun newInstance(): T

    private fun runFragmentTests(fragment: T, block: T.() -> Unit) {
        val scenario = ActivityScenario.launch(SingleFragmentActivity::class.java)
        scenario.onActivity {
            it.startFragment(fragment)
            block(fragment)
            it.finish()
        }
        scenario.close()
    }

}