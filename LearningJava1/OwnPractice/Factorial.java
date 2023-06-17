package LearningJava1.OwnPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        long n, c, f = 1;
        System.out.println("Enter a number: ");
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        for(c = 1;  c <= n; c++){
            f = f*c;
        }
        System.out.println("Factorial of " +n+ " is " + f);
    }
}
