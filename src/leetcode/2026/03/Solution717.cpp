#include <vector>
#include <iostream>
using namespace std;

class Solution717 {
public:
    bool isOneBitCharacter(vector<int>& bits) {
        int n = bits.size();
        int i = 0;

        while (i < n - 1) {
            if (bits[i] == 1) {
                i += 2; // Skip the next bit as well
            } else {
                i += 1; // Move to the next bit
            }
        }
        return i == n - 1;
    }
};

int main() {
    Solution717 solution;
    
    vector<int> bits1 = {1, 0, 0};
    vector<int> bits2 = {1, 1, 1, 0};
    
    bool result1 = solution.isOneBitCharacter(bits1);
    bool result2 = solution.isOneBitCharacter(bits2);
    
    cout << "Input: [1, 0, 0] -> Output: " << (result1 ? "true" : "false") << endl; // Should print true
    cout << "Input: [1, 1, 1, 0] -> Output: " << (result2 ? "true" : "false") << endl; // Should print false
}