package com.example.associationegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Desenvolvedores extends AppCompatActivity {

    public ImageButton imgBtnHomeD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desenvolvedores);

        this.imgBtnHomeD = (ImageButton)this.findViewById(R.id.imgBtnHomeD);
        this.imgBtnHomeD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Desenvolvedores.this.openMainActivity();
            }
        });
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }

    public void onClickRepositorio (View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/JeffersonXS/Association-GameFree"));
        startActivity(i);
    }

    public void onClickLocEscola (View view){
        Uri location = Uri.parse("geo: -23.520778, -46.727667");
        Intent locEscola = new Intent(Intent.ACTION_VIEW, location);
        startActivity(locEscola);
    }

    public void onClickDiogo (View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/diogoodorta"));
        startActivity(i);
    }
    public void onClickJeff (View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/JeffersonXS"));
        startActivity(i);
    }
}