package priorityqueueq3;
//Java program to demonstrate the working of a Priority Queue
/**
 * Name: Omphile
 * Surname: Mosingathi
 * Question: 3
 * Student No.: LQXM83VR5
 */
import java.util.*;
import java.util.Comparator;

public class PriorityQueueQ3 {

    //Main Method
    public static void main(String[] args) {

        String pName;
        int pCondition;

        boolean exit = false;

        //Creating empty priority queue
        PriorityQueue pQueue = new PriorityQueue();

        do {
            try {
            System.out.println("Main Menu");
            System.out.println("----------------------");
            System.out.println("1 Schedule a patient");
            System.out.println("2 Treat a patient");
            System.out.println("3 Treat all patients");
            System.out.println("4 Exit the program");
            System.out.println("----------------------");

            //Scanner to accept user input
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number [1-4]");
            int num = sc.nextInt();

            switch (num) {
                
                case 1:
                    //When the use selects 'Schedule Option',
                    //The program allows the user to enter patient's
                    //name and condition and patient is
                    //placed in line for treatment according to
                    //sternness of his/her condition
                    Scanner input = new Scanner(System.in);
                    System.out.println("----------------------");
                    System.out.println("Enter patient's name: ");
                    pName = input.nextLine();
                    pQueue.add(pName);
                    System.out.println("----------------------");
                    System.out.println("Patient's condition");
                    System.out.println("----------------------");
                    System.out.println("1 Critical");
                    System.out.println("2 Serious");
                    System.out.println("3 Fair");
                    System.out.println("----------------------");
                    System.out.println("Enter a number [1-3]");
                    pCondition = (input.nextInt());
                    if (pCondition == 1) {
                        System.out.println(pName + " is added to the critical list");
                    } else if (pCondition == 2) {
                        System.out.println(pName + " is added to the serious list");
                    } else if (pCondition == 3) {
                        System.out.println(pName + " is added to the fair list");
                    }
                    break;
                case 2:
                    //When User Selects The 'Treat Next Patient' Option,
                    //Program Removes and Displays the patient's first in line
                    //with the most serious condition
                    System.out.println(pQueue.poll());
                    break;
                case 3:
                    //When User selects the 'Treat All Patients' option,
                    //program removes and displays all patients in order from
                    //patient to serve first to patient to serve last
                    //System.out.println(pQueue + " is being treated");
                    for (Object s : pQueue) {
                        System.out.println(s + "/ is being treated");
                    }
                    System.out.println("No patients available to treat");
                    break;
                case 4:
                    //User terminates the program
                    exit = true;
                    break;    
            }
            } catch (Exception e) {
                System.out.println("Error :" + e);
            }
        } while (!exit);
    }
}


