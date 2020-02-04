package com.example.hp.austguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hp.austguide.database1.DatabaseHelper2;

public class Details2 extends AppCompatActivity {
    String[] data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);
       ListView lv = (ListView) findViewById(R.id.lstvw);

        DatabaseHelper2 m = new DatabaseHelper2(this);

        data = m.qdata();


        lv.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.laout_listview, R.id.ed5, data));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), Details3.class);
                i.putExtra("MyKEY", position);
                startActivity(i);
            }
        });


    }
}
