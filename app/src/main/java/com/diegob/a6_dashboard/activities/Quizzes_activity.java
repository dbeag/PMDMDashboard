package com.diegob.a6_dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.diegob.a6_dashboard.R;

public class Quizzes_activity extends AppCompatActivity {

    static int pag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);

        String[] preguntas  = new String[]{"10y = 70", "7 + 5y = 2", "7 * 4 + 5y = 2 + 50y"};
        String[] option1    = new String[]{"7", "3", "-1"};
        String[] option2    = new String[]{"10", "-1", "5"};

        TextView tvPag          = findViewById(R.id.tvFeedback);
        TextView tvOperation    = findViewById(R.id.tvOperation);
        RadioButton rbOption1   = findViewById(R.id.rbOption1);
        RadioButton rbOption2   = findViewById(R.id.rbOption2);
        Button btnEnviar        = findViewById(R.id.btnEnviar);

        tvPag.setText(pag + "/3");
        tvOperation.setText(preguntas[pag - 1]);
        rbOption1.setText(option1[pag - 1]);
        rbOption2.setText(option2[pag - 1]);

        btnEnviar.setOnClickListener(view -> {
            Boolean correcto = false;
            if (!rbOption1.isChecked() && !rbOption2.isChecked()){
                Toast.makeText(this, getString(R.string.app_option), Toast.LENGTH_SHORT).show();
            }
            else {
                switch (pag) {
                    case 1:
                    case 3:
                        if (rbOption1.isChecked()) {
                            correcto = true;
                        }
                        break;
                    case 2:
                        if (rbOption2.isChecked()) {
                            correcto = true;
                        }
                }
                Intent i = new Intent(this, Quizzes_Result_Activity.class);
                i.putExtra("correcto", correcto);
                startActivity(i);
            }
        });
    }
}