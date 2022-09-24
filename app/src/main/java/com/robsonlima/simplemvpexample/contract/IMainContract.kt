package com.robsonlima.simplemvpexample.contract

import android.view.View

/**
 * The Contract sets the rules that will be followed by the classes.
 */
interface IMainContract {

    /**
     * Interface that must be implemented by the View.
     * This is the link between the Presenter and the View (MainFragment/MainActivity).
     */
    interface appView {

        /**
         * Set data to the view.
         *
         * @param updatedText the string to be set into the view.
         */
        fun onUpdateText(updatedText: String)
    }

    /**
     * Interface that must be implemented by the Model.
     * This is the link between the Presenter and the Model.
     */
    interface appModel {
        /**
         * Fetch data to be set on View.
         *
         * @return string that contains data to be set on View.
         */
        fun getUpdatedStringFromModel(): String?
    }

    /**
     * Interface that must be implemented by the Presenter.
     */
    interface appPresenter {
        /**
         * Handle the click event from the View.
         *
         * @param view [android.view.View] that will receive the click event.
         */
        fun onClick(View: View)
    }
}