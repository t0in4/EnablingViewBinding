package com.eyehail.enablingviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.eyehail.enablingviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       /* binding.convert.setOnClickListener {
            convertCurrency()
        }*/

    }
//in design mode i had choose an onClick method and in show down menu mark convertCurrency
    // i suppose it is bcz convertCurrency has an argument (view:View) from box
    // if there will be no argument i shall point to this function in onCreate function
    fun convertCurrency(view: View) {
        if (binding.dollarText.text.isNotEmpty()) {
            val dollarValue = binding.dollarText.text.toString().toFloat()

            val euroValue = dollarValue * 0.85f
            binding.textView.text = euroValue.toString()
        } else {
            binding.textView.text = getString(R.string.no_value_string)
        }
    }
}