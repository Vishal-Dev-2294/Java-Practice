public class Driver {
    static int minAgeForDriving = 18;

    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {
//        Car mycar = new Car();
//        mycar.myColor("red");
//        mycar.addFuel(7);
//        mycar.drive();
//        mycar.drive();
//        mycar.drive();
//        mycar.addFuel(6);
//        mycar.drive();
//        System.out.println(mycar.getCurrentFuelLevel());

        Car bmw = new Car();
        bmw.addFuel(6);
        bmw.start().drive();
        bmw.addFuel(10);
        bmw.getCurrentFuelLevel();
    }
}
