package in.KGCoding.Polymorphism;

public abstract class Vehicle {

    private int noOfTires;

    Vehicle(){
        this.noOfTires = 0;
    }

    Vehicle(int noOfTires){
        this.noOfTires = noOfTires;
    }

//    public int getNoOfTires(){
//        return this.getNoOfTires();
//    }

    public void start(){
        System.out.println("Vehcile is starting...");
    }
}
