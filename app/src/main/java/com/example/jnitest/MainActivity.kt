package com.example.jnitest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = NDKTools.getStringFromNDK()
        Log.i("gebilaolitou", "text=$text")
        (findViewById(R.id.tv) as TextView).text = text
    }
}
