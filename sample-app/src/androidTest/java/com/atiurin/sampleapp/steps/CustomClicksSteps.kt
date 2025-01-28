package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isChecked


object CustomClicksSteps {
    fun markAllPositions(): CustomClicksSteps = apply {
        UIElementPage.topLeft.click()
        UIElementPage.topCenter.click()
        UIElementPage.topRight.click()
        UIElementPage.centerRight.click()
        UIElementPage.bottomRight.click()
        UIElementPage.bottomCenter.click()
        UIElementPage.bottomLeft.click()
        UIElementPage.centerLeft.click()
    }

    fun validateAllPositionsAreMarked(): CustomClicksSteps = apply {
        UIElementPage.topLeft.isChecked()
        UIElementPage.topCenter.isChecked()
        UIElementPage.topRight.isChecked()
        UIElementPage.centerRight.isChecked()
        UIElementPage.bottomRight.isChecked()
        UIElementPage.bottomCenter.isChecked()
        UIElementPage.bottomLeft.isChecked()
        UIElementPage.centerLeft.isChecked()
    }

    fun tapTestButton(): CustomClicksSteps = apply {
//        UIElementPage.testButton.click()
    }
}