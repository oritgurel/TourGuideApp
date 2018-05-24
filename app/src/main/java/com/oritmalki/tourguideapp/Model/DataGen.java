package com.oritmalki.tourguideapp.Model;

import com.oritmalki.tourguideapp.R;

import org.joda.time.DateTime;

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
        jaffaPort.setDescription("The revamped ancient Jaffa Port is where modernity meets history.\n" +
                "\n" +
                "Jaffa Port, a renewed culinary, shopping and entertainment stop set in the city's ancient harbor, is home to various merchants and stalls that offer a vibrant and exciting experience inspired by the historical, cultural, and, of course, culinary legacy of its location. Take a stroll around the charming port, watch as elderly, weather-beaten fisherman hook calamari, stop off for an ice cream, or for a spot of live music at the Port’s Container bar. Jaffa Port Market combines traditional and ethnic elements with modern, urban touches. The 1,200 square metered area is set up like a race track, one path going through its entire length with shops, restaurants, galleries and booths on either side. Passageways peering into open-plan kitchens offer a carousel of tastes, smells and colors.");
        siteList.add(jaffaPort);

        Site rotchild = new Site("Rothschild Boulevard");
        rotchild.setAddress("sderot rothschild");
        rotchild.setImage(R.drawable.rotschild);
        rotchild.setWebsite("https://www.timeout.com/israel/attractions/a-stroll-down-rothschild-boulevard");
        rotchild.setDescription("Wander down Tel Aviv’s most beautiful tree-lined boulevard and embrace the classic Bauhaus architecture. You’ll feel like the ultimate Tel Avivian. With everything from charming cafés, incredible ice cream parlours and lively late night clubs to historical museums, boutique hotels and endless charming places to sit and relax, Rothschild Boulevard is the perfect central Tel Aviv spot to explore. We’ve got the low-down on the must-see sights along the infamous street.");
        siteList.add(rotchild);

        Site muzeumOfArt = new Site("Museum of Art");
        muzeumOfArt.setAddress("27 Shaul HaMelech Blvd ");
        muzeumOfArt.setWebsite("http://www.tamuseum.com/");
        muzeumOfArt.setImage(R.drawable.museum_of_art);
        muzeumOfArt.setPhone("03-6077020");
        muzeumOfArt.setOpeningHours("Mon, Wed, Sat 10:00-18:00; Tue, Thu 10:00-21:00; Fri 10:00-14:00");
        muzeumOfArt.setPrice("NIS 50 (Adult), NIS 40 (TLV Resident/Student), NIS 25 (Senior/Soldier), Free (Children under 18)");
        muzeumOfArt.setDescription("The Tel Aviv Museum houses the best of Israeli art as well as new and old masters.\n" +
                "\n" +
                "Gracing the walls of this museum are Israel’s most comprehensive collections of modern, contemporary, and Israeli art. The museum boasts an impressive collection of the old masters, diverse temporary exhibitions, displays of photography, design & architecture, a performance hall, and a beautiful, calming sculpture garden to wander around or relax in. When visiting, don’t miss the newest addition to the museum, the Herta and Paul Amir Building, which was designed by professor Preston Scott Cohen. Built around a spiraling, 90-foot high atrium, the Herta and Paul Amir Building is an architectural wonder. The interior space provides a unique setting for the display of contemporary art, a center for architecture, and a gallery.");
        siteList.add(muzeumOfArt);

        Site sarona = new Site("Sarona Market");
        sarona.setAddress("3 Aluf Kalman Magen");
        sarona.setImage(R.drawable.sarona_market);
        sarona.setWebsite("http://saronamarket.co.il/en");
        sarona.setPhone("03-6242424");
        sarona.setOpeningHours("Sun-Thu 09:00-23:00; Fri 08:00-18:00; Sat 09:00-23:00");
        sarona.setDescription("One of Israel's largest indoor culinary offerings, Sarona Market features premium imported goods, alongside the best local fare.\n" +
                "\n" +
                "Sarona Compound, a 140-year-old former Templar colony, is the first culinary center of its kind in Israel. An 8,700-square-meter market houses dozens of specialty food shops from all around the world. Inside the market, you’ll find everything imaginable from Dutch cheese to waffle towers and even Asian buns. Just outside the indoor market, dozens of clothing, book and shoe stores line its lanes, interspersed with lily ponds and grassy areas to relax.");
        siteList.add(sarona);

        Site promenade = new Site("Promenade");
        promenade.setAddress("Tel Aviv Boardwalk Tourist Information Center, 46 Retsif Herbert Samuel St ");
        promenade.setPhone("03-5166188");
        promenade.setImage(R.drawable.tel_aviv_promenade_panoramics);
        promenade.setOpeningHours("Tel Aviv Boardwalk Tourist Information Center open Daily until 17:30");
        promenade.setWebsite("https://www.visit-tel-aviv.com/");
        promenade.setDescription("An amble down Tel Aviv’s promenade awakens all the senses with a feast of colors, sights and smells.\n" +
                "\n" +
                "Nothing beats walking – or cycling – along the seaside promenade, breathing in the fresh, salty air of the Mediterranean. With Old Jaffa stamping the horizon to the south and the city’s skyscrapers to the north, it’s no wonder the Tel Aviv boardwalk is considered one of the world’s most beautiful. Sit on a bench and watch Tel Aviv life unfold before your eyes with beach-goers, paddle players and joggers doing their thing as the sounds of the waves gently crash on the shore.");
        siteList.add(promenade);

        return siteList;
    }

    public static List<Event> initEventListData(List<Event> eventList) {

        eventList = new ArrayList<>();

        Event whiteNoise = new Event("White Noise 2018");
        whiteNoise.setType("Dance");
        whiteNoise.setImage(R.drawable.white_noise);
        whiteNoise.setWebsite("https://www.suzannedellal.org.il/");
        whiteNoise.setPhone("03-5105656");
        whiteNoise.setVenue("Suzanne Dellal Center");
        whiteNoise.setAddress("5 Yahiel St, Neve Tzedek");
        whiteNoise.setDescription("The Israeli Opera presents: Vertigo Dance Company and the Revolution Orchestra.\n" +
                "\n" +
                "White Noise 2018 is a new adaptation of Noa Wertheim’s masterpiece, which was originally performed ten years ago. A decade back it received great praise in both Israel and abroad; in its new form–combining music and dance in a unique setting–the timeless piece is bound to receive equal praise as Wertheim peels back artistic layers to reveal new surprises. Her inspiration: Kalle Lasn’s acclaimed Culture Jam, a book that examines how America has traded in its status as a country to become a million-dollar brand. Similarly, Wertheimer is interested in the modern world, which she believes “produces a phenomenon of noises that penetrate the body's envelope and disrupt the systems of thought and rhythm of breathing.”");
        List<DateTime> whiteNoiseDates =  new ArrayList<>();
        whiteNoiseDates.add(new DateTime(2018, 5, 23, 21, 0, 0));
        whiteNoiseDates.add(new DateTime(2018, 5, 24, 21, 0, 0));
        whiteNoiseDates.add(new DateTime(2018, 5, 25, 14, 0,0));
        whiteNoiseDates.add(new DateTime(2018, 5, 30, 20, 0, 0));

        whiteNoise.setDates(whiteNoiseDates);
        eventList.add(whiteNoise);

        return eventList;
    }
}
