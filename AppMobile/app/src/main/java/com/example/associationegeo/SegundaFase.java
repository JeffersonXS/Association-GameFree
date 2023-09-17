package com.example.associationegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SegundaFase extends AppCompatActivity {

    public ImageButton imgBtnVoltar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_fase);

        this.imgBtnVoltar2 = (ImageButton)this.findViewById(R.id.imgBtnVoltar2);
        this.imgBtnVoltar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SegundaFase.this.openGuiaMapa();
            }
        });
    }

    private void openGuiaMapa() {
        Intent intent = new Intent(this, GuiaMapa.class);
        this.startActivity(intent);
    }
}