#include <string>
#include <iostream>
using namespace std;

class Solution859 {
public:
    bool buddyStrings(string s, string goal) {
        if (s.size() != goal.size()) {
            return false;
        }

        int first = -1, second = -1;
        bool hasDuplicate = false;
        int charCount[26] = {0};
        for (int i = 0; i < s.size(); i++) {
            if (s[i] != goal[i]) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // More than two differences
                }
            }
            charCount[s[i] - 'a']++;
            if (charCount[s[i] - 'a'] > 1) {
                hasDuplicate = true;
            }
        }
        if (first == -1 && hasDuplicate) {
            return true; // Strings are identical and have duplicate characters
        }
        if (second != -1 && s[first] == goal[second] && s[second] == goal[first]) {
            return true; // Strings can be made equal by swapping two characters
        }
        return false;
    }
};

int main() {
    Solution859 solution;

    string s1 = "ab", goal1 = "ba";
    cout << solution.buddyStrings(s1, goal1) << endl; // true

    string s2 = "ab", goal2 = "ab";
    cout << solution.buddyStrings(s2, goal2) << endl; // false

    string s3 = "aa", goal3 = "aa";
    cout << solution.buddyStrings(s3, goal3) << endl; // true

    string s4 = "aaaaaaabc", goal4 = "aaaaaaacb";
    cout << solution.buddyStrings(s4, goal4) << endl; // true

    string s5 = "", goal5 = "aa";
    cout << solution.buddyStrings(s5, goal5) << endl; // false

    return 0;
}