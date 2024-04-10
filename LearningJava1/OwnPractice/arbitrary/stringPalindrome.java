package arbitrary; 


public class stringPalindrome{
    //Did this problem in an interview for Ciholas
    
    static boolean Palindrome(String str){ //racecar
        int strSize = str.length();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(strSize - 1)){
                strSize--;
            }
            else{
                return false; 
            }
        }
        return true;
    }

    public static void main(String args[]){
        String testStr = "racecar";
       System.out.println(Palindrome(testStr));
       System.out.println(Palindrome("blah"));
    }
}
