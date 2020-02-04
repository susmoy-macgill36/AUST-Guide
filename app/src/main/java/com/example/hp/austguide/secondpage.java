package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class secondpage extends AppCompatActivity {
    public Button f;
    public  Button l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);


    }
    public void onClickzz(View view)
    {
       // f=(Button)resultbutton
        f = (Button) findViewById(R.id.resultbutton);
        Intent c=new Intent(this,Allresultthis.class);
        startActivity(c);

    }
    public void onClick(View view)
    {
        l = (Button) findViewById(R.id.rtnbutton);
        Intent b = new Intent(this, allresult.class);
        //b.setFlags(b.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(b);
    }
    public  void oncleek(View view)
    {
        Intent i= new Intent(this,cgpasemester.class);
        startActivity(i);
    }
    public  void quizRtn(View view)
    {
        Intent sf = new Intent( this,Details.class);
        startActivity(sf);
    }
}