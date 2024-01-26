package com.example.emergencyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.emergencyapp.databinding.ActivityMainBinding
import com.example.emergencyapp.fragments.CallsFragment
import com.example.emergencyapp.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.numbers -> replaceFragment(CallsFragment())

                else ->{
                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val currentFragment = fragmentManager.findFragmentById(R.id.frame_layout)

        if (fragmentManager.backStackEntryCount >= 1 && fragment is HomeFragment) {
            fragmentManager.popBackStack()
            println("restore")
        } else if (currentFragment is CallsFragment) {
            println("skip")
        } else if (fragment is CallsFragment) {
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.replace(R.id.frame_layout, fragment)
            fragmentTransaction.commit()
            println("save")
        } else {
            fragmentTransaction.replace(R.id.frame_layout, fragment)
            fragmentTransaction.commit()
            println("init")
        }
    }
}