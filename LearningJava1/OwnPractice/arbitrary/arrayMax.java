package arbitrary;
import java.util.*;


public class arrayMax {
    public static void main(String[] args){
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);

        int n = arrayList.size();
        int max = arrayList.get(0);
        for (int i = 0; i < n-1; i++){
            if(max < arrayList.get(i)){
                max = arrayList.get(i);
            }
        }
        System.out.println("Max of Array is: " + max);


    }
}
