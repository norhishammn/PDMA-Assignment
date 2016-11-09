package com.example.sham.a11102016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.sham.a11102016.R.layout.activity_freeplay;

public class MainActivity extends AppCompatActivity {

    Button buttonFreeplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFreeplay = (Button) findViewById(R.id.freeplaybutton);

        buttonFreeplay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
            startActivity(new Intent(MainActivity.this, transition.class));


        }});}}
