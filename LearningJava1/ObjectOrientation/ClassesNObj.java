package LearningJava1.ObjectOrientation;

public class ClassesNObj {
    static Zebra bob1 = new Zebra();
    public static void main(String[] args){
        bob1.height = 12;

        Zebra bob = new Zebra();
        

        bob.height = 4.5;
        bob.weight = 5.7;

        System.out.println("Bob's height is " + bob.height);
        System.out.println("Bob's weight is " + bob.weight);
        System.out.println(bob.getZebraName());


    }
}
