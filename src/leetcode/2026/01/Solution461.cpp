#include <iostream>
using namespace std;

class Solution461 {
public:
    int hammingDistance(int x, int y) {
        int xor_val = x ^ y;
        int distance = 0;
        while (xor_val != 0) {
            distance += xor_val & 1;
            xor_val >>= 1;
        }
        return distance;
    }
};

int main() {
    Solution461 solution;

    int x1 = 1, y1 = 4;
    cout << "Hamming Distance between " << x1 << " and " << y1 << " is: " 
         << solution.hammingDistance(x1, y1) << endl;
    // Expected output: 2

    int x2 = 3, y2 = 1;
    cout << "Hamming Distance between " << x2 << " and " << y2 << " is: " 
         << solution.hammingDistance(x2, y2) << endl;
    // Expected output: 1

    return 0;
}