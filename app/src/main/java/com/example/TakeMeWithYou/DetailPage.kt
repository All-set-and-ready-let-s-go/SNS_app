package com.example.TakeMeWithYou

import android.content.ClipData.Item
import android.content.Intent
import android.icu.number.Scale.none
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class DetailPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_page_activity)
        setCustomToolbar(R.id.toolbar)

        overridePendingTransition(R.anim.from_left_enter, R.anim.none);

        val bottomnavi = findViewById<BottomNavigationView>(R.id.bn_)
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

    // 메뉴 아이템 툴바에 집어 넣기
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }
    private fun setCustomToolbar(layout: Int){
        val toolbar = findViewById<Toolbar>(layout)
        // 툴바를 액션바로 지정
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        // 액션바에서 앱 이름 보이지 않게 지정
        actionBar?.setDisplayShowCustomEnabled(false)
    }
}
