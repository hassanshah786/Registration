package com.example.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText Logn_name;
    EditText Logn_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logn_name=findViewById(R.id.logname);
        Logn_pass=findViewById(R.id.logemail);
    }

    public void abc(View view) {

        Intent  ab =new Intent(this,Singup.class);
        startActivity(ab);



    }

    public void Login(View view) {
        String Name1=Logn_name.getText().toString();
        String pass2=Logn_pass.getText().toString();

        Intent  mm =new Intent(this,Welcome.class);


        Bundle cc = new Bundle();
        cc.putString("name",Name1);
        cc.putString("em",pass2);
        startActivity(mm);
    }
}