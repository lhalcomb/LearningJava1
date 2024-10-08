package DSAlgorithms;
//import java.io.*;

import java.util.Random;

public class LinkedList 
{
    Node head;
   
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d; 
            next = null;
        }
    }

    
    public static LinkedList insert(LinkedList list, int data)
    {
        Node new_node = new Node(data); //<- why the hell isnt this working?, 'static class Node'
        new_node.next = null;
       
        // If the linkedlist is empty then make this node as head of the Linked List and return
        if (list.head == null)
        {
            list.head = new_node;
        
        //Traverse through the list and add the inserted data at the end 
        }else {
            Node last = list.head;
            while (last.next != null){
                last = last.next; 
            }

            last.next = new_node; 
        }

        // Return the new inserted list 
        return list;
    }


    public static LinkedList InsertAfter(LinkedList list, int temp, int data)
    {
        Node new_node = new Node(data);
        Node traverse = list.head;

        while (traverse.next != null)
        {
            if (traverse.data == temp){
                new_node.next = traverse.next;
                traverse.next = new_node;
                break;
            }
        traverse = traverse.next;
        }


        return list;
        

    }

    public static LinkedList 
    RemoveNodebyKey(LinkedList list, int key)
    {
        Node CurrNode = list.head, prev = null;

        if (CurrNode != null && CurrNode.data == key)
        {
            list.head = CurrNode.next;
            System.out.println(key + "found and deleted");
            
            return list;

        }

        while (CurrNode != null && CurrNode.data != key)
        {
            prev = CurrNode;
            CurrNode = CurrNode.next;

        }
        if (CurrNode != null)
        {
            prev.next = CurrNode.next;
            System.out.println(key + " found and deleted");
            
            return list;
        }

        if (CurrNode == null)
        {
            System.out.println("Not Found");
        
        }
        return list;
    
    }


    public static LinkedList 
    DeleteNodeAtPos(LinkedList list, int index)
    {
        Node CurrNode = list.head, prev = null;

        if (index == 0 && CurrNode != null) // Case 1: If index is 0, then the head must be deleted
        {   
            list.head = CurrNode.next;
            System.out.println(index + " element was deleted.");
            
            return list;
        }

        int counter = 0; //Case 2: If the index is greater than 0 but less than the size of LinkedList
        while (CurrNode != null)
        {
            if (counter == index)
            {
                prev.next = CurrNode.next;

                System.out.println(index + " position element deleted.");

                break;

            }else
            {
                prev = CurrNode.next;
                CurrNode = CurrNode.next;
                counter++;

            }
        }

        if (CurrNode == null) //Case 3: The index given is greater than the size of the list
        {
            System.out.println(index + " was not found."); //here we will just return a dummy statement 
        }

        return list;

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

    public static void printList(LinkedList list)
    { 
     Node CurrNode = list.head;
     System.out.print("Linked List: ");
      
     while (CurrNode != null)
      {
        System.out.print(CurrNode.data + " ");
        CurrNode = CurrNode.next;
      }
      System.out.println();
    }
    public void swapNodes(int x, int y){

        //Edge Case #1. See if list is empty
        if (head == null){
            return;
        }

        //Edge Case #2. If x == y then do nothing
        if (x == y){
            return;
        }

        //Traversing for x
        Node prevX = null;
        Node currX = head;

        while (currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        //Traversing for y
        Node prevY = null;
        Node currY = head;

        while (currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }

        //If neither the x and y element to be swapped is in the list then just return
        if (currX == null || currY == null){
            return;
        }

        // Swap x with y
        if (prevX != null){
            prevX.next = currY;

        }else{
            head = currY;
        }
        
        // Swap y with x
        if(prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        //Swaps the nodes in list 
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp; 

    }

    public void printList()
    {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("");
    }

    public static void main(String[] args){

    LinkedList list = new LinkedList();

    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 69);
    list.printList();
    list.swapNodes(1, 69);
    list.printList();
    list.RemoveNodebyKey(list, 69);
    list.printList();

    Random rand = new Random();
    LinkedList list2 = new LinkedList();
    int arr[] = new int[10];
    for (int i = 0; i < arr.length; i++){
        arr[i] = rand.nextInt(100)+1;
        list2 = insert(list2, arr[i]);
    } 

    System.out.print("Unsorted Linked List --> ");
    list2.printList();
    list2.head = list.mergeSort(list2.head);
    System.out.print("Sorted Linked List -->  ");
    list2.printList();
        
    /*list = insert(list, 1);
    list = insert(list, 2);
    list = insert(list, 3);
    printList(list); //--> 1, 2, 3

    RemoveNodebyKey(list, 3);

    printList(list); //--> 1, 2

    list = insert(list, 4);
    list = insert(list, 5);


    DeleteNodeAtPos(list, 0);
    printList(list); //--> 2, 4, 5

    InsertAfter(list, 4, 8);

    printList(list); //--> 2, 4, 8, 5*/
 


    }
}
