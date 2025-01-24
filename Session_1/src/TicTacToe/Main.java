package TicTacToe;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TicTacToe board = new TicTacToe();
        printBoard(board.getBoard());

        int maxTurns = 9;
        while(!(board.getTurn() > maxTurns))
        {
            int row = 0;
            int col = 0;
            while(!board.pickALocation(row, col))
            {
                System.out.println("Turn " + board.getTurn());
                System.out.println("Pick a row 1-3");
                row = input.nextInt();
                System.out.println("Pick a col 1-3");
                col = input.nextInt();
            }
            board.takeTurn(row, col);
            printBoard(board.getBoard());
            if(board.checkWin())
            {
                break;
            }
        }
        System.out.println("Was winner: " + board.checkWin());

    }

    public static void printBoard(String[][] array)
    {
        for(String[] row: array)
        {
            for(String play: row)
            {
                System.out.print(play + " ");
            }
            System.out.println();
        }
    }
}
