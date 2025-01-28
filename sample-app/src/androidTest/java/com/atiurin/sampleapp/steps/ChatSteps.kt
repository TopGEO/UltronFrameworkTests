package com.atiurin.sampleapp.steps

import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.sampleapp.helper.*  // your custom methods
import com.atiurin.ultron.core.espresso.recyclerview.withRecyclerView  // If still using Ultron's withRecyclerView

object ChatSteps {
    fun checkChatIsOpenForAddressee(friendName: String): ChatSteps = apply {
        val actualTitle = UIElementPage.toolbarTitle.getText()
        if (actualTitle != friendName) {
            throw AssertionError("Expected friend: '$friendName' but got '$actualTitle'")
        }

        // or i can just use:
        // UIElementPage.toolbarTitle.hasText(friendName)
    }

    fun enterTextInChat(message: String): ChatSteps = apply {
        UIElementPage.messageInputText.typeText(message)
    }

    fun sendMessage(): ChatSteps = apply {
        UIElementPage.sendButton.tap()
    }

    fun assertMessageIsInChat(message: String): ChatSteps = apply {
        // there are too many ways, but i will use withRecyclerView approach:
        withRecyclerView(UIElementPage.messagesList)
            .item(hasDescendant(withText(message)))
            .isDisplayed()
    }
}