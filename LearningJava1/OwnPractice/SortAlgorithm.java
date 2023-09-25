import java.io.*;

public class SortAlgorithm 
{

    static void bubblesort(int lst[], int n)
    {
        int temp, i, j;
        boolean swapped;

        for (i=0; i < n-1; i++)
        {   swapped = false;
            for (j=0; j < n-i-1; j++)
            {
                if (lst[j] > lst[j+1])
                {
                    temp = lst[j];
                    lst[j]= lst[j + 1];
                    lst[j+1] = temp;
                    swapped = true; 

                }

            }
        }
        if(swapped = false)
        {
            break;
        }
    }
}

        static printarray(int lst[], int size)
        {
            int i; 
            for (i = 0; i <= size; i++)
            {
                System.out.print(" " + lst[i]);
                System.out.println(); 
            }
        }
    
        
        public static void main(String[] args)
        {

            
            int lst[] = {34, 54, 97, 38, 79, 39, 23, 41}; 
            int size = lst.length();

            System.out.println(" The list that we are sorting is: " + printarray(lst, n));
            bubblesort(lst, num);
            System.out.println("This is the list sorted using Bubble Sort:" + printarray(lst, n));

    

        }
}
    

