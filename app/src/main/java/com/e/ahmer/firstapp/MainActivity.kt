package com.e.ahmer.firstapp

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //craete web view for harry websites
        val Webviewvar= findViewById<WebView>(R.id.webview)
        webviewsetup(Webviewvar)
    }
    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webviewsetup(A: WebView){
        A.webViewClient= WebViewClient()
        A.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.codewithharry.com")
        }
    }
}