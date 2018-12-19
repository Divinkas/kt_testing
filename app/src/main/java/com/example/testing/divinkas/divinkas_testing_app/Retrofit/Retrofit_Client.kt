package com.example.testing.divinkas.divinkas_testing_app.Retrofit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit_Client {
    private var retrofit: Retrofit? = null

    private val client:Retrofit
    get() {
        if(retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl(Retrofit_API.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        }
        return retrofit!!
    }

    val get_connection:Retrofit_API
        get() = client.create(Retrofit_API::class.java)

}