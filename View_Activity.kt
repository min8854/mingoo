package com.example.a3w15d_manggo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class View_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        intent.getStringExtra("url")

        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl(intent.getStringExtra("url").toString())
    }
}