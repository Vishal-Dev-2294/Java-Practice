package in.KGCoding.Polymorphism;

import java.util.Scanner;

public class OverLoading {

    OverLoading(){
        System.out.println("Default overlaoding");
    }

    OverLoading(String pop){
        System.out.println(pop);
    }

    public int add(int a , int b){
        return a + b;
    }

    public String add(String a  ,String b){
        return a + b;
    }

    public int add(int a , int b , int c , int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        OverLoading overloading = new OverLoading();
        System.out.println(overloading.add(5 , 5));
        System.out.println(overloading.add("5" , "5"));
        System.out.println(overloading.add(5 , 5 , 5 , 5));
    }
}
