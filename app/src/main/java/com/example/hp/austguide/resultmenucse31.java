package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultmenucse31 extends AppCompatActivity {
  public  Button ssnal,clr,thry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmenucse31);
    }
    public void csethry31(View view)
    {
        thry=(Button) findViewById(R.id.theorycse12);
        Intent cse31=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_t_3_1.php"));
        startActivity(cse31);
    }
    public void csessnal31(View view)
    {
        ssnal=(Button) findViewById(R.id.labcse31) ;
        Intent cse31=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_s_3_1.php"));
        startActivity(cse31);
    }
    public void cseclr31(View view)
    {
        clr=(Button) findViewById(R.id.carrycse31) ;
        Intent cse12=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_c_3_1.php"));
        startActivity(cse12);
    }

}
