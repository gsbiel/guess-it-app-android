package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController

class ScoreViewModel(finalScore: Int): ViewModel() {

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    init{
        Log.i("ScoreViewModel", "Final Score is $finalScore")
        _eventPlayAgain.postValue(false)
    }

    fun onPlayAgain() {
        _eventPlayAgain.postValue(true)
    }

    fun onPlayAgainEventComplete() {
        _eventPlayAgain.postValue(false)
    }
}