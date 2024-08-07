package com.pieroap.truxpatitas.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.pieroap.truxpatitas.R
import com.pieroap.truxpatitas.databinding.ActivityTrxpnavigationBinding

class TRXPNavigation : AppCompatActivity() {

    private lateinit var binding: ActivityTrxpnavigationBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrxpnavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    private fun initUi() {
        initNavigation()
    }

    private fun initNavigation() {
        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHost.navController
        binding.bottomNavMainTrxp.setupWithNavController(navController)
    }
}