package com.midtermstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn3 = findViewById(R.id.btn_wk3);
        Button btn4 = findViewById(R.id.btn_wk4);
        Button btn51 = findViewById(R.id.btn_wk5);
        Button btn52 = findViewById(R.id.btn_wk5_2);
        Button btn61 = findViewById(R.id.btn_wk6);
        Button btn62 = findViewById(R.id.btn_wk6_2);
        Button btn71 = findViewById(R.id.btn_wk7);
        Button btn72 = findViewById(R.id.btn_wk7_2);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), W3Activity.class);
                startActivityForResult(intent, 1);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), W4Activity.class);
                startActivityForResult(intent, 1);
            }
        });
        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), W5Activity.class);
                startActivityForResult(intent, 1);
            }
        });
        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), W5SActivity.class);
                startActivityForResult(intent, 1);
            }
        });
        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), W6MainActivity.class);
                startActivityForResult(intent, 1);
            }
        });
        btn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), W6SActivity.class);
                startActivityForResult(intent, 1);
            }
        });
        btn71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), W7Activity.class);
                startActivityForResult(intent, 1);
            }
        });
        btn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), W7SActivity.class);
                startActivityForResult(intent, 1);
            }
        });
    }
}