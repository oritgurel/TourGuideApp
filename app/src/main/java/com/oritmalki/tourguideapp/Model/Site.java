package com.oritmalki.tourguideapp.Model;

public class Site extends Attraction {

    String openingHours;
    String price;

    public Site(String name) {
        super(name);
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
