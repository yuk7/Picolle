package com.github.yuk7.picolle.util

import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("onEditor")
fun onEditorAction(view: EditText, listener: TextView.OnEditorActionListener) {
    view.setOnEditorActionListener(listener)
}