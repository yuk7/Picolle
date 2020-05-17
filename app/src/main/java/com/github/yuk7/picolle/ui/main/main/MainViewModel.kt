package com.github.yuk7.picolle.ui.main.main


import android.app.Activity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.yuk7.picolle.ui.search.SearchActivity
import kotlin.reflect.KClass

class MainViewModel : ViewModel() {
    val searchWord = MutableLiveData<String>()
    val onStartActivity = MutableLiveData<Pair<Activity, Bundle?>>()

    init {
        searchWord.value = ""
    }

    val onEdit = TextView.OnEditorActionListener { _, actionId, _ ->
        when (actionId) {
            EditorInfo.IME_ACTION_DONE,
            EditorInfo.IME_ACTION_SEARCH -> {
                val bundle = Bundle()
                bundle.putString("word", searchWord.value)
                onStartActivity.value = Pair(SearchActivity.newInstance(), bundle)
                true
            }
            else -> false
        }
    }
}
