package com.androidalians.androidpoint.Model;

import com.google.android.gms.ads.nativead.NativeAd;

public class LearnModel {

    String Description,title,Image;

    private NativeAd nativeAd;


    public LearnModel() {

    }

    public LearnModel(String description, String title,String image, NativeAd nativeAd) {
        Description = description;
        this.title = title;
        Image = image;
        this.nativeAd = nativeAd;

    }

    public LearnModel(NativeAd nativeAd) {
        this.nativeAd = nativeAd;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        this.Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NativeAd getNativeAd() {
        return nativeAd;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.nativeAd = nativeAd;
    }
}
