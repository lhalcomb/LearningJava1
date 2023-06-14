import java.util.ArrayList;
import java.util.List;
//import java.util.Random;

public class Collatz{
    public static void main(String[] args){
        collatz();
    }

    private static void collatz(){
        long n1 = 7;
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
        System.out.println("Iteration Count>> " + i);
        System.out.println(n1+ ": " + list);
    }
}


