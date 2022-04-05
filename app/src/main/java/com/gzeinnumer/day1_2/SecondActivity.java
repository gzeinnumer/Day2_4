package com.gzeinnumer.day1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle(TAG);

        String dataString = getIntent().getStringExtra("dataString");
        int dataInt = getIntent().getIntExtra("dataInt", 0);
        double dataDouble = getIntent().getDoubleExtra("dataDouble", 0);

        Toast.makeText(getApplicationContext(), dataString, Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), dataInt+"", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), String.valueOf(dataDouble), Toast.LENGTH_SHORT).show();

        Button button = findViewById(R.id.btn_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}