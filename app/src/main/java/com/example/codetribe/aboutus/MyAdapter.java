package com.example.codetribe.aboutus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by codetribe on 9/11/2017.
 */


public class MyAdapter extends ArrayAdapter {

    ArrayList<Item> peopleList = new ArrayList<>();

    public MyAdapter(Context context, int textViewResourceId, ArrayList objects) {
        super(context, textViewResourceId, objects);
        peopleList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.activity_grid, null);
        TextView textView =  v.findViewById(R.id.textView);
        ImageView imageView =  v.findViewById(R.id.imageView);
        textView.setText(peopleList.get(position).getPeopleName());
        imageView.setImageResource(peopleList.get(position).getpeopleImage());
        return v;

    }

}