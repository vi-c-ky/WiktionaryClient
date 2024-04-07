package com.example.wiktionaryclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    lateinit var myWebView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myWebView = findViewById(R.id.webView)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://en.wiktionary.org")


    }

    override fun onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack()
        }
        else{super.onBackPressed()}

    }
}