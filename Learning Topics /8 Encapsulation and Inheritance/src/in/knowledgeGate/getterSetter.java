package in.knowledgeGate;

import in.getterSetter.Car;

public class getterSetter {
    public static void main(String[] args) {
        in.getterSetter.Car car = new Car("red" , "bmw",
                34 , 5900);
        System.out.printf("%s %s " ,  car.getColor() , car.getModel());
    }
}
