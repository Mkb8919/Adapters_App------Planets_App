package com.example.adaptersapp;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
    private Context context;
    private String[] items;

    public MyCustomAdapter(Context context, String[] items){
        this.context = context;
        this.items = items;
    }


    @Override
    public int getCount() {
        return items.length; // Returns the number of items in your data source
    }

    @Override
    public Object getItem(int position) {
        return null; // Returns the data item at the given position
    }
    @Override
    public long getItemId(int position){
        return position; // Returns the unique Identifier for the item at the given position
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        
        if(convertView == null){
            // convertview : is a recycled view that you can reuse to
            //              improve the performance of your list.
            convertView = LayoutInflater.from(context).
                         inflate(R.layout.my_list_item, parent, false);

        }else {
            // Reusing the View (that's recycled)
            holder = (ViewHolder) convertView.getTag();
        }

        // Set the data to the vuew
        holder.textView.setText(items[position]);


        // Biding date to views within the convertView
        return  convertView; // Displays the data at a position in the data set
    }
    static class  ViewHolder{
        // Holds references to the views within an item layout
        TextView textView;


    }
}

