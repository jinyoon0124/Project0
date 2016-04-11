package com.example.jinyoon.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickProject1(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Popular Movies app!",Toast.LENGTH_SHORT).show();

    }
    public void clickProject2(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Stock Hawk app!",Toast.LENGTH_SHORT).show();

    }
    public void clickProject3(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Build It Bigger app!",Toast.LENGTH_SHORT).show();

    }
    public void clickProject4(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Make Your App Material app!",Toast.LENGTH_SHORT).show();

    }
    public void clickProject5(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Go Ubiquitous app!",Toast.LENGTH_SHORT).show();
    }
    public void clickProject6(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Capstone app!",Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
