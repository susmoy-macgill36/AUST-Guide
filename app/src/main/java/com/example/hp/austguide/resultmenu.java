package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultmenu extends AppCompatActivity {
public Button thry,ssnal,clr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmenu);
    }
public void csethry11(View view)
{
    thry=(Button) findViewById(R.id.theorycse11);
    Intent cse11=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_t_1_1.php"));
startActivity(cse11);
}
    public void csessnal11(View view)
    {
        ssnal=(Button) findViewById(R.id.labcse11) ;
        Intent cse11=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_s_1_1.php"));
        startActivity(cse11);
    }
    public void cseclr11(View view)
    {
        clr=(Button) findViewById(R.id.carrycse11) ;
        Intent cse11=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/cse_c_1_1.php"));
        startActivity(cse11);
    }

}
