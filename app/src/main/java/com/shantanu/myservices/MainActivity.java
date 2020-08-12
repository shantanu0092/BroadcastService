package com.shantanu.myservices;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
button1=findViewById(R.id.Start);
button2=findViewById(R.id.Stop);


button1.setOnClickListener(this);
button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==button1)
        {
            startService(new Intent(this,AnotherServices.class));
        }else if (view ==button2)
        {
            stopService(new Intent(this,AnotherServices.class));
        }

    }
}
