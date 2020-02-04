package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Eeesemester1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeesemester1);

    }
    public void eeeres11(View view)
    {

        Button ee11= (Button) findViewById(R.id.id0as2);
        PopupMenu popupMenu= new PopupMenu(Eeesemester1.this,ee11);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.secaa:


                        method11e();
                        return true;
                    case R.id.secbb:
                        method22e();

                        return true;
                    case R.id.seccc:
                        method33e();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void method11e()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_t_1_1.php"));
        startActivity(vg);
    }
    public  void method22e()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_s_1_1.php"));
        startActivity(vg);
    }
    public  void method33e()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_c_1_1.php"));
        startActivity(vg);
    }



    public void eeeres12(View view)
    {

        Button ee12= (Button) findViewById(R.id.id0as3);
        PopupMenu popupMenu= new PopupMenu(Eeesemester1.this,ee12);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.secaa:


                        method12te();
                        return true;
                    case R.id.secbb:
                        method12se();

                        return true;
                    case R.id.seccc:
                        method12ce();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void method12te()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_t_1_2.php"));
        startActivity(vg);
    }
    public  void method12se()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_s_1_2.php"));
        startActivity(vg);
    }
    public  void method12ce()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_c_1_2.php"));
        startActivity(vg);
    }
    public void eeeres21(View view)
    {

        Button ee21= (Button) findViewById(R.id.id0as4);
        PopupMenu popupMenu= new PopupMenu(Eeesemester1.this,ee21);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.secaa:


                        method21te();
                        return true;
                    case R.id.secbb:
                        method21se();

                        return true;
                    case R.id.seccc:
                        method21ce();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void method21te()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_t_2_1.php"));
        startActivity(vg);
    }
    public  void method21se()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_s_2_1.php"));
        startActivity(vg);
    }
    public  void method21ce()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_c_2_1.php"));
        startActivity(vg);
    }
    public void eeeres22(View view)
    {

        Button ee22= (Button) findViewById(R.id.id0as5);
        PopupMenu popupMenu= new PopupMenu(Eeesemester1.this,ee22);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.secaa:


                        method22te();
                        return true;
                    case R.id.secbb:
                        method22se();

                        return true;
                    case R.id.seccc:
                        method22ce();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void method22te()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_t_2_2.php"));
        startActivity(vg);
    }
    public  void method22se()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_s_2_2.php"));
        startActivity(vg);
    }
    public  void method22ce()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_c_2_2.php"));
        startActivity(vg);
    }
    public void eeeres31(View view)
    {

        Button ee31= (Button) findViewById(R.id.id0as6);
        PopupMenu popupMenu= new PopupMenu(Eeesemester1.this,ee31);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.secaa:


                        method31te();
                        return true;
                    case R.id.secbb:
                        method31se();

                        return true;
                    case R.id.seccc:
                        method31ce();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void method31te()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_t_3_1.php"));
        startActivity(vg);
    }
    public  void method31se()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_s_3_1.php"));
        startActivity(vg);
    }
    public  void method31ce()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_c_3_1.php"));
        startActivity(vg);
    }


    public void eeeres32(View view)
    {

        Button ee32= (Button) findViewById(R.id.id0as7);
        PopupMenu popupMenu= new PopupMenu(Eeesemester1.this,ee32);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.secaa:


                        method32te();
                        return true;
                    case R.id.secbb:
                        method32se();

                        return true;
                    case R.id.seccc:
                        method32ce();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void method32te()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_t_3_2.php"));
        startActivity(vg);
    }
    public  void method32se()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_s_3_2.php"));
        startActivity(vg);
    }
    public  void method32ce()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_c_3_2.php"));
        startActivity(vg);

    }






    public void eeeres41(View view)
    {

        Button ee41= (Button) findViewById(R.id.id0as8);
        PopupMenu popupMenu= new PopupMenu(Eeesemester1.this,ee41);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.secaa:


                        method41te();
                        return true;
                    case R.id.secbb:
                        method41se();

                        return true;
                    case R.id.seccc:
                        method41ce();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void method41te()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_t_4_1.php"));
        startActivity(vg);
    }
    public  void method41se()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_s_4_1.php"));
        startActivity(vg);
    }
    public  void method41ce()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_c_4_1.php"));
        startActivity(vg);
    }

    public void eeeres42(View view)
    {

        Button ee42= (Button) findViewById(R.id.id0as9);
        PopupMenu popupMenu= new PopupMenu(Eeesemester1.this,ee42);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.secaa:


                        method42te();
                        return true;
                    case R.id.secbb:
                        method42se();

                        return true;
                    case R.id.seccc:
                        method42ce();

                        return true;

                }

                return true;
            }
        });

        popupMenu.show();
    }
    public  void method42te()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_t_4_2.php"));
        startActivity(vg);
    }
    public  void method42se()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_s_4_2.php"));
        startActivity(vg);
    }
    public  void method42ce()
    {
        Intent vg=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aust.edu/result/eee_c_4_2.php"));
        startActivity(vg);
    }



}
