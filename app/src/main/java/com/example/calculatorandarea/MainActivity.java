package com.example.calculatorandarea;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private Button button;
    private Spinner spinner;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        button = findViewById(R.id.button);
        spinner = findViewById(R.id.spinner);
        result = findViewById(R.id.result);
        button.setOnClickListener(v -> calculate());
    }

    private void calculate(){
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        if (spinner.getSelectedItem().toString().equals("+")){
            int res = num1 + num2;
            result.setText(res + "");
        }else if (spinner.getSelectedItem().toString().equals("-")){
            int res = num1 - num2;
            result.setText(res + "");
        }else if (spinner.getSelectedItem().toString().equals("x")){
            int res = num1 * num2;
            result.setText(res + "");
        }else if (spinner.getSelectedItem().toString().equals(":")){
            if (num2 == 0){
                result.setText("không thể chia cho 0");
            }else {
                double res = (double) num1 / num2;
                result.setText(res + "");
            }
        }
        result.setTextColor(Color.RED);
    }

}