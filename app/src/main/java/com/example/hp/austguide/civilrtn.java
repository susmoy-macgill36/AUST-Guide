package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class civilrtn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilrtn);
    }
    public void ce11trn(View view)
    {
        Button ce11= (Button) findViewById(R.id.id02p1);
        PopupMenu popupMenu= new PopupMenu(civilrtn.this,ce11);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                         method1();
                        return true;
                    case R.id.secb:
                        method2();

                        return true;
                    case R.id.secc:
                       method3();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  method1()
    {
        Intent qs=new Intent(this,allimage.class);
        qs.putExtra("image",R.drawable.ce11seca);
        startActivity(qs);
    }
    public  void  method2()
    {
        Intent qsv=new Intent(this,allimage.class);
        qsv.putExtra("image",R.drawable.ce11secb);
        startActivity(qsv);
    }
    public  void  method3()
    {
        Intent qsv=new Intent(this,allimage.class);
        qsv.putExtra("image",R.drawable.ce11secc);
        startActivity(qsv);
    }
    public void ce12trn(View view)
    {
        Button ce12= (Button) findViewById(R.id.id03p1);
        PopupMenu popupMenu= new PopupMenu(civilrtn.this,ce12);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        method4();
                        return true;
                    case R.id.secb:
                        method5();

                        return true;
                    case R.id.secc:
                        method6();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  method4()
    {
        Intent qs=new Intent(this,allimage.class);
        qs.putExtra("image",R.drawable.ce12seca);
        startActivity(qs);
    }
    public  void  method5()
    {
        Intent qsv=new Intent(this,allimage.class);
        qsv.putExtra("image",R.drawable.ce12secb);
        startActivity(qsv);
    }
    public  void  method6()
    {
       // Intent qsv=new Intent(this,allimage.class);
       // qsv.putExtra("image",R.drawable.ce11secc);
       // startActivity(qsv);
        Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_SHORT).show();
    }





    public void ce21trn(View view)
    {
        Button ce21= (Button) findViewById(R.id.id04p1);
        PopupMenu popupMenu= new PopupMenu(civilrtn.this,ce21);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        method7();
                        return true;
                    case R.id.secb:
                        method8();

                        return true;
                    case R.id.secc:
                        method9();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  method7()
    {
        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.ce21seca);
        startActivity(qsx);
    }
    public  void  method8()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.ces21secb);
        startActivity(qsxx);
    }
    public  void  method9()
    {
        Intent qsva=new Intent(this,allimage.class);
        qsva.putExtra("image",R.drawable.ce21secc);
        startActivity(qsva);
        //Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_SHORT).show();
    }


    public void ce22trn(View view)
    {
        Button ce22= (Button) findViewById(R.id.id05p1);
        PopupMenu popupMenu= new PopupMenu(civilrtn.this,ce22);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        method10();
                        return true;
                    case R.id.secb:
                        method11();

                        return true;
                    case R.id.secc:
                        method12();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  method10()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.ce22seca);
        startActivity(qsx);
    }
    public  void  method11()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.ce22secb);
        startActivity(qsxx);
    }
    public  void  method12()
    {
        //Intent qsva=new Intent(this,allimage.class);
        //qsva.putExtra("image",R.drawable.ce21secc);
        //startActivity(qsva);
        Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_SHORT).show();
    }



    public void ce31trn(View view)
    {
        Button ce31= (Button) findViewById(R.id.id06p1);
        PopupMenu popupMenu= new PopupMenu(civilrtn.this,ce31);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        method13();
                        return true;
                    case R.id.secb:
                        method14();

                        return true;
                    case R.id.secc:
                        method15();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  method13()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.ce31seca);
        startActivity(qsx);
    }
    public  void  method14()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.ce31secb);
        startActivity(qsxx);
    }
    public  void  method15()
    {
        Intent qsva=new Intent(this,allimage.class);
        qsva.putExtra("image",R.drawable.ce31secc);
        startActivity(qsva);
        //Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }
    public void ce32trn(View view)
    {
        Button ce32= (Button) findViewById(R.id.id07p1);
        PopupMenu popupMenu= new PopupMenu(civilrtn.this,ce32);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        method16();
                        return true;
                    case R.id.secb:
                        method17();

                        return true;
                    case R.id.secc:
                        method18();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  method16()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.ce32seca);
        startActivity(qsx);
    }
    public  void  method17()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.ce32secb);
        startActivity(qsxx);
    }
    public  void  method18()
    {
        //Intent qsva=new Intent(this,allimage.class);
        //qsva.putExtra("image",R.drawable.ce31secc);
        //startActivity(qsva);
        Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }


    public void ce41trn(View view)
    {
        Button ce41= (Button) findViewById(R.id.id08p1);
        PopupMenu popupMenu= new PopupMenu(civilrtn.this,ce41);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        method19();
                        return true;
                    case R.id.secb:
                        method20();

                        return true;
                    case R.id.secc:
                        method21();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  method19()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.ce41seca);
        startActivity(qsx);
    }
    public  void  method20()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.ce41secb);
        startActivity(qsxx);
    }
    public  void  method21()
    {
        Intent qsva=new Intent(this,allimage.class);
        qsva.putExtra("image",R.drawable.ce41secc);
        startActivity(qsva);
   //     Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }




    public void ce42trn(View view)
    {
        Button ce42= (Button) findViewById(R.id.id09p1);
        PopupMenu popupMenu= new PopupMenu(civilrtn.this,ce42);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.seca:


                        method22();
                        return true;
                    case R.id.secb:
                        method23();

                        return true;
                    case R.id.secc:
                        method24();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void  method22()
    {

        Intent qsx=new Intent(this,allimage.class);
        qsx.putExtra("image",R.drawable.ce41seca);
        startActivity(qsx);
    }
    public  void  method23()
    {
        Intent qsxx=new Intent(this,allimage.class);
        qsxx.putExtra("image",R.drawable.ce42secb);
        startActivity(qsxx);
    }
    public  void  method24()
    {
        //Intent qsva=new Intent(this,allimage.class);
        //qsva.putExtra("image",R.drawable.ce31secc);
        //startActivity(qsva);
        Toast.makeText(getApplicationContext(), "sorry....section C not available", Toast.LENGTH_LONG).show();
    }



}
