package com.example.listviewpractice;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] colors = {"Red","Blue","Green","White","Black","Yellow"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                        android.R.id.text1, colors);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ColorDrawable c = (ColorDrawable) view.getBackground();
                if (c != null) {
                    if (c.getColor() == Color.GRAY) {
                        view.setBackgroundColor(Color.WHITE);
                    } else {
                        view.setBackgroundColor(Color.GRAY);
                    }
                } else {
                    view.setBackgroundColor(Color.WHITE);
                }
            }
        });
    }
}