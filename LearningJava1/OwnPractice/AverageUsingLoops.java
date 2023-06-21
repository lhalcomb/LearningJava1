package LearningJava1.OwnPractice;

public class AverageUsingLoops{
    public static void main(String[] args){
        int[] numbers =  {3,5,2,34,98,52,35,67,43,1};

        double sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.length; i++){
            sum+=numbers[i];
        }
        average = sum/numbers.length;
        System.out.println("The average of the array is: " +average);
    }
}