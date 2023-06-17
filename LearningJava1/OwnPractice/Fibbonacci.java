package LearningJava1.OwnPractice;
//import java.util.Scanner;

public class Fibbonacci {
    static int fib(int n){
        if (n <= 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }
    public static void main(String[] args){
        int n = 10;

        for (int i = 0; i < n; i++){
            System.out.println("fibbonacci number: "+ fib(i) + " ");
        }

    }
}
//This Java Recurrsive program has a complexity of O(2^N)