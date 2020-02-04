package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultmenucse12 extends AppCompatActivity {
  public Button thry,ssnal,clr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmenucse12);
    }
    public void csethry12(View view)
    {
        thry=(Button) findViewById(R.id.theorycse12);
        Intent cse12=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_t_1_2.php"));
        startActivity(cse12);
    }
    public void csessnal12(View view)
    {
        ssnal=(Button) findViewById(R.id.labcse12) ;
        Intent cse12=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_s_1_2.php"));
        startActivity(cse12);
    }
    public void cseclr12(View view)
    {
        clr=(Button) findViewById(R.id.carrycse12) ;
        Intent cse12=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_c_1_2.php"));
        startActivity(cse12);
    }
}
