package com.polsec.pyrky.pyrkylibrary;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.polsec.pyrky.nearestcameralibrary.NearestCameras;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {
    Context context = this;
    EditText imageUrl,CameraLat,CameraLong;
    Button uploadButton;
    ImageView responseImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageUrl = findViewById(R.id.camera_image_url);
        CameraLat = findViewById(R.id.camera_latitude);
        CameraLong = findViewById(R.id.camera_longitude);
        uploadButton = findViewById(R.id.upload_button);
        responseImage = findViewById(R.id.response_image);

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String imageurl = imageUrl.getText().toString().trim();
                double lat = Double.parseDouble(CameraLat.getText().toString());
                double lng = Double.parseDouble(CameraLong.getText().toString());

                Bitmap image = BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher);

                NearestCameras nearestCameras = new NearestCameras();

                Bitmap response = nearestCameras.uploadCameraAndLatLng(image,lat,lng);

                responseImage.setImageBitmap(response);

            }
        });
    }
}
