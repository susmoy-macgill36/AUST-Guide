package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class arcsemestermenu22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcsemestermenu22);
    }
    public void arcthry22(View view)
    {

        Intent arc22=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_t_2_2.php"));
        startActivity(arc22);
    }
    public void arcssnal22(View view)
    {
        Intent arc22=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_s_2_2.php"));
        startActivity(arc22);
    }
    public void arcclr22(View view)
    {
        Intent arc22=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_c_2_2.php"));
        startActivity(arc22);
    }
}
