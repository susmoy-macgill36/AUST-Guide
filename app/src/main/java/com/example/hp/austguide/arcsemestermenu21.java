package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class arcsemestermenu21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcsemestermenu21);
    }
    public void arcthry21(View view)
    {

        Intent arc21=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_t_2_1.php"));
        startActivity(arc21);
    }
    public void arcssnal21(View view)
    {
        Intent arc21=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_s_2_1.php"));
        startActivity(arc21);
    }
    public void arcclr21(View view)
    {
        Intent arc21=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/arc_c_2_1.php"));
        startActivity(arc21);
    }
}
