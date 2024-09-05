package LearningJava1.Loops_Arrays_Methods.Recursion;

public class Recursion {

    static void print1(int a){
        //System.out.println(a);
        if (a < 100) {
            print1(a+1);
        }
        System.out.println(a);
    }
    public static void main(String[] args){
        print1(1);
    }
}
