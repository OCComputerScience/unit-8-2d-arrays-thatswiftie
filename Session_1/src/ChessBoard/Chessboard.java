package ChessBoard;

public class Chessboard
{
    private String[][] chessBoard = new String[8][8];
    private String[] firstLine = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
    private String[] lastLine = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
    private int lastIdx = 7;

    // Add constructor to initialize an empty board
    public Chessboard()
    {
        for(int row = 0; row < 8; row++)
        {
            for(int col = 0; col < 8; col++)
            {
                chessBoard[row][col] = "----";
            }
        }
    }

    public String[][] fillBoard()
    {
        chessBoard[0] = firstLine;
        chessBoard[lastIdx] = lastLine;

        for(int row = 0; row < 8; row++)
        {
            if(row == 1 || row == 6)
            {
                for(int col = 0; col < 8; col++)
                {
                    chessBoard[row][col] = "Pawn";
                }
            }
        }
        return chessBoard;
    }

    public String[][] getChessBoard()
    {
        return chessBoard;
    }

    public void printChessboard()
    {
        for(int row = 0; row < 8; row++)
        {
            for(int col = 0; col < 8; col++)
            {
                System.out.print(chessBoard[row][col] + " ");
            }
            System.out.println();
        }
    }
}
