package com.atiurin.sampleapp.tests.espresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.steps.ChatSteps
import com.atiurin.sampleapp.steps.CustomClicksSteps
import com.atiurin.sampleapp.steps.DashboardSteps
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests : BaseTest() {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testChatWithMyFriend() {
        DashboardSteps
            .checkDashboardIsLoaded()
            .openChatWithFriend("Chandler Bing")

        ChatSteps
            .checkChatIsOpenForAddressee("Chandler Bing")
            .enterTextInChat("Hello from my custom helper!")
            .sendMessage()
            .assertMessageIsInChat("Hello from my custom helper!")
    }

    @Test
    fun testCustomClicksPage() {
        DashboardSteps
            .checkDashboardIsLoaded()
            .openBurgerMenu()

        onView(withText("Custom Clicks")).tap()

        CustomClicksSteps
            .markAllPositions()
            .validateAllPositionsAreMarked()
//            .tapTestButton()
    }
}