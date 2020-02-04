package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.austguide.database1.DatabaseHelper;

public class loginpage extends AppCompatActivity {
  DatabaseHelper s=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
    }
    public void bclick (View view)
    {

 //Intent as= new Intent(this,secondpage.class);
       // Intent as= new Intent(this,loginpage.class);
   //     startActivity(as);
        EditText er= (EditText) findViewById(R.id.id0002);
        EditText enr= (EditText) findViewById(R.id.id0003);
  String wq=er.getText().toString();
        String wqe=enr.getText().toString();

        String password=s.searchpass(wq);
        if (!wq.equals(" ")|| !wqe.equals( " ")) {
            if (wqe.equals(password)) {
                Intent as = new Intent(this, secondpage.class);
                startActivity(as);
            } else {
                Toast.makeText(loginpage.this, "SORRY! PASSWORD AND USERNAME NOT MATCHED!!", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(loginpage.this, "ANY OF THIS FELID IS EMPTY!!", Toast.LENGTH_SHORT).show();

        }
    }
    public void signupg (View view)
    {

        Intent as= new Intent(this,signup.class);
        // Intent as= new Intent(this,loginpage.class);
        startActivity(as);
    }
}
