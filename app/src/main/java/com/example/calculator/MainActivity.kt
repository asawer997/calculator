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

        when{
            inputNumber.matches("[0-7]+".toRegex()) -> {
                // octal to binary conversion
                val decimal = Integer.parseInt(inputNumber, 8)
                binding.resultTextView.text = "Binary: ${Integer.toBinaryString(decimal)}"
            }
            inputNumber.matches("[01]+".toRegex()) -> {
                // already binary
                binding.resultTextView.text = "Binary: $inputNumber"
            }
            inputNumber.matches("[0-9]+".toRegex()) -> {
                // decimal to binary conversion
                val decimal = Integer.parseInt(inputNumber, 10)
                binding.resultTextView.text = "Binary: ${Integer.toBinaryString(decimal)}"
            }
            else -> {
                // hex to binary conversion
                val decimal = Integer.parseInt(inputNumber, 16)
                binding.resultTextView.text = "Binary: ${Integer.toBinaryString(decimal)}"
            }
        }
    }

    fun onDecimalConvertButtonClick(view: View) {
        val inputNumber = binding.numberInputEditText.text.toString()

        when{
            inputNumber.matches("[0-7]+".toRegex()) -> {
                // octal to decimal conversion
                val decimal = Integer.parseInt(inputNumber, 8)
                binding.resultTextView.text = "Decimal: $decimal"
            }
            inputNumber.matches("[01]+".toRegex()) -> {
                // binary to decimal conversion
                val decimal = Integer.parseInt(inputNumber, 2)
                binding.resultTextView.text = "Decimal: $decimal"
            }
            inputNumber.matches("[0-9A-Fa-f]+".toRegex()) -> {
                // hexadecimal to decimal conversion
                val decimal = Integer.parseInt(inputNumber, 16)
                binding.resultTextView.text = "Decimal: $decimal"
            }
            else -> {
                // already decimal
                binding.resultTextView.text = "Decimal: $inputNumber"
            }
        }
    }

    fun onHexaConvertButtonClick(view: View) {
        val inputNumber = binding.numberInputEditText.text.toString()
        when{
            inputNumber.matches("[0-7]+".toRegex()) -> {
                // octal to hex conversion
                val decimal = Integer.parseInt(inputNumber, 8)
                binding.resultTextView.text = "Hexadecimal: ${Integer.toHexString(decimal).uppercase()}"
            }
            inputNumber.matches("[01]+".toRegex()) -> {
                // binary to hex conversion
                val decimal = Integer.parseInt(inputNumber, 2)
                binding.resultTextView.text = "Hexadecimal: ${Integer.toHexString(decimal).uppercase()}"
            }
            inputNumber.matches("[0-9]+".toRegex()) -> {
                // decimal to hex conversion
                val decimal = Integer.parseInt(inputNumber, 10)
                binding.resultTextView.text = "Hexadecimal: ${Integer.toHexString(decimal).uppercase()}"
            }
            else -> {
                // already hex
                binding.resultTextView.text = "Hexadecimal: ${inputNumber.uppercase()}"
            }
        }
    }

    fun onOctalConvertButtonClick(view: View) {
        val inputNumber = binding.numberInputEditText.text.toString()
        when {
            inputNumber.matches("[0-7]+".toRegex()) -> {
                // already octal
                binding.resultTextView.text = "Octal: $inputNumber"
            }
            inputNumber.matches("[01]+".toRegex()) -> {
                // binary to octal conversion
                val decimal = Integer.parseInt(inputNumber, 2)
                binding.resultTextView.text = "Octal: ${Integer.toOctalString(decimal)}"
            }
            inputNumber.matches("[0-9]+".toRegex()) -> {
                // decimal to octal conversion
                val decimal = Integer.parseInt(inputNumber, 10)
                binding.resultTextView.text = "Octal: ${Integer.toOctalString(decimal)}"
            }
            else -> {
                // hex to octal conversion
                val decimal = Integer.parseInt(inputNumber, 16)
                binding.resultTextView.text = "Octal: ${Integer.toOctalString(decimal)}"
            }
        }
    }

    fun onClearButtonClick(view: View) {
        binding.numberInputEditText.text.clear()
        binding.resultTextView.text = ""
    }


}