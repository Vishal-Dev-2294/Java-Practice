package in.KGcoding.inheritance;

public class Vehicle {
    protected int noOfTires;

    @Override
    public String toString(){
        return "Vehicle no of tires " + noOfTires;
    }

    public void setNoOfTires(int noOfTires){
        this.noOfTires = noOfTires;
    }

    public void commute(){
        System.out.printf("I have a %d tires to go anywhere \n" , noOfTires);
    }
}
