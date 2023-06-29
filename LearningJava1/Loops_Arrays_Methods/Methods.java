package LearningJava1.Loops_Arrays_Methods;

public class Methods {

    public static void stringArray(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
      }
}
    public static void main(String[] args){
        //a collection of code?

        int[] a = {12,4,55,6};

        stringArray(a);

    }
}
