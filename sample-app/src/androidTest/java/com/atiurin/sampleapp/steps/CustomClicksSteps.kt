package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.sampleapp.helper.*  // your custom methods

object CustomClicksSteps {
    fun markAllPositions(): CustomClicksSteps = apply {
        UIElementPage.topLeft.tap()
        UIElementPage.topCenter.tap()
        UIElementPage.topRight.tap()
        UIElementPage.centerRight.tap()
        UIElementPage.bottomRight.tap()
        UIElementPage.bottomCenter.tap()
        UIElementPage.bottomLeft.tap()
        UIElementPage.centerLeft.tap()
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
         UIElementPage.testButton.tap()
    }
}
