package com.tech_membership.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialButton next1=(MaterialButton) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name,dob,gen,addr;
                EditText Name=(EditText) findViewById(R.id.name);
                name=Name.getText().toString();
                EditText DOB =(EditText) findViewById(R.id.DOB);
                dob=DOB.getText().toString();
                EditText gender =(EditText) findViewById(R.id.gender);
                gen=gender.getText().toString();
                EditText address =(EditText) findViewById(R.id.address);
                addr=address.getText().toString();
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("name",name);
                i.putExtra("dob",dob);
                i.putExtra("gen",gen);
                i.putExtra("addr",addr);
                startActivity(i);

            }
        });


    }
}