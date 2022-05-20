package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.core.graphics.component3

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        genTextViewInfo()
    }

    private fun genTextViewInfo() {
        val appInfo = buildString {
            append(BuildConfig.BUILD_TYPE)
            append("; ")
            append(BuildConfig.FLAVOR)
            append("; ")
            append(BuildConfig.VERSION_NAME)
            append("; ")
            append(BuildConfig.BASE_URL)
        }
        val textView = findViewById<TextView>(R.id.textView2)
        textView.text = appInfo
        Log.d("MainActivity", appInfo)
    }
}