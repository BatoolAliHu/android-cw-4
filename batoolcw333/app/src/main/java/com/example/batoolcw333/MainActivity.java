package com.example.batoolcw333;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private EditText editText, editText1;
        private Button button, button1, button2;
        private TextView textView1;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editText = (EditText)findViewById(R.id.editTextText);
            editText1 = (EditText)findViewById(R.id.editTextText1);
            textView1 = findViewById(R.id.textView1);
            button = findViewById(R.id.button);
            button1 = findViewById(R.id.button1);
            button2 = findViewById(R.id.button2);

            button.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int number1 = Integer.parseInt(editText.getText().toString());
                    int number2 = Integer.parseInt(editText1.getText().toString());
                    //try🦧
                    System.out.println("🐹");
                    //ADDITION btn
                    int  calculate = number1 + number2;
                    textView1.setText(String.valueOf(calculate));
                }
            });

            button1.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int number1 = Integer.parseInt(editText.getText().toString());
                    int number2 = Integer.parseInt(editText1.getText().toString());
                    //try🦧
                    System.out.println("🐹");
                    //MULTIPLICATION btn
                    int  calculate = number1 * number2;
                    textView1.setText(String.valueOf(calculate));
                }
            });

            button2.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int number1 = Integer.parseInt(editText.getText().toString());
                    int number2 = Integer.parseInt(editText1.getText().toString());
                    //try🦧
                    System.out.println("🐹");
                    //DIVISION btn
                    int  calculate = number1 / number2;
                    textView1.setText(String.valueOf(calculate));
                }
            });
    }
}