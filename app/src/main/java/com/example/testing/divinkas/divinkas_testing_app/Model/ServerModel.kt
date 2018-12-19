package com.example.testing.divinkas.divinkas_testing_app.Model

import android.content.Context
import com.example.testing.divinkas.divinkas_testing_app.Callback.Themes_callback
import com.example.testing.divinkas.divinkas_testing_app.Data.Theme_test
import com.example.testing.divinkas.divinkas_testing_app.Retrofit.Retrofit_Client
import com.example.testing.divinkas.divinkas_testing_app.Retrofit.Retrofit_API
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.disposables.Disposable


class ServerModel(private var context: Context?) {
    private var server:Retrofit_API = Retrofit_Client.get_connection

    fun load_themes(callback:Themes_callback){
        server
            .get_themes_list()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<List<Theme_test>> {
                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(list: List<Theme_test>) {
                    callback.theme_list(list)
                }

                override fun onError(e: Throwable) {
                }

                override fun onComplete() {
                }
            })
    }
}



