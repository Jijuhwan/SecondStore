package com.sstore.secondstore.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sstore.secondstore.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Fridge(View v)
    {
        Intent intent = new Intent(this, ActivityFridge.class);
        startActivity(intent);
    }

    public void Washing(View v)
    {
        Intent intent = new Intent(this, ActivityWashing.class);
        startActivity(intent);
    }

    public void Aircon(View v)
    {
        Intent intent = new Intent(this, ActivityAircon.class);
        startActivity(intent);
    }

    public void Tv(View v)
    {
        Intent intent = new Intent(this, ActivityTv.class);
        startActivity(intent);
    }

    public void Etc(View v)
    {
        Intent intent = new Intent(this, ActivityEtc.class);
        startActivity(intent);
    }

    public void Furniture(View v)
    {
        Intent intent = new Intent(this, ActivityFurniture.class);
        startActivity(intent);
    }
    public void llNaver(View v)
    {
        String url ="https://cafe.naver.com/jjm9892";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
