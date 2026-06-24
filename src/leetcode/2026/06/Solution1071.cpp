#include <string>
using namespace std;

class Solution1071 {
public:
    string gcdOfStrings(string str1, string str2) {
        if (str1 + str2 != str2 + str1) {
            return "";
        }
        int gcdLength = gcd(str1.size(), str2.size());
        return str1.substr(0, gcdLength);
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
};

int main() {
    Solution1071 solution;

    string str1 = "ABCABC";
    string str2 = "ABC";
    string result = solution.gcdOfStrings(str1, str2);
    printf("GCD of strings: %s\n", result.c_str());

    str1 = "ABABAB";
    str2 = "ABAB";
    result = solution.gcdOfStrings(str1, str2);
    printf("GCD of strings: %s\n", result.c_str());

    str1 = "LEET";
    str2 = "CODE";
    result = solution.gcdOfStrings(str1, str2);
    printf("GCD of strings: %s\n", result.c_str());

    str1 = "AAAAAB";
    str2 = "AAA";
    result = solution.gcdOfStrings(str1, str2);
    printf("GCD of strings: %s\n", result.c_str());

    return 0;
}