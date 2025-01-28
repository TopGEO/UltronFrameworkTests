package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.*
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object UIElementPage {
    val toolbarTitle: Matcher<View> = withId(R.id.toolbar_title)
    val messageInputText: Matcher<View> = withId(R.id.message_input_text)
    val sendButton: Matcher<View> = withId(R.id.send_button)
    val messagesList: Matcher<View> = withId(R.id.messages_list)

    val topLeft: Matcher<View> = withId(R.id.rB_top_left)
    val centerLeft: Matcher<View> = withId(R.id.rB_center_left)
    val bottomLeft: Matcher<View> = withId(R.id.rB_bottom_left)
    val topRight: Matcher<View> = withId(R.id.rB_top_right)
    val centerRight: Matcher<View> = withId(R.id.rB_center_right)
    val bottomRight: Matcher<View> = withId(R.id.rB_bottom_right)
    val topCenter: Matcher<View> = withId(R.id.rB_top_center)
    val bottomCenter: Matcher<View> = withId(R.id.rB_bottom_center)
    val testButton: Matcher<View> = withId(R.id.button)

    val friendsHeader: Matcher<View> = withText("Friends")
    val drawerLayout: Matcher<View> = withId(R.id.drawer_layout)
//    val friendChandler: Matcher<View> = withText("Chandler Bing") // we can use if friend name is static
}