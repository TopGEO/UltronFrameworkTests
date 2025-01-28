package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.*
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object UIElementPage {
    val friendsHeader: Matcher<View> by lazy { withText("Friends") }
    val drawerLayout: Matcher<View> by lazy { withId(R.id.drawer_layout) }
    val toolbarTitle: Matcher<View> by lazy { withId(R.id.toolbar_title) }

    val messageInputText: Matcher<View> by lazy { withId(R.id.message_input_text) }
    val sendButton: Matcher<View> by lazy { withId(R.id.send_button) }
    val messagesList: Matcher<View> by lazy { withId(R.id.messages_list) }

    val topLeft: Matcher<View> by lazy { withId(R.id.rB_top_left) }
    val topCenter: Matcher<View> by lazy { withId(R.id.rB_top_center) }
    val topRight: Matcher<View> by lazy { withId(R.id.rB_top_right) }
    val centerRight: Matcher<View> by lazy { withId(R.id.rB_center_right) }
    val bottomRight: Matcher<View> by lazy { withId(R.id.rB_bottom_right) }
    val bottomCenter: Matcher<View> by lazy { withId(R.id.rB_bottom_center) }
    val bottomLeft: Matcher<View> by lazy { withId(R.id.rB_bottom_left) }
    val centerLeft: Matcher<View> by lazy { withId(R.id.rB_center_left) }

    val testButton: Matcher<View> by lazy { withId(R.id.button) }
}