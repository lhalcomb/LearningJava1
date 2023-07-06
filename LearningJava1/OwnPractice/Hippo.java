package LearningJava1.OwnPractice;

public class Hippo {
    int weightinGrams;
    int heightInMillimeters;

    double weightinKilograms;
    double heightInMeters;


    Hippo(int weigthInGrams, int heightInMillimeters){
        this.weightinKilograms = (double)weigthInGrams/1000;
        this.heightInMeters = (double)heightInMillimeters/1000;
    }
    public double getweigthinKilograms(){
        return weightinKilograms;
    }
    public double getheightInMeters(){
        return heightInMeters;
    }
}
