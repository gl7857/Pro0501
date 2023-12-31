package com.example.pro0501;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txView = findViewById(R.id.txView);
        btn = findViewById(R.id.btn);
    }


    public void clicked(View view) {
        txView.setText("Oh, yea, I’ve been clicked!");
    }
}