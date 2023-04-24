package com.midtermstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class W6MainActivity extends AppCompatActivity {
    W6MainFragment mainFragment;
    W6MenuFragment menuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        mainFragment = new W6MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        menuFragment = new W6MenuFragment();
    }

    public void  onFragmentChanged(int index){
        if(index == 0){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, menuFragment).commit();
        }
        else if(index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        }
    }
}