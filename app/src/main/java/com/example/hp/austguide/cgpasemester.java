package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cgpasemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpasemester);
    }
    public void onclick55(View view)
    {
        Intent o= new Intent(this,cgpacse.class);
       startActivity(o);
    }
}
