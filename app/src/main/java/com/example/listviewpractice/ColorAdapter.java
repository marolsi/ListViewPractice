package com.example.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mariah on 10/21/17.
 */

public class ColorAdapter extends ArrayAdapter<ColorItem> {
    public ColorAdapter(Context context, ColorItem[] objects) {
        super(context, R.layout.color_list_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ColorItem color = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.color_list_item, parent, false);

        TextView textViewColor = (TextView) convertView.findViewById(R.id.textViewColor);

        //set the data from the email object
        textViewColor.setText(color.getName());
        textViewColor.setTextColor(color.getId());
        return convertView;
    }
}
