package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Csertn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csertn);
    }


    public void cse11rrtn (View view)
    {

            Button cse11= (Button) findViewById(R.id.id02p);
            PopupMenu popupMenu= new PopupMenu(Csertn.this,cse11);
            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {

                    switch (item.getItemId()) {
                        case R.id.seca:


                            cse11seca();
                            return true;
                        case R.id.secb:
                            cse11secb();

                            return true;
                        case R.id.secc:
                            cse11secc();

                            return true;

                    }

                    return true;
                }
            });

            popupMenu.show();
        }
    public  void  cse11seca()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse11seca);
        startActivity(qsx);
    }
    public  void  cse11secb()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.cse11secb);
        startActivity(qsxx);
    }
    public  void  cse11secc()
    {
        Intent qsva=new Intent(this,allimage.class);
        qsva.putExtra("image",R.drawable.cse11secc);
        startActivity(qsva);
        //Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }

    public void cse12rrtn (View view)
    {

        Button cse12= (Button) findViewById(R.id.id03p);
        PopupMenu popupMenu= new PopupMenu(Csertn.this,cse12);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        cse12seca();
                        return true;
                    case R.id.secb:
                        cse12secb();

                        return true;
                    case R.id.secc:
                        cse12secc();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  cse12seca()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse12seca);
        startActivity(qsx);
    }
    public  void  cse12secb()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.cse12secb);
        startActivity(qsxx);
    }
    public  void  cse12secc()
    {

        Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }
    public void cse21rrtn (View view)
    {

        Button cse21= (Button) findViewById(R.id.id04p);
        PopupMenu popupMenu= new PopupMenu(Csertn.this,cse21);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        cse21seca();
                        return true;
                    case R.id.secb:
                        cse21secb();

                        return true;
                    case R.id.secc:
                        cse21secc();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  cse21seca()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse21seca);
        startActivity(qsx);
    }
    public  void  cse21secb()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.cse12secb);
        startActivity(qsxx);
    }
    public  void  cse21secc()
    {
        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse21secc);
        startActivity(qsx);
        Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }





    public void cse22rrtn (View view)
    {

        Button cse22= (Button) findViewById(R.id.id05p);
        PopupMenu popupMenu= new PopupMenu(Csertn.this,cse22);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        cse22seca();
                        return true;
                    case R.id.secb:
                        cse22secb();

                        return true;
                    case R.id.secc:
                        cse22secc();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  cse22seca()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse22seca);
        startActivity(qsx);
    }
    public  void  cse22secb()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.cse22secb);
        startActivity(qsxx);
    }
    public  void  cse22secc()
    {
       // Intent qsx=new Intent(this,allimage.class);
      //  qsx.putExtra("image",R.drawable.cse22secc);
        //startActivity(qsx);
        Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }


    public void cse31rrtn (View view)
    {

        Button cse31= (Button) findViewById(R.id.id06p);
        PopupMenu popupMenu= new PopupMenu(Csertn.this,cse31);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        cse31seca();
                        return true;
                    case R.id.secb:
                        cse31secb();

                        return true;
                    case R.id.secc:
                        cse31secc();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  cse31seca()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse31seca);
        startActivity(qsx);
    }
    public  void  cse31secb()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.cse31secb);
        startActivity(qsxx);
    }
    public  void  cse31secc()
    {
        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse31secc);
        startActivity(qsx);
        //Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }
    public void cse32rrtn (View view)
    {

        Button cse32= (Button) findViewById(R.id.id07p);
        PopupMenu popupMenu= new PopupMenu(Csertn.this,cse32);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        cse32seca();
                        return true;
                    case R.id.secb:
                        cse32secb();

                        return true;
                    case R.id.secc:
                        cse32secc();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  cse32seca()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse32seca);
        startActivity(qsx);
    }
    public  void  cse32secb()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.cse32secb);
        startActivity(qsxx);
    }
    public  void  cse32secc()
    {
        //Intent qsx=new Intent(this,allimage.class);
       // qsx.putExtra("image",R.drawable.cse31secc);
        //startActivity(qsx);
        Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }

    public void cse41rrtn (View view)
    {

        Button cse41= (Button) findViewById(R.id.id08p);
        PopupMenu popupMenu= new PopupMenu(Csertn.this,cse41);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        cse32seca();
                        return true;
                    case R.id.secb:
                        cse32secb();

                        return true;
                    case R.id.secc:
                        cse32secc();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  cse41seca()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse41seca);
        startActivity(qsx);
    }
    public  void  cse41secb()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.cse41secb);
        startActivity(qsxx);
    }
    public  void  cse41secc()
    {
        Intent qsx=new Intent(this,allimage.class);
         qsx.putExtra("image",R.drawable.cse41secc);
        startActivity(qsx);
        //Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }


    public void cse42rrtn (View view)
    {

        Button cse32= (Button) findViewById(R.id.id07p);
        PopupMenu popupMenu= new PopupMenu(Csertn.this,cse32);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        cse42seca();
                        return true;
                    case R.id.secb:
                        cse42secb();

                        return true;
                    case R.id.secc:
                        cse42secc();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  cse42seca()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.cse42seca);
        startActivity(qsx);
    }
    public  void  cse42secb()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.cse42secb);
        startActivity(qsxx);
    }
    public  void  cse42secc()
    {
        //Intent qsx=new Intent(this,allimage.class);
        // qsx.putExtra("image",R.drawable.cse31secc);
        //startActivity(qsx);
        Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }




}

