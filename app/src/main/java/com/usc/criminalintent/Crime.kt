package com.usc.criminalintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class Crime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container)

    if (currentFragment == null) {
        val fragment = CrimeFragment()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, fragment)
            .commit()
        }
    }

    data class Crime(val id: UUID = UUID.randomUUID(),
                     var title: String = "",
                     var date: Date = Date(),
                     var isSolved: Boolean = false)
}


// TODO currently on page/slide 24 chapter 7