package com.devhub.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        textView=findViewById(R.id.textview);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               textView.setText("Text Changed Hurrah!");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setTextColor(Color.GREEN);
            }
        });
    }
}