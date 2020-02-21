package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.ans1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetState();
                ((Button) findViewById(R.id.ans1)).setTextColor(getResources().getColor(R.color.wrongAns));

            }
        });

        findViewById(R.id.ans2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetState();
                ((Button) findViewById(R.id.ans2)).setTextColor(getResources().getColor(R.color.wrongAns));
            }
        });
        findViewById(R.id.ans3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetState();
                ((Button) findViewById(R.id.ans3)).setTextColor(getResources().getColor(R.color.correctAns));
            }
        });
    }

    private void resetState() {
        ((Button)findViewById(R.id.ans1)).setTextColor(Color.BLACK);
        ((Button)findViewById(R.id.ans2)).setTextColor(Color.BLACK);
        ((Button)findViewById(R.id.ans3)).setTextColor(Color.BLACK);
    }
}
