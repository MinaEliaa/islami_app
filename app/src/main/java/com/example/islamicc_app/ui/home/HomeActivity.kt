package com.example.islamicc_app.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.islamicc_app.R
import com.example.islamicc_app.ui.home.fragments.HadeethFragment
import com.example.islamicc_app.ui.home.fragments.QuranFragment
import com.example.islamicc_app.ui.home.fragments.RadioFragment
import com.example.islamicc_app.ui.home.fragments.TasbeehFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarMenu
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {

    lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNavigation = findViewById(R.id.bottom_navigation_bar)
        bottomNavigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { menuItem ->

            if (menuItem.itemId == R.id.navigation_quran) {
                PushFragment(QuranFragment())
            } else if (menuItem.itemId == R.id.navigation_hadeth) {
                PushFragment(HadeethFragment())
            } else if (menuItem.itemId == R.id.navigation_tasbeeh) {
                PushFragment(TasbeehFragment())
            } else if (menuItem.itemId == R.id.navigation_radio) {
                PushFragment(RadioFragment())
            }
            return@OnItemSelectedListener true
        })
        bottomNavigation.selectedItemId = R.id.navigation_quran
    }

    private fun PushFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}