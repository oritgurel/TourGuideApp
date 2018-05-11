package com.oritmalki.tourguideapp.Model;

import java.util.Date;

public class Event extends Attraction {

    Date startTime;
    Date endTime;

    public Event(String name) {
        super(name);
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
