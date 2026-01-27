#include <string>
#include <iostream>
using namespace std;

class Solution551 {
public:
    bool checkRecord(string s) {
        int absences = 0;
        int consecutiveLates = 0;

        for (char c : s) {
            if (c == 'A') {
                absences++;
                consecutiveLates = 0;
                if (absences > 1) {
                    return false;
                }
            } else if (c == 'L') {
                consecutiveLates++;
                if (consecutiveLates > 2) {
                    return false;
                }
            } else {
                consecutiveLates = 0;
            }
        }
        
        return true;
    }
};

int main() {
    Solution551 solution;

    string s1 = "PPALLP";
    cout << (solution.checkRecord(s1) ? "true" : "false") << endl; // Expected output: true

    string s2 = "PPALLL";
    cout << (solution.checkRecord(s2) ? "true" : "false") << endl; // Expected output: false

    return 0;
}