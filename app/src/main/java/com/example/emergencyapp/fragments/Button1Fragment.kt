package com.example.emergencyapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.emergencyapp.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Button1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find ViewPager2 and TabLayout
        val viewPager2: ViewPager2 = view.findViewById(R.id.view_pager2_1)
        val tabLayout: TabLayout = view.findViewById(R.id.tabs)

        // Set up the adapter for ViewPager2
        val adapter = SimpleFragmentPagerAdapter(childFragmentManager, lifecycle) // Added lifecycle parameter
        viewPager2.adapter = adapter

        // Connect ViewPager2 to TabLayout
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> tab.text = "ПМП"
                1 -> tab.text = "СЛР"
                2 -> tab.text = "Messages"
                else -> tab.text = "Tab $position" // Handle additional positions if needed
            }
        }.attach()
    }
}

