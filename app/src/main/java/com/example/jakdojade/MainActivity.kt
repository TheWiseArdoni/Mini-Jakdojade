package com.example.jakdojade

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jakdojade.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{calculateFare()}
    }

    private fun calculateFare(){
        var destination = binding.textField.text
        val selectedId = binding.discount.checkedRadioButtonId
        val discount: Double= when (selectedId) {
            R.id.option_1 -> 0.20
            R.id.option_2-> 0.18
            else -> 1.0
        }
        val fare: Double = when (destination.toString()) {
                "Gdansk" -> 100.0 - (100.0 * discount)
                "Krakow" -> 80.0 - (80.0 * discount)
            else -> 0.0
        }
        val stringFare = fare.toString()
        binding.textView.text = getString(R.string.fare_cost, stringFare)
    }


}