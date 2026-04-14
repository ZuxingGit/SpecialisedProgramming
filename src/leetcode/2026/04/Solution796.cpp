#include <string>
using namespace std;

class Solution796 {
public:
    bool rotateString(string s, string goal) {
        if (s.length() != goal.length()) return false;
        string doubled = s + s;
        return doubled.find(goal) != string::npos;
    }
};

int main() {
    Solution796 solution;

    string s = "abcde";
    string goal = "cdeab";
    bool result = solution.rotateString(s, goal);
    printf("Can rotate string: %s\n", result ? "true" : "false"); // Output: true

    goal = "abced";
    result = solution.rotateString(s, goal);
    printf("Can rotate string: %s\n", result ? "true" : "false"); // Output: false

    return 0;
}