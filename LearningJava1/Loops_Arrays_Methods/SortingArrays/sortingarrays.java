package LearningJava1.Loops_Arrays_Methods.SortingArrays;

public class sortingarrays{
    public static void main(String[] args){
        int[] a = {5,4,3,2,1};

        for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - 1; j++){
                if(a[j] < a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
        }
    }
}
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}