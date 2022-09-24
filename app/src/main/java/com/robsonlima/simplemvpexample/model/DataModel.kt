package com.robsonlima.simplemvpexample.model

import com.robsonlima.simplemvpexample.contract.IMainContract

/**
 * The Model provides data (e.g. parsin JSON data, fetch data from database, etc).
 * Contains the data we want to show on UI (in MainFragment).
 */
data class DataModel(val textForUI: String) : IMainContract.appModel {

    override fun getUpdatedStringFromModel(): String? {
        return textForUI
    }
}