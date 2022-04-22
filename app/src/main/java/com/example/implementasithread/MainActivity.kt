package com.example.implementasithread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startThread(view: View):Unit{
        val runnable = ExcampleThread(10)
        Thread(runnable).start()
    }
}