package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class arcsemestermenu31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcsemestermenu31);
    }
    public void arcthry31(View view)
    {

        Intent arc31=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_t_3_1.php"));
        startActivity(arc31);
    }
    public void arcssnal31(View view)
    {
        Intent arc31=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_s_3_1.php"));
        startActivity(arc31);
    }
    public void arcclr31(View view)
    {
        Intent arc31=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_c_3_1.php"));
        startActivity(arc31);
    }

}
