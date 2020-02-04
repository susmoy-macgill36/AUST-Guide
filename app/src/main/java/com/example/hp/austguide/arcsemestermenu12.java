package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class arcsemestermenu12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcsemestermenu12);
    }
    public void arcthry12(View view)
    {

        Intent arc12=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_t_1_2.php"));
        startActivity(arc12);
    }
    public void arcssnal12(View view)
    {
        Intent arc12=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_s_1_2.php"));
        startActivity(arc12);
    }
    public void arcclr12(View view)
    {
        Intent arc12=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_c_1_2.php"));
        startActivity(arc12);
    }

}
