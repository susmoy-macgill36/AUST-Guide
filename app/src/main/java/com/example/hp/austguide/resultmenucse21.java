package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultmenucse21 extends AppCompatActivity {
public  Button ssnal,clr,thry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmenucse21);
    }
    public void csethry21(View view)
    {
        thry=(Button) findViewById(R.id.theorycse21);
        Intent cse21=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_t_2_1.php"));
        startActivity(cse21);
    }
    public void csessnal21(View view)
    {
        ssnal=(Button) findViewById(R.id.labcse21) ;
        Intent cse21=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_s_2_1.php"));
        startActivity(cse21);
    }
    public void cseclr21(View view)
    {
        clr=(Button) findViewById(R.id.carrycse21) ;
        Intent cse21=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_c_2_1.php"));
        startActivity(cse21);
    }
}
