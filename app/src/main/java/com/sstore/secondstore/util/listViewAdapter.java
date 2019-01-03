package com.sstore.secondstore.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sstore.secondstore.R;

import java.util.ArrayList;

public class listViewAdapter extends BaseAdapter {

    private ArrayList<listViewItem> listViewItemList = new ArrayList<listViewItem>();

    public listViewAdapter() {

    }

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listlayout, parent, false);
        }

        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.image);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title);
        TextView countTextView = (TextView) convertView.findViewById(R.id.count);

        listViewItem listViewItem = listViewItemList.get(position);

        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        countTextView.setText(listViewItem.getCount());

        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItem(Drawable icon, String title, String count)
    {
        listViewItem item = new listViewItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setCount(count);

        listViewItemList.add(item);
    }

}
