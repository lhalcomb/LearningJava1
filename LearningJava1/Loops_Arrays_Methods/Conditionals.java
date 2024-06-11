package LearningJava1.Loops_Arrays_Methods;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[]  args){
          Scanner sc = new Scanner(System.in);

          int a = sc.nextInt();
          
          //boolean aIsMoreThan5 = a>5;
          if (a>5) {
            System.out.println("A is more than 5!");
          } 
          else if (a == 5){
            System.out.println("A is equal to five");
          }
          else {
            System.out.println("A isn't greater then five");
          }
    }
}
