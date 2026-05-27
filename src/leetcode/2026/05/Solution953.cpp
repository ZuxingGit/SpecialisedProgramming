#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution953 {
public:
    bool isAlienSorted(vector<string>& words, string order) {
        vector<int> charOrder(26);
        for (int i = 0; i < order.size(); i++) {
            charOrder[order[i] - 'a'] = i;
        }

        for (int i = 1; i < words.size(); i++) {
            string word1 = words[i - 1];
            string word2 = words[i];
            int minLength = min(word1.size(), word2.size());
            bool isSorted = false;

            for (int j = 0; j < minLength; j++) {
                if (charOrder[word1[j] - 'a'] < charOrder[word2[j] - 'a']) {
                    isSorted = true;
                    break;
                } else if (charOrder[word1[j] - 'a'] > charOrder[word2[j] - 'a']) {
                    return false;
                }
            }

            if (!isSorted && word1.size() > word2.size()) {
                return false;
            }
        }
        return true;
    }
};

int main() {
    Solution953 solution;

    vector<string> words1 = {"hello", "leetcode"};
    string order1 = "hlabcdefgijkmnopqrstuvwxyz";
    bool result1 = solution.isAlienSorted(words1, order1);
    cout << (result1 ? "true" : "false") << endl;

    vector<string> words2 = {"word", "world", "row"};
    string order2 = "worldabcefghijkmnpqstuvxyz";
    bool result2 = solution.isAlienSorted(words2, order2);
    cout << (result2 ? "true" : "false") << endl;

    vector<string> words3 = {"apple", "app"};
    string order3 = "abcdefghijklmnopqrstuvwxyz";
    bool result3 = solution.isAlienSorted(words3, order3);
    cout << (result3 ? "true" : "false") << endl;
}