package ArrayPractice;

public class Main
{
    public static void main(String[] args)
    {
        // Create 2D array

        // Change the final element of the 1D array at index 0 to the total length of the 2D array

        // Add the value at the 1st and last index of the 2D array to the value of the last element in the 1D array at index 1

        // Change each value of the 1D array at index 2 to display the length of each respective 1D array.

        // Print the new array
    }


    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
