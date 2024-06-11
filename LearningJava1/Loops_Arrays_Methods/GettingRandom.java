package LearningJava1.Loops_Arrays_Methods;

public class GettingRandom{
    public static void main(String[] args){
        double a = Math.random() * 50 + 1;
        System.out.println(a);

        int random = (int)(Math.random() * 50+1);
        System.out.println(random);
    }
}