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
    ColorItem[] colors = {new ColorItem("Red", Color.RED),new ColorItem("Blue", Color.BLUE),new ColorItem("Green", Color.GREEN),
            new ColorItem("White", Color.WHITE),new ColorItem("Black", Color.BLACK),new ColorItem("Yellow", Color.YELLOW)};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<ColorItem> adapter = new ColorAdapter(this, colors);
        listView.setAdapter(adapter);
    }
}
