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

        // ��Ŷ���� ����
        webView.setWebViewClient(new WebViewClient());
        // �������� Ŭ����Ʈ ����
        webView.setWebChromeClient(new WebChromeClient());
        NocWebviewSetting = webView.getSettings();
        // �ڹٽ�ũ��Ʈ ��� ����
        NocWebviewSetting.setJavaScriptEnabled(true);
        NocWebviewSetting.setJavaScriptCanOpenWindowsAutomatically(true);
        NocWebviewSetting.setLoadsImagesAutomatically(true);
        NocWebviewSetting.setUseWideViewPort(true);
        NocWebviewSetting.setLoadWithOverviewMode(true);
        // ������ �� ����
        NocWebviewSetting.setBuiltInZoomControls(true);
        //������ ȭ�� ����
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
