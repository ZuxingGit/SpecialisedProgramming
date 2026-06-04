public class Solution999 {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        int rookRow = -1, rookCol = -1;

        // Find the position of the rook
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                    break;
                }
            }
            if (rookRow != -1) {
                break;
            }
        }

        // Check upwards
        for (int i = rookRow - 1; i >= 0; i--) {
            if (board[i][rookCol] == 'B') {
                break; // Blocked by a bishop
            }
            if (board[i][rookCol] == 'p') {
                count++;
                break; // Captured a pawn
            }
        }

        // Check downwards
        for (int i = rookRow + 1; i < 8; i++) {
            if (board[i][rookCol] == 'B') {
                break; // Blocked by a bishop
            }
            if (board[i][rookCol] == 'p') {
                count++;
                break; // Captured a pawn
            }
        }

        // Check leftwards
        for (int j = rookCol - 1; j >= 0; j--) {
            if (board[rookRow][j] == 'B') {
                break; // Blocked by a bishop
            }
            if (board[rookRow][j] == 'p') {
                count++;
                break; // Captured a pawn
            }
        }

        // Check rightwards
        for (int j = rookCol + 1; j < 8; j++) {
            if (board[rookRow][j] == 'B') {
                break; // Blocked by a bishop
            }
            if (board[rookRow][j] == 'p') {
                count++;
                break; // Captured a pawn
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution999 solution = new Solution999();

        char[][] board1 = {
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', 'R', '.', '.', '.', 'p' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', 'B', '.', '.', '.', '.' }
        };
        System.out.println("Output for test case 1: " + solution.numRookCaptures(board1)); // Output: 3

        char[][] board2 = {
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { 'p', 'p', '.', 'R', '.', 'p', 'B', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'B', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' }
        };
        System.out.println("Output for test case 2: " + solution.numRookCaptures(board2)); // Output: 3

        char[][] board3 = {
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
                { '.', 'p', 'B', 'B', 'B', 'p', '.', '.' },
                { '.', 'p', 'B', 'R', 'B', 'p', '.', '.' },
                { '.', 'p', 'B', 'B', 'B', 'p', '.', '.' },
                { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' }
        };
        System.out.println("Output for test case 3: " + solution.numRookCaptures(board3)); // Output: 0
    }
}
