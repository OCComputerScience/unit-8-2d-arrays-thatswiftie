package SumRows;

public class Main
{
    public static void main(String[] args)
    {
        // Declare 2D array
        int[][] arr = {{4, 4, 5, 6, 3, 1}, {14, 2, 5, 4, 8, 2}, {45, 12, 13, 5, 2, 1}};

        // USE WHITE SPACE
        // Display sum of all rows
        System.out.println(sumRow(arr, 0));
        System.out.println(sumRow(arr, 1));
        System.out.println(sumRow(arr, 2));

        // USE WHITE SPACE
        // Display sum of all columns
        System.out.println();
        System.out.println(sumCol(arr, 0));
        System.out.println(sumCol(arr, 1));
        System.out.println(sumCol(arr, 2));
        System.out.println(sumCol(arr, 3));
        System.out.println(sumCol(arr, 4));

        // USE WHITE SPACE
        // Display sum of all elements
        System.out.println();
        System.out.println(sumArray(arr));

        // USE WHITE SPACE
        // Print entire array
        System.out.println();
        for(int[] row: arr)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;
        for(int col = 0; col < array[row].length; col++)
        {
            sum += array[row][col];
        }
        return sum;
    }

    public static int sumCol(int[][] array, int col)
    {
        int sum = 0;
        for(int row = 0; row < array.length; row++)
        {
            sum += array[row][col];
        }
        return sum;
    }

    public static int sumArray(int[][] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += sumRow(array, i);
        }
        return sum;
    }

}
