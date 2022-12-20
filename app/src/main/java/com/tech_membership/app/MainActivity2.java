package com.tech_membership.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MaterialButton next2=(MaterialButton) findViewById(R.id.next2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String qual,per,col;
                Bundle b1=getIntent().getExtras();
                EditText qualification=(EditText) findViewById(R.id.qualification);
                qual = qualification.getText().toString();
                EditText percentage =(EditText) findViewById(R.id.percentage);
                per = percentage.getText().toString();
                EditText college =(EditText) findViewById(R.id.college);
                col = college.getText().toString();
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                i.putExtras(b1);
                i.putExtra("qual",qual);
                i.putExtra("per",per);
                i.putExtra("col",col);
                startActivity(i);
            }
        });
    }
}