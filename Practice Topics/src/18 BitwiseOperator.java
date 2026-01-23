class BitwiseOperator {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        System.out.println(" And a & b = " + (a & b));
        System.out.println(" OR  a | b = " + (a | b));
        System.out.println(" XOR a ^ b = " + (a ^ b));
        System.out.println(" NOT a ~ b = " + (~b));
        System.out.println(" Left Shift a << b = " + (a << 1));
        System.out.println(" Right Shift a >> b = " + (b >> 1));
    }
}
