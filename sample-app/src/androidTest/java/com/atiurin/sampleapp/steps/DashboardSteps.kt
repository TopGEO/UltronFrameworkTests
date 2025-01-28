package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.contrib.DrawerActions
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.sampleapp.helper.*  // <-- Import your custom methods here

object DashboardSteps {
    fun checkDashboardIsLoaded(): DashboardSteps = apply {
        UIElementPage.friendsHeader.assertIsViewDisplayed()
    }

    fun openChatWithFriend(friendName: String): DashboardSteps = apply {
        onView(withText(friendName)).tap()
    }

    fun openBurgerMenu(): DashboardSteps = apply {
        onView(UIElementPage.drawerLayout).perform(DrawerActions.open())
    }
}
