package com.example.a3simplecalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float res=0;
    EditText n1;
    EditText n2;
    Button ba;
    Button bs;
    Button bm;
    Button bd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        ba=findViewById(R.id.add);
        bs=findViewById(R.id.sub);
        bm=findViewById(R.id.mul);
        bd=findViewById(R.id.div);



        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(n1.getText().toString());
                float b=Float.parseFloat(n2.getText().toString());
                res=a+b;
                Toast.makeText(MainActivity.this, "Sum="+res, Toast.LENGTH_SHORT).show();
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(n1.getText().toString());
                float b=Float.parseFloat(n2.getText().toString());
                res=a-b;
                Toast.makeText(MainActivity.this, "Difference="+res, Toast.LENGTH_SHORT).show();
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(n1.getText().toString());
                float b=Float.parseFloat(n2.getText().toString());
                res=a*b;
                Toast.makeText(MainActivity.this, "Product="+res, Toast.LENGTH_SHORT).show();
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(n1.getText().toString());
                float b=Float.parseFloat(n2.getText().toString());
                res=a/b;
                Toast.makeText(MainActivity.this, "Quotient="+res, Toast.LENGTH_SHORT).show();
            }
        });
    }

}