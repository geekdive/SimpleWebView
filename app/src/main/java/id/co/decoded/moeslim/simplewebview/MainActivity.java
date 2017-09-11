package id.co.decoded.moeslim.simplewebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wView;
    WebSettings setWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wView = (WebView)findViewById(R.id.webView);

        setWeb = wView.getSettings();
        setWeb.setJavaScriptEnabled(true);

        wView.setWebViewClient(new WebViewClient());
        wView.loadUrl("http://commandxerver.wordpress.com/");
    }
}
