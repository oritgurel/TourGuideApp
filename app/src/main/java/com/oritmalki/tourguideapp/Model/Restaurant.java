package com.oritmalki.tourguideapp.Model;

public class Restaurant extends Attraction {

    String type;


    public Restaurant(String name) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
