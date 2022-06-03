package com.example.firstaplicattion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    public Button ButtonForza6Compra, ButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // Vídeo Settings
        String frameVideo = "<html><body><br><iframe width=\"313\" height=\"143\" src=\"https://www.youtube.com/embed/FYH9n37B7Yw\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
        WebView displayYoutubeVideo  = (WebView) findViewById(R.id.videoGame2);

        displayYoutubeVideo.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = displayYoutubeVideo.getSettings();
        webSettings.setJavaScriptEnabled(true);
        displayYoutubeVideo.loadData(frameVideo, "text/html", "utf-8");

        ButtonForza6Compra = (Button) findViewById(R.id.buttonPurchase);
        ButtonBack = (Button) findViewById(R.id.buttonMinecraft);

        //Método para a mudança de tela
        ButtonForza6Compra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaForzaCompra = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(telaForzaCompra);
            }
        });

        //Método de Volta de tela
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaVolta = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(telaVolta);
            }
        });

    }
}