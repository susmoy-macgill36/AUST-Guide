package com.example.hp.austguide;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class allcgpaview extends AppCompatActivity {
    TextToSpeech t;
    TextView f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allcgpaview);

        Intent intent = getIntent();
        String msg1 = intent.getStringExtra(cgpacse11.cse11marks);


         f= (TextView) findViewById(R.id.txt19);
        f.setText(msg1); /////eeee


        Button so= (Button) findViewById(R.id.ttsbtn);
        t=new TextToSpeech(getApplicationContext(),new TextToSpeech.OnInitListener()
        {
            public void onInit(int status)
            {
                if(status!=TextToSpeech.ERROR)
                    t.setLanguage(Locale.ENGLISH);
            }
        });
    }


    public  void onclick123(View view)
    {
        String string =f.getText().toString();
        t.speak(string,TextToSpeech.QUEUE_FLUSH,null);
    }
}
