package com.example.associationegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PrimeiraFase extends AppCompatActivity {

    public ImageButton imgBtnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_fase);

        this.imgBtnVoltar = (ImageButton)this.findViewById(R.id.imgBtnVoltar);
        this.imgBtnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PrimeiraFase.this.openGuiaMapa();
            }
        });
    }

    private void openGuiaMapa() {
        Intent intent = new Intent(this, GuiaMapa.class);
        this.startActivity(intent);
    }
}