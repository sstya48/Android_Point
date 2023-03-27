package com.example.androidpoint.Model;

public class LearnModel {

    String Description,title;

    String image;

    public LearnModel() {
    }

    public LearnModel(String description, String title) {
        Description = description;
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
