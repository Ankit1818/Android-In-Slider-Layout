package com.example.mobile_zone2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class BaseAdapter extends android.widget.BaseAdapter
{
    Context context;
    int image1[];
    String[] text1;

    BaseAdapter(Context context,int image1[],String text[])
    {
        this.context=context;
        this.image1=image1;
        this.text1=text;
    }

    @Override
    public int getCount()
    {
        return image1.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater in = LayoutInflater.from(context);
        convertView=in.inflate(R.layout.design,parent,false);

        TextView textView = convertView.findViewById(R.id.t1);
        ImageView imageView = convertView.findViewById(R.id.i1);

        textView.setText(text1[position]);
        imageView.setImageResource(image1[position]);

        return convertView;
    }
}
