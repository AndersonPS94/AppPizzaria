package com.example.appdepizzaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var clicked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btAll.setOnClickListener {
            clicked = true
            if (clicked){
                binding.btAll.setBackgoundResource(R.drawable.bg_button_enabled)
                binding.btAll.setTextColor(Color.WHITE)
                binding.btnChicken.setBackgroundResource(R.drawable.bg_button_disabled)
            }
        }
    }
}