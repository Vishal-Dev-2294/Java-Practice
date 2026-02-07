package in.Vishal.challenge83;

public class Square extends Circle {
   private double length;
   private double breadth;

   public Square(double length , double breadth) {
      super(2);
      this.length = length;
      this.breadth = breadth;
   }

   public void calculateArea(){
      double areaOfSquare = length * breadth;
      System.out.println(areaOfSquare);
   }
}