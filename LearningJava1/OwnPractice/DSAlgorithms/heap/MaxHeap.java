package DSAlgorithms.heap;

public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    public MaxHeap(int maxsize){
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }

    private int parent(int ind) { return (ind - 1) / 2; }

    private int leftChild(int ind) { return (ind * 2) + 1; }

    private int rightChild(int ind) { return (ind * 2) + 2;}

    private boolean isLeaf(int ind)
    {
        if (ind > (size/2) && ind <= size) 
        {
            return true;
        }else{
            return false;
        }
    }

    private void swap(int fInd, int sInd)
    {
        int temp = Heap[fInd];
        Heap[fInd] = Heap[sInd];
        Heap[sInd] = temp;

    }

    private void maxHeapify(int ind)
    {
        if (isLeaf(ind))
        {
            if (Heap[ind] < Heap[leftChild(ind)]
            || Heap[ind] < Heap[rightChild(ind)]) 
            {
                if (Heap[leftChild(ind)]
                > Heap[rightChild(ind)]) 
                {
                    swap(ind, leftChild(ind));
                    maxHeapify(leftChild(ind));
                }
                else
                {
                    swap(ind, rightChild(ind));
                    maxHeapify(rightChild(ind));
                }
            }
        }
    }

    public void insert(int element)
    {
       Heap[size] = element;

       int current = size;
       while (Heap[current] > Heap[parent(current)])
       {
        swap(current, parent(current));
        current = parent(current);
       }
       size++;
    }

    public void print()
    {
        
        for (int i = 0; i < size / 2; i++)
        {
            System.out.print("Parent Node:" + Heap[i]);

            if (leftChild(i)
                < size) 
                System.out.print(" Left Child Node: "
                                 + Heap[leftChild(i)]);
 
            if (rightChild(i)
                < size) 
                System.out.print(" Right Child Node: "
                                 + Heap[rightChild(i)]);
 
            System.out.println(); 
        }
    }
    

    public int removeMax()
    {
        int popped = Heap[0];
        Heap[0] = Heap[size--];
        maxHeapify(0);
        return popped;
    }

    public int kthSmallestElement(int k)
    {
        int smallest = Heap[size];
        int sm = Heap[smallest - k];

        return sm;

    }

    public static void main(String[] args)
    {
        MaxHeap maxHeap = new MaxHeap(7);

        maxHeap.insert(7);
        maxHeap.insert(4);
        maxHeap.insert(6);
        maxHeap.insert(3);
        maxHeap.insert(9);
        maxHeap.insert(1);

        maxHeap.print();

        System.out.print(maxHeap.removeMax());

        System.out.println(maxHeap.kthSmallestElement(3));

        //System.out.print(maxHeap.size());

        //for (int i = 0; i < maxHeap.size()
    }
}
    

