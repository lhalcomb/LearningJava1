package LearningJava1.Operations;
import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args){
        boolean oneIsMoreThan2 = 1 > 2;
        boolean oneIsLessThan2 = 1 > 2;

        boolean oneIsMoreThanOrEqualTo2 = 1 >= 2;
        boolean oneIsLessThanOrEqualTo2 = 1 <= 2;

        boolean EqualTo = 1 == 2;
        boolean notEqualTo = 1!=2;

       /*System.out.println("1 is more than 2 = " + oneIsMoreThan2);
        System.out.println("1 is less than 2 = " + oneIsLessThan2);

        System.out.println("1 is more than or equal to 2 = " + oneIsMoreThanOrEqualTo2);
        System.out.println("1 is less than or equal to 2 = " + oneIsLessThanOrEqualTo2);

        System.out.println("1 is 2 = " + EqualTo);
        System.out.println("1 is NOT 2 = " + notEqualTo);*/

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean equal = a==b;
        boolean notEqual = a!=b;
        boolean moreThan = a>b;
        boolean lessThan = a<b;
        boolean greaterThanorEqualTo = a>=b;
        boolean lessThanorEqualTo = a<=b;



        System.out.println(a + " == " +b+ " is " + equal);
        System.out.println(a +" != " +b+ " is " + notEqual);

        System.out.println(a +" > " +b+ " is " + moreThan);
        System.out.println(a +" < " +b+ " is " + lessThan);

        System.out.println(a +" >= " +b+ " is " + greaterThanorEqualTo);
        System.out.println(a +" <= " +b+ " is " + lessThanorEqualTo);

    }
}
