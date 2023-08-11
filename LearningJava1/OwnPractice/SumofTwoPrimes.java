package LearningJava1.OwnPractice;

public class SumofTwoPrimes {
    public static void main(String[] args){
        int num = 34;
        boolean check = false;
        for (int i = 2; i <= num/2; i++){
            if (checkPrime(i)){

                if (checkPrime(num-i)){
                    System.out.printf("%d = %d + %d", num, i, num - 1);
                    check = true;
                }
            }
        }

        if (!check){
            System.out.println(num + "Cannot be represented as the sum of two prime numbers. ");
        }
    }

    static boolean checkPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i<= n/2; i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime; 
    }
}
