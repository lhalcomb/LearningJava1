package LearningJava1.Operations;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){
        /**
         * &&
         * ||
         * !
         */

         boolean t = true;
         boolean f = false;

        // System.out.println(t&&f);
        // System.out.println(t || f);
        // System.out.println(!true);
        // System.out.println(!false);

        // System.out.println(!(false&&true) || !true);

        Scanner sc =  new Scanner(System.in);
        boolean first = sc.nextBoolean();
        boolean second = sc.nextBoolean();

        boolean and = first&&second;
        boolean or = first||second;
        boolean invert = !(first&&second);

        System.out.println(first +" && "+ second +" = " +and);
        System.out.println(first +" || "+ second +" = "+or);
        System.out.println("! (" +first+ "  & " +second+ ")  = " +invert);


    }

}
