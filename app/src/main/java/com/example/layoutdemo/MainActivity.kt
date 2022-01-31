package com.example.layoutdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickButton(view: View) {
        // Get user input from the EditTexts
        val name = person_name.text
        val luckyNumber = lucky_number.text.toString().toInt()

        // Hide the keyboard
        lucky_number.hideKeyboard()

        // Clear the EditTexts
        person_name.text.clear()
        lucky_number.text.clear()

        // Finally display the information
        result.text = "Hello $name, your lucky number is $luckyNumber"
        
    }

    private fun View.hideKeyboard() {
        val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    }

}