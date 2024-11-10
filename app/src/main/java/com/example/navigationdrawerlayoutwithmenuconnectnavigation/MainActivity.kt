package com.example.navigationdrawerlayoutwithmenuconnectnavigation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
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

        val navController = findNavController(R.id.my_navigation_host)
        binding.myNavigationView.setupWithNavController(navController)
    }
}