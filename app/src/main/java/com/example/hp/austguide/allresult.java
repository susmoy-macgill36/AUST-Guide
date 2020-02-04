package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class allresult extends AppCompatActivity {
   public Button one,two,three,four,five,six,seven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allresult);

    }
   public void cseroutine(View view)
   {
       Intent ssd=new Intent(this,Csertn.class);
       startActivity(ssd);
   }
    public void eeeroutine(View view)
    {
        Intent ssd=new Intent(this,eeetrn.class);
        startActivity(ssd);

    }
    public void mperoutine(View view)
    {
        Intent ssd1=new Intent(this,mpertn.class);
        startActivity(ssd1);
    }
    public void iperoutine(View view)
    {
        Intent ssd0=new Intent(this,ipertn.class);
        startActivity(ssd0);
    }
    public void civilroutine(View view)
    {
        Intent ssd2=new Intent(this,civilrtn.class);
        startActivity(ssd2);
    }
    public void textileroutine(View view)
    {
        Intent ssd3=new Intent(this,textilertn.class);
        startActivity(ssd3);
    }
    public void sobroutine(View view)
    {
        Intent ssd4=new Intent(this,sobrtn.class);
        startActivity(ssd4);
    }
}
