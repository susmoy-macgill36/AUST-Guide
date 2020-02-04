package com.example.hp.austguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
   /// private  static int s=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void click (View view)
    {

//        Intent as= new Intent(this,secondpage.class);
               Intent as= new Intent(this,loginpage.class);
        startActivity(as);
    }
    public void fbclick(View view)
    {

        Intent er=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(er);
    }
    public void instaclick(View view)
    {

        Intent er5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/?hl=en"));
        startActivity(er5);
    }
    public  void  twitterclick(View view)
    {
        //  https://twitter.com/?lang=en
        Intent er6=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/?lang=en "));
        startActivity(er6);

    }
    public  void  googleplusclick(View view)
    {
        //  https://twitter.com/?lang=en
        Intent er7=new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/collections/featured"));
        startActivity(er7);

    }
}
