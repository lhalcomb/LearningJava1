package DSAlgorithms.heap;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.ArrayList;

public class kthsmallest {
    
    public static int findKthSmallest(ArrayList<Integer> nums, int k) {
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
        ArrayList<Integer> arr = new ArrayList<Integer>(6);
        arr.add(7);
        arr.add(4);
        arr.add(6);
        arr.add(3);
        arr.add(9);
        arr.add(1);

        /* Random rand = new Random();
        int arr1[] = new int[10];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = rand.nextInt(100)+1;
        } */
        //System.out.println("Array is : "+java.util.Arrays.toString(arr));

        System.out.println("Array is : " + arr);

        System.out.println("The K'th smallest element is " + findKthSmallest(arr, 5));
    }
}

