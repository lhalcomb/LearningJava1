package LearningJava1.ObjectOrientation.ClassesNObjCont;

public class HippoConvert {
    public static void main(String[] args){
        //Hippo Jeffery = new Hippo(147000,13400, "Gray");
        /*Jeffery.heightInMillimeters = 15000;
        Jeffery.weightinGrams = 150000;*/
        mammal Jeffery = new mammal("Gray");

        /*System.out.println(Jeffery.getheightInMeters());
        System.out.println(Jeffery.getweigthinKilograms());*/
        System.out.println(Jeffery.ColorofFur);

        if (Jeffery instanceof Hippo){
            System.out.println("It is, lol.");
        } else{
            System.out.println("Nope!");
        }

        
    }
}
