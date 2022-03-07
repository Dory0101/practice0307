package com.example.practice0307

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.practice0307.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun bmi(view: View) {
        var height = binding.edHeight.text.toString().toFloat()
        var weight = binding.edWeight.text.toString().toFloat()
        var bmi = weight/(height*height)
        Log.d("MainActivity","bmi is $bmi")
        Toast.makeText(this, "Your BMI is $bmi", Toast.LENGTH_LONG).show()
    }

    fun help(view: View) {
    }
}