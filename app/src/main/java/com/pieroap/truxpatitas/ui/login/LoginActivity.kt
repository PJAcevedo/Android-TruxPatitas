package com.pieroap.truxpatitas.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pieroap.truxpatitas.R
import com.pieroap.truxpatitas.databinding.ActivityLoginBinding
import com.pieroap.truxpatitas.ui.home.TRXPNavigation

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, TRXPNavigation::class.java)
            startActivity(intent)
            finish()
        }
    }
}