package com.henriette.mtranquility.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.henriette.mtranquility.LogInActivity
import com.henriette.mtranquility.databinding.ActivityMainBinding
import com.henriette.mtranquility.databinding.ActivitySignUpBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        binding.btnSignUp?.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btnLogIn?.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java )
            startActivity(intent)
            finish()
        }


    }

    }

