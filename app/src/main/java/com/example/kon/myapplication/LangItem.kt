package com.example.kon.myapplication

import android.graphics.Bitmap

data class LangItem(val name: String, val author: String = "Rob Johns", val year: Int = 1997, val paradigm: String = "object-oriented", val logo: Bitmap, val site: String) {

}