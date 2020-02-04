package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class arcsemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcsemester);
    }
public void arc11(View view)
{
    Intent g=new Intent(this,arcresultmenu.class);
    startActivity(g);
}
    public void arc12(View view)
    {
        Intent gk=new Intent(this,arcsemestermenu12.class);
        startActivity(gk);
    }
    public void arc21(View view)
    {
        Intent gi=new Intent(this,arcsemestermenu21.class);
        startActivity(gi);
    }
    public void arc22(View view)
    {
        Intent gm=new Intent(this,arcsemestermenu22.class);
        startActivity(gm);
    }
    public  void arc31(View view)
    {
        Intent ss= new Intent(this,arcsemestermenu31.class);
        startActivity(ss);
    }
    public  void arc32(View view)
    {
        Intent ss= new Intent(this,arcsemestermenu32.class);
        startActivity(ss);
    }

}
