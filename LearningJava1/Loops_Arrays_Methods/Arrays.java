package LearningJava1.Loops_Arrays_Methods;
//import java.util.Scanner;
//import java.util.math

public class Arrays {

    public static void main(String[] args){
        /*Scanner[] a = new Scanner[10];
        a[0] = new Scanner(System.in);
        System.out.println(a[0].nextInt()); */

        /*int[] a = new int[10];

        for (int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random()*100);
        }
        /*for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }*/

        int[][] a = {{1,2,3},{3,2,1}};
        //System.out.println(a[1][2]);
        for(int i = 0; i<a.length; i++){
            for(int j=0;j < a[i].length ;j++){
                System.out.print(a[i][j]+ ",");
            }
        System.out.println();
        }
    }
}
