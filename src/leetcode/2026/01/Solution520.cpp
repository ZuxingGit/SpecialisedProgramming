#include <string>
#include <iostream>
using namespace std;

class Solution520 {
public:
    bool detectCapitalUse(string word) {
        int n = word.size();
        if (n == 0) return true;

        bool isFirstUpper = isupper(word[0]);
        bool isSecondUpper = n > 1 ? isupper(word[1]) : false;

        for (int i = 1; i < n; ++i) {
            if (isSecondUpper) {
                if (!isFirstUpper || !isupper(word[i])) {
                    return false;
                }
            } else {
                if (isupper(word[i])) {
                    return false;
                }
            }
        }

        return true;
    }
};

int main() {
    Solution520 solution;

    string word1 = "USA";
    cout << (solution.detectCapitalUse(word1) ? "true" : "false") << endl; // Expected output: true

    string word2 = "FlaG";
    cout << (solution.detectCapitalUse(word2) ? "true" : "false") << endl; // Expected output: false

    string word3 = "mL";
    cout << (solution.detectCapitalUse(word3) ? "true" : "false") << endl; // Expected output: false

    return 0;
}