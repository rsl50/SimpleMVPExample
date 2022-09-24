package com.robsonlima.simplemvpexample.contract

/**
 * The Contract sets the rules that will be followed by the classes.
 */
interface IMainContract {

    /** This is the link between the Presenter and the View (MainFragment/MainActivity) */
    interface appView {

        /**
         * Set data to the view.
         *
         * @param updatedText the string to be set into the view.
         */
        fun onUpdateText(updatedText: String)
    }
}