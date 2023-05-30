package domain;

import java.util.HashMap;

public class Section {
    HashMap<String,TimeSlot> timeslots;
    String id;
    Integer numberOfSeats;

    public Section(HashMap<String, TimeSlot> timeslots, String id, Integer numberOfSeats) {
        this.timeslots = timeslots;
        this.id = id;
        this.numberOfSeats = numberOfSeats;
    }

    public HashMap<String, TimeSlot> getTimeslots() {
        return timeslots;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getId() {
        return id;
    }
}
