#include <string>
using namespace std;

class Solution {
public:
    int countBinarySubstrings(string s) {
        int prev = 0, cur = 1, ans = 0;

        for (int i=1; i<s.size(); i++) {
            if (s[i] == s[i-1]) {
                cur++;
            } else {
                prev = cur;
                cur = 1;
            }
            if (prev >= cur) {
                ans++;
            }
        }

        return ans;
    }
};

int main() {
    Solution sol;

    string s = "00110011";
    int ans = sol.countBinarySubstrings(s);
    printf("%d\n", ans);

    s = "10101";
    ans = sol.countBinarySubstrings(s);
    printf("%d\n", ans);
}