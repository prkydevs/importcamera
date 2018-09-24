package com.polsec.pyrky.nearestcameralibrary;

import java.util.HashMap;
import java.util.Hashtable;

public class Camera {

    private String cameraLat;
    private String cameraLong;
    private String parkingTypes;
    private String cameraID;

    private String carCategory;
    private String SecurityRatings;
    private HashMap<String,Object> parkingRules;
    private HashMap<String,Object> carLocation;
    private HashMap<String,Object> parkingSlots;
    private String cameraLocationName;
    private String videoUrl;
    private String roadWidth;
    private String cameraFacingDirection;
    private String ListofcarsPosition;
    private String ListofObstacles;
    private String cameraImageUrl;

    public Camera() {

    }

    public Camera(String cameraLat, String cameraLong, String parkingTypes, String cameraID, String carCategory, String securityRatings, HashMap<String, Object> parkingRules, HashMap<String, Object> carLocation, HashMap<String, Object> parkingSlots, String cameraLocationName, String videoUrl, String roadWidth, String cameraFacingDirection, String listofcarsPosition, String listofObstacles, String cameraImageUrl) {
        this.cameraLat = cameraLat;
        this.cameraLong = cameraLong;
        this.parkingTypes = parkingTypes;
        this.cameraID = cameraID;
        this.carCategory = carCategory;
        SecurityRatings = securityRatings;
        this.parkingRules = parkingRules;
        this.carLocation = carLocation;
        this.parkingSlots = parkingSlots;
        this.cameraLocationName = cameraLocationName;
        this.videoUrl = videoUrl;
        this.roadWidth = roadWidth;
        this.cameraFacingDirection = cameraFacingDirection;
        ListofcarsPosition = listofcarsPosition;
        ListofObstacles = listofObstacles;
        this.cameraImageUrl = cameraImageUrl;
    }

    public String getCameraLat() {
        return cameraLat;
    }

    public void setCameraLat(String cameraLat) {
        this.cameraLat = cameraLat;
    }

    public String getCameraLong() {
        return cameraLong;
    }

    public void setCameraLong(String cameraLong) {
        this.cameraLong = cameraLong;
    }

    public String getParkingTypes() {
        return parkingTypes;
    }

    public void setParkingTypes(String parkingTypes) {
        this.parkingTypes = parkingTypes;
    }

    public String getCameraID() {
        return cameraID;
    }

    public void setCameraID(String cameraID) {
        this.cameraID = cameraID;
    }

    public String getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    public String getSecurityRatings() {
        return SecurityRatings;
    }

    public void setSecurityRatings(String securityRatings) {
        SecurityRatings = securityRatings;
    }

    public HashMap<String, Object> getParkingRules() {
        return parkingRules;
    }

    public void setParkingRules(HashMap<String, Object> parkingRules) {
        this.parkingRules = parkingRules;
    }

    public HashMap<String, Object> getCarLocation() {
        return carLocation;
    }

    public void setCarLocation(HashMap<String, Object> carLocation) {
        this.carLocation = carLocation;
    }

    public HashMap<String, Object> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(HashMap<String, Object> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public String getCameraLocationName() {
        return cameraLocationName;
    }

    public void setCameraLocationName(String cameraLocationName) {
        this.cameraLocationName = cameraLocationName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getRoadWidth() {
        return roadWidth;
    }

    public void setRoadWidth(String roadWidth) {
        this.roadWidth = roadWidth;
    }

    public String getCameraFacingDirection() {
        return cameraFacingDirection;
    }

    public void setCameraFacingDirection(String cameraFacingDirection) {
        this.cameraFacingDirection = cameraFacingDirection;
    }

    public String getListofcarsPosition() {
        return ListofcarsPosition;
    }

    public void setListofcarsPosition(String listofcarsPosition) {
        ListofcarsPosition = listofcarsPosition;
    }

    public String getListofObstacles() {
        return ListofObstacles;
    }

    public void setListofObstacles(String listofObstacles) {
        ListofObstacles = listofObstacles;
    }

    public String getCameraImageUrl() {
        return cameraImageUrl;
    }

    public void setCameraImageUrl(String cameraImageUrl) {
        this.cameraImageUrl = cameraImageUrl;
    }
}
