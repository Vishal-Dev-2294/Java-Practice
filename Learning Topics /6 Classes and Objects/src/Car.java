public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public Car start() {
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel");
        } else if (currentFuelInLiters < 5){
            System.out.println("Car is in reserved mode , please refuel");
            currentFuelInLiters--;
        } else {
            System.out.println("Car is started");
        }
        return this;
    }

    public void drive() {
        System.out.println("Car is Driving");
        currentFuelInLiters--;
    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    public void myColor(String color) {
        System.out.println("Your car color is " + color);
    }
}
