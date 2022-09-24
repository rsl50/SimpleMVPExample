package com.robsonlima.simplemvpexample.presenter

import com.robsonlima.simplemvpexample.contract.IMainContract
import com.robsonlima.simplemvpexample.model.DataModel

/**
 * This class represents the Presenter of the MainFragment/Activity.
 */
class MainPresenter(appViewInterface: IMainContract.appView) {

    // The link between the Presenter and the View (MainFragment/MainActivity) is done by Interface.
    private val appView = appViewInterface

    // Instantiate the Model with the new data
    private val model = DataModel(textForUI = "Here's the updated text!")

    /**
     * Get string value from the Model.
     *
     * It is the link between the Presenter and the Model.
     *
     * @return the string value from the Model.
     */
    private fun getUpdatedTextFromModel() : String {
        return model.getTextData()
    }

    /**
     * Pass the value from the Presenter to View.
     *
     * It is the link between Presenter and View.
     */
    fun getUpdatedText() {
        appView.onUpdateText(getUpdatedTextFromModel())
    }
}