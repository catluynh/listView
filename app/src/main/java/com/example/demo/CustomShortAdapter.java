package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomShortAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Short> arrayList;

    public CustomShortAdapter(Context ctx, int layoutItem, ArrayList<Short> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(ctx).
                inflate(layoutItem,viewGroup,false);

        TextView tvName=view.findViewById(R.id.tvName);
        TextView tvPrice=view.findViewById(R.id.tvPrice);
        ImageView imageShort=view.findViewById(R.id.imageShort);

        tvName.setText(arrayList.get(i).getName());
        tvPrice.setText(arrayList.get(i).getPrice());
        imageShort.setImageResource(arrayList.get(i).getImageShort());
        return view;
    }
}
