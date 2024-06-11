<<<<<<< HEAD
package DSAlgorithms.sortnsearch;

import java.util.Random; import java.lang.Math; import java.util.*; import jdk.jfr.Event;


public class SearchingAlgo 
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

    static int linearSearch(int arr[], int n, int x)
    {
        for (int i = 1; i < n; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
        
        
    }

    static int binsearch(int arr[], int l, int r, int x)
    {
        int m = (r + l) / 2; 
        while (l <= r){

            if (arr[m] > x)
            {
                r = m - 1;
            }
            else if (arr[m] == x)
            {
                //System.out.println("The element was found at index: " + m);
                break;
            }
            else
            {
                l = m + 1;
            }
            m = (r + l)/2;

        }
        return m;
    }

    static void printarray(int arr[], int size){
        int i; 
        for (i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp; 
        }
    }

    

    public static void main(String args[]){

        //case 1
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100)+1;
        }
        bubblesort(arr, arr.length);
        System.out.println("List being searched: ");
        printarray(arr, arr.length);
        /*reverseArr(arr);
        System.out.println("reversed string " + Arrays.toString(arr));*/
        

        int x = (int)((Math.random() * 100) + 1);
        System.out.println("Searching list for number " + x);
        int n = arr.length - 1;


        //case 1 linear search
        //execution time
         /*final long startLS = System.nanoTime();
         System.out.print("Linear Search ->> " + "index ");
         System.out.println(linearSearch(arr, n, x)); 
         final long endLS = System.nanoTime();
         long elapsedLS = endLS - startLS; 
         System.out.println("Total Linear Search execution time: " + (elapsedLS) + "ms");

        //space used
        /*linearSearch(arr, n, x);
        Runtime lruntime = Runtime.getRuntime();
        lruntime.gc();
        long linsearchmem = lruntime.totalMemory() - lruntime.freeMemory();
         
        System.out.println("Total Linear Search memory usage: " + linsearchmem + "\n");*/

        //case 1 binary search
        //execution time
         //final long startBS = System.nanoTime();
         System.out.println("Binary Search ->> " + "index " + binsearch(arr, 0, n, x));
         //final long endBS = System.nanoTime();
         //long elapsedBS = endBS - startBS;
         //System.out.println("Total Binary Search execution time: " + (elapsedBS) + "ms");

        //space used
        
         /*binsearch(arr,0, n, x);
         Runtime bruntime = Runtime.getRuntime();
         bruntime.gc();
         long binsearchmem = bruntime.totalMemory() - bruntime.freeMemory();
         
         
         System.out.println("Total Binary Search memory usage: " + (binsearchmem) + "\n");*/


    }
}
=======
package DSAlgorithms.sortnsearch;

import java.util.Random; 
import java.lang.Math; 


public class SearchingAlgo 
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

    static int linearSearch(int arr[], int n, int x)
    {
        for (int i = 1; i < n; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
        
        
    }

    static int binsearch(int arr[], int l, int r, int x)
    {
        int m = (r + l) / 2; 
        while (l <= r){

            if (arr[m] > x)
            {
                r = m - 1;
            }
            else if (arr[m] == x)
            {
                //System.out.println("The element was found at index: " + m);
                break;
            }
            else
            {
                l = m + 1;
            }
            m = (r + l)/2;

        }
        return m;
    }

    static void printarray(int arr[], int size){
        int i; 
        for (i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp; 
        }
    }

    

    public static void main(String args[]){

        //case 1
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100)+1;
        }
        bubblesort(arr, arr.length);
        System.out.println("List being searched: ");
        printarray(arr, arr.length);
        /*reverseArr(arr);
        System.out.println("reversed string " + Arrays.toString(arr));*/
        

        int x = (int)((Math.random() * 100) + 1);
        System.out.println("Searching list for number " + x);
        int n = arr.length - 1;


        //case 1 linear search
        //execution time
         /*final long startLS = System.nanoTime();
         System.out.print("Linear Search ->> " + "index ");
         System.out.println(linearSearch(arr, n, x)); 
         final long endLS = System.nanoTime();
         long elapsedLS = endLS - startLS; 
         System.out.println("Total Linear Search execution time: " + (elapsedLS) + "ms");

        //space used
        /*linearSearch(arr, n, x);
        Runtime lruntime = Runtime.getRuntime();
        lruntime.gc();
        long linsearchmem = lruntime.totalMemory() - lruntime.freeMemory();
         
        System.out.println("Total Linear Search memory usage: " + linsearchmem + "\n");*/

        //case 1 binary search
        //execution time
         //final long startBS = System.nanoTime();
         System.out.println("Binary Search ->> " + "index " + binsearch(arr, 0, n, x));
         //final long endBS = System.nanoTime();
         //long elapsedBS = endBS - startBS;
         //System.out.println("Total Binary Search execution time: " + (elapsedBS) + "ms");

        //space used
        
         /*binsearch(arr,0, n, x);
         Runtime bruntime = Runtime.getRuntime();
         bruntime.gc();
         long binsearchmem = bruntime.totalMemory() - bruntime.freeMemory();
         
         
         System.out.println("Total Binary Search memory usage: " + (binsearchmem) + "\n");*/


    }
}
>>>>>>> d6f526c51a0267859233adc45da94e8a1c176324
