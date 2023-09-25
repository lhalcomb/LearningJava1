package LearningJava1.OwnPractice;
//import java.io.*;

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
        Node new_node = new Node(data); //<- why the hell isnt this working?, '*static class Node*'
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
    

    public static void main(String[] args){

    LinkedList list = new LinkedList();
        
    list = insert(list, 1);
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

    printList(list); //--> 2, 4, 8, 5



    }
}

