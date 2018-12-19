package com.example.testing.divinkas.divinkas_testing_app.Retrofit

import com.example.testing.divinkas.divinkas_testing_app.Data.Theme_test
import io.reactivex.Observable
import retrofit2.http.GET

interface Retrofit_API {

    companion object {
        const val BASE_URL = "http://worktravel.zzz.com.ua/"
    }

    @GET("Home")
    fun get_themes_list():Observable<List<Theme_test>>

}