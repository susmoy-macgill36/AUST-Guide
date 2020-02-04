package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cgpacse21 extends AppCompatActivity {
    Double one,two,three,four,five,six,seven,eight,nine,finalsum,p,q;
    EditText a1,b1,c1,d1,e1,f1,g1,h1,i1;
    public static String cse11marks;
    TextView ss; double finalresultcg;
    double onegrd,twogrd,threegrd,frgrd,fvegrd,sixgrd,sevgrd,eightgrd,ninegrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpacse21);
        a1=(EditText) findViewById(R.id.hummarks2);
        b1=(EditText) findViewById(R.id.chemmarks2);
        c1=(EditText) findViewById(R.id.phymarks2);
        d1=(EditText) findViewById(R.id.csemarks2);
        e1=(EditText) findViewById(R.id.mathmarks2);
        f1=(EditText) findViewById(R.id.humlabmarks2);
        g1=(EditText) findViewById(R.id.phylabmarks2);

        h1=(EditText) findViewById(R.id.clabmarks2);

        i1=(EditText) findViewById(R.id.c1108labmarks2);


    }
    public void onclickstt(View view)
    {
        one= Double.parseDouble(a1.getText().toString());
        two= Double.parseDouble(b1.getText().toString());
        three= Double.parseDouble(c1.getText().toString());
        four = Double.parseDouble(d1.getText().toString());
        five= Double.parseDouble(e1.getText().toString());
        six = Double.parseDouble(f1.getText().toString());
        seven = Double.parseDouble(g1.getText().toString());
        eight = Double.parseDouble(h1.getText().toString());
        nine= Double.parseDouble(i1.getText().toString());





        if   (one >= 80 && one <= 100)
            onegrd = 4.0;
        else if (one >= 75 && one < 80)
            onegrd = 3.75;
        else if (one >= 70 && one < 75)
            onegrd = 3.5;
        else if (one >= 65 && one < 70)
            onegrd = 3.25;
        else if (one >= 60 && one < 65)
            onegrd = 3.0;
        else if (one >= 55 && one < 60)
            onegrd = 2.75;
        else if (one >= 50 && one < 55)
            onegrd = 2.50;
        else if (one >= 45 && one < 50)
            onegrd = 2.25;
        else if (one >= 40 && one < 45)
            onegrd = 2.0;
        else if (one >= 0 && one < 40)
            onegrd = 0;
/////////////////////////////////////////////////////////////////
        if (two >= 80 && two <= 100)
            twogrd = 4.0;
        else if (two >= 75 && two < 80)
            twogrd = 3.75;
        else if (two >= 70 && two < 75)
            twogrd = 3.5;
        else if (two >= 65 && two < 70)
            twogrd = 3.25;
        else if (two >= 60 && two < 65)
            twogrd = 3.0;
        else if (two >= 55 && two < 60)
            twogrd = 2.75;
        else if (two >= 50 && two < 55)
            twogrd = 2.50;
        else if (two >= 45 && two < 50)
            twogrd = 2.25;
        else if (two >= 40 && two < 45)
            twogrd = 2.0;
        else if (two >= 0 && two < 40)
            twogrd = 0;



        ////
        if (three >= 80 && three <= 100)
            threegrd = 4.0;
        else if (three >= 75 && three < 80)
            threegrd = 3.75;
        else if (three >= 70 && three < 75)
            threegrd = 3.5;
        else if (three >= 65 && three < 70)
            threegrd = 3.25;
        else if (three >= 60 && three < 65)
            threegrd = 3.0;
        else if (three >= 55 && three < 60)
            threegrd = 2.75;
        else if (three >= 50 && three < 55)
            threegrd = 2.50;
        else if (three >= 45 && three < 50)
            threegrd = 2.25;
        else if (three >= 40 && three < 45)
            threegrd = 2.0;
        else if (three >= 0 && three < 40)
            threegrd = 0;


/////////
        if (four >= 80 && four <= 100)
            frgrd = 4.0;
        else if (four >= 75 && four < 80)
            frgrd = 3.75;
        else if (four >= 70 && four < 75)
            frgrd = 3.5;
        else if (four >= 65 && four < 70)
            frgrd = 3.25;
        else if (four >= 60 && four < 65)
            frgrd = 3.0;
        else if (four >= 55 && four < 60)
            frgrd = 2.75;
        else if (four >= 50 && four < 55)
            frgrd = 2.50;
        else if (four >= 45 && four < 50)
            frgrd = 2.25;
        else if (four >= 40 && four < 45)
            frgrd = 2.0;
        else if (four >= 0 && four < 40)
            frgrd = 0;
        ///////////////////////////////////

        if (five >= 80 && five <= 100)
            fvegrd = 4.0;
        else if (five >= 75 && five < 80)
            fvegrd = 3.75;
        else if (five >= 70 && five < 75)
            fvegrd = 3.5;
        else if (five>= 65 && five < 70)
            fvegrd = 3.25;
        else if (five >= 60 && five < 65)
            fvegrd = 3.0;
        else if (five >= 55 && five < 60)
            fvegrd = 2.75;
        else if (five >= 50 && five < 55)
            fvegrd = 2.50;
        else if (four >= 45 && five < 50)
            fvegrd = 2.25;
        else if (five >= 40 && five < 45)
            fvegrd = 2.0;
        else if (five >= 0 && five < 40)
            fvegrd = 0;



        /////////////////////////

        if (six >= 80 && six <= 100)
            sixgrd = 4.0;
        else if (six >= 75 && six < 80)
            sixgrd = 3.75;
        else if (six >= 70 && six < 75)
            sixgrd = 3.5;
        else if (six>= 65 && six < 70)
            sixgrd = 3.25;
        else if (six >= 60 && six < 65)
            sixgrd = 3.0;
        else if (six >= 55 && six < 60)
            sixgrd = 2.75;
        else if (six >= 50 && six < 55)
            sixgrd = 2.50;
        else if (six>= 45 && six < 50)
            sixgrd = 2.25;
        else if (six >= 40 && six< 45)
            sixgrd = 2.0;
        else if (six >= 0 && six < 40)
            sixgrd = 0;

        ////////////////////////

        if (seven >= 80 && seven <= 100)
            sevgrd = 4.0;
        else if (seven >= 75 && seven < 80)
            sevgrd = 3.75;
        else if (seven >= 70 && seven < 75)
            sevgrd = 3.5;
        else if (seven>= 65 && seven < 70)
            sevgrd= 3.25;
        else if (seven >= 60 && seven < 65)
            sevgrd = 3.0;
        else if (seven >= 55 && seven < 60)
            sevgrd = 2.75;
        else if (seven >= 50 && seven < 55)
            sevgrd = 2.50;
        else if (seven>= 45 && seven < 50)
            sevgrd = 2.25;
        else if (seven >= 40 && seven< 45)
            sevgrd = 2.0;
        else if (seven >= 0 && seven < 40)
            sevgrd = 0;
////////////////////////

        if (eight >= 80 && eight <= 100)
            eightgrd = 4.0;
        else if (eight >= 75 && eight < 80)
            eightgrd = 3.75;
        else if (eight>= 70 && eight < 75)
            eightgrd = 3.5;
        else if (eight>= 65 && eight < 70)
            eightgrd= 3.25;
        else if (eight >= 60 && eight < 65)
            eightgrd = 3.0;
        else if (eight >= 55 && eight < 60)
            eightgrd = 2.75;
        else if (eight >= 50 && eight < 55)
            eightgrd = 2.50;
        else if (eight>= 45 && eight < 50)
            eightgrd = 2.25;
        else if (eight >= 40 && eight< 45)
            eightgrd = 2.0;
        else if (eight>= 0 && eight < 40)
            eightgrd = 0;





        ///////////////////////////////////////
        if (nine >= 80 && nine <= 100)
            ninegrd = 4.0;
        else if (nine >= 75 && nine< 80)
            ninegrd = 3.75;
        else if (nine>= 70 && nine < 75)
            ninegrd = 3.5;
        else if (nine>= 65 && nine < 70)
            ninegrd= 3.25;
        else if (nine >= 60 && nine < 65)
            ninegrd = 3.0;
        else if (eight >= 55 && nine< 60)
            ninegrd = 2.75;
        else if (nine >= 50 && nine < 55)
            ninegrd = 2.50;
        else if (nine>= 45 && nine < 50)
            ninegrd = 2.25;
        else if (nine>= 40 && nine< 45)
            ninegrd = 2.0;
        else if (nine>= 0 && nine < 40)
            ninegrd = 0;
        /////////////////////////////////////////




        p=(onegrd)*(3.0)+(twogrd)*(3.0)+(threegrd)*(3.0)+(frgrd)*(3.0)+(fvegrd)*(3.0)+(sixgrd)*(1.5)+(sevgrd)*(0.75)+(eightgrd)*(1.5)+(ninegrd)*(1.5);

        q=(3.0)*(5)+(1.5)*(3)+0.75;
        finalresultcg=p/q;

        //ss=(TextView) findViewById(R.id.resultview);
        //ss.setText(Double.toString(finalresultcg));


        String pass="congratulations, your result is:  "+ "  "+ finalresultcg +"";
        Intent ind= new Intent(this,allcgpaview.class);
        ind.putExtra(cse11marks, pass);

        startActivity(ind);




    }
}
