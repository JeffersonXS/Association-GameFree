package com.example.associationegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button idBtnHis, idBtnGuia, idBtnDev, idBtnQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.idBtnHis = (Button)this.findViewById(R.id.idBtnHis);
        this.idBtnHis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openHistoria();
            }
        });

        this.idBtnGuia = (Button)this.findViewById(R.id.idBtnGuia);
        this.idBtnGuia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openGuiaMapa();
            }
        });

        this.idBtnDev = (Button)this.findViewById(R.id.idBtnDev);
        this.idBtnDev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openDesenvolvedores();
            }
        });


    }

    private void openHistoria() {
        Intent intent = new Intent(this, Historia.class);
        this.startActivity(intent);
    }

    private void openGuiaMapa() {
        Intent intent = new Intent(this, GuiaMapa.class);
        this.startActivity(intent);
    }

    private void openDesenvolvedores() {
        Intent intent = new Intent(this, Desenvolvedores.class);
        this.startActivity(intent);
    }

}