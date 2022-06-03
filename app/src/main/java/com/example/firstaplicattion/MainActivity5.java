package com.example.firstaplicattion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    public Button ButtonUp, ButtonDown, ButtonBack;
    public TextView textViewValor, textViewQuantidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textViewValor = findViewById(R.id.valor);
        textViewQuantidade = findViewById(R.id.quantidade);
        ButtonUp = (Button) findViewById(R.id.buttonAumentar);
        ButtonDown = (Button) findViewById(R.id.buttonDiminuir);
        ButtonBack = (Button) findViewById(R.id.buttonMinecraft);

        //Método para a mudança de tela
        ButtonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                String valor = textViewValor.getText().toString();
                String quantidade = textViewQuantidade.getText().toString();

                float valorFloat = Float.parseFloat(valor);
                int quantidadeInt = Integer.parseInt(quantidade);

                valor = String.valueOf(valorFloat + 53.00);
                quantidade = String.valueOf(quantidadeInt + 1);

                textViewQuantidade.setText(valor);
                textViewValor.setText(quantidade);
            }
        });

        ButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                String valor = textViewValor.getText().toString();
                String quantidade = textViewQuantidade.getText().toString();

                float valorFloat = Float.parseFloat(valor);
                int quantidadeInt = Integer.parseInt(quantidade);

                if(valorFloat > 53.00 && quantidadeInt > 1){

                    valor = String.valueOf(valorFloat - 53.00);
                    quantidade = String.valueOf(quantidadeInt - 1);

                    textViewQuantidade.setText(valor);
                    textViewValor.setText(quantidade);
                }
            }
        });

        //Método de Volta de tela
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent telaVolta = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(telaVolta);
            }
        });






    }
}