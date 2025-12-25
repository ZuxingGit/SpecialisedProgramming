#include <vector>
#include <string>
#include <iostream>
using namespace std;

class Solution387 {
public:
    int firstUniqChar(string s) {
        vector<int> charCount(26, 0);

        for (char c : s) {
            charCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount[s[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
};

int main() {
    Solution387 solution;
    
    string s1 = "leetcode";
    int result1 = solution.firstUniqChar(s1); // Expected: 0
    std::cout << result1 << std::endl;

    string s2 = "loveleetcode";
    int result2 = solution.firstUniqChar(s2); // Expected: 2
    std::cout << result2 << std::endl;
    
    string s3 = "aabb";
    int result3 = solution.firstUniqChar(s3); // Expected: -1
    std::cout << result3 << std::endl;

    return 0;
}