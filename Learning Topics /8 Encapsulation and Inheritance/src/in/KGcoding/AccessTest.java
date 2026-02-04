package in.KGcoding;

public class AccessTest {
    public static void main(String[] args) {
        PublicCar car = new PublicCar();
        car.color = "red";
        car.model = "lamborgini";
        car.costOfPurchase = 3400;

        PublicCar car1 = new PublicCar("black ", "bmw" , 35 , 3450 );
        System.out.println(car1);

        Default def = new Default();
    }
}
