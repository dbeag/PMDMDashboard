package com.diegob.a6_dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.diegob.a6_dashboard.R;

public class Quizzes_Result_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes_result);

        Button btnAction    = findViewById(R.id.btnAction);
        TextView tvResult   = findViewById(R.id.tvFeedback);

        Bundle extras = getIntent().getExtras();
        Boolean correcto = extras.getBoolean("correcto");
        if (correcto){
            if (Quizzes_activity.pag < 3){
                tvResult.setText(getString(R.string.app_correct1text));
                btnAction.setText(R.string.app_correct1button);
            }
            else {
                tvResult.setText(R.string.app_correct2text);
                btnAction.setText(R.string.app_correct2button);
            }
        }
        else {
            tvResult.setText(R.string.app_incorrectText);
            btnAction.setText(R.string.app_incorrectbutton);
        }

        btnAction.setOnClickListener(view -> {
            Intent i = new Intent(this, Quizzes_activity.class);
            if (correcto){
                if (Quizzes_activity.pag == 1){
                    Quizzes_activity.pag = 2;
                    startActivity(i);
                }
                else if (Quizzes_activity.pag == 2){
                    Quizzes_activity.pag = 3;
                    startActivity(i);
                }
                else {
                    Quizzes_activity.pag = 1;
                    startActivity(i);
                }
            }
            else {
                startActivity(i);
            }
        });
    }
}