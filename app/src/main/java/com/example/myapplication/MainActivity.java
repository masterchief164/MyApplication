package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextVal);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                StartNewAc(v);
            }
        });
    }
    public void StartNewAc(View view) {
        Intent intent = new Intent(this, newActivity.class);
        String data = editText.getText().toString();
        intent.putExtra("Data",data);
        startActivity(intent);
    }
}