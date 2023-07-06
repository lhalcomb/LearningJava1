package LearningJava1.OwnPractice;

public class HippoConvert {
    public static void main(String[] args){
        Hippo Jeffery = new Hippo(147000,13400);
        /*Jeffery.heightInMillimeters = 15000;
        Jeffery.weightinGrams = 150000;*/

        System.out.println(Jeffery.getheightInMeters());
        System.out.println(Jeffery.getweigthinKilograms());

    }
}
