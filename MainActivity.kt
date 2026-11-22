package com.sysguineki.app

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.webViewClient = WebViewClient()
        val serverUrl = "https://SEU-DOMINIO-AQUI"
        if (serverUrl.contains("SEU-DOMINIO-AQUI")) {
            val message = TextView(this)
            message.text = "SYSGUINEKI\n\nO aplicativo Android está pronto para configurar. Falta publicar o sistema online e colocar aqui o endereço do servidor."
            message.textSize = 20f
            message.setPadding(32, 48, 32, 32)
            setContentView(message)
        } else {
            setContentView(web)
            web.loadUrl(serverUrl)
        }
    }
}
