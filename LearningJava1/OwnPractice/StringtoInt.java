public class StringtoInt{
    static int StringtoInteger(String string){ // Beginning of recursive function denoted as StringtoInteger
        
        
        if(string.length() == 1){
            return (string.charAt(0) - '0'); /*If the number represented as a string contains only a single digit then we just return its value in the computer memory*/
        }else{
            double y = StringtoInteger(string.substring(1)); /* recursive call for the substring starting at the second character in the string */

            double x = string.charAt(0) - '0'; /* the very first digit of the number */

            x = x * Math.pow(10, string.length() - 1) + y; /* The first digit multiplied by the appropiate power of 10 and then add the recursive result */
        
            return (int)(x);
        }

        // For example, xy = ((x * 10) + y)
    }

    public static void main(String[] args){

        String string = "3";

        System.out.println(StringtoInteger(string));
    }
}