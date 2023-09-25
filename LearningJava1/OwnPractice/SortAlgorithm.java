package LearningJava1.OwnPractice;

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


        static void printarray(int arr[], int size){
            int i; 
            for (i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        
        public static void main(String[] args){

            
            int arr[] = {34, 54, 97, 38, 79, 39, 23, 41}; 
            int n = arr.length;
            bubblesort(arr, n);
            System.out.println("The sorted list is: ");
            printarray(arr, n);

    

        } 
    }

    

