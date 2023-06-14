import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class Collatz{
    public static void main(String[] args){
        collatz();
    }

    private static void collatz(){
        long n = 7;
        long i = 0;
        List<Long> list = new ArrayList<>();
        while (n!=1){
            if (n%2==0) {
                n/=2;
            } else {
                n = (3*n +1);
            } 
            i++;
            list.add(n);
            //System.out.print(n);
        }
        System.out.println(i);
        System.out.println(n);
        System.out.println(list);
    }
}


