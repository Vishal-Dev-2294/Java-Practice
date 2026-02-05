package in.KGcoding.inheritance;

import in.KGcoding.TwoWheeler;

public class inheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheeler bike = new TwoWheeler();
        bike.commute();

        MotorCycle bike2 = new MotorCycle();
        bike2.commute();
        bike2.start();
        bike2.balance();


    }
}
