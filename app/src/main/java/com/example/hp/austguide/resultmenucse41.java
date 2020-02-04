package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultmenucse41 extends AppCompatActivity {
public  Button clr,ssnal,thry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmenucse41);
    }
    public void csethry41(View view)
    {
        thry=(Button) findViewById(R.id.theorycse41);
        Intent cse41=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_t_4_1.php"));
        startActivity(cse41);
    }
    public void csessnal41(View view)
    {
        ssnal=(Button) findViewById(R.id.labcse41) ;
        Intent cse41=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_s_4_1.php"));
        startActivity(cse41);
    }
    public void cseclr41(View view)
    {
        clr=(Button) findViewById(R.id.carrycse41) ;
        Intent cse41=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_c_4_1.php"));
        startActivity(cse41);
    }
}
