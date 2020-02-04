package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultmenucse22 extends AppCompatActivity {
public  Button ssnal,thry,clr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmenucse22);
    }
    public void csethry22(View view)
    {
        thry=(Button) findViewById(R.id.theorycse22);
        Intent cse22=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_t_2_2.php"));
        startActivity(cse22);
    }
    public void csessnal22(View view)
    {
        ssnal=(Button) findViewById(R.id.labcse22) ;
        Intent cse22=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_s_2_2.php"));
        startActivity(cse22);
    }
    public void cseclr22(View view)
    {
        clr=(Button) findViewById(R.id.carrycse22) ;
        Intent cse22=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_c_2_2.php"));
        startActivity(cse22);
    }
}
