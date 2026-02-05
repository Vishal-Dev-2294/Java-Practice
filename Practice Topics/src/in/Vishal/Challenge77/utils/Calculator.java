package in.Vishal.Challenge77.utils;

import in.Vishal.Challenge77.geometry.Circle;
import in.Vishal.Challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle areaOfcircle = new Circle(5);
        System.out.println(areaOfcircle.getArea());

        Rectangle areaOfRectangle = new Rectangle(5 , 10);
        System.out.println(areaOfRectangle.getAreaOfRectangle());
    }
}
