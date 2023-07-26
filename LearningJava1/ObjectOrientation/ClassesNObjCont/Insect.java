package LearningJava1.ObjectOrientation.ClassesNObjCont;

public class Insect {
    //int NumOfLegs;

    /*public Insect(int NumOfLegs){
        super();
        this.NumOfLegs = NumOfLegs;
    }*/


    private int NumOfLegs;

    public int getNumberOfLegs(){
        return NumOfLegs;
    }

    public void setNumOfLegs(int NumOfLegs){
        this.NumOfLegs = NumOfLegs;
    }

    public int getNumOfLegs(){
        return this.NumOfLegs;
    }


    
}
