package LearningJava1.ObjectOrientation.ClassesNObjCont.Abstraction;

public class intDB extends DAO{

    @Override
    public void AppendDB(Object put) {
        if (put instanceof Integer){
        System.out.println("We are putting"+ put +" into our database.");
      }
    }

    @Override
    public void PopDB(int DBIndex) {
       System.out.println("We are getting item #" +DBIndex+ "from our database. ");
    }
    
    
}
