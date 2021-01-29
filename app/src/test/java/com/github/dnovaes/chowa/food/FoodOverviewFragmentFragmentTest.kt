package com.github.dnovaes.chowa.food

import android.os.Build
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasChildCount
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.github.dnovaes.chowa.R
import com.github.dnovaes.chowa.TestApplication
import com.github.dnovaes.chowa.model.FoodItem
import com.github.dnovaes.chowa.ui.fragments.FoodOverviewFragment
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(application = TestApplication::class, sdk = [Build.VERSION_CODES.O_MR1])
class FoodOverviewFragmentFragmentTest: BaseFragmentTest<FoodOverviewFragment>() {

    override fun newInstance() = FoodOverviewFragment.newInstance(1)

    @Test
    fun `verify recycler view items and actions after screen loaded`() {
        startSpecs {
            checkRecyclerItems()
        }
    }

    private fun checkRecyclerItems() {
        val foodItem = mockedFoodItem()
        val recyclerItem = onView(withText(foodItem.content))

        recyclerItem.check(matches(isDisplayed()))
        recyclerItem.check(matches(isDisplayed()))

        val foodList = FoodItem.mockedItems
        val fragmentView = onView(withId(R.id.list_foods))
        fragmentView.check(matches(isDisplayed()))
        fragmentView.check(matches(hasChildCount(foodList.size)))
    }

    private fun mockedFoodItem() = FoodItem(1, "Empadão")
}