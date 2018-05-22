package com.oritmalki.tourguideapp.Model;

import com.oritmalki.tourguideapp.R;

import java.util.ArrayList;
import java.util.List;

public class DataGen {

    //TODO add text paragraph for each place which expands on item click (hiddenview + slide down transition)

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
        Site jaffaPort = new Site("Jaffa Port");
        jaffaPort.setAddress("Namal Yafo");
        jaffaPort.setImage(R.drawable.jaffa_port);
        jaffaPort.setWebsite("https://www.namalyafo.co.il/");
        jaffaPort.setPhone("03-6832255");
        siteList.add(jaffaPort);

        Site rotchild = new Site("Rothschild Boulevard");
        rotchild.setAddress("sderot rothschild");
        rotchild.setImage(R.drawable.rotschild);
        rotchild.setWebsite("https://www.timeout.com/israel/attractions/a-stroll-down-rothschild-boulevard");
        siteList.add(rotchild);

        Site muzeumOfArt = new Site("Museum of Art");
        muzeumOfArt.setAddress("27 Shaul HaMelech Blvd ");
        muzeumOfArt.setWebsite("http://www.tamuseum.com/");
        muzeumOfArt.setImage(R.drawable.museum_of_art);
        muzeumOfArt.setPhone("03-6077020");
        muzeumOfArt.setOpeningHours("Mon, Wed, Sat 10:00-18:00; Tue, Thu 10:00-21:00; Fri 10:00-14:00");
        muzeumOfArt.setPrice("NIS 50 (Adult), NIS 40 (TLV Resident/Student), NIS 25 (Senior/Soldier), Free (Children under 18)");
        siteList.add(muzeumOfArt);

        Site sarona = new Site("Sarona Market");
        sarona.setAddress("3 Aluf Kalman Magen");
        sarona.setImage(R.drawable.sarona_market);
        sarona.setWebsite("http://saronamarket.co.il/en");
        sarona.setPhone("03-6242424");
        sarona.setOpeningHours("Sun-Thu 09:00-23:00; Fri 08:00-18:00; Sat 09:00-23:00");
        siteList.add(sarona);

        Site promenade = new Site("Promenade");
        promenade.setAddress("Tel Aviv Boardwalk Tourist Information Center, 46 Retsif Herbert Samuel St ");
        promenade.setPhone("03-5166188");
        promenade.setImage(R.drawable.tel_aviv_promenade_panoramics);
        promenade.setOpeningHours("Tel Aviv Boardwalk Tourist Information Center open Daily until 17:30");
        promenade.setWebsite("https://www.visit-tel-aviv.com/");
        siteList.add(promenade);

        return siteList;
    }
}
