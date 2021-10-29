package com.smf.mylibrary

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.smf.toasterlibrary.MainMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainMessage.s(this,"in the lib is called")
    }
}