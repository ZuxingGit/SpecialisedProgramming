#include <iostream>
#include <string>
using namespace std;

class Solution917 {
public:
    string reverseOnlyLetters(string s) {
        int i = 0, j = s.size() - 1;
        while (i < j) {
            if (!isalpha(s[i])) {
                i++;
            } else if (!isalpha(s[j])) {
                j--;
            } else {
                swap(s[i], s[j]);
                i++;
                j--;
            }
        }
        return s;
    }
};

int main() {
    Solution917 solution;

    string s = "ab-cd";
    cout << solution.reverseOnlyLetters(s) << endl; // Output: "dc-ba"

    string s2 = "a-bC-dEf-ghIj";
    cout << solution.reverseOnlyLetters(s2) << endl; // Output: "j-Ih-gfE-dCba"

    string s3 = "Test1ng-Leet=code-Q!";
    cout << solution.reverseOnlyLetters(s3) << endl; // Output: "Qedo1ct-eeLg=ntse-T!"
    return 0;
}