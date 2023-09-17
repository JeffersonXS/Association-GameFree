package com.example.associationegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Historia extends AppCompatActivity {

    public ImageButton imgBtnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        this.imgBtnHome = (ImageButton)this.findViewById(R.id.imgBtnHome);
        this.imgBtnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Historia.this.openMainActivity();
            }
        });
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}