package com.sstore.secondstore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
    public void llNaver(View v)
    {
        String url ="https://cafe.naver.com/jjm9892";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
