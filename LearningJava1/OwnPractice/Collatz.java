import java.util.ArrayList;
import java.util.List;

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
            //System.out.print(n);
        }
        System.out.println("<Iterations--> " + i);
        //System.out.println(n2);
        System.out.println("<Sequence--> " + n1 + ": "+ list);
    }
}
