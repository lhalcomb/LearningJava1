package DSAlgorithms.sortnsearch;

import java.util.Random;

public class SortAlgorithm 
{

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

    static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++)
        {
            if (arr[j] <= pivot) 
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return (i + 1);

    }
    

    static void quickSort(int arr[], int low, int high)
        {
        if (low < high) 
            {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
            }
        }



        static void printarray(int arr[], int size){
            int i; 
            for (i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        
        public static void main(String args[]){

            
            Random randi = new Random();
            int arr[] = new int[1215];
            for (int i = 0; i < arr.length; i++){
                arr[i] = randi.nextInt(100)+1;
        } 

            int n = arr.length;
            final long startBS = System.nanoTime();
            bubblesort(arr, n); 
            final long endBS = System.nanoTime();
            long elapsedBS = endBS - startBS;
            //System.out.println("The sorted list is: ");
            //printarray(arr, n);
            System.out.println("Total Bubble Sort execution time: " + (elapsedBS) + "ms\n");

            Random randj = new Random();
            int arrj[] = new int[1215];
            for (int j = 0; j < arrj.length; j++){
                arrj[j] = randj.nextInt(100)+1;
        } 

            int N = arrj.length;
            final long startQS = System.nanoTime();
            quickSort(arrj, 0, N-1); 
            final long endQS = System.nanoTime();
            long elapsedQS = endQS - startQS;
            //System.out.println("The sorted list is: ");
            //printarray(arr, N);
            System.out.println("Total Quick Sort execution time: " + (elapsedQS) + "ms\n");

    

        } 
    }

    

