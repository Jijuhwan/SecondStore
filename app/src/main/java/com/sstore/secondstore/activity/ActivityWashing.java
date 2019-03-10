package com.sstore.secondstore.activity;

<<<<<<< HEAD
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;
=======
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
>>>>>>> 02c826d073731098a745a97179a0a462639488ef

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.sstore.secondstore.R;
<<<<<<< HEAD
import com.sstore.secondstore.util.ListViewAdapter;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
=======
import com.sstore.secondstore.util.listViewAdapter;
>>>>>>> 02c826d073731098a745a97179a0a462639488ef

public class ActivityWashing extends AppCompatActivity {

    ListView listview ;
    ListViewAdapter adapter;
    ImageView imageView;

    // Firebase Storage 변수
    StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washing);

<<<<<<< HEAD
        imageView = (ImageView) findViewById(R.id.imageView);

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.washingLv);
        listview.setAdapter(adapter);

        FirebaseApp.initializeApp(this);

        // Get Firebase Storage Reference
        mStorageRef = FirebaseStorage.getInstance().getReference();
        mStorageRef.child("images");

        FirebaseStorage.getInstance().getReference().a

        public void onDataChange(DataSn)


        for()

                String folderName = "images";
                String imageName = String.format("Image%d.jpg", imageNum);

                // Storage 이미지 다운로드 경로
                String storagePath = folderName + "/" + imageName;

                StorageReference imageRef = mStorageRef.child(storagePath);


                    // Storage 에서 다운받아 저장시킬 임시파일
                    final File imageFile = File.createTempFile("images", "jpg");
                    imageRef.getFile(imageFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            // Success Case
                            Bitmap bitmapImage = BitmapFactory.decodeFile(imageFile.getPath());
                            imageView.setImageBitmap(bitmapImage);

                            Toast.makeText(getApplicationContext(), "Success !!", Toast.LENGTH_LONG).show();
                        }
                    });

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.etc),
                "Box", "Account Box Black 36dp") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.call),
                "Circle", "Account Circle Black 36dp") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.back),
                "Ind", "Assignment Ind Black 36dp") ;
    }

    public void btnCall(View v)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0314079887"));
        startActivity(intent);
=======
        ListView listView;
        listViewAdapter adapter;

        adapter = new listViewAdapter();

        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.washingmachine),
                "냉장고","갯수 : 1");
>>>>>>> 02c826d073731098a745a97179a0a462639488ef
    }
    public void btnBack(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
