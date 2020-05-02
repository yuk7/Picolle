package com.github.yuk7.picolle.ui.main

import android.content.SharedPreferences
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val searchWord = MutableLiveData<String>()

    init {
        searchWord.value = ""
    }

    val onEdit = TextView.OnEditorActionListener { _, actionId, _ ->
        when (actionId) {
            EditorInfo.IME_ACTION_DONE,
            EditorInfo.IME_ACTION_SEARCH -> {
                //TODO: Write here on Search Action
                true
            }
            else -> false
        }
    }
}
