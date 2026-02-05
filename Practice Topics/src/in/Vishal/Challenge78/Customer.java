package in.Vishal.Challenge78;

public class Customer {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(554278 , "Vishal");
        bank.depositeMoney(15000);
        System.out.printf("Your Bank Balance is %f " , bank.getBalance());
        bank.withdrawMoney(15000);
        System.out.println("");
        System.out.printf("Your Bank Balance is %f " , bank.getBalance());
    }
}
