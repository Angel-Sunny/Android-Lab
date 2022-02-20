package com.example.a8menuprg;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

// Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }
    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){

            case R.id.item1:

                //Toast.makeText(getApplicationContext(),"Shows settings",Toast.LENGTH_SHORT).show();


                Intent i= new
                       Intent(getApplicationContext(),settings.class);
                startActivity(i);


                return true;

            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Shows About Us",Toast.LENGTH_SHORT).show();

                //Intent k= new
                       // Intent(getApplicationContext(),aboutus.class);
                //startActivity(k);

                return true;

            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Shows Help",Toast.LENGTH_SHORT).show();

                //Intent j= new
                  //      Intent(getApplicationContext(),help.class);
                //startActivity(j);


                return true;

            default:

                return super.onOptionsItemSelected(item);

        }

    }
}