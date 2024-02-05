package com.example.emergencyapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.emergencyapp.R
import com.example.emergencyapp.ViewPagerAdapter
import me.relex.circleindicator.CircleIndicator3

class DefinitionsFragment : Fragment() {

    private lateinit var titlesList: MutableList<String>
    private lateinit var descList: MutableList<String>
    private lateinit var imagesList: MutableList<Int>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_swipe_view, container, false)

        // Initialize your lists and populate them
        titlesList = mutableListOf()
        descList = mutableListOf()
        imagesList = mutableListOf()

        // Add data to your lists (you can use your existing methods)
        addDataToList()

        // Find ViewPager2 and CircleIndicator3
        val viewPager2: ViewPager2 = rootView.findViewById(R.id.view_pager2)
        val indicator: CircleIndicator3 = rootView.findViewById(R.id.indicator)

        // Set up the adapter for ViewPager2
        viewPager2.adapter = ViewPagerAdapter(titlesList, descList, imagesList)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // Link ViewPager2 to CircleIndicator3
        indicator.setViewPager(viewPager2)

        return rootView
    }

    private fun addDataToList() {

        val titleOne = getString(R.string.h1)
        val textOne = getString(R.string.h1_text)

        val titleTwo = getString(R.string.h2)
        val textTwo = getString(R.string.h2_text)
        val textTwoOne = getString(R.string.h2_1_text)
        val textTwoTwo = getString(R.string.h2_2_text)

        titlesList.add(titleOne)
        descList.add(textOne)
        imagesList.add(R.drawable.siren)


        titlesList.add(titleTwo)
        descList.add(textTwo)
        imagesList.add(R.drawable.emergency)

        titlesList.add(titleTwo)
        descList.add(textTwoOne)
        imagesList.add(R.drawable.emergency)

        titlesList.add(titleTwo)
        descList.add(textTwoTwo)
        imagesList.add(R.drawable.emergency)
    }
}
