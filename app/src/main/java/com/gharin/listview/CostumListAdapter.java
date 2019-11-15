package com.gharin.listview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CostumListAdapter extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] menuItem;
    private final String[] menuLagi;
    private final Integer[] menuGambar;

    public CostumListAdapter(Activity context, String[] menuItem, Integer[] menuGambar, String[] menuLagi) {
        super(context, R.layout.activity_list, menuItem);
        this.context = context;
        this.menuItem = menuItem;
        this.menuGambar = menuGambar;
        this.menuLagi = menuLagi;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint({"ViewHolder", "InflateParams"}) View rowView = inflater.inflate(R.layout.activity_list, null, true);

        TextView textMenu = (TextView)rowView.findViewById(R.id.menuItem);
        TextView textLagi = (TextView)rowView.findViewById(R.id.menuLagi);
        ImageView imgMenu = (ImageView)rowView.findViewById(R.id.imageView);

        textMenu.setText(menuItem[position]);
        textLagi.setText(menuLagi[position]);
        imgMenu.setImageResource(menuGambar[position]);

        return rowView;
    }
}
