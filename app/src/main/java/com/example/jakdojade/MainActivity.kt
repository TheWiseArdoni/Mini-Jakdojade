package com.example.jakdojade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import com.example.jakdojade.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun calculateFare(){
        var destination = binding.textField.text
        val selectedId = binding.discount.checkedRadioButtonId
        val fare: Double = when (destination.toString()) {
                "Gdansk" -> 100.0
                "Krakow" -> 80.0
            else -> 0.0
        }
        val discount: Double= when (selectedId) {
            R.id.option_1 -> 0.20
            R.id.option_2-> 0.18
            else -> 1.0
        }

    }
}