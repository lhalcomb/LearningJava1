package LearningJava1.OwnPractice;
import java.util.*;
//import java.util.Scanner;

public class Fibbonacci {
    static int fib(int n){
        if (n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }
    public static void main(String[] args){
        int n = 50;
        List<Integer> list = new ArrayList<>();

        int count = 0; 

        for (int i = 0; i < n; i++){
            //System.out.println("fibbonacci number: "+ fib(i) + " ");
            list.add(fib(i));
            count++;
        }
        
        System.out.print("Fibonacci Iteration>> " + count);
        System.out.print(", Fibonacci Sequence>> " + list);

    }
}
//This Java Recurrsive program has a complexity of O(2^N)