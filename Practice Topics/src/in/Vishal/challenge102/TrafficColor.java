package in.Vishal.challenge102;

public enum TrafficColor {
    Red(9000),
    Yellow(1000),
    Green(3000);

    private final int onTimeInMills;

    public int getOnTimeInMills() {
        return onTimeInMills;
    }

    TrafficColor(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }
}
