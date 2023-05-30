
package question4array;

import java.util.Arrays;

/*
Name: Omphile 
Surname: Mosingathi
Student No: Lqxm83vr5
Question: 4
 */
public class Question4 {

    // Main method
    public static void main(String[] args) {
        //First array implemented
        int array1[] = {1, 3, 5, 7};
        int num1 = array1.length;
        //Second array implemented
        int array2[] = {2, 4, 6, 8};
        int num2 = array2.length;

        //Final array that returns a new sorted array with all elements
        int array3[] = new int[num1 + num2];
        returnArrays(array1, array2, num1, num2, array3);

        System.out.println("Here is the new sorted array: ");
        //Loop to iterate through the array
        for (int i = 0; i < num1 + num2; i++) {
            System.out.print(array3[i] + " ");
        }

    }

    public static void returnArrays(int[] array1, int[] array2, int num1, int num2, int[] array3) {
        //Initialise arrays
        int i = 0;
        int j = 0;
        int k = 0;

        // This traverses the first array 
        while (i < num1) {
            array3[k++] = array1[i++];
        }

        // This traverses the second array 
        while (j < num2) {
            array3[k++] = array2[j++];
        }

        // This sorts the entire array 3
        Arrays.sort(array3);
    }
}