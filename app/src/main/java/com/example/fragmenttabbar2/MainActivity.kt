package com.example.fragmenttabbar2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import androidx.core.content.res.ResourcesCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import example.fragmentstabbarttutorial.TabPageAdapter
import java.text.FieldPosition

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myTextView.typeface = ResourcesCompat.getFont(this, R.font.best)
        myTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50.toFloat())
        setUpTabBar()
    }
    private fun setUpTabBar()
    {

        val adapter = TabPageAdapter(this, tabLayout.tabCount)
        viewPager.adapter = adapter

        viewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback()
        {
            override fun onPageSelected(position: Int)
            {
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })
        tab.Layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener)
        {
            override fun onTabSelected(tab: TabLayout.Tab)
            {
                viewPager.currentItem = tab.position
            }
        }
    }
}