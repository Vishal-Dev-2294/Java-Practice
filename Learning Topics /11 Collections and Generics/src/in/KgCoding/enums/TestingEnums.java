package in.KgCoding.enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;

//        Grade grade = Grade.A;
        Grade grade = Grade.valueOf("D");
        for (Grade value : Grade.values()) { // agar iterate karna hai to Grade.values ka use karna padta hai
            System.out.println(value);
        }
    }
}
