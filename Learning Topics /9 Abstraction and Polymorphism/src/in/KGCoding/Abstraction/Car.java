package in.KGCoding.Abstraction;

public class Car extends Vehicle{

    private int noOfDoors;

    public Car(){
        super(4); // parent class ka constructor ko call kiya hai.
    }

    @Override
    public void startCarSound() {
        System.out.println("bru..bru..bruuuuuuuuuu......");
    }
}
