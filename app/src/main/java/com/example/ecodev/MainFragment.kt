package com.example.ecodev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_main, container, false)

        val url: String = "https://tgapp.devtest.xyz/web-app"
        val view: WebView = rootView.findViewById(R.id.webView)
        view.settings.javaScriptEnabled = true
        view.loadUrl(url)
        return rootView
    }

}