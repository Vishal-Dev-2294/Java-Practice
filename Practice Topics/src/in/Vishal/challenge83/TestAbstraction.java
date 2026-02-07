package in.Vishal.challenge83;

public class TestAbstraction {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(2,4);
        circle.calculateArea();
        square.calculateArea();
    }
}
