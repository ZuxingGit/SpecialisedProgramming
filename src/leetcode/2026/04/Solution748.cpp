#include <string>
#include <vector>
#include <iostream>
using namespace std;

class Solution748 {
public:
    string shortestCompletingWord(string licensePlate, vector<string>& words) {
        int count[26] = {0};
        for (char c : licensePlate) {
            if (isalpha(c)) {
                count[tolower(c) - 'a']++;
            }
        }
        string result;
        for (const string& word : words) {
            int wordCount[26] = {0};
            for (char c : word) {
                wordCount[tolower(c) - 'a']++;
            }
            bool isCompleting = true;
            for (int i = 0; i < 26; ++i) {
                if (count[i] > wordCount[i]) {
                    isCompleting = false;
                    break;
                }
            }
            if (isCompleting) {
                if (result.empty() || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }
};

int main() {
    Solution748 solution;

    string licensePlate1 = "1s3 PSt";
    vector<string> words1 = {"step", "steps", "stripe", "stepple"};
    cout << solution.shortestCompletingWord(licensePlate1, words1) << endl; // Output: "steps"

    string licensePlate2 = "1s3 456";
    vector<string> words2 = {"looks", "pest", "stew", "show"};
    cout << solution.shortestCompletingWord(licensePlate2, words2) << endl; // Output: "pest"

    return 0;
}