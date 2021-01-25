import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++)
            board[i] = input.next().toCharArray();
        input.close();

        fillBoard(board, n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) 
                System.out.print(board[i][j]);
            System.out.println();
        }
    }

    private static void fillBoard(char[][] board, int n, int m) {
        for (int i = 0; i < n; i++) {
            char piece = i % 2 == 0 ? 'B' : 'W';
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '.')
                    board[i][j] = piece;
                piece = piece == 'B' ? 'W' : 'B';
            }
        }
    }
}