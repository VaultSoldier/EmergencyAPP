package com.example.emergencyapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.emergencyapp.R

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

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

        return view
    }

    private fun openFireFragment() {
        val fireFrag = FireFragment()


        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fireFrag)
        transaction.addToBackStack(null) // Optional: Add the transaction to the back stack
        transaction.commit()
    }
}