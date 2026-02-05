package in.KGcoding.inheritance;

import in.KGcoding.TwoWheeler;

public class inheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        TwoWheeler bike = new TwoWheeler();
        bike.commute();

        MotorCycle bike2 = new MotorCycle();
        bike2.commute();
        bike2.start();
        bike2.balance();


    }
}
