package com.oritmalki.tourguideapp.Model;

import org.joda.time.DateTime;

import java.util.List;

public class Event extends Attraction {

    List<DateTime> dates;
    String type;
    String venue;

    public Event(String name) {
        super(name);
    }

    public List<DateTime> getDates() {
        return dates;
    }

    public void setDates(List<DateTime> dates) {
        this.dates = dates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
