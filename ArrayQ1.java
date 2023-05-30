
package arrayq1;

import java.util.Arrays;
 
public class ArrayQ1 {
    /*Method created to:
    Sort all the elements in the array
    Remove all the duplicates in the array and copy them to a new array
    Print all arrays with duplicates removed
    */
    
    //method starts by creating new array named test1
   static void removeDuplicates(int[] test1)
    {
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("All elements in Test1 array : ");
        
        //Sorting and displaying elements
        for (int i = 0; i < test1.length; i++)
        {
            System.out.print(test1[i]+"\t");
        }
         
        //Assuming all elements in input array are unique
         
        int no_unique_elements = test1.length;
         
        //Comparing each element with all other elements
         
        for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
                //If any two elements are found equal
                 
                if(test1[i] == test1[j])
                {
                    //Replace duplicate element with last unique element
                     
                    test1[j] = test1[no_unique_elements-1];
                     
                    no_unique_elements--;
                     
                    j--;
                }
            }
        }
         
        //Copying only unique elements of test1 into test2
         
        int[] test2 = Arrays.copyOf(test1, no_unique_elements);
         
        //Printing arrayWithoutDuplicates
         
        System.out.println();
         
        System.out.println("Test2 array with duplicates removed : ");
         
        for (int i = 0; i < test2.length; i++)
        {
            System.out.print(test2[i]+"\t");
        }
         
        System.out.println();
         
        System.out.println("---------------------------");
    }
     
    public static void main(String[] args) 
    { 
        //invokes the method created
        removeDuplicates(new int[] {34, 12, 67, 89, 12, 34, 19, 20, 9, 67});
              
      }    
}