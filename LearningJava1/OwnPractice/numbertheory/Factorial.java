package LearningJava1.OwnPractice.numbertheory;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        long f = 1;

        System.out.print("Enter a number: ");
        Scanner sc  = new Scanner(System.in);
        long n = sc.nextLong();


        for(long c = n;  c >= 1; c--){
            f = f*c;
        }

        System.out.println("Factorial of " +n+ " is " + f);
    }
}