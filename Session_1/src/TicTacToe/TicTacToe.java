package TicTacToe;

import java.util.Scanner;

public class TicTacToe
{
    // Declare 2D array to store an empty board
    private String[][] board = new String[3][3];
    private int counter = 1;
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
    public String[][] getBoard()
    {
        return board;
    }

    /* Pick a location(row, col)
     This should return a boolean that indicates if the location is valid
     A valid location is whether the array bounds, and the location does not already
     contain an X or O
     */
    public boolean pickALocation(int row, int col)
    {
        // Use constants ROWS = 4, COLS = 4 or just SIZE = 4
        if((row > 0 && row < 4) && (col > 0 && col < 4) && board[row - 1][col - 1].equals("-"))
        {
            return true;
        }
        return false;
    }

    /* Take turn(row, col)
       Add the appropriate symbol(X or O) to the location selected
       Update the current players turn
     */
    public int getTurn()
    {
        return counter;
    }

    public void takeTurn(int row, int col)
    {

        /* You can save the mathematical operation if you
           save a "player" variable.
           boolean playerOneTurn = false;
           void togglePlayerTurn()
           {
               playerOneTurn = !playerOneTurn;
           }
         */

        if(counter % 2 == 0)
        {
            board[row-1][col-1] = "X";
        }
        else
        {
            board[row-1][col-1] = "O";
        }

        counter++;
    }

    /* Check columns
       This should return a boolean for if any column contains three consecutive X's or O's
     */
    /* This is only checking for a win in the first column
       If you work this into a loop, it could work
     */
    public boolean checkCol()
    {
        int col = 0;
        int row = 1;
        String current = board[row][col];
        String previous = board[row-1][col];
        String next = board[row+1][col];

        if(current.equals(previous) && current.equals(next) && !current.equals("-"))
        {
            return true;
        }
        return false;
    }

    /* Check rows
       This should return a boolean for if any rows contains three consecutive X's or O's
     */

    /*
      This only works if the win is on the first row
      If you work this into a loop, it could work
     */
    public boolean checkRow()
    {
        int col = 1;
        int row = 0;
        String current = board[row][col];
        String previous = board[row][col - 1];
        String next = board[row][col + 1];
        if(current.equals(previous) && current.equals(next) && !current.equals("-"))
        {
            return true;
        }
        return false;
    }

     /* Check rows
       This should return a boolean for if any diagonal contains three consecutive X's or O's
     */

    /*
        This is hard coding values. How will this work if you tried to make Connect Four?
     */
    public boolean checkDiag()
    {
        String topLeft = board[0][0];
        String middle = board[1][1];
        String bottomRight = board[2][2];
        String bottomLeft = board[2][0];
        String topRight = board[0][2];
        if(middle.equals(bottomRight) && middle.equals(topLeft) && !middle.equals("-"))
        {
            return true;
        }
        else if(middle.equals(bottomLeft) && middle.equals(topRight) && !middle.equals("-"))
        {
            return true;
        }
        return false;
    }

     /* Check wins
       This should return a boolean if the other 3 methods return true
        */
    public boolean checkWin()
    {
        if(checkRow() || checkCol() || checkDiag())
        {
            return true;
        }
        return false;
    }
}
