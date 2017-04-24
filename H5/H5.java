/*
 * H5 Sorting
 */
import java.util.Random;
public class H5 
{   
    /*
     * method that sorts the list
     * parameter: the array
     */
    public static void bubbleSort(int array[]) 
    {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) 
        {
            for (int i = 0; i < n - 1; i++) 
            {
                k = i + 1;
                if (array[i] > array[k]) 
                    swapNumbers(i, k, array);
            }
        }
    }
    /*
     * method to swap the numbers in the sort
     * parameters: two ints to swap and the array
     */
    public static void swapNumbers(int i, int j, int[] array) 
    {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /*
     * method to print the numbers in the array
     * parameter: the array
     */
    public static void printNumbers(int[] input) 
    {     
        for (int i = 0; i < input.length; i++) 
        {
          System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    } 
    
    //method that generates a random int from 0-25
    public static int rand()
    {
      Random rand = new Random();
      int n = rand.nextInt(25);
      return n;
    }

    //MAIN METHOD
    public static void main(String[] args) 
    {
      //populate with 7 random ints from 0-25
      int[] input = { rand(), rand(), rand(), rand(), rand(), rand(), rand()};
      //prints unsorted
      printNumbers(input);
      //sorts
      bubbleSort(input);
      //prints sorted
      printNumbers(input);
    }
}