package com.example.armandoedge.a41keyboarsamples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showText(view: View) {
        val editText = findViewById<View>(R.id.editText_main) as EditText
        if (editText != null) {
            val showString = editText.text.toString()
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show()
        }
    }
}
