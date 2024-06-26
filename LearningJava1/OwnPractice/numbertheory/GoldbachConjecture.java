package numbertheory;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*This is Java code representing the famous Conjecture from Prussian Mathematician Christian Goldbach. 
 he had wonderful contributions to Number Theory. */
 //Goldbach's partition, Goldbach's comet 

public class GoldbachConjecture {

    //Driver Code to run program
    public static void main(String[] args){ 


        //int n = (int) ((Math.random() * 100)); //Even Number to represent sum of two primes.
        int n = 10; // Number of even numbers to generate and check

        System.out.printf("Printing" + n + " amount of equations");
        Map<Integer, Integer> EvenNumberofEq = new HashMap<>();
        Map<Integer, Integer> PrimeIntensityMap = new HashMap<>();

        List<Integer> EqCountList = new ArrayList<>();



        for (int i = 2; i <= n; i++) {
            int num = 2 * i; // Generating even numbers
            //System.out.println("Even number: " + num);

            int equationCount = SumSeperation(num);
            EvenNumberofEq.put(num, equationCount);
            updatePrimeIntensityMap(num, PrimeIntensityMap);
            System.out.println(); // Add a newline for better readability
        }


        // Print the map
        System.out.println("Even numbers and their corresponding equations count:");
        for (Map.Entry<Integer, Integer> entry : EvenNumberofEq.entrySet()) {
            int evenNumber = entry.getKey();
            int equationsCount = entry.getValue();
            System.out.println("Even number: " + evenNumber + ", Equations count: " + equationsCount);
            EqCountList.add(equationsCount);
        }


        //Print Prime Intensity Analysis
        for (Map.Entry<Integer, Integer> entry : PrimeIntensityMap.entrySet()){
            int primeNumber = entry.getKey();
            int intensity = entry.getValue();
            if (checkPrime(primeNumber)){
                System.out.println("Prime number: " + primeNumber + ", Intensity: " + intensity);
            }
        }
        
        // for (int count: EqCountList){
        //     System.out.print(count+", ");
        // }
        
    }



    static void updatePrimeIntensityMap(int num, Map<Integer, Integer> PrimeIntensityMap){
        for (int i = 2; i <= num/ 2; i++){
            if (checkPrime(i) && checkPrime( num - i)){
                PrimeIntensityMap.put(i, PrimeIntensityMap.getOrDefault(i, 0) + 1);
                PrimeIntensityMap.put(num - i, PrimeIntensityMap.getOrDefault(num - i, 0) + 1);
            }
        }
    }



    static int SumSeperation(int num){

        boolean check = false; //Boolean for checking if the number is even.
        int counter = 0;
        for (int i = 2; i <= num / 2; ++i){ // For loop that begins the process of seperating the even number into sum of two primes. 
            if (checkPrime(i)){ //If the number is prime it runs down to the function below 

                if (checkPrime(num - i)){ 
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

        return counter;
    }



    static boolean checkPrime(int n){ // Function created to check if number is prime and returns that number via driver code for loop. 
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
