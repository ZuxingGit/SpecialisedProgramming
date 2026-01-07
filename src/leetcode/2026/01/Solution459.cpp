#include <iostream>
#include <string>
using namespace std;

class Solution459 {
public:
    bool repeatedSubstringPattern(string s) {
        int n = s.size();
        for (int len = 1; len <= n / 2; ++len) {
            if (n % len == 0) {
                string substring = s.substr(0, len);
                string repeated;
                for (int i = 0; i < n / len; ++i) {
                    repeated += substring;
                }
                if (repeated == s) {
                    return true;
                }
            }
        }
        return false;
    }
};

int main() {
    Solution459 solution;

    string s1 = "abab";
    bool result1 = solution.repeatedSubstringPattern(s1);
    // Expected output: true
    cout << "Does \"" << s1 << "\" have a repeated substring pattern? " << (result1 ? "true" : "false") << endl;

    string s2 = "aba";
    bool result2 = solution.repeatedSubstringPattern(s2);
    // Expected output: false
    cout << "Does \"" << s2 << "\" have a repeated substring pattern? " << (result2 ? "true" : "false") << endl;

    string s3 = "abcabcabcabc";
    bool result3 = solution.repeatedSubstringPattern(s3);
    // Expected output: true
    cout << "Does \"" << s3 << "\" have a repeated substring pattern? " << (result3 ? "true" : "false") << endl;

    return 0;
}