package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnClickMe);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.txtHello);
                tv.setText("Clicked Button");
            }
        });

        button.setOnLongClickListener(new Button.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                TextView myText = findViewById(R.id.txtHello);
                myText.setText("Long Button Press");
                return true;
            }
        });
    }
}
