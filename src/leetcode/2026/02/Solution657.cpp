#include <string>
#include <iostream>
using namespace std;

class Solution {
public:
    bool judgeCircle(string moves) {
        int x = 0, y = 0;
        for (char move : moves) {
            switch (move) {
                case 'U': y++; break;
                case 'D': y--; break;
                case 'L': x--; break;
                case 'R': x++; break;
            }
        }
        return x == 0 && y == 0;
    }
};

int main() {
    Solution solution;
    string moves = "UDLR";
    bool result = solution.judgeCircle(moves);
    // Output: true
    cout << boolalpha << result << endl;

    moves = "UUDDLRLR";
    result = solution.judgeCircle(moves);
    // Output: true
    cout << boolalpha << result << endl;

    moves = "UUDDLRL";
    result = solution.judgeCircle(moves);
    // Output: false
    cout << boolalpha << result << endl;
    return 0;
}