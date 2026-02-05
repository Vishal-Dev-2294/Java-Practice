package in.KGcoding.inheritance;

public class Vehicle {
    protected int noOfTires;

    public void setNoOfTires(int noOfTires){
        this.noOfTires = noOfTires;
    }

    public void commute(){
        System.out.printf("I have a %d tires to go anywhere \n" , noOfTires);
    }
}
