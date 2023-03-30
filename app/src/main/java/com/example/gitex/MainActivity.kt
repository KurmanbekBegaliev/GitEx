package com.example.gitex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("this is contained in my second commit")
        println("Local change 4")
        println("THIS LINE WILL BE MERGED")
        println("hello from your friend")
    }
}