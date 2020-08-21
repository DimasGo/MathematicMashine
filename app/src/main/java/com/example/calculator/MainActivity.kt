package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.calculator.base.Function
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : Function() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ClickButton()
    }
}