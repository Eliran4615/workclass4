package com.example.workclass4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv;
    int i;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.iv);
    }

    public void go(View view) {
        Random rnd = new Random();
        int y = rnd.nextInt(3) + 1;
        btn.setText("click number:  " + y);
        switch (y) {
            case 1:
                iv.setImageResource(R.drawable.num1);
                break;
            case 2:
                iv.setImageResource(R.drawable.num2);
                break;
            case 3:
                iv.setImageResource(R.drawable.num3);
                break;
        }
    }
}