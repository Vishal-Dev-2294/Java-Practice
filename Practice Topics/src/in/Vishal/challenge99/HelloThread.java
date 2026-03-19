package in.Vishal.challenge99;

import java.security.PrivateKey;

public class HelloThread extends Thread{

    private int num;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf(" (%d)Hello From Thread %d \n", i , num);
        }
    }
    public HelloThread(int number){
        this.num = number;
    }
}
