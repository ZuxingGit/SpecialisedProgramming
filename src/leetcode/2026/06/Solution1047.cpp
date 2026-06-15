#include <string>

using namespace std;

class Solution1047 {
public:
    string removeDuplicates(string s) {
        string result;
        for (char c : s) {
            if (!result.empty() && result.back() == c) {
                result.pop_back();
            } else {
                result.push_back(c);
            }
        }
        return result;
    }
};

int main() {
    Solution1047 solution;

    string s1 = "abbaca";
    string result1 = solution.removeDuplicates(s1);
    // Output: "ca"
    printf("Input: %s, Output: %s\n", s1.c_str(), result1.c_str());

    string s2 = "azxxzy";
    string result2 = solution.removeDuplicates(s2);
    // Output: "ay"
    printf("Input: %s, Output: %s\n", s2.c_str(), result2.c_str());

    return 0;
}