#include <string>
#include <vector>
#include <iostream>
using namespace std;

class Solution383 {
public:
    bool canConstruct(string ransomNote, string magazine) {
        vector<int> charCount(26, 0);

        for (char c : magazine) {
            charCount[c - 'a']++;
        }

        for (char c : ransomNote) {
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
};

int main() {
    Solution383 solution;
    
    string ransomNote1 = "a";
    string magazine1 = "b";
    bool result1 = solution.canConstruct(ransomNote1, magazine1); // Expected: false
    cout << (result1 ? "true" : "false") << endl;

    string ransomNote2 = "aa";
    string magazine2 = "ab";
    bool result2 = solution.canConstruct(ransomNote2, magazine2); // Expected: false
    cout << (result2 ? "true" : "false") << endl;
    
    string ransomNote3 = "aa";
    string magazine3 = "aab";
    bool result3 = solution.canConstruct(ransomNote3, magazine3); // Expected: true
    cout << (result3 ? "true" : "false") << endl;

    return 0;
}