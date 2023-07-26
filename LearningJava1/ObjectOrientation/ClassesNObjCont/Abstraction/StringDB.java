package LearningJava1.ObjectOrientation.ClassesNObjCont.Abstraction;

public class StringDB extends DAO{

    @Override
    public void AppendDB(Object put) {
        if(put instanceof String){
       System.out.println("Putting String" +put+" into database.");
    }
}

    @Override
    public void PopDB(int DBIndex) {
        System.out.println("We are getting item #" +DBIndex+ "from our database. ");
    }


    
}
