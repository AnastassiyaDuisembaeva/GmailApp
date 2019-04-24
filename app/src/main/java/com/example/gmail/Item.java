package com.example.gmail;

public class Item {
    private String title;
    private String message;
    private String date;
    private int imageLogo;
    private int imageStar;

    public Item(String title, String message, String date, int imageLogo, int imageStar){

        this.title=title;
        this.message = message;
        this.date = date;
        this.imageLogo = imageLogo;
        this.imageStar = imageStar;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public int getImageLogo() {
        return this.imageLogo;
    }

    public void setImageLogo(int imageLogo) {
        this.imageLogo = imageLogo;
    }
    public int getImageStar() {
        return this.imageStar;
    }

    public void setImageStar(int imageStar) {
        this.imageStar = imageStar;
    }

}
