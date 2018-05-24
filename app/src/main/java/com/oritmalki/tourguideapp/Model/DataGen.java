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
        claroRest.setDescription("Beloved Tel Aviv chef Ran Shmueli has made Claro an homage to seasonal and local ingredients. Located in a restored Templer building, this spacious, light-\u00ADfilled restaurant is a savvy choice for Mediterranean food. On weekends, order the family\u00AD-style platter composed of slow\u00AD-cooked lamb in a pomegranate sauce with sabzi (Persian fresh herbs), tzaziki, and hand\u00ADmade pitas straight from the tabun.");
        resturatnts.add(claroRest);

        Restaurant hakosemRest = new Restaurant("HaKosem");
        hakosemRest.setType("Mediterranean");
        hakosemRest.setAddress("Shlomo ha-Melekh St 1");
        hakosemRest.setPhone("+972 3-525-2033");
        hakosemRest.setWebsite("https://m.facebook.com/pages/%D7%94%D7%A7%D7%95%D7%A1%D7%9D/120889484655916");
        hakosemRest.setImage(R.drawable.hakosem_tlv);
        hakosemRest.setDescription("Falafel can be found on just about every street corner in Tel Aviv, but Hakosem is in a league of its own, offering perfectly plump pita and deep\u00AD-fried balls of chickpea mash studded with fresh herbs, alongside impeccably fresh salads. Also try the hearty shawarma or the Iraqi breakfast known as sabich — wedges of fried potato, golden eggplant slices, hard\u00ADboiled eggs, and amba, a sunshine-yellow pickled mango sauce that seals the deal. ");
        resturatnts.add(hakosemRest);

        Restaurant miznonRest = new Restaurant("Miznon");
        miznonRest.setType("Mediterranean");
        miznonRest.setAddress("Shlomo Ibn Gabirol St 23");
        miznonRest.setPhone("+972 3-716-8977");
        miznonRest.setWebsite("https://miznon.com/he/");
        miznonRest.setImage(R.drawable.miznon__tlv);
        miznonRest.setDescription("Street food took a new turn when chef Eyal Shani opened this pita\u00AD-focused joint, a no\u00AD-frills spot that buzzes all day long. Fresh, fluffy pitas are packed with kebabs, steak and eggs, or ratatouille. Don’t pass up Shani’s signature dish: a full head of roasted cauliflower, which is rich, thick and filling — almost like a hunk of meat.");
        resturatnts.add(miznonRest);

        Restaurant onzaRest = new Restaurant("Onza");
        onzaRest.setType("Mediterranean");
        onzaRest.setAddress("Rabbi Hannina St. 3");
        onzaRest.setPhone("+972 3-648-6060");
        onzaRest.setDescription("Onza, a popular bar and restaurant located in the bustling Shuk HaPishpeshim (Jaffa’s flea market) added a Turkish touch to the menu when the talented chef pair Arik Darhani and Muli Magriso took reins of the kitchen towards the end of 2016. The menu features mezze like cacik, a Turkish yogurt dip made with cucumbers, mint, and dill; and pacanga borek, a pastry filled with pastirma (a Turkish cured beef) and kashkaval cheese served alongside a spicy grape leaf version of zhug (a hot sauce) and warm, comforting eggplant yogurt dip. Come early and browse the flea market for second-hand goodies and check out the shops that showcase local Israeli fashion.");
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
        whiteNoiseDates.add(new DateTime(2018, 5, 30, 20, 0, 0));
        whiteNoiseDates.add(new DateTime(2018, 5, 25, 14, 0,0));
        whiteNoiseDates.add(new DateTime(2018, 5, 24, 21, 0, 0));
        whiteNoiseDates.add(new DateTime(2018, 5, 23, 21, 0, 0));
        whiteNoise.setDates(whiteNoiseDates);
        eventList.add(whiteNoise);

        Event lollipopFest = new Event("Lollipop Festival");
        lollipopFest.setType("Music");
        lollipopFest.setImage(R.drawable.lollopop_festival);
        lollipopFest.setPrice("From 275 NIS");
        lollipopFest.setAddress("Rishon Lezion Live park");
        lollipopFest.setVenue("Rishon Lezion Live park");
        lollipopFest.setWebsite("http://www.tmisrael.co.il/event/JSOND/ALL/iw");
        lollipopFest.setDescription("Lollipop Festival lands to Israel with a first edition full of surprises, this summer 2018. One night of pop-immersion, with world super stars like Jason Derulo and Rita Ora, along with many other local and international artists  (Eliad Nahum, Axum and Adi Ulmansky). Tickets are on sale already from 275 NIS. The Lollipop festival is set to be one of the top events of the summer and will take place at Rishon Lezion Live park, at the outskirts of Tel Aviv, on August 1, 2018.");

        List<DateTime> lollipopDates = new ArrayList<>();
        lollipopDates.add(new DateTime(2018, 8, 1, 18, 00, 0));
        lollipopFest.setDates(lollipopDates);
        eventList.add(lollipopFest);

        Event ringo = new Event("Ringo Starr");
        ringo.setType("Music");
        ringo.setImage(R.drawable.ringo);
        ringo.setAddress("Menoarah Arena");
        ringo.setWebsite("http://www.eventim.co.il/ringo-starr.html?affiliate=EIL&doc=artistPages/overview&fun=artist&action=overview&kuid=455997");
        ringo.setVenue("Menoarah Arena");
        ringo.setDescription("Ringo Starr, the legendary drummer of The Beatles, is heading to Tel Aviv for his first show in Israel, in June 2018. Ringo Starr and The Beatles don’t need introduction, being music legends since the 60s. The Beatles had never performed in Israel during their career: a concert in the country was planned back in 1966, but unfortunately it never took place. Ringo Starr will perform in Israel with his band “All Starr”, as part of a European tour. Ringo Starr’s concert in Tel Aviv will take place at Menoarah Arena, on June 23, 2018.");

        List<DateTime> ringoDates = new ArrayList<>();
        ringoDates.add(new DateTime(2018, 6, 23, 18, 00, 0));
        ringo.setDates(ringoDates);
        eventList.add(ringo);

        Event purim = new Event("Purim Street Party");
        purim.setType("Party");
        purim.setAddress("Kikar Hamedina");
        purim.setVenue("Kikar Hamedina");
        purim.setImage(R.drawable.purimtelaviv);
        purim.setDescription("The annual block party in the streets of Tel Aviv returns for Purim 2018. Perhaps the city’s biggest Purim party, this is the place where residents and visitors of all ages come to show off their Purim costumes.  The Purim Street Party will take place on March 2, 2018 in Kikar Hamedina (State Square) in northern Tel Aviv. The event usually begins at around 14:00 and continues through the afternoon. Entrance is totally free.");
        purim.setPrice("Free");

        List<DateTime> purimDates = new ArrayList<>();
        purimDates.add(new DateTime(2018, 3, 2, 14, 00, 0));
        purim.setDates(purimDates);
        eventList.add(purim);

        Event eurovision = new Event("Eurovision contest");
        eurovision.setType("Music");
        eurovision.setImage(R.drawable.eurovision_song_contest_jerusalem_israel_2019_e1526195714822);
        eurovision.setAddress("Jerusalem");
        eurovision.setVenue("Jerusalem");
        eurovision.setDescription("The 2019 Eurovision Song Contest will take place in Israel in May. This will be the first time that Eurovision has been hosted in Israel for 20 years, and the location still has to be officially confirmed, though the likely venue will be Jerusalem at the Pais Arena or the Teddy Stadium. Eurovision in Israel will be a memorable event, with fans traveling to visit having to choose between staying in the host city itself, Jerusalem, with its uniquely rich history and culture, or the nearby (1 hour drive) liberal beach city of Tel Aviv with its world class nightlife.");
        eurovision.setWebsite("https://www.touristisrael.com/eurovision-song-contest-israel-jerusalem-may-2019/22200/");

        List<DateTime> eurovisionDates = new ArrayList<>();
        eurovisionDates.add(new DateTime(2019, 5, 1, 1, 00, 0));
        eurovision.setDates(eurovisionDates);
        eventList.add(eurovision);

        return eventList;
    }
}
