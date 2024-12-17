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

public class thirdpage extends AppCompatActivity {
Button b7,b10;
EditText ett1,ett2;
Integer numm1,numm2,sum;
String getnumm1,getnumm2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_thirdpage);
        b7=(Button)findViewById(R.id.ssssid);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ao =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ao);
            }
        });
        b10=(Button)findViewById(R.id.sssid);
        ett1=(EditText)findViewById(R.id.sid);
        ett2=(EditText)findViewById(R.id.ssid);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getnumm1=ett1.getText().toString();
                getnumm2=ett2.getText().toString();
                numm1=Integer.parseInt(getnumm1);
                numm2=Integer.parseInt(getnumm2);
                sum=numm1-numm2;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });


    }
}