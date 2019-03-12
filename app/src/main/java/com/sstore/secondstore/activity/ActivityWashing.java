package com.sstore.secondstore.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.sstore.secondstore.R;
import com.sstore.secondstore.util.listViewAdapter;

import java.io.File;


public class ActivityWashing extends AppCompatActivity {

    ListView listview ;
    ImageView imageView;

    // Firebase Storage 변수
    StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washing);

        imageView = (ImageView) findViewById(R.id.imageView);


        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.washingLv);

        FirebaseApp.initializeApp(this);

        // Get Firebase Storage Reference
        mStorageRef = FirebaseStorage.getInstance().getReference();
        mStorageRef.child("images");

        // 첫 번째 아이템 추가.
        /*adapter.addItem(ContextCompat.getDrawable(this, R.drawable.etc),
                "Box", "Account Box Black 36dp") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.call),
                "Circle", "Account Circle Black 36dp") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.back),
                "Ind", "Assignment Ind Black 36dp") ;*/
    }

    public void btnCall(View v)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0314079887"));
        startActivity(intent);

        ListView listView;
        listViewAdapter adapter;

        adapter = new listViewAdapter();

        listView = (ListView)findViewById(R.id.washingLv);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.washingmachine),
                "냉장고","갯수 : 1");
    }
    public void btnBack(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
