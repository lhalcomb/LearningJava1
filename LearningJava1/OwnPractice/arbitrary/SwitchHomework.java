package LearningJava1.OwnPractice.arbitrary;
import java.util.Scanner;

public class SwitchHomework {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the correct way of defining a variable? ");
        System.out.println("1. int a = 2");
        System.out.println("2. a = 2");
        System.out.println("3. 1a = 2");
        System.out.println("4. int 2 = a");

        int a = sc.nextInt();

        switch(a){
            case 1: 
                System.out.print(" That is Correct!");
                break;
            case 2:
                System.out.println(" That is Incorrect, try again.");
                break;
            case 3:
                System.out.println("That is a weird way to set up a variable, not quite. ");
                break;
            case 4:
                System.out.println("Swap a couple characters here and You Got it!");
                break;
            default:
                System.out.println("Try using the numbers 1-4 to answer. ");
        }
        
    }
}
