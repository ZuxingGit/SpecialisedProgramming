#include <string>
#include <iostream>
using namespace std;

class Solution409 {
public:
    int longestPalindrome(string s) {
        int charCount[128] = {0};
        for (char c : s) {
            charCount[c]++;
        }
        
        int length = 0;
        bool hasOddCount = false;
        
        for (int count : charCount) {
            length += (count / 2) * 2;
            if (count % 2 == 1) {
                hasOddCount = true;
            }
        }
        
        if (hasOddCount) {
            length += 1;
        }
        
        return length;
    }
};

int main() {
    Solution409 sol;
    // Example usage:
    string s1 = "abccccdd";
    int len1 = sol.longestPalindrome(s1);
    // len1 should be 7
    cout << len1 << endl;

    string s2 = "a";
    int len2 = sol.longestPalindrome(s2);
    // len2 should be 1
    cout << len2 << endl;
    
    return 0;
}