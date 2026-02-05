package in.KGcoding;

import in.KGcoding.inheritance.Vehicle;

public class TwoWheeler extends Vehicle {

    public TwoWheeler() {
        setNoOfTires(2);
    }

    public void balance(){
        System.out.println("i am balancing on two tires");
    }
}
