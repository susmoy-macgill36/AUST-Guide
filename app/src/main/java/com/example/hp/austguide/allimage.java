package com.example.hp.austguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class allimage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allimage);
        int image = getIntent().getIntExtra("image", R.drawable.extrapic);
        ImageView imageView = (ImageView) findViewById(R.id.imgview);
        imageView.setImageResource(image);
    }
}
