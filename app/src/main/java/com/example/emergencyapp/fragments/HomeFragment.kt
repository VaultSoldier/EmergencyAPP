package com.example.emergencyapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.emergencyapp.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val button: CardView = view.findViewById(R.id.buttonFire)
        button.setOnClickListener {
            // Call a function to open Fragment
            openFireFragment()
        }

        val button1: CardView = view.findViewById(R.id.button_1)
        button1.setOnClickListener {
            button1()
        }

        val button2: CardView = view.findViewById(R.id.button_2)
        button2.setOnClickListener {
            button2()
        }

        val button3: CardView = view.findViewById(R.id.button_3)
        button3.setOnClickListener {
            button3()
        }

        return view
    }

    private fun openFireFragment() {
        val fireFrag = Button0Fragment()

        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fireFrag)
        transaction.addToBackStack(null) // Optional: Add the transaction to the back stack
        transaction.commit()
    }

    private fun button1() {
        val openButton1 = Button1Fragment()

        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, openButton1)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun button2() {
        val openButton2 = Button2Fragment()

        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, openButton2)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun button3() {
        val openButton3 = Button3Fragment()

        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, openButton3)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}