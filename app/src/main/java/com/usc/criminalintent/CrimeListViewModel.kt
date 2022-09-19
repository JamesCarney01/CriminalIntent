package com.usc.criminalintent

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    private val crimeListViewModel: CrimeListViewModel by lazy {
        viewModelProvider(this).get(CrimeListViewModel::class.java)
    }
    
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Total crimes: ${crimeListViewModel.crimes.size}")
    }
    
    companion object {
        fun newInstance(): CrimeListFragment {
            return CrimeListFragment()
        }
    }
    
    val crimes = mutableListOf<Crime>()
    
    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime
        }
    }
    
}