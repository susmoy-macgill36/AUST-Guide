package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Allresultthissemester extends AppCompatActivity {
public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allresultthissemester);
    }
    //public
    public void resultmenucse11(View view)
    {
        b1=(Button) findViewById(R.id.id02p);
       // b2=(Button) findViewById(R.id.id03p);

       // b3=(Button) findViewById(R.id.id04p);
       // b4=(Button) findViewById(R.id.id05p);
      //  b5=(Button) findViewById(R.id.id06p);
     //   b6=(Button) findViewById(R.id.id07p);
      //  b7=(Button) findViewById(R.id.id08p);
      //  b8=(Button) findViewById(R.id.id09p);
        Intent rt= new Intent(this,resultmenu.class);
        startActivity(rt);
    }
    public void resultmenucse12(View view)
    {
        //b1=(Button) findViewById(R.id.id02p);
        b2=(Button) findViewById(R.id.id03p);

        // b3=(Button) findViewById(R.id.id04p);
        // b4=(Button) findViewById(R.id.id05p);
        //  b5=(Button) findViewById(R.id.id06p);
        //   b6=(Button) findViewById(R.id.id07p);
        //  b7=(Button) findViewById(R.id.id08p);
        //  b8=(Button) findViewById(R.id.id09p);
        Intent bt= new Intent(this,resultmenucse12.class);
        startActivity(bt);
    }
    public void resultmenucse21(View view)
    {
        //b1=(Button) findViewById(R.id.id02p);
        //b2=(Button) findViewById(R.id.id03p);

         b3=(Button) findViewById(R.id.id04p);
        // b4=(Button) findViewById(R.id.id05p);
        //  b5=(Button) findViewById(R.id.id06p);
        //   b6=(Button) findViewById(R.id.id07p);
        //  b7=(Button) findViewById(R.id.id08p);
        //  b8=(Button) findViewById(R.id.id09p);
        Intent ot= new Intent(this,resultmenucse21.class);
        startActivity(ot);
    }
    public void resultmenucse22(View view)
    {
        //b1=(Button) findViewById(R.id.id02p);
        //b2=(Button) findViewById(R.id.id03p);

       // b3=(Button) findViewById(R.id.id04p);
         b4=(Button) findViewById(R.id.id05p);
        //  b5=(Button) findViewById(R.id.id06p);
        //   b6=(Button) findViewById(R.id.id07p);
        //  b7=(Button) findViewById(R.id.id08p);
        //  b8=(Button) findViewById(R.id.id09p);
        Intent ot= new Intent(this,resultmenucse22.class);
        startActivity(ot);
    }
    public void resultmenucse31(View view)
    {
        //b1=(Button) findViewById(R.id.id02p);
        //b2=(Button) findViewById(R.id.id03p);

        // b3=(Button) findViewById(R.id.id04p);
       // b4=(Button) findViewById(R.id.id05p);
         b5=(Button) findViewById(R.id.id06p);
        //   b6=(Button) findViewById(R.id.id07p);
        //  b7=(Button) findViewById(R.id.id08p);
        //  b8=(Button) findViewById(R.id.id09p);
        Intent ot= new Intent(this,resultmenucse31.class);
        startActivity(ot);
    }
    public void resultmenucse32(View view)
    {
        //b1=(Button) findViewById(R.id.id02p);
        //b2=(Button) findViewById(R.id.id03p);

        // b3=(Button) findViewById(R.id.id04p);
        //b4=(Button) findViewById(R.id.id05p);
        //  b5=(Button) findViewById(R.id.id06p);
          b6=(Button) findViewById(R.id.id07p);
        //  b7=(Button) findViewById(R.id.id08p);
        //  b8=(Button) findViewById(R.id.id09p);
        Intent ot= new Intent(this,resultmenucse32.class);
        startActivity(ot);
    }
    public void resultmenucse41(View view)
    {
        //b1=(Button) findViewById(R.id.id02p);
        //b2=(Button) findViewById(R.id.id03p);

        // b3=(Button) findViewById(R.id.id04p);
      //  b4=(Button) findViewById(R.id.id05p);
        //  b5=(Button) findViewById(R.id.id06p);
        //   b6=(Button) findViewById(R.id.id07p);
         b7=(Button) findViewById(R.id.id08p);
        //  b8=(Button) findViewById(R.id.id09p);
        Intent ot= new Intent(this,resultmenucse41.class);
        startActivity(ot);
    }
    public void resultmenucse42(View view)
    {
        //b1=(Button) findViewById(R.id.id02p);
        //b2=(Button) findViewById(R.id.id03p);

        // b3=(Button) findViewById(R.id.id04p);
       // b4=(Button) findViewById(R.id.id05p);
        //  b5=(Button) findViewById(R.id.id06p);
        //   b6=(Button) findViewById(R.id.id07p);
        //  b7=(Button) findViewById(R.id.id08p);
          b8=(Button) findViewById(R.id.id09p);
        Intent ot= new Intent(this,resultmenucse42.class);
        startActivity(ot);
    }


}
