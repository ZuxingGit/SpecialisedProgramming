#include <iostream>
#include <vector>
using namespace std;

class Solution999 {
public:
    int numRookCaptures(vector<vector<char>>& board) {
        int count = 0;
        int rookX = -1, rookY = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rookX = i;
                    rookY = j;
                    break;
                }
            }
            if (rookX != -1) break;
        }

        // Check upwards
        for (int i = rookX - 1; i >= 0; i--) {
            if (board[i][rookY] == 'B') break;
            if (board[i][rookY] == 'p') {
                count++;
                break;
            }
        }

        // Check downwards
        for (int i = rookX + 1; i < 8; i++) {
            if (board[i][rookY] == 'B') break;
            if (board[i][rookY] == 'p') {
                count++;
                break;
            }
        }

        // Check left
        for (int j = rookY - 1; j >= 0; j--) {
            if (board[rookX][j] == 'B') break;
            if (board[rookX][j] == 'p') {
                count++;
                break;
            }
        }

        // Check right
        for (int j = rookY + 1; j < 8; j++) {
            if (board[rookX][j] == 'B') break;
            if (board[rookX][j] == 'p') {
                count++;
                break;
            }
        }

        return count;
    }
};

int main() {
    Solution999 solution;

    vector<vector<char>> board = {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', 'R', '.', '.', '.', 'p'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', 'B', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'}
    };

    int captures = solution.numRookCaptures(board);
    cout << "Number of pawns the rook can capture: " << captures << endl;

    return 0;
}