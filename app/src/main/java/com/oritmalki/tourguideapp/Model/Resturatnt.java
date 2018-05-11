package com.oritmalki.tourguideapp.Model;

public class Resturatnt extends Attraction {

    String type;


    public Resturatnt(String name) {
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
