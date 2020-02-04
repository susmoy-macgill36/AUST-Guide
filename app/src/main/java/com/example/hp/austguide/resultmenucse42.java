package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultmenucse42 extends AppCompatActivity {
public  Button clr,ssnal,thry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmenucse42);
    }
    public void csethry42(View view)
    {
        thry=(Button) findViewById(R.id.theorycse42);
        Intent cse42=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_t_4_2.php"));
        startActivity(cse42);
    }
    public void csessnal42(View view)
    {
        ssnal=(Button) findViewById(R.id.labcse42) ;
        Intent cse42=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_s_4_2.php"));
        startActivity(cse42);
    }
    public void cseclr42(View view)
    {
        clr=(Button) findViewById(R.id.carrycse42) ;
        Intent cse42=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_c_4_2.php"));
        startActivity(cse42);
    }
}
