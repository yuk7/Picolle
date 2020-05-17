package com.github.yuk7.picolle.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.yuk7.picolle.R
import com.github.yuk7.picolle.ui.main.bnv.BnvController
import com.github.yuk7.picolle.ui.main.main.MainFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation_view.setOnNavigationItemSelectedListener(
            BnvController(
                supportFragmentManager
            ).navListener
        )

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
