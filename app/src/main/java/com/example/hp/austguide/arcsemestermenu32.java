package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class arcsemestermenu32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcsemestermenu32);
    }
    public void arcthry32(View view)
    {

        Intent arc32=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_t_3_2.php"));
        startActivity(arc32);
    }
    public void arcssnal32(View view)
    {
        Intent arc32=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_s_3_2.php"));
        startActivity(arc32);
    }
    public void arcclr32(View view)
    {
        Intent arc32=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_c_3_2.php"));
        startActivity(arc32);
    }
}
