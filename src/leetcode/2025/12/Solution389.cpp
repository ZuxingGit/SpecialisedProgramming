#include <string>
#include <iostream>
using namespace std;

class Solution389 {
public:
    char findTheDifference(string s, string t) {
        int charCount[26] = {0};

        for (char c : s) {
            charCount[c - 'a']++;
        }

        for (char c : t) {
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return c;
            }
        }

        return '\0'; // This line should never be reached
    }
};

int main() {
    Solution389 solution;
    
    string s1 = "abcd";
    string t1 = "abcde";
    char result1 = solution.findTheDifference(s1, t1); // Expected: 'e'
    std::cout << result1 << std::endl;

    string s2 = "";
    string t2 = "y";
    char result2 = solution.findTheDifference(s2, t2); // Expected: 'y'
    std::cout << result2 << std::endl;
    
    string s3 = "aabbcc";
    string t3 = "abcbcad";
    char result3 = solution.findTheDifference(s3, t3); // Expected: 'd'
    std::cout << result3 << std::endl;

    return 0;
}