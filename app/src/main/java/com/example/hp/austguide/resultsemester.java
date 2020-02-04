package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class resultsemester extends AppCompatActivity {
  public Button a,b,c,d,e,f,g,h;
    public  ImageView ig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultsemester);

       // ig=(ImageView) findViewById(R.id.imgs);

    }
public void  onclick11(View view)
{
    a=(Button) findViewById(R.id.id02);
    Intent av=new Intent(this,cseroutine.class);


    startActivity(av);
}
}
