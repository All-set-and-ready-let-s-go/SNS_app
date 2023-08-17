package com.example.TakeMeWithYou

import android.content.Intent
import android.icu.number.Scale.none
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage_activity)
        overridePendingTransition(R.anim.from_up_enter, R.anim.none)

        val bottomnavi = findViewById<BottomNavigationView>(R.id.mainPageBottomNavigationView)
        bottomnavi.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_detail -> {
                    startActivity(Intent(this, DetailPage::class.java))
                    true
                }
                R.id.menu_main -> {
                    startActivity(Intent(this, MainPageActivity::class.java))
                    true

                }
                R.id.menu_myPage -> {
                    startActivity(Intent(this, MyPageActivity::class.java))
                    true
                }
                else -> false
            }
        }




    }
}


