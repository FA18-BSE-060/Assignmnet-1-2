package com.example.sp20_bse_058_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private String setkey = "5544";
    private TextView key_text;
    private Button button0;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, ok, back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        key_text = findViewById(R.id.OK);
        btn1 = findViewById(R.id.btn1);
        btn1 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        button0 = findViewById(R.id.button0);
        back = findViewById(R.id.back);
        ok = findViewById(R.id.OK);
    }




    private void setKeyText(int n){
        String keyTextValue = key_text.getText().toString();
        if(keyTextValue.length() >= 4){
            return;
        }
        key_text.setText(keyTextValue + n);
    }




    @Override
    protected void onResume() {
        super.onResume();
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(0);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(9);
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String keyTextValue = key_text.getText().toString();
                if (keyTextValue.length() > 0) {
                    key_text.setText(keyTextValue.substring(0, keyTextValue.length() - 1));
                }
            }
        });


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String keyTextValue = key_text.getText().toString();
                if (keyTextValue.equals(ok)) {
                    Intent intent = new Intent(getApplicationContext(), sdaqatActivity2.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Wrong Key", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}