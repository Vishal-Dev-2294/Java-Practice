package in.KGCoding.Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
//        Vehicle v = new Vehicle();
        Plane p = new Plane();

        castTest(p);
        castTest(c);
//        Vehicle vCar = new Car();
//      Car cCar = new Vehicle();
//        Car cCar = (Car) new Vehicle();


    }

    private static void castTest(Vehicle veh){
//        Car cCar = (Car) veh;
//        ((Car) veh).noOfDoors();
//        cCar.noOfDoors();
//        cCar.start();
        veh.start();
    }
}
