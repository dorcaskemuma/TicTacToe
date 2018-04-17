package com.example.dorcas.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView three = findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent threeIntent = new Intent(MainActivity.this,ThreebythreeMainActivity.class);
                startActivity(threeIntent);

            }
        });

        TextView five = findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fiveIntent = new Intent(MainActivity.this,FivebyfiveMainActivity.class);
                startActivity(fiveIntent);

            }
        });
        Button exit =findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    }

