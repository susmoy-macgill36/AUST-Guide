package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cseroutinesection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cseroutinesection);
    }

    public  void cse11seca(View view)
    {
        Intent q=new Intent(this,allimage.class);
        q.putExtra("image",R.drawable.cse11rtnnew);
        startActivity(q);
    }
    public  void cse11secb(View view)
    {
        Intent u=new Intent(this,allimage.class);
        u.putExtra("image",R.drawable.cse12rtn);
        startActivity(u);
    }
    public  void cse11secc(View view)
    {
        Intent um=new Intent(this,allimage.class);
        um.putExtra("image",R.drawable.cse11secc);
        startActivity(um);
    }

}
