package in.getterSetter;

import javax.print.DocFlavor;

public class Car {
    private String color; // mujhe iska public access chaiye
    private String model; // mujhe iska public access chaiye
    private  double fuelLevel;
    private long costOfPurchase; // mujhe iska default access chaiye

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }


    public  String getColor(){
        return color;
    }

    void setColor(String color){
        if (color.equals("yellow")){
            System.out.println("pagal hai ka re tu");
        } else {
            this.color = color;
        }
    }

    public String getModel(){
        return model;
    }
}
