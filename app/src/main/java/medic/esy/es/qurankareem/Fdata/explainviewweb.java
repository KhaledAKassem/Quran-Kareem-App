package medic.esy.es.qurankareem.Fdata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

import medic.esy.es.qurankareem.R;

public class explainviewweb extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainviewweb);
        webview=(WebView)findViewById(R.id.webview);
        webview.getSettings().setLoadsImagesAutomatically(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        String data= getIntent().getStringExtra("data");
        webview.loadUrl(data);



    }
}
