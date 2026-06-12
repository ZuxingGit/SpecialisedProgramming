#include <iostream>
using namespace std;

class Solution1025 {
public:
    bool divisorGame(int n) {
        return n % 2 == 0;
    }
};

int main() {
    Solution1025 solution;
    cout << solution.divisorGame(2) << endl; // Output: true
    cout << solution.divisorGame(3) << endl; // Output: false
    cout << solution.divisorGame(4) << endl; // Output: true
    return 0;
}