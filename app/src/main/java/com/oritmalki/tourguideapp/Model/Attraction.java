package com.oritmalki.tourguideapp.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Attraction implements Parcelable {

    private String name;
    private String address;
    private String phone;
    private int image;
    private String mapLocation;
    private String website;
    private String description;
    private String price;
    private String openingHours;

    public Attraction(String name) {
        this.name = name;
    }

    protected Attraction(Parcel in) {
        name = in.readString();
        address = in.readString();
        phone = in.readString();
        image = in.readInt();
        mapLocation = in.readString();
        website = in.readString();
        description = in.readString();
        price = in.readString();
        openingHours = in.readString();
    }

    public static final Creator<Attraction> CREATOR = new Creator<Attraction>() {
        @Override
        public Attraction createFromParcel(Parcel in) {
            return new Attraction(in);
        }

        @Override
        public Attraction[] newArray(int size) {
            return new Attraction[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(String mapLocation) {
        this.mapLocation = mapLocation;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(phone);
        dest.writeInt(image);
        dest.writeString(mapLocation);
        dest.writeString(website);
        dest.writeString(description);
        dest.writeString(price);
        dest.writeString(openingHours);
    }
}
