@file:Suppress("unused")

package com.agoda.kakao.list

import android.view.View
import android.widget.AdapterView
import android.widget.ScrollView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.common.actions.ScrollableActions
import com.agoda.kakao.common.actions.SwipeableActions
import org.hamcrest.Matchers

/**
 * Provides ScrollableActions implementation for ScrollView
 *
 * @see ScrollableActions
 * @see SwipeableActions
 * @see ScrollView
 */
interface ScrollViewActions : ScrollableActions, SwipeableActions {
    override fun scrollToStart() {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll ScrollView to start"

            override fun getConstraints() = Matchers.allOf(ViewMatchers.isAssignableFrom(ScrollView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is ScrollView) {
                    view.fullScroll(View.FOCUS_UP)
                }
            }
        })
    }

    override fun scrollToEnd() {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll ScrollView to end"

            override fun getConstraints() = Matchers.allOf(ViewMatchers.isAssignableFrom(ScrollView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is ScrollView) {
                    view.fullScroll(View.FOCUS_DOWN)
                }
            }
        })
    }

    override fun scrollTo(position: Int) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll ScrollView to $position Y position"

            override fun getConstraints() = Matchers.allOf(ViewMatchers.isAssignableFrom(ScrollView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is ScrollView) {
                    view.scrollTo(0, position)
                }
            }
        })
    }

    /**
     * Returns the size of ScrollView
     *
     * @return size of adapter
     *
     * @see ScrollView
     * @see AdapterView
     */
    fun getSize(): Int {
        var size = 0

        view.perform(object : ViewAction {
            override fun getDescription() = "Get AdapterView adapter size"

            override fun getConstraints() = Matchers.allOf(ViewMatchers.isAssignableFrom(AdapterView::class.java), ViewMatchers.isDisplayed())

            override fun perform(uiController: UiController?, view: View?) {
                if (view is AdapterView<*>) {
                    size = view.count
                }
            }
        })

        return size
    }
}