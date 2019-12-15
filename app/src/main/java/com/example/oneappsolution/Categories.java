package com.example.oneappsolution;

public class Categories {
    int image;
    String category;
    String card_category;


    public String getCard_category() {
        return card_category;
    }

    public void setCard_category(String card_category) {
        this.card_category = card_category;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Categories(int image, String category, String card_category) {
        this.image = image;
        this.category = category;
        this.card_category = card_category;
    }
}
