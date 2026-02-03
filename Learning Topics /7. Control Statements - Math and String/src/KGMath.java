public class KGMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99)); // 99
        System.out.println(Math.ceil(99.5)); // 100
        System.out.println(Math.floor(99.5)); // 99
        System.out.println(Math.round(99.5)); // 100
        System.out.println(Math.PI);

        for (int i = 1; i <= 10; i++) {
            double random = Math.floor(Math.random() * 100);
            System.out.println(random);
        }
    }
}
