package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.austguide.database1.DatabaseHelper;
import com.example.hp.austguide.database1.DatabaseHelper2;

public class Details extends AppCompatActivity {

DatabaseHelper2 er= new DatabaseHelper2(this);

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
    public void addClick(View view)
    {
        EditText e= (EditText) findViewById(R.id.ed1);
        EditText qe= (EditText) findViewById(R.id.ed2);
 String e1=e.getText().toString();
        String qe1=qe.getText().toString();
        Datavalue dt = new Datavalue(e1, qe1);

        er.addingDataToTable(dt);
        Toast.makeText(Details.this, "quiz details  added successfully", Toast.LENGTH_LONG).show();

    }

public  void addClick2(View view)
{
    Intent gs= new Intent(this,Details2.class);
    startActivity(gs);
}

}
