package com.example.testing.divinkas.divinkas_testing_app.Presenter

import android.content.Context
import com.example.testing.divinkas.divinkas_testing_app.Callback.Themes_callback
import com.example.testing.divinkas.divinkas_testing_app.Model.ServerModel

class Test_presenter(private var context: Context?) {
    private var server_model:ServerModel ?= null

    init {
        this.server_model = ServerModel(this.context)
    }

    fun init_test_list(callback: Themes_callback) {
        server_model?.load_themes(callback)
    }
}