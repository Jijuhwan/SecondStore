package com.sstore.secondstore.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.sstore.secondstore.R;
import com.sstore.secondstore.util.listViewAdapter;

public class ActivityWashing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washing);

        ListView listView;
        listViewAdapter adapter;

        adapter = new listViewAdapter();

        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.washingmachine),
                "냉장고","갯수 : 1");
    }
}
