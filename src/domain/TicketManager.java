package domain;

import java.util.HashMap;

public class TicketManager {
    public HashMap<String, Theater> getTheaters() {
        return theaters;
    }

    HashMap<String, Theater> theaters;

    public TicketManager(HashMap<String, Theater> theaters) {
        this.theaters = theaters;
    }

}
