package in.Vishal.challenge97;

public enum Day {
    Monday(true),
    Tuesday(true),
    Wensday(true),
    Thrusday(true),
    Friday(true),
    Saturday(true),
    Sunday(false);

    private boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType(){
        return isWeekday ? "Weekday" : "Weekend";
    }
}
