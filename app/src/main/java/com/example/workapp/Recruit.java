package com.example.workapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Recruit implements Parcelable {
    private String companyName;
    private String title;
    private String pay;
    private String date;
    private String area;
    private String rccontent;
    private String closingDate;

    public Recruit(Parcel parcel){
        this.companyName = parcel.readString();
        this.title = parcel.readString();
        this.pay = parcel.readString();
        this.date = parcel.readString();
        this.area = parcel.readString();
        this.rccontent = parcel.readString();
        this.closingDate = parcel.readString();
    }

    public Recruit(String companyName, String title, String pay, String date, String area, String rccontent, String closingDate){
        this.companyName = companyName;
        this.title = title;
        this.pay = pay;
        this.date = date;
        this.area = area;
        this.rccontent = rccontent;
        this.closingDate = closingDate;
    }

    public String getCompanyName(){
        return companyName;
    }

    public void  setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPay() { return pay;}

    public void setPay(String pay) { this.pay = pay;}

    public String getDate() { return date;}
    public void setDate(String date) { this.date = date;}

    public String getArea() { return area;}
    public void setArea(String area) { this.area = area;}

    public String getRcContent() { return rccontent;}
    public void setRcContent(String rccontent) { this.rccontent = rccontent;}

    public String getClosingDate() { return closingDate;}
    public void setClosingDate(String closingDate) { this.closingDate = closingDate;}


    public static final Parcelable.Creator<Recruit> CREATOR = new Parcelable.Creator<Recruit>(){
        @Override
        public Recruit createFromParcel(Parcel parcel){
            return new Recruit(parcel);
        }
        @Override
        public Recruit[] newArray(int size){
            return new Recruit[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(companyName);
        parcel.writeString(title);
        parcel.writeString(pay);
        parcel.writeString(date);
        parcel.writeString(area);
        parcel.writeString(rccontent);
        parcel.writeString(closingDate);
    }
}