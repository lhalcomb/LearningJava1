package DSAlgorithms.heap;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class kthsmallest {
    
    public static int findKthSmallest(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<Integer>((n1, n2) -> n2 - n1);

        for (int n: nums)
        {
            maxHeap.add(n);

            if (maxHeap.size() > k)
            {
                //maxHeap.poll();
                System.out.println(maxHeap.poll());
            }
        }
        return maxHeap.poll();
    }

    public static void main(String[] args)
    {
        //int [] arr = {7, 4, 6, 3, 9, 1};
        Random rand = new Random();
        int arr1[] = new int[10];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = rand.nextInt(100)+1;
        }
        System.out.println("Array is : "+java.util.Arrays.toString(arr1));
        System.out.println("The K'th smallest element is " + findKthSmallest(arr1, 5));
    }
}
