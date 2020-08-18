package com.example.instantsproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String NUMBER_01 = "num1";
    public static final String NUMBER_02 = "num2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.customtost, (ViewGroup)findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);

        toast.setView(layout);

        toast.show();


    }

    public void okEvent(View view) {


        Context context = getApplicationContext();

        CharSequence message = "Sending massage.....";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);

        toast.show();

        Intent intent = new Intent(this, SecondActivity.class);

        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();


        intent.putExtra(NUMBER_01, n1);
        intent.putExtra(NUMBER_02, n2);

        startActivity(intent);
    }

}