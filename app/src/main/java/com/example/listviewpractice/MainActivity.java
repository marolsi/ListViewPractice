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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ColorItem> colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new ArrayList<>();
        colors.add(new ColorItem("Red", Color.RED));
        colors.add(new ColorItem("Blue", Color.BLUE));
        colors.add(new ColorItem("Green", Color.GREEN));
        colors.add(new ColorItem("White", Color.WHITE));
        colors.add(new ColorItem("Black", Color.BLACK));
        colors.add(new ColorItem("Yellow", Color.YELLOW));

        final ListView listView = (ListView)findViewById(R.id.listView);
        final ArrayAdapter<ColorItem> adapter = new ColorAdapter(this, colors);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                colors.remove(i);
                adapter.notifyDataSetChanged();
                Log.d("debug", "Current size of colors: " + colors.size());
            }
        });
    }
}
