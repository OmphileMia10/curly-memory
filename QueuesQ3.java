
package queuesq3;
import java.util.*;
public class QueuesQ3 {

   public static void main(String[] args) {
    //declare a Queue   
    Queue<String> names_queue = new LinkedList<>();
    Queue<String> names2_queue = new LinkedList<>();
    Queue<String> names3_queue = new LinkedList<>();
    
    //initialize 1st priority queue with values
    names_queue.add("Riaan");
    names_queue.add("Kabelo");
    names_queue.add("Palesa");
    names_queue.add("Thando");
    names_queue.add("Marianne");
    names_queue.add("Andile");
    //initialize 2nd priority queue with values
    names2_queue.add("Charles");
    names2_queue.add("Palesa");
    names2_queue.add("Tshiliwa");
    names2_queue.add("Xolisa");
    names2_queue.add("Andries");
    names2_queue.add("Thando");
    
    //print the Queue
    System.out.println("Elements in the First Priority Queue: ");
       System.out.println(names_queue);
       System.out.println("Elements in the Second Priority Queue: ");
       System.out.println(names2_queue);
       
       //print duplicates in the 3rd queue
       for(String element : names_queue){
           if (names2_queue.contains(element)){
               names3_queue.add(element);
           }
       }
       System.out.println("Elements in the Third Priority Queue: ");
       System.out.println(names3_queue);
    }
}
