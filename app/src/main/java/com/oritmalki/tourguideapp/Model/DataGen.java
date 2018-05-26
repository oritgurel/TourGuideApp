package com.oritmalki.tourguideapp.Model;

import android.content.Context;

import com.oritmalki.tourguideapp.App;
import com.oritmalki.tourguideapp.R;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class DataGen {

    public static Context context = App.getmContext();


    //TODO add text paragraph for each place which expands on item click (hiddenview + slide down transition)

    public static List<Attraction> initializeData(List<Attraction> attractionList) {
        //Data generation
        attractionList = new ArrayList<>();

        Attraction rest = new Attraction(context.getResources().getString(R.string.restaurants));
        rest.setImage(R.drawable.resturants);
        attractionList.add(rest);

        Attraction events = new Attraction(context.getResources().getString(R.string.events));
        events.setImage(R.drawable.events);
        attractionList.add(events);

        Attraction sites = new Attraction(context.getResources().getString(R.string.sites));
        sites.setImage(R.drawable.sites);
        attractionList.add(sites);
        
        Attraction hotels = new Attraction(context.getString(R.string.hotels));
        hotels.setImage(R.drawable.hotels);
        attractionList.add(hotels);


        return attractionList;
    }

    public static List<Restaurant> initRestaurantListData(List<Restaurant> resturatnts) {

        resturatnts = new ArrayList<>();

        Restaurant claroRest = new Restaurant(context.getString(R.string.claro));
        claroRest.setType(context.getString(R.string.mediterranean));
        claroRest.setAddress(context.getString(R.string.claro_address));
        claroRest.setPhone(context.getString(R.string.claro_phone));
        claroRest.setWebsite(context.getString(R.string.claro_website));
        claroRest.setImage(R.drawable.claro__tlv);
        claroRest.setDescription(context.getString(R.string.claro_description));
        resturatnts.add(claroRest);

        Restaurant hakosemRest = new Restaurant(context.getString(R.string.hakosem));
        hakosemRest.setType(context.getString(R.string.mediterranean));
        hakosemRest.setAddress(context.getString(R.string.hakosem_address));
        hakosemRest.setPhone(context.getString(R.string.hakosem_phone));
        hakosemRest.setWebsite(context.getString(R.string.hakosem_website));
        hakosemRest.setImage(R.drawable.hakosem_tlv);
        hakosemRest.setDescription(context.getString(R.string.hakosem_description));
        resturatnts.add(hakosemRest);

        Restaurant miznonRest = new Restaurant(context.getString(R.string.miznon));
        miznonRest.setType(context.getString(R.string.mediterranean));
        miznonRest.setAddress(context.getString(R.string.miznon_address));
        miznonRest.setPhone(context.getString(R.string.miznon_phone));
        miznonRest.setWebsite(context.getString(R.string.miznon_website));
        miznonRest.setImage(R.drawable.miznon__tlv);
        miznonRest.setDescription(context.getString(R.string.miznon_description));
        resturatnts.add(miznonRest);

        Restaurant onzaRest = new Restaurant(context.getString(R.string.onza));
        onzaRest.setType(context.getString(R.string.mediterranean));
        onzaRest.setAddress(context.getString(R.string.onza_address));
        onzaRest.setPhone(context.getString(R.string.onza_phone));
        onzaRest.setDescription(context.getString(R.string.onza_description));
        onzaRest.setWebsite(context.getString(R.string.onza_website));
        onzaRest.setImage(R.drawable.onza__tlv);
        resturatnts.add(onzaRest);

        return resturatnts;
    }

    public static List<Site> initSiteListData(List<Site> siteList) {

        siteList = new ArrayList<>();
        Site jaffaPort = new Site(context.getString(R.string.jaffa_port));
        jaffaPort.setAddress(context.getString(R.string.jaffa_port_address));
        jaffaPort.setImage(R.drawable.jaffa_port);
        jaffaPort.setWebsite(context.getString(R.string.jaffa_port_website));
        jaffaPort.setPhone(context.getString(R.string.jaffa_port_phone));
        jaffaPort.setDescription(context.getString(R.string.jaffa_port_description));
        siteList.add(jaffaPort);

        Site rotchild = new Site(context.getString(R.string.rothschild));
        rotchild.setAddress(context.getString(R.string.rothschild_address));
        rotchild.setImage(R.drawable.rotschild);
        rotchild.setWebsite(context.getString(R.string.rothschild_website));
        rotchild.setDescription(context.getString(R.string.rothschild_description));
        siteList.add(rotchild);

        Site muzeumOfArt = new Site(context.getString(R.string.art_museum));
        muzeumOfArt.setAddress(context.getString(R.string.art_museum_address));
        muzeumOfArt.setWebsite(context.getString(R.string.art_museum_website));
        muzeumOfArt.setImage(R.drawable.museum_of_art);
        muzeumOfArt.setPhone(context.getString(R.string.art_museum_phone));
        muzeumOfArt.setOpeningHours(context.getString(R.string.art_museum_opening_hours));
        muzeumOfArt.setPrice(context.getString(R.string.art_museum_price));
        muzeumOfArt.setDescription(context.getString(R.string.art_museum_description));
        siteList.add(muzeumOfArt);

        Site sarona = new Site(context.getString(R.string.sarona));
        sarona.setAddress(context.getString(R.string.sarona_address));
        sarona.setImage(R.drawable.sarona_market);
        sarona.setWebsite(context.getString(R.string.sarona_website));
        sarona.setPhone(context.getString(R.string.sarona_phone));
        sarona.setOpeningHours(context.getString(R.string.sarona_opening_hours));
        sarona.setDescription(context.getString(R.string.sarona_description));
        siteList.add(sarona);

        Site promenade = new Site(context.getString(R.string.promenade));
        promenade.setAddress(context.getString(R.string.promenade_address));
        promenade.setPhone(context.getString(R.string.promenade_phone));
        promenade.setImage(R.drawable.tel_aviv_promenade_panoramics);
        promenade.setOpeningHours(context.getString(R.string.promenade_opening_hours));
        promenade.setWebsite(context.getString(R.string.promenade_website));
        promenade.setDescription(context.getString(R.string.promenade_description));
        siteList.add(promenade);

        return siteList;
    }

    public static List<Event> initEventListData(List<Event> eventList) {

        eventList = new ArrayList<>();

        Event whiteNoise = new Event(context.getString(R.string.white_noise));
        whiteNoise.setType(context.getString(R.string.dance));
        whiteNoise.setImage(R.drawable.white_noise);
        whiteNoise.setWebsite(context.getString(R.string.white_noise_website));
        whiteNoise.setPhone(context.getString(R.string.white_noise_phone));
        whiteNoise.setVenue(context.getString(R.string.white_noise_venue));
        whiteNoise.setAddress(context.getString(R.string.white_noise_address));
        whiteNoise.setDescription(context.getString(R.string.white_noise_description));
        List<DateTime> whiteNoiseDates =  new ArrayList<>();
        whiteNoiseDates.add(new DateTime(2018, 5, 30, 20, 0, 0));
        whiteNoiseDates.add(new DateTime(2018, 5, 25, 14, 0,0));
        whiteNoiseDates.add(new DateTime(2018, 5, 24, 21, 0, 0));
        whiteNoiseDates.add(new DateTime(2018, 5, 23, 21, 0, 0));
        whiteNoise.setDates(whiteNoiseDates);
        eventList.add(whiteNoise);

        Event lollipopFest = new Event(context.getString(R.string.lollipop_fest));
        lollipopFest.setType(context.getString(R.string.music));
        lollipopFest.setImage(R.drawable.lollopop_festival);
        lollipopFest.setPrice(context.getString(R.string.lollipop_fest_price));
        lollipopFest.setAddress(context.getString(R.string.lollipop_fest_address));
        lollipopFest.setVenue(context.getString(R.string.lollipop_fest_venue));
        lollipopFest.setWebsite(context.getString(R.string.lollipop_fest_website));
        lollipopFest.setDescription(context.getString(R.string.lollipop_fest_description));

        List<DateTime> lollipopDates = new ArrayList<>();
        lollipopDates.add(new DateTime(2018, 8, 1, 18, 00, 0));
        lollipopFest.setDates(lollipopDates);
        eventList.add(lollipopFest);

        Event ringo = new Event(context.getString(R.string.ringo));
        ringo.setType(context.getString(R.string.music));
        ringo.setImage(R.drawable.ringo);
        ringo.setAddress(context.getString(R.string.ringo_address));
        ringo.setWebsite(context.getString(R.string.ringo_website));
        ringo.setVenue(context.getString(R.string.ringo_venue));
        ringo.setDescription(context.getString(R.string.ringo_description));

        List<DateTime> ringoDates = new ArrayList<>();
        ringoDates.add(new DateTime(2018, 6, 23, 18, 00, 0));
        ringo.setDates(ringoDates);
        eventList.add(ringo);

        Event purim = new Event(context.getString(R.string.purim));
        purim.setType(context.getString(R.string.party));
        purim.setAddress(context.getString(R.string.purim_address));
        purim.setVenue(context.getString(R.string.purim_venue));
        purim.setImage(R.drawable.purimtelaviv);
        purim.setDescription(context.getString(R.string.purim_description));
        purim.setPrice(context.getString(R.string.purim_price));

        List<DateTime> purimDates = new ArrayList<>();
        purimDates.add(new DateTime(2018, 3, 2, 14, 00, 0));
        purim.setDates(purimDates);
        eventList.add(purim);

        Event eurovision = new Event(context.getString(R.string.eurovision));
        eurovision.setType(context.getString(R.string.music));
        eurovision.setImage(R.drawable.eurovision_song_contest_jerusalem_israel_2019_e1526195714822);
        eurovision.setAddress(context.getString(R.string.eurovision_address));
        eurovision.setVenue(context.getString(R.string.eurovision_venue));
        eurovision.setDescription(context.getString(R.string.eurovision_description));
        eurovision.setWebsite(context.getString(R.string.eurovision_website));

        List<DateTime> eurovisionDates = new ArrayList<>();
        eurovisionDates.add(new DateTime(2019, 5, 1, 1, 00, 0));
        eurovision.setDates(eurovisionDates);
        eventList.add(eurovision);

        return eventList;
    }

    public static List<Hotel> initHotelsListData(List<Hotel> hotelList) {

        hotelList = new ArrayList<>();

        Hotel theNorman = new Hotel(context.getString(R.string.norman_hotel));
        theNorman.setImage(R.drawable.norman_hotel);
        theNorman.setAddress(context.getString(R.string.norman_address));
        theNorman.setDescription(context.getString(R.string.norman_description));
        theNorman.setPhone(context.getString(R.string.norman_phone));
        theNorman.setWebsite(context.getString(R.string.norman_website));
        hotelList.add(theNorman);

        Hotel marketHouse = new Hotel(context.getString(R.string.market_house_hotel));
        marketHouse.setImage(R.drawable.market_house_hotel);
        marketHouse.setAddress(context.getString(R.string.market_hotel_address));
        marketHouse.setPhone(context.getString(R.string.market_hotel_phone));
        marketHouse.setDescription(context.getString(R.string.market_hotel_description));
        marketHouse.setWebsite(context.getString(R.string.market_hotel_website));
        hotelList.add(marketHouse);

        Hotel poliHotel = new Hotel(context.getString(R.string.poli_hotel));
        poliHotel.setImage(R.drawable.the_poli_house);
        poliHotel.setAddress(context.getString(R.string.poli_hotel_address));
        poliHotel.setPhone(context.getString(R.string.poli_hotel_phone));
        poliHotel.setDescription(context.getString(R.string.poli_hotel_description));
        poliHotel.setWebsite(context.getString(R.string.poli_hotel_website));
        hotelList.add(poliHotel);

        Hotel whiteVilla = new Hotel(context.getString(R.string.white_villa_hotel));
        whiteVilla.setImage(R.drawable.white_villa_hotel);
        whiteVilla.setAddress(context.getString(R.string.white_villa_address));
        whiteVilla.setPhone(context.getString(R.string.white_villa_phone));
        whiteVilla.setDescription(context.getString(R.string.white_villa_decription));
        whiteVilla.setWebsite(context.getString(R.string.white_villa_website));
        hotelList.add(whiteVilla);

        Hotel cucuHotel = new Hotel(context.getString(R.string.cucu_hotel));
        cucuHotel.setImage(R.drawable.cucu_hotel);
        cucuHotel.setAddress(context.getString(R.string.cucu_hotel_address));
        cucuHotel.setDescription(context.getString(R.string.cucu_hotel_descriptionb));
        cucuHotel.setPhone(context.getString(R.string.cucu_hotel_phone));
        cucuHotel.setWebsite(context.getString(R.string.cucu_hotel_website));
        hotelList.add(cucuHotel);

        return hotelList;
    }
}
