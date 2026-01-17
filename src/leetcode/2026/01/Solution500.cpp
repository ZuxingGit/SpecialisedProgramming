#include <vector>
#include <string>
using namespace std;

class Solution500 {
public:
    vector<string> findWords(vector<string>& words) {
        vector<string> res;
        string row1 = "qwertyuiopQWERTYUIOP";
        string row2 = "asdfghjklASDFGHJKL";
        string row3 = "zxcvbnmZXCVBNM";
        for (const string& word : words) {
            int r1 = 0, r2 = 0, r3 = 0;
            for (char c : word) {
                if (row1.find(c) != string::npos) {
                    r1++;
                } else if (row2.find(c) != string::npos) {
                    r2++;
                } else if (row3.find(c) != string::npos) {
                    r3++;
                }
            }
            if (r1 == word.size() || r2 == word.size() || r3 == word.size()) {
                res.push_back(word);
            }
        }
        return res;
    }
};

int main() {
    Solution500 sol;

    vector<string> words1 = { "Hello", "Alaska", "Dad", "Peace" };
    vector<string> result1 = sol.findWords(words1);
    // Expected output: ["Alaska", "Dad"]
    for (const string& word : result1) {
        printf("%s ", word.c_str());
    }
    printf("\n");

    vector<string> words2 = { "omk" };
    vector<string> result2 = sol.findWords(words2);
    // Expected output: []
    for (const string& word : result2) {
        printf("%s ", word.c_str());
    }
    printf("\n");

    vector<string> words3 = { "adsdf", "sfd" };
    vector<string> result3 = sol.findWords(words3);
    // Expected output: ["adsdf", "sfd"]
    for (const string& word : result3) {
        printf("%s ", word.c_str());
    }
    printf("\n");
}