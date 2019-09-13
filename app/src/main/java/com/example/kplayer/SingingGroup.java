package com.example.kplayer;

public class SingingGroup {

    String profileName;
    int background_img;
    int profilePhoto;
    String composer;

    public SingingGroup() { }

    public SingingGroup(String profileName, int background, int profilePhoto, String composer) {
        this.profileName = profileName;
        this.background_img = background;
        this.profilePhoto = profilePhoto;
        this.composer = composer;
    }

    public String getProfileName() {
        return profileName;
    }

    public int getBackground() {
        return background_img;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public String getFollowers() {
        return composer;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setBackground(int background) {
        this.background_img = background;
    }

    public void setProfilePhoto(int profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public void setComposer(int followers) {
        this.composer = composer;
    }
}
