package com.example.firstaplicattion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.view.textclassifier.TextClassifierEvent;
import android.widget.ActionMenuView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button ButtonGTAV, ButtonForza, ButtonMinecraft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonGTAV = (Button) findViewById(R.id.buttonGTAV);
        ButtonForza = (Button) findViewById(R.id.buttonForza);
        ButtonMinecraft = (Button) findViewById(R.id.buttonMinecraft);

        ButtonGTAV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaGTAV = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(telaGTAV);
            }

        });

        ButtonForza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaForza = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(telaForza);
            }

        });

        ButtonMinecraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaMinecraft = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(telaMinecraft);
            }

        });

    }






}