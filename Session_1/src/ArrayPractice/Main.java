package ArrayPractice;

public class Main
{

    public static void main(String[] args)
    {
        // Create 2D array
        int[][] arr = {{18, 7, 23, 12, 5, 0}, {524, 789, 312, 871, 193, 634, 219}, {3, 6, 9}};

        /* KEEP SPACE IN YOUR CODE
         * You're getting the length of the entire array.
         * You should be getting the length of the array at position 0
        */
        // Change the final element of the 1D array at index 0 to the total length of the 2D array
        int totalLength = 0;
        for(int row = 0; row < arr.length; row++)
        {
            totalLength += arr[row].length;
        }
        updateValue(arr, 0, arr[0].length - 1, totalLength);

        /* KEEP SPACE IN YOUR CODE
         * I'm not sure what you're doing here. All you need to do
         * is get the values at array[0][0], array[1][7], array[2][2]
         * and add that sum to array[1][7]
        */
        // Add the value at the 1st and last index of the 2D array to the value of the last element in the 1D array at index 1
        int previousValue = arr[1][0];
        int temp = 0;

        // KEEP SPACE IN YOUR CODE
        for(int col = 1; col < arr[1].length; col++)
        {
            temp = arr[1][col];
            updateValue(arr, 1, col, previousValue);
            previousValue = temp;
        }

        /* KEEP SPACE IN YOUR CODE
         * You can do this in a loop
        */
        // Change each value of the 1D array at index 2 to display the length of each respective 1D array.
        updateValue(arr, 2, 0, arr[0].length);
        updateValue(arr, 2, 1, arr[1].length);
        updateValue(arr, 2, 2, arr[2].length);

        // KEEP SPACE IN YOUR CODE
        // Print the new array
        print(arr);
    }

    public static void updateValue(int[][] array, int row, int col, int value)
    {
        array[row][col] = value;
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
