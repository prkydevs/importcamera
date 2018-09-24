package com.polsec.pyrky.nearestcameralibrary;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.Toast;

public class NearestCameras {

    double mLatitude;
    double mLongitude;

//    public NearestCameras(double mLatitude, double mLongitude) {
//        this.mLatitude = mLatitude;
//        this.mLongitude = mLongitude;
//    }

    public Bitmap uploadCameraAndLatLng(Bitmap cameraImageUrl, double latitude, double longitude){

        String latLng = String.valueOf(cameraImageUrl+" at "+latitude+longitude+" has been uploaded successfully");
        return cameraImageUrl;
    }

}
