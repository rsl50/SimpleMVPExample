package com.robsonlima.simplemvpexample.model

// Contains the data we want to show on UI (in MainFragment)
data class DataModel(val textForUI: String) {
    fun getTextData() : String {
        return textForUI
    }
}