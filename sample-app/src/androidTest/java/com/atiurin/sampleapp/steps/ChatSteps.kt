package com.atiurin.sampleapp.steps

import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.ultron.core.espresso.recyclerview.withRecyclerView
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.hasText
import com.atiurin.ultron.extensions.typeText

object ChatSteps {
    fun checkChatIsOpenForAddressee(friendName: String): ChatSteps = apply {
        UIElementPage.toolbarTitle.hasText(friendName)
    }

    fun enterTextInChat(message: String): ChatSteps = apply {
        UIElementPage.messageInputText.typeText(message)
    }

    fun sendMessage(): ChatSteps = apply {
        UIElementPage.sendButton.click()
    }

    fun assertMessageIsInChat(message: String): ChatSteps = apply {
        // we can also use : withText(message).isDisplayed()
        // but i will check it in recycler view
        withRecyclerView(UIElementPage.messagesList)
            .item(hasDescendant(withText(message)))
            .isDisplayed()
    }
}