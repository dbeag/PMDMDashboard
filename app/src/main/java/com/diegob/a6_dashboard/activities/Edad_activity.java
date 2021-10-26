package com.diegob.a6_dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.diegob.a6_dashboard.R;

public class Edad_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edad);

        EditText edadEdit = findViewById(R.id.edad_et);
        TextView resultadoText = findViewById(R.id.resultado_tv);
        Button calcularBtn = findViewById(R.id.calcular_btn);
        Log.d("Edad_Activity", "La actividad principal se ha creado");

        calcularBtn.setOnClickListener(view -> {
            String edad = edadEdit.getText().toString();
            if (!edad.isEmpty()) {
                int edadint = Integer.parseInt(edad);

                int resultado = edadint * 7;

                String resultadoFinal = getString(R.string.app_textResult, resultado);

                resultadoText.setText(resultadoFinal);
            } else{
                Log.v("MainActivity", "Has introducido un campo vacío");
                Toast.makeText(this, getString(R.string.app_toast), Toast.LENGTH_LONG).show();
            }
        });
    }
}