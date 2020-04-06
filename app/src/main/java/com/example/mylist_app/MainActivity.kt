package com.example.mylist_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerview) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val users = ArrayList<User>()
        users.add(User("Fruits", "Dairy", "Spices", "Paper_Wraps", "Toiletries", "Vegetables", "Frozen_Food", "Canned_Goods"
        ))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter





    }
}
