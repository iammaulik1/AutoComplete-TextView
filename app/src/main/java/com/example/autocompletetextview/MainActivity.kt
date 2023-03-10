package com.example.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autoTextView = findViewById<AutoCompleteTextView>(R.id.autoTextView)
        val languages = resources.getStringArray(R.array.Languages)
        val button = findViewById<Button>(R.id.button)
        if (button != null) {
            button?.setOnClickListener(View.OnClickListener {
                val enteredText = getString(R.string.submitted_language) + "" + autoTextView.getText()
                Toast.makeText(this@MainActivity, enteredText, Toast.LENGTH_SHORT).show()


            })

            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
            autoTextView.setAdapter(adapter)


        }
    }
}