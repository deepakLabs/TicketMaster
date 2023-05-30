package domain;

import java.util.HashMap;

public class Movie {
    String id;
    HashMap<String,Section> sections;

    public HashMap<String, Section> getSections() {
        return sections;
    }

    public String getId() {
        return id;
    }

    public Movie(String id, HashMap<String, Section> sections) {
        this.id = id;
        this.sections = sections;
    }
}
