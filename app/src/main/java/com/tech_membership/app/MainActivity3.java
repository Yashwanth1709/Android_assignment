package com.tech_membership.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        MaterialButton next3=(MaterialButton) findViewById(R.id.next3);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity3.this,MainActivity4.class);
                Bundle b2= getIntent().getExtras();
                String tech,ntech;
                EditText tech_skills =(EditText) findViewById(R.id.technical_skills);
                EditText non_tech_skills =(EditText) findViewById(R.id.non_technical_skills);
                tech=tech_skills.getText().toString();
                ntech= non_tech_skills.getText().toString();
                i.putExtras(b2);
                i.putExtra("tech",tech);
                i.putExtra("ntech",ntech);
                startActivity(i);
            }
        });
    }
}