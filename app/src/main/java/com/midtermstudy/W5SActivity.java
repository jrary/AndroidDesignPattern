package com.midtermstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class W5SActivity extends AppCompatActivity {
    CheckBox chkCream;
    CheckBox chkSugar;
    Button btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_2);

        chkCream = findViewById(R.id.chkCream);
        chkSugar = findViewById(R.id.chkSugar);
        btnPay = findViewById(R.id.btnPay);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Coffee ";
                if (chkCream.isChecked()){
                    msg += " & Cream ";
                }
                if (chkSugar.isChecked()){
                    msg += " & Sugar";
                }
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}