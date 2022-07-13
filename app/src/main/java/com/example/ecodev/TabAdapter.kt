package com.example.ecodev

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

internal class TabAdapter(
    var context: Context,
    fragmentManager: FragmentManager,
    var totalTabs: Int
) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> DiaryFragment()
            1 -> RecipeFragment()
            2 -> MainFragment()
            3 -> WaterFragment()
            4 -> ProfileFragment()
            else -> getItem(position)
        }
    }

}