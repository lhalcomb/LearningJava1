package LearningJava1.Operations;
import  java.util.Scanner;

public class arithmeticoperators {
    /**
     * +
     * -
     * *
     * /
     * %
     * ++
     * --
     */
    public static void main(String[]  args){
        
        /*int a = 12;
        System.out.println(a+12); //24
        System.out.println(a-12); //0
        System.out.println(a/12); //1
        System.out.println(a*12); //144
        System.out.println(a%7);  //5

        //a += 1;
        //a++; increment operator  
        //a--; decrement operator

        //System.out.println(a);*/

        Scanner sc = new Scanner(System.in);
        int firstVal = sc.nextInt();
        int secondVal =  sc.nextInt();

        int sum = firstVal + secondVal;
        int difference =  firstVal - secondVal;
        int product = firstVal * secondVal;
        float quotient = (float)(firstVal/secondVal);
        int modulo = firstVal%secondVal;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(modulo);
        
    

    }
}