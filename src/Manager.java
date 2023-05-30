import domain.*;

import java.util.HashMap;

public class Manager {

    TicketManager manager;

    public Manager() {
        buildTicketManager();
    }

    public Theater buildDefaultTheater(int sectionOneSeats, int sectionTwoSeats, String theaterId){
        TimeSlot t1 = new TimeSlot("T1","Guest",10);
        TimeSlot t2 = new TimeSlot("T2","Guest",10);
        TimeSlot t3 = new TimeSlot("T3","Guest",10);
        TimeSlot t4 = new TimeSlot("T4","Guest",10);
        TimeSlot t5 = new TimeSlot("T5","Vip",15);

        HashMap<String,TimeSlot> tSlots11 = new HashMap<>();
        tSlots11.put(t1.getId(),t1);
        tSlots11.put(t2.getId(),t2);
        tSlots11.put(t5.getId(),t5);


        HashMap<String,TimeSlot> tSlots12 = new HashMap<>();
        tSlots12.put(t2.getId(),t2);
        tSlots12.put(t3.getId(),t3);
        tSlots12.put(t4.getId(),t4);

        HashMap<String,TimeSlot> tSlots21 = new HashMap<>();
        tSlots21.put(t1.getId(),t1);
        tSlots21.put(t2.getId(),t2);
        tSlots21.put(t4.getId(),t4);


        HashMap<String,TimeSlot> tSlots22 = new HashMap<>();
        tSlots22.put(t2.getId(),t2);
        tSlots22.put(t3.getId(),t3);
        tSlots22.put(t4.getId(),t5);

        Section section11 = new Section(tSlots11,"Section 1",sectionOneSeats);
        Section section12 = new Section(tSlots11,"Section 2",sectionTwoSeats);

        Section section21 = new Section(tSlots11,"Section 1",sectionOneSeats);
        Section section22 = new Section(tSlots11,"Section 2",sectionTwoSeats);

        HashMap<String,Section> sectionMovie1 = new HashMap<>();

        sectionMovie1.put(section11.getId(),section11);
        sectionMovie1.put(section12.getId(),section12);


        HashMap<String,Section> sectionMovie2 = new HashMap<>();

        sectionMovie2.put(section21.getId(),section21);
        sectionMovie2.put(section22.getId(),section22);


        Movie movie1 = new Movie("Movie 1",sectionMovie1);

        Movie movie2 = new Movie("Movie 2",sectionMovie2);

        HashMap<String,Movie> movieHashMap = new HashMap<>();

        movieHashMap.put(movie1.getId(),movie1);
        movieHashMap.put(movie2.getId(),movie2);

        Theater theater = new Theater(movieHashMap,theaterId);

        return theater;
    }

    public void buildTicketManager(){
        Theater theater1 = buildDefaultTheater(40,60,"Theater 1");
        Theater theater2 = buildDefaultTheater(45,80,"Theater 2");
        HashMap<String,Theater> database = new HashMap<>();
        database.put(theater1.getTheaterId(),theater1);
        database.put(theater2.getTheaterId(),theater2);
        this.manager = new TicketManager(database);
    }

    public int findCost(String theater, String movie, String section, String timeslot, String GuestType){
        if(!manager.getTheaters().containsKey(theater)){
            return -1; //  return wrong manager
        }
        Theater theaterDb = manager.getTheaters().get(theater);
        if(!theaterDb.getMovies().containsKey(movie)){
            return -1; // return wrong theater
        }
        Movie movieDb = theaterDb.getMovies().get(movie);
        if(!movieDb.getSections().containsKey(section)){
            return -1; // return wrong movie
        }
        Section sectionDb = movieDb.getSections().get(section);
        if(!sectionDb.getTimeslots().containsKey(timeslot)){
            return -1; // return wrong section
        }
        TimeSlot timeSlot = sectionDb.getTimeslots().get(timeslot);
        if(!timeSlot.getType().equals(GuestType)){
            return -1; //  return wrong timeSlot
        }
        // if everything procceds calculate the cost here
        return 10;
    }
}
