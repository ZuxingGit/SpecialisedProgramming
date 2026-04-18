#include <string>
#include <vector>
#include <unordered_set>
#include <unordered_map>
#include <cctype>
#include <iostream>

using namespace std;

class Solution819 {
public:
    string mostCommonWord(string paragraph, vector<string>& banned) {
        unordered_set<string> bannedSet(banned.begin(), banned.end());
        unordered_map<string, int> wordCount;
        string word;
        for (char c : paragraph) {
            if (isalpha(c)) {
                word += tolower(c);
            } else if (!word.empty()) {
                if (bannedSet.find(word) == bannedSet.end()) {
                    wordCount[word]++;
                }
                word.clear();
            }
        }
        // Check the last word if it exists
        if (!word.empty() && bannedSet.find(word) == bannedSet.end()) {
            wordCount[word]++;
        }

        string mostCommon;
        int maxCount = 0;
        for (const auto& entry : wordCount) {
            if (entry.second > maxCount) {
                mostCommon = entry.first;
                maxCount = entry.second;
            }
        }
        return mostCommon;
    }
};

int main() {
    Solution819 solution;

    string paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    vector<string> banned = {"hit"};
    string result = solution.mostCommonWord(paragraph, banned);
    // Expected output: "ball"
    cout << result << endl;

    paragraph = "a.";
    banned = {};
    result = solution.mostCommonWord(paragraph, banned);
    // Expected output: "a"
    cout << result << endl;

    return 0;
}