package in.Vishal.Challenge78;

class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void depositeMoney(double money){
        this.balance += money;
    }


    public void withdrawMoney(double money){
      if (money > balance){
          System.out.println("itna to tere account me bhi nhai hai bhadwe");
      } else {
          this.balance = balance - money;
      }
    }
}
