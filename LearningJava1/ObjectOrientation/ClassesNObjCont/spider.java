package LearningJava1.ObjectOrientation.ClassesNObjCont;

public class spider extends Insect{
    //int NumOfEyes;

    public spider(int numOfLegs){
        super(numOfLegs);
        //this.NumOfEyes = NumOfEyes;
    }

    private int NumOfEyes;

    public void setNumOfEyes(int NumOfEyes){
        if (NumOfEyes < 11){
            this.NumOfEyes = NumOfEyes;
        }
    }

    public int getNumOfEyes(){
        return NumOfEyes;
    }

    
}
