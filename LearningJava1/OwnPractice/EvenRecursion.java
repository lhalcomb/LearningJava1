package LearningJava1.OwnPractice;

public class EvenRecursion {
    static void Evens(int a){
        if (a % 2 == 0){
            System.out.println(a);
        }
        if (a < 100){
            Evens(a+1);
        }
    }
    public static void main(String[] args){
        Evens(4);
    }
}