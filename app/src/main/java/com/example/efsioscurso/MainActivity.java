package com.example.efsioscurso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt_ciencdanat;
    Button bt_cienchuman;
    Button bt_matemat;
    Button bt_redacao;
    Button bt_lingcod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_ciencdanat = findViewById(R.id.bt_ciencnat);
        bt_cienchuman = findViewById(R.id.bt_cienchumanas);
        bt_matemat = findViewById(R.id.bt_mat);
        bt_redacao = findViewById(R.id.bt_redacao);
        bt_lingcod = findViewById(R.id.bt_lingcodetec);
        bt_ciencdanat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CienciasdaNatureza.class);
                startActivity(i);
            }
        });
        bt_cienchuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CienciasHumanas.class);
                startActivity(i);
            }
        });
        bt_matemat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Matematica.class);
                startActivity(i);
            }
        });
        bt_redacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Redacao.class);
                startActivity(i);
            }
        });
        bt_lingcod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Linguagem.class);
                startActivity(i);
            }
        });
    }
}