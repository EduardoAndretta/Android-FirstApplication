package com.example.firstaplicattion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    public Button ButtonGTAVCompra, ButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Vídeo Settings
        String frameVideo = "<html><body><br><iframe width=\"313\" height=\"143\" src=\"https://www.youtube.com/embed/QkkoHAzjnUs\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
        WebView displayYoutubeVideo  = (WebView) findViewById(R.id.videoGame0);

        displayYoutubeVideo.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = displayYoutubeVideo.getSettings();
        webSettings.setJavaScriptEnabled(true);
        displayYoutubeVideo.loadData(frameVideo, "text/html", "utf-8");

        ButtonGTAVCompra = (Button) findViewById(R.id.buttonPurchase);
        ButtonBack = (Button) findViewById(R.id.buttonMinecraft);

        //Método para a mudança de tela
        ButtonGTAVCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaGTAVCompra = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(telaGTAVCompra);
            }
        });

        //Método de Volta de tela
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaVolta = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(telaVolta);
            }
        });
    }
}