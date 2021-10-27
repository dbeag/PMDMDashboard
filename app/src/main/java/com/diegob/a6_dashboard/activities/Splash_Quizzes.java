package com.diegob.a6_dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.diegob.a6_dashboard.R;

public class Splash_Quizzes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_quizzes);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Quizzes.this, Quizzes_activity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}