package com.example.associationegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GuiaMapa extends AppCompatActivity {

    public ImageButton imgBtnFase1, imgBtnFase2, imgBtnFase3, imgBtnHomeG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia_mapa);

        this.imgBtnFase1 = (ImageButton)this.findViewById(R.id.imgBtnFase1);
        this.imgBtnFase1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                GuiaMapa.this.openPrimeiraFase();
            }
        });

        this.imgBtnFase2 = (ImageButton)this.findViewById(R.id.imgBtnFase2);
        this.imgBtnFase2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                GuiaMapa.this.openSegundaFase();
            }
        });

        this.imgBtnFase3 = (ImageButton)this.findViewById(R.id.imgBtnFase3);
        this.imgBtnFase3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                GuiaMapa.this.openTerceiraFase();
            }
        });

        this.imgBtnHomeG = (ImageButton)this.findViewById(R.id.imgBtnHomeG);
        this.imgBtnHomeG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                GuiaMapa.this.openMainActivity();
            }
        });
    }

    private void openPrimeiraFase() {
        Intent intent = new Intent(this, PrimeiraFase.class);
        this.startActivity(intent);
    }

    private void openSegundaFase() {
        Intent intent = new Intent(this, SegundaFase.class);
        this.startActivity(intent);
    }

    private void openTerceiraFase() {
        Intent intent = new Intent(this, TerceiraFase.class);
        this.startActivity(intent);
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}