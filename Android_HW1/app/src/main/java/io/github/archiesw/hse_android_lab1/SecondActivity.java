package io.github.archiesw.hse_android_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String color = getIntent().getStringExtra("color");
        color = Objects.requireNonNull(color);

        if (color.equals("red")) {
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        } else if (color.equals("green")) {
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        } else if (color.equals("blue")) {
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        }
    }
}