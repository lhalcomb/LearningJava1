<<<<<<< HEAD
package LearningJava1.OwnPractice.numbertheory;

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
=======
package numbertheory;

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
>>>>>>> d6f526c51a0267859233adc45da94e8a1c176324
