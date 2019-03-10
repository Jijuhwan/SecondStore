package com.sstore.secondstore.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.sstore.secondstore.R;

import java.io.File;
import java.io.IOException;

public class ActivityTv extends AppCompatActivity {

    RadioGroup radioGroup;
    ImageView imageView;

    // Firebase Storage 변수
    StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        imageView = (ImageView) findViewById(R.id.imageView);

        FirebaseApp.initializeApp(this);

        // Get Firebase Storage Reference
        mStorageRef = FirebaseStorage.getInstance().getReference();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                int imageNum;
                switch (checkedId) {
                    default:
                    case R.id.radio0:
                        imageNum = 1;
                        break;
                    case R.id.radio1:
                        imageNum = 2;
                        break;
                    case R.id.radio2:
                        imageNum = 3;
                        break;
                    case R.id.radio3:
                        imageNum = 4;
                        break;
                }
                String folderName = "images";
                String imageName = String.format("Image%d.jpg", imageNum);

                // Storage 이미지 다운로드 경로
                String storagePath = folderName + "/" + imageName;

                StorageReference imageRef = mStorageRef.child(storagePath);

                try {
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
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            // Fail Case
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Fail !!", Toast.LENGTH_LONG).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}