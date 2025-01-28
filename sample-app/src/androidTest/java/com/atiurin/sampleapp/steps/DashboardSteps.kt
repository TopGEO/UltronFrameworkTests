package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.contrib.DrawerActions
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isDisplayed

object DashboardSteps {
    fun checkDashboardIsLoaded(): DashboardSteps = apply {
        UIElementPage.friendsHeader.isDisplayed()
    }

    fun openChatWithFriend(friendName: String): DashboardSteps = apply {
        onView(androidx.test.espresso.matcher.ViewMatchers.withText(friendName)).click()
    }

    fun openBurgerMenu(): DashboardSteps = apply {
        onView(UIElementPage.drawerLayout).perform(DrawerActions.open())
    }
}