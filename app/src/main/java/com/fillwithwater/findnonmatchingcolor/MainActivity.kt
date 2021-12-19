package com.fillwithwater.findnonmatchingcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        webView = findViewById<WebView>(R.id.webview)
        webView.settings.javaScriptEnabled = true
    }

    override fun onResume() {
        super.onResume()
        webView.loadUrl("https://find-nonmatching-color.netlify.app/")
    }


}