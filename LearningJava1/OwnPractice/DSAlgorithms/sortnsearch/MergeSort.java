package LearningJava1.OwnPractice.DSAlgorithms.sortnsearch;

import java.util.Random;

public class MergeSort 
{
    Node head; 
    
    static class Node 
    {
        long data;
        Node next;

    public Node(long d)
    {
        this.data = d;
    }
}

    void push(long data)
    {
        Node new_node = new Node(data);

        new_node.next = head;
        head = new_node;

    }

    Node merge(Node a, Node b)
    {
        Node result = null;
        if (a == null)
        {
            return a;
        }
        if (b == null)
        {
            return b;
        }

        if (a.data <= b.data)
        {
            result = a;
            result.next = merge(a.next, b);
        }
        else{
            result = b; 
            result.next = merge(b, b.next);
        }
        return result;
    }

    public static Node getMiddle(Node head)
    {
        if (head == null)
        {
            return head;
        }

        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    Node mergeSort(Node h)
    {
        if (h == null || h.next == null)
        {
            return h;
        }
        Node middle = getMiddle(h);
        Node next2middle = middle.next;

        middle.next = null;

        Node left = mergeSort(h);
        Node right =  mergeSort(next2middle);
        Node sortedlist = sortedMerge(left, right);

        return sortedlist;
    }

    Node sortedMerge(Node a, Node b)
    {
        Node result = null;

        if (a == null)
        {
            return b;
        }
        if (b == null)
        {
            return a;
        }

        if (a.data <= b.data)
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else
        {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public void printList(Node head)
    {
        while (head != null) 
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String args[])
    {

        MergeSort li = new MergeSort();

        Random rand = new Random();
        long arr[] = new long[1215];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(500)+1;
            li.push(arr[i]);
        }   
        
        
        final long startMS = System.nanoTime();
        li.head = li.mergeSort(li.head);
        final long endMS = System.nanoTime();
        long elapsedMS = endMS - startMS;
        System.out.print("Sorted Linked List -->  ");
        li.printList(li.head);
        System.out.println();
        System.out.println("Time took to sort: "+ elapsedMS +"ms");

    
    }

}
