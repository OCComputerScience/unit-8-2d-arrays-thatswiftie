package TicTacToe;

import java.util.Scanner;

public class TicTacToe
{
    // Declare 2D array to store an empty board
    private static String[][] board = new String[3][3];
    private static int counter = 0;
    // and other required variables

    // Add constructor to initialize an empty board
    public TicTacToe()
    {
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                board[row][col] = "-";
            }
        }
    }
    // Add getter for 2D array
    public static String[][] getBoard()
    {
        return board;
    }
    /* Pick a location(row, col)
     This should return a boolean that indicates if the location is valid
     A valid location is whether the array bounds, and the location does not already
     contain an X or O
     */
    public static boolean pickALocation(int row, int col)
    {
        if((row > 0 && row < 4) && (col > 0 && col < 4) && board[row][col].equals("-"))
        {
            return true;
        }
        return false;
    }

    /* Take turn(row, col)
       Add the appropriate symbol(X or O) to the location selected
       Update the current players turn
     */
    public static int getTurn()
    {
        return counter;
    }

    public static void takeTurn(int row, int col)
    {
        Scanner input = new Scanner(System.in);
        counter++;
        while(!pickALocation(row, col))
        {
            System.out.println("Turn " + counter);
            System.out.println("Pick a row 1-3");
            row = input.nextInt() - 1;
            System.out.println("Pick a col 1-3");
            col = input.nextInt() - 1;
        }
        if(counter % 2 == 0)
        {
            board[row][col] = "X";
        }
        else
        {
            board[row][col] = "O";
        }
    }

    /* Check columns
       This should return a boolean for if any column contains three consecutive X's or O's
     */

    /* Check rows
       This should return a boolean for if any rows contains three consecutive X's or O's
     */

     /* Check rows
       This should return a boolean for if any diagonal contains three consecutive X's or O's
     */

     /* Check wins
       This should return a boolean if the other 3 methods return true
     */
}
