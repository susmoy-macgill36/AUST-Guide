package com.example.hp.austguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.austguide.database1.DatabaseHelper;

public class signup extends AppCompatActivity {
  DatabaseHelper s=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    }

public  void signupClick(View view)
{
    EditText name= (EditText) findViewById(R.id.i12);
    EditText uname= (EditText) findViewById(R.id.i12c);
    EditText pass= (EditText) findViewById(R.id.i14);
    EditText email= (EditText) findViewById(R.id.i16);




    String namestr=name.getText().toString();
    String unamestr=uname.getText().toString();
    String emailstr=email.getText().toString();
    String passstr=pass.getText().toString();

    Info c=new Info();
    c.setName(namestr);
    c.setEmail(emailstr);
    c.setUname(unamestr);
    c.setPass(passstr);

s.insertInfo(c);
    Toast.makeText(signup.this,"SUCCESSSFULLY REGISTERED",Toast.LENGTH_SHORT).show();
}


}
