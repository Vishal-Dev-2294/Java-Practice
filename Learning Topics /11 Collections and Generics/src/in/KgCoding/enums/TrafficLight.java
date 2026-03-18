package in.KgCoding.enums;

public enum TrafficLight {
    RED("Stop") , GREEN("Go"), YELLOW("CAUTION");

    private final String action;

    TrafficLight(String action){
        this.action = action;
    }
}
