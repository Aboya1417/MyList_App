package com.example.mylist_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val extra : Item =  intent.getParcelableExtra(EXTRA) ?: Item("unknown", "Unknown Details")


        textView.text = "Name: ${extra.name}"
        textView2.text = "Details: ${extra.details}"

    }
}
