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

        this.idBtnHis = (Button)this.findViewById(idBtnHis.getId());
        this.idBtnHis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openHistoria();
            }
        });

        this.idBtnGuia = (Button)this.findViewById(idBtnGuia.getId());
        this.idBtnGuia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openGuiaMapa();
            }
        });

        this.idBtnDev = (Button)this.findViewById(idBtnDev.getId());
        this.idBtnDev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openDesenvolvedores();
            }
        });

        this.idBtnQuiz = (Button)this.findViewById(idBtnQuiz.getId());
        this.idBtnQuiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openQuiz();
            }
        });

    }

    private void openHistoria() {
        Intent intent = new Intent(this, Historia.class);
        this.startActivity(intent);
    }

    private void openGuiaMapa() {
        Intent intent = new Intent(this, Historia.class);
        this.startActivity(intent);
    }

    private void openDesenvolvedores() {
        Intent intent = new Intent(this, Historia.class);
        this.startActivity(intent);
    }

    private void openQuiz() {
        Intent intent = new Intent(this, Historia.class);
        this.startActivity(intent);
    }
}