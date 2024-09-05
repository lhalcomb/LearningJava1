package LearningJava1.Loops_Arrays_Methods;

import java.util.Scanner;

public class SwitchCond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        switch(a){
            case 1: 
                System.out.println("A is equal to 1");
                break;
            case 2: 
                System.out.println("A is equal to 2");
                break;
            case 3: 
                System.out.println("A is equal to 3");
                break;
            case 4: 
                System.out.println("A is equal to 4");
                break;
            case 5: 
                System.out.println("A is equal to 5");
                break;
            case 6: 
                System.out.println("A is equal to 6");
                break;
            case 7: 
                System.out.println("A is equal to 7");
                break;
            case 8: 
                System.out.println("A is equal to 8");
                break;
            case 9: 
                System.out.println("A is equal to 9");
                break;
            case 10: 
                System.out.println("A is equal to 10");
                break;
            
            default:
            //default will be executed if no other cases are true above
                   System.out.println("A is more than 10.");
        }
    }
}
