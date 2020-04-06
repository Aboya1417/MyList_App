package com.example.mylist_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), CustomAdapter.ViewActions {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerview) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val users = ArrayList<Item>()
        users.add(Item("Fruits", "Details for Fruit"))
        users.add(Item("Dairy", "Details for Dairy"))
        users.add(Item("Spices", "Details for Spices"))
        users.add(Item("Paper_Wraps", "Details for Paper_Wraps"))
        users.add(Item("Toiletries", "Details for Toiletries"))
        users.add(Item("Vegetables", "Details for Vegetables"))
        users.add(Item("Frozen_Food", "Details for Frozen_Food"))
        users.add(Item("Canned_Goods", "Details for Canned_Goods"))

        val adapter = CustomAdapter(users, this)

        recyclerView.adapter = adapter


    }

    override fun onItemClicked(item: Item) {

        Log.d("XXX", "$item")

        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(EXTRA, item)
        startActivity(intent)
    }
}

const val EXTRA= "extra"