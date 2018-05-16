package com.oritmalki.tourguideapp.Model;

import com.oritmalki.tourguideapp.R;

import java.util.ArrayList;
import java.util.List;

public class DataGen {

    public static List<Attraction> initializeData(List<Attraction> attractionList) {
        //Data generation
        attractionList = new ArrayList<>();

        Attraction rest = new Attraction("Restaurants");
        rest.setImage(R.drawable.resturants);
        attractionList.add(rest);

        Attraction events = new Attraction("Events");
        events.setImage(R.drawable.events);
        attractionList.add(events);

        Attraction sites = new Attraction("Sites");
        sites.setImage(R.drawable.sites);
        attractionList.add(sites);

        return attractionList;
    }

    public static List<Restaurant> initRestaurantListData(List<Restaurant> resturatnts) {

        resturatnts = new ArrayList<>();

        Restaurant claroRest = new Restaurant("Claro");
        claroRest.setType("Mediterranean");
        claroRest.setAddress("Rav Aluf David Elazar St 30");
        claroRest.setPhone("+972 3-601-7777");
        claroRest.setWebsite("http://www.clarotlv.com/");
        claroRest.setImage(R.drawable.claro__tlv);
        resturatnts.add(claroRest);

        Restaurant hakosemRest = new Restaurant("HaKosem");
        hakosemRest.setType("Mediterranean");
        hakosemRest.setAddress("Shlomo ha-Melekh St 1");
        hakosemRest.setPhone("+972 3-525-2033");
        hakosemRest.setWebsite("https://m.facebook.com/pages/%D7%94%D7%A7%D7%95%D7%A1%D7%9D/120889484655916");
        hakosemRest.setImage(R.drawable.hakosem_tlv);
        resturatnts.add(hakosemRest);

        Restaurant miznonRest = new Restaurant("Miznon");
        miznonRest.setType("Mediterranean");
        miznonRest.setAddress("Shlomo Ibn Gabirol St 23");
        miznonRest.setPhone("+972 3-716-8977");
        miznonRest.setWebsite("https://miznon.com/he/");
        miznonRest.setImage(R.drawable.miznon__tlv);
        resturatnts.add(miznonRest);

        Restaurant onzaRest = new Restaurant("Onza");
        onzaRest.setType("Mediterranean");
        onzaRest.setAddress("Rabbi Hannina St. 3");
        onzaRest.setPhone("+972 3-648-6060");
        onzaRest.setWebsite("http://www.onza.co.il/he");
        onzaRest.setImage(R.drawable.onza__tlv);
        resturatnts.add(onzaRest);

        return resturatnts;
    }

    public static List<Site> initSiteListData(List<Site> siteList) {

        siteList = new ArrayList<>();
        //siteList.add()


        return siteList;
    }
}
