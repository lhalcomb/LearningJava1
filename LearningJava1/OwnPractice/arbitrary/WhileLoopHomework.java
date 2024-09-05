<<<<<<< HEAD
package LearningJava1.OwnPractice.arbitrary;
import java.util.Scanner;

public class WhileLoopHomework {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long number = a*b*c*d;
        int i = 1;

        while (true){

                System.out.println("Checking: " +  number);
                if (number%10 == 0){
                    System.out.println("We must multiply it " +i+ " times! And the number is divisible by 10");
                    break;
            }
            i++;
            number *= a*b*c*d;
        }

    }
}
=======
package arbitrary;
import java.util.Scanner;

public class WhileLoopHomework {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long number = a*b*c*d;
        int i = 1;

        while (true){

                System.out.println("Checking: " +  number);
                if (number%10 == 0){
                    System.out.println("We must multiply it " +i+ " times! And the number is divisible by 10");
                    break;
            }
            i++;
            number *= a*b*c*d;
        }

    }
}
>>>>>>> d6f526c51a0267859233adc45da94e8a1c176324
