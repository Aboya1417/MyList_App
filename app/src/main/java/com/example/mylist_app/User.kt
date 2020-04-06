package com.example.mylist_app

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class User (val Fruits: String, val Dairy: String, val Spices: String, val Paper_Wraps: String, val Toiletries: String, val Vegetables: String, val Frozen_Food: String, val Canned_Goods: String)

@Parcelize
data class Item (
    val name: String,
    val details: String
): Parcelable


