<<<<<<< HEAD
package LearningJava1.OwnPractice.arbitrary;
import java.util.Scanner;

public class AverageOfNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double firstdubl = sc.nextDouble();
        double secdubl = sc.nextDouble();
        double thirddubl = sc.nextDouble();
        double fourthdubl = sc.nextDouble();

        double sum = firstdubl+=secdubl+=thirddubl+=fourthdubl;
        double average = sum/=4;

        System.out.println("The average of the doubles is " + average);
    }

}
=======
package arbitrary;
import java.util.Scanner;

public class AverageOfNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double firstdubl = sc.nextDouble();
        double secdubl = sc.nextDouble();
        double thirddubl = sc.nextDouble();
        double fourthdubl = sc.nextDouble();
        sc.close();
        double sum = firstdubl+=secdubl+=thirddubl+=fourthdubl;
        double average = sum/=4;

        System.out.println("The average of the doubles is " + average);
    }

}
>>>>>>> d6f526c51a0267859233adc45da94e8a1c176324
