package LearningJava1.OwnPractice;

/*This is Java code representing the famous Conjecture from Prussian Mathematician Christian Goldbach. 
 he had wonderful contributions to Number Theory. */

public class GoldbachConjecture {

    //Driver Code to run program
    public static void main(String[] args){ 
        int num = (int) ((Math.random() * 100)); //Even Number to represent sum of two primes. 
        boolean check = false; //Boolean for checking if the number is even.
        int counter = 0;
        for (int i = 2; i <= num / 2; ++i){ // For loop that begins the process of seperating the even number into sum of two primes. 
            if (checkPrime(i)){ //If the number is prime it runs down to the function below 

                if (checkPrime(num-i)){ 
                    System.out.printf("%d = %d + %d\n", num, i, num - i);
                    check = true;
                    counter += 1;
                }
            }
        }

        if (!check){
            System.out.println(num + " cannot be represented as the sum of two prime numbers. ");
        }
        System.out.printf("The number of equations for %d is %d. ", num, counter);
    }

    static boolean checkPrime(int n){ // Functiomn created to check if number is prime and returns that number via driver code for loop. 
        boolean isPrime = true;

        for (int i = 2; i<= n/2; ++i){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime; 
    }
}
