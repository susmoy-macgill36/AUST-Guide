package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultmenucse32 extends AppCompatActivity {
public  Button clr,ssnal,thry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmenucse32);
    }
    public void csethry32(View view)
    {
        thry=(Button) findViewById(R.id.theorycse32);
        Intent cse32=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_t_3_2.php"));
        startActivity(cse32);
    }
    public void csessnal32(View view)
    {
        ssnal=(Button) findViewById(R.id.labcse32) ;
        Intent cse32=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_s_3_2.php"));
        startActivity(cse32);
    }
    public void cseclr32(View view)
    {
        clr=(Button) findViewById(R.id.carrycse32) ;
        Intent cse32=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_c_3_2.php"));
        startActivity(cse32);
    }
}
