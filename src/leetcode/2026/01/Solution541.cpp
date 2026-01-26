#include <string>
#include <iostream>
using namespace std;

class Solution541 {
public:
    string reverseStr(string s, int k) {
        for (int i = 0; i < s.size(); i += 2 * k) {
            int left = i;
            int right = min(i + k - 1, (int)s.size() - 1);
            while (left < right) {
                swap(s[left], s[right]);
                left++;
                right--;
            }
        }
        return s;
    }
};

int main() {
    Solution541 solution;

    string s1 = "abcdefg";
    int k1 = 2;
    cout << solution.reverseStr(s1, k1) << endl; // Expected output: "bacdfeg"

    string s2 = "abcd";
    int k2 = 2;
    cout << solution.reverseStr(s2, k2) << endl; // Expected output: "bacd"

    return 0;
}