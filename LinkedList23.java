/**
 * Name: Omphile
 * Surname: Mosingathi
 * Question: 2.3
 * Student No.: LQXM83VR5
 */
package linkedlist23;

// Importing the Linked List class
import java.util.LinkedList;

// Program to search for an element using a Linked List
public class LinkedList23 {

    public static void main(String[] args) {
        //Initializing my Linked List
        LinkedList<Integer> myList = new LinkedList<>();
        //Adding elements to the Linked List
        myList.add(65);
        myList.add(30);
        myList.add(74);
        myList.add(52);
        myList.add(41);
        myList.add(69);
        myList.add(10);
        myList.add(30);
        myList.add(11);
        myList.add(21);
        myList.add(14);

        //search for the element
        int findElement = 10;
        
        int answer = -1;
        
        //traverse list to check element
        for (int i = 0; i < myList.size(); i++) {
            
            //checking every element in myList
            int fElement = myList.get(i);
            
            //check if the element being extracted is equal to the element searched
            if (fElement == findElement) {

                answer = i;
                break;
            }
        }
        if (answer == -1) {
            System.out.println("In " + myList);
            System.out.println(+findElement + " was Not found");
        } else {
            System.out.println("In " + myList);
            System.out.println(+findElement + " Was found" );
        }
    }
}
