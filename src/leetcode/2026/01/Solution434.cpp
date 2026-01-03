#include <string>
#include <iostream>
using namespace std;

class Solution434 {
public:
    int countSegments(string s) {
        int count = 0;
        bool inSegment = false;

        for (char c : s) {
            if (c != ' ') {
                if (!inSegment) {
                    count++;
                    inSegment = true;
                }
            } else {
                inSegment = false;
            }
        }

        return count;
    }
};

int main() {
    Solution434 solution;

    string s1 = "Hello, my name is John";
    int result1 = solution.countSegments(s1);
    // Expected output: 5
    cout << "Number of segments: " << result1 << endl;

    string s2 = "   ";
    int result2 = solution.countSegments(s2);
    // Expected output: 0
    cout << "Number of segments: " << result2 << endl;

    string s3 = "SingleWord";
    int result3 = solution.countSegments(s3);
    // Expected output: 1
    cout << "Number of segments: " << result3 << endl;

    return 0;
}