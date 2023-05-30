/**
 * Name: Omphile
 * Surname: Mosingathi
 * Question: 2.2
 * Student No.: LQXM83VR5
 */
package heapinsertion;

// Java program for implementing insertion in Heaps

import java.util.Arrays;

public class HeapInsertion {

    // Function to heapify ith node in a Heap
    // of size n following a Bottom-up approach
    static void heapify(int[] arr, int n, int i) {
        // Find parent
        int prnt = (i - 1) / 2;

        if (arr[prnt] > 0) {
            // For Max-Heap
            // If current node is greater than its parent
            // Swap both of them and call heapify again
            // for the parent
            if (arr[i] > arr[prnt]) {

                // swap arr[i] and arr[parent]
                int top = arr[i];
                arr[i] = arr[prnt];
                arr[prnt] = top;

                // Recursively heapify the parent node
                heapify(arr, n, prnt);
            }
        }
    }

    // Function to insert a new node to the heap.
    static int insertNode(int[] arr, int n, int Key) {
        // Increase the size of Heap by 1
        n = n + 1;

        // Insert the element at end of Heap
        arr[n - 1] = Key;

        // Heapify the new node following a
        // Bottom-up approach
        heapify(arr, n, n - 1);

        // return new size of Heap
        return n;
    }

    /* A utility function to print array of size n */
    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }

    // Driver Code
    public static void main(String args[]) {
        // Array representation of Max-Heap
        //Current array before inserting 55
        //     15
        //    /  \
        //  50    60
        //  / \   /
        // 22 30 44

        // maximum size of the array
        int MAX = 10;
        int[] arr = new int[MAX];

        // initializing some values
        arr[0] = 77;
        arr[1] = 50;
        arr[2] = 60;
        arr[3] = 22;
        arr[4] = 30;
        arr[5] = 44;
        

        // Current size of the array
        int n = 6;

        // the element to be inserted
        int Key = 55;

        // The function inserts the new element to the heap and
        // returns the new size of the array
        n = insertNode(arr, n, Key);
        System.out.println("-------------------------");
        System.out.println("After Adding element 55");
        printArray(arr, n);
        // Final Heap will be:
        //     77
        //    /   \
        //  50     60
        //  / \    / \
        // 22 30  44 55
    }
}
