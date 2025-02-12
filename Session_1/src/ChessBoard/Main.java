package ChessBoard;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Chessboard board = new Chessboard();

        board.fillBoard();
        boolean validPlace = false;
        String player = "";
        board.printChessboard();

        while(!validPlace)
        {
            System.out.println("Enter the row of player");
            int row = input.nextInt() - 1;
            System.out.println("Enter the column of player");
            int col = input.nextInt() - 1;

            if(((row >= 0 && row < 2)||(row >= 6 && row < 8)) && (col >= 0 && col < 8))
            {
                player = board.getChessBoard()[row][col];
                board.getChessBoard()[row][col] = "----";
                validPlace = true;
            }
        }
        validPlace = false;
        while(!validPlace)
        {
            System.out.println("Enter the row destination");
            int row = input.nextInt() - 1;
            System.out.println("Enter the column destination");
            int col = input.nextInt() - 1;

            if((row >= 2 && row < 6) && (col >= 0 && col < 8))
            {
                board.getChessBoard()[row][col] = player;
                validPlace = true;
            }
        }
        board.printChessboard();
    }

    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
