package LearningJava1.DataTypes;

public class VariableTypes {
    public static void main(String[] args) {
        /*
         * Java Built-in Data Types:
         * Essential to Memory Storage Types, hence "Data Types"
         * byte - whole number with B
         * short - smaller number
         * int - a number
         * long - a big whole number
         * float - decimal data type
         * double - another decimal data type but bigger
         * boolean - comparison data type for conditionals and loops
         * char - character data type
         */

        byte k = 127;
        short b = 32767;
        int a = 2147483647;
        long t = 9223372036854775807l;

        // Below is the maximum values for the previously listed Java Data Types
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        float g = 9.8F;
        double pi = 3.14;

        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Double.MAX_EXPONENT);

        float sum = (float) (4.5 + 56 + g);
        System.out.println(sum);

        /* Homework Part */

        byte k1 = 2;
        short b1 = 4;
        int a1 = 15;
        long t1 = 295147905179352830l;
        float g1 = 9.8F;
        double pi1 = 3.14;

        float sum2 = (float) (k1 + b1 + a1 + t1 + g1 + pi1);
        System.out.println(sum2);

    }
}
