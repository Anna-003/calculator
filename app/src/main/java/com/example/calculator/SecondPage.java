package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondPage extends AppCompatActivity {
Button b8,b9;
String getNum1,getNum2,result;
Integer num1,num2,sum;
EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second_page);
        b8=(Button)findViewById(R.id.aaaaid);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ap =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ap);
            }
        });
        b9=(Button)findViewById(R.id.aaaid);
        e1=(EditText)findViewById(R.id.aid);
        e2=(EditText)findViewById(R.id.aaid);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=e1.getText().toString();
                getNum2=e2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });


    }
}