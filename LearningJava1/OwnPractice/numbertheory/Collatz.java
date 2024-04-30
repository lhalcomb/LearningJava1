package numbertheory;

/* import java.util.ArrayList;
import java.util.List;
import java.util.Random; */

import java.util.*;


/* This file generates a collatz conjecture sequence starting with a random number between the bounds of 0 and 1000. 
Adjust the number inside of the bound to generate a sequence as you wish.   */

public class Collatz{
  
    public void collatz(long n1){
        
        
        long n2 = n1;
        long i = 0;
        List<Long> list = new ArrayList<>();
        while (n2!=1){
            if (n2%2==0) {
                n2/=2;
            } else {
                n2 = (3*n2 +1);
            } 
            i++;
            list.add(n2);
        }
        System.out.println("<Iterations--> " + i);
        System.out.println("<Sequence--> " + n1 + ": "+ list);
        
    }


    public static void main(String[] args){
        Collatz c = new Collatz();
        Random rand = new Random();
        //long n1 = 37;
        long n1 = rand.nextInt(1000);

        c.collatz(n1);
        
    }
}
