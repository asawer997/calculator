package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onBinaryConvertButtonClick(view: View) {
        val inputNumber = binding.numberInputEditText.text.toString()

        // Convert to binary
        val binaryResult = Integer.toBinaryString(inputNumber.toInt())
        binding.resultTextView.text = "Binary: $binaryResult"
    }

    fun onDecimalConvertButtonClick(view: View) {
        val inputNumber = binding.numberInputEditText.text.toString()

        // Display input as decimal
        binding.resultTextView.text = "Decimal: $inputNumber"
    }

    fun onHexaConvertButtonClick(view: View) {
        val inputNumber = binding.numberInputEditText.text.toString()

        // Convert to hexadecimal
        val hexadecimalResult = Integer.toHexString(inputNumber.toInt()).toUpperCase()
        binding.resultTextView.text = "Hexadecimal: $hexadecimalResult"
    }

    fun onOctalConvertButtonClick(view: View) {
        val inputNumber = binding.numberInputEditText.text.toString()
        val octalResult = Integer.toOctalString(inputNumber.toInt())
        binding.resultTextView.text = "Octal: $octalResult"
    }

    fun onClearButtonClick(view: View) {
        binding.numberInputEditText.text.clear()
        binding.resultTextView.text = ""
    }

//    fun determineInputFormat(view: View) {
//        val inputNumber = binding.numberInputEditText.text.toString()
//        val decimalRegex = "^-?[0-9]+$".toRegex()
//        val hexRegex = "^-?0[xX][0-9a-fA-F]+$".toRegex()
//        val binaryRegex = "^-?[01]+$".toRegex()
//        val octalRegex = "^-?[0-7]+$".toRegex()
//        when {
//            inputNumber.matches(decimalRegex) -> onDecimalButtonClick(view,inputNumber)
//            inputNumber.matches(hexRegex) -> onHexadecimalButtonClick(view,inputNumber)
//            inputNumber.matches(binaryRegex) -> onBinaryButtonClick(view,inputNumber)
//            inputNumber.matches(octalRegex) -> onOctalButtonClick(view,inputNumber)
//            else -> "unknown"
//        }
//    }


}