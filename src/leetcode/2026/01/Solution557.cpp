#include <string>
using namespace std;

class Solution557 {
public:
    string reverseWords(string s) {
        int n = s.size();
        int start = 0;

        for (int i = 0; i <= n; ++i) {
            if (i == n || s[i] == ' ') {
                int left = start, right = i - 1;
                while (left < right) {
                    swap(s[left], s[right]);
                    ++left;
                    --right;
                }
                start = i + 1;
            }
        }

        return s;
    }
};

int main() {
    Solution557 sol;

    string test1 = "Let's take LeetCode contest";
    string result1 = sol.reverseWords(test1);
    // Expected output: "s'teL ekat edoCteeL tsetnoc"
    printf("%s\n", result1.c_str());

    string test2 = "Mr Ding";
    string result2 = sol.reverseWords(test2);
    // Expected output: "rM gniD"
    printf("%s\n", result2.c_str());

    return 0;
}