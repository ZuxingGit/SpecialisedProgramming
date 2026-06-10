#include <string>
#include <iostream>
using namespace std;

class Solution1021 {
public:
    string removeOuterParentheses(string s) {
        string result;
        int openCount = 0;

        for (char c : s) {
            if (c == '(') {
                if (openCount > 0) {
                    result += c;
                }
                openCount++;
            } else {
                openCount--;
                if (openCount > 0) {
                    result += c;
                }
            }
        }
        return result;
    }
};

int main () {
    Solution1021 solution;

    string s1 = "(()())(())";
    string s2 = "(()())(())(()(()))";
    string s3 = "()()";
    cout << solution.removeOuterParentheses(s1) << endl; // "()()()"
    cout << solution.removeOuterParentheses(s2) << endl; // "()()()()(())"
    cout << solution.removeOuterParentheses(s3) << endl; // ""

    return 0;
}