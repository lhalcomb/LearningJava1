<<<<<<< HEAD
package LearningJava1.OwnPractice.numbertheory;

class PrimeNum{

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }else{
            for (int i =2; i < n; i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){

        if (isPrime(124612)){
            System.out.println("The number " + 124612 +" is prime");
        }else{
            System.out.println("The number "+  124612 + " isn't a prime.");
        }


    }

=======
package numbertheory;

class PrimeNum{

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }else{
            for (int i =2; i < n; i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){

        if (isPrime(124612)){
            System.out.println("The number " + 124612 +" is prime");
        }else{
            System.out.println("The number "+  124612 + " isn't a prime.");
        }


    }

>>>>>>> d6f526c51a0267859233adc45da94e8a1c176324
}