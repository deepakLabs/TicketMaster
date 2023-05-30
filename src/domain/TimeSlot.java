package domain;

public class TimeSlot {
    String id;
    String type;
    Integer cost;

    public TimeSlot(String id, String type, Integer cost) {
        this.id = id;
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public Integer getCost() {
        return cost;
    }

    public String getId() {
        return id;
    }
}
