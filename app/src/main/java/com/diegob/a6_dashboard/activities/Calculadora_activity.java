package com.diegob.a6_dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.diegob.a6_dashboard.R;

public class Calculadora_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        EditText etFirstNumber = findViewById(R.id.firstNumber_et);
        EditText etSecondNumber = findViewById(R.id.secondNumber_et);
        Button btnAdd = findViewById(R.id.add_btn);
        Button btnSubstract = findViewById(R.id.substract_btn);
        Button btnMultiply = findViewById(R.id.multiply_btn);
        Button btnDivide = findViewById(R.id.divide_btn);
        TextView tvResult = findViewById(R.id.result_tv);

        btnAdd.setOnClickListener(View -> {
            String firstNumber = etFirstNumber.getText().toString();
            String secondNumber = etSecondNumber.getText().toString();
            if (!firstNumber.isEmpty() && !secondNumber.isEmpty()){
                Double doublefirstNumber = Double.parseDouble(firstNumber);
                Double doublesecondNumber = Double.parseDouble(secondNumber);

                Double result = doublefirstNumber + doublesecondNumber;
                tvResult.setText(result.toString());
            }
            else {
                Toast.makeText(this, getString(R.string.app_toastCalculator), Toast.LENGTH_LONG).show();
            }
        });

        btnSubstract.setOnClickListener(View -> {
            String firstNumber = etFirstNumber.getText().toString();
            String secondNumber = etSecondNumber.getText().toString();
            if (!firstNumber.isEmpty() && !secondNumber.isEmpty()){
                Double doublefirstNumber = Double.parseDouble(firstNumber);
                Double doublesecondNumber = Double.parseDouble(secondNumber);

                Double result = doublefirstNumber - doublesecondNumber;
                tvResult.setText(result.toString());
            }
            else {
                Toast.makeText(this, getString(R.string.app_toastCalculator), Toast.LENGTH_LONG).show();
            }
        });

        btnMultiply.setOnClickListener(View->{
            String firstNumber = etFirstNumber.getText().toString();
            String secondNumber = etSecondNumber.getText().toString();
            if (!firstNumber.isEmpty() && !secondNumber.isEmpty()){
                Double doublefirstNumber = Double.parseDouble(firstNumber);
                Double doublesecondNumber = Double.parseDouble(secondNumber);

                Double result = doublefirstNumber * doublesecondNumber;
                tvResult.setText(result.toString());
            }
            else {
                Toast.makeText(this, getString(R.string.app_toastCalculator), Toast.LENGTH_LONG).show();
            }
        });

        btnDivide.setOnClickListener(view -> {
            String firstNumber = etFirstNumber.getText().toString();
            String secondNumber = etSecondNumber.getText().toString();
            if (!firstNumber.isEmpty() && !secondNumber.isEmpty()){
                Double doublefirstNumber = Double.parseDouble(firstNumber);
                Double doublesecondNumber = Double.parseDouble(secondNumber);

                if(doublesecondNumber != 0){
                    Double result = doublefirstNumber / doublesecondNumber;
                    tvResult.setText(result.toString());
                }
                else {
                    Toast.makeText(this, getString(R.string.app_divideToast), Toast.LENGTH_LONG).show();
                }
            }
            else {
                Toast.makeText(this, getString(R.string.app_toastCalculator), Toast.LENGTH_LONG).show();
            }
        });

    }
}