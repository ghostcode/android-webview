package com.example.zhuxinyong.android_webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.mwebview);
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);

        WebView.setWebContentsDebuggingEnabled(true);

        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                Log.e("iwjw============:",url);

                boolean should = super.shouldOverrideUrlLoading(view, url);

                return should;
            }
        });

//        mWebView.loadUrl("file:///android_asset/index.html");
        mWebView.loadUrl("http://cn.bing.com/");
//        String summary = "<html><body><h1>this is iwjw哈哈</h1></body></html>";
//        mWebView.loadData(summary,"text/html;charset=UTF-8",null);
//        mWebView.loadDataWithBaseURL(null,summary,"text/html","UTF-8",null);
    }

}
