package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btclear;
    Button btcounter;
    private int Cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btclear = findViewById(R.id.button_clear);
        btcounter = findViewById(R.id.button_counter);

        btcounter.setTextSize(56f);

        btclear.setOnClickListener(new clearListener());
        btcounter.setOnClickListener(new counterListener());
    }

    private class clearListener implements View.OnClickListener {
        @Override
        public void  onClick(View view){
            Cnt = 0;
            btcounter.setText(String.valueOf(Cnt));
        }
    }
    private class counterListener implements View.OnClickListener {
        @Override
        public void  onClick(View view){
            Cnt++;
            btcounter.setText(String.valueOf(Cnt));
        }
    }
}