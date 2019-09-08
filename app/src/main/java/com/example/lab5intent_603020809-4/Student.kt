package com.example.lab5intent_6030217213

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
    data class Student(val id: String, val gender:String, val name: String, val age: Int) : Parcelable {

}