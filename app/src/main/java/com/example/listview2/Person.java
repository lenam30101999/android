package com.example.listview2;

public class Person {
    private String maSV;
    private String nameSV;
    private String gender;
    private int imgId;

    public Person(String maSV, String nameSV, String gender, int imgId) {
        this.maSV = maSV;
        this.nameSV = nameSV;
        this.gender = gender;
        this.imgId = imgId;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNameSV() {
        return nameSV;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
