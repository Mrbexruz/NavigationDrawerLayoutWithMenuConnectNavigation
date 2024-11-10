package com.example.navigationdrawerlayoutwithmenuconnectnavigation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.navigationdrawerlayoutwithmenuconnectnavigation.databinding.ActivityMainBinding
import com.example.navigationdrawerlayoutwithmenuconnectnavigation.fragments.HomeFragment
import com.example.navigationdrawerlayoutwithmenuconnectnavigation.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val homeFragment = HomeFragment()
        val settingsFragment = SettingsFragment()

        supportFragmentManager.beginTransaction()
            .add(R.id.my_container, homeFragment)
            .commit()

        binding.myNavigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home ->{
                    supportFragmentManager.beginTransaction().replace(R.id.my_container, homeFragment).commit()

                }
                R.id.menu_settings ->{
                    supportFragmentManager.beginTransaction().replace(R.id.my_container, settingsFragment).commit()
                }
            }
            binding.myDrawerLayout.closeDrawers()
            true
        }
    }
}