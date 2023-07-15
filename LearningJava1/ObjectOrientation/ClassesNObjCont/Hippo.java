package LearningJava1.ObjectOrientation.ClassesNObjCont;

public class Hippo extends mammal {

    Hippo(int weigthInGrams, int heightInMillimeters, String ColorofFur){
        super(ColorofFur);
        this.weightinKilograms = (double)weigthInGrams/1000;
        this.heightInMeters = (double)heightInMillimeters/1000;
    }
}
