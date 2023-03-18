package com.example.a3w15d_manggo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_main)
//-------------스플래쉬 화면 (핸들러 사용)-<1>
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },3000)

    }
}