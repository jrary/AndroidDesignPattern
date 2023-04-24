package com.midtermstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class W3Activity extends AppCompatActivity {

    private View layoutLogin;
    private View layoutInfo;
    private View layoutGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        layoutLogin = (LinearLayout)findViewById(R.id.layoutLogin);
        layoutInfo = (LinearLayout)findViewById(R.id.layoutInfo);
        layoutGrade = (LinearLayout)findViewById(R.id.layoutGrade);
        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        Button btnInfo = (Button)findViewById(R.id.btnInfo);
        Button btnGrade = (Button)findViewById(R.id.btnGrade);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutLogin.setVisibility(View.VISIBLE);
                layoutInfo.setVisibility(View.INVISIBLE);
                layoutGrade.setVisibility(View.INVISIBLE);
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutLogin.setVisibility(View.INVISIBLE);
                layoutInfo.setVisibility(View.VISIBLE);
                layoutGrade.setVisibility(View.INVISIBLE);
            }
        });
        btnGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutLogin.setVisibility(View.INVISIBLE);
                layoutInfo.setVisibility(View.INVISIBLE);
                layoutGrade.setVisibility(View.VISIBLE);
            }
        });
    }
}