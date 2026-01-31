public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public void drive() {
        System.out.println("Car is Driving");
    }

    public void addFuel() {
        currentFuelInLiters++;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}
