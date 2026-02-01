public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static {
        noOfCarsSold = 0;
        System.out.println(" I am in static block ");
    }

    {
        noOfCarsSold++;
        System.out.println(" I am in intialization block ");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 6;
    }

    Car() {
        this("black");
        currentFuelInLiters = 5;
    }

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
