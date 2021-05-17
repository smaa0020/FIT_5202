package com.example.test.bean;

public class VegetationBean {
    private int id;
    private String vegeType;
    private String name;
    private String latitude;
    private String longitude;
    private String intro;
    private String img_url;

    public int getId() {
        return id;
    }

    public String getVegeType() {
        return vegeType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getIntro() {
        return intro;
    }

    public String getImg_url() {
        return img_url;
    }
}
