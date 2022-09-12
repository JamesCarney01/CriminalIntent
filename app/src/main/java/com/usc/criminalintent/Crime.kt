package com.usc.criminalintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class Crime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    data class Crime(val id: UUID = UUID.randomUUID(),
                     var title: String = "",
                     var date: Date = Date(),
                     var isSolved: Boolean = false)
}


// TODO currently on page/slide 24 chapter 7