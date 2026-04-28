#include <iostream>
using namespace std;

class Solution868 {
public:
    int binaryGap(int n) {
        int maxGap = 0;
        int lastOnePosition = -1;

        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) { // Check if the i-th bit is 1
                if (lastOnePosition != -1) {
                    maxGap = max(maxGap, i - lastOnePosition);
                }
                lastOnePosition = i;
            }
        }
        return maxGap;
    }
};

int main() {
    Solution868 solution;

    int n1 = 22; // Binary: 10110
    cout << "Binary gap for " << n1 << " is: " << solution.binaryGap(n1) << endl;

    int n2 = 5; // Binary: 101
    cout << "Binary gap for " << n2 << " is: " << solution.binaryGap(n2) << endl;

    int n3 = 6; // Binary: 110
    cout << "Binary gap for " << n3 << " is: " << solution.binaryGap(n3) << endl;

    int n4 = 8; // Binary: 1000
    cout << "Binary gap for " << n4 << " is: " << solution.binaryGap(n4) << endl;

    return 0;
}