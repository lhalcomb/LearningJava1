package DSAlgorithms.sortnsearch;

public class binarysearch
{
    static int binsearching(int arr[], int key, int low, int high)
{
    int mid = low + (high - low) / 2;
    while (low <= high)
    {
        if(key == arr[mid]){

            break;
        }
        else if (arr[mid] > key)
        {
            high = mid - 1;
            
        }
        else
        {
            low = mid + 1;
            
        }
            mid = (low + high)/2;
            
        
        }
    
            return mid;
    
    }

public static void main(String args[])
    {
        int arr[] = {1, 4, 6, 9, 13};

        int n = 400; 

        int low = 0;
        int high = (arr.length) - 1;

        System.out.println(binsearching(arr, n, low, high));

    }


}