package in.Vishal.Challenge77.geometry;

public class Rectangle {
   private double length;
   private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getAreaOfRectangle(){
        return length * width;
    }
}
