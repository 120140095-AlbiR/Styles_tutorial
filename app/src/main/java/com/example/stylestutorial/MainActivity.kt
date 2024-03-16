package com.example.stylestutorial

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        updateCount()

    }

    private fun updateCount() {
        textView.text = count.toString()
    }

    fun increment(view: View) {
        count++
        updateCount()
    }

    fun decrement(view: View) {
        count--
        updateCount()
    }

    fun reset(view: View) {
        count = 0
        updateCount()
    }
}
