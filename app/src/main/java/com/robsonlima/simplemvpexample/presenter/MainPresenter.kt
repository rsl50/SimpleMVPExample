package com.robsonlima.simplemvpexample.presenter

import com.robsonlima.simplemvpexample.contract.IMainContract
import com.robsonlima.simplemvpexample.model.DataModel

/**
 * The Presenter holds all the business logic and provides a mediator between the view and the
 * model. This class represents the Presenter of the MainFragment/Activity.
 */
class MainPresenter(appViewInterface: IMainContract.appView) : IMainContract.appPresenter {

    // The link between the Presenter and the View (MainFragment/MainActivity) is done by Interface.
    private val appView = appViewInterface
    // Holds the instance of the model
    private var model : IMainContract.appModel? = null

    init {
        initPresenter()
    }

    /**
     * Method responsible for initializing the Presenter.
     */
    private fun initPresenter() {
        // Instantiate the Model with the new data
        model = DataModel(textForUI = "Here's the updated text!")
    }

    /**
     * Get string value from the Model.
     *
     * It is the link between the Presenter and the Model.
     *
     * @return the string value from the Model.
     */
    private fun getUpdatedTextFromModel() : String? {
        return model?.getUpdatedTextFromModel()
    }

    /**
     * Pass the value from the Presenter to View.
     *
     * It is the link between Presenter and View.
     */
    override fun getUpdatedTextAndSetToView() {
        // If getUpdatedTextFromModel() is null then set textFromModel string as "null"
        val textFromModel = getUpdatedTextFromModel() ?: "null"
        appView.onUpdateText(textFromModel)
    }
}