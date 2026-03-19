package in.Vishal.challenge102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread  red = new TrafficLightThread(TrafficColor.Red);
        TrafficLightThread  yellow = new TrafficLightThread(TrafficColor.Yellow);
        TrafficLightThread  green = new TrafficLightThread(TrafficColor.Green);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
    }
}
