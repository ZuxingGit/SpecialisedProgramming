#include <iostream>
#include <string>
using namespace std;

class Solution392 {
public:
    bool isSubsequence(string s, string t) {
        int sLen = s.length();
        int tLen = t.length();
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < sLen && tIndex < tLen) {
            if (s[sIndex] == t[tIndex]) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == sLen;
    }
};

int main() {
    Solution392 solution;

    string s1 = "abc";
    string t1 = "ahbgdc";
    bool result1 = solution.isSubsequence(s1, t1);
    // Expected output: true
    cout << (result1 ? "true" : "false") << endl;

    string s2 = "axc";
    string t2 = "ahbgdc";
    bool result2 = solution.isSubsequence(s2, t2);
    // Expected output: false
    cout << (result2 ? "true" : "false") << endl;
    return 0;
}