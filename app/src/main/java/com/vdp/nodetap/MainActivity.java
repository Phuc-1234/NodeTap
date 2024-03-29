package com.vdp.nodetap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button myButton = findViewById(R.id.myButton);
        Button finalMyButton = myButton;
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentNumber = Integer.parseInt(finalMyButton.getText().toString());
                int newNumber = currentNumber + 1;
                finalMyButton.setText(String.valueOf(newNumber));
            }
        });
        myButton = findViewById(R.id.myButton1);
        Button finalMyButton1 = myButton;
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentNumber = Integer.parseInt(finalMyButton1.getText().toString());
                int newNumber = currentNumber + 1;
                finalMyButton1.setText(String.valueOf(newNumber));
            }
        });

        myButton = findViewById(R.id.myButton2);
        Button finalMyButton2 = myButton;
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentNumber = Integer.parseInt(finalMyButton2.getText().toString());
                int newNumber = currentNumber + 1;
                finalMyButton2.setText(String.valueOf(newNumber));
            }
        });
        myButton = findViewById(R.id.myButton3);
        Button finalMyButton3 = myButton;
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentNumber = Integer.parseInt(finalMyButton3.getText().toString());
                int newNumber = currentNumber + 1;
                finalMyButton3.setText(String.valueOf(newNumber));
            }
        });


    }
}