package com.example.mylist_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
 class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
     class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
         val textviewFruits = itemView.findViewById(R.id.textviewFruits) as TextView
         val textviewDairy = itemView.findViewById(R.id.textviewDairy) as TextView
         val textviewSpices = itemView.findViewById(R.id.textviewSpices) as TextView
         val textviewPapers_Wraps = itemView.findViewById(R.id.textviewPaper_Wraps) as TextView
         val textviewToiletries = itemView.findViewById(R.id.textviewToiletries) as TextView
         val textviewVegetables = itemView.findViewById(R.id.textviewVegetables) as TextView
         val textviewFrozen_Food = itemView.findViewById(R.id.textviewFrozen_Food) as TextView
         val textviewCanned_Goods = itemView.findViewById(R.id.textviewCanned_Goods) as TextView
     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
         return ViewHolder(v)
     }

     override fun getItemCount(): Int {
         return userList.size
     }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val user: User = userList[position]
       holder.textviewFruits.text = user.Fruits
         holder.textviewDairy.text = user.Dairy
         holder.textviewSpices.text = user.Spices
         holder.textviewPapers_Wraps.text = user.Paper_Wraps
         holder.textviewToiletries.text = user.Toiletries
         holder.textviewVegetables.text = user.Vegetables
         holder.textviewFrozen_Food.text = user.Frozen_Food
         holder.textviewCanned_Goods.text = user.Canned_Goods


     }
 }