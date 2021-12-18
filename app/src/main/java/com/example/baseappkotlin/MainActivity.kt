package com.example.baseappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn : Button
        var txt : TextView

        btn = findViewById(R.id.myBtn)
        txt = findViewById(R.id.myTxt)

        btn.setOnClickListener{
            txt.setText(getString(R.string.txt_after))
        }
    }
}