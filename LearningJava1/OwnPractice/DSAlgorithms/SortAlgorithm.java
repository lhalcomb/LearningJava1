package LearningJava1.OwnPractice.DSAlgorithms;

import java.util.Random;

public class SortAlgorithm {

    static void bubblesort(int arr[], int n){
        int temp, i, j;
        boolean swapped;

        for (i = 0; i < n - 1; i++){   
            swapped = false;
            for (j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j + 1];
                    arr[j+1] = temp;
                    swapped = true; 

                }
            }
            if (swapped == false){
                    break;
                }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }

    static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; i <= high - 1; i++)
        {
            if (arr[j] < pivot) 
            {
                i++;
                swap(arr, i, j);
            }

        }
        swap(arr, i + 1, high);
        return (i + 1);

    }
    

    static void quickSort(int arr[], )



        static void printarray(int arr[], int size){
            int i; 
            for (i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        
        public static void main(String args[]){

            
            Random rand = new Random();
            int[] arr = new int[1];
            for (int i = 0; i < arr.length; i++){
                arr[i] = rand.nextInt(100)+1;
        } 
            int n = arr.length;
            final long startBS = System.nanoTime();
            bubblesort(arr, n); 
            final long endBS = System.nanoTime();
            long elapsedBS = endBS - startBS;
            double convertBS = (double) elapsedBS / 1000000000;
            System.out.println("The sorted list is: ");
            printarray(arr, n);
            System.out.println("Total Bubble Sort execution time: " + (convertBS) + "s\n");

    

        } 
    }

    

