package com.example.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Singup extends AppCompatActivity {

    EditText Username;
    EditText UserEmail;
    EditText UserPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);


        Username=findViewById(R.id.Uname);
        UserEmail=findViewById(R.id.Uemail);
        UserPass=findViewById(R.id.Upassd);
    }


    public void SingUp(View view) {

        String Name=Username.getText().toString();
        String email=UserEmail.getText().toString();
        String pass=UserPass.getText().toString();

        Intent  bx =new Intent(this,Welcome.class);
        Bundle cc = new Bundle();
        cc.putString("name",Name);
        cc.putString("em",email);
        cc.putString("pas",pass);
        bx.putExtras(cc);
        startActivity(bx);


    }
}
