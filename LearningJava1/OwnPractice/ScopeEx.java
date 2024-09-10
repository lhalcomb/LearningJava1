
public class ScopeEx {

    static void sub(){
        int count = 5;
        while (count < 10){
            count++;
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
       sub();
    }
}