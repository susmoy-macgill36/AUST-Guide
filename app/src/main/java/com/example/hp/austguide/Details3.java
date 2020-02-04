package com.example.hp.austguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.austguide.database1.DatabaseHelper2;

public class Details3 extends AppCompatActivity {
    DatabaseHelper2 ob = new DatabaseHelper2(this);
    final int pos = getIntent().getIntExtra("MyKEY", 999);
     EditText e = (EditText) findViewById(R.id.i1u);
    Button b = (Button) findViewById(R.id.i2u);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details3);
        e.setText(ob.qdate(pos+1));
        e.setSelection(e.getText().length());

    }


}
