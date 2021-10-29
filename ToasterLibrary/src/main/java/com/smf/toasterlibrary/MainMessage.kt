package com.smf.toasterlibrary

import android.content.Context
import android.util.Log
import android.widget.Toast




class MainMessage {

    companion object{
        private  val TAG = "MainMessage"
        fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()

        Log.d(TAG,"myLog:$message")
    }
    }
}