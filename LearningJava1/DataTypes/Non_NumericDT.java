package LearningJava1.DataTypes;

public class Non_NumericDT {
    public static void main(String[] args) {
        /* Boolean and Characters are non-numeric Data Types
         * 
         */

         boolean a = true; // Boolean True
         boolean  b = false; // Boolean False

         System.out.println(a);
         System.out.println(b);

         char c  = 'c';
         char c1 = 99;
         //There is also String but this is a full 'string'  of characters!
         //String d = "This is a string!"; //This is not a primitive data type in Java
         
         System.out.println((int)c);
         System.out.println(c1);

         char[10] s = "hello";

    }
}
