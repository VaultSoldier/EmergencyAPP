package com.example.emergencyapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.emergencyapp.R
import com.example.emergencyapp.ViewPagerAdapter
import me.relex.circleindicator.CircleIndicator3

class Button1Fragment : Fragment() {

    private lateinit var titlesList: MutableList<String>
    private lateinit var descList: MutableList<String>
    private lateinit var imagesList: MutableList<Int>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_swipe_view, container, false)

        titlesList = mutableListOf()
        descList = mutableListOf()
        imagesList = mutableListOf()

        addDataToList()

        val viewPager2: ViewPager2 = rootView.findViewById(R.id.view_pager2)
        val indicator: CircleIndicator3 = rootView.findViewById(R.id.indicator)

        viewPager2.adapter = ViewPagerAdapter(titlesList, descList, imagesList)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        indicator.setViewPager(viewPager2)

        return rootView
    }

    private fun addDataToList() {
        val titleOne = getString(R.string.h2)
        val textOne = getString(R.string.h2_text)

        titlesList.add(titleOne)
        descList.add(textOne)
        imagesList.add(R.drawable.first_aid1_1)

    }

}

