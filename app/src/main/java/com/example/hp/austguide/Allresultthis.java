package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Allresultthis extends AppCompatActivity {
   public Button a1,a2,a3,a4,a5,a6,a7,a8,a9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allresultthis);
    }
    public void arcsemester(View view)
    {
        a1 = (Button) findViewById(R.id.id2w);
        Intent ag=new Intent(this,arcsemester.class);
        startActivity(ag);

    }
    public void eeesemester(View view)
    {
        Intent vb= new Intent(this,Eeesemester1.class);
        startActivity(vb);
    }
    public void semsester(View view)
    {
        a2= (Button) findViewById(R.id.id3w);
        a3 = (Button) findViewById(R.id.id4w);
        a4 = (Button) findViewById(R.id.id5w);
        a5 = (Button) findViewById(R.id.id6w);
        a6 = (Button) findViewById(R.id.id7w);
        a7 = (Button) findViewById(R.id.id8w);
        Intent ab=new Intent(this,Allresultthissemester.class);
        startActivity(ab);
    }
}
