package com.midtermstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class W5Activity extends AppCompatActivity {
    TextView labelUserName;
    EditText txtUserName;
    Button btnBegin;
    private Context context;
    private int duration = Toast.LENGTH_LONG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        context = getApplicationContext();
        labelUserName=findViewById(R.id.textView1);
        txtUserName=findViewById(R.id.txtUserName);
        btnBegin=findViewById(R.id.button1);

        btnBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = txtUserName.getText().toString();
                if(userName.compareTo("Dahyeon Lee")==0){
                    labelUserName.setText("OK, Please wait..");
                    Toast.makeText(context, "Hi!, Prof."+userName, duration).show();
                } else{
                    Toast.makeText(context, userName+ " is not a valid User", duration).show();
                }
            }
        });
    }
}