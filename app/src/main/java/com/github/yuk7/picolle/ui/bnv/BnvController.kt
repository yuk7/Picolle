package com.github.yuk7.picolle.ui.bnv

import androidx.fragment.app.FragmentManager
import com.github.yuk7.picolle.R
import com.github.yuk7.picolle.ui.favorite.FavoriteFragment
import com.github.yuk7.picolle.ui.history.HistoryFragment
import com.github.yuk7.picolle.ui.main.MainFragment
import com.github.yuk7.picolle.ui.setting.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BnvController(private val fm: FragmentManager) {
    val navListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.nav_home -> {
                fm.beginTransaction().replace(R.id.container, MainFragment.newInstance()).commit()
                true
            }
            R.id.nav_favorite -> {
                fm.beginTransaction().replace(R.id.container, FavoriteFragment.newInstance())
                    .commit()
                true
            }
            R.id.nav_history -> {
                fm.beginTransaction().replace(R.id.container, HistoryFragment.newInstance())
                    .commit()
                true
            }
            R.id.nav_settings -> {
                fm.beginTransaction().replace(R.id.container, SettingFragment.newInstance())
                    .commit()
                true
            }
            else -> false
        }
    }
}