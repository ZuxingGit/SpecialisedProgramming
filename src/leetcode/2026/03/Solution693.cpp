#include <iostream>
using namespace std;

class Solution {
public:
    bool hasAlternatingBits(int n) {
        int prev = n & 1;
        n >>= 1;
        
        while (n > 0) {
            int curr = n & 1;
            if (curr == prev) return false;
            prev = curr;
            n >>= 1;
        }
        return true;
    }
};

int main() {
    Solution solution;

    int n = 5; // Binary: 101
    bool result = solution.hasAlternatingBits(n);
    cout << result << endl; // Output: true

    n = 7; // Binary: 111
    result = solution.hasAlternatingBits(n);
    cout << result << endl; // Output: false

    n = 10; // Binary: 1010
    result = solution.hasAlternatingBits(n);
    cout << result << endl; // Output: true
    
    return 0;
}