package com.robsonlima.simplemvpexample.presenter

import com.robsonlima.simplemvpexample.contract.IMainContract
import com.robsonlima.simplemvpexample.model.DataModel

/**
 * This class represents the Presenter.
 */
class MainPresenter(val appViewInterface: IMainContract.appView) {

    // The link between the Presenter and the View (MainFragment/MainActivity) is done by Interface.
    private val appView = appViewInterface

    // Instantiate the Model with the new data
    private val model = DataModel(textForUI = "Here's the updated text!")

    // Link between the Presenter and the Model
    private fun getUpdatedTextFromModel() : String {
        return model.getTextData()
    }

    // Link between Presenter and View
    fun getUpdatedText() {
        appView.onUpdateText(getUpdatedTextFromModel())
    }
}