package com.example.instantsproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView n1;
    TextView n2;
    Button add_btn;
    Button minus_btn;
    Button divide_btn;
    Button multi_btn;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String num1 = intent.getStringExtra(FirstActivity.NUMBER_01);
        String num2 = intent.getStringExtra(FirstActivity.NUMBER_02);

         n1 = findViewById(R.id.number1);
         n2 = findViewById(R.id.number2);

        n1.setText(num1);
        n2.setText(num2);

        add_btn = (Button) findViewById(R.id.plus);
        minus_btn = (Button) findViewById(R.id.minus);
        multi_btn = (Button) findViewById(R.id.multipy);
        divide_btn = (Button) findViewById(R.id.divide);
        result = (TextView) findViewById(R.id.result);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double no1 = Double.parseDouble(n1.getText().toString());
                double no2 = Double.parseDouble(n2.getText().toString());

                double sum = no1 + no2;

                String res = Double.toString(no1)+" + "+Double.toString(no2)+" = "+Double.toString(sum);

                result.setText(res);

            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double no1 = Double.parseDouble(n1.getText().toString());
                double no2 = Double.parseDouble(n2.getText().toString());

                double sum = no1 - no2;

                String res = Double.toString(no1)+" - "+Double.toString(no2)+" = "+Double.toString(sum);

                result.setText(res);
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double no1 = Double.parseDouble(n1.getText().toString());
                double no2 = Double.parseDouble(n2.getText().toString());

                double sum = no1 / no2;

                String res = Double.toString(no1)+" / "+Double.toString(no2)+" = "+Double.toString(sum);

                result.setText(res);
            }
        });

        multi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double no1 = Double.parseDouble(n1.getText().toString());
                double no2 = Double.parseDouble(n2.getText().toString());

                double sum = no1 * no2;

                String res = Double.toString(no1)+" * "+Double.toString(no2)+" = "+Double.toString(sum);

                result.setText(res);
            }
        });


    }

}