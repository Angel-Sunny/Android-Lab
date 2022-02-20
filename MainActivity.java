package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginbutton;
    String name="admin";
    String pass="password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username =findViewById(R.id.uname);
        password=findViewById(R.id.pwd);
        loginbutton=findViewById(R.id.logid);
         loginbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String ipname=username.getText().toString();
                 String ippass=password.getText().toString();

                if(ipname.isEmpty() || ippass.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Fields are empty",Toast.LENGTH_LONG).show();
                }

                else {
                    if(ipname.equals(name) && ippass.equals(pass))
                    {
                        Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
                    }
                    if(!ipname.equals(name))
                        Toast.makeText(MainActivity.this, "Username incorrect", Toast.LENGTH_SHORT).show();
                    if(!ippass.equals(pass))
                        Toast.makeText(MainActivity.this, "Password incorrect", Toast.LENGTH_SHORT).show();
                }

             }
         });
    }
}