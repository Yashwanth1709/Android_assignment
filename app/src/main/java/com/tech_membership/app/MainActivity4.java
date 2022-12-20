package com.tech_membership.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Bundle b3=getIntent().getExtras();
        String name=b3.getString("name");
        String dob=b3.getString("dob");
        String gen=b3.getString("gen");
        String addr=b3.getString("addr");
        String qual=b3.getString("qual");
        String per=b3.getString("per");
        String col=b3.getString("col");
        String tech=b3.getString("tech");
        String ntech=b3.getString("ntech");
        TextView Personal,Education,Skills;
        Personal=(TextView)findViewById(R.id.personal);
        Education=(TextView) findViewById(R.id.education);
        Skills=(TextView)findViewById(R.id.skills);
        Personal.setText("Name :"+name+"\n"+ "DOB :"+dob+"\n"+"Gender"+gen+"\n"+"Address :"+addr);
        Education.setText("Qualification :"+qual+"\n"+"Percentage :"+per+"\n"+"College :"+col);
        Skills.setText("Tech :"+tech+"\n"+"NonTech :"+ntech);

    }
}