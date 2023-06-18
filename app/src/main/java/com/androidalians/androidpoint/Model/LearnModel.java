package com.androidalians.androidpoint.Model;

public class LearnModel {

    String Description,title,Image;


    public LearnModel() {

    }

    public LearnModel(String description, String title,String image) {
        Description = description;
        this.title = title;
        Image = image;

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
}
