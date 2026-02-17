package in.KGCoding.Abstraction;

public abstract class Vehicle implements Transport{
    private int noOfTires;

    public abstract void startCarSound(); // iska implemention mera child karega jaise ki car wala
//                                             class isko implement karega ki ye method kya karega


    @Override
    public void getSetGo() {
        System.out.println("Going to palace....");
    }

    public Vehicle(int noOfTires){
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute(){
        System.out.println("Chal Rhai Hai Teri Car Par Ja Khai Rahi Hai wo nhai paata ........");
    }
}
