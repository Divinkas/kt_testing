package com.example.testing.divinkas.divinkas_testing_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.testing.divinkas.divinkas_testing_app.Adapter.TestListAdapter
import com.example.testing.divinkas.divinkas_testing_app.Callback.Themes_callback
import com.example.testing.divinkas.divinkas_testing_app.Data.Theme_test
import com.example.testing.divinkas.divinkas_testing_app.Presenter.Test_presenter

class TestListActivity : AppCompatActivity(), Themes_callback {

    private var presenter:Test_presenter = Test_presenter(this)

    private lateinit var rv_list_test_names:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_list)
        rv_list_test_names = findViewById(com.example.testing.divinkas.divinkas_testing_app.R.id.rv_list_test_items)
        presenter.init_test_list(this)
    }

    override fun theme_list(list: List<Theme_test>) {
        rv_list_test_names.layoutManager = LinearLayoutManager(this)
        rv_list_test_names.adapter = TestListAdapter(this, list)
    }

}
