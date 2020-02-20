package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
                ((Button) findViewById(R.id.ans1)).setTextColor(getResources().getColor(R.color.wrongAns));

            }
        });

        findViewById(R.id.ans2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((Button) findViewById(R.id.ans2)).setTextColor(getResources().getColor(R.color.wrongAns));
            }
        });
        findViewById(R.id.ans3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((Button) findViewById(R.id.ans3)).setTextColor(getResources().getColor(R.color.correctAns));
            }
        });
    }
}
