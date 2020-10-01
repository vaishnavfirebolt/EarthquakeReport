package com.example.earthquakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMiliSecond;
    private String mUrl;

    public Earthquake(double magnitude , String location , long TimeInMiliSecond ,String Url){
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMiliSecond = TimeInMiliSecond;
        this.mUrl = Url;
    }

    public double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public long getTimeInMiliSecond() { return mTimeInMiliSecond; }
    public String getUrl() {
        return mUrl;
    }
}
