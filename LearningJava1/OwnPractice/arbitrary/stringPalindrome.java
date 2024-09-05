package arbitrary; 


public class stringPalindrome{
    //Did this problem in an interview for Ciholas
    
    static boolean Palindrome(String str){ //racecar
        int lastStr = str.length();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(lastStr - 1)){
                lastStr--;
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
       System.out.println(Palindrome("rotator"));
    }
}
