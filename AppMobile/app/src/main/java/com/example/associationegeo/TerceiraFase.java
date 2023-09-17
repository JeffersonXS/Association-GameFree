package com.example.associationegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TerceiraFase extends AppCompatActivity {

    public ImageButton imgBtnVoltar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_fase);

        this.imgBtnVoltar3 = (ImageButton)this.findViewById(R.id.imgBtnVoltar3);
        this.imgBtnVoltar3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TerceiraFase.this.openGuiaMapa();
            }
        });
    }

    private void openGuiaMapa() {
        Intent intent = new Intent(this, GuiaMapa.class);
        this.startActivity(intent);
    }
}