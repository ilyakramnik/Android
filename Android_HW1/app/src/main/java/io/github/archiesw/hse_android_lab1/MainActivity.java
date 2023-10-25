package io.github.archiesw.hse_android_lab1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private static final String[] AVAILABLE_COLORS = new String[]{"red", "green", "blue"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            String color = editText.getText().toString().trim();
            if (Arrays.stream(AVAILABLE_COLORS).noneMatch((x) -> x.equals(color))) {
                Toast toast = Toast.makeText(getApplicationContext(), "Напишите один из цветов: " + Arrays.toString(AVAILABLE_COLORS), Toast.LENGTH_LONG);
                toast.show();
                return;
            }
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("color", color);
            startActivity(intent);
        });
    }


}