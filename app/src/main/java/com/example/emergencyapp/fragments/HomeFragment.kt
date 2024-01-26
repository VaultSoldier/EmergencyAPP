package com.example.emergencyapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.emergencyapp.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val button: Button = view.findViewById(R.id.buttonFire)
        button.setOnClickListener {
            // Call a function to open Fragment
            openFireFragment()
        }

        val button1: Button = view.findViewById(R.id.button1)
        button1.setOnClickListener {
            button1()
        }

        return view
    }

    private fun openFireFragment() {
        val fireFrag = FireFragment()

        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fireFrag)
        transaction.addToBackStack(null) // Optional: Add the transaction to the back stack
        transaction.commit()
    }

    private fun button1() {
        val openButton1 = Button1Fragment()

        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, openButton1)
        transaction.addToBackStack(null) // Optional: Add the transaction to the back stack
        transaction.commit()
    }
}