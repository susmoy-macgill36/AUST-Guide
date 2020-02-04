package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class arcresultmenu extends AppCompatActivity {
public Button ssnal,clr,thry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcresultmenu);
    }


    public void arcthry11(View view)
    {

        Intent arc11=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_t_1_1.php"));
        startActivity(arc11);
    }
    public void arcssnal11(View view)
    {
        Intent arc11=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_s_1_1.php"));
        startActivity(arc11);
    }
    public void arcclr11(View view)
    {
        Intent arc11=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_c_1_1.php"));
        startActivity(arc11);
    }













}
