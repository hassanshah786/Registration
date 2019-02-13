package com.example.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView show_name;
    TextView show_Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        show_name=findViewById(R.id.Name);
        show_Email=findViewById(R.id.EMail);
        Bundle vv = getIntent().getExtras();
        String bb =vv.getString("name");
        String ss =vv.getString("em");
        show_name.setText(bb);
        show_Email.setText(ss);
    }

    public void add(View view) {
        Intent ee = new Intent(this,Add_Student.class);
        startActivity(ee);
    }

    public void view(View view) {
        Intent  qq =new Intent(this,View_Student.class);
        startActivity(qq);
    }
}
