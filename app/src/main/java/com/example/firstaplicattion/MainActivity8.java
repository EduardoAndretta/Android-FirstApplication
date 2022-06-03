package com.example.firstaplicattion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    public Button ButtonJustDance2021Compra, ButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        // Vídeo Settings
        String frameVideo = "<html><body><br><iframe width=\"313\" height=\"143\" src=\"https://www.youtube.com/embed/0ZI2pwt6kOI\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
        WebView displayYoutubeVideo  = (WebView) findViewById(R.id.videoGame3);

        displayYoutubeVideo.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = displayYoutubeVideo.getSettings();
        webSettings.setJavaScriptEnabled(true);
        displayYoutubeVideo.loadData(frameVideo, "text/html", "utf-8");

        ButtonJustDance2021Compra = (Button) findViewById(R.id.buttonPurchase);
        ButtonBack = (Button) findViewById(R.id.buttonBack);

        //Método para a mudança de tela
        ButtonJustDance2021Compra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaJustDance2021Compra = new Intent(MainActivity8.this, MainActivity9.class);
                startActivity(telaJustDance2021Compra);
            }
        });

        //Método de Volta de tela
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaVolta = new Intent(MainActivity8.this, MainActivity.class);
                startActivity(telaVolta);
            }
        });
    }
}