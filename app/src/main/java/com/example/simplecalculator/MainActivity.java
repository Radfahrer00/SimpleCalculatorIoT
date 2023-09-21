package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button b1, b2, b3, b4;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = findViewById(R.id.text_result);
        e1 = findViewById(R.id.number_input1);

        e2 = findViewById(R.id.number_input2);

        b1 = findViewById(R.id.button1);
        b1.setOnClickListener(new PlusSignListener());
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new MinusSignListener());
        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(new MultiplySignListener());
        b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new DivideSignListener());

    }

    class PlusSignListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            String firstValue = e1.getText().toString();
            Float firstValueFloat = Float.parseFloat(firstValue);

            String secondValue = e2.getText().toString();
            Float secondValueFloat = Float.parseFloat(secondValue);

            Float result = firstValueFloat + secondValueFloat;

            textResult.setText(firstValueFloat + " + " + secondValueFloat + " = " + result);
        }
    }

    class MinusSignListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            String firstValue = e1.getText().toString();
            Float firstValueFloat = Float.parseFloat(firstValue);

            String secondValue = e2.getText().toString();
            Float secondValueFloat = Float.parseFloat(secondValue);

            Float result = firstValueFloat - secondValueFloat;

            textResult.setText(firstValueFloat + " - " + secondValueFloat + " = " + result);
        }
    }

    class MultiplySignListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            String firstValue = e1.getText().toString();
            Float firstValueFloat = Float.parseFloat(firstValue);

            String secondValue = e2.getText().toString();
            Float secondValueFloat = Float.parseFloat(secondValue);

            Float result = firstValueFloat * secondValueFloat;

            textResult.setText(firstValueFloat + " * " + secondValueFloat + " = " + result);
        }
    }

    class DivideSignListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            String firstValue = e1.getText().toString();
            Float firstValueFloat = Float.parseFloat(firstValue);

            String secondValue = e2.getText().toString();
            Float secondValueFloat = Float.parseFloat(secondValue);

            Float result = firstValueFloat / secondValueFloat;

            textResult.setText(firstValueFloat + " / " + secondValueFloat + " = " + result);
        }
    }
}