package LearningJava1.Loops_Arrays_Methods.Recursion;

public class FactorialRecursive {
    static int factorial(int a){
        if (a == 1){
            return 1;
        }
        return a * factorial(a-1);
    }
    public static void main(String[] args){
        System.out.println("10! = " +factorial(10));
    }
}
