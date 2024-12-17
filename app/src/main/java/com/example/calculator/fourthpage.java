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

public class fourthpage extends AppCompatActivity {
    Button b6,b11;
    EditText e12,e22;
    Integer num1,num2,sum;
    String result,getNum1,getNum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fourthpage);
        b6=(Button)findViewById(R.id.mmmmid);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent av =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(av);
            }
        });
        b11=(Button)findViewById(R.id.mmmid);
        e12=(EditText)findViewById(R.id.mid);
        e22=(EditText)findViewById(R.id.mmid);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=e12.getText().toString();
                getNum2=e22.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1*num2;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });


    }
}