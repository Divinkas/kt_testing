package com.example.testing.divinkas.divinkas_testing_app.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.testing.divinkas.divinkas_testing_app.Data.Theme_test
import com.example.testing.divinkas.divinkas_testing_app.R

class TestListAdapter(_context:Context, _list:List<Theme_test>): RecyclerView.Adapter<TestListAdapter.TestListViewHolder>() {
    private val context:Context = _context
    private var list:List<Theme_test> = _list

    override fun onBindViewHolder(holder: TestListViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        holder.tv_test_name.text = list[position].Name
        holder.tv_test_name.setOnClickListener {
            Toast.makeText(context, "id: " + list[position].id, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateViewHolder(view_group: ViewGroup, p1: Int): TestListViewHolder {
        val view:View = LayoutInflater.from(context).inflate(R.layout.item_theme_test, view_group, false)
        return TestListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class TestListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tv_test_name:TextView = itemView.findViewById(R.id.tv_theme_name)
    }
}

