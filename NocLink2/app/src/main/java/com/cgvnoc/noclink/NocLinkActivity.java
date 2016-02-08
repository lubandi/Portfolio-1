package com.cgvnoc.noclink;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class NocLinkActivity extends Activity {

    String NocUrl = "http://cgvnoc.cj.net:8288/Screen/FullScreenSchedule_TL.aspx";

    private WebSettings NocWebviewSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_noc_link);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        WebView webView = (WebView) findViewById(R.id.NocLinkView);

        // 웹킷엔진 설정
        webView.setWebViewClient(new WebViewClient());
        // 웹브라우저 클리언트 설정
        webView.setWebChromeClient(new WebChromeClient());
        NocWebviewSetting = webView.getSettings();
        // 자바스크립트 사용 설정
        NocWebviewSetting.setJavaScriptEnabled(true);
        NocWebviewSetting.setJavaScriptCanOpenWindowsAutomatically(true);
        NocWebviewSetting.setLoadsImagesAutomatically(true);
        NocWebviewSetting.setUseWideViewPort(true);
        NocWebviewSetting.setLoadWithOverviewMode(true);
        // 브라우저 줌 설정
        NocWebviewSetting.setBuiltInZoomControls(true);
        //브라우저 화면 구성
        NocWebviewSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);



        webView.loadUrl(NocUrl);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_noc_link, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    class NocWebview extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }
    }
}
