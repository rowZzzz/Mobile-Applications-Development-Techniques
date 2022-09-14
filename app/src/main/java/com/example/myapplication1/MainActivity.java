package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.textView);
        Button btn_txt = findViewById(R.id.btn_txt);
        Button btn_txt_clr = findViewById(R.id.btn_txt_color);
        btn_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            txt.setText("Text was changed!");
            txt.setTextColor(Color.BLACK);

            }
        });
        btn_txt_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(256),random.nextInt(256),random.nextInt(256));
                txt.setText("Color and text was changed!");
                txt.setTextColor(color);

            }
        });
    }
}